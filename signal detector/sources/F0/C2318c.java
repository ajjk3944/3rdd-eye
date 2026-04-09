package f0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import b4.C0344i;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2318c extends C0344i {
    @Override // b4.C0344i
    public final Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
