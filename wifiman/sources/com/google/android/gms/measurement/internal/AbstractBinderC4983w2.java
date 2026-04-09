package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC4307b0;
import com.google.android.gms.internal.measurement.AbstractC4298a0;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC4983w2 extends AbstractBinderC4307b0 implements InterfaceC4959t2 {
    public AbstractBinderC4983w2() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC4307b0
    protected final boolean b(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(K6.CREATOR);
        AbstractC4298a0.f(parcel);
        E(arrayListCreateTypedArrayList);
        return true;
    }
}
