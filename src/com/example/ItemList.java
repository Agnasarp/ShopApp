/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author Hasitha_08884
 */
public class ItemList implements Handler{

    private Clothing[] items;
    
    public ItemList(Clothing[] items){
        this.items=items;
    }
    
    @Override
    public void accept(ServerRequest sr, ServerResponse sr1) {
        sr1.status(Http.Status.OK_200);
        sr1.headers().put("Content-Type", "application/json");
        sr1.send(items.toString());
    }
    
}
