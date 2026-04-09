package x3;

import android.hardware.fingerprint.FingerprintManager;
import androidx.lifecycle.l0;
import i0.f;
import java.lang.ref.WeakReference;
import o.e;
import t.q;
import t.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f36974a;

    public a(e eVar) {
        this.f36974a = eVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i4, CharSequence charSequence) {
        ((q) ((f) this.f36974a.f30195b).f25418d).a(i4, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((q) ((f) this.f36974a.f30195b).f25418d).f33851a;
        if (weakReference.get() == null || !((s) weakReference.get()).f33862l) {
            return;
        }
        s sVar = (s) weakReference.get();
        if (sVar.f33869s == null) {
            sVar.f33869s = new l0();
        }
        s.j(sVar.f33869s, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i4, CharSequence charSequence) {
        WeakReference weakReference = ((q) ((f) this.f36974a.f30195b).f25418d).f33851a;
        if (weakReference.get() != null) {
            s sVar = (s) weakReference.get();
            if (sVar.f33868r == null) {
                sVar.f33868r = new l0();
            }
            s.j(sVar.f33868r, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult r4) {
        /*
            r3 = this;
            android.hardware.fingerprint.FingerprintManager$CryptoObject r4 = r4.getCryptoObject()
            r0 = 0
            if (r4 != 0) goto L8
            goto L38
        L8:
            javax.crypto.Cipher r1 = r4.getCipher()
            if (r1 == 0) goto L18
            w4.m r1 = new w4.m
            javax.crypto.Cipher r4 = r4.getCipher()
            r1.<init>(r4)
            goto L39
        L18:
            java.security.Signature r1 = r4.getSignature()
            if (r1 == 0) goto L28
            w4.m r1 = new w4.m
            java.security.Signature r4 = r4.getSignature()
            r1.<init>(r4)
            goto L39
        L28:
            javax.crypto.Mac r1 = r4.getMac()
            if (r1 == 0) goto L38
            w4.m r1 = new w4.m
            javax.crypto.Mac r4 = r4.getMac()
            r1.<init>(r4)
            goto L39
        L38:
            r1 = r0
        L39:
            o.e r4 = r3.f36974a
            r4.getClass()
            if (r1 != 0) goto L41
            goto L64
        L41:
            java.lang.Object r2 = r1.f36443b
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            if (r2 == 0) goto L4d
            se.b r0 = new se.b
            r0.<init>(r2)
            goto L64
        L4d:
            java.lang.Object r2 = r1.f36442a
            java.security.Signature r2 = (java.security.Signature) r2
            if (r2 == 0) goto L59
            se.b r0 = new se.b
            r0.<init>(r2)
            goto L64
        L59:
            java.lang.Object r1 = r1.f36444c
            javax.crypto.Mac r1 = (javax.crypto.Mac) r1
            if (r1 == 0) goto L64
            se.b r0 = new se.b
            r0.<init>(r1)
        L64:
            t.p r1 = new t.p
            r2 = 2
            r1.<init>(r0, r2)
            java.lang.Object r4 = r4.f30195b
            i0.f r4 = (i0.f) r4
            java.lang.Object r4 = r4.f25418d
            t.q r4 = (t.q) r4
            r4.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.a.onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager$AuthenticationResult):void");
    }
}
