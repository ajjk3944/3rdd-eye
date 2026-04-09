package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606ns implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15830a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f15831b;

    public /* synthetic */ C1606ns(ID id, int i) {
        this.f15830a = i;
        this.f15831b = id;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        switch (this.f15830a) {
            case 0:
                return ((C0623Mf) this.f15831b).b(new B9(1));
            case 1:
                return ((C0623Mf) this.f15831b).b(B9.f7307c);
            case 2:
                return ((C0623Mf) this.f15831b).b(B9.f7308d);
            case 3:
                return ((C0623Mf) this.f15831b).b(new B9(5));
            default:
                return ((C0623Mf) this.f15831b).b(B9.f7309e);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f15830a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 45;
            default:
                return 51;
        }
    }
}
