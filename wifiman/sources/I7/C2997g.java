package I7;

import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: I7.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2997g {

    /* renamed from: a, reason: collision with root package name */
    public static final C2997g f8908a;

    /* renamed from: b, reason: collision with root package name */
    private static InterfaceC6137a f8909b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f8910c;

    /* renamed from: d, reason: collision with root package name */
    private static String f8911d;

    /* renamed from: e, reason: collision with root package name */
    private static UnifiTeleportTunnel.b f8912e;

    static {
        C2997g c2997g = new C2997g();
        f8908a = c2997g;
        f8911d = "https://cloudaccess.svc.ubnt.com";
        f8912e = c2997g.c();
    }

    private C2997g() {
    }

    public final UnifiTeleportTunnel.b a() {
        return f8912e;
    }

    public final String b() {
        return f8911d;
    }

    public final UnifiTeleportTunnel.b c() {
        return new UnifiTeleportTunnel.b(new UnifiTeleportTunnel.b.a.C1245a(5, 1000L), 1280);
    }

    public final boolean d() {
        return f8910c;
    }

    public final InterfaceC6137a e() {
        return f8909b;
    }

    public final void f(UnifiTeleportTunnel.b bVar) {
        AbstractC6492s.i(bVar, "<set-?>");
        f8912e = bVar;
    }

    public final void g(boolean z10) {
        f8910c = z10;
    }

    public final void h(InterfaceC6137a interfaceC6137a) {
        f8909b = interfaceC6137a;
    }
}
