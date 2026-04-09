package N3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.e;
import p3.C7214a;
import r3.C7564b;
import s3.AbstractC7888c;
import s3.AbstractC7892g;
import s3.AbstractC7901p;
import s3.C7889d;
import s3.I;

/* loaded from: classes.dex */
public class a extends AbstractC7892g implements M3.e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f14882M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f14883I;

    /* renamed from: J, reason: collision with root package name */
    private final C7889d f14884J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f14885K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f14886L;

    public a(Context context, Looper looper, boolean z10, C7889d c7889d, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, c7889d, aVar, bVar);
        this.f14883I = true;
        this.f14884J = c7889d;
        this.f14885K = bundle;
        this.f14886L = c7889d.g();
    }

    public static Bundle j0(C7889d c7889d) {
        c7889d.f();
        Integer numG = c7889d.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c7889d.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // s3.AbstractC7888c
    protected final String C() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // s3.AbstractC7888c
    protected final String D() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 12451000;
    }

    @Override // M3.e
    public final void i(f fVar) {
        AbstractC7901p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.f14884J.b();
            ((g) B()).n0(new j(1, new I(accountB, ((Integer) AbstractC7901p.l(this.f14886L)).intValue(), "<<default account>>".equals(accountB.name) ? C7214a.a(w()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.b0(new l(1, new C7564b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final boolean m() {
        return this.f14883I;
    }

    @Override // M3.e
    public final void n() {
        f(new AbstractC7888c.d());
    }

    @Override // s3.AbstractC7888c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // s3.AbstractC7888c
    protected final Bundle y() {
        if (!w().getPackageName().equals(this.f14884J.d())) {
            this.f14885K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f14884J.d());
        }
        return this.f14885K;
    }
}
