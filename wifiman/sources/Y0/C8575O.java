package y0;

import mh.InterfaceC6835l;

/* renamed from: y0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8575O implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    private C8568H f66239a;

    public void a(boolean z10) {
        C8568H c8568h = this.f66239a;
        if (c8568h == null) {
            return;
        }
        c8568h.d(z10);
    }

    public final void b(C8568H c8568h) {
        this.f66239a = c8568h;
    }

    @Override // mh.InterfaceC6835l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return Yg.J.f24997a;
    }
}
