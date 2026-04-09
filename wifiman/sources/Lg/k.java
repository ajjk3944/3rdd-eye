package Lg;

import Kg.b;
import Lg.h;
import Lg.i;
import Lg.n;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public class k implements i {

    /* renamed from: e, reason: collision with root package name */
    private static Ej.b f11724e = Ej.c.i(k.class);

    /* renamed from: a, reason: collision with root package name */
    protected String f11725a;

    /* renamed from: b, reason: collision with root package name */
    protected InetAddress f11726b;

    /* renamed from: c, reason: collision with root package name */
    protected NetworkInterface f11727c;

    /* renamed from: d, reason: collision with root package name */
    private final b f11728d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11729a;

        static {
            int[] iArr = new int[javax.jmdns.impl.constants.e.values().length];
            f11729a = iArr;
            try {
                iArr[javax.jmdns.impl.constants.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11729a[javax.jmdns.impl.constants.e.TYPE_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11729a[javax.jmdns.impl.constants.e.TYPE_AAAA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class b extends i.b {
        public b(l lVar) {
            y(lVar);
        }
    }

    private k(InetAddress inetAddress, String str, l lVar) {
        this.f11728d = new b(lVar);
        this.f11726b = inetAddress;
        this.f11725a = str;
        if (inetAddress != null) {
            try {
                this.f11727c = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e10) {
                f11724e.r("LocalHostInfo() exception ", e10);
            }
        }
    }

    private h.a e(boolean z10, int i10) {
        if (n() instanceof Inet4Address) {
            return new h.c(p(), javax.jmdns.impl.constants.d.CLASS_IN, z10, i10, n());
        }
        return null;
    }

    private h.e f(boolean z10, int i10) {
        if (!(n() instanceof Inet4Address)) {
            return null;
        }
        return new h.e(n().getHostAddress() + ".in-addr.arpa.", javax.jmdns.impl.constants.d.CLASS_IN, z10, i10, p());
    }

    private h.a g(boolean z10, int i10) {
        if (n() instanceof Inet6Address) {
            return new h.d(p(), javax.jmdns.impl.constants.d.CLASS_IN, z10, i10, n());
        }
        return null;
    }

    private h.e i(boolean z10, int i10) {
        if (!(n() instanceof Inet6Address)) {
            return null;
        }
        return new h.e(n().getHostAddress() + ".ip6.arpa.", javax.jmdns.impl.constants.d.CLASS_IN, z10, i10, p());
    }

    private static InetAddress y() {
        try {
            return InetAddress.getByName(null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public static k z(InetAddress inetAddress, l lVar, String str) throws UnknownHostException {
        InetAddress localHost;
        String strSubstring = str != null ? str : "";
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    localHost = InetAddress.getByName(property);
                } else {
                    localHost = InetAddress.getLocalHost();
                    if (localHost.isLoopbackAddress()) {
                        InetAddress[] inetAddressArrA = b.a.a().a();
                        if (inetAddressArrA.length > 0) {
                            localHost = inetAddressArrA[0];
                        }
                    }
                }
                if (localHost.isLoopbackAddress()) {
                    f11724e.t("Could not find any address beside the loopback.");
                }
            } catch (IOException e10) {
                f11724e.r("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e10.getMessage(), e10);
                localHost = y();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            localHost = inetAddress;
        }
        if (strSubstring.length() == 0) {
            strSubstring = localHost.getHostName();
        }
        if (strSubstring.contains("in-addr.arpa") || strSubstring.equals(localHost.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = localHost.getHostAddress();
            }
            strSubstring = str;
        }
        int iIndexOf = strSubstring.indexOf(".local");
        if (iIndexOf > 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        if (strSubstring.length() > 63) {
            String strSubstring2 = strSubstring.substring(0, 64);
            strSubstring = strSubstring2.substring(0, strSubstring2.lastIndexOf(46));
        }
        return new k(localHost, strSubstring.replaceAll("[:%\\.]", "-") + ".local.", lVar);
    }

    public boolean A() {
        return this.f11728d.s();
    }

    public void B(Mg.a aVar) {
        this.f11728d.t(aVar);
    }

    public boolean C() {
        return this.f11728d.v();
    }

    boolean D(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z10 = false;
        if (n() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if ((n().isLinkLocalAddress() || n().isMCLinkLocal()) && !address.isLinkLocalAddress()) {
            z10 = true;
        }
        if (!address.isLoopbackAddress() || n().isLoopbackAddress()) {
            return z10;
        }
        return true;
    }

    public boolean E(long j10) {
        if (this.f11726b == null) {
            return true;
        }
        return this.f11728d.E(j10);
    }

    public Collection a(javax.jmdns.impl.constants.d dVar, boolean z10, int i10) {
        ArrayList arrayList = new ArrayList();
        h.a aVarE = e(z10, i10);
        if (aVarE != null && aVarE.t(dVar)) {
            arrayList.add(aVarE);
        }
        h.a aVarG = g(z10, i10);
        if (aVarG != null && aVarG.t(dVar)) {
            arrayList.add(aVarG);
        }
        return arrayList;
    }

    public void b(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        this.f11728d.a(aVar, gVar);
    }

    public boolean c() {
        return this.f11728d.c();
    }

    public boolean d(h.a aVar) {
        h.a aVarJ = j(aVar.g(), aVar.q(), javax.jmdns.impl.constants.a.f50179d);
        return aVarJ != null && aVarJ.P(aVar) && aVarJ.X(aVar) && !aVarJ.Q(aVar);
    }

    @Override // Lg.i
    public boolean h(Mg.a aVar) {
        return this.f11728d.h(aVar);
    }

    h.a j(javax.jmdns.impl.constants.e eVar, boolean z10, int i10) {
        int i11 = a.f11729a[eVar.ordinal()];
        if (i11 == 1) {
            return e(z10, i10);
        }
        if (i11 == 2 || i11 == 3) {
            return g(z10, i10);
        }
        return null;
    }

    h.e k(javax.jmdns.impl.constants.e eVar, boolean z10, int i10) {
        int i11 = a.f11729a[eVar.ordinal()];
        if (i11 == 1) {
            return f(z10, i10);
        }
        if (i11 == 2 || i11 == 3) {
            return i(z10, i10);
        }
        return null;
    }

    Inet4Address l() {
        if (n() instanceof Inet4Address) {
            return (Inet4Address) this.f11726b;
        }
        return null;
    }

    Inet6Address m() {
        if (n() instanceof Inet6Address) {
            return (Inet6Address) this.f11726b;
        }
        return null;
    }

    public InetAddress n() {
        return this.f11726b;
    }

    public NetworkInterface o() {
        return this.f11727c;
    }

    public String p() {
        return this.f11725a;
    }

    synchronized String q() {
        String strA;
        strA = n.c.a().a(n(), this.f11725a, n.d.HOST);
        this.f11725a = strA;
        return strA;
    }

    public boolean r() {
        return this.f11728d.g();
    }

    public boolean s(Mg.a aVar, javax.jmdns.impl.constants.g gVar) {
        return this.f11728d.l(aVar, gVar);
    }

    public boolean t() {
        return this.f11728d.m();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(1024);
        sb2.append("local host info[");
        sb2.append(p() != null ? p() : "no name");
        sb2.append(", ");
        sb2.append(o() != null ? o().getDisplayName() : "???");
        sb2.append(":");
        sb2.append(n() != null ? n().getHostAddress() : "no address");
        sb2.append(", ");
        sb2.append(this.f11728d);
        sb2.append("]");
        return sb2.toString();
    }

    public boolean u() {
        return this.f11728d.n();
    }

    public boolean v() {
        return this.f11728d.o();
    }

    public boolean w() {
        return this.f11728d.p();
    }

    public boolean x() {
        return this.f11728d.r();
    }
}
