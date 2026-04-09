package H0;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class e {
    public static final Resources a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1554054999, i10, -1, "androidx.compose.ui.res.resources (Resources.android.kt:33)");
        }
        interfaceC3540l.t(AndroidCompositionLocals_androidKt.f());
        Resources resources = ((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g())).getResources();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return resources;
    }
}
