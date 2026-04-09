package c7;

import android.content.ComponentName;
import android.content.Context;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2784a = v.g("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z3) {
        String str = f2784a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z10 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z10 = true;
            }
            if (z3 == z10) {
                v.e().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
            v vVarE = v.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z3 ? "enabled" : "disabled");
            vVarE.a(str, sb2.toString());
        } catch (Exception e2) {
            v vVarE2 = v.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z3 ? "enabled" : "disabled");
            vVarE2.b(str, sb3.toString(), e2);
        }
    }
}
