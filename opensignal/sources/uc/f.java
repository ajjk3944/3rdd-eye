package uc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import bf.n;
import cc.s;
import com.google.android.gms.maps.model.LatLng;
import com.staircase3.opensignal.activities.TowersActivity;
import oh.p;
import qc.l;

/* loaded from: classes.dex */
public final class f extends mc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23521e = 2;

    /* renamed from: f, reason: collision with root package name */
    public final Object f23522f;

    public f(b9.c cVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 3);
        this.f23522f = cVar;
    }

    @Override // mc.a
    public final boolean S(int i10, Parcel parcel, Parcel parcel2) {
        qc.c aVar;
        switch (this.f23521e) {
            case 0:
                int i11 = 0;
                if (i10 != 1) {
                    return false;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    aVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    aVar = iInterfaceQueryLocalInterface instanceof qc.c ? (qc.c) iInterfaceQueryLocalInterface : new qc.a(strongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                }
                l.b(parcel);
                wc.c cVar = new wc.c(aVar);
                TowersActivity towersActivity = (TowersActivity) this.f23522f;
                if (cVar.a() != null) {
                    wc.c cVar2 = towersActivity.K0;
                    if (cVar2 == null || cVar2.a() == null || cVar.a() == null || towersActivity.K0.a().f5347a != cVar.a().f5347a || towersActivity.K0.a().f5348d != cVar.a().f5348d) {
                        towersActivity.K0 = cVar;
                        q3.a aVar2 = towersActivity.V;
                        LatLng latLngA = cVar.a();
                        s.i(latLngA, "latLng must not be null");
                        try {
                            vc.b bVar = xu.d.f25543i;
                            s.i(bVar, "CameraUpdateFactory is not initialized");
                            Parcel parcelR = bVar.R();
                            l.c(parcelR, latLngA);
                            Parcel parcelE = bVar.e(parcelR, 8);
                            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
                            parcelE.recycle();
                            s.h(bVarU);
                            aVar2.getClass();
                            try {
                                vc.g gVar = (vc.g) aVar2.f20679d;
                                Parcel parcelR2 = gVar.R();
                                l.d(parcelR2, bVarU);
                                gVar.S(parcelR2, 5);
                                if (towersActivity.f6051o0) {
                                    towersActivity.F(new om.f(11, towersActivity, cVar, false));
                                } else {
                                    towersActivity.N(cVar);
                                }
                            } catch (RemoteException e4) {
                                throw new n(e4);
                            }
                        } catch (RemoteException e10) {
                            throw new n(e10);
                        }
                    }
                    i11 = 1;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i11);
                return true;
            case 1:
                if (i10 != 1) {
                    return false;
                }
                LatLng latLng = (LatLng) l.a(parcel, LatLng.CREATOR);
                l.b(parcel);
                TowersActivity towersActivity2 = (TowersActivity) ((p) this.f23522f).f19481d;
                if (!TowersActivity.y(towersActivity2, latLng)) {
                    TowersActivity.x(towersActivity2);
                }
                parcel2.writeNoException();
                return true;
            case 2:
                b9.c cVar3 = (b9.c) this.f23522f;
                if (i10 == 1) {
                    ((Runnable) cVar3.f2478d).run();
                } else {
                    if (i10 != 2) {
                        return false;
                    }
                    cVar3.getClass();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                if (i10 != 1) {
                    return false;
                }
                ((a) this.f23522f).a();
                parcel2.writeNoException();
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                LatLng latLng2 = (LatLng) l.a(parcel, LatLng.CREATOR);
                l.b(parcel);
                TowersActivity towersActivity3 = (TowersActivity) ((o2.g) this.f23522f).f18754d;
                if (!TowersActivity.y(towersActivity3, latLng2)) {
                    TowersActivity.x(towersActivity3);
                }
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TowersActivity towersActivity) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 3);
        this.f23522f = towersActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o2.g gVar) {
        super("com.google.android.gms.maps.internal.IOnMapClickListener", 3);
        this.f23522f = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar) {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener", 3);
        this.f23522f = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 3);
        this.f23522f = aVar;
    }
}
