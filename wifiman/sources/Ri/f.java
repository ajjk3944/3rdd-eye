package Ri;

import Ii.AbstractC3074p0;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public abstract class f extends AbstractC3074p0 {

    /* renamed from: d, reason: collision with root package name */
    private final int f19981d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19982e;

    /* renamed from: f, reason: collision with root package name */
    private final long f19983f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19984g;

    /* renamed from: h, reason: collision with root package name */
    private a f19985h = p0();

    public f(int i10, int i11, long j10, String str) {
        this.f19981d = i10;
        this.f19982e = i11;
        this.f19983f = j10;
        this.f19984g = str;
    }

    private final a p0() {
        return new a(this.f19981d, this.f19982e, this.f19983f, this.f19984g);
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        a.y(this.f19985h, runnable, false, false, 6, null);
    }

    @Override // Ii.J
    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        a.y(this.f19985h, runnable, false, true, 2, null);
    }

    public final void q0(Runnable runnable, boolean z10, boolean z11) {
        this.f19985h.v(runnable, z10, z11);
    }
}
