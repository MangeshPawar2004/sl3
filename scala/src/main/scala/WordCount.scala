object WordCount {
  def main(args: Array[String]): Unit = {
    val text = "hello world hello scala this is scala word count example scala is powerful"

    val words = text.split("\\s+")
    val wordCount = words.groupBy(identity).map { case (word, instances) => word -> instances.length }

    println("Word Count Results:")
    wordCount.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}


//Output:

[info] running WordCount
  Word Count Results:
  this: 1
count: 1
is: 2
world: 1
powerful: 1
scala: 3
hello: 2
example: 1
word: 1
[success] Total time: 6 s, completed 11-Apr-2025, 7:41:39ΓÇ»pm
