package z7;

import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkInterface f67120a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67121b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f67122c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67123d;

    /* renamed from: e, reason: collision with root package name */
    private final p f67124e;

    public n(NetworkInterface iface) {
        AbstractC6492s.i(iface, "iface");
        this.f67120a = iface;
        this.f67121b = iface.isLoopback();
        this.f67122c = iface.isUp();
        this.f67123d = iface.getName();
        this.f67124e = o.a(iface);
    }

    @Override // z7.m
    public boolean a() {
        return this.f67122c;
    }

    @Override // z7.m
    public boolean b() {
        return this.f67121b;
    }

    @Override // z7.m
    public void c(MulticastSocket socket) throws SocketException {
        AbstractC6492s.i(socket, "socket");
        socket.setNetworkInterface(this.f67120a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && AbstractC6492s.d(this.f67120a, ((n) obj).f67120a);
    }

    @Override // z7.m
    public p getType() {
        return this.f67124e;
    }

    public int hashCode() {
        return this.f67120a.hashCode();
    }

    public String toString() {
        return "NetworkInterfaceHolderImpl(iface=" + this.f67120a + ")";
    }
}
