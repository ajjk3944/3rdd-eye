package T;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;
import mh.InterfaceC6839p;

/* renamed from: T.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3518c0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6839p f21041a;

    /* renamed from: b, reason: collision with root package name */
    private final Ii.N f21042b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3091y0 f21043c;

    public C3518c0(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p) {
        this.f21041a = interfaceC6839p;
        this.f21042b = Ii.O.a(interfaceC5384i);
    }

    @Override // T.S0
    public void b() {
        InterfaceC3091y0 interfaceC3091y0 = this.f21043c;
        if (interfaceC3091y0 != null) {
            interfaceC3091y0.cancel((CancellationException) new C3524e0());
        }
        this.f21043c = null;
    }

    @Override // T.S0
    public void c() {
        InterfaceC3091y0 interfaceC3091y0 = this.f21043c;
        if (interfaceC3091y0 != null) {
            interfaceC3091y0.cancel((CancellationException) new C3524e0());
        }
        this.f21043c = null;
    }

    @Override // T.S0
    public void d() {
        InterfaceC3091y0 interfaceC3091y0 = this.f21043c;
        if (interfaceC3091y0 != null) {
            Ii.B0.e(interfaceC3091y0, "Old job was still running!", null, 2, null);
        }
        this.f21043c = AbstractC3063k.d(this.f21042b, null, null, this.f21041a, 3, null);
    }
}
