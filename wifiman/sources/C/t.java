package C;

import B.AbstractC2450n;
import B.M;
import Yg.J;
import Zg.U;
import androidx.compose.runtime.snapshots.g;
import f0.c;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.AbstractC7849j;
import sh.AbstractC7978m;
import x.InterfaceC8409j;
import z.N;

/* loaded from: classes.dex */
public abstract class t {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f2074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w.q f2075b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f2076c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2077d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f2078e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f2079f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f2080g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f2081h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f2082i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c.b f2083j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f2084k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC8409j f2085l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Ii.N f2086m;

        /* renamed from: C.t$a$a, reason: collision with other inner class name */
        static final class C0076a extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B.x f2087a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f2088b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f2089c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f2090d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0076a(B.x xVar, long j10, int i10, int i11) {
                super(3);
                this.f2087a = xVar;
                this.f2088b = j10;
                this.f2089c = i10;
                this.f2090d = i11;
            }

            public final C0.D a(int i10, int i11, InterfaceC6835l interfaceC6835l) {
                return this.f2087a.v1(Y0.c.i(this.f2088b, i10 + this.f2089c), Y0.c.h(this.f2088b, i11 + this.f2090d), U.h(), interfaceC6835l);
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (InterfaceC6835l) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, w.q qVar, N n10, boolean z10, float f10, g gVar, InterfaceC6824a interfaceC6824a, InterfaceC6824a interfaceC6824a2, c.InterfaceC1752c interfaceC1752c, c.b bVar, int i10, InterfaceC8409j interfaceC8409j, Ii.N n11) {
            super(2);
            this.f2074a = c10;
            this.f2075b = qVar;
            this.f2076c = n10;
            this.f2077d = z10;
            this.f2078e = f10;
            this.f2079f = gVar;
            this.f2080g = interfaceC6824a;
            this.f2081h = interfaceC6824a2;
            this.f2082i = interfaceC1752c;
            this.f2083j = bVar;
            this.f2084k = i10;
            this.f2085l = interfaceC8409j;
            this.f2086m = n11;
        }

        public final u a(B.x xVar, long j10) {
            long jA;
            M.a(this.f2074a.D());
            w.q qVar = this.f2075b;
            w.q qVar2 = w.q.Vertical;
            boolean z10 = qVar == qVar2;
            AbstractC7849j.a(j10, z10 ? qVar2 : w.q.Horizontal);
            int iX1 = z10 ? xVar.x1(this.f2076c.a(xVar.getLayoutDirection())) : xVar.x1(androidx.compose.foundation.layout.o.g(this.f2076c, xVar.getLayoutDirection()));
            int iX12 = z10 ? xVar.x1(this.f2076c.b(xVar.getLayoutDirection())) : xVar.x1(androidx.compose.foundation.layout.o.f(this.f2076c, xVar.getLayoutDirection()));
            int iX13 = xVar.x1(this.f2076c.d());
            int iX14 = xVar.x1(this.f2076c.c());
            int i10 = iX13 + iX14;
            int i11 = iX1 + iX12;
            int i12 = z10 ? i10 : i11;
            int i13 = (!z10 || this.f2077d) ? (z10 && this.f2077d) ? iX14 : (z10 || this.f2077d) ? iX12 : iX1 : iX13;
            int i14 = i12 - i13;
            long jN = Y0.c.n(j10, -i11, -i10);
            this.f2074a.c0(xVar);
            int iX15 = xVar.x1(this.f2078e);
            int iK = z10 ? Y0.b.k(j10) - i10 : Y0.b.l(j10) - i11;
            if (!this.f2077d || iK > 0) {
                jA = Y0.o.a(iX1, iX13);
            } else {
                if (!z10) {
                    iX1 += iK;
                }
                if (z10) {
                    iX13 += iK;
                }
                jA = Y0.o.a(iX1, iX13);
            }
            long j11 = jA;
            int iD = AbstractC7978m.d(this.f2079f.a(xVar, iK, iX15), 0);
            this.f2074a.d0(Y0.c.b(0, this.f2075b == qVar2 ? Y0.b.l(jN) : iD, 0, this.f2075b != qVar2 ? Y0.b.k(jN) : iD, 5, null));
            r rVar = (r) this.f2080g.invoke();
            g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
            C c10 = this.f2074a;
            InterfaceC8409j interfaceC8409j = this.f2085l;
            androidx.compose.runtime.snapshots.g gVarD = aVar.d();
            InterfaceC6835l interfaceC6835lH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = aVar.f(gVarD);
            try {
                int iU = c10.U(rVar, c10.v());
                int iD2 = m.d(interfaceC8409j, iK, iD, iX15, i13, i14, c10.v(), c10.w(), c10.F());
                J j12 = J.f24997a;
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                u uVarH = s.h(xVar, ((Number) this.f2081h.invoke()).intValue(), rVar, iK, i13, i14, iX15, iU, iD2, jN, this.f2075b, this.f2082i, this.f2083j, this.f2077d, j11, iD, this.f2084k, AbstractC2450n.a(rVar, this.f2074a.J(), this.f2074a.u()), this.f2085l, this.f2074a.K(), this.f2086m, new C0076a(xVar, j10, i11, i10));
                C.p(this.f2074a, uVarH, false, 2, null);
                return uVarH;
            } catch (Throwable th2) {
                aVar.m(gVarD, gVarF, interfaceC6835lH);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((B.x) obj, ((Y0.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final mh.InterfaceC6839p a(mh.InterfaceC6824a r21, C.C r22, z.N r23, boolean r24, w.q r25, int r26, float r27, C.g r28, f0.c.b r29, f0.c.InterfaceC1752c r30, x.InterfaceC8409j r31, Ii.N r32, mh.InterfaceC6824a r33, T.InterfaceC3540l r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.t.a(mh.a, C.C, z.N, boolean, w.q, int, float, C.g, f0.c$b, f0.c$c, x.j, Ii.N, mh.a, T.l, int, int):mh.p");
    }
}
