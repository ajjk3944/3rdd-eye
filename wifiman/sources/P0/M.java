package p0;

import android.graphics.Outline;
import m0.C6683T;
import m0.U0;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f57356a = new M();

    private M() {
    }

    public final void a(Outline outline, U0 u02) {
        if (!(u02 instanceof C6683T)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C6683T) u02).v());
    }
}
