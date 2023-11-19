const display = document.querySelector('#display');
const buttons = document.querySelectorAll('#buttons button');

buttons.forEach(button => {
  button.addEventListener('click', () => {
    const value = button.dataset.value;
    if (isNaN(value)) {
      if (value === '=') {
        const expression = display.value;
        const result = eval(expression);
        display.value = result;
      } else {
        display.value += value;
      }
    } else {
      display.value += value;
    }
  });
});
