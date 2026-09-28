package com.example.primeraapp.domain

interface IOrganizador {
    fun crearGrupo(nombre: String)
    fun invitarMiembro(user: Usuario)
}