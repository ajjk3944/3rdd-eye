package vc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.maps.GoogleMapOptions;
import qc.l;
import qc.m;
import qc.n;
import qc.o;

/* loaded from: classes.dex */
public final class f extends x {
    public final b U() {
        b bVar;
        Parcel parcelE = e(R(), 4);
        IBinder strongBinder = parcelE.readStrongBinder();
        if (strongBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            bVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(strongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 4);
        }
        parcelE.recycle();
        return bVar;
    }

    public final h V(jc.d dVar) {
        h hVar;
        Parcel parcelR = R();
        l.d(parcelR, dVar);
        Parcel parcelE = e(parcelR, 2);
        IBinder strongBinder = parcelE.readStrongBinder();
        if (strongBinder == null) {
            hVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(strongBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate", 4);
        }
        parcelE.recycle();
        return hVar;
    }

    public final i W(jc.d dVar, GoogleMapOptions googleMapOptions) {
        i iVar;
        Parcel parcelR = R();
        l.d(parcelR, dVar);
        l.c(parcelR, googleMapOptions);
        Parcel parcelE = e(parcelR, 3);
        IBinder strongBinder = parcelE.readStrongBinder();
        if (strongBinder == null) {
            iVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(strongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 4);
        }
        parcelE.recycle();
        return iVar;
    }

    public final o X() {
        o mVar;
        Parcel parcelE = e(R(), 5);
        IBinder strongBinder = parcelE.readStrongBinder();
        int i10 = n.f20843e;
        if (strongBinder == null) {
            mVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            mVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new m(strongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 4);
        }
        parcelE.recycle();
        return mVar;
    }
}
