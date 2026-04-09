package Q;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import q.AbstractC7407z;
import r.AbstractC7535j;
import r.InterfaceC7533i;
import r.InterfaceC7550z;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f18962a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final float f18963b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f18964c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f18965d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f18966e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f18967f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18968g = 0;

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18969a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18970a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        S.j jVar = S.j.f20195a;
        f18963b = jVar.a();
        f18964c = jVar.a();
        f18965d = S.i.f20183a.a();
        f18966e = jVar.a();
        f18967f = S.h.f20171a.a();
    }

    private y() {
    }

    public final z a(A a10, InterfaceC6824a interfaceC6824a, InterfaceC7533i interfaceC7533i, InterfaceC7550z interfaceC7550z, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a10 = AbstractC3423a.b(0.0f, 0.0f, 0.0f, interfaceC3540l, 0, 7);
        }
        if ((i11 & 2) != 0) {
            interfaceC6824a = a.f18969a;
        }
        if ((i11 & 4) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            interfaceC7550z = AbstractC7407z.b(interfaceC3540l, 0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(959086674, i10, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:1219)");
        }
        h hVar = new h(a10, interfaceC7533i, interfaceC7550z, interfaceC6824a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return hVar;
    }

    public final z b(A a10, InterfaceC6824a interfaceC6824a, InterfaceC7533i interfaceC7533i, InterfaceC7550z interfaceC7550z, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a10 = AbstractC3423a.b(0.0f, 0.0f, 0.0f, interfaceC3540l, 0, 7);
        }
        if ((i11 & 2) != 0) {
            interfaceC6824a = b.f18970a;
        }
        if ((i11 & 4) != 0) {
            interfaceC7533i = AbstractC7535j.j(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 8) != 0) {
            interfaceC7550z = AbstractC7407z.b(interfaceC3540l, 0);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1757023234, i10, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
        }
        i iVar = new i(a10, interfaceC7533i, interfaceC7550z, interfaceC6824a);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return iVar;
    }
}
