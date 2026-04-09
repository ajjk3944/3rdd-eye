package org.xbill.DNS;

/* loaded from: classes4.dex */
public final class Serial {
    private static final long MAX32 = 4294967295L;

    private Serial() {
    }

    public static int compare(long j10, long j11) {
        if (j10 < 0 || j10 > MAX32) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(j10);
            stringBuffer.append(" out of range");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        if (j11 < 0 || j11 > MAX32) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(j11);
            stringBuffer2.append(" out of range");
            throw new IllegalArgumentException(stringBuffer2.toString());
        }
        long j12 = j10 - j11;
        if (j12 >= MAX32) {
            j12 -= 4294967296L;
        } else if (j12 < -4294967295L) {
            j12 += 4294967296L;
        }
        return (int) j12;
    }

    public static long increment(long j10) {
        if (j10 >= 0 && j10 <= MAX32) {
            if (j10 == MAX32) {
                return 0L;
            }
            return j10 + 1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(j10);
        stringBuffer.append(" out of range");
        throw new IllegalArgumentException(stringBuffer.toString());
    }
}
