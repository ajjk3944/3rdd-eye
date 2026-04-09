package com.applovin.impl;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f5034a = new a("Age Restricted User", z4.f6324r);

    /* renamed from: b, reason: collision with root package name */
    private static final a f5035b = new a("Has User Consent", z4.f6323q);

    /* renamed from: c, reason: collision with root package name */
    private static final a f5036c = new a("\"Do Not Sell\"", z4.f6325s);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5037a;

        /* renamed from: b, reason: collision with root package name */
        private final z4 f5038b;

        public a(String str, z4 z4Var) {
            this.f5037a = str;
            this.f5038b = z4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f5038b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f5038b);
            return null;
        }

        public String a() {
            return this.f5037a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f5036c;
    }

    public static a b() {
        return f5035b;
    }

    public static a c() {
        return f5034a;
    }

    public static boolean a(boolean z3, Context context) {
        return a(z4.f6325s, Boolean.valueOf(z3), context);
    }

    public static boolean b(boolean z3, Context context) {
        return a(z4.f6323q, Boolean.valueOf(z3), context);
    }

    public static String a(Context context) {
        return a(f5035b, context) + a(f5036c, context);
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
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
            if (kVar != null) {
                kVar.D().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f5037a + " - " + aVar.a(context);
    }
}
