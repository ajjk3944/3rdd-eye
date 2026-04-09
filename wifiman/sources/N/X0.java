package N;

import C0.AbstractC2522b;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import androidx.compose.ui.layout.t;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
final class X0 implements C0.C {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14178a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14179b;

    /* renamed from: c, reason: collision with root package name */
    private final z.N f14180c;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14181a = new a();

        a() {
            super(2);
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10) {
            return Integer.valueOf(interfaceC2534n.s(i10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14182a = new b();

        b() {
            super(2);
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10) {
            return Integer.valueOf(interfaceC2534n.S(i10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14185c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f14186d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14187e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14188f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14189g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14190h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14191i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ X0 f14192j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f14193k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f14194l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f14195m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.layout.t tVar, int i10, int i11, int i12, int i13, androidx.compose.ui.layout.t tVar2, androidx.compose.ui.layout.t tVar3, androidx.compose.ui.layout.t tVar4, androidx.compose.ui.layout.t tVar5, X0 x02, int i14, int i15, androidx.compose.ui.layout.m mVar) {
            super(1);
            this.f14183a = tVar;
            this.f14184b = i10;
            this.f14185c = i11;
            this.f14186d = i12;
            this.f14187e = i13;
            this.f14188f = tVar2;
            this.f14189g = tVar3;
            this.f14190h = tVar4;
            this.f14191i = tVar5;
            this.f14192j = x02;
            this.f14193k = i14;
            this.f14194l = i15;
            this.f14195m = mVar;
        }

        public final void a(t.a aVar) {
            if (this.f14183a == null) {
                W0.k(aVar, this.f14186d, this.f14187e, this.f14188f, this.f14189g, this.f14190h, this.f14191i, this.f14192j.f14178a, this.f14195m.getDensity(), this.f14192j.f14180c);
            } else {
                W0.j(aVar, this.f14186d, this.f14187e, this.f14188f, this.f14183a, this.f14189g, this.f14190h, this.f14191i, this.f14192j.f14178a, AbstractC7978m.d(this.f14184b - this.f14185c, 0), this.f14193k + this.f14194l, this.f14192j.f14179b, this.f14195m.getDensity());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14196a = new d();

        d() {
            super(2);
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10) {
            return Integer.valueOf(interfaceC2534n.s0(i10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue());
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14197a = new e();

        e() {
            super(2);
        }

        public final Integer a(InterfaceC2534n interfaceC2534n, int i10) {
            return Integer.valueOf(interfaceC2534n.R(i10));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC2534n) obj, ((Number) obj2).intValue());
        }
    }

    public X0(boolean z10, float f10, z.N n10) {
        this.f14178a = z10;
        this.f14179b = f10;
        this.f14180c = n10;
    }

    private final int h(InterfaceC2535o interfaceC2535o, List list, int i10, InterfaceC6839p interfaceC6839p) {
        Object obj;
        Object obj2;
        int iIntValue;
        int iL;
        Object obj3;
        int iIntValue2;
        Object obj4;
        int size = list.size();
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj2), "Leading")) {
                break;
            }
            i11++;
        }
        InterfaceC2534n interfaceC2534n = (InterfaceC2534n) obj2;
        if (interfaceC2534n != null) {
            iL = W0.l(i10, interfaceC2534n.S(MPv3.MAX_MESSAGE_ID));
            iIntValue = ((Number) interfaceC6839p.invoke(interfaceC2534n, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue = 0;
            iL = i10;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i12);
            if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj3), "Trailing")) {
                break;
            }
            i12++;
        }
        InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) obj3;
        if (interfaceC2534n2 != null) {
            iL = W0.l(iL, interfaceC2534n2.S(MPv3.MAX_MESSAGE_ID));
            iIntValue2 = ((Number) interfaceC6839p.invoke(interfaceC2534n2, Integer.valueOf(i10))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj4), "Label")) {
                break;
            }
            i13++;
        }
        Object obj5 = (InterfaceC2534n) obj4;
        int iIntValue3 = obj5 != null ? ((Number) interfaceC6839p.invoke(obj5, Integer.valueOf(iL))).intValue() : 0;
        int size4 = list.size();
        for (int i14 = 0; i14 < size4; i14++) {
            Object obj6 = list.get(i14);
            if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj6), "TextField")) {
                int iIntValue4 = ((Number) interfaceC6839p.invoke(obj6, Integer.valueOf(iL))).intValue();
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i15);
                    if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i15++;
                }
                Object obj8 = (InterfaceC2534n) obj;
                return W0.g(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, obj8 != null ? ((Number) interfaceC6839p.invoke(obj8, Integer.valueOf(iL))).intValue() : 0, V0.h(), interfaceC2535o.getDensity(), this.f14180c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(List list, int i10, InterfaceC6839p interfaceC6839p) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj5 = list.get(i11);
            if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj5), "TextField")) {
                int iIntValue = ((Number) interfaceC6839p.invoke(obj5, Integer.valueOf(i10))).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    obj = null;
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i12);
                    if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj2), "Label")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC2534n interfaceC2534n = (InterfaceC2534n) obj2;
                int iIntValue2 = interfaceC2534n != null ? ((Number) interfaceC6839p.invoke(interfaceC2534n, Integer.valueOf(i10))).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i13);
                    if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC2534n interfaceC2534n2 = (InterfaceC2534n) obj3;
                int iIntValue3 = interfaceC2534n2 != null ? ((Number) interfaceC6839p.invoke(interfaceC2534n2, Integer.valueOf(i10))).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i14);
                    if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                InterfaceC2534n interfaceC2534n3 = (InterfaceC2534n) obj4;
                int iIntValue4 = interfaceC2534n3 != null ? ((Number) interfaceC6839p.invoke(interfaceC2534n3, Integer.valueOf(i10))).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i15);
                    if (AbstractC6492s.d(V0.f((InterfaceC2534n) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i15++;
                }
                InterfaceC2534n interfaceC2534n4 = (InterfaceC2534n) obj;
                return W0.h(iIntValue4, iIntValue3, iIntValue, iIntValue2, interfaceC2534n4 != null ? ((Number) interfaceC6839p.invoke(interfaceC2534n4, Integer.valueOf(i10))).intValue() : 0, V0.h());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        int iX;
        Object obj4;
        List list2 = list;
        int iX1 = mVar.x1(this.f14180c.d());
        int iX12 = mVar.x1(this.f14180c.c());
        int iX13 = mVar.x1(W0.i());
        long jD = Y0.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i10);
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj), "Leading")) {
                break;
            }
            i10++;
        }
        C0.B b10 = (C0.B) obj;
        androidx.compose.ui.layout.t tVarT = b10 != null ? b10.T(jD) : null;
        int iJ = V0.j(tVarT);
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i11);
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        C0.B b11 = (C0.B) obj2;
        androidx.compose.ui.layout.t tVarT2 = b11 != null ? b11.T(Y0.c.o(jD, -iJ, 0, 2, null)) : null;
        int i12 = -iX12;
        int i13 = -(iJ + V0.j(tVarT2));
        long jN = Y0.c.n(jD, i13, i12);
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i14);
            int i15 = size3;
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj3), "Label")) {
                break;
            }
            i14++;
            size3 = i15;
        }
        C0.B b12 = (C0.B) obj3;
        androidx.compose.ui.layout.t tVarT3 = b12 != null ? b12.T(jN) : null;
        if (tVarT3 != null) {
            iX = tVarT3.X(AbstractC2522b.b());
            if (iX == Integer.MIN_VALUE) {
                iX = tVarT3.C0();
            }
        } else {
            iX = 0;
        }
        int iMax = Math.max(iX, iX1);
        long jN2 = Y0.c.n(Y0.b.d(j10, 0, 0, 0, 0, 11, null), i13, tVarT3 != null ? (i12 - iX13) - iMax : (-iX1) - iX12);
        int size4 = list.size();
        int i16 = 0;
        while (i16 < size4) {
            C0.B b13 = (C0.B) list2.get(i16);
            int i17 = size4;
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a(b13), "TextField")) {
                androidx.compose.ui.layout.t tVarT4 = b13.T(jN2);
                long jD2 = Y0.b.d(jN2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list2.get(i18);
                    int i19 = size5;
                    if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj4), "Hint")) {
                        break;
                    }
                    i18++;
                    list2 = list;
                    size5 = i19;
                }
                C0.B b14 = (C0.B) obj4;
                androidx.compose.ui.layout.t tVarT5 = b14 != null ? b14.T(jD2) : null;
                int iH = W0.h(V0.j(tVarT), V0.j(tVarT2), tVarT4.I0(), V0.j(tVarT3), V0.j(tVarT5), j10);
                int iG = W0.g(tVarT4.C0(), tVarT3 != null, iMax, V0.i(tVarT), V0.i(tVarT2), V0.i(tVarT5), j10, mVar.getDensity(), this.f14180c);
                return androidx.compose.ui.layout.m.x0(mVar, iH, iG, null, new c(tVarT3, iX1, iX, iH, iG, tVarT4, tVarT5, tVarT, tVarT2, this, iMax, iX13, mVar), 4, null);
            }
            i16++;
            list2 = list;
            size4 = i17;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return h(interfaceC2535o, list, i10, a.f14181a);
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return j(list, i10, b.f14182a);
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return j(list, i10, e.f14197a);
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return h(interfaceC2535o, list, i10, d.f14196a);
    }
}
