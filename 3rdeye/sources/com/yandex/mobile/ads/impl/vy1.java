package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public interface vy1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f34738c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f34739d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f34740e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f34741f;

        /* renamed from: b, reason: collision with root package name */
        private final String f34742b;

        static {
            a aVar = new a(0, "FIXED", "fixed");
            f34738c = aVar;
            a aVar2 = new a(1, "FLEXIBLE", "flexible");
            f34739d = aVar2;
            a aVar3 = new a(2, "SCREEN", "screen");
            a aVar4 = new a(3, "STICKY", "sticky");
            f34740e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f34741f = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str, String str2) {
            this.f34742b = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34741f.clone();
        }

        public final String a() {
            return this.f34742b;
        }
    }

    int a(Context context);

    a a();

    int b(Context context);

    int c(Context context);

    int d(Context context);

    int getHeight();

    int getWidth();
}
