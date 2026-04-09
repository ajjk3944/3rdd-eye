package t;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.lifecycle.l0;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends BiometricPrompt$AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f33839a;

    public a(d dVar) {
        this.f33839a = dVar;
    }

    public void onAuthenticationError(int i4, CharSequence charSequence) {
        this.f33839a.a(i4, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((q) this.f33839a).f33851a;
        if (weakReference.get() == null || !((s) weakReference.get()).f33862l) {
            return;
        }
        s sVar = (s) weakReference.get();
        if (sVar.f33869s == null) {
            sVar.f33869s = new l0();
        }
        s.j(sVar.f33869s, Boolean.TRUE);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialB;
        se.b bVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherD = u.d(cryptoObject);
            if (cipherD != null) {
                bVar = new se.b(cipherD);
            } else {
                Signature signatureF = u.f(cryptoObject);
                if (signatureF != null) {
                    bVar = new se.b(signatureF);
                } else {
                    Mac macE = u.e(cryptoObject);
                    if (macE != null) {
                        bVar = new se.b(macE);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = v.b(cryptoObject)) != null) {
                        bVar = new se.b(identityCredentialB);
                    }
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i4 >= 30) {
            if (authenticationResult != null) {
                iA = c.a(authenticationResult);
            }
        } else if (i4 != 29) {
            iA = 2;
        }
        this.f33839a.b(new p(bVar, iA));
    }

    public void onAuthenticationHelp(int i4, CharSequence charSequence) {
    }
}
