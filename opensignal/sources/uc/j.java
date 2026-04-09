package uc;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bf.n;
import cc.s;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import qc.l;

/* loaded from: classes.dex */
public final class j implements jc.c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.b f23533a;

    /* renamed from: b, reason: collision with root package name */
    public final vc.h f23534b;

    public j(SupportMapFragment supportMapFragment, vc.h hVar) {
        this.f23534b = hVar;
        s.h(supportMapFragment);
        this.f23533a = supportMapFragment;
    }

    @Override // jc.c
    public final void a() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 15);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void b(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            vc.e.V(bundle2, bundle3);
            vc.h hVar = this.f23534b;
            jc.d dVar = new jc.d(activity);
            Parcel parcelR = hVar.R();
            l.d(parcelR, dVar);
            l.c(parcelR, googleMapOptions);
            l.c(parcelR, bundle3);
            hVar.S(parcelR, 2);
            vc.e.V(bundle3, bundle2);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void c() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 5);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final View d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vc.e.V(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                vc.h hVar = this.f23534b;
                jc.d dVar = new jc.d(layoutInflater);
                jc.d dVar2 = new jc.d(viewGroup);
                Parcel parcelR = hVar.R();
                l.d(parcelR, dVar);
                l.d(parcelR, dVar2);
                l.c(parcelR, bundle2);
                Parcel parcelE = hVar.e(parcelR, 4);
                jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
                parcelE.recycle();
                StrictMode.setThreadPolicy(threadPolicy);
                vc.e.V(bundle2, bundle);
                return (View) jc.d.V(bVarU);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void e() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 6);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void f(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vc.e.V(bundle, bundle2);
            vc.h hVar = this.f23534b;
            Parcel parcelR = hVar.R();
            l.c(parcelR, bundle2);
            Parcel parcelE = hVar.e(parcelR, 10);
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
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 8);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void h() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 16);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void i() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 7);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void j(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vc.e.V(bundle, bundle2);
            Bundle bundle3 = this.f23533a.B;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                vc.e.W(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            vc.h hVar = this.f23534b;
            Parcel parcelR = hVar.R();
            l.c(parcelR, bundle2);
            hVar.S(parcelR, 3);
            vc.e.V(bundle2, bundle);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final void k(d dVar) {
        try {
            vc.h hVar = this.f23534b;
            g gVar = new g(dVar, 1);
            Parcel parcelR = hVar.R();
            l.d(parcelR, gVar);
            hVar.S(parcelR, 12);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    @Override // jc.c
    public final void onLowMemory() {
        try {
            vc.h hVar = this.f23534b;
            hVar.S(hVar.R(), 9);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
