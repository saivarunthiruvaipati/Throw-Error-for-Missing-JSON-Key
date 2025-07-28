def data = new groovy.json.JsonSlurper().parseText(message.getBody(String))
if (!data.containsKey("email")) {
  throw new Exception("Missing required field: email")
}
return message
