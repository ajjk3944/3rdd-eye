package wc;

import android.os.Parcel;
import android.os.RemoteException;
import bf.n;
import cc.s;
import qc.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final qc.f f24410a;

    public d(qc.f fVar) {
        s.h(fVar);
        this.f24410a = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            qc.f fVar = this.f24410a;
            qc.f fVar2 = ((d) obj).f24410a;
            qc.d dVar = (qc.d) fVar;
            Parcel parcelR = dVar.R();
            l.d(parcelR, fVar2);
            Parcel parcelE = dVar.e(parcelR, 15);
            boolean z10 = parcelE.readInt() != 0;
            parcelE.recycle();
            return z10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final int hashCode() {
        try {
            qc.d dVar = (qc.d) this.f24410a;
            Parcel parcelE = dVar.e(dVar.R(), 16);
            int i10 = parcelE.readInt();
            parcelE.recycle();
            return i10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
