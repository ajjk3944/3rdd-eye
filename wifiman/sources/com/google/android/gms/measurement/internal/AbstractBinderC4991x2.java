package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC4307b0;
import com.google.android.gms.internal.measurement.AbstractC4298a0;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4991x2 extends AbstractBinderC4307b0 implements InterfaceC4999y2 {
    public AbstractBinderC4991x2() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4307b0
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        S6 s62 = (S6) AbstractC4298a0.a(parcel, S6.CREATOR);
        AbstractC4298a0.f(parcel);
        k(s62);
        return true;
    }
}
