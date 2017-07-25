
public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack List<String> goodNames = new ArrayList<>();

    List<Double> calcStack = new ArrayList<>();


    // The array of the input string split up


    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        public String[] split (String regex){

            private String[] tokens;

            // The stack
            private String[] stack;


        }
        // 2. Allocate a stack as big as the number of tokens


        stack = input.length;
        tokens newTokens = new tokens[stack];
        newTokens = string.split(',');


        // 3. write the algorithm


        for ( token: newTokens) {

            if(token = '+'){

                newTokens.pop(stack);
                double val = (stack)
                                                                    //  Java Stack class
            }else if( token == '-'){                            ///   take in a token

                                                                //     if number push onto the calcStack
                sum-= calcStack;                                //     when an opearand comes up pop it from the tokens and evalate and
                                                                //      then push answer back onto the calcStack
            }else if(token == '*'){

                sum*= calcStack;

            }else if (token == '/'){
                sum/= calcStack
                        calcStack.push

            }else (token !== '+' || '-' || '*' || '/')

                   calcStack = newToken.pop(stack);





            // calls to push() and pop() and do the math here


        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack

    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
    }
}
