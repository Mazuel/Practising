package javamap;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

public class MapTests {

    @Test
    public void shouldReturnOrderedByKeyList() {
        ImmutableMap<String, String> orderByKey = new ImmutableMap.Builder<String, String>()
            .put("1232", "Hello")
            .put("01", "mike")
            .put("1", "john").build();
        assertThat(getSortedByKey(orderByKey)).isEqualTo(Lists.newArrayList("mike", "john", "Hello"));
    }

    @Test
    public void shouldReturnOrderedByValue() {
        ImmutableMap<String, String> orderByValue = new ImmutableMap.Builder<String, String>()
            .put("1232", "Hello")
            .put("043", "hello")
            .put("01", "mike")
            .put("1", "john")
            .put("155", "John").build();
        assertThat(getSortedByValue(orderByValue))
                .isEqualTo(Lists.newArrayList("hello", "john", "mike", "Hello", "John"));
    }


    @Test
    public void shouldReturnAllKeysByGivenValue() {
        ImmutableMap<String, String> sourceMap = new ImmutableMap.Builder<String, String>()
            .put("1232", "Hello")
            .put("043", "hello")
            .put("01", "mike")
            .put("1", "john")
            .put("155", "John")
            .put("44155", "John")
            .put("66644155", "John").build();
        assertThat(getKeysByGivenValue(sourceMap, "john")).containsExactly("155", "1", "44155", "66644155");
        assertThat(getKeysByGivenValue(sourceMap, "Hello")).containsExactly("1232", "043");
    }

    private List<String> getSortedByValue(ImmutableMap<String, String> sourceMap) {
        
        return null;
    }
    private List<String> getKeysByGivenValue(ImmutableMap<String, String> sourceMap, String searchString) {
        
        return null;
    }

    private List<String> getSortedByKey(ImmutableMap<String, String> sourceMap) {
        
        return null;
    }
    
}   
