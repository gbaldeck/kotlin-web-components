import io.gbaldeck.kwc.defineElement
import io.gbaldeck.kwc.jsObject

fun main(array: Array<String>){
  console.log("this was run")

  defineElement("test-element", MyElement)

  val anchorOptions = jsObject()
  anchorOptions.extends = "a"
  defineElement("custom-anchor", CustomAnchor, anchorOptions)
}