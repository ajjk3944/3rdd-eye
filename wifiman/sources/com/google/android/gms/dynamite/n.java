package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class n extends B3.a implements IInterface {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC8420a f(InterfaceC8420a interfaceC8420a, String str, int i10, InterfaceC8420a interfaceC8420a2) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        B3.d.d(parcelC, interfaceC8420a2);
        Parcel parcelB = b(2, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }

    public final InterfaceC8420a n0(InterfaceC8420a interfaceC8420a, String str, int i10, InterfaceC8420a interfaceC8420a2) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        B3.d.d(parcelC, interfaceC8420a2);
        Parcel parcelB = b(3, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }
}
