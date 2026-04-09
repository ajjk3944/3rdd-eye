package fb;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.e51;
import com.google.android.gms.internal.ads.f51;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.zl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23980a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f23981b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23982c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f23983d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f23984e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f23985f = new AtomicBoolean(false);

    public v(Context context, ArrayList arrayList, za.a aVar) {
        this.f23980a = context;
        this.f23981b = context.getApplicationInfo();
        this.f23982c = arrayList;
        this.f23983d = aVar;
    }

    public final void a(WebView webView) throws JSONException {
        if (this.f23985f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoE = null;
        ApplicationInfo applicationInfo = this.f23981b;
        if (applicationInfo != null) {
            try {
                packageInfoE = ub.b.a(this.f23980a).e(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f23984e;
        if (packageInfoE != null) {
            try {
                jSONObject.put("vc", packageInfoE.versionCode);
                jSONObject.put("vnm", packageInfoE.versionName);
            } catch (JSONException e2) {
                ua.j.C.f35265h.f("PawAppSignalGenerator.initialize", e2);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f23982c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) va.s.f36163e.f36166c.a(sk.f16078cb)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f23983d.f38129a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) zl.f19111b.u()).booleanValue() && ii.a.s("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) va.s.f36163e.f36166c.a(sk.f16062bb), b());
            int i4 = e51.f10709c;
            f51 f51Var = new f51("*");
            int i10 = o6.f.f30411a;
            if (!p6.l.f31391e.b()) {
                throw p6.l.a();
            }
        }
    }

    public final JSONObject b() throws JSONException {
        if (!this.f23985f.get()) {
            a(null);
        }
        return this.f23984e;
    }
}
