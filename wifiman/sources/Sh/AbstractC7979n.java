package sh;

import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sh.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7979n {
    public static final void a(boolean z10, Number step) {
        AbstractC6492s.i(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    public static InterfaceC7970e b(float f10, float f11) {
        return new C7969d(f10, f11);
    }
}
