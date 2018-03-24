package lists;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Ordering;

public class ListTests {

    @Test
    public void shouldReturnOrderedList() {
        List<String> alphabetsInOrder = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z");
        List<String> unorderedList = Arrays.asList("A", "B", "C", "E", "D", "F", "G", "H", "I", "Z", "K", "L", "J", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y");

        assertThat(getSortNatural(unorderedList)).isEqualTo(alphabetsInOrder);
    }

    @Test
    public void shouldReturnOrderedListWithNumbers() {
        List<String> alphabetsInOrder = Arrays.asList("0", "3", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "Z");
        List<String> unorderedList = Arrays.asList("A", "B", "C", "E", "D", "F", "G", "H", "I", "Z", "K", "L", "J", "M",
                "N", "O", "P", "Q", "R", "3", "S", "T", "U", "V", "W", "Y", "0");

        assertThat(getSortNaturalWithNumbers(unorderedList)).isEqualTo(alphabetsInOrder);
    }

    @Test
    public void sortNumbers() {
        List<String> sortedNumbers = Arrays.asList("1", "2", "13", "150");
        List<String> unorderedList = Arrays.asList("150", "13", "2", "1");

        assertThat(sortNumbers(unorderedList)).isEqualTo(sortedNumbers);
    }

    @Test
    public void sortStringNumbers() {
        List<String> sortedNumbers = Arrays.asList("01", "1","0110", "2", "13", "150");
        List<String> unorderedList = Arrays.asList("13", "150", "0110", "1", "01", "2");

        assertThat(sortNumbers(unorderedList)).isEqualTo(sortedNumbers);
    }

    @Test
    public void sortRealNumbers() {
        List<Integer> sortedNumbers = Arrays.asList(1, 2, 13, 150);
        List<Integer> unorderedList = Arrays.asList(150, 13, 2, 1);

        assertThat(sortRealNumbers(unorderedList)).isEqualTo(sortedNumbers);
    }

    private List<Integer> sortRealNumbers(List<Integer> unorderedList) {
        Collections.sort(unorderedList);
        return unorderedList;
    }

    private List<String> sortNumbers(List<String> unorderedList) {
        Collections.reverse(unorderedList);
        return unorderedList;
    }

    private List<String> getSortNatural(List<String> unorderedList) {
        unorderedList = Ordering.natural().sortedCopy(unorderedList);
        return unorderedList;
    }

    private List<String> getSortNaturalWithNumbers(List<String> unorderedList) {
        unorderedList = Ordering.natural().sortedCopy(unorderedList);
        return unorderedList;
    }
}
