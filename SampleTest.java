package jp.utils;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SampleTest {
        @Test
        public void 異常publicにnull接続falseできるtrueこと() throws Exception {
            assertThat(true, is(Boolean.TRUE));
        }
}
