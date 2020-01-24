package com.giyeok.giviz.endpoint

import com.giyeok.giviz.widget.Widget

// Session: web/swing 등과 내부 자료구조를 이어주는 abstract connector
// - Session은 기본적으로 lightweight하기 때문에 widget마다 하나씩 만들고 외부에서는 원하는대로 UI를 구성할 수 있도록 구성
interface Endpoint {
    fun setContent(content: Widget)

    // fun addMouseListener(widgetId: String, listener: () -> Unit)
}
