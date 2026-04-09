package s;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7853n {
    public static final boolean a(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z10 = (((Configuration) interfaceC3540l.t(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z10;
    }
}
