package com.example.primeraapp.domain

class Usuario(val id: Int, val nickname: String,
              val email: String) : IOrganizador, IParticipante {
    fun crearActividad(){

    }
    fun getDisponibilidad(){

    }

    override fun crearGrupo(nombre: String) {
        TODO()
    }

    override fun invitarMiembro(user: Usuario) {
        TODO("Not yet implemented")
    }

    override fun notificar(mensaje: String) {
        TODO("Not yet implemented")
    }
}