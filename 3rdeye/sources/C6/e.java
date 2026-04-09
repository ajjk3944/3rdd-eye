package C6;

import N7.EnumC1346s2;
import N7.EnumC1360t2;
import N7.S2;
import N7.X9;
import N7.Z;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import c9.C2097r;
import i7.C4460a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l6.C5295e;
import l6.C5296f;
import l6.C5297g;
import l6.C5298h;

/* compiled from: DivUtil.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: DivUtil.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f944a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f945b;

        static {
            int[] iArr = new int[EnumC1360t2.values().length];
            try {
                iArr[EnumC1360t2.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1360t2.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1360t2.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1360t2.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1360t2.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1360t2.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f944a = iArr;
            int[] iArr2 = new int[EnumC1346s2.values().length];
            try {
                iArr2[EnumC1346s2.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1346s2.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1346s2.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f945b = iArr2;
        }
    }

    public static final boolean a(Z z10, A7.d resolver) {
        kotlin.jvm.internal.l.f(z10, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        S2 s2D = z10.d();
        if (s2D.w() != null || s2D.C() != null || s2D.B() != null) {
            return true;
        }
        if (z10 instanceof Z.a) {
            List<i7.b> listB = C4460a.b(((Z.a) z10).f7813c, resolver);
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                for (i7.b bVar : listB) {
                    if (a(bVar.f38460a, bVar.f38461b)) {
                        return true;
                    }
                }
            }
        } else {
            if (!(z10 instanceof Z.e)) {
                if ((z10 instanceof Z.p) || (z10 instanceof Z.f) || (z10 instanceof Z.d) || (z10 instanceof Z.k) || (z10 instanceof Z.g) || (z10 instanceof Z.m) || (z10 instanceof Z.c) || (z10 instanceof Z.i) || (z10 instanceof Z.o) || (z10 instanceof Z.b) || (z10 instanceof Z.j) || (z10 instanceof Z.l) || (z10 instanceof Z.q) || (z10 instanceof Z.h) || (z10 instanceof Z.n)) {
                    return false;
                }
                throw new b9.j();
            }
            List<Z> listI = C4460a.i(((Z.e) z10).f7817c);
            if (!(listI instanceof Collection) || !listI.isEmpty()) {
                Iterator<T> it = listI.iterator();
                while (it.hasNext()) {
                    if (a((Z) it.next(), resolver)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Interpolator b(EnumC1360t2 enumC1360t2) {
        kotlin.jvm.internal.l.f(enumC1360t2, "<this>");
        switch (a.f944a[enumC1360t2.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new C5297g(C5297g.f43869d, 1);
            case 3:
                return new C5295e(C5295e.f43866d, 1);
            case 4:
                return new C5298h(C5298h.f43870d, 1);
            case 5:
                return new C5296f(C5296f.f43868d, 1);
            case 6:
                return new C5295e();
            default:
                throw new b9.j();
        }
    }

    public static final X9.a c(X9 x92, A7.d resolver) {
        Object next;
        kotlin.jvm.internal.l.f(x92, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        List<X9.a> list = x92.f7743y;
        A7.b<String> bVar = x92.f7728j;
        if (bVar != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((X9.a) next).f7748d.equals(bVar.a(resolver))) {
                    break;
                }
            }
            X9.a aVar = (X9.a) next;
            if (aVar != null) {
                return aVar;
            }
        }
        return (X9.a) C2097r.q0(list);
    }

    public static final String d(Z z10) {
        kotlin.jvm.internal.l.f(z10, "<this>");
        if (z10 instanceof Z.p) {
            return "text";
        }
        if (z10 instanceof Z.f) {
            return "image";
        }
        if (z10 instanceof Z.d) {
            return "gif";
        }
        if (z10 instanceof Z.k) {
            return "separator";
        }
        if (z10 instanceof Z.g) {
            return "indicator";
        }
        if (z10 instanceof Z.l) {
            return "slider";
        }
        if (z10 instanceof Z.h) {
            return "input";
        }
        if (z10 instanceof Z.q) {
            return "video";
        }
        if (z10 instanceof Z.a) {
            return "container";
        }
        if (z10 instanceof Z.e) {
            return "grid";
        }
        if (z10 instanceof Z.m) {
            return "state";
        }
        if (z10 instanceof Z.c) {
            return "gallery";
        }
        if (z10 instanceof Z.i) {
            return "pager";
        }
        if (z10 instanceof Z.o) {
            return "tabs";
        }
        if (z10 instanceof Z.b) {
            return "custom";
        }
        if (z10 instanceof Z.j) {
            return "select";
        }
        if (z10 instanceof Z.n) {
            return "switch";
        }
        throw new b9.j();
    }

    public static final boolean e(Z z10) {
        kotlin.jvm.internal.l.f(z10, "<this>");
        if ((z10 instanceof Z.p) || (z10 instanceof Z.f) || (z10 instanceof Z.d) || (z10 instanceof Z.k) || (z10 instanceof Z.g) || (z10 instanceof Z.l) || (z10 instanceof Z.h) || (z10 instanceof Z.b) || (z10 instanceof Z.j) || (z10 instanceof Z.q) || (z10 instanceof Z.n)) {
            return false;
        }
        if ((z10 instanceof Z.a) || (z10 instanceof Z.e) || (z10 instanceof Z.c) || (z10 instanceof Z.i) || (z10 instanceof Z.o) || (z10 instanceof Z.m)) {
            return true;
        }
        throw new b9.j();
    }
}
