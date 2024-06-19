package com.delgadojuarez.ucamarket.ui.navigation

sealed class ScreenRoute (var route: String){
    object Signin: ScreenRoute("Iniciar sesion")
    object Signup: ScreenRoute("Registro")
    object Home: ScreenRoute("Home")
    object ProductDetail: ScreenRoute("Detalle de producto")
    object Add: ScreenRoute("Agregar producto")
    object EditProduct: ScreenRoute("Editar producto")
    object EditProfile: ScreenRoute("Editar perfil de usuario")
}