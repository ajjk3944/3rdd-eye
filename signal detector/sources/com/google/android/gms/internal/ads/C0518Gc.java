package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.Gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518Gc implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8392a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC2326a f8393b;

    public /* synthetic */ C0518Gc(int i, InterfaceFutureC2326a interfaceFutureC2326a) {
        this.f8392a = i;
        this.f8393b = interfaceFutureC2326a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) {
        switch (this.f8392a) {
            case 0:
                return AbstractC1984ut.F(this.f8393b, new C0467Dc(this, 1, obj), AbstractC0640Nf.f10011g);
            default:
                return this.f8393b;
        }
    }
}
