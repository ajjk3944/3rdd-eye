package A2;

import a.AbstractC0241a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC1642oa;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.SB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import u2.C2951a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final Context f163a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f164b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f165c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f166d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f167e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f168f = new AtomicBoolean(false);

    public G(Context context, ArrayList arrayList, C2951a c2951a) {
        this.f163a = context;
        this.f164b = context.getApplicationInfo();
        this.f165c = arrayList;
        this.f166d = c2951a;
    }

    public final void a(WebView webView) throws JSONException {
        if (this.f168f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoH = null;
        ApplicationInfo applicationInfo = this.f164b;
        if (applicationInfo != null) {
            try {
                packageInfoH = R2.b.a(this.f163a).h(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f167e;
        if (packageInfoH != null) {
            try {
                jSONObject.put("vc", packageInfoH.versionCode);
                jSONObject.put("vnm", packageInfoH.versionName);
            } catch (JSONException e6) {
                p2.j.f22785C.f22795h.f("PawAppSignalGenerator.initialize", e6);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f165c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) C2841s.f23267e.f23270c.a(H9.ab)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f166d.f23784a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) AbstractC1642oa.f15956b.v()).booleanValue() && AbstractC0241a.k("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) C2841s.f23267e.f23270c.a(H9.Za), b());
            int i = RB.f10866c;
            SB sb = new SB("*");
            int i3 = T0.f.f3557a;
            if (!U0.m.f3683e.b()) {
                throw U0.m.a();
            }
        }
    }

    public final JSONObject b() throws JSONException {
        if (!this.f168f.get()) {
            a(null);
        }
        return this.f167e;
    }
}
