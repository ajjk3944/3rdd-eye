package O2;

import K2.h;
import L2.k;
import M2.n;
import T2.g;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b3.C0331a;
import q2.C2834o;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3064d;

    @Override // T2.g
    public K2.c a(Context context, Looper looper, C2834o c2834o, Object obj, K2.g gVar, h hVar) {
        switch (this.f3064d) {
            case 2:
                c2834o.getClass();
                Integer num = (Integer) c2834o.f23257g;
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
                return new C0331a(context, looper, c2834o, bundle, gVar, hVar);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.a(context, looper, c2834o, obj, gVar, hVar);
        }
    }

    @Override // T2.g
    public K2.c b(Context context, Looper looper, C2834o c2834o, Object obj, k kVar, k kVar2) {
        switch (this.f3064d) {
            case 0:
                return new d(context, looper, c2834o, (n) obj, kVar, kVar2);
            case 1:
                return new V2.b(context, looper, 300, c2834o, kVar, kVar2);
            default:
                return super.b(context, looper, c2834o, obj, kVar, kVar2);
        }
    }
}
