package com.giyeok.giviz.widget.figure

// Figure: draw2d의 Figure. 렌더링/레이아웃할 때 필요한 크기, 위치 정보같은 것 없이 표현할 내용만 포함
sealed class Figure {
    // TODO updatedListener
}

// Series: draw2d의 ToolbarLayout이 적용된 Figure
// - Session에 Figure나 VizGraph를 주면 렌더링 해줌.
enum class SeriesOrientation {
    VERTICAL, HORIZONTAL
}

data class Series(val children: List<Figure>, val orientation: SeriesOrientation, val gap: Int) : Figure()

class Color(val red: Int, val green: Int, val blue: Int)

data class TextStyle(val color: Color, val fontName: String, val fontSize: Int, val thickness: Int, val italic: Boolean)
data class TextFigure(val text: String, val style: TextStyle) : Figure()

enum class LineStyle {
    SOLID, DOTTED, DOUBLE_DOTTED
}

data class Splitter(val width: Int, val color: Color, val style: LineStyle) : Figure()

data class Border(val body: Figure, val width: Int, val color: Color, val style: LineStyle) : Figure()
