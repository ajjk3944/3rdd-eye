package com.google.android.material.carousel;

import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f10184a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10185b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10186c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f10187d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f10188e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10189f;

    /* renamed from: g, reason: collision with root package name */
    public final float f10190g;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10191a;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            f10191a = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public c(b bVar, List list, List list2) {
        this.f10184a = bVar;
        this.f10185b = Collections.unmodifiableList(list);
        this.f10186c = Collections.unmodifiableList(list2);
        float f10 = ((b) list.get(list.size() - 1)).d().f10176a - bVar.d().f10176a;
        this.f10189f = f10;
        float f11 = bVar.k().f10176a - ((b) list2.get(list2.size() - 1)).k().f10176a;
        this.f10190g = f11;
        this.f10187d = m(f10, list, true);
        this.f10188e = m(f11, list2, false);
    }

    public static int b(b bVar, float f10) {
        for (int iJ = bVar.j(); iJ < bVar.h().size(); iJ++) {
            if (f10 == ((b.c) bVar.h().get(iJ)).f10178c) {
                return iJ;
            }
        }
        return bVar.h().size() - 1;
    }

    public static int c(b bVar) {
        for (int i10 = 0; i10 < bVar.h().size(); i10++) {
            if (!((b.c) bVar.h().get(i10)).f10180e) {
                return i10;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f10) {
        for (int iC = bVar.c() - 1; iC >= 0; iC--) {
            if (f10 == ((b.c) bVar.h().get(iC)).f10178c) {
                return iC;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.h().size() - 1; size >= 0; size--) {
            if (!((b.c) bVar.h().get(size)).f10180e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(r4.b bVar, b bVar2, float f10, float f11, float f12, CarouselStrategy.StrategyType strategyType) {
        return new c(bVar2, p(bVar, bVar2, f10, f11, strategyType), n(bVar, bVar2, f10, f12, strategyType));
    }

    public static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = (b) list.get(i11);
            b bVar2 = (b) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.d().f10176a - bVar.d().f10176a : bVar.k().f10176a - bVar2.k().f10176a) / f10);
            i10++;
        }
        return fArr;
    }

    public static List n(r4.b bVar, b bVar2, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iE = e(bVar2);
        int iA = bVar.d() ? bVar.a() : bVar.b();
        if (!r(bVar, bVar2) && iE != -1) {
            int iJ = iE - bVar2.j();
            float f12 = bVar2.d().f10177b - (bVar2.d().f10179d / 2.0f);
            if (iJ <= 0 && bVar2.i().f10181f > 0.0f) {
                arrayList.add(x(bVar2, (f12 - bVar2.i().f10181f) - f11, iA));
                return arrayList;
            }
            float f13 = 0.0f;
            int i10 = 0;
            while (i10 < iJ) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i11 = iE - i10;
                float f14 = f13 + ((b.c) bVar2.h().get(i11)).f10181f;
                int i12 = i11 + 1;
                int i13 = iA;
                b bVarT = t(bVar3, iE, i12 < bVar2.h().size() ? d(bVar3, ((b.c) bVar2.h().get(i12)).f10178c) + 1 : 0, f12 - f14, bVar2.c() + i10 + 1, bVar2.j() + i10 + 1, i13);
                if (i10 == iJ - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, i13, false, f10, strategyType);
                    i13 = i13;
                }
                arrayList.add(bVarT);
                i10++;
                iA = i13;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, iA, false, f10, strategyType));
        }
        return arrayList;
    }

    public static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{k4.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List p(r4.b bVar, b bVar2, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iC = c(bVar2);
        int iA = bVar.d() ? bVar.a() : bVar.b();
        if (!q(bVar2) && iC != -1) {
            int iC2 = bVar2.c() - iC;
            float f12 = bVar2.d().f10177b - (bVar2.d().f10179d / 2.0f);
            if (iC2 <= 0 && bVar2.b().f10181f > 0.0f) {
                arrayList.add(x(bVar2, f12 + bVar2.b().f10181f + f11, iA));
                return arrayList;
            }
            float f13 = 0.0f;
            for (int i10 = 0; i10 < iC2; i10++) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = bVar2.h().size() - 1;
                f13 += ((b.c) bVar2.h().get(i11)).f10181f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(bVar3, ((b.c) bVar2.h().get(i12)).f10178c) - 1;
                }
                int i13 = iA;
                b bVarT = t(bVar3, iC, size, f12 + f13, (bVar2.c() - i10) - 1, (bVar2.j() - i10) - 1, i13);
                iA = i13;
                if (i10 == iC2 - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, iA, true, f10, strategyType);
                }
                arrayList.add(bVarT);
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, iA, true, f10, strategyType));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.b().f10177b - (bVar.b().f10179d / 2.0f) >= 0.0f && bVar.b() == bVar.e();
    }

    public static boolean r(r4.b bVar, b bVar2) {
        int iB = bVar.b();
        if (bVar.d()) {
            iB = bVar.a();
        }
        return bVar2.i().f10177b + (bVar2.i().f10179d / 2.0f) <= ((float) iB) && bVar2.i() == bVar2.l();
    }

    public static b s(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return b.o((b) list.get((int) fArrO[1]), (b) list.get((int) fArrO[2]), fArrO[0]);
    }

    public static b t(b bVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(bVar.h());
        arrayList.add(i11, (b.c) arrayList.remove(i10));
        b.C0204b c0204b = new b.C0204b(bVar.g(), i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i15);
            float f11 = cVar.f10179d;
            c0204b.e(f10 + (f11 / 2.0f), cVar.f10178c, f11, i15 >= i12 && i15 <= i13, cVar.f10180e, cVar.f10181f);
            f10 += cVar.f10179d;
            i15++;
        }
        return c0204b.i();
    }

    public static b u(b bVar, float f10, int i10, boolean z10, float f11, CarouselStrategy.StrategyType strategyType) {
        return a.f10191a[strategyType.ordinal()] != 1 ? w(bVar, f10, i10, z10) : v(bVar, f10, i10, z10, f11);
    }

    public static b v(b bVar, float f10, int i10, boolean z10, float f11) {
        ArrayList arrayList = new ArrayList(bVar.h());
        b.C0204b c0204b = new b.C0204b(bVar.g(), i10);
        float fM = f10 / bVar.m();
        float f12 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i11);
            if (cVar.f10180e) {
                c0204b.e(cVar.f10177b, cVar.f10178c, cVar.f10179d, false, true, cVar.f10181f);
            } else {
                boolean z11 = i11 >= bVar.c() && i11 <= bVar.j();
                float f13 = cVar.f10179d - fM;
                float fB = CarouselStrategy.b(f13, bVar.g(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float fAbs = Math.abs(f14 - cVar.f10177b);
                c0204b.f(f14, fB, f13, z11, false, cVar.f10181f, z10 ? fAbs : 0.0f, z10 ? 0.0f : fAbs);
                f12 += f13;
            }
            i11++;
        }
        return c0204b.i();
    }

    public static b w(b bVar, float f10, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(bVar.h());
        b.C0204b c0204b = new b.C0204b(bVar.g(), i10);
        boolean z11 = true;
        int size = z10 ? 0 : arrayList.size() - 1;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i11);
            if (cVar.f10180e && i11 == size) {
                c0204b.e(cVar.f10177b, cVar.f10178c, cVar.f10179d, false, true, cVar.f10181f);
            } else {
                float f11 = cVar.f10177b;
                float f12 = z10 ? f11 + f10 : f11 - f10;
                float f13 = z10 ? f10 : 0.0f;
                float f14 = z10 ? 0.0f : f10;
                boolean z12 = (i11 < bVar.c() || i11 > bVar.j()) ? false : z11;
                float f15 = f12;
                float f16 = cVar.f10178c;
                float f17 = cVar.f10179d;
                c0204b.f(f15, f16, f17, z12, cVar.f10180e, Math.abs(z10 ? Math.max(0.0f, ((f17 / 2.0f) + f15) - i10) : Math.min(0.0f, f15 - (f17 / 2.0f))), f13, f14);
            }
            i11++;
            z11 = true;
        }
        return c0204b.i();
    }

    public static b x(b bVar, float f10, int i10) {
        return t(bVar, 0, 0, f10, bVar.c(), bVar.j(), i10);
    }

    public final b a(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? (b) list.get((int) fArrO[2]) : (b) list.get((int) fArrO[1]);
    }

    public b g() {
        return this.f10184a;
    }

    public b h() {
        return (b) this.f10186c.get(r0.size() - 1);
    }

    public Map i(int i10, int i11, int i12, boolean z10) {
        float fG = this.f10184a.g();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * fG * (z10 ? -1 : 1) > i12 - this.f10190g || i13 >= i10 - this.f10186c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f10186c;
                map.put(numValueOf, (b) list.get(m0.a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * fG * (z10 ? -1 : 1) < i11 + this.f10189f || i17 < this.f10185b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f10185b;
                map.put(numValueOf2, (b) list2.get(m0.a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public b j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    public b k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f10189f + f11;
        float f14 = f12 - this.f10190g;
        float f15 = l().b().f10182g;
        float f16 = h().b().f10183h;
        if (this.f10189f == f15) {
            f13 += f15;
        }
        if (this.f10190g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = k4.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f10185b;
            fArr = this.f10187d;
        } else {
            if (f10 <= f14) {
                return this.f10184a;
            }
            fB = k4.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f10186c;
            fArr = this.f10188e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    public b l() {
        return (b) this.f10185b.get(r0.size() - 1);
    }
}
