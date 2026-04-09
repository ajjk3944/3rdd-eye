package uc;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bf.n;
import cc.s;
import com.google.android.gms.maps.MapView;
import qc.l;

/* loaded from: classes.dex */
public final class h implements jc.c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f23525a;

    /* renamed from: b, reason: collision with root package name */
    public final vc.i f23526b;

    /* renamed from: c, reason: collision with root package name */
    public View f23527c;

    public h(MapView mapView, vc.i iVar) {
        this.f23526b = iVar;
        s.h(mapView);
        this.f23525a = mapView;
    }

    @Override // jc.c
    public final void a() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 12);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void b(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // jc.c
    public final void c() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 3);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // jc.c
    public final void e() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 4);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void f(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vc.e.V(bundle, bundle2);
            vc.i iVar = this.f23526b;
            Parcel parcelR = iVar.R();
            l.c(parcelR, bundle2);
            Parcel parcelE = iVar.e(parcelR, 7);
            if (parcelE.readInt() != 0) {
                bundle2.readFromParcel(parcelE);
            }
            parcelE.recycle();
            vc.e.V(bundle2, bundle);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void g() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 5);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void h() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 13);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void i() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // jc.c
    public final void j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vc.e.V(bundle, bundle2);
            vc.i iVar = this.f23526b;
            Parcel parcelR = iVar.R();
            l.c(parcelR, bundle2);
            iVar.S(parcelR, 2);
            vc.e.V(bundle2, bundle);
            Parcel parcelE = iVar.e(iVar.R(), 8);
            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
            parcelE.recycle();
            this.f23527c = (View) jc.d.V(bVarU);
            ViewGroup viewGroup = this.f23525a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.f23527c);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final void k(d dVar) {
        try {
            vc.i iVar = this.f23526b;
            g gVar = new g(dVar, 0);
            Parcel parcelR = iVar.R();
            l.d(parcelR, gVar);
            iVar.S(parcelR, 9);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void onLowMemory() {
        try {
            vc.i iVar = this.f23526b;
            iVar.S(iVar.R(), 6);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
