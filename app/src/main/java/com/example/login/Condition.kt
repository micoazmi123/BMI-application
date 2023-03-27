package com.example.login

class Condition {
    fun getCategory(result: Float): String? {
        val category: String
        category = if (result < 15) {
            "Severe Thinness"
        } else if (result >= 15 && result <= 16) {
            "Moderate Thinness"
        } else if (result > 16 && result <= 18.5) {
            "Mild Thinness"
        } else if (result > 18.5 && result <= 25) {
            "Normal"
        } else if (result > 25 && result <= 30) {
            "Overweight"
        } else if (result > 30 && result <= 35) {
            "Obese Class I"
        } else if (result > 35 && result <= 40) {
            "Obese Class II"
        } else {
            "Obese Class III"
        }
        return category
    }
}