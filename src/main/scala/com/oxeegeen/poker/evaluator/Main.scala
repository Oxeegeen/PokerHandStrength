package com.oxeegeen.poker.evaluator

import scala.io.StdIn
import com.oxeegeen.poker.evaluator.Solver.process

object Main {
  def main(args: Array[String]): Unit = Iterator.continually(Option(StdIn.readLine()))
    .takeWhile(_.nonEmpty)
    .foreach { x =>
      x map process foreach println
    }
}
