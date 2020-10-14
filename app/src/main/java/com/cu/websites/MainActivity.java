package com.cu.websites;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    WebView wv;
    ProgressDialog pd;
    String[] names={
            "နိုင္ငံေတာ္သမၼတ႐ုံး",
            "ကာကြယ္ေရးဝန္ႀကီးဌာန",
            "နယ္စပ္ေရးရာဝန္ႀကီးဌာန",
            "ျပန္ၾကားေရးဝန္ႀကီးဌာန",
            "နိုင္ငံျခားေရးဝန္ႀကီးဌာန",
            "သာသနာေရးဝန္ႀကီးဌာန",
            "သမဝါယမဝန္ႀကီးဌာန",
            "လယ္ယာစိုက္ပ်ိဳးေရးႏွင့္ဆည္ေျမာင္းဝန္ႀကီးဌာန",
            "ေမြးျမဴေရးႏွင့္ေရလုပ္ငန္းဝန္ႀကီးဌာန",
            "ဆက္သြယ္ေရးႏွင့္ သတင္းအခ်က္အလက္နည္းပညာဝန္ႀကီးဌာန",
            "ပို့ေဆာင္ေရးဝန္ႀကီးဌာန",
            "ပတ္ဝန္းက်င္ထိန္းသိမ္းေရးႏွင့္သစ္ေတာေရးရာဝန္ႀကီးဌာန",
            "လူဝင္မွုႀကီးၾကပ္ေရးႏွင့္ျပည္သူ႔အင္အားဝန္ႀကီးဌာန",
            "စြမ္းအင္ဝန္ႀကီးဌာန",
            "စက္မွုဝန္ႀကီးဌာန",
            "စီးပြားေရးႏွင့္ကူးသန္းေရာင္းဝယ္ေရးဝန္ႀကီးဌာန",
            "လၽွပ္စစ္စြမ္းအားဝန္ႀကီးဌာန",
            "အားကစားဝန္ႀကီးဌာန",
            "ပညာေရးဝန္ႀကီးဌာန",
            "က်န္းမာေရးဝန္ႀကီးဌာန",
            "သတၱဳတြင္းဝန္ႀကီးဌာန",
            "အလုပ္သမား၊အလုပ္အကိုင္ႏွင့္လူမွုဖူလုံေရးဝန္ႀကီးဌာန",
            "ရထားပို့ေဆာင္ေရးဝန္ႀကီးဌာန",
            "လူမွုဝန္ထမ္း၊ကယ္ဆယ္ေရးႏွင့္ျပန္လည္ေနရာခ်ထားေရးဝန္ႀကီးဌာန",
            /*"ဟိုတယ္ႏွင့္ခရီးသြားလာေရးဝန္ႀကီးဌာန",*/
            "ယဥ္ေက်းမွုဝန္ႀကီးဌာန",
            "ဘ႑ာေရးႏွင့္အခြန္ဝန္ႀကီးဌာန",
            "အမ်ိဳးသားစီမံကိန္းႏွင့္စီးပြားေရးဖြံ့ၿဖိဳးတိုးတက္မွုဝန္ႀကီးဌာန",
            "ေဆာက္လုပ္ေရးဝန္ႀကီးဌာန",
            "သိပၸံႏွင့္နည္းပညာဝန္ႀကီးဌာန",
            "ျပည္ေထာင္စုေရွ႕ေနခ်ဳပ္႐ုံး",
            "ျပည္ေထာင္စုစာရင္းစစ္ခ်ဳပ္႐ုံး",
            "ျပည္ေထာင္စုရာထူးဝန္အဖြဲ႕",
            "ျမန္မာနိုင္ငံရဲတပ္ဖြဲ႕",
            "မီးသတ္ဦးစီးဌာန",
            "ေဘးအႏၲရာယ္ဆိုင္ရာစီမံခန္႔ခြဲမွုဦးစီးဌာန",
            "ျမန္မာ့နိုင္ငံျခားကုန္သြယ္ေရးဘဏ္",
            "ျပည္တြင္းအခြန္မ်ားဦးစီးဌာန",
            "အေကာက္ခြန္ဦးစီးဌာန"
    };

    String[] addresses={
            "http://www.president-office.gov.mm",
            "http://www.mod.gov.mm",
            "http://www.mba.gov.mm",
            "http://www.moi.gov.mm",
            "http://www.mofa.gov.mm",
            "http://www.mora.gov.mm",
            "http://www.myancoop.gov.mm",
            "http://www.moai.gov.mm",
            "http://www.livestock-fisheries.gov.mm",
            "http://www.mcpt.gov.mm",
            "http://www.mot.gov.mm",
            "http://www.moecaf.gov.mm",
            "http://www.mip.gov.mm",
            "http://www.energy.gov.mm",
            "http://www.moin.gov.mm",
            "http://www.commerce.gov.mm",
            "http://www.moep.gov.mm",
            "http://www.myasoc.org",
            "http://www.myanmar-education.edu.mm",
            "http://www.moh.gov.mm",
            "http://www.mining.gov.mm",
            "http://www.mol.gov.mm",
            "http://www.ministryofrailtransportation.com",
            "http://www.mswrr.gov.mm",
            /*"http://www.myanmartourism(.)org",*/
            "http://www.culturemyanmar.org",
            "http://www.mofra.gov.mm",
            "http://www.mnped.gov.mm",
            "http://www.ministryofconstruction.gov.mm",
            "http://www.most.gov.mm",
            "http://www.oag.gov.mm",
            "http://www.oagmac.gov.mm",
            "http://www.ucsb.gov.mm",
            "http://www.myanmarpoliceforce.org",
            "http://www.fsd.gov.mm",
            "http://www.ddm.gov.mm",
            "http://www.mmftb.gov.mm",
            "http://www.ird.gov.mm",
            "http://www.customs.gov.mm"
    };

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.web);
       */
        pd=new ProgressDialog(this);
        spn=findViewById(R.id.spn);
        wv=findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient(){
            public void onReceivedError (WebView view,
                                         int errorCode,
                                         String description,
                                         String failingUrl) {
                pd.hide();
                wv.loadData(description, "text/plain", "utf-8");
            }
                public void onPageFinished (WebView view,
                        String url){
                    pd.hide();
                    super.onPageFinished(view,url);
                }
            });

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        spn.setAdapter(adapter);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> p1, View p2, int p3, long p4)
            {
                pd.setTitle(names[p3]+"\nLoading...");
                pd.show();
                wv.loadUrl(addresses[p3]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> p1)
            {
                // TODO: Implement this method
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        if(wv.canGoBack()){
            wv.goBack();
        }else{
            super.onBackPressed();
        }
    }
}