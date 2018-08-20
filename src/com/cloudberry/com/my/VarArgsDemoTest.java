package com.cloudberry.com.my;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


class VarArgsDemoTest {

	@Test
    public void testProcessConcatenation(){
        VarArgsDemo demo = new VarArgsDemo();
        assertThat(demo.foo("abc","def"), is(equalTo("abcdef")));
        assertThat(demo.foo("abc","def", "ghi"), is(equalTo("abcdefghi")));
    }
	
	

}
