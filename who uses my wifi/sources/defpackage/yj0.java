package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class yj0 {
    static {
        h80.f("PackageManagerHelper");
    }

    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            h80.d().a(new Throwable[0]);
        } catch (Exception e) {
            h80.d().a(e);
        }
    }
}
