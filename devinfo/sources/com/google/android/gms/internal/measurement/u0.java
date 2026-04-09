package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19946a;

    public /* synthetic */ u0(int i4) {
        this.f19946a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f19946a) {
            case 0:
                int iT = com.bumptech.glide.e.T(parcel);
                Bundle bundleS = null;
                String strW = null;
                boolean zL = false;
                long jO = 0;
                long jO2 = 0;
                while (parcel.dataPosition() < iT) {
                    int i4 = parcel.readInt();
                    char c9 = (char) i4;
                    if (c9 == 1) {
                        jO = com.bumptech.glide.e.O(parcel, i4);
                    } else if (c9 == 2) {
                        jO2 = com.bumptech.glide.e.O(parcel, i4);
                    } else if (c9 == 3) {
                        zL = com.bumptech.glide.e.L(parcel, i4);
                    } else if (c9 == 7) {
                        bundleS = com.bumptech.glide.e.s(parcel, i4);
                    } else if (c9 != '\b') {
                        com.bumptech.glide.e.S(parcel, i4);
                    } else {
                        strW = com.bumptech.glide.e.w(parcel, i4);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT);
                return new t0(jO, jO2, zL, bundleS, strW);
            default:
                int iT2 = com.bumptech.glide.e.T(parcel);
                String strW2 = null;
                int iN = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iT2) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        iN = com.bumptech.glide.e.N(parcel, i10);
                    } else if (c10 == 2) {
                        strW2 = com.bumptech.glide.e.w(parcel, i10);
                    } else if (c10 != 3) {
                        com.bumptech.glide.e.S(parcel, i10);
                    } else {
                        intent = (Intent) com.bumptech.glide.e.v(parcel, i10, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.e.C(parcel, iT2);
                return new v0(iN, strW2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.f19946a) {
            case 0:
                return new t0[i4];
            default:
                return new v0[i4];
        }
    }
}
