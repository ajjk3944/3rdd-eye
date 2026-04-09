package z2;

import android.os.RemoteException;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.mx0;
import u0.d1;
import u0.n2;
import u0.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements BiddingTokenCallback, zc.f {

    /* renamed from: a, reason: collision with root package name */
    public Object f37861a;

    public /* synthetic */ f(Object obj) {
        this.f37861a = obj;
    }

    public n2 a() {
        w4.i iVarA = w4.i.a();
        if (iVarA.b() == 1) {
            return new j(true);
        }
        d1 d1VarR = q.r(Boolean.FALSE);
        iVarA.g(new e(d1VarR, this));
        return d1VarR;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
    public void onBiddingTokenCollected(String str) {
        mx0 mx0Var = (mx0) ((db.b) this.f37861a);
        mx0Var.getClass();
        try {
            ((ks) mx0Var.f14041b).k(str);
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }
}
