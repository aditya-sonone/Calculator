package com.example.mycalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycalculator.ui.theme.Green
import com.example.mycalculator.ui.theme.Light
import com.example.mycalculator.ui.theme.MediumGray
import com.example.mycalculator.ui.theme.Orange

@Composable
fun CalculatorButton(
    symbol: String,
    color : androidx.compose.ui.graphics.Color,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .size(78.dp)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = color
        )
    }
}

@Composable
fun CalculatorUi(
    calculatorViewModel: CalculatorViewModel?,
    buttonSpacing : Dp = 12.dp
) {

    val uiState = calculatorViewModel?.uiState
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {

            Text(
                text = uiState?.expression?:"",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth(),
                fontWeight = FontWeight.Light,
                fontSize = 46.sp,
                color = Light,
                maxLines = 2
            )
            Text(
                text = uiState?.result?:"",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth(),
                fontWeight = FontWeight.Light,
                fontSize = 62.sp,
                color = Color.White,
                maxLines = 2
            )
            Spacer(modifier = Modifier.size(4.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "C",
                    color = Orange,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.clearExpression()
                    }
                )
                CalculatorButton(
                    symbol = "(",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("(")
                    }
                )
                CalculatorButton(
                    symbol = ")",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange(")")
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("/")
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("7")
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("8")
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("9")
                    }
                )
                CalculatorButton(
                    symbol = "x",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("*")
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("4")
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("5")
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("6")
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("-")
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("1")
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("2")
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("3")
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("+")
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalculatorButton(
                    symbol = ".",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange(".")
                    }
                )
                CalculatorButton(
                    symbol = "0",
                    color = Color.White,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.onExpressionChange("0")
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    color = Green,
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.performDeletion()
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    color = Color.White,
                    modifier = Modifier
                        .background(Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        calculatorViewModel?.evaluateExpression()
                    }
                )
            }
        }
    }
}