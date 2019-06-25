import com.company.Zaruri;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

public class ZaruriTest {

    @Test
    public void sumTest(){
        //given
        Random random = Mockito.mock(Random.class);
        Zaruri zaruri = new Zaruri(random);
        Mockito.when(random.nextInt(6))
                .thenReturn(5)
                .thenReturn(4);
        //when
        int result = zaruri.sum();

        //then
        Mockito.verify(random,Mockito.times(2))
                .nextInt(6);
        Assert.assertEquals(11,result);
    }
}
