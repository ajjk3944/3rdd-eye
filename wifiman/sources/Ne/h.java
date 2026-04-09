package Ne;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class h {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16413a;

        static {
            int[] iArr = new int[S8.c.values().length];
            try {
                iArr[S8.c.GHZ_2_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S8.c.GHZ_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S8.c.GHZ_6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16413a = iArr;
        }
    }

    public static final String a(S8.c cVar, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(2135216313);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2135216313, i10, -1, "com.ui.wifiman.ui.domain.stringNullable (WifiBandExtensions.kt:28)");
        }
        String strB = AbstractC7930a.b(d(cVar), interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return strB;
    }

    public static final String b(S8.c cVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        interfaceC3540l.U(-1275218695);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1275218695, i11, -1, "com.ui.wifiman.ui.domain.stringWithCountFormat (WifiBandExtensions.kt:43)");
        }
        String strB = AbstractC7930a.b(g(cVar, i10), interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return strB;
    }

    public static final s9.d c(S8.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return new d.b(e(cVar));
    }

    public static final s9.d d(S8.c cVar) {
        return new d.b(f(cVar));
    }

    public static final int e(S8.c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        int i10 = a.f16413a[cVar.ordinal()];
        if (i10 == 1) {
            return AbstractC6780c.f53302E4;
        }
        if (i10 == 2) {
            return AbstractC6780c.f53309F4;
        }
        if (i10 == 3) {
            return AbstractC6780c.f53316G4;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int f(S8.c cVar) {
        return (cVar == null ? -1 : a.f16413a[cVar.ordinal()]) == -1 ? AbstractC6780c.f53530l5 : e(cVar);
    }

    public static final s9.d g(S8.c cVar, int i10) {
        int i11;
        int i12 = cVar == null ? -1 : a.f16413a[cVar.ordinal()];
        if (i12 == -1) {
            i11 = AbstractC6780c.f53537m5;
        } else if (i12 == 1) {
            i11 = AbstractC6780c.f53509i5;
        } else if (i12 == 2) {
            i11 = AbstractC6780c.f53516j5;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = AbstractC6780c.f53523k5;
        }
        return new d.b(i11, AbstractC3689v.e(Integer.valueOf(i10)));
    }
}
