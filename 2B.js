function sortDescending(array) {
  for (var i = 0; i < array.length; i++) {
    for (var j = i + 1; j < array.length; j++) {
      if (array[i] < array[j]) {
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
  }
  return array;
}

const array = [5, 2, 4, 1, 3];
const sortedArray = sortDescending(array);
console.log(sortedArray);
