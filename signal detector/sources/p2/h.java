package p2;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.X9;
import java.util.TreeMap;
import q2.C2834o;

/* loaded from: classes.dex */
public final class h extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f22777a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i iVar = this.f22777a;
        iVar.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) X9.f12397d.v());
        C2834o c2834o = iVar.f22781d;
        builder.appendQueryParameter("query", (String) c2834o.f23255e);
        builder.appendQueryParameter("pubId", (String) c2834o.f23253c);
        builder.appendQueryParameter("mappver", (String) c2834o.f23257g);
        TreeMap treeMap = (TreeMap) c2834o.f23254d;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        String strL3 = iVar.L3();
        String encodedQuery = uriBuild.getEncodedQuery();
        return AbstractC1135f5.n(new StringBuilder(strL3.length() + 1 + String.valueOf(encodedQuery).length()), strL3, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.f22777a.f22782e;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
