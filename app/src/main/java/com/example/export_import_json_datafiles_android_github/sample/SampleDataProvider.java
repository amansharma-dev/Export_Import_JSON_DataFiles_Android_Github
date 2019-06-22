package com.example.export_import_json_datafiles_android_github.sample;

import com.example.export_import_json_datafiles_android_github.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    public static List<DataItem> dataItemList;
    public static Map<String,DataItem> dataItemMap;


    static{
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null,"drake_hiphop.png","Child's Play","Drake","Hip-Hop",1.99));
        addItem(new DataItem(null,"cardi_b_hiphop.png","Wish Wish","Cardi B","Hip-Hop",0.99));
        addItem(new DataItem(null,"j_cole_hiphop.png","Role Modelz","J Cole","Hip-Hop",0.99));

        addItem(new DataItem(null,"billy_country.png","People Are Crazy","Billy Currington","Country",0.99));
        addItem(new DataItem(null,"justin_moore_country.png","Somebody Else Will","Justin Moore","Country",0.65));
        addItem(new DataItem(null,"kelly_clarkson_country.png","Because Of You","Kelly Clarkson","Country",0.99));

        addItem(new DataItem(null,"bob_marley_reggae.png","Don't Worry Be Happy","Bob Marley","Reggae",1.99));
        addItem(new DataItem(null,"damian_marley_reggae.png","Patience","Damian Marley","Reggae",1.99));
        addItem(new DataItem(null,"sizzla_reggae.png","Thank You Mama","Sizzla Kalonji","Reggae",0.99));

        addItem(new DataItem(null,"beyonce_rnb.png","Ape Shit","Beyonce","RnB",1.99));
        addItem(new DataItem(null,"janet_jackson_rnb.png","That's the Way Love Goes","Janet Jackson","RnB",0.99));
        addItem(new DataItem(null,"michael_jackson_rnb.png","Beat It","Michael Jackson","RnB",1.99));
    }

    private static void addItem(DataItem item){
        dataItemList.add(item);
        dataItemMap.put(item.getItemId(),item);


    }
}
