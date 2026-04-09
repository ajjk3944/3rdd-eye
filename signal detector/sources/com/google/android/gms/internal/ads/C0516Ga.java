package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516Ga extends W2.a implements InterfaceC0550Ia {
    public C0516Ga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0550Ia
    public final String c() {
        Parcel parcelK0 = k0(h0(), 2);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0550Ia
    public final ArrayList f() {
        Parcel parcelK0 = k0(h0(), 3);
        ArrayList arrayList = parcelK0.readArrayList(C7.f7544a);
        parcelK0.recycle();
        return arrayList;
    }
}
