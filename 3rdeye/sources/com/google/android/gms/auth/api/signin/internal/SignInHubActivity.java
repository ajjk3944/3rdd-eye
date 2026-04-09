package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC1762o;
import androidx.lifecycle.F;
import androidx.loader.content.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Modifier;
import l1.AbstractC5266a;
import l1.C5267b;
import m0.j;

/* compiled from: com.google.android.gms:play-services-auth@@20.3.0 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC1762o {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.x, java.lang.Object] */
    private final void zbc() {
        AbstractC5266a supportLoaderManager = getSupportLoaderManager();
        zbw zbwVar = new zbw(this, null);
        C5267b c5267b = (C5267b) supportLoaderManager;
        C5267b.c cVar = c5267b.f43676b;
        if (cVar.f43685c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        j<C5267b.a> jVar = cVar.f43684b;
        C5267b.a aVarD = jVar.d(0);
        ?? r02 = c5267b.f43675a;
        if (aVarD == 0) {
            try {
                cVar.f43685c = true;
                b bVarOnCreateLoader = zbwVar.onCreateLoader(0, null);
                if (bVarOnCreateLoader == null) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (bVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(bVarOnCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarOnCreateLoader);
                }
                C5267b.a aVar = new C5267b.a(bVarOnCreateLoader);
                jVar.e(0, aVar);
                cVar.f43685c = false;
                C5267b.C0488b<D> c0488b = new C5267b.C0488b<>(aVar.f43677l, zbwVar);
                aVar.e(r02, c0488b);
                F f10 = aVar.f43679n;
                if (f10 != null) {
                    aVar.i(f10);
                }
                aVar.f43678m = r02;
                aVar.f43679n = c0488b;
            } catch (Throwable th) {
                cVar.f43685c = false;
                throw th;
            }
        } else {
            C5267b.C0488b<D> c0488b2 = new C5267b.C0488b<>(aVarD.f43677l, zbwVar);
            aVarD.e(r02, c0488b2);
            F f11 = aVarD.f43679n;
            if (f11 != null) {
                aVarD.i(f11);
            }
            aVarD.f43678m = r02;
            aVarD.f43679n = c0488b2;
        }
        zba = false;
    }

    private final void zbd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                zbn zbnVarZbc = zbn.zbc(this);
                GoogleSignInOptions googleSignInOptionsZba = this.zbc.zba();
                googleSignInAccountZba.getClass();
                zbnVarZbc.zbe(googleSignInOptionsZba, googleSignInAccountZba);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i10;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z10;
        if (z10) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.zbf = intent2;
            zbc();
        }
    }

    @Override // androidx.fragment.app.ActivityC1762o, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
