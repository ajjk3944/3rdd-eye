package yb;

import android.os.Parcel;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements j, si.h {
    @Override // com.google.android.gms.common.api.internal.j
    public void accept(Object obj, Object obj2) {
        c cVar = (c) ((b) obj).t();
        zza zzaVar = new zza(null, null);
        g gVar = new g((TaskCompletionSource) obj2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i4 = a.f37504a;
        parcelObtain.writeInt(1);
        zzaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(gVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            cVar.f37505a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // si.h
    public void c() {
    }

    @Override // si.h
    public void e(ArrayList arrayList) {
    }
}
