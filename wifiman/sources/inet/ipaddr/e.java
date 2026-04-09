package inet.ipaddr;

import inet.ipaddr.f;
import inet.ipaddr.format.validate.s;
import inet.ipaddr.ipv6.C6205b;
import java.util.Objects;

/* loaded from: classes4.dex */
public class e implements Zf.f, Comparable {

    /* renamed from: g, reason: collision with root package name */
    private static g[] f49316g = new g[0];

    /* renamed from: h, reason: collision with root package name */
    public static final f f49317h;

    /* renamed from: i, reason: collision with root package name */
    private static final f f49318i;

    /* renamed from: a, reason: collision with root package name */
    private final String f49319a;

    /* renamed from: b, reason: collision with root package name */
    private transient String f49320b;

    /* renamed from: c, reason: collision with root package name */
    private inet.ipaddr.format.validate.h f49321c;

    /* renamed from: d, reason: collision with root package name */
    private HostNameException f49322d;

    /* renamed from: e, reason: collision with root package name */
    g[] f49323e;

    /* renamed from: f, reason: collision with root package name */
    final f f49324f;

    static {
        f fVarN = new f.a().n();
        f49317h = fVarN;
        f49318i = fVarN.l().m(true).n();
    }

    e(String str, inet.ipaddr.format.validate.h hVar) {
        this.f49319a = str;
        this.f49321c = hVar;
        this.f49324f = null;
    }

    private String V() {
        String str = this.f49320b;
        if (str != null) {
            return str;
        }
        String strS = s(true);
        this.f49320b = strS;
        return strS;
    }

    private String s(boolean z10) {
        if (!p()) {
            return this.f49319a;
        }
        StringBuilder sb2 = new StringBuilder();
        if (l()) {
            v(a(), z10, sb2);
        } else if (n()) {
            sb2.append(c().a0());
        } else {
            sb2.append(this.f49321c.h());
            Integer numG = this.f49321c.g();
            if (numG != null) {
                sb2.append('/');
                k.X2(numG.intValue(), 10, sb2);
            } else {
                g gVarJ = this.f49321c.j();
                if (gVarJ != null) {
                    sb2.append('/');
                    sb2.append(gVarJ.a0());
                }
            }
        }
        Integer numM = this.f49321c.m();
        if (numM != null) {
            t(numM.intValue(), sb2);
        } else {
            String strN = this.f49321c.n();
            if (strN != null) {
                sb2.append(':');
                sb2.append(strN);
            }
        }
        return sb2.toString();
    }

    private static void t(int i10, StringBuilder sb2) {
        sb2.append(':');
        k.X2(i10, 10, sb2);
    }

    private static void v(g gVar, boolean z10, StringBuilder sb2) {
        if (!gVar.f1()) {
            sb2.append(z10 ? gVar.V() : gVar.a0());
            return;
        }
        if (z10 || !gVar.i()) {
            sb2.append('[');
            y(gVar.o1(), gVar.V(), sb2);
            sb2.append(']');
        } else {
            sb2.append('[');
            String strA0 = gVar.a0();
            int iIndexOf = strA0.indexOf(47);
            y(gVar.o1(), strA0.substring(0, iIndexOf), sb2);
            sb2.append(']');
            sb2.append(strA0.substring(iIndexOf));
        }
    }

    private static void y(C6205b c6205b, String str, StringBuilder sb2) {
        if (!c6205b.Q1()) {
            sb2.append(str);
            return;
        }
        int iIndexOf = str.indexOf(37);
        sb2.append((CharSequence) str, 0, iIndexOf);
        sb2.append("%25");
        while (true) {
            iIndexOf++;
            if (iIndexOf >= str.length()) {
                return;
            }
            char cCharAt = str.charAt(iIndexOf);
            if (s.x(cCharAt)) {
                sb2.append('%');
                k.X2(cCharAt, 16, sb2);
            } else {
                sb2.append(cCharAt);
            }
        }
    }

