package y6;

import kotlin.jvm.internal.AbstractC6492s;
import u6.InterfaceC8137b;

/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8614c {
    public static final int a(InterfaceC8137b interfaceC8137b, int i10, float f10) {
        AbstractC6492s.i(interfaceC8137b, "<this>");
        return AbstractC8615d.d(i10, b(interfaceC8137b.a(), f10));
    }

    private static final int b(long j10, float f10) {
        float f11;
        if (f10 < 1.0f) {
            f11 = 0.0f;
        } else {
            f11 = f10 < 2.0f ? 0.05f : f10 < 3.0f ? 0.07f : f10 < 4.0f ? 0.08f : f10 < 6.0f ? 0.09f : f10 < 8.0f ? 0.11f : f10 < 12.0f ? 0.12f : f10 < 16.0f ? 0.14f : f10 < 24.0f ? 0.15f : 0.16f;
        }
        if (AbstractC8615d.c(j10) == 0.0f) {
            return 0;
        }
        return AbstractC8613b.c((int) j10, f11, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
