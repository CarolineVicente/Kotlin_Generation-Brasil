package encap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

internal class ClienteTest {
    val cliente = Cliente(
        "Carol",
        "Rua dos Antares",
        "3225-0000"
    )

    @BeforeEach
    fun addLista() {
        cliente.addCompra("Chocolate")
        cliente.addCompra("Pão")
        cliente.addCompra("Pipoca")
    }

    @Test
    fun novoClienteTest(){

        var erro = false

        try {
            val novoClienteTest = Cliente(" ", " ", " ")
        }catch (e: Exception){
            erro = true
        }

        assertTrue(erro)

    }

    @Test

    fun addCompraTest() {

        assertEquals(3, cliente.listaCompras.size)
        assertTrue(cliente.listaCompras.contains("Pipoca"))
    }

    @Test

    fun removeCompraTest(){

        cliente.removeCompra("Pipoca")
        assertEquals(2, cliente.listaCompras.size)
        assertFalse(cliente.listaCompras.contains("Pipoca"))
    }

    @Test

    fun exibirComprasTest(){
        cliente.listaCompras.forEach(){
            println(it)
        }
        assertTrue(cliente.listaCompras.contains("Pão"))
    }
}