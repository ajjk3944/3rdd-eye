package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;

/* loaded from: classes3.dex */
public final class kf2 {

    /* renamed from: a, reason: collision with root package name */
    private final uy1 f29650a;

    /* renamed from: b, reason: collision with root package name */
    private final uy1 f29651b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f29652b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f29653c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f29654d;

        static {
            a aVar = new a(0, "LEFT_TOP");
            f29652b = aVar;
            a aVar2 = new a(1, "CENTER");
            f29653c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f29654d = aVarArr;
            com.google.gson.internal.c.l(aVarArr);
        }

        private a(int i, String str) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f29654d.clone();
        }
    }

    public kf2(uy1 viewSize, uy1 videoSize) {
        kotlin.jvm.internal.l.f(viewSize, "viewSize");
        kotlin.jvm.internal.l.f(videoSize, "videoSize");
        this.f29650a = viewSize;
        this.f29651b = videoSize;
    }

    private final Matrix a(float f10, float f11, a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new b9.j();
        }
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, this.f29650a.b() / 2.0f, this.f29650a.a() / 2.0f);
        return matrix2;
    }

    public final Matrix a(lf2 videoScaleType) {
        kotlin.jvm.internal.l.f(videoScaleType, "videoScaleType");
        uy1 uy1Var = this.f29651b;
        if (uy1Var.b() <= 0 || uy1Var.a() <= 0) {
            return null;
        }
        uy1 uy1Var2 = this.f29650a;
        if (uy1Var2.b() <= 0 || uy1Var2.a() <= 0) {
            return null;
        }
        int iOrdinal = videoScaleType.ordinal();
        if (iOrdinal == 0) {
            return a(1.0f, 1.0f, a.f29652b);
        }
        if (iOrdinal == 1) {
            float fB = this.f29650a.b() / this.f29651b.b();
            float fA = this.f29650a.a() / this.f29651b.a();
            float fMin = Math.min(fB, fA);
            return a(fMin / fB, fMin / fA, a.f29653c);
        }
        if (iOrdinal == 2) {
            float fB2 = this.f29650a.b() / this.f29651b.b();
            float fA2 = this.f29650a.a() / this.f29651b.a();
            float fMax = Math.max(fB2, fA2);
            return a(fMax / fB2, fMax / fA2, a.f29653c);
        }
        throw new b9.j();
    }
}
