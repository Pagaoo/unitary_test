import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class mainTest {
    @Test
    @DisplayName("Cenarios da portaria")
    fun testPortaria() {
        Assertions.assertEquals(portaria(15,"",""), "Negado.") //idade menor que 18
        Assertions.assertEquals(portaria(20,"",""), "Negado.") //convite vazio
        Assertions.assertEquals(portaria(20,"comum",""), "Negado.") //codigo vazio

        Assertions.assertEquals(portaria(45,"VIP",""), "Negado.") //convite errado
        Assertions.assertEquals(portaria(23,"comum","xl"), "Negado.") //convite x codigo incorreto
        Assertions.assertEquals(portaria(19,"premium","xt"), "Negado.") //convite x codigo incorreto
        Assertions.assertEquals(portaria(20,"luxo","xt"), "Negado.") //convite x codigo incorreto

        Assertions.assertEquals(portaria(19,"comum","xt"), "Welcome.") //convite comum
        Assertions.assertEquals(portaria(19,"comum","xt56156156"), "Welcome.") //convite comum

        Assertions.assertEquals(portaria(36,"premium","xl"), "Welcome.") //convite premium
        Assertions.assertEquals(portaria(36,"premium","xl651561"), "Welcome.") //convite premium

        Assertions.assertEquals(portaria(25,"luxo","xl"), "Welcome.") //convite luxo
        Assertions.assertEquals(portaria(25,"luxo","xl451456156"), "Welcome.") //convite luxo
    }

}