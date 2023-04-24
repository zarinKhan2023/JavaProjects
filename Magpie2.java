/**
 * @author Zarin Khan 
 * ITSC1212- 202 Mazumder (Team 17)
 * @version 2.0
 * @since 2022-03-03
 * Demostrating the ability to use Not operator and compound operator, and startsWith method
 */
public class Magpie2
{
      /**
   * Get a default greeting
       * @return a greeting
       */
      public String getGreeting()
      {
              return "Hello, let's talk.";
      }

      /**
       * Gives a response to a user statement
       *
       * @param statement
       *            the user statement
       * @return a response based on the rules given
       */
      public String getResponse(String statement)
      {
              String response = "";
              String trimStatement = statement.trim();
              if (statement.startsWith("no")) {
                      response = "Why so negative?";
              }
              else if (statement.indexOf("mother") >= 0
                              || statement.indexOf("father") >= 0
                              || statement.indexOf("sister") >= 0
                              || statement.indexOf("brother") >= 0
                              || statement.indexOf("cousin") >= 0)
              {
                      response = "Tell me more about your family.";
              } else if(statement.indexOf("dog") >= 0
                              || statement.indexOf("parrot") >= 0
                              || statement.indexOf("hamster") >= 0
                              || statement.indexOf("cat") >= 0) {
                       response = "Tell me more about your pets.";
              } else if(statement.indexOf("Syeda") >= 0
                              ||statement.indexOf("Professor") >= 0) 
              {        
                       response = "She is a good professor."; 
              } else if(trimStatement.length()== 0) {
                response = "Say something else.";
                        
              } else if(statement.indexOf("near") >= 0 && statement.indexOf("Starbucks") >= 0) {
                  response = "The nearest Starbucks is in the Student Union 0.5 miles away.";
              } else if (statement.indexOf("park") >= 0){
                if(!(statement.indexOf("car") >=0)) {
                        response = " I bet the trees there are lovely this time of the year";
              }
                else 
              {
                         response = " Parking on campus is atrocious and expensive";
              }
              }
               else if (statement.indexOf("rock") >= 0){
                if(!(statement.indexOf("music") >=0)) {
                        response = "I had a rock collection too!";
              }
                else {
                         response = "What is your favorite band?";
              }
              } 
               else if (statement.indexOf("love") >= 0 && (statement.indexOf("mom")) >=0 && (statement.indexOf("cook")) >= 0){
                     response = "I'll bet it's delicious";  
             }
             
              else {
                      response = getRandomResponse();
              }
              return response;
      }

      /**
       * Pick a default response to use if nothing else fits.
       * @return a non-committal string
       */
      private String getRandomResponse()
      {
              final int NUMBER_OF_RESPONSES = 4;
              double r = Math.random();
              int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
              String response = "";

              if (whichResponse == 0)
              {
                      response = "Interesting, tell me more.";
              }
              else if (whichResponse == 1)
              {
                      response = "Hmmm.";
              }
              else if (whichResponse == 2)
              {
                      response = "Do you really think so?";
              }
              else if (whichResponse == 3)
              {
                      response = "You don't say.";
              }
              else if (whichResponse == 4)
              {
                     response = "Can you elaborate";
              }
              else if (whichResponse == 5)
              {
                response = "What do you mean by that? ";
              }
              
              return response;
       }
 }
