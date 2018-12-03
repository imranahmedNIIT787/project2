/**
 * FriendService
 */

app.factory('FriendService',function($http){
	var friendService={}

	friendService.getAllSuggestedUsers=function(){
		return $http.get("http://localhost:8082/middleware/suggestedusers")
	}
	
	friendService.sendFriendRequest=function(user){//value for toId property in Friend Entity
		return $http.post("http://localhost:8082/middleware/friendrequest",user)
	}
	
	friendService.getPendingRequests=function(){
		return $http.get("http://localhost:8082/middleware/pendingrequests")
	}
	
	friendService.acceptRequest=function(friendRequest){
		return $http.put("http://localhost:8082/middleware/acceptrequest",friendRequest)
	}
	friendService.deleteRequest=function(friendRequest){
		return $http.put("http://localhost:8082/middleware/deleterequest",friendRequest)
	}
	
	friendService.getAllFriends=function(){
		return $http.get("http://localhost:8082/middleware/friends")
	}
	
	return friendService;
})
