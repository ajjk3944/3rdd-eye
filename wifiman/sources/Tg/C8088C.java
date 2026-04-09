package tg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import ng.AbstractC6940a;

/* renamed from: tg.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8088C extends AbstractC6940a implements InterfaceC5914d {

    /* renamed from: a, reason: collision with root package name */
    final gg.x f62118a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC6043c f62119b;

    public C8088C(gg.x xVar) {
        this.f62118a = xVar;
    }

    @Override // gg.InterfaceC5914d
    public void a() {
        this.f62119b = EnumC6592b.DISPOSED;
        this.f62118a.a();
    }

    @Override // gg.InterfaceC5914d
    public void c(InterfaceC6043c interfaceC6043c) {
        if (EnumC6592b.validate(this.f62119b, interfaceC6043c)) {
            this.f62119b = interfaceC6043c;
            this.f62118a.c(this);
        }
    }

    @Override // ng.AbstractC6940a, hg.InterfaceC6043c
    public void dispose() {
        this.f62119b.dispose();
        this.f62119b = EnumC6592b.DISPOSED;
    }

    @Override // ng.AbstractC6940a, hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f62119b.isDisposed();
    }

    @Override // gg.InterfaceC5914d
    public void onError(Throwable th2) {
        this.f62119b = EnumC6592b.DISPOSED;
        this.f62118a.onError(th2);
    }
}
