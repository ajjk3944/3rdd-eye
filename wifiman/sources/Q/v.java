package Q;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6494u;
import m0.c1;
import m0.i1;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f18926a = AbstractC3561w.f(a.f18927a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18927a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return new u(null, null, null, null, null, 31, null);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18928a;

        static {
            int[] iArr = new int[S.e.values().length];
            try {
                iArr[S.e.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S.e.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S.e.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S.e.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[S.e.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[S.e.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[S.e.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[S.e.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[S.e.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[S.e.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[S.e.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f18928a = iArr;
        }
    }

    public static final E.a a(E.a aVar) {
        float f10 = (float) 0.0d;
        return E.a.d(aVar, E.c.c(Y0.h.j(f10)), null, null, E.c.c(Y0.h.j(f10)), 6, null);
    }

    public static final i1 b(u uVar, S.e eVar) {
        switch (b.f18928a[eVar.ordinal()]) {
            case 1:
                return uVar.a();
            case 2:
                return e(uVar.a());
            case 3:
                return uVar.b();
            case 4:
                return e(uVar.b());
            case 5:
                return E.h.g();
            case 6:
                return uVar.c();
            case 7:
                return a(uVar.c());
            case 8:
                return e(uVar.c());
            case 9:
                return uVar.d();
            case 10:
                return c1.a();
            case 11:
                return uVar.e();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final H0 c() {
        return f18926a;
    }

    public static final i1 d(S.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        i1 i1VarB = b(l.f18839a.b(interfaceC3540l, 6), eVar);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return i1VarB;
    }

    public static final E.a e(E.a aVar) {
        float f10 = (float) 0.0d;
        return E.a.d(aVar, null, null, E.c.c(Y0.h.j(f10)), E.c.c(Y0.h.j(f10)), 3, null);
    }
}
