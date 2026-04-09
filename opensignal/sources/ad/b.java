package ad;

import ac.g;
import ac.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import bc.n;
import cc.i;
import com.google.android.gms.internal.measurement.i4;
import ec.e;
import h9.r2;

/* loaded from: classes.dex */
public final class b extends i4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f338c;

    @Override // com.google.android.gms.internal.measurement.i4
    public ac.c g(Context context, Looper looper, r2 r2Var, Object obj, g gVar, h hVar) {
        switch (this.f338c) {
            case 0:
                r2Var.getClass();
                Integer num = (Integer) r2Var.f10475y;
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
                return new bd.a(context, looper, r2Var, bundle, gVar, hVar);
            case 1:
                throw w.g.c(obj);
            default:
                return super.g(context, looper, r2Var, obj, gVar, hVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.i4
    public ac.c h(Context context, Looper looper, r2 r2Var, Object obj, n nVar, n nVar2) {
        switch (this.f338c) {
            case 2:
                return new ec.a(context, looper, 449, r2Var, nVar, nVar2);
            case 3:
                return new e(context, looper, r2Var, (i) obj, nVar, nVar2);
            case 4:
                return new pc.h(context, looper, r2Var, nVar, nVar2);
            default:
                return super.h(context, looper, r2Var, obj, nVar, nVar2);
        }
    }
}
