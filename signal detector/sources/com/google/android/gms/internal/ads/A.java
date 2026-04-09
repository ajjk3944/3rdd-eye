package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0889ae f6909b;

    public /* synthetic */ A(C0889ae c0889ae, int i) {
        this.f6908a = i;
        this.f6909b = c0889ae;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f6908a) {
            case 0:
                ((B) this.f6909b.f13151c).f7092h.c();
                break;
            case 1:
                ((B) this.f6909b.f13151c).f7092h.mo7f();
                break;
            default:
                ((B) this.f6909b.f13151c).f7092h.getClass();
                break;
        }
    }

    public /* synthetic */ A(C0889ae c0889ae, C1161fd c1161fd) {
        this.f6908a = 2;
        this.f6909b = c0889ae;
    }
}
