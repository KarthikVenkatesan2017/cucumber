$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/AllPrograms/New_WorkSpace/CucumberProject/src/main/java/features/city_movies_showtimings.feature");
formatter.feature({
  "line": 1,
  "name": "City Movies Advanced",
  "description": "",
  "id": "city-movies-advanced",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get locations",
  "description": "",
  "id": "city-movies-advanced;get-locations",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the apis are up and running for \"http://cmapi.bananaappscenter.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user performs a get request to \"api/Location/LocationDetails\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "and perform the request",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the response code should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should be json respose with pairs on the filtered \"Msg\" node",
  "rows": [
    {
      "cells": [
        "Message",
        "Success Location Details"
      ],
      "line": 10
    },
    {
      "cells": [
        "StatusCode",
        "200"
      ],
      "line": 11
    },
    {
      "cells": [
        "isError",
        "False"
      ],
      "line": 12
    },
    {
      "cells": [
        "isSuccess",
        "true"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://cmapi.bananaappscenter.com/",
      "offset": 33
    }
  ],
  "location": "CityMoviesStepDef.the_apis_are_up_and_running_for(String)"
});
formatter.result({
  "duration": 5917608415,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "api/Location/LocationDetails",
      "offset": 34
    }
  ],
  "location": "CityMoviesStepDef.a_user_performs_a_get_request_to(String)"
});
formatter.result({
  "duration": 293178,
  "status": "passed"
});
formatter.match({
  "location": "CityMoviesStepDef.and_perform_the_request()"
});
formatter.result({
  "duration": 148151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 28
    }
  ],
  "location": "CityMoviesStepDef.the_response_code_should_be(int)"
});
formatter.result({
  "duration": 5334328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Msg",
      "offset": 53
    }
  ],
  "location": "CityMoviesStepDef.i_should_be_json_respose_with_pairs_on_the_filtered_node(String,DataTable)"
});
formatter.result({
  "duration": 3139730,
  "status": "passed"
});
});