function reverseWords(sentence) {
    // split the sentence into words
    let words = sentence.split(' ');
   
    // reverse each word and join them back together
    let reversedSentence = words.map(word => word.split('').reverse().join('')).join(' ');
   
    return reversedSentence;
   }
   
   console.log(reverseWords("This is a sunny day")); // outputs: shiT si a ynnus yad.