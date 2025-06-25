function showcourses(){


    fetch("http://localhost:8080/courses") // API end point

    .then((response )=> response.json())
    .then((courses)=>{
        const dataTable=document.getElementById("coursetable")
        courses.forEach(course =>{
            var row = `<tr>
            <td> ${course.courseId}</td>
            <td> ${course.courseName}</td>
            <td> ${course.trainer}</td>
            <td> ${course.duration}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });

    });
}
function showEnrolledStudents(){

    
    fetch("http://localhost:8080/courses/enrolled") // API end point

    .then((response )=> response.json()) // response is converted to JSON objects
    .then((students)=>{
        const dataTable=document.getElementById("Enroll")
        students.forEach(student =>{
            var row = `<tr>
            <td> ${student.name}</td>
            <td> ${student.courseName}</td>
            <td> ${student.emailId}</td>
           
            </tr>`

            dataTable.innerHTML+=row;
        });

    });
}
