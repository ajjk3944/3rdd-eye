package M;

import F.EnumC2726p;
import F.U;
import F.j0;
import L0.C3174d;
import L0.S;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import sh.AbstractC7978m;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
public abstract class H {

    static final class a implements InterfaceC3241j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G f12117a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12118b;

        a(G g10, boolean z10) {
            this.f12117a = g10;
            this.f12118b = z10;
        }

        @Override // M.InterfaceC3241j
        public final long a() {
            return this.f12117a.G(this.f12118b);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f12119a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f12120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U f12121c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U u10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f12121c = u10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f12121c, interfaceC5380e);
            bVar.f12120b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f12119a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8567G interfaceC8567G = (InterfaceC8567G) this.f12120b;
                U u10 = this.f12121c;
                this.f12119a = 1;
                if (F.H.c(interfaceC8567G, u10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W0.i f12123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f12124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f12125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, W0.i iVar, G g10, int i10) {
            super(2);
            this.f12122a = z10;
            this.f12123b = iVar;
            this.f12124c = g10;
            this.f12125d = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            H.a(this.f12122a, this.f12123b, this.f12124c, interfaceC3540l, L0.a(this.f12125d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12126a;

        static {
            int[] iArr = new int[EnumC2726p.values().length];
            try {
                iArr[EnumC2726p.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2726p.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2726p.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12126a = iArr;
        }
    }

    public static final void a(boolean z10, W0.i iVar, G g10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(iVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(g10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1344558920, i11, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i12 = i11 & 14;
            boolean zT = (i12 == 4) | interfaceC3540lR.T(g10);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = g10.Q(z10);
                interfaceC3540lR.K(objF);
            }
            U u10 = (U) objF;
            boolean zL = interfaceC3540lR.l(g10) | (i12 == 4);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new a(g10, z10);
                interfaceC3540lR.K(objF2);
            }
            InterfaceC3241j interfaceC3241j = (InterfaceC3241j) objF2;
            boolean zM = S.m(g10.O().h());
            e.a aVar = androidx.compose.ui.e.f28771b0;
            boolean zL2 = interfaceC3540lR.l(u10);
            Object objF3 = interfaceC3540lR.f();
            if (zL2 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new b(u10, null);
                interfaceC3540lR.K(objF3);
            }
            AbstractC3232a.b(interfaceC3241j, z10, iVar, zM, 0L, AbstractC8576P.d(aVar, u10, (InterfaceC6839p) objF3), interfaceC3540lR, (i11 << 3) & 1008, 16);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(z10, iVar, g10, i10));
        }
    }

    public static final long b(G g10, long j10) {
        int iN;
        j0 j0VarJ;
        F.S sV;
        C3174d c3174dK;
        C6531g c6531gA = g10.A();
        if (c6531gA == null) {
            return C6531g.f52335b.b();
        }
        long jV = c6531gA.v();
        C3174d c3174dN = g10.N();
        if (c3174dN == null || c3174dN.length() == 0) {
            return C6531g.f52335b.b();
        }
        EnumC2726p enumC2726pC = g10.C();
        int i10 = enumC2726pC == null ? -1 : d.f12126a[enumC2726pC.ordinal()];
        if (i10 == -1) {
            return C6531g.f52335b.b();
        }
        if (i10 == 1 || i10 == 2) {
            iN = S.n(g10.O().h());
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iN = S.i(g10.O().h());
        }
        F.E eL = g10.L();
        if (eL == null || (j0VarJ = eL.j()) == null) {
            return C6531g.f52335b.b();
        }
        F.E eL2 = g10.L();
        if (eL2 == null || (sV = eL2.v()) == null || (c3174dK = sV.k()) == null) {
            return C6531g.f52335b.b();
        }
        int iK = AbstractC7978m.k(g10.J().b(iN), 0, c3174dK.length());
        float fM = C6531g.m(j0VarJ.j(jV));
        L0.M mF = j0VarJ.f();
        int iQ = mF.q(iK);
        float fS = mF.s(iQ);
        float fT = mF.t(iQ);
        float fJ = AbstractC7978m.j(fM, Math.min(fS, fT), Math.max(fS, fT));
        if (!Y0.r.e(j10, Y0.r.f24545b.a()) && Math.abs(fM - fJ) > Y0.r.g(j10) / 2) {
            return C6531g.f52335b.b();
        }
        float fV = mF.v(iQ);
        return AbstractC6532h.a(fJ, ((mF.m(iQ) - fV) / 2) + fV);
    }

    public static final boolean c(G g10, boolean z10) {
        C0.r rVarI;
        C6533i c6533iB;
        F.E eL = g10.L();
        if (eL == null || (rVarI = eL.i()) == null || (c6533iB = A.b(rVarI)) == null) {
            return false;
        }
        return A.a(c6533iB, g10.G(z10));
    }
}
