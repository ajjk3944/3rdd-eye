package Te;

import T.AbstractC3528f1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3545n0;
import T.InterfaceC3551q0;
import T.X0;
import T.t1;
import T.z1;
import Te.H;
import Te.I;
import Te.M;
import Te.V;
import V7.a;
import Y5.a;
import Y5.c;
import Zg.AbstractC3689v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h6.C5953a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k6.InterfaceC6395b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6713l0;
import m0.AbstractC6737x0;
import m0.C6733v0;
import m8.AbstractC6779b;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o6.C7091b;
import oh.AbstractC7137b;
import r.AbstractC7521c;
import r.AbstractC7535j;
import sa.AbstractC7930a;
import sh.AbstractC7978m;
import sh.C7974i;
import x6.b;

/* loaded from: classes4.dex */
public abstract class Q {

    public static final class a implements x6.b {

        /* renamed from: a, reason: collision with root package name */
        private final List f21741a;

        /* renamed from: b, reason: collision with root package name */
        private final float f21742b;

        /* renamed from: c, reason: collision with root package name */
        private final float f21743c;

        /* renamed from: d, reason: collision with root package name */
        private final float f21744d;

        /* renamed from: e, reason: collision with root package name */
        private final float f21745e;

        /* renamed from: f, reason: collision with root package name */
        private final float f21746f;

        /* renamed from: g, reason: collision with root package name */
        private final float f21747g;

        /* renamed from: h, reason: collision with root package name */
        private final float f21748h;

