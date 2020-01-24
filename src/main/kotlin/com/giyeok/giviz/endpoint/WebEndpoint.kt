package com.giyeok.giviz.endpoint

import com.giyeok.giviz.endpoint.Endpoint
import com.giyeok.giviz.widget.Widget

// SwingSession에서처럼 웹페이지에서 모든 부분을 담당하고 싶진 않고, div 등에 연결해서 사용하고 싶음
// 다른 라이브러리랑 충돌 없이 함께 쓸 수 있게 javascript 라이브러리를 구현해야될듯
class WebEndpoint(val endpointId: String) : Endpoint {
    private var content: Widget? = null

    override fun setContent(content: Widget) {
        this.content = content
        TODO()
    }
}
