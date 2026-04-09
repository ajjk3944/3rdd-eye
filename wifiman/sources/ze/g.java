package ze;

import androidx.lifecycle.E;
import androidx.lifecycle.N;
import kotlin.jvm.internal.AbstractC6492s;
import ye.AbstractC8661g;

/* loaded from: classes4.dex */
public abstract class g {
    public static final void a(N instance, E savedStateHandle) {
        AbstractC6492s.i(instance, "instance");
        AbstractC6492s.i(savedStateHandle, "savedStateHandle");
        if (instance instanceof AbstractC8661g) {
            AbstractC8661g abstractC8661g = (AbstractC8661g) instance;
            abstractC8661g.m0(savedStateHandle);
            abstractC8661g.l0();
        }
    }
}
