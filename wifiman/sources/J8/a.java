package J8;

import Z7.b;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class a implements InterfaceC6137a {

    /* renamed from: a, reason: collision with root package name */
    private final String f9911a = "UnifiTeleport";

    @Override // i9.InterfaceC6137a
    public void a(String message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        b.c(message, th2, this.f9911a);
    }

    @Override // i9.InterfaceC6137a
    public void b(String message) {
        AbstractC6492s.i(message, "message");
        b.g(message, this.f9911a);
    }

    @Override // i9.InterfaceC6137a
    public void c(String message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        b.i(message, th2, this.f9911a);
    }
}
