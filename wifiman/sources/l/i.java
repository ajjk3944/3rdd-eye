package L;

import C0.AbstractC2522b;
import C0.D;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import E0.AbstractC2640s;
import E0.B;
import E0.E;
import E0.r;
import E0.v0;
import E0.w0;
import J0.w;
import L0.C3174d;
import L0.InterfaceC3186p;
import L0.M;
import L0.U;
import Q0.AbstractC3434k;
import W0.j;
import W0.k;
import W0.l;
import Y0.v;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import com.google.ar.core.ImageMetadata;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6713l0;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import m0.InterfaceC6739y0;
import m0.g1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.InterfaceC7036c;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public final class i extends e.c implements B, r, v0 {

    /* renamed from: n, reason: collision with root package name */
    private String f10947n;

    /* renamed from: o, reason: collision with root package name */
    private U f10948o;

    /* renamed from: p, reason: collision with root package name */
    private AbstractC3434k.b f10949p;

    /* renamed from: q, reason: collision with root package name */
    private int f10950q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10951r;

    /* renamed from: s, reason: collision with root package name */
    private int f10952s;

    /* renamed from: t, reason: collision with root package name */
    private int f10953t;

    /* renamed from: u, reason: collision with root package name */
    private InterfaceC6739y0 f10954u;

    /* renamed from: v, reason: collision with root package name */
    private Map f10955v;

    /* renamed from: w, reason: collision with root package name */
    private L.f f10956w;

    /* renamed from: x, reason: collision with root package name */
    private InterfaceC6835l f10957x;

    /* renamed from: y, reason: collision with root package name */
    private a f10958y;

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            L.f fVarM2 = i.this.M2();
            U u10 = i.this.f10948o;
            InterfaceC6739y0 interfaceC6739y0 = i.this.f10954u;
            M mO = fVarM2.o(u10.K((16609105 & 1) != 0 ? C6733v0.f52951b.e() : interfaceC6739y0 != null ? interfaceC6739y0.a() : C6733v0.f52951b.e(), (16609105 & 2) != 0 ? v.f24549b.a() : 0L, (16609105 & 4) != 0 ? null : null, (16609105 & 8) != 0 ? null : null, (16609105 & 16) != 0 ? null : null, (16609105 & 32) != 0 ? null : null, (16609105 & 64) != 0 ? null : null, (16609105 & 128) != 0 ? v.f24549b.a() : 0L, (16609105 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : null, (16609105 & 512) != 0 ? null : null, (16609105 & 1024) != 0 ? null : null, (16609105 & 2048) != 0 ? C6733v0.f52951b.e() : 0L, (16609105 & 4096) != 0 ? null : null, (16609105 & 8192) != 0 ? null : null, (16609105 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? null : null, (16609105 & 32768) != 0 ? j.f23523b.g() : 0, (16609105 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? l.f23537b.f() : 0, (16609105 & 131072) != 0 ? v.f24549b.a() : 0L, (16609105 & 262144) != 0 ? null : null, (16609105 & ImageMetadata.LENS_APERTURE) != 0 ? null : null, (16609105 & ImageMetadata.SHADING_MODE) != 0 ? W0.f.f23488b.b() : 0, (16609105 & 2097152) != 0 ? W0.e.f23483b.c() : 0, (16609105 & 4194304) != 0 ? null : null, (16609105 & 8388608) != 0 ? null : null));
            if (mO != null) {
                list.add(mO);
            } else {
                mO = null;
            }
            return Boolean.valueOf(mO != null);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3174d c3174d) {
            i.this.P2(c3174d.k());
            i.this.O2();
            return Boolean.TRUE;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {
        d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            if (i.this.f10958y == null) {
                return Boolean.FALSE;
            }
            a aVar = i.this.f10958y;
            if (aVar != null) {
                aVar.e(z10);
            }
            i.this.O2();
            return Boolean.TRUE;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            i.this.K2();
            i.this.O2();
            return Boolean.TRUE;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f10967a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t tVar) {
            super(1);
            this.f10967a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f10967a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ i(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6739y0 interfaceC6739y0, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, u10, bVar, i10, z10, i11, i12, interfaceC6739y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K2() {
        this.f10958y = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L.f M2() {
        if (this.f10956w == null) {
            this.f10956w = new L.f(this.f10947n, this.f10948o, this.f10949p, this.f10950q, this.f10951r, this.f10952s, this.f10953t, null);
        }
        L.f fVar = this.f10956w;
        AbstractC6492s.f(fVar);
        return fVar;
    }

    private final L.f N2(Y0.d dVar) {
        L.f fVarA;
        a aVar = this.f10958y;
        if (aVar != null && aVar.c() && (fVarA = aVar.a()) != null) {
            fVarA.m(dVar);
            return fVarA;
        }
        L.f fVarM2 = M2();
        fVarM2.m(dVar);
        return fVarM2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2() {
        w0.b(this);
        E.b(this);
        AbstractC2640s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P2(String str) {
        J j10;
        a aVar = this.f10958y;
        if (aVar == null) {
            a aVar2 = new a(this.f10947n, str, false, null, 12, null);
            L.f fVar = new L.f(str, this.f10948o, this.f10949p, this.f10950q, this.f10951r, this.f10952s, this.f10953t, null);
            fVar.m(M2().a());
            aVar2.d(fVar);
            this.f10958y = aVar2;
            return true;
        }
        if (AbstractC6492s.d(str, aVar.b())) {
            return false;
        }
        aVar.f(str);
        L.f fVarA = aVar.a();
        if (fVarA != null) {
            fVarA.p(str, this.f10948o, this.f10949p, this.f10950q, this.f10951r, this.f10952s, this.f10953t);
            j10 = J.f24997a;
        } else {
            j10 = null;
        }
        return j10 != null;
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return N2(interfaceC2535o).j(interfaceC2535o.getLayoutDirection());
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        if (k2()) {
            L.f fVarN2 = N2(interfaceC7036c);
            InterfaceC3186p interfaceC3186pE = fVarN2.e();
            if (interfaceC3186pE == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f10956w + ", textSubstitution=" + this.f10958y + ')').toString());
            }
            InterfaceC6717n0 interfaceC6717n0D = interfaceC7036c.k1().d();
            boolean zB = fVarN2.b();
            if (zB) {
                float fG = Y0.r.g(fVarN2.c());
                float f10 = Y0.r.f(fVarN2.c());
                interfaceC6717n0D.j();
                InterfaceC6717n0.p(interfaceC6717n0D, 0.0f, 0.0f, fG, f10, 0, 16, null);
            }
            try {
                k kVarA = this.f10948o.A();
                if (kVarA == null) {
                    kVarA = k.f23532b.c();
                }
                k kVar = kVarA;
                g1 g1VarX = this.f10948o.x();
                if (g1VarX == null) {
                    g1VarX = g1.f52914d.a();
                }
                g1 g1Var = g1VarX;
                AbstractC7040g abstractC7040gI = this.f10948o.i();
                if (abstractC7040gI == null) {
                    abstractC7040gI = C7043j.f55038a;
                }
                AbstractC7040g abstractC7040g = abstractC7040gI;
                AbstractC6713l0 abstractC6713l0G = this.f10948o.g();
                if (abstractC6713l0G != null) {
                    InterfaceC3186p.d(interfaceC3186pE, interfaceC6717n0D, abstractC6713l0G, this.f10948o.d(), g1Var, kVar, abstractC7040g, 0, 64, null);
                } else {
                    InterfaceC6739y0 interfaceC6739y0 = this.f10954u;
                    long jA = interfaceC6739y0 != null ? interfaceC6739y0.a() : C6733v0.f52951b.e();
                    if (jA == 16) {
                        jA = this.f10948o.h() != 16 ? this.f10948o.h() : C6733v0.f52951b.a();
                    }
                    InterfaceC3186p.w(interfaceC3186pE, interfaceC6717n0D, jA, g1Var, kVar, abstractC7040g, 0, 32, null);
                }
                if (zB) {
                    interfaceC6717n0D.r();
                }
            } catch (Throwable th2) {
                if (zB) {
                    interfaceC6717n0D.r();
                }
                throw th2;
            }
        }
    }

    public final void L2(boolean z10, boolean z11, boolean z12) {
        if (z11 || z12) {
            M2().p(this.f10947n, this.f10948o, this.f10949p, this.f10950q, this.f10951r, this.f10952s, this.f10953t);
        }
        if (k2()) {
            if (z11 || (z10 && this.f10957x != null)) {
                w0.b(this);
            }
            if (z11 || z12) {
                E.b(this);
                AbstractC2640s.a(this);
            }
            if (z10) {
                AbstractC2640s.a(this);
            }
        }
    }

    public final boolean Q2(InterfaceC6739y0 interfaceC6739y0, U u10) {
        boolean zD = AbstractC6492s.d(interfaceC6739y0, this.f10954u);
        this.f10954u = interfaceC6739y0;
        return (zD && u10.F(this.f10948o)) ? false : true;
    }

    public final boolean R2(U u10, int i10, int i11, boolean z10, AbstractC3434k.b bVar, int i12) {
        boolean z11 = !this.f10948o.G(u10);
        this.f10948o = u10;
        if (this.f10953t != i10) {
            this.f10953t = i10;
            z11 = true;
        }
        if (this.f10952s != i11) {
            this.f10952s = i11;
            z11 = true;
        }
        if (this.f10951r != z10) {
            this.f10951r = z10;
            z11 = true;
        }
        if (!AbstractC6492s.d(this.f10949p, bVar)) {
            this.f10949p = bVar;
            z11 = true;
        }
        if (W0.t.e(this.f10950q, i12)) {
            return z11;
        }
        this.f10950q = i12;
        return true;
    }

    public final boolean S2(String str) {
        if (AbstractC6492s.d(this.f10947n, str)) {
            return false;
        }
        this.f10947n = str;
        K2();
        return true;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        L.f fVarN2 = N2(mVar);
        boolean zH = fVarN2.h(j10, mVar.getLayoutDirection());
        fVarN2.d();
        InterfaceC3186p interfaceC3186pE = fVarN2.e();
        AbstractC6492s.f(interfaceC3186pE);
        long jC = fVarN2.c();
        if (zH) {
            E.a(this);
            Map linkedHashMap = this.f10955v;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(AbstractC2522b.a(), Integer.valueOf(Math.round(interfaceC3186pE.k())));
            linkedHashMap.put(AbstractC2522b.b(), Integer.valueOf(Math.round(interfaceC3186pE.g())));
            this.f10955v = linkedHashMap;
        }
        t tVarT = b10.T(Y0.b.f24516b.b(Y0.r.g(jC), Y0.r.g(jC), Y0.r.f(jC), Y0.r.f(jC)));
        int iG = Y0.r.g(jC);
        int iF = Y0.r.f(jC);
        Map map = this.f10955v;
        AbstractC6492s.f(map);
        return mVar.v1(iG, iF, map, new f(tVarT));
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return N2(interfaceC2535o).f(i10, interfaceC2535o.getLayoutDirection());
    }

    @Override // E0.v0
    public void q(w wVar) {
        InterfaceC6835l bVar = this.f10957x;
        if (bVar == null) {
            bVar = new b();
            this.f10957x = bVar;
        }
        J0.t.o0(wVar, new C3174d(this.f10947n, null, null, 6, null));
        a aVar = this.f10958y;
        if (aVar != null) {
            J0.t.m0(wVar, aVar.c());
            J0.t.s0(wVar, new C3174d(aVar.b(), null, null, 6, null));
        }
        J0.t.u0(wVar, null, new c(), 1, null);
        J0.t.z0(wVar, null, new d(), 1, null);
        J0.t.d(wVar, null, new e(), 1, null);
        J0.t.u(wVar, null, bVar, 1, null);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return N2(interfaceC2535o).k(interfaceC2535o.getLayoutDirection());
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return N2(interfaceC2535o).f(i10, interfaceC2535o.getLayoutDirection());
    }

    private i(String str, U u10, AbstractC3434k.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC6739y0 interfaceC6739y0) {
        this.f10947n = str;
        this.f10948o = u10;
        this.f10949p = bVar;
        this.f10950q = i10;
        this.f10951r = z10;
        this.f10952s = i11;
        this.f10953t = i12;
        this.f10954u = interfaceC6739y0;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f10959a;

        /* renamed from: b, reason: collision with root package name */
        private String f10960b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10961c;

        /* renamed from: d, reason: collision with root package name */
        private L.f f10962d;

        public a(String str, String str2, boolean z10, L.f fVar) {
            this.f10959a = str;
            this.f10960b = str2;
            this.f10961c = z10;
            this.f10962d = fVar;
        }

        public final L.f a() {
            return this.f10962d;
        }

        public final String b() {
            return this.f10960b;
        }

        public final boolean c() {
            return this.f10961c;
        }

        public final void d(L.f fVar) {
            this.f10962d = fVar;
        }

        public final void e(boolean z10) {
            this.f10961c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f10959a, aVar.f10959a) && AbstractC6492s.d(this.f10960b, aVar.f10960b) && this.f10961c == aVar.f10961c && AbstractC6492s.d(this.f10962d, aVar.f10962d);
        }

        public final void f(String str) {
            this.f10960b = str;
        }

        public int hashCode() {
            int iHashCode = ((((this.f10959a.hashCode() * 31) + this.f10960b.hashCode()) * 31) + Boolean.hashCode(this.f10961c)) * 31;
            L.f fVar = this.f10962d;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.f10962d + ", isShowingSubstitution=" + this.f10961c + ')';
        }

        public /* synthetic */ a(String str, String str2, boolean z10, L.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : fVar);
        }
    }
}
