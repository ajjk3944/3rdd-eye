package A;

import B.M;
import T.InterfaceC3551q0;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import sh.C7972g;
import z.C8680c;

/* loaded from: classes.dex */
public abstract class r {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151a = new a();

        a() {
            super(1);
        }

        public final void a(t.a aVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f152a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f155d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, t tVar, boolean z10, InterfaceC3551q0 interfaceC3551q0) {
            super(1);
            this.f152a = list;
            this.f153b = tVar;
            this.f154c = z10;
            this.f155d = interfaceC3551q0;
        }

        public final void a(t.a aVar) {
            List list = this.f152a;
            t tVar = this.f153b;
            boolean z10 = this.f154c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                t tVar2 = (t) list.get(i10);
                if (tVar2 != tVar) {
                    tVar2.r(aVar, z10);
                }
            }
            t tVar3 = this.f153b;
            if (tVar3 != null) {
                tVar3.r(aVar, this.f154c);
            }
            M.a(this.f155d);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    private static final List a(List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C8680c.m mVar, C8680c.e eVar, boolean z11, Y0.d dVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12 && i14 != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset");
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z12) {
            int size = list2.size();
            int iF = i14;
            for (int i16 = 0; i16 < size; i16++) {
                t tVar = (t) list2.get(i16);
                iF -= tVar.f();
                tVar.s(iF, i10, i11);
                arrayList.add(tVar);
            }
            int size2 = list.size();
            int iF2 = i14;
            for (int i17 = 0; i17 < size2; i17++) {
                t tVar2 = (t) list.get(i17);
                tVar2.s(iF2, i10, i11);
                arrayList.add(tVar2);
                iF2 += tVar2.f();
            }
            int size3 = list3.size();
            for (int i18 = 0; i18 < size3; i18++) {
                t tVar3 = (t) list3.get(i18);
                tVar3.s(iF2, i10, i11);
                arrayList.add(tVar3);
                iF2 += tVar3.f();
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i19 = 0; i19 < size4; i19++) {
                iArr[i19] = ((t) list.get(b(i19, z11, size4))).a();
            }
            int[] iArr2 = new int[size4];
            for (int i20 = 0; i20 < size4; i20++) {
                iArr2[i20] = 0;
            }
            if (z10) {
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                mVar.b(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                eVar.c(dVar, i15, iArr, Y0.t.Ltr, iArr2);
            }
            C7972g c7972gB0 = AbstractC3682n.b0(iArr2);
            if (z11) {
                c7972gB0 = AbstractC7978m.q(c7972gB0);
            }
            int i21 = c7972gB0.i();
            int iJ = c7972gB0.j();
            int iK = c7972gB0.k();
            if ((iK > 0 && i21 <= iJ) || (iK < 0 && iJ <= i21)) {
                while (true) {
                    int iA = iArr2[i21];
                    t tVar4 = (t) list.get(b(i21, z11, size4));
                    if (z11) {
                        iA = (i15 - iA) - tVar4.a();
                    }
                    tVar4.s(iA, i10, i11);
                    arrayList.add(tVar4);
                    if (i21 == iJ) {
                        break;
                    }
                    i21 += iK;
                }
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List c(List list, u uVar, int i10, int i11, List list2, float f10, boolean z10, q qVar) {
        ArrayList arrayList;
        l lVar;
        t tVar;
        Object obj;
        int iF;
        Object obj2;
        int index;
        int iMin;
        t tVar2;
        Object obj3;
        int i12 = i10 - 1;
        int iMin2 = Math.min(((t) AbstractC3689v.B0(list)).getIndex() + i11, i12);
        int index2 = ((t) AbstractC3689v.B0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            ArrayList arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList = arrayList2;
                arrayList.add(u.e(uVar, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
                arrayList2 = arrayList;
            }
        } else {
            arrayList = null;
        }
        if (z10 && qVar != null && !qVar.j().isEmpty()) {
            List listJ = qVar.j();
            int size = listJ.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    lVar = null;
                    break;
                }
                if (((l) listJ.get(size)).getIndex() > iMin2 && (size == 0 || ((l) listJ.get(size - 1)).getIndex() <= iMin2)) {
                    break;
                }
            }
            lVar = (l) listJ.get(size);
            l lVar2 = (l) AbstractC3689v.B0(qVar.j());
            if (lVar != null && (index = lVar.getIndex()) <= (iMin = Math.min(lVar2.getIndex(), i12))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                obj3 = null;
                                break;
                            }
                            obj3 = arrayList.get(i13);
                            if (((t) obj3).getIndex() == index) {
                                break;
                            }
                            i13++;
                        }
                        tVar2 = (t) obj3;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u.e(uVar, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float fD = ((qVar.d() - lVar2.b()) - lVar2.a()) - f10;
            if (fD > 0.0f) {
                int index3 = lVar2.getIndex() + 1;
                int i14 = 0;
                while (index3 < i10 && i14 < fD) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size3) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list.get(i15);
                            if (((t) obj2).getIndex() == index3) {
                                break;
                            }
                            i15++;
                        }
                        tVar = (t) obj2;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i16);
                            if (((t) obj).getIndex() == index3) {
                                break;
                            }
                            i16++;
                        }
                        tVar = (t) obj;
                    } else {
                        tVar = null;
                    }
                    if (tVar != null) {
                        index3++;
                        iF = tVar.f();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(u.e(uVar, index3, 0L, 2, null));
                        index3++;
                        iF = ((t) AbstractC3689v.B0(arrayList)).f();
                    }
                    i14 += iF;
                }
            }
        }
        if (arrayList != null && ((t) AbstractC3689v.B0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((t) AbstractC3689v.B0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i17 = 0; i17 < size5; i17++) {
            int iIntValue = ((Number) list2.get(i17)).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u.e(uVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? AbstractC3689v.l() : arrayList;
    }

    private static final List d(int i10, u uVar, int i11, List list) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(u.e(uVar, i12, 0L, 2, null));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i13 = size - 1;
                int iIntValue = ((Number) list.get(size)).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(u.e(uVar, iIntValue, 0L, 2, null));
                }
                if (i13 < 0) {
                    break;
                }
                size = i13;
            }
        }
        return arrayList == null ? AbstractC3689v.l() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0415  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final A.s e(int r40, A.u r41, int r42, int r43, int r44, int r45, int r46, int r47, float r48, long r49, boolean r51, java.util.List r52, z.C8680c.m r53, z.C8680c.e r54, boolean r55, Y0.d r56, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r57, int r58, java.util.List r59, boolean r60, boolean r61, A.q r62, Ii.N r63, T.InterfaceC3551q0 r64, m0.InterfaceC6671H0 r65, mh.q r66) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.r.e(int, A.u, int, int, int, int, int, int, float, long, boolean, java.util.List, z.c$m, z.c$e, boolean, Y0.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, A.q, Ii.N, T.q0, m0.H0, mh.q):A.s");
    }
}
