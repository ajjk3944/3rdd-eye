package z;

import C0.InterfaceC2534n;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.AbstractC7023n;
import o.C7019j;
import o.C7033y;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;
import sh.C7974i;
import z.AbstractC8690m;
import z.AbstractC8697u;
import z.C8680c;
import z.r;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8696t {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC8690m f66957a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC8690m f66958b;

    /* renamed from: z.t$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f66959a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8680c.e f66960b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C8680c.m f66961c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f66962d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f66963e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8702z f66964f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f66965g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f66966h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f66967i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, C8680c.e eVar2, C8680c.m mVar, int i10, int i11, C8702z c8702z, mh.q qVar, int i12, int i13) {
            super(2);
            this.f66959a = eVar;
            this.f66960b = eVar2;
            this.f66961c = mVar;
            this.f66962d = i10;
            this.f66963e = i11;
            this.f66964f = c8702z;
            this.f66965g = qVar;
            this.f66966h = i12;
            this.f66967i = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC8696t.a(this.f66959a, this.f66960b, this.f66961c, this.f66962d, this.f66963e, this.f66964f, this.f66965g, interfaceC3540l, L0.a(this.f66966h | 1), this.f66967i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: z.t$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f66968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(mh.q qVar) {
            super(2);
            this.f66968a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-139531073, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
            }
            this.f66968a.s(C8676B.f66783b, interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: z.t$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f66969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.N n10) {
            super(1);
            this.f66969a = n10;
        }

        public final void a(androidx.compose.ui.layout.t tVar) {
            this.f66969a.f51689a = tVar;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.layout.t) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: z.t$d */
    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f66970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.N n10) {
            super(1);
            this.f66970a = n10;
        }

        public final void a(androidx.compose.ui.layout.t tVar) {
            this.f66970a.f51689a = tVar;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.layout.t) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: z.t$e */
    static final class e extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f66971a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int[] iArr) {
            super(3);
            this.f66971a = iArr;
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10, int i11) {
            return Integer.valueOf(this.f66971a[i10]);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* renamed from: z.t$f */
    static final class f extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f66972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int[] iArr) {
            super(3);
            this.f66972a = iArr;
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10, int i11) {
            return Integer.valueOf(this.f66972a[i10]);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* renamed from: z.t$g */
    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V.b f66973a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(V.b bVar) {
            super(1);
            this.f66973a = bVar;
        }

        public final void a(t.a aVar) {
            V.b bVar = this.f66973a;
            int iO = bVar.o();
            if (iO > 0) {
                Object[] objArrM = bVar.m();
                int i10 = 0;
                do {
                    ((C0.D) objArrM[i10]).q();
                    i10++;
                } while (i10 < iO);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    static {
        AbstractC8690m.b bVar = AbstractC8690m.f66926a;
        c.a aVar = f0.c.f46573a;
        f66957a = bVar.b(aVar.l());
        f66958b = bVar.a(aVar.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r18, z.C8680c.e r19, z.C8680c.m r20, int r21, int r22, z.C8702z r23, mh.q r24, T.InterfaceC3540l r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC8696t.a(androidx.compose.ui.e, z.c$e, z.c$m, int, int, z.z, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0.D e(androidx.compose.ui.layout.m mVar, InterfaceC8700x interfaceC8700x, Iterator it, float f10, float f11, long j10, int i10, int i11, C8698v c8698v) throws Throwable {
        long j11;
        Integer numValueOf;
        C7033y c7033y;
        C0.B b10;
        kotlin.jvm.internal.N n10;
        boolean z10;
        C7033y c7033y2;
        V.b bVar;
        ArrayList arrayList;
        long j12;
        int i12;
        int i13;
        r.a aVarA;
        int i14;
        int i15;
        int height;
        int width;
        Object obj;
        C0.B bO;
        C7019j c7019jA;
        long j13;
        C7033y c7033y3;
        C7033y c7033y4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        r.a aVar;
        Iterator it2 = it;
        V.b bVar2 = new V.b(new C0.D[16], 0);
        int iL = Y0.b.l(j10);
        int iN = Y0.b.n(j10);
        int iK = Y0.b.k(j10);
        o.z zVarB = AbstractC7023n.b();
        ArrayList arrayList2 = new ArrayList();
        int iCeil = (int) Math.ceil(mVar.d1(f10));
        int iCeil2 = (int) Math.ceil(mVar.d1(f11));
        long jA = M.a(0, iL, 0, iK);
        long jF = M.f(M.e(jA, 0, 0, 0, 0, 14, null), interfaceC8700x.j() ? K.Horizontal : K.Vertical);
        kotlin.jvm.internal.N n11 = new kotlin.jvm.internal.N();
        C0.B bO2 = !it.hasNext() ? null : o(it2, null);
        C7019j c7019jA2 = bO2 != null ? C7019j.a(k(bO2, interfaceC8700x, jF, new d(n11))) : null;
        Integer numValueOf2 = c7019jA2 != null ? Integer.valueOf(C7019j.e(c7019jA2.i())) : null;
        if (c7019jA2 != null) {
            j11 = jF;
            numValueOf = Integer.valueOf(C7019j.f(c7019jA2.i()));
        } else {
            j11 = jF;
            numValueOf = null;
        }
        C7033y c7033y5 = new C7033y(0, 1, null);
        C7033y c7033y6 = new C7033y(0, 1, null);
        r rVar = new r(i10, c8698v, j10, i11, iCeil, iCeil2, null);
        r.b bVarB = rVar.b(it.hasNext(), 0, C7019j.b(iL, iK), c7019jA2, 0, 0, 0, false, false);
        if (bVarB.a()) {
            b10 = bO2;
            n10 = n11;
            z10 = true;
            j12 = j11;
            c7033y2 = c7033y6;
            i12 = iCeil2;
            i13 = iCeil;
            c7033y = c7033y5;
            bVar = bVar2;
            arrayList = arrayList2;
            aVarA = rVar.a(bVarB, c7019jA2 != null, -1, 0, iL, 0);
        } else {
            c7033y = c7033y5;
            b10 = bO2;
            n10 = n11;
            z10 = true;
            c7033y2 = c7033y6;
            bVar = bVar2;
            arrayList = arrayList2;
            j12 = j11;
            i12 = iCeil2;
            i13 = iCeil;
            aVarA = null;
        }
        int i21 = iL;
        r.a aVar2 = aVarA;
        int i22 = iK;
        C0.B b11 = b10;
        int i23 = iN;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (!bVarB.a() && b11 != null) {
            AbstractC6492s.f(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            AbstractC6492s.f(numValueOf);
            int i30 = iK;
            int i31 = i24 + iIntValue;
            int iMax = Math.max(i25, numValueOf.intValue());
            int i32 = i21 - iIntValue;
            int i33 = i26 + 1;
            int i34 = iL;
            c8698v.k(i33);
            arrayList.add(b11);
            zVarB.t(i26, n10.f51689a);
            int i35 = i33 - i27;
            if (it.hasNext()) {
                obj = null;
                bO = o(it2, null);
            } else {
                obj = null;
                bO = null;
            }
            n10.f51689a = obj;
            C7019j c7019jA3 = bO != null ? C7019j.a(k(bO, interfaceC8700x, j12, new c(n10))) : null;
            Integer numValueOf3 = c7019jA3 != null ? Integer.valueOf(C7019j.e(c7019jA3.i()) + i13) : null;
            Integer numValueOf4 = c7019jA3 != null ? Integer.valueOf(C7019j.f(c7019jA3.i())) : null;
            boolean zHasNext = it.hasNext();
            long jB = C7019j.b(i32, i22);
            if (c7019jA3 == null) {
                c7019jA = null;
            } else {
                AbstractC6492s.f(numValueOf3);
                int iIntValue2 = numValueOf3.intValue();
                AbstractC6492s.f(numValueOf4);
                c7019jA = C7019j.a(C7019j.b(iIntValue2, numValueOf4.intValue()));
            }
            r.b bVarB2 = rVar.b(zHasNext, i35, jB, c7019jA, i29, i28, iMax, false, false);
            if (bVarB2.b()) {
                int iMin = Math.min(Math.max(i23, i31), i34);
                int i36 = i28 + iMax;
                r.a aVarA2 = rVar.a(bVarB2, c7019jA3 != null ? z10 : false, i29, i36, i32, i35);
                C7033y c7033y7 = c7033y2;
                c7033y7.h(iMax);
                int i37 = (i30 - i36) - i12;
                C7033y c7033y8 = c7033y;
                c7033y8.h(i33);
                i29++;
                i28 = i36 + i12;
                i20 = iMin;
                iL = i34;
                i27 = i33;
                j13 = j12;
                numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i13) : null;
                c7033y3 = c7033y7;
                i16 = i37;
                i18 = 0;
                aVar = aVarA2;
                i17 = iL;
                c7033y4 = c7033y8;
                i19 = 0;
            } else {
                j13 = j12;
                iL = i34;
                c7033y3 = c7033y2;
                c7033y4 = c7033y;
                i16 = i22;
                i17 = i32;
                i18 = iMax;
                i19 = i31;
                i20 = i23;
                aVar = aVar2;
            }
            bVarB = bVarB2;
            c7033y = c7033y4;
            aVar2 = aVar;
            i23 = i20;
            i24 = i19;
            i25 = i18;
            b11 = bO;
            i21 = i17;
            i26 = i33;
            i22 = i16;
            c7033y2 = c7033y3;
            j12 = j13;
            iK = i30;
            numValueOf2 = numValueOf3;
            numValueOf = numValueOf4;
            it2 = it;
        }
        C7033y c7033y9 = c7033y2;
        C7033y c7033y10 = c7033y;
        if (aVar2 != null) {
            arrayList.add(aVar2.a());
            zVarB.t(arrayList.size() - 1, aVar2.d());
            int i38 = c7033y10.f54979b - 1;
            if (aVar2.c()) {
                int iB = c7033y10.b() - 1;
                c7033y9.m(i38, Math.max(c7033y9.a(i38), C7019j.f(aVar2.b())));
                c7033y10.m(iB, c7033y10.f() + 1);
            } else {
                c7033y9.h(C7019j.f(aVar2.b()));
                c7033y10.h(c7033y10.f() + 1);
            }
        }
        int size = arrayList.size();
        androidx.compose.ui.layout.t[] tVarArr = new androidx.compose.ui.layout.t[size];
        for (int i39 = 0; i39 < size; i39++) {
            tVarArr[i39] = zVarB.c(i39);
        }
        int iB2 = c7033y10.b();
        int[] iArr = new int[iB2];
        for (int i40 = 0; i40 < iB2; i40++) {
            iArr[i40] = 0;
        }
        int iB3 = c7033y10.b();
        int[] iArr2 = new int[iB3];
        for (int i41 = 0; i41 < iB3; i41++) {
            iArr2[i41] = 0;
        }
        int[] iArr3 = c7033y10.f54978a;
        int i42 = c7033y10.f54979b;
        int iMax2 = i23;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        androidx.compose.ui.layout.t[] tVarArr2 = tVarArr;
        while (i43 < i42) {
            int i46 = iArr3[i43];
            int iA = c7033y9.a(i43);
            int i47 = i43;
            C7033y c7033y11 = c7033y9;
            int i48 = iMax2;
            int i49 = i42;
            int[] iArr4 = iArr3;
            int i50 = i44;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            androidx.compose.ui.layout.t[] tVarArr3 = tVarArr2;
            C0.D dA = U.a(interfaceC8700x, iMax2, Y0.b.m(jA), Y0.b.l(jA), iA, i13, mVar, arrayList, tVarArr2, i50, i46, iArr, i47);
            if (interfaceC8700x.j()) {
                height = dA.getWidth();
                width = dA.getHeight();
            } else {
                height = dA.getHeight();
                width = dA.getWidth();
            }
            iArr5[i47] = width;
            i45 += width;
            iMax2 = Math.max(i48, height);
            bVar.b(dA);
            iArr2 = iArr5;
            i44 = i46;
            i42 = i49;
            iArr3 = iArr4;
            iArr = iArr6;
            tVarArr2 = tVarArr3;
            c7033y9 = c7033y11;
            i43 = i47 + 1;
        }
        int i51 = iMax2;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        V.b bVar3 = bVar;
        if (bVar3.s()) {
            i14 = 0;
            i15 = 0;
        } else {
            i14 = i51;
            i15 = i45;
        }
        return m(mVar, j10, i14, i15, iArr7, bVar3, interfaceC8700x, iArr8);
    }

    public static final int f(InterfaceC2534n interfaceC2534n, boolean z10, int i10) {
        return z10 ? interfaceC2534n.s0(i10) : interfaceC2534n.R(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(List list, mh.q qVar, mh.q qVar2, int i10, int i11, int i12, int i13, int i14, C8698v c8698v) {
        int i15;
        int i16;
        int i17 = 0;
        if (list.isEmpty()) {
            return C7019j.b(0, 0);
        }
        r rVar = new r(i13, c8698v, M.a(0, i10, 0, MPv3.MAX_MESSAGE_ID), i14, i11, i12, null);
        InterfaceC2534n interfaceC2534n = (InterfaceC2534n) AbstractC3689v.t0(list, 0);
        int iIntValue = interfaceC2534n != null ? ((Number) qVar2.s(interfaceC2534n, 0, Integer.valueOf(i10))).intValue() : 0;
        int iIntValue2 = interfaceC2534n != null ? ((Number) qVar.s(interfaceC2534n, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int i18 = 0;
        int iF = 0;
        int i19 = 0;
        if (rVar.b(list.size() > 1, 0, C7019j.b(i10, MPv3.MAX_MESSAGE_ID), interfaceC2534n == null ? null : C7019j.a(C7019j.b(iIntValue2, iIntValue)), 0, 0, 0, false, false).a()) {
            C7019j c7019jF = c8698v.f(interfaceC2534n != null, 0, 0);
            return C7019j.b(c7019jF != null ? C7019j.f(c7019jF.i()) : 0, 0);
        }
        int size = list.size();
        int i20 = i10;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i21 >= size) {
                i15 = i22;
                break;
            }
            int i24 = i20 - iIntValue2;
            i15 = i21 + 1;
            int iMax = Math.max(i19, iIntValue);
            InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) AbstractC3689v.t0(list, i15);
            int iIntValue3 = interfaceC2534n2 != null ? ((Number) qVar2.s(interfaceC2534n2, Integer.valueOf(i15), Integer.valueOf(i10))).intValue() : i17;
            int iIntValue4 = interfaceC2534n2 != null ? ((Number) qVar.s(interfaceC2534n2, Integer.valueOf(i15), Integer.valueOf(iIntValue3))).intValue() + i11 : 0;
            boolean z10 = i21 + 2 < list.size();
            int i25 = i15 - i23;
            r.b bVarB = rVar.b(z10, i25, C7019j.b(i24, MPv3.MAX_MESSAGE_ID), interfaceC2534n2 == null ? null : C7019j.a(C7019j.b(iIntValue4, iIntValue3)), i18, iF, iMax, false, false);
            if (bVarB.b()) {
                iF += iMax + i12;
                r.a aVarA = rVar.a(bVarB, interfaceC2534n2 != null, i18, iF, i24, i25);
                int i26 = iIntValue4 - i11;
                i18++;
                if (!bVarB.a()) {
                    i16 = i10;
                    iIntValue2 = i26;
                    i23 = i15;
                    i19 = 0;
                } else if (aVarA != null) {
                    long jB = aVarA.b();
                    if (!aVarA.c()) {
                        iF += C7019j.f(jB) + i12;
                    }
                }
            } else {
                i19 = iMax;
                i16 = i24;
                iIntValue2 = iIntValue4;
            }
            i21 = i15;
            i22 = i21;
            i17 = 0;
            i20 = i16;
            iIntValue = iIntValue3;
        }
        return C7019j.b(iF - i12, i15);
    }

    private static final long h(List list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, C8698v c8698v) {
        return g(list, new e(iArr), new f(iArr2), i10, i11, i12, i13, i14, c8698v);
    }

    public static final int i(InterfaceC2534n interfaceC2534n, boolean z10, int i10) {
        return z10 ? interfaceC2534n.R(i10) : interfaceC2534n.s0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(List list, mh.q qVar, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = ((Number) qVar.s((InterfaceC2534n) list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10))).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    public static final long k(C0.B b10, InterfaceC8700x interfaceC8700x, long j10, InterfaceC6835l interfaceC6835l) {
        if (S.e(S.c(b10)) != 0.0f) {
            int i10 = i(b10, interfaceC8700x.j(), MPv3.MAX_MESSAGE_ID);
            return C7019j.b(i10, f(b10, interfaceC8700x.j(), i10));
        }
        V vC = S.c(b10);
        if (vC != null) {
            vC.c();
        }
        androidx.compose.ui.layout.t tVarT = b10.T(j10);
        interfaceC6835l.invoke(tVarT);
        return C7019j.b(interfaceC8700x.h(tVarT), interfaceC8700x.k(tVarT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(List list, mh.q qVar, mh.q qVar2, int i10, int i11, int i12, int i13, int i14, C8698v c8698v) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 < size; i15++) {
            iArr[i15] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i16 = 0; i16 < size2; i16++) {
            iArr2[i16] = 0;
        }
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            InterfaceC2534n interfaceC2534n = (InterfaceC2534n) list.get(i17);
            int iIntValue = ((Number) qVar.s(interfaceC2534n, Integer.valueOf(i17), Integer.valueOf(i10))).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = ((Number) qVar2.s(interfaceC2534n, Integer.valueOf(i17), Integer.valueOf(iIntValue))).intValue();
        }
        int i18 = MPv3.MAX_MESSAGE_ID;
        if (i14 != Integer.MAX_VALUE && i13 != Integer.MAX_VALUE) {
            i18 = i13 * i14;
        }
        int iMin = Math.min(i18 - (((i18 >= list.size() || !(c8698v.i() == AbstractC8697u.a.ExpandIndicator || c8698v.i() == AbstractC8697u.a.ExpandOrCollapseIndicator)) && (i18 < list.size() || i14 < c8698v.g() || c8698v.i() != AbstractC8697u.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iU0 = AbstractC3682n.U0(iArr) + ((list.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iE = iArr2[0];
        Zg.Q it = new C7974i(1, AbstractC3682n.e0(iArr2)).iterator();
        while (it.hasNext()) {
            int i19 = iArr2[it.d()];
            if (iE < i19) {
                iE = i19;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr[0];
        Zg.Q it2 = new C7974i(1, AbstractC3682n.e0(iArr)).iterator();
        while (it2.hasNext()) {
            int i21 = iArr[it2.d()];
            if (i20 < i21) {
                i20 = i21;
            }
        }
        int i22 = i20;
        int i23 = iU0;
        while (i22 <= i23 && iE != i10) {
            int i24 = (i22 + i23) / 2;
            int i25 = i23;
            int i26 = i22;
            long jH = h(list, iArr, iArr2, i24, i11, i12, i13, i14, c8698v);
            iE = C7019j.e(jH);
            int iF = C7019j.f(jH);
            if (iE > i10 || iF < iMin) {
                i22 = i24 + 1;
                if (i22 > i25) {
                    return i22;
                }
                i23 = i25;
                iU0 = i24;
            } else {
                if (iE >= i10) {
                    return i24;
                }
                i23 = i24 - 1;
                iU0 = i24;
                i22 = i26;
            }
        }
        return iU0;
    }

    public static final C0.D m(androidx.compose.ui.layout.m mVar, long j10, int i10, int i11, int[] iArr, V.b bVar, InterfaceC8700x interfaceC8700x, int[] iArr2) {
        int iK;
        boolean zJ = interfaceC8700x.j();
        C8680c.m mVarP = interfaceC8700x.p();
        C8680c.e eVarO = interfaceC8700x.o();
        if (zJ) {
            if (mVarP == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            iK = AbstractC7978m.k((mVar.x1(mVarP.a()) * (bVar.o() - 1)) + i11, Y0.b.m(j10), Y0.b.k(j10));
            mVarP.b(mVar, iK, iArr, iArr2);
        } else {
            if (eVarO == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            int iK2 = AbstractC7978m.k((mVar.x1(eVarO.a()) * (bVar.o() - 1)) + i11, Y0.b.m(j10), Y0.b.k(j10));
            eVarO.c(mVar, iK2, iArr, mVar.getLayoutDirection(), iArr2);
            iK = iK2;
        }
        int iK3 = AbstractC7978m.k(i10, Y0.b.n(j10), Y0.b.l(j10));
        if (!zJ) {
            int i12 = iK;
            iK = iK3;
            iK3 = i12;
        }
        return androidx.compose.ui.layout.m.x0(mVar, iK3, iK, null, new g(bVar), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final C0.G n(z.C8680c.e r17, z.C8680c.m r18, int r19, int r20, z.C8698v r21, T.InterfaceC3540l r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = T.AbstractC3546o.H()
            if (r2 == 0) goto L13
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            r4 = -2134502475(0xffffffff80c613b5, float:-1.8190498E-38)
            T.AbstractC3546o.Q(r4, r1, r2, r3)
        L13:
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L25
            r2 = r17
            boolean r6 = r0.T(r2)
            if (r6 != 0) goto L2b
            goto L27
        L25:
            r2 = r17
        L27:
            r6 = r1 & 6
            if (r6 != r3) goto L2d
        L2b:
            r3 = r5
            goto L2e
        L2d:
            r3 = r4
        L2e:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L3e
            boolean r6 = r0.T(r9)
            if (r6 != 0) goto L42
        L3e:
            r6 = r1 & 48
            if (r6 != r7) goto L44
        L42:
            r6 = r5
            goto L45
        L44:
            r6 = r4
        L45:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L56
            boolean r6 = r0.i(r13)
            if (r6 != 0) goto L5a
        L56:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L5c
        L5a:
            r6 = r5
            goto L5d
        L5c:
            r6 = r4
        L5d:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L6e
            boolean r6 = r0.i(r14)
            if (r6 != 0) goto L72
        L6e:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L73
        L72:
            r4 = r5
        L73:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.T(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.f()
            if (r1 != 0) goto L8a
            T.l$a r1 = T.InterfaceC3540l.f21100a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto Laa
        L8a:
            float r10 = r17.a()
            z.m r11 = z.AbstractC8696t.f66957a
            float r12 = r18.a()
            z.y r4 = new z.y
            r7 = 1
            r16 = 0
            r6 = r4
            r8 = r17
            r9 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.K(r4)
        Laa:
            z.y r4 = (z.C8701y) r4
            boolean r0 = T.AbstractC3546o.H()
            if (r0 == 0) goto Lb5
            T.AbstractC3546o.P()
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC8696t.n(z.c$e, z.c$m, int, int, z.v, T.l, int):C0.G");
    }

    private static final C0.B o(Iterator it, AbstractC8699w abstractC8699w) {
        try {
            return (C0.B) it.next();
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
