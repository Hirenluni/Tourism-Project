// 📌 Registration Form Validation
document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("register-form");

    form.addEventListener("submit", function(event) {
        event.preventDefault();

        let fullName = document.getElementById("full-name").value.trim();
        let username = document.getElementById("username").value.trim();
        let email = document.getElementById("email").value.trim();
        let phone = document.getElementById("phone").value.trim();
        let password = document.getElementById("password").value;
        let confirmPassword = document.getElementById("confirm-password").value;
        let errorMessage = "";

        if (fullName === "" || username === "" || email === "" || phone === "" || password === "" || confirmPassword === "") {
            errorMessage = "All fields are required!";
        } else if (!/^[a-zA-Z\s]+$/.test(fullName)) {
            errorMessage = "Full Name must contain only letters and spaces.";
        } else if (username.length < 4) {
            errorMessage = "Username must be at least 4 characters.";
        } else if (!/^\S+@\S+\.\S+$/.test(email)) {
            errorMessage = "Invalid email format.";
        } else if (!/^\d{10}$/.test(phone)) {
            errorMessage = "Phone number must be 10 digits.";
        } else if (password.length < 6) {
            errorMessage = "Password must be at least 6 characters.";
        } else if (password !== confirmPassword) {
            errorMessage = "Passwords do not match.";
        }

        if (errorMessage) {
            alert(errorMessage);
        } else {
            alert("Registration Successful! ✅");
            form.reset();
        }
    });
});
