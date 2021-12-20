$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/sli.search.feature");
formatter.feature({
  "line": 2,
  "name": "SLI Search",
  "description": "",
  "id": "sli-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sli_search"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Test SLI Pages",
  "description": "",
  "id": "sli-search;test-sli-pages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the website URL.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter a keyword to search.",
  "keyword": "Then "
});
formatter.match({
  "location": "sli_search.open_the_website_URL()"
});
formatter.result({
  "duration": 2413780100,
  "status": "passed"
});
formatter.match({
  "location": "sli_search.enter_a_keyword_to_search()"
});
formatter.result({
  "duration": 118034979300,
  "status": "passed"
});
});