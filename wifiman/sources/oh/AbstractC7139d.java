package oh;

import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: oh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7139d extends AbstractC7138c {
    public static int a(int i10) {
        return Integer.signum(i10);
    }

    public static int b(long j10) {
        return Long.signum(j10);
    }

    public static double c(double d10) {
        return Math.log(d10) / C7136a.f55705b;
    }

    public static int d(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d10 > 2.147483647E9d ? MPv3.MAX_MESSAGE_ID : d10 < -2.147483648E9d ? PduHandle.NONE : (int) Math.round(d10);
    }

    public static int e(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long f(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static long g(float f10) {
        return AbstractC7137b.f(f10);
    }
}
