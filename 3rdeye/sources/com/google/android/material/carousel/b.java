package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f22659a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C0340b> f22660b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22662d;

    /* compiled from: KeylineState.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f22663a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22664b;

        /* renamed from: d, reason: collision with root package name */
        public C0340b f22666d;

        /* renamed from: e, reason: collision with root package name */
        public C0340b f22667e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f22665c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f22668f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f22669g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f22670h = 0.0f;
        public int i = -1;

        public a(float f10, float f11) {
            this.f22663a = f10;
            this.f22664b = f11;
        }

        public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f22664b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            b(f10, f11, f12, z10, z11, fAbs, 0.0f, 0.0f);
        }

        public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return;
            }
            ArrayList arrayList = this.f22665c;
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = arrayList.size();
            }
            C0340b c0340b = new C0340b(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f22666d == null) {
                    this.f22666d = c0340b;
                    this.f22668f = arrayList.size();
                }
                if (this.f22669g != -1 && arrayList.size() - this.f22669g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f22666d.f22674d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f22667e = c0340b;
                this.f22669g = arrayList.size();
            } else {
                if (this.f22666d == null && f12 < this.f22670h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f22667e != null && f12 > this.f22670h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f22670h = f12;
            arrayList.add(c0340b);
        }

        public final void c(float f10, float f11, int i, boolean z10, float f12) {
            if (i <= 0 || f12 <= 0.0f) {
                return;
            }
            int i10 = 0;
            while (i10 < i) {
                float f13 = f11;
                boolean z11 = z10;
                float f14 = f12;
                a((i10 * f12) + f10, f13, f14, z11, false);
                i10++;
                f11 = f13;
                f12 = f14;
                z10 = z11;
            }
        }

        public final b d() {
            if (this.f22666d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.f22665c;
                int size = arrayList2.size();
                float f10 = this.f22663a;
                if (i >= size) {
                    return new b(f10, arrayList, this.f22668f, this.f22669g);
                }
                C0340b c0340b = (C0340b) arrayList2.get(i);
                arrayList.add(new C0340b((i * f10) + (this.f22666d.f22672b - (this.f22668f * f10)), c0340b.f22672b, c0340b.f22673c, c0340b.f22674d, c0340b.f22675e, c0340b.f22676f, c0340b.f22677g, c0340b.f22678h));
                i++;
            }
        }
    }

    /* compiled from: KeylineState.java */
    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0340b {

        /* renamed from: a, reason: collision with root package name */
        public final float f22671a;

        /* renamed from: b, reason: collision with root package name */
        public final float f22672b;

        /* renamed from: c, reason: collision with root package name */
        public final float f22673c;

        /* renamed from: d, reason: collision with root package name */
        public final float f22674d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22675e;

        /* renamed from: f, reason: collision with root package name */
        public final float f22676f;

        /* renamed from: g, reason: collision with root package name */
        public final float f22677g;

        /* renamed from: h, reason: collision with root package name */
        public final float f22678h;

        public C0340b(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f22671a = f10;
            this.f22672b = f11;
            this.f22673c = f12;
            this.f22674d = f13;
            this.f22675e = z10;
            this.f22676f = f14;
            this.f22677g = f15;
            this.f22678h = f16;
        }
    }

    public b(float f10, ArrayList arrayList, int i, int i10) {
        this.f22659a = f10;
        this.f22660b = Collections.unmodifiableList(arrayList);
        this.f22661c = i;
        this.f22662d = i10;
    }

    public final C0340b a() {
        return this.f22660b.get(this.f22661c);
    }

    public final C0340b b() {
        return this.f22660b.get(0);
    }

    public final C0340b c() {
        return this.f22660b.get(this.f22662d);
    }

    public final C0340b d() {
        return this.f22660b.get(r0.size() - 1);
    }
}
