$(document).ready(function () {

$("#teacher-form").submit(function (event) {
         alert (" Hello !!");
        //stop submit the form event. Do this manually using ajax post function
        event.preventDefault();

        var teacherForm = {}
        $("#btn-login").prop("disabled", true);

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/super/admin/disbaleTeacher",
            data: JSON.stringify(teacherForm),
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data) {
            	alert (" Hello !!");
                var json = "<h4>Ajax Response</h4><pre>"
                    + JSON.stringify(data, null, 4) + "</pre>";
                $('#feedback').html(json);

                console.log("SUCCESS : ", data);

            },
            error: function (e) {

                var json = "<h4>Ajax Response Error</h4><pre>"
                    + e.responseText + "</pre>";
                $('#feedback').html(json);

                console.log("ERROR : ", e);
               
            }
        });
        
    });

});