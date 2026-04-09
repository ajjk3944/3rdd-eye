package M;

import T.AbstractC3561w;
import T.H0;
import kotlin.jvm.internal.AbstractC6494u;
import m0.AbstractC6737x0;
import m0.C6733v0;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f12148a = AbstractC3561w.d(null, a.f12151a, 1, null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f12149b;

    /* renamed from: c, reason: collision with root package name */
    private static final K f12150c;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12151a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke() {
            return L.f12150c;
        }
    }

    static {
        long jD = AbstractC6737x0.d(4282550004L);
        f12149b = jD;
        f12150c = new K(jD, C6733v0.k(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final H0 b() {
        return f12148a;
    }
}
