package j0;

import Y0.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6233d implements Y0.d {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6231b f49811a = C6238i.f49817a;

    /* renamed from: b, reason: collision with root package name */
    private C6237h f49812b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7036c f49813c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6824a f49814d;

    public final C6237h b() {
        return this.f49812b;
    }

    public final long c() {
        return this.f49811a.c();
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f49811a.getDensity().getDensity();
    }

    public final t getLayoutDirection() {
        return this.f49811a.getLayoutDirection();
    }

    public final C6237h p(InterfaceC6835l interfaceC6835l) {
        C6237h c6237h = new C6237h(interfaceC6835l);
        this.f49812b = c6237h;
        return c6237h;
    }

    public final void q(InterfaceC6231b interfaceC6231b) {
        this.f49811a = interfaceC6231b;
    }

    public final void r(InterfaceC7036c interfaceC7036c) {
        this.f49813c = interfaceC7036c;
    }

    public final void s(C6237h c6237h) {
        this.f49812b = c6237h;
    }

    public final void v(InterfaceC6824a interfaceC6824a) {
        this.f49814d = interfaceC6824a;
    }

    @Override // Y0.l
    public float y() {
        return this.f49811a.getDensity().y();
    }
}
