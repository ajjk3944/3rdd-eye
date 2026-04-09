package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;
import t2.C2911G;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819Xo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12492a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f12493b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f12494c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f12495d = new AtomicReference("");

    public C0819Xo(Context context, C2951a c2951a, C0623Mf c0623Mf) {
        this.f12492a = context;
        this.f12493b = c2951a;
        this.f12494c = c0623Mf;
    }

    public static final String c(String str) {
        return C2911G.J(new String(Base64.decode(str, 0)), new String(Base64.decode((String) C2841s.f23267e.f23270c.a(H9.Cf), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        E9 e9 = H9.yf;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (!((Boolean) g9.a(e9)).booleanValue() || ((String) g92.a(H9.Af)).isEmpty() || ((String) g92.a(H9.Bf)).isEmpty() || ((String) g92.a(H9.Cf)).isEmpty()) {
            return null;
        }
        String str = (String) this.f12495d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.f12494c.execute(new RunnableC0558Ii(12, this));
        return null;
    }

    public final String b() throws SecurityException {
        String name;
        C2951a c2951a = this.f12493b;
        String strC = null;
        if (c2951a.f23787d) {
            name = C1649oh.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) C2841s.f23267e.f23270c.a(H9.Af))).get(Integer.toString(c2951a.f23786c));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e6) {
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.zf)).booleanValue()) {
                    p2.j.f22785C.f22795h.f("SdkIE", e6);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) C2841s.f23267e.f23270c.a(H9.Bf));
        } catch (IllegalArgumentException e7) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.zf)).booleanValue()) {
                p2.j.f22785C.f22795h.f("SdkIE", e7);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.f12492a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }
}
