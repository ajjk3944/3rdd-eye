package c;

import d5.C2280h;

/* renamed from: c.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369I implements InterfaceC0378c {

    /* renamed from: a, reason: collision with root package name */
    public final C0372L f5800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0371K f5801b;

    public C0369I(C0371K c0371k, C0372L c0372l) {
        q5.i.e(c0372l, "onBackPressedCallback");
        this.f5801b = c0371k;
        this.f5800a = c0372l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p5.a, q5.h] */
    @Override // c.InterfaceC0378c
    public final void cancel() {
        C0371K c0371k = this.f5801b;
        C2280h c2280h = c0371k.f5803b;
        C0372L c0372l = this.f5800a;
        c2280h.remove(c0372l);
        if (q5.i.a(c0371k.f5804c, c0372l)) {
            c0372l.getClass();
            c0371k.f5804c = null;
        }
        c0372l.f5810b.remove(this);
        ?? r02 = c0372l.f5811c;
        if (r02 != 0) {
            r02.b();
        }
        c0372l.f5811c = null;
    }
}
