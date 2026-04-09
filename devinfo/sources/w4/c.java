package w4;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ja.c {
    @Override // ja.c
    public final Signature[] w(String str, PackageManager packageManager) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
