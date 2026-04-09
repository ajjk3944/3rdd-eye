package ua;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.internal.ads.il;
import java.util.TreeMap;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f35252a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.f35252a;
        iVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) il.f12368d.u());
        o oVar = iVar.f35256d;
        builder.appendQueryParameter(AppLovinEventParameters.SEARCH_QUERY, (String) oVar.f36149e);
        builder.appendQueryParameter("pubId", (String) oVar.f36147c);
        builder.appendQueryParameter("mappver", (String) oVar.g);
        TreeMap treeMap = (TreeMap) oVar.f36148d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        String strI4 = iVar.i4();
        String encodedQuery = uriBuild.getEncodedQuery();
        return r5.c.m(new StringBuilder(strI4.length() + 1 + String.valueOf(encodedQuery).length()), strI4, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f35252a.f35257e;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
