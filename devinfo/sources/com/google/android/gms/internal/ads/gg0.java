package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gg0 extends eu {

    /* renamed from: a, reason: collision with root package name */
    public final gx f11514a;

    /* renamed from: b, reason: collision with root package name */
    public final iu f11515b;

    public gg0(gx gxVar, iu iuVar) {
        this.f11514a = gxVar;
        this.f11515b = iuVar;
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void N2(ya.l lVar) {
        lVar.getClass();
        this.f11514a.d(new ya.k(lVar.f37469a, lVar.f37470b));
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11514a.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f11515b));
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void d3(ParcelFileDescriptor parcelFileDescriptor, iu iuVar) {
        this.f11514a.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), iuVar));
    }
}
