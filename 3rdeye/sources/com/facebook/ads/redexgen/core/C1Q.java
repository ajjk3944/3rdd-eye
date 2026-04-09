package com.facebook.ads.redexgen.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.facebook.ads.redexgen.X.1Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C1Q extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AbstractC2416Am<Bundle> A00(IBinder iBinder) {
        C21921h c21921hA01 = AbstractC2416Am.A01();
        int i = 0;
        int i10 = 1;
        while (i10 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            c21921hA01.A04((Bundle) C3M.A01(parcelObtain2.readBundle()));
                            i++;
                        }
                    }
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
        return c21921hA01.A05();
    }

    static {
        A00 = AbstractC22614a.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }
}
