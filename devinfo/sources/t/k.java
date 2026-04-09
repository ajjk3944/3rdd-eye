package t;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k {
    public static void a(BiometricPrompt.Builder builder, int i4) {
        builder.setAllowedAuthenticators(i4);
    }
}
