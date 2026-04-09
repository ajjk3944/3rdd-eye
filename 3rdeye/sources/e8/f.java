package e8;

import android.content.Context;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import kotlin.jvm.internal.l;
import x2.AbstractActivityC5757a;
import y0.C5788a;

/* compiled from: PermissionUtils.kt */
/* loaded from: classes3.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(android.content.Context r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.l.f(r5, r0)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = r5.equals(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 <= r3) goto L23
            va.a$b r4 = va.a.f47104a
            java.lang.String r5 = "Do not request WRITE_EXTERNAL_STORAGE on Android "
            java.lang.String r5 = g0.C4356c.h(r0, r5)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r4.l(r5, r0)
            return r2
        L23:
            if (r0 != r3) goto L2c
            boolean r0 = H2.e.p()
            if (r0 != 0) goto L2c
            goto L32
        L2c:
            int r4 = z0.C5848a.checkSelfPermission(r4, r5)
            if (r4 != 0) goto L33
        L32:
            return r2
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.f.a(android.content.Context, java.lang.String):boolean");
    }

    public static final boolean b(AbstractActivityC5757a abstractActivityC5757a, String[] permissions) {
        l.f(permissions, "permissions");
        for (String str : permissions) {
            if (C5788a.b(abstractActivityC5757a, str)) {
                return true;
            }
        }
        return false;
    }

    public static final void c(Context context, String str, String str2, String str3, String str4) {
        d.a aVar = new d.a(context);
        AlertController.b bVar = aVar.f14344a;
        bVar.f14317d = str;
        bVar.f14319f = str2;
        aVar.b(str3, new C2.d(context, 3));
        e eVar = new e();
        bVar.i = str4;
        bVar.f14322j = eVar;
        aVar.a().show();
    }

    public static final void d(Context context, AbstractC4324a permissionRequester, String str, String str2, String str3) {
        l.f(permissionRequester, "permissionRequester");
        d.a aVar = new d.a(context);
        AlertController.b bVar = aVar.f14344a;
        bVar.f14317d = str;
        bVar.f14319f = str2;
        aVar.b(str3, new C2.a(permissionRequester, 1));
        aVar.a().show();
    }
}
