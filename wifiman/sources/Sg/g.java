package Sg;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    static final InetAddress[] f20667l = Rg.a.c("jcifs.smb1.netbios.wins", ",", new InetAddress[0]);

    /* renamed from: m, reason: collision with root package name */
    private static final e f20668m;

    /* renamed from: n, reason: collision with root package name */
    private static final int f20669n;

    /* renamed from: o, reason: collision with root package name */
    private static int f20670o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap f20671p;

    /* renamed from: q, reason: collision with root package name */
    private static final HashMap f20672q;

    /* renamed from: r, reason: collision with root package name */
    static final b f20673r;

    /* renamed from: s, reason: collision with root package name */
    static final g f20674s;

    /* renamed from: t, reason: collision with root package name */
    static final byte[] f20675t;

    /* renamed from: u, reason: collision with root package name */
    static g f20676u;

    /* renamed from: a, reason: collision with root package name */
    b f20677a;

    /* renamed from: b, reason: collision with root package name */
    int f20678b;

    /* renamed from: c, reason: collision with root package name */
    int f20679c;

    /* renamed from: d, reason: collision with root package name */
    boolean f20680d;

    /* renamed from: e, reason: collision with root package name */
    boolean f20681e;

    /* renamed from: f, reason: collision with root package name */
    boolean f20682f;

    /* renamed from: g, reason: collision with root package name */
    boolean f20683g;

    /* renamed from: h, reason: collision with root package name */
    boolean f20684h;

    /* renamed from: i, reason: collision with root package name */
    boolean f20685i;

    /* renamed from: j, reason: collision with root package name */
    byte[] f20686j;

    /* renamed from: k, reason: collision with root package name */
    String f20687k;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        b f20688a;

        /* renamed from: b, reason: collision with root package name */
        g f20689b;

        /* renamed from: c, reason: collision with root package name */
        long f20690c;

        a(b bVar, g gVar, long j10) {
            this.f20688a = bVar;
            this.f20689b = gVar;
            this.f20690c = j10;
        }
    }

    static {
        e eVar = new e();
        f20668m = eVar;
        f20669n = Rg.a.d("jcifs.smb1.netbios.cachePolicy", 30);
        f20670o = 0;
        HashMap map = new HashMap();
        f20671p = map;
        f20672q = new HashMap();
        b bVar = new b("0.0.0.0", 0, null);
        f20673r = bVar;
        g gVar = new g(bVar, 0, false, 0);
        f20674s = gVar;
        f20675t = new byte[]{0, 0, 0, 0, 0, 0};
        map.put(bVar, new a(bVar, gVar, -1L));
        InetAddress byName = eVar.f20640m;
        if (byName == null) {
            try {
                try {
                    byName = InetAddress.getLocalHost();
                } catch (UnknownHostException unused) {
                }
            } catch (UnknownHostException unused2) {
                byName = InetAddress.getByName("127.0.0.1");
            }
        }
        String strH = Rg.a.h("jcifs.smb1.netbios.hostname", null);
        if (strH == null || strH.length() == 0) {
            byte[] address = byName.getAddress();
            strH = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + Ug.d.c((int) (Math.random() * 255.0d), 2);
        }
        b bVar2 = new b(strH, 0, Rg.a.h("jcifs.smb1.netbios.scope", null));
        g gVar2 = new g(bVar2, byName.hashCode(), false, 0, false, false, true, false, f20675t);
        f20676u = gVar2;
        b(bVar2, gVar2, -1L);
    }

    g(b bVar, int i10, boolean z10, int i11) {
        this.f20677a = bVar;
        this.f20678b = i10;
        this.f20680d = z10;
        this.f20679c = i11;
    }

    static void a(b bVar, g gVar) {
        int i10 = f20669n;
        if (i10 == 0) {
            return;
        }
        b(bVar, gVar, i10 != -1 ? System.currentTimeMillis() + (i10 * 1000) : -1L);
    }

    static void b(b bVar, g gVar, long j10) {
        if (f20669n == 0) {
            return;
        }
        HashMap map = f20671p;
        synchronized (map) {
            try {
                a aVar = (a) map.get(bVar);
                if (aVar == null) {
                    map.put(bVar, new a(bVar, gVar, j10));
                } else {
                    aVar.f20689b = gVar;
                    aVar.f20690c = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Object c(b bVar) {
        HashMap map;
        HashMap map2 = f20672q;
        synchronized (map2) {
            try {
                if (!map2.containsKey(bVar)) {
                    map2.put(bVar, bVar);
                    return null;
                }
                while (true) {
                    map = f20672q;
                    if (!map.containsKey(bVar)) {
                        break;
                    }
                    try {
                        map.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                g gVarI = i(bVar);
                if (gVarI == null) {
                    synchronized (map) {
                        map.put(bVar, bVar);
                    }
                }
                return gVarI;
            } finally {
            }
        }
    }

    static g d(b bVar, InetAddress inetAddress) throws UnknownHostException {
        if (bVar.f20617c == 29 && inetAddress == null) {
            inetAddress = f20668m.f20641n;
        }
        bVar.f20618d = inetAddress != null ? inetAddress.hashCode() : 0;
        g gVarI = i(bVar);
        if (gVarI == null) {
            gVarI = (g) c(bVar);
            try {
                if (gVarI == null) {
                    try {
                        gVarI = f20668m.b(bVar, inetAddress);
                    } catch (UnknownHostException unused) {
                        gVarI = f20674s;
                    }
                }
            } finally {
                a(bVar, gVarI);
                t(bVar);
            }
        }
        if (gVarI != f20674s) {
            return gVarI;
        }
        throw new UnknownHostException(bVar.toString());
    }

    public static g f(String str) {
        return g(str, 0, null);
    }

    public static g g(String str, int i10, String str2) {
        return h(str, i10, str2, null);
    }

    public static g h(String str, int i10, String str2, InetAddress inetAddress) {
        if (str == null || str.length() == 0) {
            return m();
        }
        if (!Character.isDigit(str.charAt(0))) {
            return d(new b(str, i10, str2), inetAddress);
        }
        char[] charArray = str.toCharArray();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < charArray.length) {
            char c10 = charArray[i11];
            if (c10 < '0' || c10 > '9') {
                return d(new b(str, i10, str2), inetAddress);
            }
            int i14 = 0;
            while (c10 != '.') {
                if (c10 < '0' || c10 > '9') {
                    return d(new b(str, i10, str2), inetAddress);
                }
                i14 = ((i14 * 10) + c10) - 48;
                i11++;
                if (i11 >= charArray.length) {
                    break;
                }
                c10 = charArray[i11];
            }
            if (i14 > 255) {
                return d(new b(str, i10, str2), inetAddress);
            }
            i13 = (i13 << 8) + i14;
            i12++;
            i11++;
        }
        return (i12 != 4 || str.endsWith(".")) ? d(new b(str, i10, str2), inetAddress) : new g(f20673r, i13, false, 0);
    }

    static g i(b bVar) {
        g gVar;
        if (f20669n == 0) {
            return null;
        }
        HashMap map = f20671p;
        synchronized (map) {
            try {
                a aVar = (a) map.get(bVar);
                if (aVar != null && aVar.f20690c < System.currentTimeMillis() && aVar.f20690c >= 0) {
                    aVar = null;
                }
                gVar = aVar != null ? aVar.f20689b : null;
            } finally {
            }
        }
        return gVar;
    }

    public static g m() {
        return f20676u;
    }

    public static b n() {
        return f20676u.f20677a;
    }

    public static InetAddress p() {
        InetAddress[] inetAddressArr = f20667l;
        if (inetAddressArr.length == 0) {
            return null;
        }
        return inetAddressArr[f20670o];
    }

    public static boolean q(InetAddress inetAddress) {
        int i10 = 0;
        while (inetAddress != null) {
            InetAddress[] inetAddressArr = f20667l;
            if (i10 >= inetAddressArr.length) {
                break;
            }
            if (inetAddress.hashCode() == inetAddressArr[i10].hashCode()) {
                return true;
            }
            i10++;
        }
        return false;
    }

    static InetAddress s() {
        int i10 = f20670o;
        int i11 = i10 + 1;
        InetAddress[] inetAddressArr = f20667l;
        int i12 = i11 < inetAddressArr.length ? i10 + 1 : 0;
        f20670o = i12;
        if (inetAddressArr.length == 0) {
            return null;
        }
        return inetAddressArr[i12];
    }

    private static void t(b bVar) {
        HashMap map = f20672q;
        synchronized (map) {
            map.remove(bVar);
            map.notifyAll();
        }
    }

    public String e() {
        String str = this.f20677a.f20615a;
        this.f20687k = str;
        int i10 = 0;
        if (!Character.isDigit(str.charAt(0))) {
            switch (this.f20677a.f20617c) {
                case 27:
                case 28:
                case 29:
                    this.f20687k = "*SMBSERVER     ";
                    break;
            }
        } else {
            int length = this.f20687k.length();
            char[] charArray = this.f20687k.toCharArray();
            int i11 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                int i12 = i10 + 1;
                if (!Character.isDigit(charArray[i10])) {
                    break;
                }
                if (i12 == length && i11 == 3) {
                    this.f20687k = "*SMBSERVER     ";
                    break;
                }
                if (i12 >= length || charArray[i12] != '.') {
                    i10 = i12;
                } else {
                    i11++;
                    i10 += 2;
                }
            }
        }
        return this.f20687k;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof g) && ((g) obj).f20678b == this.f20678b;
    }

    public int hashCode() {
        return this.f20678b;
    }

    public String j() {
        return ((this.f20678b >>> 24) & 255) + "." + ((this.f20678b >>> 16) & 255) + "." + ((this.f20678b >>> 8) & 255) + "." + (this.f20678b & 255);
    }

    public String k() {
        b bVar = this.f20677a;
        return bVar == f20673r ? j() : bVar.f20615a;
    }

    public InetAddress l() {
        return InetAddress.getByName(j());
    }

    public int o() {
        return this.f20677a.f20617c;
    }

    public String r() {
        String str = this.f20687k;
        if (str == this.f20677a.f20615a) {
            this.f20687k = "*SMBSERVER     ";
        } else if (str == "*SMBSERVER     ") {
            try {
                g[] gVarArrD = f20668m.d(this);
                b bVar = this.f20677a;
                if (bVar.f20617c == 29) {
                    for (g gVar : gVarArrD) {
                        b bVar2 = gVar.f20677a;
                        if (bVar2.f20617c == 32) {
                            return bVar2.f20615a;
                        }
                    }
                    return null;
                }
                if (this.f20685i) {
                    this.f20687k = null;
                    return bVar.f20615a;
                }
            } catch (UnknownHostException unused) {
                this.f20687k = null;
            }
        } else {
            this.f20687k = null;
        }
        return this.f20687k;
    }

    public String toString() {
        return this.f20677a.toString() + MqttTopic.TOPIC_LEVEL_SEPARATOR + j();
    }

    g(b bVar, int i10, boolean z10, int i11, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f20677a = bVar;
        this.f20678b = i10;
        this.f20680d = z10;
        this.f20679c = i11;
        this.f20681e = z11;
        this.f20682f = z12;
        this.f20683g = z13;
        this.f20684h = z14;
        this.f20686j = bArr;
        this.f20685i = true;
    }
}
