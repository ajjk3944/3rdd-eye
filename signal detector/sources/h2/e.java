package h2;

import android.os.RemoteException;
import android.util.Log;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.internal.ads.InterfaceC0806Xb;
import com.google.android.gms.internal.ads.Rx;
import j2.C2545a;
import u2.k;
import w2.InterfaceC2970b;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2970b f20473a;

    public e(InterfaceC2970b interfaceC2970b) {
        this.f20473a = interfaceC2970b;
    }

    @Override // h2.b
    public final void a() {
        Rx rx = (Rx) this.f20473a;
        rx.getClass();
        try {
            ((InterfaceC0806Xb) rx.f11090b).b();
        } catch (RemoteException e6) {
            k.f("", e6);
        }
    }

    @Override // h2.b
    public final void b(C2545a c2545a) {
        Log.w(PangleMediationAdapter.TAG, c2545a.toString());
        String str = (String) c2545a.f21322c;
        Rx rx = (Rx) this.f20473a;
        rx.getClass();
        try {
            ((InterfaceC0806Xb) rx.f11090b).K2(str);
        } catch (RemoteException e6) {
            k.f("", e6);
        }
    }
}
