package gc;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;
import ob.g;
import ob.h;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends jm.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24628b;

    @Override // jm.a
    public ob.c d(Context context, Looper looper, o oVar, Object obj, g gVar, h hVar) {
        switch (this.f24628b) {
            case 0:
                oVar.getClass();
                Integer num = (Integer) oVar.g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new hc.a(context, looper, oVar, bundle, gVar, hVar);
            case 1:
                throw a0.g.h(obj);
            default:
                return super.d(context, looper, oVar, obj, gVar, hVar);
        }
    }

    @Override // jm.a
    public ob.c e(Context context, Looper looper, o oVar, Object obj, n nVar, n nVar2) {
        switch (this.f24628b) {
            case 2:
                return new rb.c(context, looper, oVar, (pb.o) obj, nVar, nVar2);
            case 3:
                return new yb.b(context, looper, 300, oVar, nVar, nVar2);
            default:
                return super.e(context, looper, oVar, obj, nVar, nVar2);
        }
    }
}
