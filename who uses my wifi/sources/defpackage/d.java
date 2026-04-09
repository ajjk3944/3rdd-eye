package defpackage;

import java.io.Serializable;
import java.net.InetAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d implements Serializable {
    public final int f;
    public final boolean g;
    public final int h;
    public final Object i;

    public d(int i, boolean z, Serializable serializable, int i2) {
        this.f = i;
        this.g = z;
        this.i = serializable;
        this.h = i2;
        if (i2 < 0 || i2 >= 256 || ((i == 1 && i2 > 32) || (i == 2 && i2 > 128))) {
            throw new IllegalArgumentException("invalid prefix length");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i.equals(dVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + this.h + (this.g ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("!");
        }
        int i = this.f;
        sb.append(i);
        sb.append(":");
        Object obj = this.i;
        if (i == 1 || i == 2) {
            sb.append(((InetAddress) obj).getHostAddress());
        } else {
            sb.append(yb.s((byte[]) obj));
        }
        sb.append("/");
        sb.append(this.h);
        return sb.toString();
    }
}
