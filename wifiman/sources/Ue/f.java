package Ue;

import C0.B;
import C0.D;
import C0.U;
import Ii.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.O;
import T.X0;
import T.t1;
import Y0.s;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.graphics.Bitmap;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.w;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.AbstractC6679O;
import m0.J0;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7391j;
import r.AbstractC7535j;
import s.AbstractC7833F;
import s9.d;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class f {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f22395a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Long f22396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f22397c;

        a(long j10, Long l10, InterfaceC6824a interfaceC6824a) {
            this.f22395a = j10;
            this.f22396b = l10;
            this.f22397c = interfaceC6824a;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1018025469, i10, -1, "com.ui.wifiman.ui.signal.floorplan.component.ComposeFloorplanPreview.<anonymous>.<anonymous>.<anonymous> (ComposeFloorplanPreview.kt:49)");
            }
            f.i(Y0.r.g(this.f22395a), Y0.r.f(this.f22395a), this.f22396b, this.f22397c, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f22398a;

        b(InterfaceC3551q0 interfaceC3551q0) {
            this.f22398a = interfaceC3551q0;
        }

        public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.c(z10) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(300729565, i10, -1, "com.ui.wifiman.ui.signal.floorplan.component.PreviewContentMeasured.<anonymous> (ComposeFloorplanPreview.kt:78)");
            }
            J0 j0K = f.k(this.f22398a);
            if (!z10 || j0K == null) {
                interfaceC3540l.U(-2137930834);
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.d(H9.a.a(androidx.compose.foundation.b.d(eVarF, c6562a.a(interfaceC3540l, i11).e().b(), null, 2, null), interfaceC3540l, 0), c6562a.a(interfaceC3540l, i11).a().g().e(), null, 2, null), interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-2138296045);
                AbstractC7833F.c(j0K, AbstractC7930a.b(new d.b(AbstractC6780c.f53583t2), interfaceC3540l, 0), androidx.compose.foundation.b.d(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), AbstractC6784a.b.f53648a.e().a(), null, 2, null), null, null, 0.0f, null, 0, interfaceC3540l, 0, 248);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f22399a;

        /* renamed from: b, reason: collision with root package name */
        int f22400b;

        /* renamed from: c, reason: collision with root package name */
        Object f22401c;

        /* renamed from: d, reason: collision with root package name */
        int f22402d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Long f22403e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f22404f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f22405g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f22406h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f22407i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Long l10, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f22403e = l10;
            this.f22404f = interfaceC6824a;
            this.f22405g = i10;
            this.f22406h = i11;
            this.f22407i = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f22403e, this.f22404f, this.f22405g, this.f22406h, this.f22407i, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            int i11;
            InterfaceC3551q0 interfaceC3551q0;
            InterfaceC3551q0 interfaceC3551q02;
            Object objG = AbstractC5467b.g();
            int i12 = this.f22402d;
            if (i12 == 0) {
                v.b(obj);
                Long l10 = this.f22403e;
                if (l10 != null) {
                    InterfaceC6824a interfaceC6824a = this.f22404f;
                    int i13 = this.f22405g;
                    int i14 = this.f22406h;
                    InterfaceC3551q0 interfaceC3551q03 = this.f22407i;
                    InterfaceC6839p interfaceC6839p = (InterfaceC6839p) interfaceC6824a.invoke();
                    this.f22401c = interfaceC3551q03;
                    this.f22399a = i13;
                    this.f22400b = i14;
                    this.f22402d = 1;
                    obj = interfaceC6839p.invoke(l10, this);
                    if (obj == objG) {
                        return objG;
                    }
                    i10 = i13;
                    i11 = i14;
                    interfaceC3551q0 = interfaceC3551q03;
                }
                return J.f24997a;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3551q02 = (InterfaceC3551q0) this.f22401c;
                v.b(obj);
                f.l(interfaceC3551q02, AbstractC6679O.c((Bitmap) obj));
                return J.f24997a;
            }
            i11 = this.f22400b;
            i10 = this.f22399a;
            interfaceC3551q0 = (InterfaceC3551q0) this.f22401c;
            v.b(obj);
            g gVar = (g) obj;
            if (gVar != null) {
                this.f22401c = interfaceC3551q0;
                this.f22402d = 2;
                obj = gVar.c(i10, i11, this);
                if (obj == objG) {
                    return objG;
                }
                interfaceC3551q02 = interfaceC3551q0;
                f.l(interfaceC3551q02, AbstractC6679O.c((Bitmap) obj));
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final void e(final androidx.compose.ui.e modifier, final Long l10, final InterfaceC6824a floorplanControllerLoader, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(floorplanControllerLoader, "floorplanControllerLoader");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(93012101);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(l10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(floorplanControllerLoader) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(93012101, i11, -1, "com.ui.wifiman.ui.signal.floorplan.component.ComposeFloorplanPreview (ComposeFloorplanPreview.kt:34)");
            }
            interfaceC3540lR.U(55740178);
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: Ue.b
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return f.f(l10, floorplanControllerLoader, (U) obj, (Y0.b) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            w.a(modifier, (InterfaceC6839p) objF, interfaceC3540lR, i11 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ue.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.h(modifier, l10, floorplanControllerLoader, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D f(Long l10, InterfaceC6824a interfaceC6824a, U SubcomposeLayout, Y0.b bVar) {
        AbstractC6492s.i(SubcomposeLayout, "$this$SubcomposeLayout");
        List listQ1 = SubcomposeLayout.Q1("preview", Ue.a.f22380a.a());
        ArrayList<t> arrayList = new ArrayList(AbstractC3689v.w(listQ1, 10));
        Iterator it = listQ1.iterator();
        while (it.hasNext()) {
            arrayList.add(((B) it.next()).T(bVar.r()));
        }
        long jA = Y0.r.f24545b.a();
        for (t tVar : arrayList) {
            jA = s.a(Math.max(Y0.r.g(jA), tVar.I0()), Math.max(Y0.r.f(jA), tVar.C0()));
        }
        final t tVarT = ((B) SubcomposeLayout.Q1("content", b0.c.c(-1018025469, true, new a(jA, l10, interfaceC6824a))).get(0)).T(bVar.r());
        return androidx.compose.ui.layout.m.x0(SubcomposeLayout, Y0.r.g(jA), Y0.r.f(jA), null, new InterfaceC6835l() { // from class: Ue.d
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return f.g(tVarT, (t.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(t tVar, t.a layout) {
        AbstractC6492s.i(layout, "$this$layout");
        t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, Long l10, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        e(eVar, l10, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final int i10, final int i11, final Long l10, final InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, final int i12) {
        int i13;
        int i14;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(189867486);
        if ((i12 & 6) == 0) {
            i13 = (interfaceC3540lR.i(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= interfaceC3540lR.i(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= interfaceC3540lR.T(l10) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= interfaceC3540lR.l(interfaceC6824a) ? 2048 : 1024;
        }
        if ((i13 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(189867486, i13, -1, "com.ui.wifiman.ui.signal.floorplan.component.PreviewContentMeasured (ComposeFloorplanPreview.kt:69)");
            }
            interfaceC3540lR.U(795911218);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(null, null, 2, null);
                interfaceC3540lR.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540lR.J();
            AbstractC7391j.a(Boolean.valueOf(k(interfaceC3551q0) != null), androidx.compose.foundation.layout.r.w(androidx.compose.ui.e.f28771b0, Y0.h.j(i10), Y0.h.j(i11)), AbstractC7535j.l(500, 0, null, 6, null), "PreviewContentMeasured", b0.c.e(300729565, true, new b(interfaceC3551q0), interfaceC3540lR, 54), interfaceC3540lR, 28032, 0);
            interfaceC3540lR.U(795945077);
            boolean z10 = ((i13 & 7168) == 2048) | ((i13 & 896) == 256) | ((i13 & 14) == 4) | ((i13 & 112) == 32);
            Object objF2 = interfaceC3540lR.f();
            if (z10 || objF2 == aVar.a()) {
                i14 = i13;
                interfaceC3540l2 = interfaceC3540lR;
                c cVar = new c(l10, interfaceC6824a, i10, i11, interfaceC3551q0, null);
                interfaceC3540l2.K(cVar);
                objF2 = cVar;
            } else {
                i14 = i13;
                interfaceC3540l2 = interfaceC3540lR;
            }
            interfaceC3540l2.J();
            O.f(l10, (InterfaceC6839p) objF2, interfaceC3540l2, (i14 >> 6) & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ue.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.j(i10, i11, l10, interfaceC6824a, i12, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(int i10, int i11, Long l10, InterfaceC6824a interfaceC6824a, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        i(i10, i11, l10, interfaceC6824a, interfaceC3540l, L0.a(i12 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J0 k(InterfaceC3551q0 interfaceC3551q0) {
        return (J0) interfaceC3551q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC3551q0 interfaceC3551q0, J0 j02) {
        interfaceC3551q0.setValue(j02);
    }
}
