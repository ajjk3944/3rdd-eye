package jcifs.smb1.smb1;

import java.net.InetAddress;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: l, reason: collision with root package name */
    private static final String f50424l = Rg.a.h("jcifs.smb1.smb.client.logonShare", null);

    /* renamed from: m, reason: collision with root package name */
    private static final int f50425m = Rg.a.d("jcifs.smb1.netbios.lookupRespLimit", 3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f50426n = Rg.a.h("jcifs.smb1.smb.client.domain", null);

    /* renamed from: o, reason: collision with root package name */
    private static final String f50427o = Rg.a.h("jcifs.smb1.smb.client.username", null);

    /* renamed from: p, reason: collision with root package name */
    private static final int f50428p = Rg.a.d("jcifs.smb1.netbios.cachePolicy", 600) * 60;

    /* renamed from: q, reason: collision with root package name */
    static Sg.g[] f50429q = null;

    /* renamed from: b, reason: collision with root package name */
    int f50431b;

    /* renamed from: d, reason: collision with root package name */
    private Rg.b f50433d;

    /* renamed from: e, reason: collision with root package name */
    private int f50434e;

    /* renamed from: f, reason: collision with root package name */
    private int f50435f;

    /* renamed from: g, reason: collision with root package name */
    private InetAddress f50436g;

    /* renamed from: i, reason: collision with root package name */
    C6277k f50438i;

    /* renamed from: j, reason: collision with root package name */
    long f50439j;

    /* renamed from: h, reason: collision with root package name */
    Q f50437h = null;

    /* renamed from: k, reason: collision with root package name */
    String f50440k = null;

    /* renamed from: c, reason: collision with root package name */
    Vector f50432c = new Vector();

    /* renamed from: a, reason: collision with root package name */
    int f50430a = 0;

    P(Rg.b bVar, int i10, InetAddress inetAddress, int i11, C6277k c6277k) {
        this.f50433d = bVar;
        this.f50434e = i10;
        this.f50436g = inetAddress;
        this.f50435f = i11;
        this.f50438i = c6277k;
    }

    synchronized S a(String str, String str2) {
        if (str == null) {
            str = "IPC$";
        }
        try {
            Enumeration enumerationElements = this.f50432c.elements();
            while (enumerationElements.hasMoreElements()) {
                S s10 = (S) enumerationElements.nextElement();
                if (s10.a(str, str2)) {
                    return s10;
                }
            }
            S s11 = new S(this, str, str2);
            this.f50432c.addElement(s11);
            return s11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void b(boolean z10) {
        synchronized (f()) {
            try {
                if (this.f50430a != 2) {
                    return;
                }
                this.f50430a = 3;
                this.f50440k = null;
                Enumeration enumerationElements = this.f50432c.elements();
                while (enumerationElements.hasMoreElements()) {
                    ((S) enumerationElements.nextElement()).d(z10);
                }
                if (!z10 && this.f50437h.f50463v.f50474g != 0) {
                    C6282p c6282p = new C6282p(null);
                    c6282p.f50600l = this.f50431b;
                    try {
                        this.f50437h.y(c6282p, null);
                    } catch (SmbException unused) {
                    }
                    this.f50431b = 0;
                }
                this.f50430a = 0;
                this.f50437h.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean c(C6277k c6277k) {
        C6277k c6277k2 = this.f50438i;
        return c6277k2 == c6277k || c6277k2.equals(c6277k);
    }

    void d(AbstractC6278l abstractC6278l, AbstractC6278l abstractC6278l2) {
        synchronized (f()) {
            if (abstractC6278l2 != null) {
                try {
                    abstractC6278l2.f50605q = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f50439j = System.currentTimeMillis() + L.f50372V0;
            e(abstractC6278l, abstractC6278l2);
            if (abstractC6278l2 == null || !abstractC6278l2.f50605q) {
                if (abstractC6278l instanceof E) {
                    E e10 = (E) abstractC6278l;
                    if (this.f50440k != null && e10.f50327J.endsWith("\\IPC$")) {
                        e10.f50327J = "\\\\" + this.f50440k + "\\IPC$";
                    }
                }
                abstractC6278l.f50600l = this.f50431b;
                abstractC6278l.f50610v = this.f50438i;
                try {
                    this.f50437h.y(abstractC6278l, abstractC6278l2);
                } catch (SmbException e11) {
                    if (abstractC6278l instanceof E) {
                        b(true);
                    }
                    abstractC6278l.f50612x = null;
                    throw e11;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0189, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        r10.f50612x = new jcifs.smb1.smb1.C6279m(r6.p(r16.f50437h.f50463v.f50483p), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019c, code lost:
    
        r10.f50610v = r16.f50438i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        r16.f50437h.y(r10, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01f1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01f2, code lost:
    
        b(r4);
        r16.f50430a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01f8, code lost:
    
        r16.f50437h.notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
    
        r4 = true;
        r16.f50430a = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002e, code lost:
    
        r16.f50437h.n();
        r6 = jcifs.smb1.smb1.Q.f50441E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
    
        r7 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        if (Ug.e.f22464b < 4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        jcifs.smb1.smb1.Q.f50443G.println("sessionSetup: accountName=" + r16.f50438i.f50582b + ",primaryDomain=" + r16.f50438i.f50581a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        r16.f50431b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        r6 = 10;
        r9 = r0;
        r10 = 10;
        r0 = null;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if (r10 == r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r10 != 20) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r11 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if ((r16.f50437h.f50464w & r7) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r11 = new jcifs.smb1.smb1.C6276j(r16.f50438i, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r13 = jcifs.smb1.smb1.Q.f50441E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        if (Ug.e.f22464b < r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        jcifs.smb1.smb1.Q.f50443G.println(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r11.d() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r16.f50440k = r11.a();
        r16.f50430a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r9 = r11.c(r9, 0, r9.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        if (r9 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        r13 = new jcifs.smb1.smb1.A(r16, null, r9);
        r9 = new jcifs.smb1.smb1.B(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        if (r16.f50437h.v(r16.f50438i) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c8, code lost:
    
        r14 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ce, code lost:
    
        r13.f50612x = new jcifs.smb1.smb1.C6279m(r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        r13.f50600l = r16.f50431b;
        r16.f50431b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        r16.f50437h.y(r13, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
    
        r16.f50437h.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0118, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0119, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011a, code lost:
    
        r16.f50437h.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011f, code lost:
    
        r16.f50431b = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0121, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0138, code lost:
    
        throw new jcifs.smb1.smb1.SmbException("Unexpected session setup state: " + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013d, code lost:
    
        if (r16.f50438i == jcifs.smb1.smb1.C6277k.f50577p) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        if (r16.f50437h.u(org.snmp4j.mp.PduHandle.NONE) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0149, code lost:
    
        r10 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0150, code lost:
    
        r10 = new jcifs.smb1.smb1.A(r16, r17, r16.f50438i);
        r13 = new jcifs.smb1.smb1.B(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0168, code lost:
    
        if (r16.f50437h.v(r16.f50438i) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016a, code lost:
    
        r6 = r16.f50438i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        if (r6.f50586f == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
    
        if (jcifs.smb1.smb1.C6277k.f50576o == "") goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
    
        r16.f50437h.r(jcifs.smb1.smb1.C6277k.f50580s).a(jcifs.smb1.smb1.P.f50424l, null).c(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0188, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ea A[LOOP:1: B:34:0x0070->B:130:0x01ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void e(jcifs.smb1.smb1.AbstractC6278l r17, jcifs.smb1.smb1.AbstractC6278l r18) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jcifs.smb1.smb1.P.e(jcifs.smb1.smb1.l, jcifs.smb1.smb1.l):void");
    }

    synchronized Q f() {
        try {
            if (this.f50437h == null) {
                this.f50437h = Q.t(this.f50433d, this.f50434e, this.f50436g, this.f50435f, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f50437h;
    }

    public String toString() {
        return "SmbSession[accountName=" + this.f50438i.f50582b + ",primaryDomain=" + this.f50438i.f50581a + ",uid=" + this.f50431b + ",connectionState=" + this.f50430a + "]";
    }
}
