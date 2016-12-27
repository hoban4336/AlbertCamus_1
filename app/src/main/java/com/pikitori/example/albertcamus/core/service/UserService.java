package com.pikitori.example.albertcamus.core.service;

import com.pikitori.example.albertcamus.core.vo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeon on 2016-12-27.
 */

public class UserService {

    public List<User> fetchMockUserList(){

        List<User> list = new ArrayList<User>();

        // Mock Data
        User user = new User();
        user.setId( 1L );
        user.setName( "안대혁" );
        user.setPhone( "010-4761-6934" );
        user.setEmail( "kickscar@gmail.com" );
        user.setProfilePic("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/936089_1019758748039064_7187347097932848216_n.jpg?oh=ec46e4053b89bf9ea434f1cf79b6ce43&oe=58B4B3C8" );
        user.setStatus( 1 );
        list.add( user );

        return list;

    }

//    public List<User> fetchUserList() {
//
//        String url = "http://221.167.211.109:8080/camus/user/list";
//        HttpRequest request = HttpRequest.get( url );
//
//        request.contentType( HttpRequest.CONTENT_TYPE_JSON );
//        request.accept( HttpRequest.CONTENT_TYPE_JSON );
//        request.connectTimeout( 1000 );
//        request.readTimeout( 30000 );
//
//        int responseCode = request.code();
//
//        if( responseCode != HttpURLConnection.HTTP_OK ) {
//            Log.e( "UserService", "fetchUserList() error : Not 200 OK" );
//            return null;
//        }
//
//        JSONResultUserList jsonResult = fromJSON( request, JSONResultUserList.class );
//        return jsonResult.getData();
//
//    }
//


}
