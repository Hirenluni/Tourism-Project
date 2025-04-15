// 📌 Open & Close Booking Popup
function openBookingForm(packageName) {
    document.getElementById("booking-popup").style.display = "block";
    document.getElementById("selected-package").innerText = `You are booking: ${packageName}`;
}
function closeBookingForm() {
    document.getElementById("booking-popup").style.display = "none";
}

// 📌 Wishlist Functionality (Add & Remove)
document.addEventListener("DOMContentLoaded", function() {
    const wishlistContainer = document.getElementById("wishlist-container");
    const wishlist = JSON.parse(localStorage.getItem("wishlist")) || [];

    if (wishlistContainer) {
        renderWishlist();
    }

    function renderWishlist() {
        wishlistContainer.innerHTML = "";
        wishlist.forEach((item, index) => {
            let wishlistItem = document.createElement("div");
            wishlistItem.classList.add("wishlist-item");
            wishlistItem.innerHTML = `
                <img src="${item.image}" alt="${item.name}">
                <h3>${item.name}</h3>
                <p>${item.description}</p>
                <button class="book-now" onclick="openBookingForm('${item.name}')">Book Now</button>
                <button class="remove-wishlist" onclick="removeFromWishlist(${index})">Remove</button>
            `;
            wishlistContainer.appendChild(wishlistItem);
        });
    }

    function addToWishlist(name, image, description) {
        wishlist.push({ name, image, description });
        localStorage.setItem("wishlist", JSON.stringify(wishlist));
        alert("Added to Wishlist!");
    }

    window.removeFromWishlist = function(index) {
        wishlist.splice(index, 1);
        localStorage.setItem("wishlist", JSON.stringify(wishlist));
        renderWishlist();
    }

    window.addToWishlist = addToWishlist;
});

// 📌 Smooth Scroll for Better UX
document.querySelectorAll("nav a").forEach(anchor => {
    anchor.addEventListener("click", function(e) {
        if (this.getAttribute("href").startsWith("#")) {
            e.preventDefault();
            const section = document.querySelector(this.getAttribute("href"));
            section.scrollIntoView({ behavior: "smooth" });
        }
    });
});

// 📌 Booking Confirmation
document.querySelector(".confirm-booking").addEventListener("click", function() {
    alert("Booking Confirmed! 🎉");
    closeBookingForm();
});