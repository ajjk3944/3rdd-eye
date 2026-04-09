package c2;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18424a = androidx.work.m.g("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str = f18424a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            if (z10 == z11) {
                androidx.work.m.e().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            androidx.work.m mVarE = androidx.work.m.e();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z10 ? "enabled" : "disabled");
            mVarE.a(str, sb.toString());
        } catch (Exception e4) {
            androidx.work.m mVarE2 = androidx.work.m.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z10 ? "enabled" : "disabled");
            mVarE2.b(str, sb2.toString(), e4);
        }
    }
}
