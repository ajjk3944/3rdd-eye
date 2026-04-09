package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ke4 extends AsyncTask {
    public final /* synthetic */ pf4 a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        pf4 pf4Var = this.a;
        pf4Var.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) h02.d.w());
        bu1 bu1Var = pf4Var.i;
        builder.appendQueryParameter("query", (String) bu1Var.j);
        builder.appendQueryParameter("pubId", (String) bu1Var.h);
        builder.appendQueryParameter("mappver", (String) bu1Var.l);
        TreeMap treeMap = (TreeMap) bu1Var.i;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        String strC3 = pf4Var.C3();
        String encodedQuery = uriBuild.getEncodedQuery();
        return ex0.l(new StringBuilder(strC3.length() + 1 + String.valueOf(encodedQuery).length()), strC3, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.a.j;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
