package com.giyeok.giviz.graph

// VizGraph는 실제 노드의 내용, 노드가 어떻게 그려질지 등을 전혀 모르고 레이아웃에 필요한 최소한의 정보만 포함한다
// DotEngine은 이 그래프의 레이아웃만 계산한다

// node와 edge는 둘 다 고유한 string id를 갖는다.
class VizGraph(val nodes: Map<String, Node>, val edges: Map<String, Edge>) {
    init {
        check(edges.all { nodes.containsKey(it.value.start) && nodes.containsKey(it.value.end) })
    }

    class Node(val width: Int, val height: Int)
    class Edge(val start: String, val end: String)
}

// TODO edge 위치/곡선 정보
class GraphLayout(val nodes: NodesLayout, val edges: EdgesLayout) {
    data class Point(val x: Int, val y: Int)
    data class Spline(val points: List<Point>)

    // node id -> center point
    class NodesLayout(val positions: Map<String, Point>)

    // edge id -> spline
    class EdgesLayout(val splines: Map<String, Spline>)
}
