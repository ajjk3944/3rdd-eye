package y7;

import java.net.InetAddress;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public final class l implements InterfaceC7921h {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f66394a;

    /* renamed from: b, reason: collision with root package name */
    private final InetAddress f66395b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f66396c;

    public l(byte[] hwAddress, InetAddress inetAddress) {
        AbstractC6492s.i(hwAddress, "hwAddress");
        this.f66394a = hwAddress;
        this.f66395b = inetAddress;
    }

    public final byte[] a() {
        return this.f66394a;
    }

    public final InetAddress b() {
        return this.f66395b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC6492s.d(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ubnt.discovery.server.lan.model.NetworkIface");
        l lVar = (l) obj;
        return Arrays.equals(this.f66394a, lVar.f66394a) && AbstractC6492s.d(this.f66395b, lVar.f66395b);
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f66394a) * 31;
        InetAddress inetAddress = this.f66395b;
        return iHashCode + (inetAddress != null ? inetAddress.hashCode() : 0);
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.f66396c;
    }

    public String toString() {
        String strB = v7.c.f63489a.b(this.f66394a, ":");
        InetAddress inetAddress = this.f66395b;
        return "NetworkIface(hwAddress = '" + strB + "', ipAddress = '" + (inetAddress != null ? inetAddress.getHostAddress() : null) + "')";
    }
}
