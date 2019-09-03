import no.kristiania.yatzi.YatziCatager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YatziTest {


    @Test
    void shouldCalculateForOnes() {
     assertEquals(0, scoreYatzi(YatziCatager.ONES, new int[] {2,3,4,5,6}));
     assertEquals(3, scoreYatzi(YatziCatager.ONES, new int[] {2,1,4,1,1}));
     assertEquals(5, scoreYatzi(YatziCatager.ONES, new int[] {1,1,1,1,1}));

    }

    private int scoreYatzi(int ones, int[] dice)  {
        int[] frequencies = new int[5];
        for(int die: dice) {
            frequencies[die=1]++;
        }
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] == 2) {
                return (1+1)*2;
            }
        }
        return 0;
    }


}
