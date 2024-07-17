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
function output_transactions(cust_id, class_name) {
  fetch('http://localhost:8084/API/'+String(cust_id)+"/transactions")
  .then(response => response.json())
  .then(json => update(formatRows(json), class_name));
}

/* Insert account information.
*/
function insert_account_info(cust_id) {
  fetch('http://localhost:8084/API/'+String(cust_id))
  .then(response => response.json())
  .then(json => {
    update(json['custName'], "acctname");
    update(json['acctNum'], "acctno");
    update(json['sortCode'],"sortcode");
    update(json['iban'],"iban");
    update(json['balance'], "acctbal");
  })
}

function fetch_card(cust_id){
  fetch('http://localhost:8084/API'+String(cust_id)+"/cards")
  .then(response => response.json())
  .then(json => update(json['cardNumber'],cardone));
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
      <th>${json[i]['thirdPartyName']}</th>
      <td>${json[i]['amount']}</td>
      <td>${json[i]['date']}</td>
    </tr>
    `
  }
  console.log(result);
  return result;
}

output_transactions(1, "transactiontable");
insert_account_info(1);
