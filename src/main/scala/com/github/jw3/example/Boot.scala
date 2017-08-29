package com.github.jw3.example

import akka.actor.ActorSystem
import com.rxthings.di._
import net.codingwell.scalaguice.ScalaModule


object Boot extends App {
  implicit val system = ActorSystem()

  val example = inject[Example] required

  println(example)

  system.terminate
}

trait Example {  override def toString = getClass.getSimpleName }
object Foo extends Example
object Bar extends Example

class ExampleModule extends ScalaModule {
  def configure() = bind[Example].toInstance(Foo)
}
