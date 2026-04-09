package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: E0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2625d {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3908a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC6835l f3909b = b.f3911a;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC6835l f3910c = c.f3912a;

    /* renamed from: E0.d$a */
    public static final class a implements D0.k {
        a() {
        }

        @Override // D0.k
        public Object z(D0.c cVar) {
            return cVar.a().invoke();
        }
    }

    /* renamed from: E0.d$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f3911a = new b();

        b() {
            super(1);
        }

        public final void a(C2623c c2623c) {
            c2623c.G2();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2623c) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.d$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f3912a = new c();

        c() {
            super(1);
        }

        public final void a(C2623c c2623c) {
            c2623c.J2();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2623c) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C2623c c2623c) {
        e.c cVarO = AbstractC2633k.m(c2623c).k0().o();
        AbstractC6492s.g(cVarO, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((y0) cVarO).D2();
    }
}
