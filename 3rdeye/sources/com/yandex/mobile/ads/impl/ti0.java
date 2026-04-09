package com.yandex.mobile.ads.impl;

import N7.G8;
import android.content.Context;

/* loaded from: classes3.dex */
public abstract class ti0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f33621a;

    public static final class a extends ti0 {
        public a(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final float a(float f10) {
            if (f10 < 10.0f) {
                return 10.0f;
            }
            return f10;
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final d a(Context context, int i, int i10, int i11) {
            kotlin.jvm.internal.l.f(context, "context");
            int iA = jh2.a(context, a());
            if (iA <= i) {
                i = iA;
            }
            return new d(i, com.google.gson.internal.c.y(i11 * (i / i10)));
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f33622a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33623b;

        public d(int i, int i10) {
            this.f33622a = i;
            this.f33623b = i10;
        }

        public final int a() {
            return this.f33623b;
        }

        public final int b() {
            return this.f33622a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f33622a == dVar.f33622a && this.f33623b == dVar.f33623b;
        }

        public final int hashCode() {
            return this.f33623b + (this.f33622a * 31);
        }

        public final String toString() {
            return G8.r("Size(width=", this.f33622a, ", height=", this.f33623b, ")");
        }
    }

    public ti0(float f10) {
        this.f33621a = a(f10);
    }

    public final float a() {
        return this.f33621a;
    }

    public abstract float a(float f10);

    public abstract d a(Context context, int i, int i10, int i11);

    public static final class b extends ti0 {
        public b(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final d a(Context context, int i, int i10, int i11) {
            kotlin.jvm.internal.l.f(context, "context");
            int iY = com.google.gson.internal.c.y(a() * i);
            return new d(iY, com.google.gson.internal.c.y(i11 * (iY / i10)));
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final float a(float f10) {
            return v9.h.K(f10, 0.01f, 1.0f);
        }
    }

    public static final class c extends ti0 {
        public c(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final d a(Context context, int i, int i10, int i11) {
            kotlin.jvm.internal.l.f(context, "context");
            int iA = jh2.a(context, 140);
            int iY = com.google.gson.internal.c.y(a() * i);
            if (i10 > iY) {
                i11 = com.google.gson.internal.c.y(i11 / (i10 / iY));
                i10 = iY;
            }
            if (i11 > iA) {
                i10 = com.google.gson.internal.c.y(i10 / (i11 / iA));
            } else {
                iA = i11;
            }
            return new d(i10, iA);
        }

        @Override // com.yandex.mobile.ads.impl.ti0
        public final float a(float f10) {
            return v9.h.K(f10, 0.01f, 1.0f);
        }
    }
}
