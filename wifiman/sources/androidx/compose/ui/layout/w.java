package androidx.compose.ui.layout;

import E0.G;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3550q;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final a f29074a = new a();

    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29075a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29076b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29077c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29078d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f29075a = eVar;
            this.f29076b = interfaceC6839p;
            this.f29077c = i10;
            this.f29078d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            w.a(this.f29075a, this.f29076b, interfaceC3540l, L0.a(this.f29077c | 1), this.f29078d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f29079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(0);
            this.f29079a = xVar;
        }

        public final void a() {
            this.f29079a.d();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f29080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f29081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29082c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29083d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29084e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(x xVar, androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f29080a = xVar;
            this.f29081b = eVar;
            this.f29082c = interfaceC6839p;
            this.f29083d = i10;
            this.f29084e = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            w.b(this.f29080a, this.f29081b, this.f29082c, interfaceC3540l, L0.a(this.f29083d | 1), this.f29084e);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new x();
                interfaceC3540lR.K(objF);
            }
            b((x) objF, eVar, interfaceC6839p, interfaceC3540lR, (i12 << 3) & 1008, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(eVar, interfaceC6839p, i10, i11));
        }
    }

    public static final void b(x xVar, androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.l(xVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            AbstractC3550q abstractC3550qD = AbstractC3536j.d(interfaceC3540lR, 0);
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            InterfaceC6824a interfaceC6824aA = G.f3617X.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, xVar, xVar.g());
            E1.c(interfaceC3540lA, abstractC3550qD, xVar.e());
            E1.c(interfaceC3540lA, interfaceC6839p, xVar.f());
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            interfaceC3540lR.R();
            if (interfaceC3540lR.v()) {
                interfaceC3540lR.U(-26502501);
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(-26580342);
                boolean zL = interfaceC3540lR.l(xVar);
                Object objF = interfaceC3540lR.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new c(xVar);
                    interfaceC3540lR.K(objF);
                }
                O.g((InterfaceC6824a) objF, interfaceC3540lR, 0);
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new d(xVar, eVar2, interfaceC6839p, i10, i11));
        }
    }
}
