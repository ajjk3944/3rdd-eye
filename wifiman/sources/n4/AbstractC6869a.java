package n4;

import m4.AbstractC6769h;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6869a extends AbstractC6870b {
    public static int a(int i10, int i11, int i12) {
        AbstractC6769h.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }
}
