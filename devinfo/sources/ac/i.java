package ac;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import je.u;
import t7.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318a;

    public /* synthetic */ i(int i4) {
        this.f318a = i4;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i4 = this.f318a;
        return this;
    }

    public boolean e0(int i4, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i10) {
        boolean z3 = false;
        switch (this.f318a) {
            case 0:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i10)) {
                    return true;
                }
                return e0(i4, parcel, parcel2);
            case 1:
                if (i4 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i4, parcel, parcel2, i10)) {
                    return true;
                }
                n nVar = (n) this;
                if (i4 != 1) {
                    return false;
                }
                int i11 = parcel.readInt();
                int i12 = com.google.android.gms.internal.play_billing.d.f20097a;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(u.r(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                nVar.f34475b.a(Integer.valueOf(i11));
                return true;
            case 2:
                if (i4 > 16777215) {
                    if (!super.onTransact(i4, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                switch (i4) {
                    case 3:
                        zb.a.b(parcel);
                        break;
                    case 4:
                        zb.a.b(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        zb.a.b(parcel);
                        break;
                    case 7:
                        zb.a.b(parcel);
                        break;
                    case 8:
                        hc.e eVar = (hc.e) zb.a.a(parcel, hc.e.CREATOR);
                        zb.a.b(parcel);
                        w wVar = (w) this;
                        wVar.f9137c.post(new vd.a(wVar, z3, eVar, 8));
                        break;
                    case 9:
                        zb.a.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i4 > 16777215) {
                    if (!super.onTransact(i4, parcel, parcel2, i10)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                pd.h hVar = (pd.h) this;
                if (i4 == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i13 = qd.d.f32244a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(u.r(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    qd.n nVar2 = hVar.f31730d.f31734a;
                    TaskCompletionSource taskCompletionSource = hVar.f31729c;
                    nVar2.c(taskCompletionSource);
                    hVar.f31728b.d("onRequestInfo", new Object[0]);
                    if (bundle.getInt("error.code", -2) != 0) {
                        taskCompletionSource.trySetException(new ob.j(bundle.getInt("error.code", -2)));
                    } else {
                        bundle.getInt("version.code", -1);
                        int i14 = bundle.getInt("update.availability");
                        bundle.getInt("install.status", 0);
                        if (bundle.getInt("client.version.staleness", -1) != -1) {
                            bundle.getInt("client.version.staleness");
                        }
                        bundle.getInt("in.app.update.priority", 0);
                        bundle.getLong("bytes.downloaded");
                        bundle.getLong("total.bytes.to.download");
                        long j = bundle.getLong("additional.size.required");
                        pd.j jVar = hVar.f31731e.f31737d;
                        jVar.getClass();
                        long jA = pd.j.a(new File(jVar.f31738a.getFilesDir(), "assetpacks"));
                        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
                        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
                        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
                        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
                        HashMap map = new HashMap();
                        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                        HashSet hashSet = new HashSet();
                        if (integerArrayList != null) {
                            hashSet.addAll(integerArrayList);
                        }
                        map.put("blocking.destructive.intent", hashSet);
                        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                        HashSet hashSet2 = new HashSet();
                        if (integerArrayList2 != null) {
                            hashSet2.addAll(integerArrayList2);
                        }
                        map.put("nonblocking.destructive.intent", hashSet2);
                        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                        HashSet hashSet3 = new HashSet();
                        if (integerArrayList3 != null) {
                            hashSet3.addAll(integerArrayList3);
                        }
                        map.put("blocking.intent", hashSet3);
                        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                        HashSet hashSet4 = new HashSet();
                        if (integerArrayList4 != null) {
                            hashSet4.addAll(integerArrayList4);
                        }
                        map.put("nonblocking.intent", hashSet4);
                        taskCompletionSource.trySetResult(new pd.a(i14, j, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
                    }
                } else {
                    if (i4 != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i15 = qd.d.f32244a;
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(u.r(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    hVar.f31730d.f31734a.c(hVar.f31729c);
                    hVar.f31728b.d("onCompleteUpdate", new Object[0]);
                }
                return true;
        }
    }

    public i(String str) {
        this.f318a = 0;
        attachInterface(this, str);
    }
}
