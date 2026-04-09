package n0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.n;
import o.AbstractC7023n;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6864i {

    /* renamed from: a, reason: collision with root package name */
    private static final o.z f54147a;

    static {
        C6862g c6862g = C6862g.f54113a;
        int iB = c6862g.w().b();
        int iB2 = c6862g.w().b();
        n.a aVar = n.f54165a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f54147a = AbstractC7023n.c(iB | (iB2 << 6) | (aVar.b() << 12), C6863h.f54137g.c(c6862g.w()), c6862g.w().b() | (c6862g.t().b() << 6) | (aVar.b() << 12), new C6863h(c6862g.w(), c6862g.t(), aVar.b(), defaultConstructorMarker), c6862g.t().b() | (c6862g.w().b() << 6) | (aVar.b() << 12), new C6863h(c6862g.t(), c6862g.w(), aVar.b(), defaultConstructorMarker));
    }

    public static final o.z a() {
        return f54147a;
    }
}
