package ec;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c3 extends com.google.android.gms.internal.measurement.x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22608a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(j3 j3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f22608a = atomicReference;
    }

    @Override // ec.i0
    public final void E3(List list) {
        AtomicReference atomicReference = this.f22608a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(v3.CREATOR);
        com.google.android.gms.internal.measurement.y.d(parcel);
        E3(arrayListCreateTypedArrayList);
        return true;
    }
}
