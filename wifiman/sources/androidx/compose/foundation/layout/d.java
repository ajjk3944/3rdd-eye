package androidx.compose.foundation.layout;

import C0.B;
import C0.C;
import C0.D;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f28107a = d(true);

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f28108b = d(false);

    /* renamed from: c, reason: collision with root package name */
    private static final C f28109c = new e(f0.c.f46573a.o(), false);

    /* renamed from: d, reason: collision with root package name */
    private static final C f28110d = b.f28113a;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f28111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f28111a = eVar;
            this.f28112b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            d.a(this.f28111a, interfaceC3540l, L0.a(this.f28112b | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28113a = new b();

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f28114a = new a();

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

        b() {
        }

        @Override // C0.C
        public final D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            return androidx.compose.ui.layout.m.x0(mVar, Y0.b.n(j10), Y0.b.m(j10), null, a.f28114a, 4, null);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            C c10 = f28110d;
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, c10, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(eVar, i10));
        }
    }

    private static final HashMap d(boolean z10) {
        HashMap map = new HashMap(9);
        c.a aVar = f0.c.f46573a;
        e(map, z10, aVar.o());
        e(map, z10, aVar.m());
        e(map, z10, aVar.n());
        e(map, z10, aVar.h());
        e(map, z10, aVar.e());
        e(map, z10, aVar.f());
        e(map, z10, aVar.d());
        e(map, z10, aVar.b());
        e(map, z10, aVar.c());
        return map;
    }

    private static final void e(HashMap map, boolean z10, f0.c cVar) {
        map.put(cVar, new e(cVar, z10));
    }

    private static final c f(B b10) {
        Object objB = b10.b();
        if (objB instanceof c) {
            return (c) objB;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(B b10) {
        c cVarF = f(b10);
        if (cVarF != null) {
            return cVarF.E2();
        }
        return false;
    }

    public static final C h(f0.c cVar, boolean z10) {
        C c10 = (C) (z10 ? f28107a : f28108b).get(cVar);
        return c10 == null ? new e(cVar, z10) : c10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(t.a aVar, androidx.compose.ui.layout.t tVar, B b10, Y0.t tVar2, int i10, int i11, f0.c cVar) {
        f0.c cVarD2;
        c cVarF = f(b10);
        t.a.j(aVar, tVar, ((cVarF == null || (cVarD2 = cVarF.D2()) == null) ? cVar : cVarD2).a(Y0.s.a(tVar.I0(), tVar.C0()), Y0.s.a(i10, i11), tVar2), 0.0f, 2, null);
    }

    public static final C j(f0.c cVar, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        C c10;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:113)");
        }
        if (!AbstractC6492s.d(cVar, f0.c.f46573a.o()) || z10) {
            interfaceC3540l.U(-1710100211);
            boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(cVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.c(z10)) || (i10 & 48) == 32);
            Object objF = interfaceC3540l.f();
            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new e(cVar, z10);
                interfaceC3540l.K(objF);
            }
            c10 = (e) objF;
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(-1710139705);
            interfaceC3540l.J();
            c10 = f28109c;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return c10;
    }
}
