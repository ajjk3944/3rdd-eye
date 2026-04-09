package F3;

import org.snmp4j.mp.MPv3;

/* renamed from: F3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2787c {
    AbstractC2787c() {
    }

    static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        return i12 < 0 ? MPv3.MAX_MESSAGE_ID : i12;
    }
}
