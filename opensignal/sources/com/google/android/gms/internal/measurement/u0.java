package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5215a;

    public /* synthetic */ u0(int i10) {
        this.f5215a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5215a) {
            case 0:
                int iH0 = b4.h0(parcel);
                Bundle bundleR = null;
                String strT = null;
                boolean zQ = false;
                long jW = 0;
                long jW2 = 0;
                while (parcel.dataPosition() < iH0) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        jW = b4.W(parcel, i10);
                    } else if (c4 == 2) {
                        jW2 = b4.W(parcel, i10);
                    } else if (c4 == 3) {
                        zQ = b4.Q(parcel, i10);
                    } else if (c4 == 7) {
                        bundleR = b4.r(parcel, i10);
                    } else if (c4 != '\b') {
                        b4.e0(parcel, i10);
                    } else {
                        strT = b4.t(parcel, i10);
                    }
                }
                b4.y(parcel, iH0);
                return new zzdd(jW, jW2, zQ, bundleR, strT);
            default:
                int iH02 = b4.h0(parcel);
                String strT2 = null;
                int iV = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iH02) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iV = b4.V(parcel, i11);
                    } else if (c10 == 2) {
                        strT2 = b4.t(parcel, i11);
                    } else if (c10 != 3) {
                        b4.e0(parcel, i11);
                    } else {
                        intent = (Intent) b4.s(parcel, i11, Intent.CREATOR);
                    }
                }
                b4.y(parcel, iH02);
                return new zzdf(iV, strT2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f5215a) {
            case 0:
                return new zzdd[i10];
            default:
                return new zzdf[i10];
        }
    }
}
