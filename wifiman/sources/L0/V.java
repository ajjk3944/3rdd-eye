package L0;

import W0.l;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class V {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11111a;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11111a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(A a10, z zVar) {
        if (a10 == null && zVar == null) {
            return null;
        }
        return AbstractC3173c.a(a10, zVar);
    }

    public static final U c(U u10, U u11, float f10) {
        return new U(E.c(u10.N(), u11.N(), f10), AbstractC3192w.b(u10.M(), u11.M(), f10));
    }

    public static final U d(U u10, Y0.t tVar) {
        return new U(E.h(u10.y()), AbstractC3192w.e(u10.v(), tVar), u10.w());
    }

    public static final int e(Y0.t tVar, int i10) {
        l.a aVar = W0.l.f23537b;
        if (W0.l.j(i10, aVar.a())) {
            int i11 = a.f11111a[tVar.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!W0.l.j(i10, aVar.f())) {
            return i10;
        }
        int i12 = a.f11111a[tVar.ordinal()];
        if (i12 == 1) {
            return aVar.d();
        }
        if (i12 == 2) {
            return aVar.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
