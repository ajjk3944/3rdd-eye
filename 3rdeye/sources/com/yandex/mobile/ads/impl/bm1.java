package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class bm1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f25325a;

    /* renamed from: b, reason: collision with root package name */
    public final a f25326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25327c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25328d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final b[] f25329a;

        public a(b... bVarArr) {
            this.f25329a = bVarArr;
        }

        public final b a() {
            return this.f25329a[0];
        }

        public final int b() {
            return this.f25329a.length;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f25330a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25331b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f25332c;

        /* renamed from: d, reason: collision with root package name */
        public final float[] f25333d;

        public b(int i, float[] fArr, float[] fArr2, int i10) {
            this.f25330a = i;
            zf.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f25332c = fArr;
            this.f25333d = fArr2;
            this.f25331b = i10;
        }

        public final int a() {
            return this.f25332c.length / 3;
        }
    }

    public bm1(a aVar, a aVar2, int i) {
        this.f25325a = aVar;
        this.f25326b = aVar2;
        this.f25327c = i;
        this.f25328d = aVar == aVar2;
    }
}
