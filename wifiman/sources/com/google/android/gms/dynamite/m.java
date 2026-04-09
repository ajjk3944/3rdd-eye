package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class m extends B3.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int f() {
        Parcel parcelB = b(6, c());
        int i10 = parcelB.readInt();
        parcelB.recycle();
        return i10;
    }

    public final int n0(InterfaceC8420a interfaceC8420a, String str, boolean z10) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(z10 ? 1 : 0);
        Parcel parcelB = b(3, parcelC);
        int i10 = parcelB.readInt();
        parcelB.recycle();
        return i10;
    }

    public final int o0(InterfaceC8420a interfaceC8420a, String str, boolean z10) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(z10 ? 1 : 0);
        Parcel parcelB = b(5, parcelC);
        int i10 = parcelB.readInt();
        parcelB.recycle();
        return i10;
    }

    public final InterfaceC8420a p0(InterfaceC8420a interfaceC8420a, String str, int i10) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        Parcel parcelB = b(2, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }

    public final InterfaceC8420a q0(InterfaceC8420a interfaceC8420a, String str, int i10, InterfaceC8420a interfaceC8420a2) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        B3.d.d(parcelC, interfaceC8420a2);
        Parcel parcelB = b(8, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }

    public final InterfaceC8420a r0(InterfaceC8420a interfaceC8420a, String str, int i10) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(i10);
        Parcel parcelB = b(4, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }

    public final InterfaceC8420a s0(InterfaceC8420a interfaceC8420a, String str, boolean z10, long j10) {
        Parcel parcelC = c();
        B3.d.d(parcelC, interfaceC8420a);
        parcelC.writeString(str);
        parcelC.writeInt(z10 ? 1 : 0);
        parcelC.writeLong(j10);
        Parcel parcelB = b(7, parcelC);
        InterfaceC8420a interfaceC8420aC = InterfaceC8420a.AbstractBinderC2309a.c(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC8420aC;
    }
}
