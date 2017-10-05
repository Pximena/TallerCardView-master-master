package com.i044114.taller2.Parser;

import com.i044114.taller2.Models.CardView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aula7 on 3/10/17.
 */

public class JsonCardView {
    public static List<CardView> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<CardView> cardViewList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject item = jsonArray.getJSONObject(i);
            CardView cardView = new CardView();
            cardView.setTitulo(item.getString("title"));
            cardView.setUrl(item.getString("url"));
            cardView.setUrltext(item.getString("thumbnailUrl"));
            cardViewList.add(cardView);
        }
        return cardViewList;
    }


}
