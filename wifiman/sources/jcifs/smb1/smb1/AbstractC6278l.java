package jcifs.smb1.smb1;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.TimeZone;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.PDU;
import org.snmp4j.smi.Counter32;

/* renamed from: jcifs.smb1.smb1.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6278l extends Vg.b implements Vg.a, L {

    /* renamed from: c, reason: collision with root package name */
    byte f50591c;

    /* renamed from: e, reason: collision with root package name */
    int f50593e;

    /* renamed from: f, reason: collision with root package name */
    int f50594f;

    /* renamed from: h, reason: collision with root package name */
    int f50596h;

    /* renamed from: i, reason: collision with root package name */
    int f50597i;

    /* renamed from: j, reason: collision with root package name */
    int f50598j;

    /* renamed from: l, reason: collision with root package name */
    int f50600l;

    /* renamed from: m, reason: collision with root package name */
    int f50601m;

    /* renamed from: n, reason: collision with root package name */
    int f50602n;

    /* renamed from: o, reason: collision with root package name */
    int f50603o;

    /* renamed from: p, reason: collision with root package name */
    boolean f50604p;

    /* renamed from: q, reason: collision with root package name */
    boolean f50605q;

    /* renamed from: r, reason: collision with root package name */
    boolean f50606r;

    /* renamed from: t, reason: collision with root package name */
    int f50608t;

    /* renamed from: u, reason: collision with root package name */
    boolean f50609u;

    /* renamed from: w, reason: collision with root package name */
    String f50611w;

    /* renamed from: y, reason: collision with root package name */
    AbstractC6278l f50613y;

    /* renamed from: z, reason: collision with root package name */
    static Ug.e f50590z = Ug.e.a();

    /* renamed from: A, reason: collision with root package name */
    static final byte[] f50589A = {-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: s, reason: collision with root package name */
    long f50607s = 1;

    /* renamed from: v, reason: collision with root package name */
    C6277k f50610v = null;

    /* renamed from: x, reason: collision with root package name */
    C6279m f50612x = null;

    /* renamed from: d, reason: collision with root package name */
    byte f50592d = 24;

    /* renamed from: k, reason: collision with root package name */
    int f50599k = L.f50360J0;

    /* renamed from: g, reason: collision with root package name */
    int f50595g = 0;

    AbstractC6278l() {
    }

    static void D(long j10, byte[] bArr, int i10) {
        if (j10 == 0 || j10 == -1) {
            y(-1L, bArr, i10);
            return;
        }
        TimeZone timeZone = L.f50361K0;
        synchronized (timeZone) {
            try {
                if (timeZone.inDaylightTime(new Date())) {
                    if (!timeZone.inDaylightTime(new Date(j10))) {
                        j10 -= 3600000;
                    }
                } else if (timeZone.inDaylightTime(new Date(j10))) {
                    j10 += 3600000;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y((int) (j10 / 1000), bArr, i10);
    }

    static int j(byte[] bArr, int i10) {
        return (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8);
    }

    static int k(byte[] bArr, int i10) {
        return (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + ((bArr[i10 + 3] & 255) << 24);
    }

    static long l(byte[] bArr, int i10) {
        return (k(bArr, i10) & Counter32.MAX_COUNTER32_VALUE) + (k(bArr, i10 + 4) << 32);
    }

    static long r(byte[] bArr, int i10) {
        return (((k(bArr, i10 + 4) << 32) | (k(bArr, i10) & Counter32.MAX_COUNTER32_VALUE)) / 10000) - 11644473600000L;
    }

    static long s(byte[] bArr, int i10) {
        return k(bArr, i10) * 1000;
    }

    static void x(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
    }

    static void y(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
    }

    static void z(long j10, byte[] bArr, int i10) {
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
    }

    abstract int A(byte[] bArr, int i10);

    int B(String str, byte[] bArr, int i10) {
        return C(str, bArr, i10, this.f50604p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int C(String str, byte[] bArr, int i10, boolean z10) throws UnsupportedEncodingException {
        int i11;
        int i12;
        try {
            try {
                if (z10 != 0) {
                    if ((i10 - this.f50593e) % 2 != 0) {
                        i12 = i10 + 1;
                        bArr[i10] = 0;
                    } else {
                        i12 = i10;
                    }
                    System.arraycopy(str.getBytes("UTF-16LE"), 0, bArr, i12, str.length() * 2);
                    int length = i12 + (str.length() * 2);
                    int i13 = length + 1;
                    try {
                        bArr[length] = 0;
                        int i14 = length + 2;
                        bArr[i13] = 0;
                        i11 = i14;
                    } catch (UnsupportedEncodingException e10) {
                        i11 = i13;
                        e = e10;
                        if (Ug.e.f22464b > 1) {
                            e.printStackTrace(f50590z);
                        }
                        return i11 - i10;
                    }
                } else {
                    byte[] bytes = str.getBytes(L.f50363M0);
                    System.arraycopy(bytes, 0, bArr, i10, bytes.length);
                    int length2 = bytes.length + i10;
                    int i15 = length2 + 1;
                    bArr[length2] = 0;
                    i11 = i15;
                }
            } catch (UnsupportedEncodingException e11) {
                e = e11;
                i11 = z10;
            }
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            i11 = i10;
        }
        return i11 - i10;
    }

    int e(byte[] bArr, int i10) {
        this.f50593e = i10;
        int i11 = i(bArr, i10) + i10;
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        this.f50602n = b10;
        if (b10 != 0) {
            int iM = m(bArr, i12);
            if (iM != this.f50602n * 2 && Ug.e.f22464b >= 5) {
                f50590z.println("wordCount * 2=" + (this.f50602n * 2) + " but readParameterWordsWireFormat returned " + iM);
            }
            i12 += this.f50602n * 2;
        }
        int iJ = j(bArr, i12);
        this.f50603o = iJ;
        int i13 = i12 + 2;
        if (iJ != 0) {
            int iH = h(bArr, i13);
            if (iH != this.f50603o && Ug.e.f22464b >= 5) {
                f50590z.println("byteCount=" + this.f50603o + " but readBytesWireFormat returned " + iH);
            }
            i13 += this.f50603o;
        }
        int i14 = i13 - i10;
        this.f50594f = i14;
        return i14;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC6278l) && ((AbstractC6278l) obj).f50601m == this.f50601m;
    }

    int f(byte[] bArr, int i10) {
        this.f50593e = i10;
        int iW = w(bArr, i10) + i10;
        int i11 = iW + 1;
        int iA = A(bArr, i11);
        this.f50602n = iA;
        bArr[iW] = (byte) ((iA / 2) & 255);
        int i12 = i11 + iA;
        this.f50602n = iA / 2;
        int iV = v(bArr, i12 + 2);
        this.f50603o = iV;
        bArr[i12] = (byte) (iV & 255);
        bArr[i12 + 1] = (byte) ((iV >> 8) & 255);
        int i13 = ((i12 + 2) + iV) - i10;
        this.f50594f = i13;
        C6279m c6279m = this.f50612x;
        if (c6279m != null) {
            c6279m.b(bArr, this.f50593e, i13, this, this.f50613y);
        }
        return this.f50594f;
    }

    boolean g() {
        return (this.f50592d & 128) == 128;
    }

    abstract int h(byte[] bArr, int i10);

    public int hashCode() {
        return this.f50601m;
    }

    int i(byte[] bArr, int i10) {
        this.f50591c = bArr[i10 + 4];
        this.f50596h = k(bArr, i10 + 5);
        this.f50592d = bArr[i10 + 9];
        this.f50597i = j(bArr, i10 + 10);
        this.f50598j = j(bArr, i10 + 24);
        this.f50599k = j(bArr, i10 + 26);
        this.f50600l = j(bArr, i10 + 28);
        this.f50601m = j(bArr, i10 + 30);
        return 32;
    }

    abstract int m(byte[] bArr, int i10);

    String n(byte[] bArr, int i10) {
        return p(bArr, i10, PSKKeyManager.MAX_KEY_LENGTH_BYTES, this.f50604p);
    }

    String o(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        int i13 = 0;
        try {
            if (!z10) {
                while (i10 < i11 && bArr[i10 + i13] != 0) {
                    if (i13 > i12) {
                        if (Ug.e.f22464b > 0) {
                            Ug.d.a(System.err, bArr, i10, i12 < 128 ? i12 + 8 : 128);
                        }
                        throw new RuntimeException("zero termination not found");
                    }
                    i13++;
                }
                return new String(bArr, i10, i13, L.f50363M0);
            }
            if ((i10 - this.f50593e) % 2 != 0) {
                i10++;
            }
            while (true) {
                int i14 = i10 + i13;
                int i15 = i14 + 1;
                if (i15 >= i11 || (bArr[i14] == 0 && bArr[i15] == 0)) {
                    break;
                }
                if (i13 > i12) {
                    if (Ug.e.f22464b > 0) {
                        Ug.d.a(System.err, bArr, i10, i12 < 128 ? i12 + 8 : 128);
                    }
                    throw new RuntimeException("zero termination not found");
                }
                i13 += 2;
            }
            return new String(bArr, i10, i13, "UTF-16LE");
        } catch (UnsupportedEncodingException e10) {
            if (Ug.e.f22464b > 1) {
                e10.printStackTrace(f50590z);
            }
            return null;
        }
    }

    String p(byte[] bArr, int i10, int i11, boolean z10) {
        int i12 = 0;
        try {
            if (!z10) {
                while (bArr[i10 + i12] != 0) {
                    i12++;
                    if (i12 > i11) {
                        if (Ug.e.f22464b > 0) {
                            Ug.d.a(System.err, bArr, i10, i11 < 128 ? i11 + 8 : 128);
                        }
                        throw new RuntimeException("zero termination not found");
                    }
                }
                return new String(bArr, i10, i12, L.f50363M0);
            }
            if ((i10 - this.f50593e) % 2 != 0) {
                i10++;
            }
            do {
                int i13 = i10 + i12;
                if (bArr[i13] == 0 && bArr[i13 + 1] == 0) {
                    return new String(bArr, i10, i12, "UTF-16LE");
                }
                i12 += 2;
            } while (i12 <= i11);
            if (Ug.e.f22464b > 0) {
                Ug.d.a(System.err, bArr, i10, i11 < 128 ? i11 + 8 : 128);
            }
            throw new RuntimeException("zero termination not found");
        } catch (UnsupportedEncodingException e10) {
            if (Ug.e.f22464b > 1) {
                e10.printStackTrace(f50590z);
            }
            return null;
        }
    }

    int q(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (bArr[i10 + i12] != 0) {
            int i13 = i12 + 1;
            if (i12 > i11) {
                throw new RuntimeException("zero termination not found: " + this);
            }
            i12 = i13;
        }
        return i12;
    }

    void t() {
        this.f50592d = (byte) 24;
        this.f50597i = 0;
        this.f50596h = 0;
        this.f50605q = false;
        this.f50612x = null;
    }

    public String toString() {
        String str;
        byte b10 = this.f50591c;
        if (b10 == 0) {
            str = "SMB_COM_CREATE_DIRECTORY";
        } else if (b10 == 1) {
            str = "SMB_COM_DELETE_DIRECTORY";
        } else if (b10 == 4) {
            str = "SMB_COM_CLOSE";
        } else if (b10 == 16) {
            str = "SMB_COM_CHECK_DIRECTORY";
        } else if (b10 == 50) {
            str = "SMB_COM_TRANSACTION2";
        } else if (b10 == 52) {
            str = "SMB_COM_FIND_CLOSE2";
        } else if (b10 == 6) {
            str = "SMB_COM_DELETE";
        } else if (b10 == 7) {
            str = "SMB_COM_RENAME";
        } else if (b10 == 8) {
            str = "SMB_COM_QUERY_INFORMATION";
        } else if (b10 == 37) {
            str = "SMB_COM_TRANSACTION";
        } else if (b10 == 38) {
            str = "SMB_COM_TRANSACTION_SECONDARY";
        } else if (b10 == 42) {
            str = "SMB_COM_MOVE";
        } else if (b10 != 43) {
            switch (b10) {
                case PDU.GET /* -96 */:
                    str = "SMB_COM_NT_TRANSACT";
                    break;
                case PDU.GETNEXT /* -95 */:
                    str = "SMB_COM_NT_TRANSACT_SECONDARY";
                    break;
                case PDU.RESPONSE /* -94 */:
                    str = "SMB_COM_NT_CREATE_ANDX";
                    break;
                default:
                    switch (b10) {
                        case 45:
                            str = "SMB_COM_OPEN_ANDX";
                            break;
                        case 46:
                            str = "SMB_COM_READ_ANDX";
                            break;
                        case 47:
                            str = "SMB_COM_WRITE_ANDX";
                            break;
                        default:
                            switch (b10) {
                                case 113:
                                    str = "SMB_COM_TREE_DISCONNECT";
                                    break;
                                case 114:
                                    str = "SMB_COM_NEGOTIATE";
                                    break;
                                case 115:
                                    str = "SMB_COM_SESSION_SETUP_ANDX";
                                    break;
                                case 116:
                                    str = "SMB_COM_LOGOFF_ANDX";
                                    break;
                                case 117:
                                    str = "SMB_COM_TREE_CONNECT_ANDX";
                                    break;
                                default:
                                    str = "UNKNOWN";
                                    break;
                            }
                    }
            }
        } else {
            str = "SMB_COM_ECHO";
        }
        int i10 = this.f50596h;
        return new String("command=" + str + ",received=" + this.f50605q + ",errorCode=" + (i10 == 0 ? "0" : SmbException.a(i10)) + ",flags=0x" + Ug.d.c(this.f50592d & 255, 4) + ",flags2=0x" + Ug.d.c(this.f50597i, 4) + ",signSeq=" + this.f50608t + ",tid=" + this.f50598j + ",pid=" + this.f50599k + ",uid=" + this.f50600l + ",mid=" + this.f50601m + ",wordCount=" + this.f50602n + ",byteCount=" + this.f50603o);
    }

    int u(String str, int i10) {
        int length = str.length() + 1;
        if (!this.f50604p) {
            return length;
        }
        int length2 = str.length() * 2;
        return i10 % 2 != 0 ? length2 + 3 : length2 + 2;
    }

    abstract int v(byte[] bArr, int i10);

    int w(byte[] bArr, int i10) {
        byte[] bArr2 = f50589A;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        bArr[i10 + 4] = this.f50591c;
        bArr[i10 + 9] = this.f50592d;
        x(this.f50597i, bArr, i10 + 10);
        x(this.f50598j, bArr, i10 + 24);
        x(this.f50599k, bArr, i10 + 26);
        x(this.f50600l, bArr, i10 + 28);
        x(this.f50601m, bArr, i10 + 30);
        return 32;
    }
}
