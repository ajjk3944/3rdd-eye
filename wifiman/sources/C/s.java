package C;

import B.M;
import Ii.N;
import T.InterfaceC3551q0;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import Zg.C3681m;
import androidx.compose.ui.layout.t;
import com.google.ar.core.ImageMetadata;
import f0.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import sh.C7972g;
import x.AbstractC8410k;
import x.InterfaceC8409j;
import z.C8680c;

/* loaded from: classes.dex */
public abstract class s {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f2053a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f2054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List list, InterfaceC3551q0 interfaceC3551q0) {
            super(1);
            this.f2053a = list;
            this.f2054b = interfaceC3551q0;
        }

        public final void a(t.a aVar) {
            List list = this.f2053a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C2520e) list.get(i10)).h(aVar);
            }
            M.a(this.f2054b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f2055a = new b();

        b() {
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

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B.x f2056a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2057b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f2058c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f2059d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w.q f2060e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.b f2061f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f2062g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f2063h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f2064i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(B.x xVar, long j10, r rVar, long j11, w.q qVar, c.b bVar, c.InterfaceC1752c interfaceC1752c, boolean z10, int i10) {
            super(1);
            this.f2056a = xVar;
            this.f2057b = j10;
            this.f2058c = rVar;
            this.f2059d = j11;
            this.f2060e = qVar;
            this.f2061f = bVar;
            this.f2062g = interfaceC1752c;
            this.f2063h = z10;
            this.f2064i = i10;
        }

        public final C2520e a(int i10) {
            B.x xVar = this.f2056a;
            return s.g(xVar, i10, this.f2057b, this.f2058c, this.f2059d, this.f2060e, this.f2061f, this.f2062g, xVar.getLayoutDirection(), this.f2063h, this.f2064i);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ B.x f2065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f2066b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f2067c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f2068d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w.q f2069e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c.b f2070f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f2071g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f2072h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f2073i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B.x xVar, long j10, r rVar, long j11, w.q qVar, c.b bVar, c.InterfaceC1752c interfaceC1752c, boolean z10, int i10) {
            super(1);
            this.f2065a = xVar;
            this.f2066b = j10;
            this.f2067c = rVar;
            this.f2068d = j11;
            this.f2069e = qVar;
            this.f2070f = bVar;
            this.f2071g = interfaceC1752c;
            this.f2072h = z10;
            this.f2073i = i10;
        }

        public final C2520e a(int i10) {
            B.x xVar = this.f2065a;
            return s.g(xVar, i10, this.f2066b, this.f2067c, this.f2068d, this.f2069e, this.f2070f, this.f2071g, xVar.getLayoutDirection(), this.f2072h, this.f2073i);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    private static final C2520e b(int i10, List list, int i11, int i12, int i13, InterfaceC8409j interfaceC8409j, int i14) {
        Object obj;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            C2520e c2520e = (C2520e) obj2;
            float f10 = -Math.abs(AbstractC8410k.a(i10, i11, i12, i13, c2520e.b(), c2520e.getIndex(), interfaceC8409j, i14));
            int iN = AbstractC3689v.n(list);
            int i15 = 1;
            if (1 <= iN) {
                while (true) {
                    Object obj3 = list.get(i15);
                    C2520e c2520e2 = (C2520e) obj3;
                    float f11 = -Math.abs(AbstractC8410k.a(i10, i11, i12, i13, c2520e2.b(), c2520e2.getIndex(), interfaceC8409j, i14));
                    if (Float.compare(f10, f11) < 0) {
                        obj2 = obj3;
                        f10 = f11;
                    }
                    if (i15 == iN) {
                        break;
                    }
                    i15++;
                }
            }
            obj = obj2;
        }
        return (C2520e) obj;
    }

    private static final List c(B.x xVar, List list, List list2, List list3, int i10, int i11, int i12, int i13, int i14, w.q qVar, boolean z10, Y0.d dVar, int i15, int i16) {
        int i17;
        int i18;
        int i19 = i14;
        int i20 = i16 + i15;
        if (qVar == w.q.Vertical) {
            i17 = i13;
            i18 = i11;
        } else {
            i17 = i13;
            i18 = i10;
        }
        boolean z11 = i12 < Math.min(i18, i17);
        if (z11 && i19 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i19).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (!z11) {
            int size = list2.size();
            int i21 = i19;
            for (int i22 = 0; i22 < size; i22++) {
                C2520e c2520e = (C2520e) list2.get(i22);
                i21 -= i20;
                c2520e.i(i21, i10, i11);
                arrayList.add(c2520e);
            }
            int size2 = list.size();
            for (int i23 = 0; i23 < size2; i23++) {
                C2520e c2520e2 = (C2520e) list.get(i23);
                c2520e2.i(i19, i10, i11);
                arrayList.add(c2520e2);
                i19 += i20;
            }
            int size3 = list3.size();
            for (int i24 = 0; i24 < size3; i24++) {
                C2520e c2520e3 = (C2520e) list3.get(i24);
                c2520e3.i(i19, i10, i11);
                arrayList.add(c2520e3);
                i19 += i20;
            }
        } else {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages");
            }
            int size4 = list.size();
            int[] iArr = new int[size4];
            for (int i25 = 0; i25 < size4; i25++) {
                iArr[i25] = i16;
            }
            int[] iArr2 = new int[size4];
            for (int i26 = 0; i26 < size4; i26++) {
                iArr2[i26] = 0;
            }
            C8680c.f fVarC = C8680c.a.f66841a.c(xVar.x(i15));
            if (qVar == w.q.Vertical) {
                fVarC.b(dVar, i18, iArr, iArr2);
            } else {
                fVarC.c(dVar, i18, iArr, Y0.t.Ltr, iArr2);
            }
            C7972g c7972gB0 = AbstractC3682n.b0(iArr2);
            if (z10) {
                c7972gB0 = AbstractC7978m.q(c7972gB0);
            }
            int i27 = c7972gB0.i();
            int iJ = c7972gB0.j();
            int iK = c7972gB0.k();
            if ((iK > 0 && i27 <= iJ) || (iK < 0 && iJ <= i27)) {
                while (true) {
                    int iG = iArr2[i27];
                    C2520e c2520e4 = (C2520e) list.get(d(i27, z10, size4));
                    if (z10) {
                        iG = (i18 - iG) - c2520e4.g();
                    }
                    c2520e4.i(iG, i10, i11);
                    arrayList.add(c2520e4);
                    if (i27 == iJ) {
                        break;
                    }
                    i27 += iK;
                }
            }
        }
        return arrayList;
    }

    private static final int d(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List e(int i10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6835l.invoke(Integer.valueOf(i13)));
                if (i13 == iMin) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = ((Number) list.get(i14)).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6835l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC3689v.l() : arrayList;
    }

    private static final List f(int i10, int i11, List list, InterfaceC6835l interfaceC6835l) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6835l.invoke(Integer.valueOf(i12)));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = ((Number) list.get(i13)).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC6835l.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? AbstractC3689v.l() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2520e g(B.x xVar, int i10, long j10, r rVar, long j11, w.q qVar, c.b bVar, c.InterfaceC1752c interfaceC1752c, Y0.t tVar, boolean z10, int i11) {
        return new C2520e(i10, i11, xVar.M0(i10, j10), j11, rVar.b(i10), qVar, bVar, interfaceC1752c, tVar, z10, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final u h(B.x xVar, int i10, r rVar, int i11, int i12, int i13, int i14, int i15, int i16, long j10, w.q qVar, c.InterfaceC1752c interfaceC1752c, c.b bVar, boolean z10, long j11, int i17, int i18, List list, InterfaceC8409j interfaceC8409j, InterfaceC3551q0 interfaceC3551q0, N n10, mh.q qVar2) {
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        C2520e c2520e;
        int i24;
        long j12;
        int i25;
        List list2;
        List arrayList;
        List arrayList2;
        if (i12 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding");
        }
        int i26 = 0;
        int iD = AbstractC7978m.d(i17 + i14, 0);
        if (i10 <= 0) {
            return new u(AbstractC3689v.l(), i17, i14, i13, qVar, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, interfaceC8409j, (C0.D) qVar2.s(Integer.valueOf(Y0.b.n(j10)), Integer.valueOf(Y0.b.m(j10)), b.f2055a), false, null, null, n10, ImageMetadata.HOT_PIXEL_MODE, null);
        }
        w.q qVar3 = w.q.Vertical;
        long jB = Y0.c.b(0, qVar == qVar3 ? Y0.b.l(j10) : i17, 0, qVar != qVar3 ? Y0.b.k(j10) : i17, 5, null);
        int i27 = i15;
        int i28 = i16;
        while (i27 > 0 && i28 > 0) {
            i27--;
            i28 -= iD;
        }
        int i29 = i28 * (-1);
        if (i27 >= i10) {
            i27 = i10 - 1;
            i29 = 0;
        }
        C3681m c3681m = new C3681m();
        int i30 = -i12;
        int i31 = (i14 < 0 ? i14 : 0) + i30;
        int i32 = i29 + i31;
        int iMax = 0;
        while (i32 < 0 && i27 > 0) {
            int i33 = i27 - 1;
            C3681m c3681m2 = c3681m;
            int i34 = i26;
            int i35 = iD;
            C2520e c2520eG = g(xVar, i33, jB, rVar, j11, qVar, bVar, interfaceC1752c, xVar.getLayoutDirection(), z10, i17);
            c3681m2.add(i34, c2520eG);
            iMax = Math.max(iMax, c2520eG.c());
            i32 += i35;
            i27 = i33;
            i31 = i31;
            c3681m = c3681m2;
            i26 = i34;
            iD = i35;
            i30 = i30;
        }
        int i36 = i32;
        int i37 = i30;
        int i38 = i31;
        C3681m c3681m3 = c3681m;
        int i39 = i26;
        int i40 = iD;
        int i41 = (i36 < i38 ? i38 : i36) - i38;
        int i42 = i11 + i13;
        int iD2 = AbstractC7978m.d(i42, i39);
        int i43 = -i41;
        int i44 = i39;
        int i45 = i44;
        int i46 = i27;
        while (i44 < c3681m3.size()) {
            if (i43 >= iD2) {
                c3681m3.remove(i44);
                i45 = 1;
            } else {
                i46++;
                i43 += i40;
                i44++;
            }
        }
        int i47 = i27;
        int i48 = i41;
        int i49 = i45;
        int i50 = i46;
        int i51 = i43;
        while (i50 < i10 && (i51 < iD2 || i51 <= 0 || c3681m3.isEmpty())) {
            int i52 = i42;
            int i53 = i50;
            int i54 = i47;
            int i55 = iD2;
            int i56 = i51;
            int i57 = i40;
            C2520e c2520eG2 = g(xVar, i50, jB, rVar, j11, qVar, bVar, interfaceC1752c, xVar.getLayoutDirection(), z10, i17);
            int i58 = i10 - 1;
            i51 = (i53 == i58 ? i17 : i57) + i56;
            if (i51 > i38 || i53 == i58) {
                iMax = Math.max(iMax, c2520eG2.c());
                c3681m3.add(c2520eG2);
                i47 = i54;
            } else {
                i48 -= i57;
                i47 = i53 + 1;
                i49 = 1;
            }
            i50 = i53 + 1;
            i42 = i52;
            i40 = i57;
            iD2 = i55;
        }
        int i59 = i47;
        int i60 = i42;
        int i61 = i50;
        int i62 = i51;
        int i63 = i40;
        if (i62 < i11) {
            int i64 = i11 - i62;
            int i65 = i48 - i64;
            int i66 = i64 + i62;
            int i67 = i12;
            i23 = i59;
            int i68 = i63;
            int i69 = i65;
            while (i69 < i67 && i23 > 0) {
                i23--;
                int i70 = i68;
                C2520e c2520eG3 = g(xVar, i23, jB, rVar, j11, qVar, bVar, interfaceC1752c, xVar.getLayoutDirection(), z10, i17);
                c3681m3.add(0, c2520eG3);
                iMax = Math.max(iMax, c2520eG3.c());
                i69 += i70;
                i67 = i12;
                i68 = i70;
            }
            i19 = i68;
            i20 = 0;
            if (i69 < 0) {
                i21 = i66 + i69;
                i22 = 0;
            } else {
                i22 = i69;
                i21 = i66;
            }
        } else {
            i19 = i63;
            i20 = 0;
            i21 = i62;
            i22 = i48;
            i23 = i59;
        }
        if (i22 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
        }
        int i71 = -i22;
        C2520e c2520e2 = (C2520e) c3681m3.first();
        if (i12 > 0 || i14 < 0) {
            int size = c3681m3.size();
            int i72 = i22;
            int i73 = i20;
            while (i73 < size && i72 != 0 && i19 <= i72 && i73 != AbstractC3689v.n(c3681m3)) {
                i72 -= i19;
                i73++;
                c2520e2 = (C2520e) c3681m3.get(i73);
            }
            c2520e = c2520e2;
            i24 = i72;
        } else {
            i24 = i22;
            c2520e = c2520e2;
        }
        int i74 = iMax;
        C2520e c2520e3 = c2520e;
        int i75 = i20;
        List listF = f(i23, i18, list, new d(xVar, jB, rVar, j11, qVar, bVar, interfaceC1752c, z10, i17));
        int size2 = listF.size();
        int iMax2 = i74;
        for (int i76 = i75; i76 < size2; i76++) {
            iMax2 = Math.max(iMax2, ((C2520e) listF.get(i76)).c());
        }
        int i77 = i19;
        List listE = e(((C2520e) c3681m3.last()).getIndex(), i10, i18, list, new c(xVar, jB, rVar, j11, qVar, bVar, interfaceC1752c, z10, i17));
        int size3 = listE.size();
        int iMax3 = iMax2;
        for (int i78 = i75; i78 < size3; i78++) {
            iMax3 = Math.max(iMax3, ((C2520e) listE.get(i78)).c());
        }
        int i79 = (AbstractC6492s.d(c2520e3, c3681m3.first()) && listF.isEmpty() && listE.isEmpty()) ? 1 : i75;
        w.q qVar4 = w.q.Vertical;
        if (qVar == qVar4) {
            j12 = j10;
            i25 = iMax3;
        } else {
            j12 = j10;
            i25 = i21;
        }
        int i80 = Y0.c.i(j12, i25);
        if (qVar == qVar4) {
            iMax3 = i21;
        }
        int iH = Y0.c.h(j12, iMax3);
        List listC = c(xVar, c3681m3, listF, listE, i80, iH, i21, i11, i71, qVar, z10, xVar, i14, i17);
        if (i79 != 0) {
            list2 = listC;
        } else {
            ArrayList arrayList3 = new ArrayList(listC.size());
            int size4 = listC.size();
            for (int i81 = i75; i81 < size4; i81++) {
                Object obj = listC.get(i81);
                C2520e c2520e4 = (C2520e) obj;
                if (c2520e4.getIndex() >= ((C2520e) c3681m3.first()).getIndex() && c2520e4.getIndex() <= ((C2520e) c3681m3.last()).getIndex()) {
                    arrayList3.add(obj);
                }
            }
            list2 = arrayList3;
        }
        if (listF.isEmpty()) {
            arrayList = AbstractC3689v.l();
        } else {
            arrayList = new ArrayList(listC.size());
            int size5 = listC.size();
            for (int i82 = i75; i82 < size5; i82++) {
                Object obj2 = listC.get(i82);
                if (((C2520e) obj2).getIndex() < ((C2520e) c3681m3.first()).getIndex()) {
                    arrayList.add(obj2);
                }
            }
        }
        List list3 = arrayList;
        if (listE.isEmpty()) {
            arrayList2 = AbstractC3689v.l();
        } else {
            arrayList2 = new ArrayList(listC.size());
            int size6 = listC.size();
            for (int i83 = i75; i83 < size6; i83++) {
                Object obj3 = listC.get(i83);
                if (((C2520e) obj3).getIndex() > ((C2520e) c3681m3.last()).getIndex()) {
                    arrayList2.add(obj3);
                }
            }
        }
        List list4 = arrayList2;
        int i84 = i21;
        C2520e c2520eB = b(qVar == w.q.Vertical ? iH : i80, list2, i12, i13, i77, interfaceC8409j, i10);
        return new u(list2, i17, i14, i13, qVar, i37, i60, z10, i18, c2520e3, c2520eB, i77 == 0 ? 0.0f : AbstractC7978m.j((interfaceC8409j.a(i11, i17, i12, i13, c2520eB != null ? c2520eB.getIndex() : i75, i10) - (c2520eB != null ? c2520eB.b() : i75)) / i77, -0.5f, 0.5f), i24, (i61 < i10 || i84 > i11) ? 1 : i75, interfaceC8409j, (C0.D) qVar2.s(Integer.valueOf(i80), Integer.valueOf(iH), new a(listC, interfaceC3551q0)), i49, list3, list4, n10);
    }
}
