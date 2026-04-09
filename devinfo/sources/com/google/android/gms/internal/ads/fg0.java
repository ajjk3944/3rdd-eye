package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fg0 extends eu {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hg0 f11161a;

    public fg0(hg0 hg0Var) {
        this.f11161a = hg0Var;
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void N2(ya.l lVar) {
        gx gxVar = this.f11161a.f11858a;
        lVar.getClass();
        gxVar.d(new ya.k(lVar.f37469a, lVar.f37470b));
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        hg0 hg0Var = this.f11161a;
        hg0Var.f11858a.b(new pg0(autoCloseInputStream, hg0Var.f11862e));
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void d3(ParcelFileDescriptor parcelFileDescriptor, iu iuVar) {
        this.f11161a.f11858a.b(new pg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), iuVar));
    }
}
