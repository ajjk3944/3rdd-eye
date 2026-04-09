package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ep1 extends t94 {
    public int n;
    public Date o;
    public Date p;
    public long q;
    public long r;
    public double s;
    public float t;
    public y94 u;
    public long v;

    @Override // defpackage.t94
    public final void c(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.n = i;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.g) {
            d();
        }
        if (this.n == 1) {
            this.o = yc0.o(m54.R(byteBuffer));
            this.p = yc0.o(m54.R(byteBuffer));
            this.q = m54.D(byteBuffer);
            this.r = m54.R(byteBuffer);
        } else {
            this.o = yc0.o(m54.D(byteBuffer));
            this.p = yc0.o(m54.D(byteBuffer));
            this.q = m54.D(byteBuffer);
            this.r = m54.D(byteBuffer);
        }
        this.s = m54.V(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.t = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        m54.D(byteBuffer);
        m54.D(byteBuffer);
        this.u = new y94(m54.V(byteBuffer), m54.V(byteBuffer), m54.V(byteBuffer), m54.V(byteBuffer), m54.X(byteBuffer), m54.X(byteBuffer), m54.X(byteBuffer), m54.V(byteBuffer), m54.V(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.v = m54.D(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.o + ";modificationTime=" + this.p + ";timescale=" + this.q + ";duration=" + this.r + ";rate=" + this.s + ";volume=" + this.t + ";matrix=" + this.u + ";nextTrackId=" + this.v + "]";
    }
}
