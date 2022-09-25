package com.example.mycalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {

    var uiState by mutableStateOf(UiState())

    fun onExpressionChange(exp:String){
        uiState.apply {
            uiState = copy(expression = this.expression + exp)
        }
    }

    private fun onResultChange(result:String){
        uiState = uiState.copy(result = result)
    }

    fun clearExpression(){
        uiState = uiState.copy(expression = "")
        uiState = uiState.copy(result = "")
    }

    fun performDeletion(){
        uiState = uiState.copy(expression = uiState.expression.dropLast(1))
    }

    fun evaluateExpression(){
        if (uiState.expression.isNotBlank()){
            onResultChange(Model().result(uiState.expression))
        }
    }

}

data class UiState(
    var expression : String = "",
    var result : String = ""
)