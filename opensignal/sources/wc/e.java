package wc;

import android.os.Parcel;
import android.os.RemoteException;
import bf.n;
import qc.i;
import qc.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final i f24411a;

    public e(i iVar) {
        this.f24411a = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            i iVar = this.f24411a;
            i iVar2 = ((e) obj).f24411a;
            qc.g gVar = (qc.g) iVar;
            Parcel parcelR = gVar.R();
            l.d(parcelR, iVar2);
            Parcel parcelE = gVar.e(parcelR, 8);
            boolean z10 = parcelE.readInt() != 0;
            parcelE.recycle();
            return z10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }

    public final int hashCode() {
        try {
            qc.g gVar = (qc.g) this.f24411a;
            Parcel parcelE = gVar.e(gVar.R(), 9);
            int i10 = parcelE.readInt();
            parcelE.recycle();
            return i10;
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
