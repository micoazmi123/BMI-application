package com.example.login

class Category {
    fun getCategory(result: Float): String? {
        val category: String
        category = if (result < 15) {
            "very severely underweight"
        } else if (result >= 15 && result <= 16) {
            "severely underweight"
        } else if (result > 16 && result <= 18.5) {
            "underweight"
        } else if (result > 18.5 && result <= 25) {
            "normal (healthy weight)"
        } else if (result > 25 && result <= 30) {
            "overweight"
        } else if (result > 30 && result <= 35) {
            "moderately obese"
        } else if (result > 35 && result <= 40) {
            "severely obese"
        } else {
            "very severely obese"
        }
        return category
    }

}