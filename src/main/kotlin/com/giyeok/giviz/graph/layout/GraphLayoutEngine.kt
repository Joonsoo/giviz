package com.giyeok.giviz.graph.layout

import com.giyeok.giviz.graph.GraphLayout

// one instance per one graph X config
interface GraphLayoutEngine {
    fun layoutGraph(): GraphLayout

    fun layoutNodes(): GraphLayout.NodesLayout

    fun layoutEdges(): GraphLayout.EdgesLayout
}
