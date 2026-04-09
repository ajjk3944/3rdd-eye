package f1;

import android.content.ComponentName;
import android.content.Context;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20045a = V0.m.h("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z6) {
        String str = f20045a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z6 ? 1 : 2, 1);
            V0.m.f().a(str, cls.getName() + " " + (z6 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e6) {
            V0.m.f().a(str, AbstractC2763b.f(cls.getName(), " could not be ", z6 ? "enabled" : "disabled"), e6);
        }
    }
}
