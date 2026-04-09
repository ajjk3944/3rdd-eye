package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class t extends AbstractC5025a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.v
    public final void M(Bundle bundle, x xVar) {
        Parcel parcelB = b();
        p.c(parcelB, bundle);
        parcelB.writeStrongBinder(xVar);
        c(2, parcelB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.v
    public final void V(Bundle bundle, x xVar) {
        Parcel parcelB = b();
        p.c(parcelB, bundle);
        parcelB.writeStrongBinder(xVar);
        c(3, parcelB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.v
    public final void d(Bundle bundle, E e10) {
        Parcel parcelB = b();
        p.c(parcelB, bundle);
        parcelB.writeStrongBinder(e10);
        c(6, parcelB);
    }
}
