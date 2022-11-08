
    import org.junit.Assert;
    import org.junit.Test;

    public class TestingwithJUnit {
        @Test
        public void TestGetRows1() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 0;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
        @Test
        public void TestGetRows2() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetRows3() {
            Read myInput_Words = new Read();
            myInput_Words.SetInput("test");

            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetRows4() {
            Read myInput_Words = new Read();
            myInput_Words.SetInput("test");
            myInput_Words.SetInput("test2");
            int Actual_Result = myInput_Words.GetRows();
            int Expected_Result = 2;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
        @Test
        public void TestGetWordsCount1() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetWordsCount();
            int Expected_Result = 0;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
        @Test
        public void TestGetWordsCount2() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetWordsCount();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetWordsCount3() {
            Read myInput_Words = new Read();
            myInput_Words.SetWords("test");

            int Actual_Result = myInput_Words.GetWordsCount();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetWordsCount4() {
            Read myInput_Words = new Read();
            myInput_Words.SetWords("test");
            myInput_Words.SetWords("test2");
            int Actual_Result = myInput_Words.GetWordsCount();
            int Expected_Result = 2;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        @Test
        public void TestGetCharCount1() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetChars();
            int Expected_Result = 0;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }
        @Test
        public void TestGetCharCount2() {
            Read myInput_Words = new Read();
            int Actual_Result = myInput_Words.GetChars();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetCharCount3() {
            Read myInput_Words = new Read();
            myInput_Words.SetWords("test");

            int Actual_Result = myInput_Words.GetChars();
            int Expected_Result = 1;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

        public void TestGetCharCount4() {
            Read myInput_Words = new Read();
            myInput_Words.SetTotalChars("test");
            myInput_Words.SetTotalChars("test2");
            int Actual_Result = myInput_Words.GetChars();
            int Expected_Result = 2;
            Assert.assertEquals(Actual_Result, Expected_Result);
        }

    }