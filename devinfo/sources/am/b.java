package am;

import ec.y;
import hm.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f665a;

    static {
        h hVar = h.f25175d;
        f665a = y.f("xn--");
    }

    public static int a(int i4, int i10, boolean z3) {
        int i11 = z3 ? i4 / 700 : i4 / 2;
        int i12 = (i11 / i10) + i11;
        int i13 = 0;
        while (i12 > 455) {
            i12 /= 35;
            i13 += 36;
        }
        return ((i12 * 36) / (i12 + 38)) + i13;
    }

    public static int b(int i4) {
        if (i4 < 26) {
            return i4 + 97;
        }
        if (i4 < 36) {
            return i4 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i4).toString());
    }
}
