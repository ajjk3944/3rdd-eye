package qg;

import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import ng.AbstractC6940a;

/* renamed from: qg.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7481C extends AbstractC6940a implements InterfaceC5914d {

    /* renamed from: a, reason: collision with root package name */
    final Dj.b f58697a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC6043c f58698b;

    public C7481C(Dj.b bVar) {
        this.f58697a = bVar;
    }

    @Override // gg.InterfaceC5914d
    public void a() {
        this.f58698b = EnumC6592b.DISPOSED;
        this.f58697a.a();
    }

    @Override // gg.InterfaceC5914d
    public void c(InterfaceC6043c interfaceC6043c) {
        if (EnumC6592b.validate(this.f58698b, interfaceC6043c)) {
            this.f58698b = interfaceC6043c;
            this.f58697a.j(this);
        }
    }

    @Override // ng.AbstractC6940a, Dj.c
    public void cancel() {
        this.f58698b.dispose();
        this.f58698b = EnumC6592b.DISPOSED;
    }

    @Override // gg.InterfaceC5914d
    public void onError(Throwable th2) {
        this.f58698b = EnumC6592b.DISPOSED;
        this.f58697a.onError(th2);
    }
}
