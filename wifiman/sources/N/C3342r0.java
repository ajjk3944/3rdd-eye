package N;

import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import a1.AbstractC3751b;
import androidx.compose.ui.layout.t;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6538n;
import l0.C6537m;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.MPv3;

/* renamed from: N.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3342r0 implements C0.C {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f14717a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14718b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14719c;

    /* renamed from: d, reason: collision with root package name */
    private final z.N f14720d;

    /* renamed from: N.r0$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14721a = new a();

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

    /* renamed from: N.r0$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14722a = new b();

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

    /* renamed from: N.r0$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f14724b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14725c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14726d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14727e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14728f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14729g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f14730h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C3342r0 f14731i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f14732j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.t tVar2, androidx.compose.ui.layout.t tVar3, androidx.compose.ui.layout.t tVar4, androidx.compose.ui.layout.t tVar5, androidx.compose.ui.layout.t tVar6, C3342r0 c3342r0, androidx.compose.ui.layout.m mVar) {
            super(1);
            this.f14723a = i10;
            this.f14724b = i11;
            this.f14725c = tVar;
            this.f14726d = tVar2;
            this.f14727e = tVar3;
            this.f14728f = tVar4;
            this.f14729g = tVar5;
            this.f14730h = tVar6;
            this.f14731i = c3342r0;
            this.f14732j = mVar;
        }

        public final void a(t.a aVar) {
            AbstractC3341q0.k(aVar, this.f14723a, this.f14724b, this.f14725c, this.f14726d, this.f14727e, this.f14728f, this.f14729g, this.f14730h, this.f14731i.f14719c, this.f14731i.f14718b, this.f14732j.getDensity(), this.f14732j.getLayoutDirection(), this.f14731i.f14720d);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: N.r0$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f14733a = new d();

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

    /* renamed from: N.r0$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final e f14734a = new e();

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

    public C3342r0(InterfaceC6835l interfaceC6835l, boolean z10, float f10, z.N n10) {
        this.f14717a = interfaceC6835l;
        this.f14718b = z10;
        this.f14719c = f10;
        this.f14720d = n10;
    }

    private final int h(InterfaceC2535o interfaceC2535o, List list, int i10, InterfaceC6839p interfaceC6839p) {
        Object obj;
        Object obj2;
        int iL;
        int iIntValue;
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
            iL = AbstractC3341q0.l(i10, interfaceC2534n.S(MPv3.MAX_MESSAGE_ID));
            iIntValue = ((Number) interfaceC6839p.invoke(interfaceC2534n, Integer.valueOf(i10))).intValue();
        } else {
            iL = i10;
            iIntValue = 0;
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
            iL = AbstractC3341q0.l(iL, interfaceC2534n2.S(MPv3.MAX_MESSAGE_ID));
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
        int iIntValue3 = obj5 != null ? ((Number) interfaceC6839p.invoke(obj5, Integer.valueOf(AbstractC3751b.c(iL, i10, this.f14719c)))).intValue() : 0;
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
                return AbstractC3341q0.h(iIntValue, iIntValue2, iIntValue4, iIntValue3, obj8 != null ? ((Number) interfaceC6839p.invoke(obj8, Integer.valueOf(iL))).intValue() : 0, this.f14719c, V0.h(), interfaceC2535o.getDensity(), this.f14720d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int j(InterfaceC2535o interfaceC2535o, List list, int i10, InterfaceC6839p interfaceC6839p) {
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
                return AbstractC3341q0.i(iIntValue4, iIntValue3, iIntValue, iIntValue2, interfaceC2534n4 != null ? ((Number) interfaceC6839p.invoke(interfaceC2534n4, Integer.valueOf(i10))).intValue() : 0, this.f14719c, V0.h(), interfaceC2535o.getDensity(), this.f14720d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int iX1 = mVar.x1(this.f14720d.c());
        long jD = Y0.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
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
            obj2 = list.get(i11);
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj2), "Trailing")) {
                break;
            }
            i11++;
        }
        C0.B b11 = (C0.B) obj2;
        androidx.compose.ui.layout.t tVarT2 = b11 != null ? b11.T(Y0.c.o(jD, -iJ, 0, 2, null)) : null;
        int iJ2 = iJ + V0.j(tVarT2);
        int iX12 = mVar.x1(this.f14720d.a(mVar.getLayoutDirection())) + mVar.x1(this.f14720d.b(mVar.getLayoutDirection()));
        int i12 = -iJ2;
        int i13 = -iX1;
        long jN = Y0.c.n(jD, AbstractC3751b.c(i12 - iX12, -iX12, this.f14719c), i13);
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i14);
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj3), "Label")) {
                break;
            }
            i14++;
        }
        C0.B b12 = (C0.B) obj3;
        androidx.compose.ui.layout.t tVarT3 = b12 != null ? b12.T(jN) : null;
        this.f14717a.invoke(C6537m.c(tVarT3 != null ? AbstractC6538n.a(tVarT3.I0(), tVarT3.C0()) : C6537m.f52356b.b()));
        long jD2 = Y0.b.d(Y0.c.n(j10, i12, i13 - Math.max(V0.i(tVarT3) / 2, mVar.x1(this.f14720d.d()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        for (int i15 = 0; i15 < size4; i15++) {
            C0.B b13 = (C0.B) list.get(i15);
            if (AbstractC6492s.d(androidx.compose.ui.layout.f.a(b13), "TextField")) {
                androidx.compose.ui.layout.t tVarT4 = b13.T(jD2);
                long jD3 = Y0.b.d(jD2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i16);
                    int i17 = size5;
                    if (AbstractC6492s.d(androidx.compose.ui.layout.f.a((C0.B) obj4), "Hint")) {
                        break;
                    }
                    i16++;
                    size5 = i17;
                }
                C0.B b14 = (C0.B) obj4;
                androidx.compose.ui.layout.t tVarT5 = b14 != null ? b14.T(jD3) : null;
                int i18 = AbstractC3341q0.i(V0.j(tVarT), V0.j(tVarT2), tVarT4.I0(), V0.j(tVarT3), V0.j(tVarT5), this.f14719c, j10, mVar.getDensity(), this.f14720d);
                int iH = AbstractC3341q0.h(V0.i(tVarT), V0.i(tVarT2), tVarT4.C0(), V0.i(tVarT3), V0.i(tVarT5), this.f14719c, j10, mVar.getDensity(), this.f14720d);
                int size6 = list.size();
                for (int i19 = 0; i19 < size6; i19++) {
                    C0.B b15 = (C0.B) list.get(i19);
                    if (AbstractC6492s.d(androidx.compose.ui.layout.f.a(b15), "border")) {
                        return androidx.compose.ui.layout.m.x0(mVar, i18, iH, null, new c(iH, i18, tVarT, tVarT2, tVarT4, tVarT3, tVarT5, b15.T(Y0.c.a(i18 != Integer.MAX_VALUE ? i18 : 0, i18, iH != Integer.MAX_VALUE ? iH : 0, iH)), this, mVar), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return h(interfaceC2535o, list, i10, a.f14721a);
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return j(interfaceC2535o, list, i10, b.f14722a);
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return j(interfaceC2535o, list, i10, e.f14734a);
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return h(interfaceC2535o, list, i10, d.f14733a);
    }
}
