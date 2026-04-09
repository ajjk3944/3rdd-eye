package t;

import a0.x0;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.h1;
import androidx.lifecycle.j1;
import androidx.lifecycle.l0;
import b5.u0;
import com.google.android.gms.internal.measurement.z3;
import com.liuzh.deviceinfo.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m extends b5.z {
    public final Handler Z = new Handler(Looper.getMainLooper());

    /* renamed from: a0, reason: collision with root package name */
    public s f33848a0;

    @Override // b5.z
    public final void D(int i4, int i10, Intent intent) throws Resources.NotFoundException {
        super.D(i4, i10, intent);
        if (i4 == 1) {
            this.f33848a0.f33863m = false;
            if (i10 == -1) {
                k0(new p(null, 1));
            } else {
                i0(10, u(R.string.generic_error_user_canceled));
            }
        }
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (n() == null) {
            return;
        }
        i.g gVarN = n();
        nk.k.e(gVarN, "owner");
        j1 j1VarE = gVarN.e();
        h1 h1VarB = gVarN.b();
        h5.c cVarC = gVarN.c();
        nk.k.e(h1VarB, "factory");
        x0 x0Var = new x0(j1VarE, h1VarB, cVarC);
        nk.e eVarA = nk.v.a(s.class);
        String strB = eVarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        s sVar = (s) x0Var.D(eVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        this.f33848a0 = sVar;
        if (sVar.f33866p == null) {
            sVar.f33866p = new l0();
        }
        sVar.f33866p.e(this, new g(this, 0));
        s sVar2 = this.f33848a0;
        if (sVar2.f33867q == null) {
            sVar2.f33867q = new l0();
        }
        sVar2.f33867q.e(this, new g(this, 1));
        s sVar3 = this.f33848a0;
        if (sVar3.f33868r == null) {
            sVar3.f33868r = new l0();
        }
        sVar3.f33868r.e(this, new g(this, 2));
        s sVar4 = this.f33848a0;
        if (sVar4.f33869s == null) {
            sVar4.f33869s = new l0();
        }
        sVar4.f33869s.e(this, new g(this, 3));
        s sVar5 = this.f33848a0;
        if (sVar5.f33870t == null) {
            sVar5.f33870t = new l0();
        }
        sVar5.f33870t.e(this, new g(this, 4));
        s sVar6 = this.f33848a0;
        if (sVar6.f33872v == null) {
            sVar6.f33872v = new l0();
        }
        sVar6.f33872v.e(this, new g(this, 5));
    }

    @Override // b5.z
    public final void P() {
        this.F = true;
        if (Build.VERSION.SDK_INT == 29 && com.bumptech.glide.e.F(this.f33848a0.e())) {
            s sVar = this.f33848a0;
            sVar.f33865o = true;
            this.Z.postDelayed(new l(sVar, 2), 250L);
        }
    }

    @Override // b5.z
    public final void Q() {
        this.F = true;
        if (Build.VERSION.SDK_INT >= 29 || this.f33848a0.f33863m) {
            return;
        }
        i.g gVarN = n();
        if (gVarN == null || !gVarN.isChangingConfigurations()) {
            c0(0);
        }
    }

    public final void c0(int i4) {
        if (i4 == 3 || !this.f33848a0.f33865o) {
            if (g0()) {
                this.f33848a0.j = i4;
                if (i4 == 1) {
                    j0(10, z3.k(10, p()));
                }
            }
            s sVar = this.f33848a0;
            if (sVar.g == null) {
                sVar.g = new km.n((char) 0, 18);
            }
            km.n nVar = sVar.g;
            CancellationSignal cancellationSignal = (CancellationSignal) nVar.f28442b;
            if (cancellationSignal != null) {
                try {
                    t.a(cancellationSignal);
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e2);
                }
                nVar.f28442b = null;
            }
            a4.d dVar = (a4.d) nVar.f28443c;
            if (dVar != null) {
                try {
                    dVar.d();
                } catch (NullPointerException e10) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e10);
                }
                nVar.f28443c = null;
            }
        }
    }

    public final void d0() throws Resources.NotFoundException {
        this.f33848a0.f33861k = false;
        e0();
        if (!this.f33848a0.f33863m && y()) {
            b5.a aVar = new b5.a(s());
            aVar.j(this);
            aVar.f(true, true);
        }
        Context contextP = p();
        if (contextP != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : contextP.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        s sVar = this.f33848a0;
                        sVar.f33864n = true;
                        this.Z.postDelayed(new l(sVar, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void e0() {
        this.f33848a0.f33861k = false;
        if (y()) {
            u0 u0VarS = s();
            z zVar = (z) u0VarS.D("androidx.biometric.FingerprintDialogFragment");
            if (zVar != null) {
                if (zVar.y()) {
                    zVar.c0();
                    return;
                }
                b5.a aVar = new b5.a(u0VarS);
                aVar.j(zVar);
                aVar.f(true, true);
            }
        }
    }

    public final boolean f0() {
        return Build.VERSION.SDK_INT <= 28 && com.bumptech.glide.e.F(this.f33848a0.e());
    }

    public final boolean g0() throws Resources.NotFoundException {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            i.g gVarN = n();
            if (gVarN != null && this.f33848a0.f33857e != null) {
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                if (i4 == 28) {
                    if (str != null) {
                        for (String str3 : gVarN.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                            if (str.equalsIgnoreCase(str3)) {
                                break;
                            }
                        }
                    }
                    String str4 = Build.MODEL;
                    if (str4 != null) {
                        for (String str5 : gVarN.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (!str4.startsWith(str5)) {
                            }
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT != 28) {
                return false;
            }
            Context contextP = p();
            return contextP == null || contextP.getPackageManager() == null || !b0.a(contextP.getPackageManager());
        }
        return true;
    }

    public final void h0() {
        i.g gVarN = n();
        if (gVarN == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager keyguardManagerA = a0.a(gVarN);
        if (keyguardManagerA == null) {
            i0(12, u(R.string.generic_error_no_keyguard));
            return;
        }
        se.b bVar = this.f33848a0.f33856d;
        CharSequence charSequence = bVar != null ? (CharSequence) bVar.f33556a : null;
        CharSequence charSequence2 = bVar != null ? (CharSequence) bVar.f33557b : null;
        CharSequence charSequence3 = bVar != null ? (CharSequence) bVar.f33558c : null;
        if (charSequence2 == null) {
            charSequence2 = charSequence3;
        }
        Intent intentA = h.a(keyguardManagerA, charSequence, charSequence2);
        if (intentA == null) {
            i0(14, u(R.string.generic_error_no_device_credential));
            return;
        }
        this.f33848a0.f33863m = true;
        if (g0()) {
            e0();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void i0(int i4, CharSequence charSequence) {
        j0(i4, charSequence);
        d0();
    }

    public final void j0(int i4, CharSequence charSequence) {
        s sVar = this.f33848a0;
        if (sVar.f33863m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!sVar.f33862l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        sVar.f33862l = false;
        Executor nVar = sVar.f33854b;
        if (nVar == null) {
            nVar = new b4.n(4);
        }
        nVar.execute(new b4.a(this, i4, charSequence));
    }

    public final void k0(p pVar) throws Resources.NotFoundException {
        s sVar = this.f33848a0;
        if (sVar.f33862l) {
            sVar.f33862l = false;
            Executor nVar = sVar.f33854b;
            if (nVar == null) {
                nVar = new b4.n(4);
            }
            nVar.execute(new f(this, pVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        d0();
    }

    public final void l0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = u(R.string.default_error_msg);
        }
        this.f33848a0.h(2);
        this.f33848a0.g(charSequence);
    }

    public final void m0() throws Resources.NotFoundException {
        IdentityCredential identityCredential;
        int i4;
        if (this.f33848a0.f33861k) {
            return;
        }
        if (p() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        s sVar = this.f33848a0;
        sVar.f33861k = true;
        sVar.f33862l = true;
        BiometricPrompt.CryptoObject cryptoObjectA = null;
        mVar = null;
        mVar = null;
        mVar = null;
        w4.m mVar = null;
        cryptoObjectA = null;
        cryptoObjectA = null;
        if (g0()) {
            Context applicationContext = W().getApplicationContext();
            d8.f fVar = new d8.f(applicationContext);
            FingerprintManager fingerprintManagerE = d8.f.e(applicationContext);
            if (fingerprintManagerE == null || !fingerprintManagerE.isHardwareDetected()) {
                i4 = 12;
            } else {
                FingerprintManager fingerprintManagerE2 = d8.f.e(applicationContext);
                i4 = (fingerprintManagerE2 == null || !fingerprintManagerE2.hasEnrolledFingerprints()) ? 11 : 0;
            }
            if (i4 != 0) {
                i0(i4, z3.k(i4, applicationContext));
                return;
            }
            if (y()) {
                this.f33848a0.f33871u = true;
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT == 28 && str != null) {
                    for (String str2 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                        if (str.startsWith(str2)) {
                            break;
                        }
                    }
                    this.Z.postDelayed(new f(this, 1), 500L);
                    new z().h0(s(), "androidx.biometric.FingerprintDialogFragment");
                } else {
                    this.Z.postDelayed(new f(this, 1), 500L);
                    new z().h0(s(), "androidx.biometric.FingerprintDialogFragment");
                }
                s sVar2 = this.f33848a0;
                sVar2.j = 0;
                se.b bVar = sVar2.f33857e;
                if (bVar != null) {
                    Cipher cipher = (Cipher) bVar.f33557b;
                    if (cipher != null) {
                        mVar = new w4.m(cipher);
                    } else {
                        Signature signature = (Signature) bVar.f33556a;
                        if (signature != null) {
                            mVar = new w4.m(signature);
                        } else {
                            Mac mac = (Mac) bVar.f33558c;
                            if (mac != null) {
                                mVar = new w4.m(mac);
                            } else if (Build.VERSION.SDK_INT >= 30 && ((IdentityCredential) bVar.f33559d) != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
                s sVar3 = this.f33848a0;
                if (sVar3.g == null) {
                    sVar3.g = new km.n((char) 0, 18);
                }
                km.n nVar = sVar3.g;
                if (((a4.d) nVar.f28443c) == null) {
                    nVar.f28443c = new a4.d();
                }
                a4.d dVar = (a4.d) nVar.f28443c;
                s sVar4 = this.f33848a0;
                if (sVar4.f33858f == null) {
                    sVar4.f33858f = new i0.f(new q(sVar4));
                }
                i0.f fVar2 = sVar4.f33858f;
                if (((o.e) fVar2.f25417c) == null) {
                    fVar2.f25417c = new o.e(15, fVar2);
                }
                try {
                    fVar.b(mVar, dVar, (o.e) fVar2.f25417c);
                    return;
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    i0(1, z3.k(1, applicationContext));
                    return;
                }
            }
            return;
        }
        BiometricPrompt.Builder builderD = i.d(W().getApplicationContext());
        se.b bVar2 = this.f33848a0.f33856d;
        CharSequence charSequence = bVar2 != null ? (CharSequence) bVar2.f33556a : null;
        CharSequence charSequence2 = bVar2 != null ? (CharSequence) bVar2.f33557b : null;
        CharSequence charSequence3 = bVar2 != null ? (CharSequence) bVar2.f33558c : null;
        if (charSequence != null) {
            i.h(builderD, charSequence);
        }
        if (charSequence2 != null) {
            i.g(builderD, charSequence2);
        }
        if (charSequence3 != null) {
            i.e(builderD, charSequence3);
        }
        s sVar5 = this.f33848a0;
        CharSequence charSequence4 = sVar5.f33860i;
        if (charSequence4 == null) {
            se.b bVar3 = sVar5.f33856d;
            if (bVar3 != null) {
                charSequence4 = (CharSequence) bVar3.f33559d;
                if (charSequence4 == null) {
                    charSequence4 = "";
                }
            } else {
                charSequence4 = null;
            }
        }
        if (!TextUtils.isEmpty(charSequence4)) {
            Executor nVar2 = this.f33848a0.f33854b;
            if (nVar2 == null) {
                nVar2 = new b4.n(4);
            }
            s sVar6 = this.f33848a0;
            if (sVar6.f33859h == null) {
                sVar6.f33859h = new r(sVar6);
            }
            i.f(builderD, charSequence4, nVar2, sVar6.f33859h);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            se.b bVar4 = this.f33848a0.f33856d;
            j.a(builderD, true);
        }
        int iE = this.f33848a0.e();
        if (i10 >= 30) {
            k.a(builderD, iE);
        } else if (i10 >= 29) {
            j.b(builderD, com.bumptech.glide.e.F(iE));
        }
        BiometricPrompt biometricPromptC = i.c(builderD);
        Context contextP = p();
        se.b bVar5 = this.f33848a0.f33857e;
        if (bVar5 != null) {
            Cipher cipher2 = (Cipher) bVar5.f33557b;
            if (cipher2 != null) {
                cryptoObjectA = u.b(cipher2);
            } else {
                Signature signature2 = (Signature) bVar5.f33556a;
                if (signature2 != null) {
                    cryptoObjectA = u.a(signature2);
                } else {
                    Mac mac2 = (Mac) bVar5.f33558c;
                    if (mac2 != null) {
                        cryptoObjectA = u.c(mac2);
                    } else if (i10 >= 30 && (identityCredential = (IdentityCredential) bVar5.f33559d) != null) {
                        cryptoObjectA = v.a(identityCredential);
                    }
                }
            }
        }
        s sVar7 = this.f33848a0;
        if (sVar7.g == null) {
            sVar7.g = new km.n((char) 0, 18);
        }
        km.n nVar3 = sVar7.g;
        if (((CancellationSignal) nVar3.f28442b) == null) {
            nVar3.f28442b = t.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) nVar3.f28442b;
        b4.n nVar4 = new b4.n(3);
        s sVar8 = this.f33848a0;
        if (sVar8.f33858f == null) {
            sVar8.f33858f = new i0.f(new q(sVar8));
        }
        i0.f fVar3 = sVar8.f33858f;
        if (((BiometricPrompt$AuthenticationCallback) fVar3.f25416b) == null) {
            fVar3.f25416b = b.a((q) fVar3.f25418d);
        }
        BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = (BiometricPrompt$AuthenticationCallback) fVar3.f25416b;
        try {
            if (cryptoObjectA == null) {
                i.b(biometricPromptC, cancellationSignal, nVar4, biometricPrompt$AuthenticationCallback);
            } else {
                i.a(biometricPromptC, cryptoObjectA, cancellationSignal, nVar4, biometricPrompt$AuthenticationCallback);
            }
        } catch (NullPointerException e10) {
            Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e10);
            i0(1, contextP != null ? contextP.getString(R.string.default_error_msg) : "");
        }
    }
}
