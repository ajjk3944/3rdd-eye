package Lg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c extends e {

    /* renamed from: l, reason: collision with root package name */
    private static Ej.b f11662l = Ej.c.i(c.class);

    /* renamed from: m, reason: collision with root package name */
    public static boolean f11663m = true;

    /* renamed from: n, reason: collision with root package name */
    private static final char[] f11664n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: h, reason: collision with root package name */
    private final DatagramPacket f11665h;

    /* renamed from: i, reason: collision with root package name */
    private final long f11666i;

    /* renamed from: j, reason: collision with root package name */
    private final b f11667j;

    /* renamed from: k, reason: collision with root package name */
    private int f11668k;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11669a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f11670b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f11671c;

        static {
            int[] iArr = new int[javax.jmdns.impl.constants.e.values().length];
            f11671c = iArr;
            try {
                iArr[javax.jmdns.impl.constants.e.TYPE_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_AAAA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_CNAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_PTR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_TXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_SRV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_HINFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11671c[javax.jmdns.impl.constants.e.TYPE_OPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[javax.jmdns.impl.constants.c.values().length];
            f11670b = iArr2;
            try {
                iArr2[javax.jmdns.impl.constants.c.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11670b[javax.jmdns.impl.constants.c.LLQ.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11670b[javax.jmdns.impl.constants.c.NSID.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11670b[javax.jmdns.impl.constants.c.UL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11670b[javax.jmdns.impl.constants.c.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[javax.jmdns.impl.constants.b.values().length];
            f11669a = iArr3;
            try {
                iArr3[javax.jmdns.impl.constants.b.Standard.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11669a[javax.jmdns.impl.constants.b.Compressed.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11669a[javax.jmdns.impl.constants.b.Extended.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11669a[javax.jmdns.impl.constants.b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static class b extends ByteArrayInputStream {

        /* renamed from: a, reason: collision with root package name */
        final Map f11672a;

        public b(byte[] bArr, int i10) {
            this(bArr, 0, i10);
        }

        public byte[] a(int i10) throws IOException {
            byte[] bArr = new byte[i10];
            read(bArr, 0, i10);
            return bArr;
        }

        public String g() {
            HashMap map = new HashMap();
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            while (!z10) {
                int iP = p();
                if (iP == 0) {
                    break;
                }
                int i10 = a.f11669a[javax.jmdns.impl.constants.b.labelForByte(iP).ordinal()];
                if (i10 == 1) {
                    int i11 = ((ByteArrayInputStream) this).pos - 1;
                    String str = j(iP) + ".";
                    sb2.append(str);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    map.put(Integer.valueOf(i11), new StringBuilder(str));
                } else if (i10 == 2) {
                    int iLabelValue = (javax.jmdns.impl.constants.b.labelValue(iP) << 8) | p();
                    String str2 = (String) this.f11672a.get(Integer.valueOf(iLabelValue));
                    if (str2 == null) {
                        c.f11662l.j("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(iLabelValue), Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str2 = "";
                    }
                    sb2.append(str2);
                    Iterator it2 = map.values().iterator();
                    while (it2.hasNext()) {
                        ((StringBuilder) it2.next()).append(str2);
                    }
                    z10 = true;
                } else if (i10 != 3) {
                    c.f11662l.a("Unsupported DNS label type: '{}'", Integer.toHexString(iP & 192));
                } else {
                    c.f11662l.l("Extended label are not currently supported.");
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                this.f11672a.put((Integer) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
            }
            return sb2.toString();
        }

        public String h() {
            return j(p());
        }

        public String j(int i10) {
            int i11;
            int iP;
            StringBuilder sb2 = new StringBuilder(i10);
            int i12 = 0;
            while (i12 < i10) {
                int iP2 = p();
                switch (iP2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        sb2.append((char) iP2);
                        i12++;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    default:
                        i11 = (iP2 & 63) << 4;
                        iP = p() & 15;
                        break;
                    case 12:
                    case 13:
                        i11 = (iP2 & 31) << 6;
                        iP = p() & 63;
                        break;
                    case 14:
                        iP2 = ((iP2 & 15) << 12) | ((p() & 63) << 6) | (p() & 63);
                        i12 += 2;
                        continue;
                        sb2.append((char) iP2);
                        i12++;
                }
                iP2 = i11 | iP;
                i12++;
                sb2.append((char) iP2);
                i12++;
            }
            return sb2.toString();
        }

        public int p() {
            return read() & 255;
        }

        public int readInt() {
            return (s() << 16) | s();
        }

        public int s() {
            return (p() << 8) | p();
        }

        public b(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
            this.f11672a = new HashMap();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DatagramPacket datagramPacket) throws IOException {
        super(0, 0, datagramPacket.getPort() == javax.jmdns.impl.constants.a.f50178c);
        this.f11665h = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        b bVar = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.f11667j = bVar;
        this.f11666i = System.currentTimeMillis();
        this.f11668k = 1460;
        try {
            try {
                w(bVar.s());
                v(bVar.s());
                if (k() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int iS = bVar.s();
                int iS2 = bVar.s();
                int iS3 = bVar.s();
                int iS4 = bVar.s();
                f11662l.o("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(iS), Integer.valueOf(iS2), Integer.valueOf(iS3), Integer.valueOf(iS4));
                if ((iS * 5) + ((iS2 + iS3 + iS4) * 11) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + iS + " answers:" + iS2 + " authorities:" + iS3 + " additionals:" + iS4);
                }
                if (iS > 0) {
                    for (int i10 = 0; i10 < iS; i10++) {
                        this.f11676d.add(G());
                    }
                }
                if (iS2 > 0) {
                    for (int i11 = 0; i11 < iS2; i11++) {
                        h hVarF = F(address);
                        if (hVarF != null) {
                            this.f11677e.add(hVarF);
                        }
                    }
                }
                if (iS3 > 0) {
                    for (int i12 = 0; i12 < iS3; i12++) {
                        h hVarF2 = F(address);
                        if (hVarF2 != null) {
                            this.f11678f.add(hVarF2);
                        }
                    }
                }
                if (iS4 > 0) {
                    for (int i13 = 0; i13 < iS4; i13++) {
                        h hVarF3 = F(address);
                        if (hVarF3 != null) {
                            this.f11679g.add(hVarF3);
                        }
                    }
                }
                if (this.f11667j.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
                try {
                    this.f11667j.close();
                } catch (Exception unused) {
                    f11662l.t("MessageInputStream close error");
                }
            } catch (Exception e10) {
                f11662l.r("DNSIncoming() dump " + E(true) + "\n exception ", e10);
                IOException iOException = new IOException("DNSIncoming corrupted message");
                iOException.initCause(e10);
                throw iOException;
            }
        } catch (Throwable th2) {
            try {
                this.f11667j.close();
            } catch (Exception unused2) {
                f11662l.t("MessageInputStream close error");
            }
            throw th2;
        }
    }

    private boolean D(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0 && bArr[6] == 0 && bArr[7] == 0 && bArr[8] == 0 && bArr[9] == 0 && bArr[10] == -1 && bArr[11] == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private Lg.h F(java.net.InetAddress r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Lg.c.F(java.net.InetAddress):Lg.h");
    }

    private g G() {
        String strG = this.f11667j.g();
        javax.jmdns.impl.constants.e eVarTypeForIndex = javax.jmdns.impl.constants.e.typeForIndex(this.f11667j.s());
        if (eVarTypeForIndex == javax.jmdns.impl.constants.e.TYPE_IGNORE) {
            f11662l.a("Could not find record type: {}", E(true));
        }
        int iS = this.f11667j.s();
        javax.jmdns.impl.constants.d dVarClassForIndex = javax.jmdns.impl.constants.d.classForIndex(iS);
        return g.D(strG, eVarTypeForIndex, dVarClassForIndex, dVarClassForIndex.isUnique(iS));
    }

    private String x(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            char[] cArr = f11664n;
            sb2.append(cArr[i10 / 16]);
            sb2.append(cArr[i10 % 16]);
        }
        return sb2.toString();
    }

    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(e(), f(), o(), this.f11665h, this.f11666i);
        cVar.f11668k = this.f11668k;
        cVar.f11676d.addAll(this.f11676d);
        cVar.f11677e.addAll(this.f11677e);
        cVar.f11678f.addAll(this.f11678f);
        cVar.f11679g.addAll(this.f11679g);
        return cVar;
    }

    public int B() {
        return (int) (System.currentTimeMillis() - this.f11666i);
    }

    public int C() {
        return this.f11668k;
    }

    String E(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(t());
        if (z10) {
            int length = this.f11665h.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f11665h.getData(), 0, bArr, 0, length);
            sb2.append(u(bArr));
        }
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p() ? "dns[query," : "dns[response,");
        if (this.f11665h.getAddress() != null) {
            sb2.append(this.f11665h.getAddress().getHostAddress());
        }
        sb2.append(':');
        sb2.append(this.f11665h.getPort());
        sb2.append(", length=");
        sb2.append(this.f11665h.getLength());
        sb2.append(", id=0x");
        sb2.append(Integer.toHexString(f()));
        if (e() != 0) {
            sb2.append(", flags=0x");
            sb2.append(Integer.toHexString(e()));
            if ((e() & 32768) != 0) {
                sb2.append(":r");
            }
            if ((e() & 1024) != 0) {
                sb2.append(":aa");
            }
            if ((e() & 512) != 0) {
                sb2.append(":tc");
            }
        }
        if (j() > 0) {
            sb2.append(", questions=");
            sb2.append(j());
        }
        if (h() > 0) {
            sb2.append(", answers=");
            sb2.append(h());
        }
        if (i() > 0) {
            sb2.append(", authorities=");
            sb2.append(i());
        }
        if (g() > 0) {
            sb2.append(", additionals=");
            sb2.append(g());
        }
        if (j() > 0) {
            sb2.append("\nquestions:");
            for (g gVar : this.f11676d) {
                sb2.append("\n\t");
                sb2.append(gVar);
            }
        }
        if (h() > 0) {
            sb2.append("\nanswers:");
            for (h hVar : this.f11677e) {
                sb2.append("\n\t");
                sb2.append(hVar);
            }
        }
        if (i() > 0) {
            sb2.append("\nauthorities:");
            for (h hVar2 : this.f11678f) {
                sb2.append("\n\t");
                sb2.append(hVar2);
            }
        }
        if (g() > 0) {
            sb2.append("\nadditionals:");
            for (h hVar3 : this.f11679g) {
                sb2.append("\n\t");
                sb2.append(hVar3);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    void z(c cVar) {
        if (!p() || !r() || !cVar.p()) {
            throw new IllegalArgumentException();
        }
        this.f11676d.addAll(cVar.l());
        this.f11677e.addAll(cVar.c());
        this.f11678f.addAll(cVar.d());
        this.f11679g.addAll(cVar.a());
    }

    private c(int i10, int i11, boolean z10, DatagramPacket datagramPacket, long j10) {
        super(i10, i11, z10);
        this.f11665h = datagramPacket;
        this.f11667j = new b(datagramPacket.getData(), datagramPacket.getLength());
        this.f11666i = j10;
    }
}
