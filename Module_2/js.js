
function submit(){
    console.log(123);
    var ten = document.getElementById("inputName").value;
    var cmnd = document.getElementById("cmnd").value;
    var email = document.getElementById("inputemail").value;
    var ngaysinh = document.getElementById("datepicker").value;
    var address = document.getElementById("inputAddress").value;
    var Customer = document.getElementById("inputCustomer").value;
    var soLuong = document.getElementById("inputsl").value;
    var inputDV = document.getElementById("inputDV").value;
    var inputday = document.getElementById("inputday").value;
    var inputLP = document.getElementById("inputLP").value;
    var code = document.getElementById("inputCode").value;

    document.getElementById("table").style.display = "block"

    document.getElementById("tbname").innerText = ten;
    document.getElementById("tbcmnd").innerText = cmnd;
    document.getElementById("rbnamsinh").innerText = ngaysinh;
    document.getElementById("tbemail").innerText = email;
    document.getElementById("tbdiachi").innerText = address;
    document.getElementById("tbcustomer").innerText = Customer;
    document.getElementById("tbcode").innerText = code;
    document.getElementById("tbsonguoi").innerText = soLuong;
    document.getElementById("tbsongay").innerText = inputday;
    document.getElementById("tbdichvu").innerText = inputDV;
    document.getElementById("tbphongthue").innerText = inputLP;
    document.getElementById("tbcost").innerText = getgia();
}
function getgia() {
    var gia=0;
    if (inputDV=="Villa"){
        gia = 500;
    }
    else {
        if(inputDV=="House"){
            gia= 300;
        }
        else {
            gia= 100;
        }
    }
    return gia*inputday*(1-code/100)
}