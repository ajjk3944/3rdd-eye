package zc;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r2 extends com.google.android.gms.internal.measurement.y implements b0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x2 f27132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(x2 x2Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f27131d = atomicReference;
        this.f27132e = x2Var;
    }

    @Override // zc.b0
    public final void F(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f27131d;
        synchronized (atomicReference) {
            j0 j0Var = ((c1) this.f27132e.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.K.c(Integer.valueOf(zzoqVar.f5419a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.z.a(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        F(zzoqVar);
        return true;
    }
}
