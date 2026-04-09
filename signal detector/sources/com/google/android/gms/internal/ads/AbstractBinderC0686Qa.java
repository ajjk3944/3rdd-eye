package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0686Qa extends B7 implements InterfaceC0703Ra {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10621a = 0;

    public AbstractBinderC0686Qa() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0601La c0584Ka;
        switch (i) {
            case 1:
                String string = parcel.readString();
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                B0(aVarD1, string);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                C7.f(parcel);
                S2.a aVarO = O(string2);
                parcel2.writeNoException();
                C7.e(parcel2, aVarO);
                return true;
            case 3:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                g2(aVarD12);
                parcel2.writeNoException();
                return true;
            case 4:
                b();
                parcel2.writeNoException();
                return true;
            case 5:
                S2.b.d1(parcel.readStrongBinder());
                parcel.readInt();
                C7.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                D(aVarD13);
                parcel2.writeNoException();
                return true;
            case 7:
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                r2(aVarD14);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0584Ka = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c0584Ka = iInterfaceQueryLocalInterface instanceof InterfaceC0601La ? (InterfaceC0601La) iInterfaceQueryLocalInterface : new C0584Ka(strongBinder);
                }
                C7.f(parcel);
                w3(c0584Ka);
                parcel2.writeNoException();
                return true;
            case 9:
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                I3(aVarD15);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
