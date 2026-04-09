package m2;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23386a = androidx.work.k.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.k.c().a(f23386a, String.format("%s %s", cls.getName(), z10 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e10) {
            androidx.work.k.c().a(f23386a, String.format("%s could not be %s", cls.getName(), z10 ? "enabled" : "disabled"), e10);
        }
    }
}
