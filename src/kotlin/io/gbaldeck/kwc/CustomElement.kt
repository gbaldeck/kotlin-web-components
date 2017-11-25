package io.gbaldeck.kwc

abstract class CustomElement {
  init {
    js("HTMLElement.call(this)")
  }
}