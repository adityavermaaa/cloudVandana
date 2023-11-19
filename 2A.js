function reverseWords(sentence) {
  var words = sentence.split(' ');
  var reversedWords = [];
  for (var i = 0; i < words.length; i++) {
    var word = words[i].split('');
    for (var j = 0; j < word.length / 2; j++) {
      var temp = word[j];
      word[j] = word[word.length - 1 - j];
      word[word.length - 1 - j] = temp;
    }
    reversedWords.push(word.join(''));
  }
  return reversedWords.join(' ');
}

const sentence = "Cloud Vandana is a cloud solution company.";
const reversedSentence = reverseWords(sentence);
console.log(reversedSentence);
