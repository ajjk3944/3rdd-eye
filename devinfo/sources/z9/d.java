package z9;

import android.os.RemoteException;
import android.util.Log;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.kp;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb.b f38128a;

    public d(bb.b bVar) {
        this.f38128a = bVar;
    }

    @Override // z9.b
    public final void a(pa.a aVar) {
        Log.w(PangleMediationAdapter.TAG, aVar.toString());
        ((fk0) this.f38128a).a(aVar.f31512b);
    }

    @Override // z9.b
    public final void onInitializeSuccess() {
        fk0 fk0Var = (fk0) this.f38128a;
        fk0Var.getClass();
        try {
            ((kp) fk0Var.f11194b).c();
        } catch (RemoteException e2) {
            i.f("", e2);
        }
    }
}
