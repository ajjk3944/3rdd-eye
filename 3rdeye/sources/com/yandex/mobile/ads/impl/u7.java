package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2078B;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class u7 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f33959b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f33960c;

    /* renamed from: d, reason: collision with root package name */
    public static final u7 f33961d;

    /* renamed from: e, reason: collision with root package name */
    public static final u7 f33962e;

    /* renamed from: f, reason: collision with root package name */
    public static final u7 f33963f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ u7[] f33964g;

    public static final class a {
        private a() {
        }

        public static String a(String template, String resource) {
            kotlin.jvm.internal.l.f(template, "template");
            kotlin.jvm.internal.l.f(resource, "resource");
            return String.format(Locale.US, template, Arrays.copyOf(new Object[]{resource}, 1));
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        u7 u7Var = new u7(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f33961d = u7Var;
        u7 u7Var2 = new u7(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f33962e = u7Var2;
        u7 u7Var3 = new u7(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f33963f = u7Var3;
        u7[] u7VarArr = {u7Var, u7Var2, u7Var3};
        f33964g = u7VarArr;
        com.google.gson.internal.c.l(u7VarArr);
        f33959b = new a(0);
        f33960c = C2078B.p(new b9.l(a.a("values_dimen_%s", u7Var.name()), 48), new b9.l(a.a("values_dimen_%s_sw600dp", u7Var.name()), 56), new b9.l(a.a("values_dimen_%s", u7Var2.name()), 15), new b9.l(a.a("values_dimen_%s_sw600dp", u7Var2.name()), 17), new b9.l(a.a("values_dimen_%s", u7Var3.name()), 19), new b9.l(a.a("values_dimen_%s_sw600dp", u7Var3.name()), 23));
    }

    private u7(int i, String str) {
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) f33964g.clone();
    }

    public final int a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            a aVar = f33959b;
            String resourceId = b(context);
            aVar.getClass();
            kotlin.jvm.internal.l.f(resourceId, "resourceId");
            Integer num = f33960c.get(a.a("values_dimen_%s", resourceId));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            a aVar2 = f33959b;
            String resourceId2 = name();
            aVar2.getClass();
            kotlin.jvm.internal.l.f(resourceId2, "resourceId");
            Integer num2 = f33960c.get(a.a("values_dimen_%s", resourceId2));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public final String b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        StringBuilder sb = new StringBuilder(name());
        int iD = jh2.d(context);
        int iB = jh2.b(context);
        if (iD > iB) {
            iD = iB;
        }
        if (iD >= 600) {
            sb.append("_sw600dp");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name();
    }
}
