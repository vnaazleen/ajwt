books = [
    {
        name: "Let Us C",
        image: "https://m.media-amazon.com/images/I/61X3fZAD6OL._AC_UY218_.jpg",
        author: "Yashavant Kanetkar",
        price: "₹330",
        subject: "c"
    }, {
        name: "C: Complete Reference",
        image: "https://m.media-amazon.com/images/I/71mqdKj2O9L._AC_UY218_.jpg",
        author: "Herbert Schildt",
        price: "₹679",
        subject: "c"
    }, {
        name: "Java: Complete Reference",
        image: "https://m.media-amazon.com/images/I/71xHBoNjkoL._AC_UY218_.jpg",
        author: "Herbert Schildt",
        price: "₹984",
        subject: "java"
    }, {
        name: "Python Programming",
        image: "https://m.media-amazon.com/images/I/41-W3W0t02L._AC_UY218_.jpg",
        author: "Reema Thareja",
        price: "₹499",
        subject: "python"
    }
]

function displayBooks() {

    document.getElementById("title").innerHTML = "ALL BOOKS"
    if(document.getElementsByClassName("cards").length == 1) {
        document.getElementsByClassName("cards")[0].remove()
    }
    
    const cards = document.createElement("div")
    cards.classList.add("cards")
    cards.classList.add("content")

    for(let i = 0; i < books.length; i++) {
        const card = document.createElement("div")
        card.className = "card"

        const img = document.createElement("img")
        img.setAttribute("src", books[i].image)

        const name = document.createElement("p")
        name.appendChild(document.createTextNode("Name: " + books[i].name))

        const author = document.createElement("p")
        author.innerHTML = "Author: " + books[i].author 

        const price = document.createElement("p")
        price.innerHTML = "Price: " + books[i].price 

        card.appendChild(img)
        card.appendChild(name)
        card.appendChild(author)
        card.appendChild(price)

        cards.appendChild(card)
    }

    document.body.appendChild(cards);
}

function displayBooksBySubject(subject) {
    console.log(subject)

    document.getElementById("title").innerHTML = subject.toUpperCase() + " BOOKS"

    let cards = document.getElementsByClassName("cards")[0];
    cards.innerHTML=""


    for(let i = 0; i < books.length; i++) {

        if(books[i].subject != subject) {
            continue
        }

        const card = document.createElement("div")
        card.className = "card"

        const img = document.createElement("img")
        img.setAttribute("src", books[i].image)

        const name = document.createElement("p")
        name.appendChild(document.createTextNode("Name: " + books[i].name))

        const author = document.createElement("p")
        author.innerHTML = "Author: " + books[i].author 

        const price = document.createElement("p")
        price.innerHTML = "Price: " + books[i].price 

        card.appendChild(img)
        card.appendChild(name)
        card.appendChild(author)
        card.appendChild(price)

        cards.appendChild(card)
    }

    document.body.appendChild(cards);
}
