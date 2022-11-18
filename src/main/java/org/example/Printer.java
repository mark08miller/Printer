package org.example;
import java.util.Arrays;

public class Printer {
        public String print(String message) {
            return message;
        }

        public String print(int values1) {
            String str = String.valueOf(values1);
            return str;
        }

        public String print(double values) {
            String str = String.valueOf(values);
            return str;
        }

        public String print(String string, int number) {
            StringBuilder builder = new StringBuilder();
            builder.append(string).append(" ").append(number);
            return String.valueOf(builder);
        }

        public String print(String[] inputParams) {
            return Arrays.toString(inputParams);
        }
    }
