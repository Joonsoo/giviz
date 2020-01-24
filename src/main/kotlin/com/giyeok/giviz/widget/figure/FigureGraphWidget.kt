package com.giyeok.giviz.widget.figure

import com.giyeok.giviz.graph.VizGraph
import com.giyeok.giviz.widget.Widget

// session(renderer)의 종류에 따라 figure의 크기가 달라질 수 있고, 그려보기 전엔 알 수 없기 때문에
// figure와 testDraw 해볼 수 있는 session을 받아서 그려보고 크기를 알아내서 VizGraph를 구성해줌
// TODO rank 등 노드에 대한 부가 정보 처리
class FigureGraphWidget(val figures: Map<String, Figure>, val edges: Set<VizGraph.Edge>) : Widget {
    fun vizGraph(): VizGraph {
        TODO()
    }
}
