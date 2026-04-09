package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.f;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    public boolean d() {
        return this.port >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            if (f.a(this.host, hostAndPort.host) && this.port == hostAndPort.port) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return f.b(this.host, Integer.valueOf(this.port));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (d()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }
}
