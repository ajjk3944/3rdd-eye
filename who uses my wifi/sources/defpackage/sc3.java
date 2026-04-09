package defpackage;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class sc3 {
    public final String a;
    public long c = System.nanoTime();
    public int d = 1;
    public dd3 b = new dd3(null);

    public sc3(String str) {
        this.a = str;
    }

    public void b() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.b.get();
    }

    public void d(xb3 xb3Var, uk1 uk1Var) {
        e(xb3Var, uk1Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.xb3 r10, defpackage.uk1 r11, org.json.JSONObject r12) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc3.e(xb3, uk1, org.json.JSONObject):void");
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        vc3.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        fr.q.s(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}
