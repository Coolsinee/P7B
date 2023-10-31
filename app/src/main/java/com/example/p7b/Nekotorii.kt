package com.example.p7b

import android.widget.CheckBox
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable
//fun CheckboxInDaRow() {
//    val context = LocalContext.current
//    var checkedState by remember { mutableStateOf(false) }
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .border(2.dp, Color.Red, RoundedCornerShape(10.dp))
//            .clickable {
//                Toast
//                    .makeText(context, "Клик на строке ...", Toast.LENGTH_SHORT)
//                    .show()
//                checkedState = !checkedState
//            },
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Checkbox(checked = checkedState, onCheckedChange = {
//            Toast.makeText(context, "Чекбокс нажат", Toast.LENGTH_SHORT).show()
//        })
//        Text(text = "Нажимая на кнопку, регулируешь чекбокс!")
//    }
//}

@Composable
fun CheckboxInDaRow() {
    val context = LocalContext.current
    var checkedState by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, Color.Red, RoundedCornerShape(10.dp))
            .clickable {
                val message = if (checkedState) "Чекбокс нажат" else "Чекбокс не нажат"
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                checkedState = !checkedState
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = {
                val message = if (it) "Чекбокс нажат" else "Чекбокс не нажат"
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.size(24.dp).align(Alignment.CenterVertically)
        )
        Text(
            text = "Нажимая на кнопку, регулируешь чекбокс!",
            modifier = Modifier.padding(start = 8.dp),
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }
}

//@Composable
//fun CheckboxInDaColumn() {
//    val context = LocalContext.current
//    var checkedState by remember { mutableStateOf(false) }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .border(2.dp, Color.Green, RoundedCornerShape(10.dp))
//            .clickable {
//                val message = if (checkedState) "Чекбокс нажат" else "Чекбокс не нажат"
//                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//                checkedState = !checkedState
//            },
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Checkbox(checked = checkedState, onCheckedChange = {
//            val message = if (it) "Чекбокс нажат" else "Чекбокс не нажат"
//            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//        })
//        Text(
//            text = "Нажимая на кнопку, регулируешь чекбокс!",
//            modifier = Modifier.padding(top = 8.dp),
//            fontSize = 18.sp,
//            textAlign = TextAlign.Center
//        )
//    }
//}
