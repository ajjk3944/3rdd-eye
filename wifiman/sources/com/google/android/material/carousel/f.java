package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final float f37214a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37215b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37216c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37217d;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final float f37218a;

        /* renamed from: b, reason: collision with root package name */
        private final float f37219b;

        /* renamed from: d, reason: collision with root package name */
        private c f37221d;

        /* renamed from: e, reason: collision with root package name */
        private c f37222e;

        /* renamed from: c, reason: collision with root package name */
        private final List f37220c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private int f37223f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f37224g = -1;

        /* renamed from: h, reason: collision with root package name */
        private float f37225h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        private int f37226i = -1;

        b(float f10, float f11) {
            this.f37218a = f10;
            this.f37219b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            float f16 = this.f37219b;
            if (f15 > f16) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, f16));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f37226i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f37226i = this.f37220c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f37221d == null) {
                    this.f37221d = cVar;
                    this.f37223f = this.f37220c.size();
                }
                if (this.f37224g != -1 && this.f37220c.size() - this.f37224g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f37221d.f37230d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f37222e = cVar;
                this.f37224g = this.f37220c.size();
            } else {
                if (this.f37221d == null && cVar.f37230d < this.f37225h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f37222e != null && cVar.f37230d > this.f37225h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f37225h = cVar.f37230d;
            this.f37220c.add(cVar);
            return this;
        }

        b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        f i() {
            if (this.f37221d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f37220c.size(); i10++) {
                c cVar = (c) this.f37220c.get(i10);
                arrayList.add(new c(j(this.f37221d.f37228b, this.f37218a, this.f37223f, i10), cVar.f37228b, cVar.f37229c, cVar.f37230d, cVar.f37231e, cVar.f37232f, cVar.f37233g, cVar.f37234h));
            }
            return new f(this.f37218a, arrayList, this.f37223f, this.f37224g);
        }
    }

    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final float f37227a;

        /* renamed from: b, reason: collision with root package name */
        final float f37228b;

        /* renamed from: c, reason: collision with root package name */
        final float f37229c;

        /* renamed from: d, reason: collision with root package name */
        final float f37230d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f37231e;

        /* renamed from: f, reason: collision with root package name */
        final float f37232f;

        /* renamed from: g, reason: collision with root package name */
        final float f37233g;

        /* renamed from: h, reason: collision with root package name */
        final float f37234h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(P3.a.a(cVar.f37227a, cVar2.f37227a, f10), P3.a.a(cVar.f37228b, cVar2.f37228b, f10), P3.a.a(cVar.f37229c, cVar2.f37229c, f10), P3.a.a(cVar.f37230d, cVar2.f37230d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f37227a = f10;
            this.f37228b = f11;
            this.f37229c = f12;
            this.f37230d = f13;
            this.f37231e = z10;
            this.f37232f = f14;
            this.f37233g = f15;
            this.f37234h = f16;
        }
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listG = fVar.g();
        List listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            arrayList.add(c.a((c) listG.get(i10), (c) listG2.get(i10), f10));
        }
        return new f(fVar.f(), arrayList, P3.a.c(fVar.b(), fVar2.b(), f10), P3.a.c(fVar.i(), fVar2.i(), f10));
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f37228b) - (fVar.j().f37230d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d(f11 + (cVar.f37230d / 2.0f), cVar.f37229c, cVar.f37230d, size >= fVar.b() && size <= fVar.i(), cVar.f37231e);
            f11 += cVar.f37230d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return (c) this.f37215b.get(this.f37216c);
    }

    int b() {
        return this.f37216c;
    }

    c c() {
        return (c) this.f37215b.get(0);
    }

    c d() {
        for (int i10 = 0; i10 < this.f37215b.size(); i10++) {
            c cVar = (c) this.f37215b.get(i10);
            if (!cVar.f37231e) {
                return cVar;
            }
        }
        return null;
    }

    List e() {
        return this.f37215b.subList(this.f37216c, this.f37217d + 1);
    }

    float f() {
        return this.f37214a;
    }

    List g() {
        return this.f37215b;
    }

    c h() {
        return (c) this.f37215b.get(this.f37217d);
    }

    int i() {
        return this.f37217d;
    }

    c j() {
        return (c) this.f37215b.get(r0.size() - 1);
    }

    c k() {
        for (int size = this.f37215b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f37215b.get(size);
            if (!cVar.f37231e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator it = this.f37215b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f37231e) {
                i10++;
            }
        }
        return this.f37215b.size() - i10;
    }

    private f(float f10, List list, int i10, int i11) {
        this.f37214a = f10;
        this.f37215b = Collections.unmodifiableList(list);
        this.f37216c = i10;
        this.f37217d = i11;
    }
}