    public void B() throws HostNameException {
        if (this.f49321c != null) {
            return;
        }
        HostNameException hostNameException = this.f49322d;
        if (hostNameException != null) {
            throw hostNameException;
        }
        synchronized (this) {
            try {
                if (this.f49321c != null) {
                    return;
                }
                HostNameException hostNameException2 = this.f49322d;
                if (hostNameException2 != null) {
                    throw hostNameException2;
                }
                try {
                    this.f49321c = j().b(this);
                } catch (HostNameException e10) {
                    this.f49322d = e10;
                    throw e10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g a() {
        if (l()) {
            return this.f49321c.a();
        }
        return null;
    }

    public n c() {
        if (n()) {
            return this.f49321c.c();
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        if (!p()) {
            if (eVar.p()) {
                return -1;
            }
            return toString().compareTo(eVar.toString());
        }
        if (!eVar.p()) {
            return 1;
        }
        inet.ipaddr.format.validate.h hVar = this.f49321c;
        inet.ipaddr.format.validate.h hVar2 = eVar.f49321c;
        if (hVar.p()) {
            if (!hVar2.p()) {
                return -1;
            }
            int iCompareTo = hVar.c().compareTo(hVar2.c());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        } else {
            if (hVar2.p()) {
                return 1;
            }
            String[] strArrL = hVar.l();
            String[] strArrL2 = hVar2.l();
            int length = strArrL.length;
            int length2 = strArrL2.length;
            int iMin = Math.min(length, length2);
            for (int i10 = 1; i10 <= iMin; i10++) {
                int iCompareTo2 = strArrL[length - i10].compareTo(strArrL2[length2 - i10]);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            if (length != length2) {
                return length - length2;
            }
            Integer numG = hVar.g();
            Integer numG2 = hVar2.g();
            if (numG != null) {
                if (numG2 == null) {
                    return 1;
                }
                if (numG.intValue() != numG2.intValue()) {
                    return numG2.intValue() - numG.intValue();
                }
            } else {
                if (numG2 != null) {
                    return -1;
                }
                g gVarJ = hVar.j();
                g gVarJ2 = hVar2.j();
                if (gVarJ != null) {
                    if (gVarJ2 == null) {
                        return 1;
                    }
                    int iCompareTo3 = gVarJ.compareTo(gVarJ2);
                    if (iCompareTo3 != 0) {
                        return iCompareTo3;
                    }
                } else if (gVarJ2 != null) {
                    return -1;
                }
            }
        }
        Integer numM = hVar.m();
        Integer numM2 = hVar2.m();
        if (numM != null) {
            if (numM2 == null) {
                return 1;
            }
            int iIntValue = numM.intValue() - numM2.intValue();
            if (iIntValue != 0) {
                return iIntValue;
            }
        } else if (numM2 != null) {
            return -1;
        }
        String strN = hVar.n();
        String strN2 = hVar2.n();
        if (strN == null) {
            return strN2 != null ? -1 : 0;
        }
        if (strN2 == null) {
            return 1;
        }
        int iCompareTo4 = strN.compareTo(strN2);
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && r((e) obj);
    }

    public String g() {
        if (p()) {
            return this.f49321c.h();
        }
        return null;
    }

    public f h() {
        return this.f49324f;
    }

    public int hashCode() {
        return V().hashCode();
    }

    protected inet.ipaddr.format.validate.b j() {
        return s.f49474j;
    }

    public boolean l() {
        return n() && this.f49321c.a() != null;
    }

    public boolean n() {
        return p() && this.f49321c.p();
    }

    public boolean p() {
        if (this.f49321c != null) {
            return true;
        }
        if (this.f49322d != null) {
            return false;
        }
        try {
            B();
            return true;
        } catch (HostNameException unused) {
            return false;
        }
    }

    public boolean r(e eVar) {
        if (this == eVar) {
            return true;
        }
        if (!p()) {
            return !eVar.p() && toString().equals(eVar.toString());
        }
        if (!eVar.p()) {
            return false;
        }
        inet.ipaddr.format.validate.h hVar = this.f49321c;
        inet.ipaddr.format.validate.h hVar2 = eVar.f49321c;
        if (hVar.p()) {
            return hVar2.p() && hVar.c().equals(hVar2.c()) && Objects.equals(hVar.m(), hVar2.m()) && Objects.equals(hVar.n(), hVar2.n());
        }
        if (!hVar2.p() && hVar.h().equals(hVar2.h())) {
            return Objects.equals(hVar.g(), hVar2.g()) && Objects.equals(hVar.j(), hVar2.j()) && Objects.equals(hVar.m(), hVar2.m()) && Objects.equals(hVar.n(), hVar2.n());
        }
        return false;
    }

    public String toString() {
        return this.f49319a;
    }

    public e(String str) {
        this(str, f49317h);
    }

    public e(String str, f fVar) {
        fVar.getClass();
        this.f49324f = fVar;
        this.f49319a = str == null ? "" : str.trim();
    }
}
