package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823Yb extends W2.a implements InterfaceC0840Zb {
    @Override // com.google.android.gms.internal.ads.InterfaceC0840Zb
    public final void S2(List list) {
        Parcel parcelH0 = h0();
        parcelH0.writeTypedList(list);
        I0(parcelH0, 1);
    }
}
