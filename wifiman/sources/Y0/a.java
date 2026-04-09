package Y0;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        Z0.a aVarB = Z0.b.f25072a.b(f10);
        if (aVarB == null) {
            aVarB = new u(f10);
        }
        return new g(f11, f10, aVarB);
    }
}
