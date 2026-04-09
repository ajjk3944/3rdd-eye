package Yg;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.AbstractC6507a;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public abstract class L {
    public static final int a(int i10, int i11) {
        return AbstractC6492s.k(i10 ^ PduHandle.NONE, i11 ^ PduHandle.NONE);
    }

    public static final int b(long j10, long j11) {
        return AbstractC6492s.l(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double c(long j10) {
        return ((j10 >>> 11) * 2048) + (j10 & 2047);
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String string = Long.toString(j10, AbstractC6507a.a(i10));
            AbstractC6492s.h(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, AbstractC6507a.a(i10));
        AbstractC6492s.h(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, AbstractC6507a.a(i10));
        AbstractC6492s.h(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
