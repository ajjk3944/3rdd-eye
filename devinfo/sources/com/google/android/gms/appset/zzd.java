package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final zzc createFromParcel(Parcel parcel) {
        int iT = e.T(parcel);
        String strW = null;
        int iN = 0;
        while (parcel.dataPosition() < iT) {
            int i4 = parcel.readInt();
            char c9 = (char) i4;
            if (c9 == 1) {
                strW = e.w(parcel, i4);
            } else if (c9 != 2) {
                e.S(parcel, i4);
            } else {
                iN = e.N(parcel, i4);
            }
        }
        e.C(parcel, iT);
        return new zzc(strW, iN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzc[] newArray(int i4) {
        return new zzc[i4];
    }
}
