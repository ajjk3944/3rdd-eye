package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class an extends mg implements bn {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9366a = 0;

    public an() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        vm umVar;
        switch (i4) {
            case 1:
                String string = parcel.readString();
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                Z2(string, aVarR0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                ng.f(parcel);
                vb.a aVarX = x(string2);
                parcel2.writeNoException();
                ng.e(parcel2, aVarX);
                return true;
            case 3:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                z3(aVarR02);
                parcel2.writeNoException();
                return true;
            case 4:
                c();
                parcel2.writeNoException();
                return true;
            case 5:
                vb.b.r0(parcel.readStrongBinder());
                parcel.readInt();
                ng.f(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                o(aVarR03);
                parcel2.writeNoException();
                return true;
            case 7:
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                b4(aVarR04);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    umVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    umVar = iInterfaceQueryLocalInterface instanceof vm ? (vm) iInterfaceQueryLocalInterface : new um(strongBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 1);
                }
                ng.f(parcel);
                U3(umVar);
                parcel2.writeNoException();
                return true;
            case 9:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                D3(aVarR05);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
