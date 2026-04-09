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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tf0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16805a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f16806b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16807c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f16808d = new AtomicReference("");

    public tf0(Context context, za.a aVar, ex exVar) {
        this.f16805a = context;
        this.f16806b = aVar;
        this.f16807c = exVar;
    }

    public static final String c(String str) {
        return ya.f0.J(new String(Base64.decode(str, 0)), new String(Base64.decode((String) va.s.f36163e.f36166c.a(sk.Ef), 10), StandardCharsets.UTF_8));
    }

    public final String a() {
        pk pkVar = sk.Af;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (!((Boolean) rkVar.a(pkVar)).booleanValue() || ((String) rkVar2.a(sk.Cf)).isEmpty() || ((String) rkVar2.a(sk.Df)).isEmpty() || ((String) rkVar2.a(sk.Ef)).isEmpty()) {
            return null;
        }
        String str = (String) this.f16808d.get();
        if (!str.isEmpty()) {
            return str;
        }
        this.f16807c.execute(new s30(11, this));
        return null;
    }

    public final String b() throws SecurityException {
        String name;
        za.a aVar = this.f16806b;
        String strC = null;
        if (aVar.f38132d) {
            name = i00.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) va.s.f36163e.f36166c.a(sk.Cf))).get(Integer.toString(aVar.f38131c));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e2) {
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Bf)).booleanValue()) {
                    ua.j.C.f35265h.f("SdkIE", e2);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) va.s.f36163e.f36166c.a(sk.Df));
        } catch (IllegalArgumentException e10) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Bf)).booleanValue()) {
                ua.j.C.f35265h.f("SdkIE", e10);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.f16805a.getClassLoader().loadClass(name).getDeclaredMethods()) {
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
