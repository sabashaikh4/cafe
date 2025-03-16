


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order | Idli Dosa Cafe</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f8f0;
            text-align: center;
        }

        .container {
            width: 40%;
            margin: auto;
            background: white;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 0 8px rgba(0, 0, 0, 0.1);
            margin-top: 30px;
        }

        h2 {
            color: #2E8B57;
        }

        label {
            font-weight: bold;
            display: block;
            text-align: left;
            margin: 5px 0;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .qty-container {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 10px;
        }

        .qty-btn {
            background: #32CD32;
            color: white;
            border: none;
            padding: 8px;
            cursor: pointer;
            font-size: 14px;
            border-radius: 3px;
            width: 35px;
        }

        .qty-btn:hover {
            background: #228B22;
        }

        #quantity {
            width: 40px;
            text-align: center;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .confirm-btn {
            background: #2E8B57;
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
            border-radius: 4px;
            width: 100%;
            font-size: 15px;
        }

        .confirm-btn:hover {
            background: #228B22;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Confirm Your Order</h2><form action="confirmOrder" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="customerName" required>

    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>

    <label for="phone">Phone Number:</label>
    <input type="text" id="phone" name="phoneNumber" required>

    <label for="item">Select Item:</label>
    <select id="item" name="item" onchange="updatePrice()">
        <option value="Dosa" data-price="50">Dosa - ₹50</option>
        <option value="Idli" data-price="40">Idli - ₹40</option>
    </select>

    <label>Quantity:</label>
    <div class="qty-container">
        <button type="button" class="qty-btn" onclick="decreaseQuantity()">-</button>
        <input type="text" id="quantity" name="quantity" value="1" readonly>
        <button type="button" class="qty-btn" onclick="increaseQuantity()">+</button>
    </div>

    <label for="price">Total Price:</label>
    <input type="text" id="price" name="totalPrice" value="50" readonly>

    <button type="submit" class="confirm-btn">Confirm Order</button>
</form>

<script>
    function updatePrice() {
        let selectedItem = document.getElementById("item");
        let pricePerItem = parseFloat(selectedItem.options[selectedItem.selectedIndex].getAttribute("data-price"));
        let quantity = parseInt(document.getElementById("quantity").value);
        document.getElementById("price").value = (pricePerItem * quantity).toFixed(2);
    }

    function increaseQuantity() {
        let quantityInput = document.getElementById("quantity");
        let qty = parseInt(quantityInput.value);
        qty++;
        quantityInput.value = qty;
        updatePrice();
    }

    function decreaseQuantity() {
        let quantityInput = document.getElementById("quantity");
        let qty = parseInt(quantityInput.value);
        if (qty > 1) {
            qty--;
            quantityInput.value = qty;
            updatePrice();
        }
    }
</script>


</body>
</html>
