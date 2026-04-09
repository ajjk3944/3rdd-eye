package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k63 {
    public final Context a;
    public final ApplicationInfo b;
    public final ArrayList c;
    public final e51 d;
    public final JSONObject e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public k63(Context context, ArrayList arrayList, e51 e51Var) {
        this.a = context;
        this.b = context.getApplicationInfo();
        this.c = arrayList;
        this.d = e51Var;
    }

    public final void a(WebView webView) throws JSONException {
        if (this.f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoB = null;
        ApplicationInfo applicationInfo = this.b;
        if (applicationInfo != null) {
            try {
                packageInfoB = za1.a(this.a).b(applicationInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.e;
        if (packageInfoB != null) {
            try {
                jSONObject.put("vc", packageInfoB.versionCode);
                jSONObject.put("vnm", packageInfoB.versionName);
            } catch (JSONException e) {
                hg4.C.h.d("PawAppSignalGenerator.initialize", e);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) tw1.e.c.a(mz1.Da)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.d.f);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) x02.b.w()).booleanValue() && ob1.n("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) tw1.e.c.a(mz1.Ca), b());
            int i = dn3.h;
            en3 en3Var = new en3("*");
            int i2 = c81.a;
            if (!f81.d.b()) {
                throw f81.a();
            }
        }
    }

    public final JSONObject b() throws JSONException {
        if (!this.f.get()) {
            a(null);
        }
        return this.e;
    }
}
