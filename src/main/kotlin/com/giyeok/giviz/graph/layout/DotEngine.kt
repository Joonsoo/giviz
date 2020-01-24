package com.giyeok.giviz.graph.layout

import com.giyeok.giviz.graph.GraphLayout
import com.giyeok.giviz.graph.VizGraph

// paper: https://www.graphviz.org/Documentation/TSE93.pdf
// source code: https://gitlab.com/graphviz/graphviz/tree/master/lib/dotgen

data class NodeGroup(val nodes: Set<String>) {
    constructor(vararg nodes: String) : this(nodes.toSet())

    companion object {
        val empty = NodeGroup(setOf())
    }
}

data class DotConfig(
    val horizontalSep: Int,
    val verticalSep: Int,
    // TODO node rank groups
    // edge idx -> edge weight, 1 if not specified
    val maxRankNodes: NodeGroup,
    val minRankNodes: NodeGroup,
    val sameRankNodeGroups: List<NodeGroup>,
    val edgeWeights: Map<String, Int>
) {
    companion object {
        val default = DotConfig(6, 4, NodeGroup.empty, NodeGroup.empty, listOf(), mapOf())
    }
}

class DotEngine(val graph: VizGraph, val config: DotConfig) : GraphLayoutEngine {
    fun acyclic(graph: VizGraph): VizGraph {
        // 일부 엣지를 제거해서 acyclic하게 만들어진 그래프를 반환.
        // 노드 정보는 변경되지 않아야 함
        TODO()
    }

    // node name -> rank
    fun rank(): Map<String, Int> {
        TODO()
    }

    data class NodeOrder(val rank: Int, val order: Int)

    // node name -> (rank, order in the rank)
    fun ordering(): Map<String, NodeOrder> {
        TODO()
    }

    // node name -> center point
    fun position(): GraphLayout.NodesLayout {
        TODO()
    }

    // edge index ->
    fun makeSplines(): GraphLayout.EdgesLayout {
        TODO()
    }

    override fun layoutGraph(): GraphLayout {
        TODO()
    }

    override fun layoutNodes(): GraphLayout.NodesLayout {
        TODO()
    }

    override fun layoutEdges(): GraphLayout.EdgesLayout {
        TODO()
    }
}
