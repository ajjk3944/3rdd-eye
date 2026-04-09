package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1004ck implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13664a;

    /* renamed from: b, reason: collision with root package name */
    public final C0895ak f13665b;

    public /* synthetic */ C1004ck(C0895ak c0895ak, int i) {
        this.f13664a = i;
        this.f13665b = c0895ak;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f13664a) {
            case 0:
                return (Bundle) this.f13665b.f13215c;
            case 1:
                return Integer.valueOf(this.f13665b.f13219g);
            case 2:
                return (Yt) this.f13665b.f13216d;
            default:
                return this.f13665b.b();
        }
    }
}