        a(J j10, float f10, float f11) {
            ArrayList arrayList = new ArrayList();
            Iterator it = j10.a().iterator();
            while (it.hasNext()) {
                List<G> listA = ((H) it.next()).a();
                ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listA, 10));
                for (G g10 : listA) {
                    arrayList2.add(new x6.c(g10.a(), g10.b()));
                }
                arrayList.add(arrayList2);
            }
            if (!j10.c().isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (K k10 : j10.c()) {
                    arrayList3.add(new x6.c(k10.b(), f10));
                    arrayList3.add(new x6.c(k10.b(), f11));
                    arrayList3.add(new x6.c(k10.a(), f11));
                    arrayList3.add(new x6.c(k10.a(), f10));
                }
                arrayList.add(arrayList3);
            }
            this.f21741a = arrayList;
            this.f21742b = j10.e().b();
            this.f21743c = j10.e().a();
            this.f21744d = f10;
            this.f21745e = f11;
            this.f21747g = 1.0f;
            this.f21748h = 1.0f;
        }

        @Override // x6.b
        public float a() {
            return this.f21745e;
        }

        @Override // x6.b
        public float b() {
            return this.f21743c;
        }

        @Override // x6.b
        public float c() {
            return this.f21744d;
        }

        @Override // x6.b
        public float d() {
            return this.f21748h;
        }

        @Override // x6.b
        public float e() {
            return this.f21742b;
        }

        @Override // x6.b
        public List f() {
            return this.f21741a;
        }

        @Override // x6.b
        public float g() {
            return this.f21747g;
        }

        @Override // x6.b
        public int getId() {
            return b.a.a(this);
        }

        @Override // x6.b
        public float h() {
            return this.f21746f;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3583h f21749a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6784a f21750b;

        b(C3583h c3583h, AbstractC6784a abstractC6784a) {
            this.f21749a = c3583h;
            this.f21750b = abstractC6784a;
        }

        public final long a(H line, float f10) {
            AbstractC6492s.i(line, "line");
            if (!(line instanceof H.b)) {
                if (line instanceof H.a) {
                    return ((H.a) line).b().m2getColorvNxB06k(this.f21750b);
                }
                throw new NoWhenBranchMatchedException();
            }
            M mA = this.f21749a.a();
            if (mA instanceof M.b.C0800b) {
                return Ne.f.e(S8.l.f20404f.a(AbstractC7137b.e(f10)), this.f21750b, null, 2, null);
            }
            if (mA instanceof M.b.a.C0798a) {
                return Ne.f.e(a.C0841a.f23089e.a(AbstractC7137b.e(f10)), this.f21750b, null, 2, null);
            }
            if (mA instanceof M.b.a.C0799b) {
                return Ne.f.e(a.b.f23092e.a(AbstractC7137b.e(f10)), this.f21750b, null, 2, null);
            }
            if ((mA instanceof M.c) || (mA instanceof M.a)) {
                return this.f21750b.a().b().f();
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C6733v0.g(a((H) obj, ((Number) obj2).floatValue()));
        }
    }

    public static final class c implements z6.c {

        /* renamed from: a, reason: collision with root package name */
        private final String f21751a = "%.0f";

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7974i f21752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ M f21753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f21754d;

        c(C7974i c7974i, M m10, Context context) {
            this.f21752b = c7974i;
            this.f21753c = m10;
            this.f21754d = context;
        }

        @Override // z6.c
        public CharSequence a(float f10, InterfaceC6395b chartValues) {
            String string;
            AbstractC6492s.i(chartValues, "chartValues");
            if (f10 != this.f21752b.i()) {
                String str = String.format(this.f21751a, Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
                AbstractC6492s.h(str, "format(...)");
                return str;
            }
            M m10 = this.f21753c;
            if (m10 instanceof M.b) {
                string = this.f21754d.getString(AbstractC6780c.f53564q4);
            } else if (m10 instanceof M.c) {
                string = this.f21754d.getString(AbstractC6780c.f53578s4);
            } else {
                if (!(m10 instanceof M.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = this.f21754d.getString(AbstractC6780c.f53592u4);
            }
            AbstractC6492s.f(string);
            return string;
        }
    }

    public static final void c(final androidx.compose.ui.e modifier, final J model, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        Typeface typefaceH;
        InterfaceC3540l interfaceC3540l2;
        z1 z1Var;
        long jG;
        V.b bVar;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-755464125);
        int i11 = (i10 & 6) == 0 ? (interfaceC3540lR.T(modifier) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-755464125, i12, -1, "com.ui.wifiman.ui.signal.components.SignalMapperChart (SignalChart.kt:170)");
            }
            if (Build.VERSION.SDK_INT > 26) {
                interfaceC3540lR.U(1380089781);
                typefaceH = ((Context) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.g())).getResources().getFont(AbstractC6779b.f53268a);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(1380172427);
                typefaceH = W5.b.a(interfaceC3540lR, 0).a().h();
                interfaceC3540lR.J();
            }
            AbstractC6492s.f(typefaceH);
            C3583h c3583hJ = j(model.f(), interfaceC3540lR, 0);
            C3581g c3581gH = h(c3583hJ, interfaceC3540lR, 0);
            interfaceC3540l2 = interfaceC3540lR;
            C7091b c7091bA = P5.a.a(c3581gH.a(), Y0.h.j(1), E.h.a(0.5f), null, null, 0.0f, 0L, interfaceC3540lR, 48, 120);
            interfaceC3540l2.U(-94014367);
            Object objF = interfaceC3540l2.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(null, null, 2, null);
                interfaceC3540l2.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540l2.J();
            if (interfaceC3551q0.getValue() != model.d()) {
                interfaceC3540l2.U(1380674751);
                interfaceC3551q0.setValue(model.d());
                M mF = model.f();
                interfaceC3540l2.U(-94007428);
                boolean zT = interfaceC3540l2.T(mF);
                Object objF2 = interfaceC3540l2.f();
                if (zT || objF2 == aVar.a()) {
                    objF2 = AbstractC3528f1.a(c3583hJ.d().j());
                    interfaceC3540l2.K(objF2);
                }
                interfaceC3540l2.J();
                interfaceC3540l2.J();
                z1Var = (InterfaceC3545n0) objF2;
            } else {
                interfaceC3540l2.U(1380812980);
                z1 z1VarE = AbstractC7521c.e(c3583hJ.d().j(), AbstractC7535j.l(1000, 0, null, 6, null), "y axis", null, interfaceC3540l2, 432, 8);
                interfaceC3540l2.J();
                z1Var = z1VarE;
            }
            Ie.d dVar = new Ie.d(c.b.a.f24604a, c3583hJ.b(), c3583hJ.e(), L5.a.a(C6562a.f52458a.a(interfaceC3540l2, C6562a.f52459b).f().c(), 0L, null, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, typefaceH, null, interfaceC3540l2, 0, 0, 1534), c7091bA, null, new a.C0936a(c3583hJ.c()));
            interfaceC3540l2.U(-93984446);
            Object objF3 = interfaceC3540l2.f();
            if (objF3 == aVar.a()) {
                objF3 = AbstractC3689v.o(Float.valueOf(10000.0f), Float.valueOf(20000.0f));
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            Ie.c cVar = new Ie.c((List) objF3, null, null, c7091bA, null, 6, null);
            ArrayList arrayList = new ArrayList();
            for (H h10 : model.a()) {
                G g10 = (G) AbstractC3689v.D0(h10.a());
                arrayList.add(new C5953a.C1790a(AbstractC6737x0.j(g10 != null ? ((C6733v0) c3581gH.c().invoke(h10, Float.valueOf(g10.c()))).u() : C6733v0.f52951b.a()), 1.0f, new R5.a((AbstractC6713l0) c3581gH.b().invoke(h10)), null, null, 0.0f, null, null, null, 0.0f, null, 2040, null));
            }
            if (!model.c().isEmpty()) {
                arrayList.add(new C5953a.C1790a(AbstractC6737x0.j(C6733v0.f52951b.d()), 0.0f, new R5.a(c3581gH.d()), null, null, 0.0f, null, null, null, 0.0f, null, 2042, null));
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C5953a.C1790a(0, 0.0f, null, null, null, 0.0f, null, null, null, 0.0f, null, 2047, null));
            }
            C5953a c5953aA = N5.a.a(arrayList, 0.0f, C5953a.b.Start, null, null, null, null, interfaceC3540l2, 384, 122);
            V v10 = V.f21763a;
            AbstractC6784a.b bVar2 = AbstractC6784a.b.f53648a;
            long jB = bVar2.f().b();
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            V.a aVarA = v10.a(jB, c6562a.a(interfaceC3540l2, i13).a().b().f(), interfaceC3540l2, 384);
            long jB2 = bVar2.f().b();
            AbstractC6784a abstractC6784aA = c6562a.a(interfaceC3540l2, i13);
            if (abstractC6784aA instanceof AbstractC6784a.d) {
                interfaceC3540l2.U(-93927646);
                jG = c6562a.a(interfaceC3540l2, i13).a().g().c();
                interfaceC3540l2.J();
            } else {
                if (!(abstractC6784aA instanceof AbstractC6784a.b)) {
                    interfaceC3540l2.U(-93930388);
                    interfaceC3540l2.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l2.U(-93925407);
                jG = c6562a.a(interfaceC3540l2, i13).a().g().g();
                interfaceC3540l2.J();
            }
            V.a aVarA2 = v10.a(jB2, jG, interfaceC3540l2, 384);
            interfaceC3540l2.U(-93920839);
            List<I> listB = model.b();
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(listB, 10));
            for (I i14 : listB) {
                if (i14 instanceof I.a) {
                    interfaceC3540l2.U(1723594653);
                    I.a aVar2 = (I.a) i14;
                    bVar = new V.b(aVar2.b(), aVar2.c(), AbstractC7930a.b(aVar2.a(), interfaceC3540l2, 0), aVarA);
                    interfaceC3540l2.J();
                } else {
                    if (!(i14 instanceof I.b)) {
                        interfaceC3540l2.U(1723592540);
                        interfaceC3540l2.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l2.U(1723602942);
                    I.b bVar3 = (I.b) i14;
                    bVar = new V.b(bVar3.b(), bVar3.c(), AbstractC7930a.b(bVar3.a(), interfaceC3540l2, 0), aVarA2);
                    interfaceC3540l2.J();
                }
                arrayList2.add(bVar);
            }
            interfaceC3540l2.J();
            c5953aA.z(arrayList2);
            M5.a.a(c5953aA, e(model, c3583hJ.d().i(), ((Number) z1Var.getValue()).intValue(), interfaceC3540l2, (i12 >> 3) & 14), androidx.compose.foundation.layout.r.i(modifier, Y0.h.j(192)), null, null, dVar, cVar, null, null, null, O5.b.a(false, null, null, null, interfaceC3540l2, 6, 14), false, null, null, null, null, interfaceC3540l2, 0, 48, 62360);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.P
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.d(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(androidx.compose.ui.e eVar, J j10, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        c(eVar, j10, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final x6.b e(J j10, float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(377912447);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(377912447, i10, -1, "com.ui.wifiman.ui.signal.components.chartEntryModel (SignalChart.kt:493)");
        }
        a aVar = new a(j10, f10, f11);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar;
    }

    private static final List f(M m10) {
        boolean z10 = m10 instanceof M.b.C0800b;
        Float fValueOf = Float.valueOf(-60.0f);
        Float fValueOf2 = Float.valueOf(-70.0f);
        Float fValueOf3 = Float.valueOf(-80.0f);
        Float fValueOf4 = Float.valueOf(-90.0f);
        if (z10) {
            return AbstractC3689v.o(fValueOf4, fValueOf3, fValueOf2, fValueOf, Float.valueOf(-50.0f), Float.valueOf(-40.0f), Float.valueOf(-30.0f), Float.valueOf(-20.0f));
        }
        if (m10 instanceof M.b.a.C0798a) {
            return AbstractC3689v.o(Float.valueOf(-100.0f), fValueOf4, fValueOf3, fValueOf2, fValueOf, Float.valueOf(-50.0f), Float.valueOf(-40.0f));
        }
        if (m10 instanceof M.b.a.C0799b) {
            return AbstractC3689v.o(Float.valueOf(-120.0f), Float.valueOf(-110.0f), Float.valueOf(-100.0f), fValueOf4, fValueOf3, fValueOf2, fValueOf);
        }
        if (m10 instanceof M.c.f) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(5.0f), Float.valueOf(10.0f), Float.valueOf(15.0f), Float.valueOf(20.0f), Float.valueOf(30.0f), Float.valueOf(40.0f), Float.valueOf(50.0f));
        }
        if (m10 instanceof M.c.j) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(30.0f), Float.valueOf(40.0f), Float.valueOf(50.0f), Float.valueOf(60.0f), Float.valueOf(80.0f), Float.valueOf(100.0f));
        }
        if (m10 instanceof M.c.C0801c) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(40.0f), Float.valueOf(60.0f), Float.valueOf(80.0f), Float.valueOf(100.0f), Float.valueOf(150.0f), Float.valueOf(200.0f));
        }
        if (m10 instanceof M.c.e) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(50.0f), Float.valueOf(100.0f), Float.valueOf(150.0f), Float.valueOf(200.0f), Float.valueOf(250.0f), Float.valueOf(300.0f));
        }
        if (m10 instanceof M.c.g) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(50.0f), Float.valueOf(100.0f), Float.valueOf(150.0f), Float.valueOf(200.0f), Float.valueOf(250.0f), Float.valueOf(300.0f), Float.valueOf(400.0f), Float.valueOf(500.0f));
        }
        if (m10 instanceof M.c.i) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(200.0f), Float.valueOf(300.0f), Float.valueOf(400.0f), Float.valueOf(500.0f), Float.valueOf(600.0f), Float.valueOf(800.0f), Float.valueOf(1000.0f));
        }
        if (m10 instanceof M.c.b) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(200.0f), Float.valueOf(400.0f), Float.valueOf(600.0f), Float.valueOf(800.0f), Float.valueOf(1000.0f), Float.valueOf(1500.0f), Float.valueOf(2000.0f));
        }
        if (m10 instanceof M.c.d) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(500.0f), Float.valueOf(1000.0f), Float.valueOf(1500.0f), Float.valueOf(2000.0f), Float.valueOf(2500.0f), Float.valueOf(3000.0f));
        }
        if (m10 instanceof M.c.h) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(1000.0f), Float.valueOf(2000.0f), Float.valueOf(3000.0f), Float.valueOf(4000.0f), Float.valueOf(5000.0f), Float.valueOf(6000.0f), Float.valueOf(8000.0f), Float.valueOf(10000.0f));
        }
        if (m10 instanceof M.c.a) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(2000.0f), Float.valueOf(4000.0f), Float.valueOf(6000.0f), Float.valueOf(8000.0f), Float.valueOf(10000.0f), Float.valueOf(15000.0f), Float.valueOf(20000.0f));
        }
        if (m10 instanceof M.a.f) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(10.0f), Float.valueOf(20.0f), Float.valueOf(30.0f), Float.valueOf(40.0f), Float.valueOf(50.0f));
        }
        if (m10 instanceof M.a.b) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(25.0f), Float.valueOf(50.0f), Float.valueOf(75.0f), Float.valueOf(100.0f), Float.valueOf(150.0f), Float.valueOf(200.0f));
        }
        if (m10 instanceof M.a.d) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(50.0f), Float.valueOf(100.0f), Float.valueOf(150.0f), Float.valueOf(200.0f), Float.valueOf(300.0f), Float.valueOf(400.0f), Float.valueOf(500.0f));
        }
        if (m10 instanceof M.a.e) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(100.0f), Float.valueOf(200.0f), Float.valueOf(300.0f), Float.valueOf(400.0f), Float.valueOf(500.0f), Float.valueOf(600.0f), Float.valueOf(800.0f), Float.valueOf(1000.0f));
        }
        if (m10 instanceof M.a.C0797a) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(200.0f), Float.valueOf(400.0f), Float.valueOf(600.0f), Float.valueOf(800.0f), Float.valueOf(1000.0f), Float.valueOf(1500.0f), Float.valueOf(2000.0f));
        }
        if (m10 instanceof M.a.c) {
            return AbstractC3689v.o(Float.valueOf(0.0f), Float.valueOf(500.0f), Float.valueOf(1000.0f), Float.valueOf(1500.0f), Float.valueOf(2000.0f), Float.valueOf(2500.0f), Float.valueOf(3000.0f));
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final C7974i g(M m10) {
        if (m10 instanceof M.b.C0800b) {
            return new C7974i(-90, -15);
        }
        if (m10 instanceof M.b.a.C0798a) {
            return new C7974i(-100, -30);
        }
        if (m10 instanceof M.b.a.C0799b) {
            return new C7974i(-120, -50);
        }
        if (m10 instanceof M.c.f) {
            return new C7974i(0, 21);
        }
        if (m10 instanceof M.c.j) {
            return new C7974i(0, 55);
        }
        if (m10 instanceof M.c.C0801c) {
            return new C7974i(0, 105);
        }
        if (m10 instanceof M.c.e) {
            return new C7974i(0, 205);
        }
        if (m10 instanceof M.c.g) {
            return new C7974i(0, 310);
        }
        if (m10 instanceof M.c.i) {
            return new C7974i(0, 510);
        }
        if (m10 instanceof M.c.b) {
            return new C7974i(0, 1010);
        }
        if (m10 instanceof M.c.d) {
            return new C7974i(0, 2010);
        }
        if (m10 instanceof M.c.h) {
            return new C7974i(0, 5010);
        }
        if (m10 instanceof M.c.a) {
            return new C7974i(0, 10010);
        }
        if (m10 instanceof M.a.f) {
            return new C7974i(0, 51);
        }
        if (m10 instanceof M.a.b) {
            return new C7974i(0, 101);
        }
        if (m10 instanceof M.a.d) {
            return new C7974i(0, 201);
        }
        if (m10 instanceof M.a.e) {
            return new C7974i(0, 502);
        }
        if (m10 instanceof M.a.C0797a) {
            return new C7974i(0, 1010);
        }
        if (m10 instanceof M.a.c) {
            return new C7974i(0, 2010);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final C3581g h(final C3583h c3583h, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1290228127);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1290228127, i10, -1, "com.ui.wifiman.ui.signal.components.rememberChartColors (SignalChart.kt:317)");
        }
        final AbstractC6784a abstractC6784aA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b);
        interfaceC3540l.U(-619715999);
        boolean zT = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(c3583h)) || (i10 & 6) == 4) | interfaceC3540l.T(abstractC6784aA);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            final b bVar = new b(c3583h, abstractC6784aA);
            objF = new C3581g(abstractC6784aA.a().g().f(), abstractC6784aA.f().c(), bVar, new InterfaceC6835l() { // from class: Te.O
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return Q.i(abstractC6784aA, c3583h, bVar, (H) obj);
                }
            }, AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.k(abstractC6784aA.a().l().f(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(abstractC6784aA.a().l().f(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null), null);
            interfaceC3540l.K(objF);
        }
        C3581g c3581g = (C3581g) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c3581g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC6713l0 i(AbstractC6784a abstractC6784a, C3583h c3583h, InterfaceC6839p interfaceC6839p, H line) {
        AbstractC6492s.i(line, "line");
        if (line instanceof H.a) {
            H.a aVar = (H.a) line;
            return AbstractC6713l0.a.i(AbstractC6713l0.f52928b, AbstractC3689v.o(C6733v0.g(C6733v0.k(aVar.b().m2getColorvNxB06k(abstractC6784a), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(aVar.b().m2getColorvNxB06k(abstractC6784a), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null);
        }
        if (!(line instanceof H.b)) {
            throw new NoWhenBranchMatchedException();
        }
        M mA = c3583h.a();
        if (!(mA instanceof M.b)) {
            if (!(mA instanceof M.c) && !(mA instanceof M.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC6713l0.a aVar2 = AbstractC6713l0.f52928b;
            H.b.a aVar3 = H.b.f21642b;
            return AbstractC6713l0.a.i(aVar2, AbstractC3689v.o(C6733v0.g(C6733v0.k(((C6733v0) interfaceC6839p.invoke(aVar3.a(), Float.valueOf(0.0f))).u(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), C6733v0.g(C6733v0.k(((C6733v0) interfaceC6839p.invoke(aVar3.a(), Float.valueOf(0.0f))).u(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, null);
        }
        float f10 = 10;
        float fI = (c3583h.d().i() - c3583h.d().j()) / f10;
        AbstractC6713l0.a aVar4 = AbstractC6713l0.f52928b;
        C7974i c7974iS = AbstractC7978m.s(0, 10);
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974iS, 10));
        Iterator it = c7974iS.iterator();
        while (it.hasNext()) {
            float fD = ((Zg.Q) it).d();
            arrayList.add(C6733v0.g(C6733v0.k(((C6733v0) interfaceC6839p.invoke(H.b.f21642b.a(), Float.valueOf(c3583h.d().j() + (fI * fD)))).u(), 0.5f - ((0.5f / f10) * fD), 0.0f, 0.0f, 0.0f, 14, null)));
        }
        return AbstractC6713l0.a.i(aVar4, arrayList, 0.0f, 0.0f, 0, 14, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 ??, still in use, count: 1, list:
          (r7v0 ?? I:java.lang.Object) from 0x008c: INVOKE (r9v0 ?? I:T.l), (r7v0 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final Te.C3583h j(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 ??, still in use, count: 1, list:
          (r7v0 ?? I:java.lang.Object) from 0x008c: INVOKE (r9v0 ?? I:T.l), (r7v0 ?? I:java.lang.Object) INTERFACE call: T.l.K(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
}
