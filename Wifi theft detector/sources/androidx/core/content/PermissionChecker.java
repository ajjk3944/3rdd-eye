package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.annotation.RestrictTo;
import f0.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import r0.d;

/* loaded from: classes.dex */
public abstract class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface PermissionResult {
    }

    public static int a(Context context, String str, int i10, int i11, String str2) {
        if (context.checkPermission(str, i10, i11) == -1) {
            return -1;
        }
        String strC = f.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i11);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i11 || !d.a(context.getPackageName(), str2)) ? f.b(context, strC, str2) : f.a(context, i11, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
