// public class regrex{
//     public static void main(String[] args) {
//         String str="p1";

//         Boolean result=str.matches("[a-z]+[1-9]");
//         System.out.println(result);
//     }
// }


//[abc]---->a or b or c
//[a-z]---->a to z
//[A-Z]---->A to Z
//[0-9]---->0 to 9
//[a-zA-Z]---->a to z or A to Z
//[a-zA-Z0-9]---->a to z or A to Z or 0 to 9
//[^abc]---->except a or b or c
//[^a-z]---->except a to z
//[^A-Z]---->except A to Z
//[^0-9]---->except 0 to 9
//[^a-zA-Z]---->except a to z or A to Z
//[^a-zA-Z0-9]---->except a to z or A to Z or 0 to 9
//[^abc]---->except a or b or c



//.---->any character   
//\d---->any digit
//\D---->any non-digit
//\s---->whitespace character
//\S---->non-whitespace character
//\w---->word character
//\W---->non-word character


//Anchors
//^---->start of the string
//$---->end of the string
//\b---->word boundary
//\B---->non-word boundary


//Groups
//(x)---->capturing group
//(?:x)---->non-capturing group
//(?=x)---->positive lookahead
//(?!x)---->negative lookahead
//(?<=x)---->positive lookbehind
//(?<!x)---->negative lookbehind



//metacharacters
//\---->escape character
//|---->alternation
//()---->grouping
//[]---->character class




//Quantifiers
//X?---->X occurs once or not at all
//X*---->X occurs zero or more times
//X+---->X occurs one or more times
//X{n}---->X occurs n times only
//X{n,}---->X occurs n or more times
//X{n,m}---->X occurs at least n times but less than m times




