package com.greencatsoft.angularjs

import scala.language.implicitConversions
import scala.scalajs.js

import org.scalajs.dom.{ Element, Event }

@js.native
trait AngularElement extends Element {

  def bind[T <: Event](event: String, handler: js.Function1[T, _]): Unit = js.native

  def unbind[T <: Event](event: String, handler: js.Function1[T, _]): Unit = js.native
}
