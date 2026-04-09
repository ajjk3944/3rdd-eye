package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1543mj implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15649a;

    /* renamed from: b, reason: collision with root package name */
    public final C0889ae f15650b;

    public /* synthetic */ C1543mj(C0889ae c0889ae, int i) {
        this.f15649a = i;
        this.f15650b = c0889ae;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f15649a) {
            case 0:
                C0896al c0896al = (C0896al) this.f15650b.f13151c;
                return c0896al != null ? new C1922tl(c0896al, AbstractC0640Nf.f10011g) : new C1922tl(new C1489lj(), AbstractC0640Nf.f10011g);
            default:
                return (C0896al) this.f15650b.f13151c;
        }
    }
}
