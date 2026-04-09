package com.applovin.impl;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7212a = new a("Age Restricted User", z4.f8791r);

    /* renamed from: b, reason: collision with root package name */
    private static final a f7213b = new a("Has User Consent", z4.f8790q);

    /* renamed from: c, reason: collision with root package name */
    private static final a f7214c = new a("\"Do Not Sell\"", z4.f8792s);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7215a;

        /* renamed from: b, reason: collision with root package name */
        private final z4 f7216b;

        public a(String str, z4 z4Var) {
            this.f7215a = str;
            this.f7216b = z4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f7216b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f7216b);
            return null;
        }

        public String a() {
            return this.f7215a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f7214c;
    }

    public static a b() {
        return f7213b;
    }

    public static a c() {
        return f7212a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(z4.f8792s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(z4.f8790q, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f7213b, context) + a(f7214c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f7215a + " - " + aVar.a(context);
    }
}
