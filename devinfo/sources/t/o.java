package t;

import android.hardware.biometrics.BiometricManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o {
    public static int a(BiometricManager biometricManager, int i4) {
        return biometricManager.canAuthenticate(i4);
    }
}
