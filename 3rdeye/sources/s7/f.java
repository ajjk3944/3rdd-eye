package s7;

import C6.r;
import N7.B8;
import b9.j;
import c9.C2092m;
import c9.C2095p;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import s7.AbstractC5584c;
import s7.InterfaceC5583b;
import t7.InterfaceC5610a;
import u7.InterfaceC5638c;

/* compiled from: IndicatorsStripDrawer.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f46140a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5638c f46141b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5610a f46142c;

    /* renamed from: d, reason: collision with root package name */
    public final i f46143d;

    /* renamed from: f, reason: collision with root package name */
    public int f46145f;

    /* renamed from: g, reason: collision with root package name */
    public int f46146g;

    /* renamed from: h, reason: collision with root package name */
    public float f46147h;
    public float i;

    /* renamed from: k, reason: collision with root package name */
    public int f46149k;

    /* renamed from: l, reason: collision with root package name */
    public int f46150l;

    /* renamed from: m, reason: collision with root package name */
    public int f46151m;

    /* renamed from: n, reason: collision with root package name */
    public float f46152n;

    /* renamed from: e, reason: collision with root package name */
    public final b f46144e = new b();

    /* renamed from: j, reason: collision with root package name */
    public float f46148j = 1.0f;

    /* compiled from: IndicatorsStripDrawer.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46153a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f46154b;

        /* renamed from: c, reason: collision with root package name */
        public final float f46155c;

        /* renamed from: d, reason: collision with root package name */
        public final AbstractC5584c f46156d;

        /* renamed from: e, reason: collision with root package name */
        public final float f46157e;

        public a(int i, boolean z10, float f10, AbstractC5584c itemSize, float f11) {
            l.f(itemSize, "itemSize");
            this.f46153a = i;
            this.f46154b = z10;
            this.f46155c = f10;
            this.f46156d = itemSize;
            this.f46157e = f11;
        }

        public static a a(a aVar, float f10, AbstractC5584c abstractC5584c, float f11, int i) {
            if ((i & 4) != 0) {
                f10 = aVar.f46155c;
            }
            float f12 = f10;
            if ((i & 8) != 0) {
                abstractC5584c = aVar.f46156d;
            }
            AbstractC5584c itemSize = abstractC5584c;
            if ((i & 16) != 0) {
                f11 = aVar.f46157e;
            }
            l.f(itemSize, "itemSize");
            return new a(aVar.f46153a, aVar.f46154b, f12, itemSize, f11);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f46153a == aVar.f46153a && this.f46154b == aVar.f46154b && Float.compare(this.f46155c, aVar.f46155c) == 0 && l.b(this.f46156d, aVar.f46156d) && Float.compare(this.f46157e, aVar.f46157e) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.f46153a * 31;
            boolean z10 = this.f46154b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return Float.floatToIntBits(this.f46157e) + ((this.f46156d.hashCode() + B8.g(this.f46155c, (i + i10) * 31, 31)) * 31);
        }

        public final String toString() {
            return "Indicator(position=" + this.f46153a + ", active=" + this.f46154b + ", centerOffset=" + this.f46155c + ", itemSize=" + this.f46156d + ", scaleFactor=" + this.f46157e + ')';
        }
    }

    /* compiled from: IndicatorsStripDrawer.kt */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f46158a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f46159b = new ArrayList();

        public b() {
        }
    }

    public f(e eVar, InterfaceC5638c interfaceC5638c, InterfaceC5610a interfaceC5610a, i iVar) {
        this.f46140a = eVar;
        this.f46141b = interfaceC5638c;
        this.f46142c = interfaceC5610a;
        this.f46143d = iVar;
        this.f46147h = eVar.f46137c.b().b();
    }

    public final void a(float f10, int i) {
        float f11;
        int i10;
        float f12;
        float fB;
        int iNextIndex;
        a aVar;
        int i11;
        float f13;
        b bVar = this.f46144e;
        ArrayList arrayList = bVar.f46158a;
        arrayList.clear();
        ArrayList arrayList2 = bVar.f46159b;
        arrayList2.clear();
        f fVar = f.this;
        int i12 = fVar.f46145f;
        if (i12 <= 0) {
            return;
        }
        i iVar = fVar.f46143d;
        v9.e eVarB = r.b(iVar, 0, i12);
        int i13 = eVarB.f47096b;
        v9.f it = eVarB.iterator();
        while (true) {
            f11 = 2.0f;
            i10 = 1;
            f12 = 1.0f;
            if (!it.f47101d) {
                break;
            }
            int iA = it.a();
            InterfaceC5610a interfaceC5610a = fVar.f46142c;
            AbstractC5584c abstractC5584cA = interfaceC5610a.a(iA);
            float f14 = fVar.f46148j;
            AbstractC5584c abstractC5584c = abstractC5584cA;
            if (f14 != 1.0f) {
                boolean z10 = abstractC5584cA instanceof AbstractC5584c.b;
                abstractC5584c = abstractC5584cA;
                if (z10) {
                    AbstractC5584c.b bVar2 = (AbstractC5584c.b) abstractC5584cA;
                    AbstractC5584c.b bVarC = AbstractC5584c.b.c(bVar2, bVar2.f46126a * f14, 0.0f, 6);
                    interfaceC5610a.f(bVarC.f46126a);
                    abstractC5584c = bVarC;
                }
            }
            AbstractC5584c abstractC5584c2 = abstractC5584c;
            arrayList.add(new a(iA, iA == i, iA == i13 ? abstractC5584c2.b() / 2.0f : ((a) C2097r.v0(arrayList)).f46155c + fVar.i, abstractC5584c2, 1.0f));
        }
        if (arrayList.size() <= fVar.f46146g) {
            a aVar2 = (a) C2097r.v0(arrayList);
            fB = (fVar.f46149k / 2.0f) - (((aVar2.f46156d.b() / 2.0f) + aVar2.f46155c) / 2);
        } else {
            float f15 = fVar.f46149k / 2.0f;
            if (r.d(iVar)) {
                fB = (fVar.i * f10) + (f15 - (i == -1 ? 0.0f : ((a) arrayList.get((arrayList.size() - 1) - i)).f46155c));
            } else {
                fB = (f15 - (i == -1 ? 0.0f : ((a) arrayList.get(i)).f46155c)) - (fVar.i * f10);
            }
            if (fVar.f46146g % 2 == 0) {
                fB += fVar.i / 2;
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a aVar3 = (a) it2.next();
            arrayList3.add(a.a(aVar3, aVar3.f46155c + fB, null, 0.0f, 27));
        }
        ArrayList arrayListI0 = C2097r.I0(arrayList3);
        if (arrayListI0.size() > fVar.f46146g) {
            v9.d dVar = new v9.d(fVar.f46149k);
            a aVar4 = (a) C2097r.p0(arrayListI0);
            if (dVar.a(Float.valueOf(aVar4.f46155c - (aVar4.f46156d.b() / 2.0f)))) {
                a aVar5 = (a) C2097r.p0(arrayListI0);
                float f16 = -(aVar5.f46155c - (aVar5.f46156d.b() / 2.0f));
                Iterator it3 = arrayListI0.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C2092m.a0();
                        throw null;
                    }
                    a aVar6 = (a) next;
                    arrayListI0.set(i14, a.a(aVar6, aVar6.f46155c + f16, null, 0.0f, 27));
                    i14 = i15;
                }
            } else {
                a aVar7 = (a) C2097r.v0(arrayListI0);
                if (dVar.a(Float.valueOf((aVar7.f46156d.b() / 2.0f) + aVar7.f46155c))) {
                    float f17 = fVar.f46149k;
                    a aVar8 = (a) C2097r.v0(arrayListI0);
                    float fB2 = f17 - ((aVar8.f46156d.b() / 2.0f) + aVar8.f46155c);
                    Iterator it4 = arrayListI0.iterator();
                    int i16 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            C2092m.a0();
                            throw null;
                        }
                        a aVar9 = (a) next2;
                        arrayListI0.set(i16, a.a(aVar9, aVar9.f46155c + fB2, null, 0.0f, 27));
                        i16 = i17;
                        f11 = f11;
                    }
                }
            }
            float f18 = f11;
            C2095p.f0(arrayListI0, new g(dVar));
            Iterator it5 = arrayListI0.iterator();
            int i18 = 0;
            while (it5.hasNext()) {
                Object next3 = it5.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    C2092m.a0();
                    throw null;
                }
                a aVarA = (a) next3;
                float f19 = aVarA.f46155c;
                float f20 = fVar.i + 0.0f;
                if (f19 > f20) {
                    float f21 = fVar.f46149k - f19;
                    f19 = f21 > f20 ? f20 : f21;
                }
                float fK = f19 > f20 ? f12 : v9.h.K(f19 / (f20 - 0.0f), 0.0f, f12);
                int i20 = aVarA.f46153a;
                if (i20 == 0 || i20 == fVar.f46145f - i10 || aVarA.f46154b) {
                    i11 = i10;
                    f13 = f12;
                    aVarA = a.a(aVarA, 0.0f, null, fK, 15);
                } else {
                    AbstractC5584c abstractC5584c3 = aVarA.f46156d;
                    float fB3 = abstractC5584c3.b() * fK;
                    i11 = i10;
                    d dVar2 = fVar.f46140a.f46138d;
                    f13 = f12;
                    if (fB3 <= dVar2.b().b()) {
                        aVarA = a.a(aVarA, 0.0f, dVar2.b(), fK, 7);
                    } else if (fB3 >= abstractC5584c3.b()) {
                        continue;
                    } else if (abstractC5584c3 instanceof AbstractC5584c.b) {
                        AbstractC5584c.b bVar3 = (AbstractC5584c.b) abstractC5584c3;
                        aVarA = a.a(aVarA, 0.0f, AbstractC5584c.b.c(bVar3, fB3, (fB3 / bVar3.f46126a) * bVar3.f46127b, 4), fK, 7);
                    } else {
                        if (!(abstractC5584c3 instanceof AbstractC5584c.a)) {
                            throw new j();
                        }
                        aVarA = a.a(aVarA, 0.0f, new AbstractC5584c.a((abstractC5584c3.b() * fK) / f18), fK, 7);
                    }
                }
                arrayListI0.set(i18, aVarA);
                i18 = i19;
                i10 = i11;
                f12 = f13;
            }
            float f22 = f12;
            Iterator it6 = arrayListI0.iterator();
            int i21 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i21 = -1;
                    break;
                } else if (((a) it6.next()).f46157e == f22) {
                    break;
                } else {
                    i21++;
                }
            }
            Integer numValueOf = Integer.valueOf(i21);
            if (i21 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                ListIterator listIterator = arrayListI0.listIterator(arrayListI0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (((a) listIterator.previous()).f46157e == f22) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numValueOf2 = Integer.valueOf(iNextIndex);
                if (iNextIndex < 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int i22 = iIntValue - 1;
                    int iIntValue2 = numValueOf2.intValue() + 1;
                    Iterator it7 = arrayListI0.iterator();
                    int i23 = 0;
                    while (it7.hasNext()) {
                        Object next4 = it7.next();
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            C2092m.a0();
                            throw null;
                        }
                        a aVar10 = (a) next4;
                        if (i23 < i22) {
                            a aVar11 = (a) C2097r.r0(i22, arrayListI0);
                            if (aVar11 != null) {
                                arrayListI0.set(i23, a.a(aVar10, aVar10.f46155c - (fVar.i * (f22 - aVar11.f46157e)), null, 0.0f, 27));
                                if (i23 <= iIntValue2) {
                                }
                            }
                        } else if (i23 <= iIntValue2 && (aVar = (a) C2097r.r0(iIntValue2, arrayListI0)) != null) {
                            arrayListI0.set(i23, a.a(aVar10, aVar10.f46155c + (fVar.i * (f22 - aVar.f46157e)), null, 0.0f, 27));
                        }
                        i23 = i24;
                    }
                }
            }
        }
        arrayList2.addAll(arrayListI0);
    }

    public final void b() {
        int i;
        InterfaceC5583b interfaceC5583b = this.f46140a.f46139e;
        if (interfaceC5583b instanceof InterfaceC5583b.a) {
            i = (int) (this.f46149k / ((InterfaceC5583b.a) interfaceC5583b).f46122a);
        } else {
            if (!(interfaceC5583b instanceof InterfaceC5583b.C0527b)) {
                throw new j();
            }
            i = ((InterfaceC5583b.C0527b) interfaceC5583b).f46124b;
        }
        int i10 = this.f46145f;
        if (i > i10) {
            i = i10;
        }
        this.f46146g = i;
    }

    public final void c(int i, int i10) {
        if (i == 0 || i10 == 0) {
            return;
        }
        this.f46149k = i;
        this.f46150l = i10;
        b();
        e eVar = this.f46140a;
        InterfaceC5583b interfaceC5583b = eVar.f46139e;
        if (interfaceC5583b instanceof InterfaceC5583b.a) {
            this.i = ((InterfaceC5583b.a) interfaceC5583b).f46122a;
            this.f46148j = 1.0f;
        } else if (interfaceC5583b instanceof InterfaceC5583b.C0527b) {
            float f10 = this.f46149k;
            float f11 = ((InterfaceC5583b.C0527b) interfaceC5583b).f46123a;
            float f12 = (f10 + f11) / this.f46146g;
            this.i = f12;
            this.f46148j = (f12 - f11) / eVar.f46136b.b().b();
        }
        this.f46142c.b(this.i);
        this.f46147h = i10 / 2.0f;
        a(this.f46152n, this.f46151m);
    }
}
