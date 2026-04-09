package zc;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q2 extends com.google.android.gms.internal.measurement.y implements z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(x2 x2Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f27108d = atomicReference;
    }

    @Override // zc.z
    public final void H(List list) {
        AtomicReference atomicReference = this.f27108d;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        H(arrayListCreateTypedArrayList);
        return true;
    }
}
