package r6;

import H6.C0675l;
import m6.InterfaceC5331d;

/* compiled from: TriggersController.kt */
/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5527d implements InterfaceC5331d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0675l f45721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5528e f45722b;

    public C5527d(C0675l c0675l, C5528e c5528e) {
        this.f45721a = c0675l;
        this.f45722b = c5528e;
    }

    @Override // m6.InterfaceC5331d
    public final void a() {
        C0675l c0675l = this.f45721a;
        synchronized (c0675l.f2167K) {
            c0675l.f2201z.c(this);
        }
        this.f45722b.b();
    }

    @Override // m6.InterfaceC5331d
    public final /* synthetic */ void b() {
    }
}
