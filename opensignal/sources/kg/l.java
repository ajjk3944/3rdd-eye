package kg;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.FirebaseMessaging;
import h7.r1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements dd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14376a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f14377d;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i10) {
        this.f14376a = i10;
        this.f14377d = firebaseMessaging;
    }

    @Override // dd.e
    public final void h(Object obj) throws NumberFormatException {
        boolean z10;
        switch (this.f14376a) {
            case 0:
                x xVar = (x) obj;
                if (!this.f14377d.f5826e.j() || xVar.f14427h.a() == null) {
                    return;
                }
                synchronized (xVar) {
                    z10 = xVar.f14426g;
                }
                if (z10) {
                    return;
                }
                xVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f14377d;
                CloudMessage cloudMessage = (CloudMessage) obj;
                r1 r1Var = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                if (cloudMessage != null) {
                    kc.f.G(cloudMessage.f4803a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
