package androidx.profileinstaller;

import A0.h;
import A0.j;
import G3.C0152f;
import J0.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // J0.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // J0.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0152f(4);
        }
        j.a(new h(this, context.getApplicationContext()));
        return new C0152f(4);
    }
}
