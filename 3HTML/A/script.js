document.getElementById('calculate').addEventListener('click', function (){
    let number1 = parseFloat(document.getElementById('number1').value);
    let number2 = parseFloat(document.getElementById('number2').value);
    let operation = document.getElementById('operation').value;

    if (isNaN(number1) || isNaN(number2)) {
        alert('Please enter a valid number');
        return;
    }

    switch (operation) {
        case 'add':
            document.getElementById('result').value = number1 + number2;
            break;
        case 'subtract':
            document.getElementById('result').value = number1 - number2;
            break;
        case 'multiply':
            document.getElementById('result').value = number1 * number2;
            break;
        case 'divide':
            if (number2 === 0) {
                alert('Division by zero is not allowed');
                return;
            }
            document.getElementById('result').value = number1 / number2;
            break;
    }
});