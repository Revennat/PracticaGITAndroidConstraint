package com.example.practicascostraint.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

class BanderaScreen {
}
@Preview
@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja, caja1, caja2, caja3) = createRefs();
        val LineGuide = createGuidelineFromTop(0.5f)
        Box(modifier.background(Color.White).constrainAs(caja){
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            linkTo(parent.start, parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(130.dp).clip(CircleShape).background(
            Color.Red).constrainAs(caja1){
            top.linkTo(LineGuide)
            bottom.linkTo(LineGuide)
            start.linkTo(parent.start)
            end.linkTo(parent.end)

        })

    }
}