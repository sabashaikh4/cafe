<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Bill</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background: #f8f8f8;
            padding: 20px;
        }
        .bill-container {
            background: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            margin: auto;
            border-radius: 10px;
        }
        h2 {
            color: #4CAF50;
        }
        .bill-table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        .bill-table th, .bill-table td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: left;
        }
        .bill-table th {
            background: #4CAF50;
            color: white;
        }
        .thank-you {
            margin-top: 20px;
            font-size: 20px;
            color: #4CAF50;
        }
    </style>
</head>
<body>

    <div class="bill-container">
        <h2>Order Confirmed!</h2>
        <p class="thank-you">Thank you, <strong>${user.name}</strong>! Your order has been placed successfully.</p>

        <table class="bill-table">
            <tr>
                <th>Item</th>
                <td>${user.item}</td>
            </tr>
            <tr>
                <th>Quantity</th>
                <td>${user.quantity}</td>
            </tr>
            <tr>
                <th>Total Price</th>
                <td>₹${user.totalPrice}</td>
            </tr>
            <tr>
                <th>Delivery Address</th>
                <td>${user.address}</td>
            </tr>
            <tr>
                <th>Phone Number</th>
                <td>${user.phonenum}</td>
            </tr>
        </table>

        <p class="thank-you">Your food is being prepared!</p>
    </div>

</body>
</html>
