package ch;

import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e extends AbstractC4263d {
    public static Comparable k(Comparable a10, Comparable b10) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    public static float l(float f10, float... other) {
        AbstractC6492s.i(other, "other");
        for (float f11 : other) {
            f10 = Math.min(f10, f11);
        }
        return f10;
    }
}
