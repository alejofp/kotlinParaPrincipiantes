package com.alejofp.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYconstantes()
        tiposDeDatos()
    }

    private fun variablesYconstantes( )  {

        //Variables

        var myFirstVariable = "Hola Mundo Cruel"
        var myFirstNumber = 1
        var mySecondVariable = "que passsssa"
        var miTercerNumero = 33



        println(myFirstVariable)

        myFirstVariable = "por que no imprimes?"

        println(myFirstVariable)
        println(myFirstNumber)


        //Constantes

        val myFirstConstant = "soy una constante"

        println (myFirstConstant)

  //      myFirstConstant = myFirstVariable


    }


    private fun tiposDeDatos() {


        val myString: String = "soy una cadena de caracteres"

        val myString2: String = myString + "  " + myString

        println (myString2)





    }

}