package defpackage;

import java.net.InetSocketAddress;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hh0 {
    public final InetSocketAddress a;

    public hh0(InetSocketAddress inetSocketAddress) {
        this.a = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        InetSocketAddress inetSocketAddress = ((hh0) obj).a;
        InetSocketAddress inetSocketAddress2 = this.a;
        return inetSocketAddress2 == null ? inetSocketAddress == null : inetSocketAddress2.equals(inetSocketAddress);
    }

    public final int hashCode() {
        int i = (59 + 43) * 59;
        InetSocketAddress inetSocketAddress = this.a;
        return i + (inetSocketAddress != null ? inetSocketAddress.hashCode() : 43);
    }
}
