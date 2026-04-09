package defpackage;

import java.net.InetAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bl0 {
    public final InetAddress a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;
    public final float f;

    public bl0(InetAddress inetAddress, long j, long j2, float f, float f2, float f3) {
        this.a = inetAddress;
        this.b = j;
        this.c = j2;
        this.d = f / j;
        this.e = f2;
        this.f = f3;
    }

    public final String toString() {
        return "PingStats{ia=" + this.a + ", noPings=" + this.b + ", packetsLost=" + this.c + ", averageTimeTaken=" + this.d + ", minTimeTaken=" + this.e + ", maxTimeTaken=" + this.f + '}';
    }
}
