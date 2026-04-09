package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4R {
    public long A00;
    public long A01;
    public long A02;
    public final ThreadLocal<Long> A03 = new ThreadLocal<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized long A06(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A01 != -9223372036854775807L) {
            long jA01 = A01(this.A01);
            long j10 = (4294967296L + jA01) / 8589934592L;
            long j11 = ((j10 - 1) * 8589934592L) + j4;
            long j12 = (8589934592L * j10) + j4;
            if (Math.abs(j11 - jA01) >= Math.abs(j12 - jA01)) {
                j11 = j12;
            }
            j4 = j11;
        }
        return A05(A00(j4));
    }

    public C4R(long j4) {
        A07(j4);
    }

    public static long A00(long j4) {
        return (1000000 * j4) / 90000;
    }

    public static long A01(long j4) {
        return (90000 * j4) / 1000000;
    }

    public final synchronized long A02() {
        long j4;
        if (this.A00 != Long.MAX_VALUE && this.A00 != 9223372036854775806L) {
            j4 = this.A00;
        } else {
            j4 = -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized long A03() {
        long jA02;
        if (this.A01 != -9223372036854775807L) {
            jA02 = this.A01 + this.A02;
        } else {
            jA02 = A02();
        }
        return jA02;
    }

    public final synchronized long A04() {
        return this.A02;
    }

    public final synchronized long A05(long j4) {
        long desiredSampleTimestampUs;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 == -9223372036854775807L) {
            if (this.A00 == 9223372036854775806L) {
                desiredSampleTimestampUs = ((Long) C3M.A01(this.A03.get())).longValue();
            } else {
                desiredSampleTimestampUs = this.A00;
            }
            this.A02 = desiredSampleTimestampUs - j4;
            notifyAll();
        }
        this.A01 = j4;
        return this.A02 + j4;
    }

    public final synchronized void A07(long j4) {
        this.A00 = j4;
        this.A02 = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.A01 = -9223372036854775807L;
    }
}
