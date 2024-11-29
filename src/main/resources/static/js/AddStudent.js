document.addEventListener('DOMContentLoaded', function() {
    var addStudentHtml = `
        <form action="/add" method="post">
            <input type="text"
                   name="name"
                   class="form-control"
                   placeholder="Insert name..."
                   required><br><br>

            <input type="text"
                   name="surName"
                   class="form-control"
                   placeholder="Insert surname..."
                   required><br><br>

            <input type="number"
                   name="exam"
                   class="form-control"
                   placeholder="Insert exam score..."
                   required><br><br>
            <button type="submit" class="btn btn-success">ADD STUDENT</button>
        </form>
    `;
    document.getElementById('addStudent').innerHTML = addStudentHtml;  // Используйте addStudentHtml здесь
});
