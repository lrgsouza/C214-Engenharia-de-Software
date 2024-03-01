import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.EmptyStackException;

import br.inatel.cdg.Pilha;

import org.junit.Test;

public class PilhaTest {

    @Test
    public void testePilhaVazia() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testePilhaPush() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(23);
        assertEquals(1, pilhaInteiros.size());

    }

    @Test
    public void testePilhaPopSize() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(13);
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();
        assertEquals(0, tamanho);

    }

    @Test(expected = EmptyStackException.class)
    public void testePilhaPopException() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        int retorno = pilhaInteiros.pop();
    }

    @Test
    public void testePilhaPopRetorno() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        int valor = 13;
        pilhaInteiros.push(valor);

        int retorno = pilhaInteiros.pop();
        assertEquals(valor, retorno);
    }
}