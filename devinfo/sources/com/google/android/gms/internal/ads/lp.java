package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lp extends ac.a implements mp {
    @Override // com.google.android.gms.internal.ads.mp
    public final void p3(List list) {
        Parcel parcelT = T();
        parcelT.writeTypedList(list);
        g1(parcelT, 1);
    }
}
