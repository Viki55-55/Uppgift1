
    import org.junit.Assert;
    import org.junit.Test;

    public class TestingwithJUnit {
        @Test
        public void TestGetRows() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 0;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
    }

    public class TestingwithJUnit {
        @Test
        public void TestGetRows() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
    }
