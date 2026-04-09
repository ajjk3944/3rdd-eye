package defpackage;

import android.content.res.Resources;
import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class m31 {
    public static final uk2 a;
    public static final t90 b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new p31();
        } else if (i >= 28) {
            a = new o31();
        } else {
            a = new n31();
        }
        b = new t90(16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r14, defpackage.sv r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, defpackage.g82 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m31.a(android.content.Context, sv, android.content.res.Resources, int, java.lang.String, int, int, g82, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
