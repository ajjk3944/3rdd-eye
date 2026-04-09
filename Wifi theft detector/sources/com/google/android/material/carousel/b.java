package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f10161a;

    /* renamed from: b, reason: collision with root package name */
    public int f10162b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10166f;

    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0204b {

        /* renamed from: a, reason: collision with root package name */
        public final float f10167a;

        /* renamed from: b, reason: collision with root package name */
        public final int f10168b;

        /* renamed from: d, reason: collision with root package name */
        public c f10170d;

        /* renamed from: e, reason: collision with root package name */
        public c f10171e;

        /* renamed from: c, reason: collision with root package name */
        public final List f10169c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f10172f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f10173g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f10174h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f10175i = -1;

        public C0204b(float f10, int i10) {
            this.f10167a = f10;
            this.f10168b = i10;
        }

        public static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public C0204b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public C0204b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public C0204b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public C0204b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float fAbs;
            float f13 = f12 / 2.0f;
            float f14 = f10 - f13;
            float f15 = f13 + f10;
            int i10 = this.f10168b;
            if (f15 > i10) {
                fAbs = Math.abs(f15 - Math.max(f15 - f12, i10));
            } else {
                fAbs = 0.0f;
                if (f14 < 0.0f) {
                    fAbs = Math.abs(f14 - Math.min(f14 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, fAbs);
        }

        public C0204b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public C0204b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f10175i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f10175i = this.f10169c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f10170d == null) {
                    this.f10170d = cVar;
                    this.f10172f = this.f10169c.size();
                }
                if (this.f10173g != -1 && this.f10169c.size() - this.f10173g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f10170d.f10179d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f10171e = cVar;
                this.f10173g = this.f10169c.size();
            } else {
                if (this.f10170d == null && cVar.f10179d < this.f10174h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f10171e != null && cVar.f10179d > this.f10174h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f10174h = cVar.f10179d;
            this.f10169c.add(cVar);
            return this;
        }

        public C0204b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public C0204b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public b i() {
            if (this.f10170d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f10169c.size(); i10++) {
                c cVar = (c) this.f10169c.get(i10);
                arrayList.add(new c(j(this.f10170d.f10177b, this.f10167a, this.f10172f, i10), cVar.f10177b, cVar.f10178c, cVar.f10179d, cVar.f10180e, cVar.f10181f, cVar.f10182g, cVar.f10183h));
            }
            return new b(this.f10167a, arrayList, this.f10172f, this.f10173g, this.f10168b);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f10176a;

        /* renamed from: b, reason: collision with root package name */
        public final float f10177b;

        /* renamed from: c, reason: collision with root package name */
        public final float f10178c;

        /* renamed from: d, reason: collision with root package name */
        public final float f10179d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f10180e;

        /* renamed from: f, reason: collision with root package name */
        public final float f10181f;

        /* renamed from: g, reason: collision with root package name */
        public final float f10182g;

        /* renamed from: h, reason: collision with root package name */
        public final float f10183h;

        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f10) {
            return new c(k4.a.a(cVar.f10176a, cVar2.f10176a, f10), k4.a.a(cVar.f10177b, cVar2.f10177b, f10), k4.a.a(cVar.f10178c, cVar2.f10178c, f10), k4.a.a(cVar.f10179d, cVar2.f10179d, f10));
        }

        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f10176a = f10;
            this.f10177b = f11;
            this.f10178c = f12;
            this.f10179d = f13;
            this.f10180e = z10;
            this.f10181f = f14;
            this.f10182g = f15;
            this.f10183h = f16;
        }
    }

    public static b o(b bVar, b bVar2, float f10) {
        if (bVar.g() != bVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listH = bVar.h();
        List listH2 = bVar2.h();
        if (listH.size() != listH2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.h().size(); i10++) {
            arrayList.add(c.a((c) listH.get(i10), (c) listH2.get(i10), f10));
        }
        return new b(bVar.g(), arrayList, k4.a.c(bVar.c(), bVar2.c(), f10), k4.a.c(bVar.j(), bVar2.j(), f10), bVar.f10166f);
    }

    public static b p(b bVar, int i10) {
        C0204b c0204b = new C0204b(bVar.g(), i10);
        float f10 = (i10 - bVar.k().f10177b) - (bVar.k().f10179d / 2.0f);
        int size = bVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) bVar.h().get(size);
            c0204b.d((cVar.f10179d / 2.0f) + f10, cVar.f10178c, cVar.f10179d, size >= bVar.c() && size <= bVar.j(), cVar.f10180e);
            f10 += cVar.f10179d;
            size--;
        }
        return c0204b.i();
    }

    public int a() {
        return this.f10166f;
    }

    public c b() {
        return (c) this.f10163c.get(this.f10164d);
    }

    public int c() {
        return this.f10164d;
    }

    public c d() {
        return (c) this.f10163c.get(0);
    }

    public c e() {
        for (int i10 = 0; i10 < this.f10163c.size(); i10++) {
            c cVar = (c) this.f10163c.get(i10);
            if (!cVar.f10180e) {
                return cVar;
            }
        }
        return null;
    }

    public List f() {
        return this.f10163c.subList(this.f10164d, this.f10165e + 1);
    }

    public float g() {
        return this.f10161a;
    }

    public List h() {
        return this.f10163c;
    }

    public c i() {
        return (c) this.f10163c.get(this.f10165e);
    }

    public int j() {
        return this.f10165e;
    }

    public c k() {
        return (c) this.f10163c.get(r0.size() - 1);
    }

    public c l() {
        for (int size = this.f10163c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f10163c.get(size);
            if (!cVar.f10180e) {
                return cVar;
            }
        }
        return null;
    }

    public int m() {
        Iterator it = this.f10163c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f10180e) {
                i10++;
            }
        }
        return this.f10163c.size() - i10;
    }

    public int n() {
        return this.f10162b;
    }

    public b(float f10, List list, int i10, int i11, int i12) {
        this.f10161a = f10;
        this.f10163c = Collections.unmodifiableList(list);
        this.f10164d = i10;
        this.f10165e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f10181f == 0.0f) {
                this.f10162b++;
            }
            i10++;
        }
        this.f10166f = i12;
    }
}
