package Ne;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import b8.AbstractC4074a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import ma.AbstractC6784a;
import mh.q;
import s9.d;

/* loaded from: classes4.dex */
public abstract class c {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4074a f16403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16404b;

        a(AbstractC4074a abstractC4074a, int i10) {
            this.f16403a = abstractC4074a;
            this.f16404b = i10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1341624390);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1341624390, i10, -1, "com.ui.wifiman.ui.domain.getColorString.<anonymous> (InternetAvailabilityExtensions.kt:43)");
            }
            AbstractC4074a abstractC4074a = this.f16403a;
            int i11 = this.f16404b;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            int iN = aVar.n(new D(c.a(abstractC4074a, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                String string = context.getString(i11);
                AbstractC6492s.h(string, "getString(...)");
                aVar.i(string);
                J j10 = J.f24997a;
                aVar.l(iN);
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

    public static final long a(AbstractC4074a abstractC4074a, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        interfaceC3540l.U(-145915984);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-145915984, i10, -1, "com.ui.wifiman.ui.domain.color (InternetAvailabilityExtensions.kt:22)");
        }
        long jB = b(abstractC4074a, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jB;
    }

    public static final long b(AbstractC4074a abstractC4074a, AbstractC6784a palette) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        AbstractC6492s.i(palette, "palette");
        if (abstractC4074a instanceof AbstractC4074a.b) {
            return palette.f().c();
        }
        if (abstractC4074a instanceof AbstractC4074a.C1143a) {
            return palette.a().d().f();
        }
        if (abstractC4074a instanceof AbstractC4074a.c) {
            return palette.a().l().f();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final s9.d c(AbstractC4074a abstractC4074a, int i10, boolean z10) {
        return z10 ? new d.a(String.valueOf(i10), new a(abstractC4074a, i10)) : new d.b(i10);
    }

    public static final s9.d d(AbstractC4074a abstractC4074a, boolean z10) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        return c(abstractC4074a, f(abstractC4074a), z10);
    }

    public static final s9.d e(AbstractC4074a abstractC4074a, boolean z10) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        return c(abstractC4074a, g(abstractC4074a), z10);
    }

    public static final int f(AbstractC4074a abstractC4074a) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        if (abstractC4074a instanceof AbstractC4074a.b) {
            return AbstractC6780c.f53274A4;
        }
        if (abstractC4074a instanceof AbstractC4074a.C1143a) {
            return AbstractC6780c.f53277B0;
        }
        if (abstractC4074a instanceof AbstractC4074a.c) {
            return AbstractC6780c.f53284C0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int g(AbstractC4074a abstractC4074a) {
        AbstractC6492s.i(abstractC4074a, "<this>");
        if (abstractC4074a instanceof AbstractC4074a.b) {
            return AbstractC6780c.f53274A4;
        }
        if (abstractC4074a instanceof AbstractC4074a.C1143a) {
            return AbstractC6780c.f53526l1;
        }
        if (abstractC4074a instanceof AbstractC4074a.c) {
            return AbstractC6780c.f53533m1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
