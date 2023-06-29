package com.example.myapplication

class dados {
    private var email: String=""
    private var nome: String=""

    object dados{

    }

    fun setEmail(str: String){
        email = str
    }
    fun getEmail() :String{
        return email
    }
    fun setNome(str:String){
        nome=str
    }
    fun getNome() :String{
        return nome
    }
}