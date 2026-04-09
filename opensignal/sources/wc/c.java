package wc;

import android.os.Parcel;
import android.os.RemoteException;
import bf.n;
import cc.s;
import com.google.android.gms.maps.model.LatLng;
import qc.l;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final qc.c f24409a;

    public c(qc.c cVar) {
        s.h(cVar);
        this.f24409a = cVar;
    }

    public final LatLng a() {
        try {
            qc.a aVar = (qc.a) this.f24409a;
            Parcel parcelE = aVar.e(aVar.R(), 4);
            LatLng latLng = (LatLng) l.a(parcelE, LatLng.CREATOR);
            parcelE.recycle();
            return latLng;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final Object b() {
        try {
            qc.a aVar = (qc.a) this.f24409a;
            Parcel parcelE = aVar.e(aVar.R(), 30);
            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
            parcelE.recycle();
            return jc.d.V(bVarU);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final void c(b bVar) {
        qc.c cVar = this.f24409a;
        try {
            if (bVar == null) {
                qc.a aVar = (qc.a) cVar;
                Parcel parcelR = aVar.R();
                l.d(parcelR, null);
                aVar.S(parcelR, 18);
                return;
            }
            jc.b bVar2 = bVar.f24408a;
            qc.a aVar2 = (qc.a) cVar;
            Parcel parcelR2 = aVar2.R();
            l.d(parcelR2, bVar2);
            aVar2.S(parcelR2, 18);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final void d(Object obj) {
        try {
            qc.c cVar = this.f24409a;
            jc.d dVar = new jc.d(obj);
            qc.a aVar = (qc.a) cVar;
            Parcel parcelR = aVar.R();
            l.d(parcelR, dVar);
            aVar.S(parcelR, 29);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        try {
            qc.c cVar = this.f24409a;
            qc.c cVar2 = ((c) obj).f24409a;
            qc.a aVar = (qc.a) cVar;
            Parcel parcelR = aVar.R();
            l.d(parcelR, cVar2);
            Parcel parcelE = aVar.e(parcelR, 16);
            boolean z10 = parcelE.readInt() != 0;
            parcelE.recycle();
            return z10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final int hashCode() {
        try {
            qc.a aVar = (qc.a) this.f24409a;
            Parcel parcelE = aVar.e(aVar.R(), 17);
            int i10 = parcelE.readInt();
            parcelE.recycle();
            return i10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
