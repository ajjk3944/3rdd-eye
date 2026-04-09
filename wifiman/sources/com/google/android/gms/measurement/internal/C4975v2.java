package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4975v2 extends com.google.android.gms.internal.measurement.Y implements InterfaceC4959t2 {
    C4975v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4959t2
    public final void E(List list) {
        Parcel parcelB = b();
        parcelB.writeTypedList(list);
        n0(2, parcelB);
    }
}
