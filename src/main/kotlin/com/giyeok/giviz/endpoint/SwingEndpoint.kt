package com.giyeok.giviz.endpoint

import com.giyeok.giviz.widget.Widget
import java.awt.Component

class SwingEndpoint : Component(), Endpoint {
    private var content: Widget? = null

    override fun setContent(content: Widget) {
        this.content = content
        TODO()
    }
}
