package io.sentry.android.replay.util;

import android.os.Build;
import bf.n;
import br.l;

/* loaded from: classes.dex */
public final class f {
    public static String a(d dVar) {
        String str;
        l.e(dVar, "key");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i10 = e.f12001a[dVar.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new n();
            }
            str = Build.SOC_MANUFACTURER;
        }
        l.b(str);
        return str;
    }
}
