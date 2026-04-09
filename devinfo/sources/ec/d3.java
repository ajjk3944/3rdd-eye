package ec;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d3 extends com.google.android.gms.internal.measurement.x implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f22686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f22687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(j3 j3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f22686a = atomicReference;
        this.f22687b = j3Var;
    }

    @Override // ec.k0
    public final void A3(a4 a4Var) {
        AtomicReference atomicReference = this.f22686a;
        synchronized (atomicReference) {
            s0 s0Var = ((o1) this.f22687b.f218b).f22954f;
            o1.m(s0Var);
            s0Var.f23060o.e(Integer.valueOf(a4Var.f22546a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(a4Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 2) {
            return false;
        }
        a4 a4Var = (a4) com.google.android.gms.internal.measurement.y.a(parcel, a4.CREATOR);
        com.google.android.gms.internal.measurement.y.d(parcel);
        A3(a4Var);
        return true;
    }
}
