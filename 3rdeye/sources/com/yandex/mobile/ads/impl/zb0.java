package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class zb0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f36391f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f36392g = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f36393b;

        /* renamed from: c, reason: collision with root package name */
        private final int f36394c;

        /* renamed from: d, reason: collision with root package name */
        private final int f36395d;

        /* renamed from: e, reason: collision with root package name */
        private final int f36396e;

        static {
            a[] aVarArr = {new a(R.font.monetization_ads_internal_font_light, R.font.monetization_ads_internal_font_regular, R.font.monetization_ads_internal_font_medium, R.font.monetization_ads_internal_font_bold)};
            f36391f = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, int i10, int i11, int i12) {
            this.f36393b = i;
            this.f36394c = i10;
            this.f36395d = i11;
            this.f36396e = i12;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36391f.clone();
        }

        public final int a() {
            return this.f36396e;
        }

        public final int b() {
            return this.f36393b;
        }

        public final int c() {
            return this.f36395d;
        }

        public final int d() {
            return this.f36394c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36397a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36397a = iArr;
        }
    }

    public static yb0 a(Context context) {
        Typeface typefaceB;
        Typeface typefaceB2;
        Typeface typefaceB3;
        Typeface typefaceB4;
        kotlin.jvm.internal.l.f(context, "context");
        du1 du1VarA = ew1.a.a().a(context);
        String strU = du1VarA != null ? du1VarA.u() : null;
        if (strU == null) {
            return null;
        }
        try {
            a aVarValueOf = a.valueOf(strU);
            if (b.f36397a[aVarValueOf.ordinal()] != 1) {
                throw new b9.j();
            }
            try {
                typefaceB = B0.g.b(context, aVarValueOf.b());
            } catch (Throwable unused) {
                typefaceB = null;
            }
            try {
                typefaceB2 = B0.g.b(context, aVarValueOf.d());
            } catch (Throwable unused2) {
                typefaceB2 = null;
            }
            try {
                typefaceB3 = B0.g.b(context, aVarValueOf.c());
            } catch (Throwable unused3) {
                typefaceB3 = null;
            }
            try {
                typefaceB4 = B0.g.b(context, aVarValueOf.a());
            } catch (Throwable unused4) {
                typefaceB4 = null;
            }
            return new yb0(typefaceB, typefaceB2, typefaceB3, typefaceB4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
