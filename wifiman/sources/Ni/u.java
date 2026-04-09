package Ni;

import Ii.InterfaceC3052e0;
import Ii.InterfaceC3069n;
import Ii.U;
import Ii.X;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public final class u extends Ii.J implements X {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f16623c;

    /* renamed from: d, reason: collision with root package name */
    private final Ii.J f16624d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16625e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Ii.J j10, String str) {
        X x10 = j10 instanceof X ? (X) j10 : null;
        this.f16623c = x10 == null ? U.a() : x10;
        this.f16624d = j10;
        this.f16625e = str;
    }

    @Override // Ii.X
    public void J(long j10, InterfaceC3069n interfaceC3069n) {
        this.f16623c.J(j10, interfaceC3069n);
    }

    @Override // Ii.J
    public void Y(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        this.f16624d.Y(interfaceC5384i, runnable);
    }

    @Override // Ii.J
    public void b0(InterfaceC5384i interfaceC5384i, Runnable runnable) {
        this.f16624d.b0(interfaceC5384i, runnable);
    }

    @Override // Ii.J
    public boolean m0(InterfaceC5384i interfaceC5384i) {
        return this.f16624d.m0(interfaceC5384i);
    }

    @Override // Ii.X
    public InterfaceC3052e0 p(long j10, Runnable runnable, InterfaceC5384i interfaceC5384i) {
        return this.f16623c.p(j10, runnable, interfaceC5384i);
    }

    @Override // Ii.J
    public String toString() {
        return this.f16625e;
    }
}
