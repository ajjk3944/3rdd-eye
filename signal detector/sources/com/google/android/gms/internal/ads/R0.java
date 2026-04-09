package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class R0 extends D0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L0 f10819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U1.b f10820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(U1.b bVar, L0 l02, L0 l03) {
        super(l02);
        this.f10819b = l03;
        this.f10820c = bVar;
    }

    @Override // com.google.android.gms.internal.ads.D0, com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        K0 k0I = this.f10819b.i(j6);
        M0 m02 = k0I.f9416a;
        long j7 = m02.f9791a;
        long j8 = m02.f9792b;
        long j9 = this.f10820c.f3690b;
        M0 m03 = new M0(j7, j8 + j9);
        M0 m04 = k0I.f9417b;
        return new K0(m03, new M0(m04.f9791a, m04.f9792b + j9));
    }
}
