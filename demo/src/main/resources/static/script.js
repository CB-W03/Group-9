document.addEventListener('DOMContentLoaded', () => {
    // Functions to open and close a modal
    function openModal($el) {
      $el.classList.add('is-active');
    }
  
    function closeModal($el) {
      $el.classList.remove('is-active');
    }
  
    function closeAllModals() {
      (document.querySelectorAll('.modal') || []).forEach(($modal) => {
        closeModal($modal);
      });
    }
  
    // Add a click event on buttons to open a specific modal
    (document.querySelectorAll('.js-modal-trigger') || []).forEach(($trigger) => {
      const modal = $trigger.dataset.target;
      const $target = document.getElementById(modal);
  
      $trigger.addEventListener('click', () => {
        openModal($target);
      });
    });
  
    // Add a click event on various child elements to close the parent modal
    (document.querySelectorAll('.modal-background, .modal-close, .modal-card-head .delete, .modal-card-foot .button, .close-modal-button') || []).forEach(($close) => {
      const $target = $close.closest('.modal');
  
      $close.addEventListener('click', () => {
        closeModal($target);
      });
    });
  
    // Add a keyboard event to close all modals
    document.addEventListener('keydown', (event) => {
      if(event.key === "Escape") {
        closeAllModals();
      }
    });
  });

/*
Insert insert_data between all tags labelled with class class_name.
*/
function update(insert_data, class_name) {
  var elements = document.getElementsByClassName(class_name);
  for (i = 0; i < elements.length; i++) {
    elements[i].innerHTML = insert_data;
  }
}

/*
Output the rows of a table of transactions at a location given by class_name.
Input: an array of transactions, each with a recipient, date, and amount.
*/
function output_transactions(class_name) {
  fetch('https://api.jsonbin.io/v3/qs/6690f206e41b4d34e410bc15')
  .then(response => response.json())
  .then(json => update(formatRows(json['record']), class_name));
}

/*
  Returns a string containing the rows of a table.
  Input: an array of dictionaries with keys recipient, date, and amount.
  Output: HTML rows of the table.
*/
function formatRows(json) {
  var result = "";
  for (i = 0; i < json.length; i++) {
    result += `<tr>
      <th>${json[i]['recipient']}</th>
      <td>${json[i]['amount']}</td>
      <td>${json[i]['date']}</td>
    </tr>
    `
  }
  return result;
}

output_transactions("transactiontable");
