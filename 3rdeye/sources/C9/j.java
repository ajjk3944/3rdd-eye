package C9;

import C9.g;

/* compiled from: Channel.kt */
/* loaded from: classes3.dex */
public final class j {
    public static b a(int i, int i10, a aVar) {
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if (i == -2) {
            if (aVar != a.SUSPEND) {
                return new o(1, aVar);
            }
            g.f1000W7.getClass();
            return new b(g.a.f1002b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i) : new o(i, aVar) : new b(Integer.MAX_VALUE) : aVar == a.SUSPEND ? new b(0) : new o(1, aVar);
        }
        if (aVar == a.SUSPEND) {
            return new o(1, a.DROP_OLDEST);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
