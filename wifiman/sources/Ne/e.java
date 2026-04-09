package Ne;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class e {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16407a;

        static {
            int[] iArr = new int[W7.e.values().length];
            try {
                iArr[W7.e.EXCELLENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W7.e.GOOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[W7.e.FAIR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[W7.e.POOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16407a = iArr;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ W7.e f16408a;

        b(W7.e eVar) {
            this.f16408a = eVar;
        }

        public final CharSequence a(Context unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(unused$var$, "$unused$var$");
            interfaceC3540l.U(2053291845);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2053291845, i10, -1, "com.ui.wifiman.ui.domain.text.<anonymous> (RatingCategoryExtensions.kt:37)");
            }
            W7.e eVar = this.f16408a;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            interfaceC3540l.U(1222402227);
            int iN = aVar.n(new D(e.b(eVar, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                aVar.i(H0.f.a(e.e(eVar), interfaceC3540l, 0));
                J j10 = J.f24997a;
                aVar.l(iN);
                interfaceC3540l.J();
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            } catch (Throwable th2) {
                aVar.l(iN);
                throw th2;
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final long b(W7.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(eVar, "<this>");
        interfaceC3540l.U(646872050);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(646872050, i10, -1, "com.ui.wifiman.ui.domain.color (RatingCategoryExtensions.kt:23)");
        }
        long jC = c(eVar, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jC;
    }

    public static final long c(W7.e eVar, AbstractC6784a palette) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(palette, "palette");
        int i10 = a.f16407a[eVar.ordinal()];
        if (i10 == 1) {
            return palette.a().d().f();
        }
        if (i10 == 2) {
            return palette.a().e().f();
        }
        if (i10 == 3) {
            return palette.a().h().f();
        }
        if (i10 == 4) {
            return palette.a().l().f();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final s9.d d(W7.e eVar, boolean z10) {
        AbstractC6492s.i(eVar, "<this>");
        return !z10 ? new d.b(e(eVar)) : new d.a(eVar.name(), new b(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(W7.e eVar) {
        int i10 = a.f16407a[eVar.ordinal()];
        if (i10 == 1) {
            return AbstractC6780c.f53321H2;
        }
        if (i10 == 2) {
            return AbstractC6780c.f53335J2;
        }
        if (i10 == 3) {
            return AbstractC6780c.f53328I2;
        }
        if (i10 == 4) {
            return AbstractC6780c.f53342K2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
