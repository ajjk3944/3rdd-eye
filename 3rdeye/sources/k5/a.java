package K5;

import G5.l;
import I5.i;
import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3149a;

    /* renamed from: b, reason: collision with root package name */
    public O5.b f3150b;

    /* renamed from: c, reason: collision with root package name */
    public G5.a f3151c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0055a f3152d;

    /* renamed from: e, reason: collision with root package name */
    public long f3153e;

    /* renamed from: K5.a$a, reason: collision with other inner class name */
    public enum EnumC0055a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public a(String str) {
        d();
        this.f3149a = str;
        this.f3150b = new O5.b(null);
    }

    public void a(l lVar, G5.d dVar) {
        b(lVar, dVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(G5.l r8, G5.d r9, org.json.JSONObject r10) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.a.b(G5.l, G5.d, org.json.JSONObject):void");
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        L5.a.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        i.f2509a.a(f(), "setLastActivity", jSONObject);
    }

    public final void d() {
        this.f3153e = System.nanoTime();
        this.f3152d = EnumC0055a.AD_STATE_IDLE;
    }

    public void e() {
        this.f3150b.clear();
    }

    public final WebView f() {
        return this.f3150b.get();
    }

    public void g() {
    }
}
