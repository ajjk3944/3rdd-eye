package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import g0.C4356c;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: Shimmer.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f22353a = new float[4];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f22354b = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public int f22355c;

    /* renamed from: d, reason: collision with root package name */
    public int f22356d;

    /* renamed from: e, reason: collision with root package name */
    public int f22357e;

    /* renamed from: f, reason: collision with root package name */
    public int f22358f;

    /* renamed from: g, reason: collision with root package name */
    public int f22359g;

    /* renamed from: h, reason: collision with root package name */
    public int f22360h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f22361j;

    /* renamed from: k, reason: collision with root package name */
    public float f22362k;

    /* renamed from: l, reason: collision with root package name */
    public float f22363l;

    /* renamed from: m, reason: collision with root package name */
    public float f22364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22365n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22366o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22367p;

    /* renamed from: q, reason: collision with root package name */
    public int f22368q;

    /* renamed from: r, reason: collision with root package name */
    public int f22369r;

    /* renamed from: s, reason: collision with root package name */
    public long f22370s;

    /* renamed from: t, reason: collision with root package name */
    public long f22371t;

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0330b<T extends AbstractC0330b<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final b f22372a = new b();

        public final b a() {
            b bVar = this.f22372a;
            int i = bVar.f22358f;
            int[] iArr = bVar.f22354b;
            if (i != 1) {
                int i10 = bVar.f22357e;
                iArr[0] = i10;
                int i11 = bVar.f22356d;
                iArr[1] = i11;
                iArr[2] = i11;
                iArr[3] = i10;
            } else {
                int i12 = bVar.f22356d;
                iArr[0] = i12;
                iArr[1] = i12;
                int i13 = bVar.f22357e;
                iArr[2] = i13;
                iArr[3] = i13;
            }
            float[] fArr = bVar.f22353a;
            if (i != 1) {
                fArr[0] = Math.max(((1.0f - bVar.f22362k) - bVar.f22363l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - bVar.f22362k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((bVar.f22362k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((bVar.f22362k + 1.0f) + bVar.f22363l) / 2.0f, 1.0f);
                return bVar;
            }
            fArr[0] = 0.0f;
            fArr[1] = Math.min(bVar.f22362k, 1.0f);
            fArr[2] = Math.min(bVar.f22362k + bVar.f22363l, 1.0f);
            fArr[3] = 1.0f;
            return bVar;
        }

        public T b(TypedArray typedArray) {
            boolean zHasValue = typedArray.hasValue(3);
            b bVar = this.f22372a;
            if (zHasValue) {
                bVar.f22365n = typedArray.getBoolean(3, bVar.f22365n);
            }
            if (typedArray.hasValue(0)) {
                bVar.f22366o = typedArray.getBoolean(0, bVar.f22366o);
            }
            if (typedArray.hasValue(1)) {
                bVar.f22357e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (bVar.f22357e & 16777215);
            }
            if (typedArray.hasValue(11)) {
                bVar.f22356d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (bVar.f22356d & 16777215);
            }
            if (typedArray.hasValue(7)) {
                long j4 = typedArray.getInt(7, (int) bVar.f22370s);
                if (j4 < 0) {
                    throw new IllegalArgumentException(Oo.d(j4, "Given a negative duration: "));
                }
                bVar.f22370s = j4;
            }
            if (typedArray.hasValue(14)) {
                bVar.f22368q = typedArray.getInt(14, bVar.f22368q);
            }
            if (typedArray.hasValue(15)) {
                long j10 = typedArray.getInt(15, (int) bVar.f22371t);
                if (j10 < 0) {
                    throw new IllegalArgumentException(Oo.d(j10, "Given a negative repeat delay: "));
                }
                bVar.f22371t = j10;
            }
            if (typedArray.hasValue(16)) {
                bVar.f22369r = typedArray.getInt(16, bVar.f22369r);
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, bVar.f22355c);
                if (i == 1) {
                    bVar.f22355c = 1;
                } else if (i == 2) {
                    bVar.f22355c = 2;
                } else if (i != 3) {
                    bVar.f22355c = 0;
                } else {
                    bVar.f22355c = 3;
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, bVar.f22358f) != 1) {
                    bVar.f22358f = 0;
                } else {
                    bVar.f22358f = 1;
                }
            }
            if (typedArray.hasValue(6)) {
                float f10 = typedArray.getFloat(6, bVar.f22363l);
                if (f10 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
                }
                bVar.f22363l = f10;
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, bVar.f22359g);
                if (dimensionPixelSize < 0) {
                    throw new IllegalArgumentException(C4356c.h(dimensionPixelSize, "Given invalid width: "));
                }
                bVar.f22359g = dimensionPixelSize;
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, bVar.f22360h);
                if (dimensionPixelSize2 < 0) {
                    throw new IllegalArgumentException(C4356c.h(dimensionPixelSize2, "Given invalid height: "));
                }
                bVar.f22360h = dimensionPixelSize2;
            }
            if (typedArray.hasValue(13)) {
                float f11 = typedArray.getFloat(13, bVar.f22362k);
                if (f11 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f11);
                }
                bVar.f22362k = f11;
            }
            if (typedArray.hasValue(19)) {
                float f12 = typedArray.getFloat(19, bVar.i);
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f12);
                }
                bVar.i = f12;
            }
            if (typedArray.hasValue(10)) {
                float f13 = typedArray.getFloat(10, bVar.f22361j);
                if (f13 < 0.0f) {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f13);
                }
                bVar.f22361j = f13;
            }
            if (typedArray.hasValue(18)) {
                bVar.f22364m = typedArray.getFloat(18, bVar.f22364m);
            }
            return (T) c();
        }

        public abstract T c();
    }

    public b() {
        new RectF();
        this.f22355c = 0;
        this.f22356d = -1;
        this.f22357e = 1291845631;
        this.f22358f = 0;
        this.f22359g = 0;
        this.f22360h = 0;
        this.i = 1.0f;
        this.f22361j = 1.0f;
        this.f22362k = 0.0f;
        this.f22363l = 0.5f;
        this.f22364m = 20.0f;
        this.f22365n = true;
        this.f22366o = true;
        this.f22367p = true;
        this.f22368q = -1;
        this.f22369r = 1;
        this.f22370s = 1000L;
    }

    /* compiled from: Shimmer.java */
    public static class a extends AbstractC0330b<a> {
        public a() {
            this.f22372a.f22367p = true;
        }

        @Override // com.facebook.shimmer.b.AbstractC0330b
        public final AbstractC0330b c() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    public static class c extends AbstractC0330b<c> {
        public c() {
            this.f22372a.f22367p = false;
        }

        @Override // com.facebook.shimmer.b.AbstractC0330b
        public final AbstractC0330b b(TypedArray typedArray) {
            super.b(typedArray);
            boolean zHasValue = typedArray.hasValue(2);
            b bVar = this.f22372a;
            if (zHasValue) {
                bVar.f22357e = (typedArray.getColor(2, bVar.f22357e) & 16777215) | (bVar.f22357e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                bVar.f22356d = typedArray.getColor(12, bVar.f22356d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.b.AbstractC0330b
        public final AbstractC0330b c() {
            return this;
        }
    }
}
