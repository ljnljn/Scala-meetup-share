package com.crazyjvm.share.scala.third

/**
 * Created by chenchao on 14-6-10.
 */
class _1 extends App{
  var assertionsEnabled = true
  def myAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
}
