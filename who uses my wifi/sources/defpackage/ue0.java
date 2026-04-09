package defpackage;

import android.text.TextUtils;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ue0 implements tz2 {
    public final String f;
    public final int g;
    public String h;
    public int i;
    public final Object j;
    public final Serializable k;

    public /* synthetic */ ue0(int i, int i2, WebView webView, String str, String str2, String str3) {
        this.f = str;
        this.g = i;
        this.h = str2;
        this.j = webView;
        this.k = str3;
        this.i = i2;
    }

    @Override // defpackage.tz2, defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        String str = this.h;
        WebView webView = (WebView) this.j;
        String str2 = (String) this.k;
        int i = this.i;
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        String str3 = this.f;
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        of0 of0Var = new of0("Google", str3);
        dc3 dc3VarN = su2.n("javascript");
        int i2 = this.g;
        yb3 yb3VarQ = su2.q(ga1.c(i2));
        dc3 dc3Var = dc3.i;
        if (dc3VarN == dc3Var) {
            gi2.i0("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (yb3VarQ == null) {
            gi2.i0("Omid html session error; Unable to parse creative type: ".concat(ga1.s(i2)));
            return null;
        }
        dc3 dc3VarN2 = su2.n(str);
        if (yb3VarQ == yb3.j && dc3VarN2 == dc3Var) {
            gi2.i0("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str)));
            return null;
        }
        uk1 uk1Var = new uk1(of0Var, webView, str2, "", wb3.g);
        de3 de3VarB = de3.b(yb3VarQ, su2.o(ga1.d(i)), dc3VarN, dc3VarN2, true);
        if (m54.f.g) {
            return new xz2(new xb3(de3VarB, uk1Var, UUID.randomUUID().toString()), uk1Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public void b(String str, int i) {
        d(i);
        String strF = f(str);
        ((HashMap) this.j).put(strF, Integer.valueOf(i));
        ((HashMap) this.k).put(Integer.valueOf(i), strF);
    }

    public void c(String str, int i) {
        d(i);
        ((HashMap) this.j).put(f(str), Integer.valueOf(i));
    }

    public void d(int i) {
        if (i < 0 || i > this.i) {
            throw new IllegalArgumentException(this.f + " " + i + " is out of range");
        }
    }

    public String e(int i) {
        d(i);
        String str = (String) ((HashMap) this.k).get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(i);
        return this.h != null ? ex0.k(new StringBuilder(), this.h, string) : string;
    }

    public String f(String str) {
        int i = this.g;
        return i == 2 ? str.toUpperCase() : i == 3 ? str.toLowerCase() : str;
    }

    public void g(String str) {
        this.h = f(str);
    }

    public ue0(String str, int i) {
        this.f = str;
        this.g = i;
        this.j = new HashMap();
        this.k = new HashMap();
        this.i = Integer.MAX_VALUE;
    }
}
