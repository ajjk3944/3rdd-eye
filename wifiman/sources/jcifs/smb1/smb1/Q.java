package jcifs.smb1.smb1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import jcifs.smb1.netbios.NbtException;
import jcifs.smb1.util.transport.TransportException;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public class Q extends Vg.c implements L {

    /* renamed from: E, reason: collision with root package name */
    static final byte[] f50441E = new byte[65535];

    /* renamed from: F, reason: collision with root package name */
    static final C6284s f50442F = new C6284s();

    /* renamed from: G, reason: collision with root package name */
    static Ug.e f50443G = Ug.e.a();

    /* renamed from: H, reason: collision with root package name */
    static HashMap f50444H = null;

    /* renamed from: h, reason: collision with root package name */
    InetAddress f50449h;

    /* renamed from: i, reason: collision with root package name */
    int f50450i;

    /* renamed from: j, reason: collision with root package name */
    Rg.b f50451j;

    /* renamed from: k, reason: collision with root package name */
    Socket f50452k;

    /* renamed from: l, reason: collision with root package name */
    int f50453l;

    /* renamed from: m, reason: collision with root package name */
    int f50454m;

    /* renamed from: n, reason: collision with root package name */
    OutputStream f50455n;

    /* renamed from: o, reason: collision with root package name */
    InputStream f50456o;

    /* renamed from: p, reason: collision with root package name */
    byte[] f50457p = new byte[512];

    /* renamed from: q, reason: collision with root package name */
    C6280n f50458q = new C6280n();

    /* renamed from: r, reason: collision with root package name */
    long f50459r = System.currentTimeMillis() + L.f50372V0;

    /* renamed from: s, reason: collision with root package name */
    LinkedList f50460s = new LinkedList();

    /* renamed from: t, reason: collision with root package name */
    C6279m f50461t = null;

    /* renamed from: u, reason: collision with root package name */
    LinkedList f50462u = new LinkedList();

    /* renamed from: v, reason: collision with root package name */
    a f50463v = new a();

    /* renamed from: w, reason: collision with root package name */
    int f50464w = L.f50366P0;

    /* renamed from: x, reason: collision with root package name */
    int f50465x = L.f50379y0;

    /* renamed from: y, reason: collision with root package name */
    int f50466y = L.f50380z0;

    /* renamed from: z, reason: collision with root package name */
    int f50467z = L.f50351A0;

    /* renamed from: A, reason: collision with root package name */
    int f50445A = L.f50367Q0;

    /* renamed from: B, reason: collision with root package name */
    int f50446B = 0;

    /* renamed from: C, reason: collision with root package name */
    boolean f50447C = L.f50352B0;

    /* renamed from: D, reason: collision with root package name */
    String f50448D = null;

    class a {

        /* renamed from: a, reason: collision with root package name */
        int f50468a;

        /* renamed from: b, reason: collision with root package name */
        int f50469b;

        /* renamed from: c, reason: collision with root package name */
        int f50470c;

        /* renamed from: d, reason: collision with root package name */
        int f50471d;

        /* renamed from: e, reason: collision with root package name */
        String f50472e;

        /* renamed from: f, reason: collision with root package name */
        int f50473f;

        /* renamed from: g, reason: collision with root package name */
        int f50474g;

        /* renamed from: h, reason: collision with root package name */
        boolean f50475h;

        /* renamed from: i, reason: collision with root package name */
        boolean f50476i;

        /* renamed from: j, reason: collision with root package name */
        boolean f50477j;

        /* renamed from: k, reason: collision with root package name */
        int f50478k;

        /* renamed from: l, reason: collision with root package name */
        int f50479l;

        /* renamed from: m, reason: collision with root package name */
        long f50480m;

        /* renamed from: n, reason: collision with root package name */
        int f50481n;

        /* renamed from: o, reason: collision with root package name */
        int f50482o;

        /* renamed from: p, reason: collision with root package name */
        byte[] f50483p;

        /* renamed from: q, reason: collision with root package name */
        byte[] f50484q;

        a() {
        }
    }

    Q(Rg.b bVar, int i10, InetAddress inetAddress, int i11) {
        this.f50451j = bVar;
        this.f50453l = i10;
        this.f50449h = inetAddress;
        this.f50450i = i11;
    }

    static synchronized Q s(Rg.b bVar, int i10) {
        return t(bVar, i10, L.f50377w0, L.f50378x0, null);
    }

    static synchronized Q t(Rg.b bVar, int i10, InetAddress inetAddress, int i11, String str) {
        int i12;
        LinkedList linkedList = L.f50370T0;
        synchronized (linkedList) {
            try {
                if (L.f50371U0 != 1) {
                    ListIterator listIterator = linkedList.listIterator();
                    while (listIterator.hasNext()) {
                        Q q10 = (Q) listIterator.next();
                        if (!q10.w(bVar, i10, inetAddress, i11, str) || ((i12 = L.f50371U0) != 0 && q10.f50462u.size() >= i12)) {
                        }
                        return q10;
                    }
                }
                Q q11 = new Q(bVar, i10, inetAddress, i11);
                L.f50370T0.add(0, q11);
                return q11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void x(int i10, AbstractC6278l abstractC6278l) {
        synchronized (this.f50457p) {
            try {
                if (i10 == 139) {
                    z();
                } else {
                    if (i10 == 0) {
                        i10 = 445;
                    }
                    Socket socket = new Socket();
                    this.f50452k = socket;
                    if (this.f50449h != null) {
                        socket.bind(new InetSocketAddress(this.f50449h, this.f50450i));
                    }
                    this.f50452k.connect(new InetSocketAddress(this.f50451j.f(), i10), L.f50373W0);
                    this.f50452k.setSoTimeout(L.f50372V0);
                    this.f50455n = this.f50452k.getOutputStream();
                    this.f50456o = this.f50452k.getInputStream();
                }
                int i11 = this.f50454m + 1;
                this.f50454m = i11;
                if (i11 == 32000) {
                    this.f50454m = 1;
                }
                C6284s c6284s = f50442F;
                c6284s.f50601m = this.f50454m;
                int iF = c6284s.f(this.f50457p, 4);
                Ug.b.d(iF & 65535, this.f50457p, 0);
                if (Ug.e.f22464b >= 4) {
                    f50443G.println(c6284s);
                    if (Ug.e.f22464b >= 6) {
                        Ug.d.a(f50443G, this.f50457p, 4, iF);
                    }
                }
                this.f50455n.write(this.f50457p, 0, iF + 4);
                this.f50455n.flush();
                if (j() == null) {
                    throw new IOException("transport closed in negotiate");
                }
                int iA = Ug.b.a(this.f50457p, 2) & 65535;
                if (iA >= 33) {
                    int i12 = iA + 4;
                    byte[] bArr = this.f50457p;
                    if (i12 <= bArr.length) {
                        Vg.c.k(this.f50456o, bArr, 36, iA - 32);
                        abstractC6278l.e(this.f50457p, 4);
                        if (Ug.e.f22464b >= 4) {
                            f50443G.println(abstractC6278l);
                            if (Ug.e.f22464b >= 6) {
                                Ug.d.a(f50443G, this.f50457p, 4, iF);
                            }
                        }
                    }
                }
                throw new IOException("Invalid payload size: " + iA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Vg.c
    protected void c() throws SmbException {
        C6285t c6285t = new C6285t(this.f50463v);
        int i10 = 139;
        try {
            x(this.f50453l, c6285t);
        } catch (ConnectException unused) {
            int i11 = this.f50453l;
            if (i11 != 0 && i11 != 445) {
                i10 = 445;
            }
            x(i10, c6285t);
            this.f50453l = i10;
        } catch (NoRouteToHostException unused2) {
            int i12 = this.f50453l;
            if (i12 != 0 && i12 != 445) {
                i10 = 445;
            }
            x(i10, c6285t);
            this.f50453l = i10;
        }
        if (c6285t.f50647B > 10) {
            throw new SmbException("This client does not support the negotiated dialect.");
        }
        a aVar = this.f50463v;
        if ((aVar.f50471d & PduHandle.NONE) != Integer.MIN_VALUE && aVar.f50482o != 8 && L.f50359I0 == 0) {
            throw new SmbException("Unexpected encryption key length: " + this.f50463v.f50482o);
        }
        this.f50448D = this.f50451j.g();
        a aVar2 = this.f50463v;
        if (aVar2.f50477j || (aVar2.f50476i && L.f50355E0)) {
            this.f50464w |= 4;
        } else {
            this.f50464w &= 65531;
        }
        int iMin = Math.min(this.f50465x, aVar2.f50468a);
        this.f50465x = iMin;
        if (iMin < 1) {
            this.f50465x = 1;
        }
        this.f50466y = Math.min(this.f50466y, this.f50463v.f50469b);
        int i13 = this.f50445A;
        int i14 = this.f50463v.f50471d;
        int i15 = i13 & i14;
        this.f50445A = i15;
        if ((i14 & PduHandle.NONE) == Integer.MIN_VALUE) {
            this.f50445A = i15 | PduHandle.NONE;
        }
        int i16 = this.f50445A;
        if ((i16 & 4) == 0) {
            if (L.f50353C0) {
                this.f50445A = i16 | 4;
            } else {
                this.f50447C = false;
                this.f50464w &= javax.jmdns.impl.constants.d.CLASS_MASK;
            }
        }
    }

    @Override // Vg.c
    protected void d(boolean z10) {
        ListIterator listIterator = this.f50462u.listIterator();
        while (listIterator.hasNext()) {
            try {
                ((P) listIterator.next()).b(z10);
            } catch (Throwable th2) {
                this.f50461t = null;
                this.f50452k = null;
                this.f50448D = null;
                throw th2;
            }
        }
        this.f50452k.shutdownOutput();
        this.f50455n.close();
        this.f50456o.close();
        this.f50452k.close();
        this.f50461t = null;
        this.f50452k = null;
        this.f50448D = null;
    }

    @Override // Vg.c
    protected void e(Vg.b bVar) {
        AbstractC6278l abstractC6278l = (AbstractC6278l) bVar;
        abstractC6278l.f50604p = this.f50447C;
        abstractC6278l.f50606r = (this.f50445A & PduHandle.NONE) == Integer.MIN_VALUE;
        byte[] bArr = f50441E;
        synchronized (bArr) {
            try {
                System.arraycopy(this.f50457p, 0, bArr, 0, 36);
                int iA = Ug.b.a(bArr, 2) & 65535;
                if (iA < 33 || iA + 4 > this.f50467z) {
                    throw new IOException("Invalid payload size: " + iA);
                }
                int iC = Ug.b.c(bArr, 9);
                if (abstractC6278l.f50591c == 46 && (iC == 0 || iC == -2147483643)) {
                    C6291z c6291z = (C6291z) abstractC6278l;
                    Vg.c.k(this.f50456o, bArr, 36, 27);
                    abstractC6278l.e(bArr, 4);
                    int i10 = c6291z.f50681I - 59;
                    if (c6291z.f50603o > 0 && i10 > 0 && i10 < 4) {
                        Vg.c.k(this.f50456o, bArr, 63, i10);
                    }
                    int i11 = c6291z.f50680H;
                    if (i11 > 0) {
                        Vg.c.k(this.f50456o, c6291z.f50677E, c6291z.f50678F, i11);
                    }
                } else {
                    Vg.c.k(this.f50456o, bArr, 36, iA - 32);
                    abstractC6278l.e(bArr, 4);
                    if (abstractC6278l instanceof D) {
                        ((D) abstractC6278l).nextElement();
                    }
                }
                C6279m c6279m = this.f50461t;
                if (c6279m != null && abstractC6278l.f50596h == 0) {
                    c6279m.d(bArr, 4, abstractC6278l);
                }
                if (Ug.e.f22464b >= 4) {
                    f50443G.println(bVar);
                    if (Ug.e.f22464b >= 6) {
                        Ug.d.a(f50443G, bArr, 4, iA);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Vg.c
    protected void f(Vg.a aVar) {
        byte[] bArr = f50441E;
        synchronized (bArr) {
            try {
                AbstractC6278l abstractC6278l = (AbstractC6278l) aVar;
                int iF = abstractC6278l.f(bArr, 4);
                Ug.b.d(65535 & iF, bArr, 0);
                if (Ug.e.f22464b >= 4) {
                    do {
                        f50443G.println(abstractC6278l);
                        if (!(abstractC6278l instanceof AbstractC6268b)) {
                            break;
                        } else {
                            abstractC6278l = ((AbstractC6268b) abstractC6278l).f50543D;
                        }
                    } while (abstractC6278l != null);
                    if (Ug.e.f22464b >= 6) {
                        Ug.d.a(f50443G, f50441E, 4, iF);
                    }
                }
                this.f50455n.write(f50441E, 0, iF + 4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Vg.c
    protected void g() throws IOException {
        int iA = Ug.b.a(this.f50457p, 2) & 65535;
        if (iA >= 33 && iA + 4 <= this.f50467z) {
            this.f50456o.skip(iA - 32);
        } else {
            this.f50456o.skip(r0.available());
        }
    }

    @Override // Vg.c
    protected void i(Vg.a aVar) {
        int i10 = this.f50454m + 1;
        this.f50454m = i10;
        if (i10 == 32000) {
            this.f50454m = 1;
        }
        ((AbstractC6278l) aVar).f50601m = this.f50454m;
    }

    @Override // Vg.c
    protected Vg.a j() throws IOException {
        while (Vg.c.k(this.f50456o, this.f50457p, 0, 4) >= 4) {
            byte[] bArr = this.f50457p;
            if (bArr[0] != -123) {
                if (Vg.c.k(this.f50456o, bArr, 4, 32) < 32) {
                    return null;
                }
                if (Ug.e.f22464b >= 4) {
                    f50443G.println("New data read: " + this);
                    Ug.d.a(f50443G, this.f50457p, 4, 32);
                }
                while (true) {
                    byte[] bArr2 = this.f50457p;
                    if (bArr2[0] == 0 && bArr2[1] == 0 && bArr2[4] == -1 && bArr2[5] == 83 && bArr2[6] == 77 && bArr2[7] == 66) {
                        this.f50458q.f50601m = Ug.b.b(bArr2, 34) & 65535;
                        return this.f50458q;
                    }
                    int i10 = 0;
                    while (i10 < 35) {
                        byte[] bArr3 = this.f50457p;
                        int i11 = i10 + 1;
                        bArr3[i10] = bArr3[i11];
                        i10 = i11;
                    }
                    int i12 = this.f50456o.read();
                    if (i12 == -1) {
                        return null;
                    }
                    this.f50457p[35] = (byte) i12;
                }
            }
        }
        return null;
    }

    void m(AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) throws SmbException {
        int iH = SmbException.h(abstractC6278l2.f50596h);
        abstractC6278l2.f50596h = iH;
        if (iH != 0) {
            switch (iH) {
                case -2147483643:
                case -1073741802:
                case 0:
                    break;
                case -1073741790:
                case -1073741718:
                case -1073741428:
                case -1073741260:
                    break;
                case -1073741225:
                    C6277k c6277k = abstractC6278l.f50610v;
                    if (c6277k == null) {
                        throw new SmbException(abstractC6278l2.f50596h, (Throwable) null);
                    }
                    DfsReferral dfsReferralQ = q(c6277k, abstractC6278l.f50611w, 1);
                    if (dfsReferralQ == null) {
                        throw new SmbException(abstractC6278l2.f50596h, (Throwable) null);
                    }
                    M.f50384y.d(abstractC6278l.f50611w, dfsReferralQ);
                    throw dfsReferralQ;
                default:
                    switch (iH) {
                        case -1073741715:
                        case -1073741714:
                        case -1073741713:
                        case -1073741712:
                        case -1073741711:
                        case -1073741710:
                            break;
                        default:
                            throw new SmbException(abstractC6278l2.f50596h, (Throwable) null);
                    }
            }
            throw new SmbAuthException(abstractC6278l2.f50596h);
        }
        if (abstractC6278l2.f50609u) {
            throw new SmbException("Signature verification failed.");
        }
    }

    public void n() throws SmbException {
        try {
            super.a(L.f50369S0);
        } catch (TransportException e10) {
            throw new SmbException("Failed to connect: " + this.f50451j, e10);
        }
    }

    void o(String str, String[] strArr) {
        int length = strArr.length - 1;
        int length2 = str.length();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 != length) {
            if (i11 == length2 || str.charAt(i11) == '\\') {
                strArr[i10] = str.substring(i12, i11);
                i12 = i11 + 1;
                i10++;
            }
            int i13 = i11 + 1;
            if (i11 >= length2) {
                while (i10 < strArr.length) {
                    strArr[i10] = "";
                    i10++;
                }
                return;
            }
            i11 = i13;
        }
        strArr[length] = str.substring(i12);
    }

    protected void p(Vg.a aVar) throws IOException {
        try {
            f(aVar);
        } catch (IOException e10) {
            if (Ug.e.f22464b > 2) {
                e10.printStackTrace(f50443G);
            }
            try {
                b(true);
            } catch (IOException e11) {
                e11.printStackTrace(f50443G);
            }
            throw e10;
        }
    }

    DfsReferral q(C6277k c6277k, String str, int i10) {
        S sA = r(c6277k).a("IPC$", null);
        U u10 = new U();
        sA.b(new T(str), u10);
        int i11 = u10.f50500m1;
        if (i11 == 0) {
            return null;
        }
        if (i10 == 0 || i11 < i10) {
            i10 = i11;
        }
        DfsReferral dfsReferral = new DfsReferral();
        String[] strArr = new String[4];
        long jCurrentTimeMillis = System.currentTimeMillis() + (C6270d.f50549e * 1000);
        int i12 = 0;
        while (true) {
            dfsReferral.f50315i = c6277k.f50586f;
            dfsReferral.f50310d = u10.f50502o1[i12].f50512j;
            dfsReferral.f50316j = jCurrentTimeMillis;
            if (str.equals("")) {
                dfsReferral.f50311e = u10.f50502o1[i12].f50513k.substring(1).toLowerCase();
            } else {
                o(u10.f50502o1[i12].f50514l, strArr);
                dfsReferral.f50311e = strArr[1];
                dfsReferral.f50312f = strArr[2];
                dfsReferral.f50314h = strArr[3];
            }
            dfsReferral.f50309c = u10.f50499l1;
            i12++;
            if (i12 == i10) {
                return dfsReferral.f50317k;
            }
            dfsReferral.j(new DfsReferral());
            dfsReferral = dfsReferral.f50317k;
        }
    }

    synchronized P r(C6277k c6277k) {
        ListIterator listIterator = this.f50462u.listIterator();
        while (listIterator.hasNext()) {
            P p10 = (P) listIterator.next();
            if (p10.c(c6277k)) {
                p10.f50438i = c6277k;
                return p10;
            }
        }
        int i10 = L.f50372V0;
        if (i10 > 0) {
            long j10 = this.f50459r;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j10 < jCurrentTimeMillis) {
                this.f50459r = i10 + jCurrentTimeMillis;
                ListIterator listIterator2 = this.f50462u.listIterator();
                while (listIterator2.hasNext()) {
                    P p11 = (P) listIterator2.next();
                    if (p11.f50439j < jCurrentTimeMillis) {
                        p11.b(false);
                    }
                }
            }
        }
        P p12 = new P(this.f50451j, this.f50453l, this.f50449h, this.f50450i, c6277k);
        p12.f50437h = this;
        this.f50462u.add(p12);
        return p12;
    }

    @Override // Vg.c
    public String toString() {
        return super.toString() + "[" + this.f50451j + ":" + this.f50453l + "]";
    }

    boolean u(int i10) throws SmbException {
        try {
            a(L.f50369S0);
            return (this.f50445A & i10) == i10;
        } catch (IOException e10) {
            throw new SmbException(e10.getMessage(), e10);
        }
    }

    boolean v(C6277k c6277k) {
        C6277k c6277k2;
        return ((this.f50464w & 4) == 0 || this.f50461t != null || c6277k == (c6277k2 = C6277k.f50578q) || c6277k2.equals(c6277k)) ? false : true;
    }

    boolean w(Rg.b bVar, int i10, InetAddress inetAddress, int i11, String str) {
        InetAddress inetAddress2;
        int i12;
        if (str == null) {
            str = bVar.g();
        }
        String str2 = this.f50448D;
        return (str2 == null || str.equalsIgnoreCase(str2)) && bVar.equals(this.f50451j) && (i10 == 0 || i10 == (i12 = this.f50453l) || (i10 == 445 && i12 == 139)) && ((inetAddress == (inetAddress2 = this.f50449h) || (inetAddress != null && inetAddress.equals(inetAddress2))) && i11 == this.f50450i);
    }

    void y(AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) throws SmbException {
        n();
        abstractC6278l.f50597i |= this.f50464w;
        abstractC6278l.f50604p = this.f50447C;
        abstractC6278l.f50613y = abstractC6278l2;
        if (abstractC6278l.f50612x == null) {
            abstractC6278l.f50612x = this.f50461t;
        }
        try {
            if (abstractC6278l2 == null) {
                p(abstractC6278l);
                return;
            }
            if (abstractC6278l instanceof C) {
                abstractC6278l2.f50591c = abstractC6278l.f50591c;
                C c10 = (C) abstractC6278l;
                D d10 = (D) abstractC6278l2;
                c10.f50288q1 = this.f50466y;
                d10.t();
                try {
                    AbstractC6269c.b(c10, d10);
                    c10.nextElement();
                    if (c10.hasMoreElements()) {
                        AbstractC6278l c6280n = new C6280n();
                        super.l(c10, c6280n, L.f50369S0);
                        if (c6280n.f50596h != 0) {
                            m(c10, c6280n);
                        }
                        c10.nextElement();
                    } else {
                        i(c10);
                    }
                    synchronized (this) {
                        try {
                            abstractC6278l2.f50605q = false;
                            d10.f23426b = false;
                            try {
                                this.f23433e.put(c10, d10);
                                do {
                                    p(c10);
                                    if (!c10.hasMoreElements()) {
                                        break;
                                    }
                                } while (c10.nextElement() != null);
                                long jCurrentTimeMillis = L.f50369S0;
                                d10.f23425a = System.currentTimeMillis() + jCurrentTimeMillis;
                                while (d10.hasMoreElements()) {
                                    wait(jCurrentTimeMillis);
                                    jCurrentTimeMillis = d10.f23425a - System.currentTimeMillis();
                                    if (jCurrentTimeMillis <= 0) {
                                        throw new TransportException(this + " timedout waiting for response to " + c10);
                                    }
                                }
                                if (abstractC6278l2.f50596h != 0) {
                                    m(c10, d10);
                                }
                                this.f23433e.remove(c10);
                            } catch (InterruptedException e10) {
                                throw new TransportException(e10);
                            }
                        } catch (Throwable th2) {
                            this.f23433e.remove(c10);
                            throw th2;
                        }
                    }
                    AbstractC6269c.c(c10.f50289r1);
                    AbstractC6269c.c(d10.f50308k1);
                } catch (Throwable th3) {
                    AbstractC6269c.c(c10.f50289r1);
                    AbstractC6269c.c(d10.f50308k1);
                    throw th3;
                }
            } else {
                abstractC6278l2.f50591c = abstractC6278l.f50591c;
                super.l(abstractC6278l, abstractC6278l2, L.f50369S0);
            }
            m(abstractC6278l, abstractC6278l2);
        } catch (SmbException e11) {
            throw e11;
        } catch (IOException e12) {
            throw new SmbException(e12.getMessage(), e12);
        }
    }

    void z() throws IOException {
        String strK;
        Sg.b bVar = new Sg.b(this.f50451j.a(), 32, null);
        do {
            Socket socket = new Socket();
            this.f50452k = socket;
            if (this.f50449h != null) {
                socket.bind(new InetSocketAddress(this.f50449h, this.f50450i));
            }
            this.f50452k.connect(new InetSocketAddress(this.f50451j.f(), 139), L.f50373W0);
            this.f50452k.setSoTimeout(L.f50372V0);
            this.f50455n = this.f50452k.getOutputStream();
            this.f50456o = this.f50452k.getInputStream();
            Sg.j jVar = new Sg.j(bVar, Sg.g.n());
            OutputStream outputStream = this.f50455n;
            byte[] bArr = this.f50457p;
            outputStream.write(bArr, 0, jVar.d(bArr, 0));
            if (Vg.c.k(this.f50456o, this.f50457p, 0, 4) < 4) {
                try {
                    this.f50452k.close();
                } catch (IOException unused) {
                }
                throw new SmbException("EOF during NetBIOS session request");
            }
            int i10 = this.f50457p[0] & 255;
            if (i10 == -1) {
                b(true);
                throw new NbtException(2, -1);
            }
            if (i10 == 130) {
                if (Ug.e.f22464b >= 4) {
                    f50443G.println("session established ok with " + this.f50451j);
                    return;
                }
                return;
            }
            if (i10 != 131) {
                b(true);
                throw new NbtException(2, 0);
            }
            int i11 = this.f50456o.read() & 255;
            if (i11 != 128 && i11 != 130) {
                b(true);
                throw new NbtException(2, i11);
            }
            this.f50452k.close();
            strK = this.f50451j.k();
            bVar.f20615a = strK;
        } while (strK != null);
        throw new IOException("Failed to establish session with " + this.f50451j);
    }
}
