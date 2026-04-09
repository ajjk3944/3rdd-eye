package V2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c3.j;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c3.f f3871a;

    public f(c3.f fVar) {
        this.f3871a = fVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i3) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i3)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i6 = a.f3863a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        G2.c cVarCreateFromParcel = parcel.readInt() == 0 ? null : G2.c.CREATOR.createFromParcel(parcel);
        G2.b bVar = cVarCreateFromParcel != null ? new G2.b(cVarCreateFromParcel.f1515a, cVarCreateFromParcel.f1516b) : null;
        j jVar = this.f3871a.f5902a;
        if (statusCreateFromParcel.f6904a <= 0) {
            jVar.g(bVar);
            return true;
        }
        jVar.f(new K2.d(statusCreateFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
