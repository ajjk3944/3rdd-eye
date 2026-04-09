package y4;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import g0.C4356c;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC5805a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i10)) {
            return true;
        }
        f fVar = (f) this;
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i11 = b.f48106a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C4356c.h(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        x4.h hVar = (x4.h) fVar;
        n nVar = hVar.f47768d.f47770a;
        if (nVar != null) {
            TaskCompletionSource taskCompletionSource = hVar.f47767c;
            synchronized (nVar.f48123f) {
                nVar.f48122e.remove(taskCompletionSource);
            }
            synchronized (nVar.f48123f) {
                try {
                    if (nVar.f48127k.get() <= 0 || nVar.f48127k.decrementAndGet() <= 0) {
                        nVar.a().post(new j(nVar));
                    } else {
                        nVar.f48119b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    }
                } finally {
                }
            }
        }
        hVar.f47766b.a("onGetLaunchReviewFlowInfo", new Object[0]);
        hVar.f47767c.trySetResult(new x4.c((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
