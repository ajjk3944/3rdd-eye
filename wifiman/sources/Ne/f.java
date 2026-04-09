package Ne;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import W7.f;
import Yg.J;
import Zg.AbstractC3689v;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.q;
import s9.d;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class f {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16409a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.POOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16409a = iArr;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W7.f f16410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.a f16411b;

        b(W7.f fVar, f.a aVar) {
            this.f16410a = fVar;
            this.f16411b = aVar;
        }

        public final CharSequence a(Context unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(unused$var$, "$unused$var$");
            interfaceC3540l.U(-728981315);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-728981315, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (SignalExtensions.kt:40)");
            }
            W7.f fVar = this.f16410a;
            f.a aVar = this.f16411b;
            C3174d.a aVar2 = new C3174d.a(0, 1, null);
            interfaceC3540l.U(1222406363);
            int iN = aVar2.n(new D(f.c(fVar, aVar, interfaceC3540l, 0, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                aVar2.i(AbstractC7930a.b(f.f(fVar), interfaceC3540l, 0));
                J j10 = J.f24997a;
                aVar2.l(iN);
                interfaceC3540l.J();
                C3174d c3174dP = aVar2.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            } catch (Throwable th2) {
                aVar2.l(iN);
                throw th2;
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final W7.e b(f.a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        int i10 = a.f16409a[aVar.ordinal()];
        if (i10 == 1) {
            return W7.e.EXCELLENT;
        }
        if (i10 == 2) {
            return W7.e.GOOD;
        }
        if (i10 == 3) {
            return W7.e.POOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long c(W7.f fVar, f.a aVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-1821100716);
        if ((i11 & 1) != 0) {
            aVar = fVar != null ? fVar.h() : null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1821100716, i10, -1, "com.ui.wifiman.ui.domain.color (SignalExtensions.kt:25)");
        }
        long jD = d(fVar, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b), aVar);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jD;
    }

    public static final long d(W7.f fVar, AbstractC6784a palette, f.a aVar) {
        AbstractC6492s.i(palette, "palette");
        int i10 = aVar == null ? -1 : a.f16409a[aVar.ordinal()];
        if (i10 == -1) {
            return palette.a().g().i();
        }
        if (i10 == 1) {
            return palette.a().d().f();
        }
        if (i10 == 2) {
            return palette.a().e().f();
        }
        if (i10 == 3) {
            return palette.a().l().f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ long e(W7.f fVar, AbstractC6784a abstractC6784a, f.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = fVar != null ? fVar.h() : null;
        }
        return d(fVar, abstractC6784a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s9.d f(W7.f fVar) {
        if (fVar == null) {
            return new d.b(AbstractC6780c.f53349L2);
        }
        return new d.b(AbstractC6780c.f53571r4, AbstractC3689v.e(Integer.valueOf(fVar.b())));
    }

    public static final s9.d g(W7.f fVar, boolean z10, f.a aVar) {
        if (!z10) {
            return f(fVar);
        }
        Integer numValueOf = fVar != null ? Integer.valueOf(fVar.b()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(numValueOf);
        sb2.append(aVar);
        return new d.a(sb2.toString(), new b(fVar, aVar));
    }

    public static /* synthetic */ s9.d h(W7.f fVar, boolean z10, f.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = fVar != null ? fVar.h() : null;
        }
        return g(fVar, z10, aVar);
    }
}
