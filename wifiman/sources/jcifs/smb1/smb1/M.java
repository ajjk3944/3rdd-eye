package jcifs.smb1.smb1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.smi.Counter32;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public class M extends URLConnection implements L {

    /* renamed from: v, reason: collision with root package name */
    static Ug.e f50381v = Ug.e.a();

    /* renamed from: w, reason: collision with root package name */
    static long f50382w;

    /* renamed from: x, reason: collision with root package name */
    static boolean f50383x;

    /* renamed from: y, reason: collision with root package name */
    protected static C6270d f50384y;

    /* renamed from: a, reason: collision with root package name */
    private String f50385a;

    /* renamed from: b, reason: collision with root package name */
    private String f50386b;

    /* renamed from: c, reason: collision with root package name */
    private long f50387c;

    /* renamed from: d, reason: collision with root package name */
    private long f50388d;

    /* renamed from: e, reason: collision with root package name */
    private int f50389e;

    /* renamed from: f, reason: collision with root package name */
    private long f50390f;

    /* renamed from: g, reason: collision with root package name */
    private long f50391g;

    /* renamed from: h, reason: collision with root package name */
    private long f50392h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f50393i;

    /* renamed from: j, reason: collision with root package name */
    private int f50394j;

    /* renamed from: k, reason: collision with root package name */
    private C6280n f50395k;

    /* renamed from: l, reason: collision with root package name */
    private DfsReferral f50396l;

    /* renamed from: m, reason: collision with root package name */
    C6277k f50397m;

    /* renamed from: n, reason: collision with root package name */
    S f50398n;

    /* renamed from: o, reason: collision with root package name */
    String f50399o;

    /* renamed from: p, reason: collision with root package name */
    int f50400p;

    /* renamed from: q, reason: collision with root package name */
    int f50401q;

    /* renamed from: r, reason: collision with root package name */
    boolean f50402r;

    /* renamed from: s, reason: collision with root package name */
    int f50403s;

    /* renamed from: t, reason: collision with root package name */
    Rg.b[] f50404t;

    /* renamed from: u, reason: collision with root package name */
    int f50405u;

    static {
        try {
            String str = Rg.a.f19842c;
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
        }
        f50382w = Rg.a.f("jcifs.smb1.smb.client.attrExpirationPeriod", 5000L);
        f50383x = Rg.a.a("jcifs.smb1.smb.client.ignoreCopyToException", true);
        f50384y = new C6270d();
    }

    public M(String str) {
        this(new URL((URL) null, str, C6272f.f50558a));
    }

    private C6280n a() {
        if (this.f50395k == null) {
            this.f50395k = new C6280n();
        }
        return this.f50395k;
    }

    static String w(String str, String str2) {
        char[] charArray = str.toCharArray();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < charArray.length; i12++) {
            char c10 = charArray[i12];
            if (c10 == '&') {
                if (i10 > i11 && new String(charArray, i11, i10 - i11).equalsIgnoreCase(str2)) {
                    int i13 = i10 + 1;
                    return new String(charArray, i13, i12 - i13);
                }
                i11 = i12 + 1;
            } else if (c10 == '=') {
                i10 = i12;
            }
        }
        if (i10 <= i11 || !new String(charArray, i11, i10 - i11).equalsIgnoreCase(str2)) {
            return null;
        }
        int i14 = i10 + 1;
        return new String(charArray, i14, charArray.length - i14);
    }

    void b() {
        d(0L);
    }

    void c(int i10, long j10) {
        if (Ug.e.f22464b >= 3) {
            f50381v.println("close: " + i10);
        }
        z(new C6281o(i10, j10), a());
    }

    @Override // java.net.URLConnection
    public void connect() throws SmbException, UnknownHostException {
        if (p()) {
            S s10 = this.f50398n;
            if (s10.f50492f.f50437h.f50448D == null) {
                s10.d(true);
            }
        }
        if (p()) {
            return;
        }
        n();
        i();
        while (true) {
            try {
                f();
                return;
            } catch (SmbAuthException e10) {
                throw e10;
            } catch (SmbException e11) {
                if (j() == null) {
                    throw e11;
                }
                if (Ug.e.f22464b >= 3) {
                    e11.printStackTrace(f50381v);
                }
            }
        }
    }

    void d(long j10) {
        if (q()) {
            c(this.f50400p, j10);
            this.f50402r = false;
        }
    }

    void e() {
        try {
            connect();
        } catch (UnknownHostException e10) {
            throw new SmbException("Failed to connect to server", e10);
        } catch (SmbException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new SmbException("Failed to connect to server", e12);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        if (this == m10) {
            return true;
        }
        if (!v(((URLConnection) this).url.getPath(), ((URLConnection) m10).url.getPath())) {
            return false;
        }
        n();
        m10.n();
        if (!this.f50385a.equalsIgnoreCase(m10.f50385a)) {
            return false;
        }
        try {
            return h().equals(m10.h());
        } catch (UnknownHostException unused) {
            return k().equalsIgnoreCase(m10.k());
        }
    }

    void f() throws SmbAuthException {
        Q qS;
        Rg.b bVarH = h();
        S s10 = this.f50398n;
        if (s10 != null) {
            qS = s10.f50492f.f50437h;
        } else {
            qS = Q.s(bVarH, ((URLConnection) this).url.getPort());
            this.f50398n = qS.r(this.f50397m).a(this.f50386b, null);
        }
        String strL = l();
        S s11 = this.f50398n;
        s11.f50494h = f50384y.e(strL, s11.f50489c, null, this.f50397m) != null;
        S s12 = this.f50398n;
        if (s12.f50494h) {
            s12.f50487a = 2;
        }
        try {
            if (Ug.e.f22464b >= 3) {
                f50381v.println("doConnect: " + bVarH);
            }
            this.f50398n.c(null, null);
        } catch (SmbAuthException e10) {
            if (this.f50386b == null) {
                S sA = qS.r(C6277k.f50578q).a(null, null);
                this.f50398n = sA;
                sA.c(null, null);
                return;
            }
            C6277k c6277kA = AbstractC6275i.a(((URLConnection) this).url.toString(), e10);
            if (c6277kA == null) {
                if (Ug.e.f22464b >= 1 && o()) {
                    e10.printStackTrace(f50381v);
                }
                throw e10;
            }
            this.f50397m = c6277kA;
            S sA2 = qS.r(c6277kA).a(this.f50386b, null);
            this.f50398n = sA2;
            sA2.f50494h = f50384y.e(strL, sA2.f50489c, null, this.f50397m) != null;
            S s13 = this.f50398n;
            if (s13.f50494h) {
                s13.f50487a = 2;
            }
            s13.c(null, null);
        }
    }

    public boolean g() throws SmbException {
        if (this.f50390f > System.currentTimeMillis()) {
            return this.f50393i;
        }
        this.f50389e = 17;
        this.f50387c = 0L;
        this.f50388d = 0L;
        this.f50393i = false;
        try {
            if (((URLConnection) this).url.getHost().length() != 0) {
                if (this.f50386b == null) {
                    if (m() == 2) {
                        Rg.b.e(((URLConnection) this).url.getHost(), true);
                    } else {
                        Rg.b.d(((URLConnection) this).url.getHost()).g();
                    }
                } else if (n().length() == 1 || this.f50386b.equalsIgnoreCase("IPC$")) {
                    e();
                } else {
                    InterfaceC6273g interfaceC6273gX = x(n(), 257);
                    this.f50389e = interfaceC6273gX.b();
                    this.f50387c = interfaceC6273gX.c();
                    this.f50388d = interfaceC6273gX.d();
                }
            }
            this.f50393i = true;
        } catch (UnknownHostException unused) {
        } catch (SmbException e10) {
            switch (e10.d()) {
                case -1073741809:
                case -1073741773:
                case -1073741772:
                case -1073741766:
                    break;
                default:
                    throw e10;
            }
        }
        this.f50390f = System.currentTimeMillis() + f50382w;
        return this.f50393i;
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        try {
            return (int) (s() & Counter32.MAX_COUNTER32_VALUE);
        } catch (SmbException unused) {
            return 0;
        }
    }

    @Override // java.net.URLConnection
    public long getDate() {
        try {
            return r();
        } catch (SmbException unused) {
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return new N(this);
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        try {
            return r();
        } catch (SmbException unused) {
            return 0L;
        }
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return new O(this);
    }

    Rg.b h() {
        int i10 = this.f50405u;
        return i10 == 0 ? i() : this.f50404t[i10 - 1];
    }

    public int hashCode() {
        int iHashCode;
        try {
            iHashCode = h().hashCode();
        } catch (UnknownHostException unused) {
            iHashCode = k().toUpperCase().hashCode();
        }
        n();
        return iHashCode + this.f50385a.toUpperCase().hashCode();
    }

    Rg.b i() throws UnknownHostException {
        this.f50405u = 0;
        String host = ((URLConnection) this).url.getHost();
        String path = ((URLConnection) this).url.getPath();
        String query = ((URLConnection) this).url.getQuery();
        if (query != null) {
            String strW = w(query, "server");
            if (strW != null && strW.length() > 0) {
                this.f50404t = new Rg.b[]{Rg.b.d(strW)};
                return j();
            }
            String strW2 = w(query, SnmpConfigurator.O_ADDRESS);
            if (strW2 != null && strW2.length() > 0) {
                this.f50404t = new Rg.b[]{new Rg.b(InetAddress.getByAddress(host, InetAddress.getByName(strW2).getAddress()))};
                return j();
            }
        }
        if (host.length() == 0) {
            try {
                this.f50404t = new Rg.b[]{Rg.b.d(Sg.g.g("\u0001\u0002__MSBROWSE__\u0002", 1, null).j())};
            } catch (UnknownHostException e10) {
                C6277k.v();
                if (C6277k.f50574m.equals("?")) {
                    throw e10;
                }
                this.f50404t = Rg.b.c(C6277k.f50574m, true);
            }
        } else if (path.length() == 0 || path.equals(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
            this.f50404t = Rg.b.c(host, true);
        } else {
            this.f50404t = Rg.b.c(host, false);
        }
        return j();
    }

    Rg.b j() {
        int i10 = this.f50405u;
        Rg.b[] bVarArr = this.f50404t;
        if (i10 >= bVarArr.length) {
            return null;
        }
        this.f50405u = i10 + 1;
        return bVarArr[i10];
    }

    public String k() {
        String host = ((URLConnection) this).url.getHost();
        if (host.length() == 0) {
            return null;
        }
        return host;
    }

    String l() {
        DfsReferral dfsReferral = this.f50396l;
        return dfsReferral != null ? dfsReferral.f50311e : k();
    }

    public int m() throws SmbException {
        int iO;
        if (this.f50401q == 0) {
            if (n().length() > 1) {
                this.f50401q = 1;
            } else if (this.f50386b != null) {
                e();
                if (this.f50386b.equals("IPC$")) {
                    this.f50401q = 16;
                } else if (this.f50398n.f50490d.equals("LPT1:")) {
                    this.f50401q = 32;
                } else if (this.f50398n.f50490d.equals("COMM")) {
                    this.f50401q = 64;
                } else {
                    this.f50401q = 8;
                }
            } else if (((URLConnection) this).url.getAuthority() == null || ((URLConnection) this).url.getAuthority().length() == 0) {
                this.f50401q = 2;
            } else {
                try {
                    Rg.b bVarH = h();
                    if ((bVarH.b() instanceof Sg.g) && ((iO = ((Sg.g) bVarH.b()).o()) == 29 || iO == 27)) {
                        this.f50401q = 2;
                        return 2;
                    }
                    this.f50401q = 4;
                } catch (UnknownHostException e10) {
                    throw new SmbException(((URLConnection) this).url.toString(), e10);
                }
            }
        }
        return this.f50401q;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String n() {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.M.n():java.lang.String");
    }

    boolean o() {
        return this.f50405u < this.f50404t.length;
    }

    boolean p() {
        S s10 = this.f50398n;
        return s10 != null && s10.f50487a == 2;
    }

    boolean q() {
        return this.f50402r && p() && this.f50403s == this.f50398n.f50495i;
    }

    public long r() throws SmbException {
        if (n().length() <= 1) {
            return 0L;
        }
        g();
        return this.f50388d;
    }

    public long s() {
        if (this.f50392h > System.currentTimeMillis()) {
            return this.f50391g;
        }
        if (m() == 8) {
            W w10 = new W(1);
            z(new V(1), w10);
            this.f50391g = w10.f50518m1.a();
        } else if (n().length() <= 1 || this.f50401q == 16) {
            this.f50391g = 0L;
        } else {
            this.f50391g = x(n(), 258).a();
        }
        this.f50392h = System.currentTimeMillis() + f50382w;
        return this.f50391g;
    }

    void t(int i10, int i11, int i12, int i13) {
        if (q()) {
            return;
        }
        this.f50400p = u(i10, i11, i12, i13);
        this.f50402r = true;
        this.f50403s = this.f50398n.f50495i;
    }

    @Override // java.net.URLConnection
    public String toString() {
        return Wg.a.a(((URLConnection) this).url.toString());
    }

    int u(int i10, int i11, int i12, int i13) {
        e();
        if (Ug.e.f22464b >= 3) {
            f50381v.println("open0: " + this.f50399o);
        }
        if (!this.f50398n.f50492f.f50437h.u(16)) {
            C6287v c6287v = new C6287v();
            z(new C6286u(this.f50399o, i11, i10, null), c6287v);
            return c6287v.f50657E;
        }
        r rVar = new r();
        z(new C6283q(this.f50399o, i10, i11, this.f50394j, i12, i13, null), rVar);
        int i14 = rVar.f50634F;
        this.f50389e = rVar.f50636H & javax.jmdns.impl.constants.d.CLASS_MASK;
        this.f50390f = System.currentTimeMillis() + f50382w;
        this.f50393i = true;
        return i14;
    }

    protected boolean v(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf(47);
        int iLastIndexOf2 = str2.lastIndexOf(47);
        int length = str.length() - iLastIndexOf;
        int length2 = str2.length() - iLastIndexOf2;
        if (length > 1 && str.charAt(iLastIndexOf + 1) == '.') {
            return true;
        }
        if (length2 <= 1 || str2.charAt(iLastIndexOf2 + 1) != '.') {
            return length == length2 && str.regionMatches(true, iLastIndexOf, str2, iLastIndexOf2, length);
        }
        return true;
    }

    InterfaceC6273g x(String str, int i10) {
        e();
        if (Ug.e.f22464b >= 3) {
            f50381v.println("queryPath: " + str);
        }
        if (this.f50398n.f50492f.f50437h.u(16)) {
            Y y10 = new Y(i10);
            z(new X(str, i10), y10);
            return y10.f50526m1;
        }
        C6289x c6289x = new C6289x(this.f50398n.f50492f.f50437h.f50463v.f50481n * 1000 * 60);
        z(new C6288w(str), c6289x);
        return c6289x;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void y(jcifs.smb1.smb1.AbstractC6278l r9) throws jcifs.smb1.smb1.SmbException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.M.y(jcifs.smb1.smb1.l):void");
    }

    void z(AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) {
        while (true) {
            y(abstractC6278l);
            try {
                this.f50398n.b(abstractC6278l, abstractC6278l2);
                return;
            } catch (DfsReferral e10) {
                if (e10.f50315i) {
                    throw e10;
                }
                abstractC6278l.t();
            }
        }
    }

    public M(URL url) {
        this(url, new C6277k(url.getUserInfo()));
    }

    public M(URL url, C6277k c6277k) {
        super(url);
        this.f50394j = 7;
        this.f50395k = null;
        this.f50396l = null;
        this.f50398n = null;
        this.f50397m = c6277k == null ? new C6277k(url.getUserInfo()) : c6277k;
        n();
    }
}
