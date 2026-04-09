package g1;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k f20154a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC2326a f20155b;

    public f(k kVar, InterfaceFutureC2326a interfaceFutureC2326a) {
        this.f20154a = kVar;
        this.f20155b = interfaceFutureC2326a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20154a.f20163a != this) {
            return;
        }
        if (i.f20161f.e(this.f20154a, this, i.f(this.f20155b))) {
            i.c(this.f20154a);
        }
    }
}
