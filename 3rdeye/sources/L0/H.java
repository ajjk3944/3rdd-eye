package L0;

import L0.I;
import android.view.View;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class H extends I.b<Boolean> {
    @Override // L0.I.b
    public final Boolean a(View view) {
        return Boolean.valueOf(I.g.c(view));
    }

    @Override // L0.I.b
    public final void b(View view, Boolean bool) {
        I.g.g(view, bool.booleanValue());
    }

    @Override // L0.I.b
    public final boolean d(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
