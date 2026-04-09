package q9;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(boolean z10, Number step) {
        p.e(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
