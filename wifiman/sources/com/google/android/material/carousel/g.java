package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f37235a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37236b;

    /* renamed from: c, reason: collision with root package name */
    private final List f37237c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f37238d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f37239e;

    /* renamed from: f, reason: collision with root package name */
    private final float f37240f;

    /* renamed from: g, reason: collision with root package name */
    private final float f37241g;

    private g(f fVar, List list, List list2) {
        this.f37235a = fVar;
        this.f37236b = Collections.unmodifiableList(list);
        this.f37237c = Collections.unmodifiableList(list2);
        float f10 = ((f) list.get(list.size() - 1)).c().f37227a - fVar.c().f37227a;
        this.f37240f = f10;
        float f11 = fVar.j().f37227a - ((f) list2.get(list2.size() - 1)).j().f37227a;
        this.f37241g = f11;
        this.f37238d = m(f10, list, true);
        this.f37239e = m(f11, list2, false);
    }

    private f a(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? (f) list.get((int) fArrO[2]) : (f) list.get((int) fArrO[1]);
    }

    private static int b(f fVar, float f10) {
        for (int i10 = fVar.i(); i10 < fVar.g().size(); i10++) {
            if (f10 == ((f.c) fVar.g().get(i10)).f37229c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!((f.c) fVar.g().get(i10)).f37231e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f10) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f10 == ((f.c) fVar.g().get(iB)).f37229c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((f.c) fVar.g().get(size)).f37231e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f10, float f11, float f12) {
        return new g(fVar, p(bVar, fVar, f10, f11), n(bVar, fVar, f10, f12));
    }

    private static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            f fVar = (f) list.get(i11);
            f fVar2 = (f) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? fVar2.c().f37227a - fVar.c().f37227a : fVar.j().f37227a - fVar2.j().f37227a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fK = bVar.j() ? bVar.k() : bVar.l();
        if (r(bVar, fVar) || iE == -1) {
            if (f11 > 0.0f) {
                arrayList.add(u(fVar, f11, fK, false, f10));
            }
            return arrayList;
        }
        int i10 = iE - fVar.i();
        float f12 = fVar.c().f37228b - (fVar.c().f37230d / 2.0f);
        if (i10 <= 0 && fVar.h().f37232f > 0.0f) {
            arrayList.add(v(fVar, f12 - fVar.h().f37232f, fK));
            return arrayList;
        }
        float f13 = 0.0f;
        int i11 = 0;
        while (i11 < i10) {
            f fVar2 = (f) arrayList.get(arrayList.size() - 1);
            int i12 = iE - i11;
            float f14 = f13 + ((f.c) fVar.g().get(i12)).f37232f;
            int i13 = i12 + 1;
            int i14 = i11;
            f fVarT = t(fVar2, iE, i13 < fVar.g().size() ? d(fVar2, ((f.c) fVar.g().get(i13)).f37229c) + 1 : 0, f12 - f14, fVar.b() + i11 + 1, fVar.i() + i11 + 1, fK);
            if (i14 == i10 - 1 && f11 > 0.0f) {
                fVarT = u(fVarT, f11, fK, false, f10);
            }
            arrayList.add(fVarT);
            i11 = i14 + 1;
            f13 = f14;
        }
        return arrayList;
    }

    private static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{P3.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b bVar, f fVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fK = bVar.j() ? bVar.k() : bVar.l();
        int i10 = 1;
        if (q(fVar) || iC == -1) {
            if (f11 > 0.0f) {
                arrayList.add(u(fVar, f11, fK, true, f10));
            }
            return arrayList;
        }
        int iB = fVar.b() - iC;
        float f12 = fVar.c().f37228b - (fVar.c().f37230d / 2.0f);
        if (iB <= 0 && fVar.a().f37232f > 0.0f) {
            arrayList.add(v(fVar, f12 + fVar.a().f37232f, fK));
            return arrayList;
        }
        int i11 = 0;
        float f13 = 0.0f;
        while (i11 < iB) {
            f fVar2 = (f) arrayList.get(arrayList.size() - i10);
            int i12 = iC + i11;
            int size = fVar.g().size() - i10;
            float f14 = f13 + ((f.c) fVar.g().get(i12)).f37232f;
            int i13 = i12 - i10;
            int iB2 = i13 >= 0 ? b(fVar2, ((f.c) fVar.g().get(i13)).f37229c) - i10 : size;
            int i14 = i11;
            f fVarT = t(fVar2, iC, iB2, f12 + f14, (fVar.b() - i11) - 1, (fVar.i() - i11) - 1, fK);
            if (i14 == iB - 1 && f11 > 0.0f) {
                fVarT = u(fVarT, f11, fK, true, f10);
            }
            arrayList.add(fVarT);
            i11 = i14 + 1;
            f13 = f14;
            i10 = 1;
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f37228b - (fVar.a().f37230d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int iL = bVar.l();
        if (bVar.j()) {
            iL = bVar.k();
        }
        return fVar.h().f37228b + (fVar.h().f37230d / 2.0f) <= ((float) iL) && fVar.h() == fVar.k();
    }

    private static f s(List list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return f.m((f) list.get((int) fArrO[1]), (f) list.get((int) fArrO[2]), fArrO[0]);
    }

    private static f t(f fVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i11, (f.c) arrayList.remove(i10));
        f.b bVar = new f.b(fVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i14);
            float f12 = cVar.f37230d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f37229c, f12, i14 >= i12 && i14 <= i13, cVar.f37231e, cVar.f37232f);
            f10 += cVar.f37230d;
            i14++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f11);
        float fL = f10 / fVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i10);
            if (cVar.f37231e) {
                bVar.e(cVar.f37228b, cVar.f37229c, cVar.f37230d, false, true, cVar.f37232f);
            } else {
                boolean z11 = i10 >= fVar.b() && i10 <= fVar.i();
                float f14 = cVar.f37230d - fL;
                float fB = d.b(f14, fVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f37228b;
                bVar.f(f15, fB, f14, z11, false, cVar.f37232f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f10, float f11) {
        return t(fVar, 0, 0, f10, fVar.b(), fVar.i(), f11);
    }

    f g() {
        return this.f37235a;
    }

    f h() {
        return (f) this.f37237c.get(r0.size() - 1);
    }

    Map i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f37235a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f37241g || i13 >= i10 - this.f37237c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List list = this.f37237c;
                map.put(numValueOf, (f) list.get(AbstractC8707a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f37240f || i17 < this.f37236b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List list2 = this.f37236b;
                map.put(numValueOf2, (f) list2.get(AbstractC8707a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public f j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    f k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List list;
        float[] fArr;
        float f13 = this.f37240f + f11;
        float f14 = f12 - this.f37241g;
        float f15 = l().a().f37233g;
        float f16 = h().h().f37234h;
        if (this.f37240f == f15) {
            f13 += f15;
        }
        if (this.f37241g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = P3.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f37236b;
            fArr = this.f37238d;
        } else {
            if (f10 <= f14) {
                return this.f37235a;
            }
            fB = P3.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f37237c;
            fArr = this.f37239e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        return (f) this.f37236b.get(r0.size() - 1);
    }
}
