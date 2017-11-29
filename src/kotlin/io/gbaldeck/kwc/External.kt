package io.gbaldeck.kwc

external val window: dynamic

external fun confirm(message: String)

external interface ShadowRoot{
  var innerHTML: String
}

external open class ElementReference {
  fun addEventListener(eventName: String, callback: Function<Unit>)

  fun attachShadow(config: dynamic)
  val shadowRoot: ShadowRoot?

  @JsName("connectedCallback")
  open fun connectedCallback()

  @JsName("attributeChangedCallback")
  open fun attributeChangedCallback(name: String, oldValue: dynamic, newValue: dynamic)

  @JsName("disconnectedCallback")
  open fun disconnectedCallback()
}

external open class HTMLAnchorElement: ElementReference

external open class HTMLElement: ElementReference