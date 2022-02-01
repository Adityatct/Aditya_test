$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/singtel/features/todolist.feature");
formatter.feature({
  "name": "Manage and track ToDo list as a ToDo MVC user",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on todoMVC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoListSteps.redirectToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add and Remove items from todo list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I add following items in todo list:",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    },
    {
      "cells": [
        "Shopping"
      ]
    },
    {
      "cells": [
        "Cycling"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodoListSteps.addItems_ToList(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect \"4\" items available in the todo list",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoListSteps.verify_ItemsInList(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I remove following items from todo list",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodoListSteps.removeItems_FromList(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect \"2\" items available in the todo list",
  "keyword": "Then "
});
formatter.match({
  "location": "TodoListSteps.verify_ItemsInList(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on todoMVC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoListSteps.redirectToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mark items as completed from todo list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I add following items in todo list:",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    },
    {
      "cells": [
        "Shopping"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodoListSteps.addItems_ToList(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mark following items as completed from todo list",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.markItems_Completed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Completed\" section",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.click_OnSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect following items to be available in \"Completed\" section",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TodoListSteps.verifyItems_InSection(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on todoMVC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoListSteps.redirectToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Move items from completed to active section",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I add following items in todo list:",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    },
    {
      "cells": [
        "Shopping"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodoListSteps.addItems_ToList(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mark following items as completed from todo list",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Meeting"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.markItems_Completed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Completed\" section",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.click_OnSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move following items from \"Completed\" to \"Active\" section",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.move_Items(String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Active\" section",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.click_OnSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect following items to be available in \"Active\" section",
  "rows": [
    {
      "cells": [
        "Jogging"
      ]
    },
    {
      "cells": [
        "Shopping"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TodoListSteps.verifyItems_InSection(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on todoMVC Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "TodoListSteps.redirectToHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Clear completed items from todo list",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I add following items in todo list:",
  "rows": [
    {
      "cells": [
        "Meeting"
      ]
    },
    {
      "cells": [
        "Shopping"
      ]
    },
    {
      "cells": [
        "Cycling"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TodoListSteps.addItems_ToList(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mark following items as completed from todo list",
  "rows": [
    {
      "cells": [
        "Shopping"
      ]
    },
    {
      "cells": [
        "Cycling"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.markItems_Completed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Completed\" section",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.click_OnSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clear completed items",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.clear_completedItems()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"All\" section",
  "keyword": "And "
});
formatter.match({
  "location": "TodoListSteps.click_OnSection(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I expect following items to be available in \"All\" section",
  "rows": [
    {
      "cells": [
        "Meeting"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TodoListSteps.verifyItems_InSection(String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});