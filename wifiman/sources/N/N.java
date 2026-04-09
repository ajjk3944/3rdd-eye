package N;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    private static final T.H0 f13854a = AbstractC3561w.f(b.f13857a);

    /* renamed from: b, reason: collision with root package name */
    private static final T.H0 f13855b = AbstractC3561w.d(null, a.f13856a, 1, null);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13856a = new a();

        a() {
            super(0);
        }

        public final float a() {
            return Y0.h.j(0);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Y0.h.d(a());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13857a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return C3353x.f14843a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1613340891, i10, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long jK = C6733v0.k(AbstractC3334n.b(j10, interfaceC3540l, i10 & 14), ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jK;
    }

    public static final T.H0 c() {
        return f13855b;
    }

    public static final T.H0 d() {
        return f13854a;
    }
}
