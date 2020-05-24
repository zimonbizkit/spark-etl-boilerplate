import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object Executor {
  def run(): Unit = {
    // initialise spark context
    val conf = new SparkConf().setAppName(Executor.getClass.getName)
    val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()

    val df : DataFrame = spark
      .read
      .format("csv")
      .option("header","true")
          .load("/opt/spark-data/input.csv")

    val schema = df.schema

    for (i <- 1 to 10) df.union(df)

    println(df.count())

    /*println("Hello, world!")
    val rdd = spark.sparkContext.parallelize(1 to 10)
    println(rdd.count())

    Thread.sleep(1000*60)
    spark.stop()*/
  }
}
Executor.run()
