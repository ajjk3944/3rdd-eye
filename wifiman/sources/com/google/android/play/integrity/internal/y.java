package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class y extends AbstractC5025a implements A {
    y(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.A
    public final void d(Bundle bundle, E e10) {
        Parcel parcelB = b();
        p.c(parcelB, bundle);
        parcelB.writeStrongBinder(e10);
        c(3, parcelB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.A
    public final void l(Bundle bundle, C c10) {
        Parcel parcelB = b();
        p.c(parcelB, bundle);
        parcelB.writeStrongBinder(c10);
        c(2, parcelB);
    }
}
