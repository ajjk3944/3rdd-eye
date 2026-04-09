package com.applovin.impl;

import android.content.Context;

/* renamed from: com.applovin.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2130l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f19675a = new a("Age Restricted User", n4.f20582p);

    /* renamed from: b, reason: collision with root package name */
    private static final a f19676b = new a("Has User Consent", n4.f20581o);

    /* renamed from: c, reason: collision with root package name */
    private static final a f19677c = new a("\"Do Not Sell\"", n4.f20583q);

    /* renamed from: com.applovin.impl.l0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f19678a;

        /* renamed from: b, reason: collision with root package name */
        private final n4 f19679b;

        public a(String str, n4 n4Var) {
            this.f19678a = str;
            this.f19679b = n4Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) o4.a(this.f19679b, (Object) null, context);
            }
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to get value for key: " + this.f19679b);
            return null;
        }

        public String a() {
            return this.f19678a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f19677c;
    }

    public static a b() {
        return f19676b;
    }

    public static a c() {
        return f19675a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(n4.f20583q, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(n4.f20581o, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f19676b, context) + a(f19677c, context);
    }

    private static boolean a(n4 n4Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Failed to update compliance value for key: " + n4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) o4.a(n4Var, (Object) null, context);
            o4.b(n4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f21161C0;
            if (kVar != null) {
                kVar.E().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f19678a + " - " + aVar.a(context);
    }
}
