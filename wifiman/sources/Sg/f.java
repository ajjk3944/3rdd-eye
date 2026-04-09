package Sg;

import java.net.InetAddress;
import org.snmp4j.asn1.BER;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    int f20642a;

    /* renamed from: b, reason: collision with root package name */
    g[] f20643b;

    /* renamed from: c, reason: collision with root package name */
    int f20644c;

    /* renamed from: d, reason: collision with root package name */
    int f20645d;

    /* renamed from: e, reason: collision with root package name */
    int f20646e;

    /* renamed from: g, reason: collision with root package name */
    int f20648g;

    /* renamed from: h, reason: collision with root package name */
    int f20649h;

    /* renamed from: i, reason: collision with root package name */
    int f20650i;

    /* renamed from: j, reason: collision with root package name */
    boolean f20651j;

    /* renamed from: k, reason: collision with root package name */
    boolean f20652k;

    /* renamed from: l, reason: collision with root package name */
    boolean f20653l;

    /* renamed from: m, reason: collision with root package name */
    boolean f20654m;

    /* renamed from: o, reason: collision with root package name */
    boolean f20656o;

    /* renamed from: q, reason: collision with root package name */
    b f20658q;

    /* renamed from: r, reason: collision with root package name */
    b f20659r;

    /* renamed from: s, reason: collision with root package name */
    int f20660s;

    /* renamed from: u, reason: collision with root package name */
    int f20662u;

    /* renamed from: v, reason: collision with root package name */
    int f20663v;

    /* renamed from: w, reason: collision with root package name */
    int f20664w;

    /* renamed from: x, reason: collision with root package name */
    int f20665x;

    /* renamed from: y, reason: collision with root package name */
    InetAddress f20666y;

    /* renamed from: n, reason: collision with root package name */
    boolean f20655n = true;

    /* renamed from: p, reason: collision with root package name */
    boolean f20657p = true;

    /* renamed from: f, reason: collision with root package name */
    int f20647f = 1;

    /* renamed from: t, reason: collision with root package name */
    int f20661t = 1;

    f() {
    }

    static int c(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
    }

    static int d(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    static int e(byte[] bArr, int i10) {
        return c(bArr, i10);
    }

    static void l(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
    }

    abstract int a(byte[] bArr, int i10);

    int b(byte[] bArr, int i10) {
        this.f20644c = c(bArr, i10);
        byte b10 = bArr[i10 + 2];
        this.f20652k = (b10 & 128) != 0;
        this.f20645d = (b10 & 120) >> 3;
        this.f20653l = (b10 & 4) != 0;
        this.f20654m = (b10 & 2) != 0;
        this.f20655n = (b10 & 1) != 0;
        byte b11 = bArr[i10 + 3];
        this.f20656o = (b11 & 128) != 0;
        this.f20657p = (b11 & BER.ASN_SEQUENCE) != 0;
        this.f20646e = b11 & 15;
        this.f20647f = c(bArr, i10 + 4);
        this.f20648g = c(bArr, i10 + 6);
        this.f20649h = c(bArr, i10 + 8);
        this.f20650i = c(bArr, i10 + 10);
        return 12;
    }

    int f(byte[] bArr, int i10) {
        int iB = this.f20658q.b(bArr, i10) + i10;
        this.f20660s = c(bArr, iB);
        this.f20661t = c(bArr, iB + 2);
        return (iB + 4) - i10;
    }

    abstract int g(byte[] bArr, int i10);

    int h(byte[] bArr, int i10) {
        int iB;
        if ((bArr[i10] & BER.ASN_PRIVATE) == 192) {
            this.f20659r = this.f20658q;
            iB = i10 + 2;
        } else {
            iB = this.f20659r.b(bArr, i10) + i10;
        }
        this.f20662u = c(bArr, iB);
        this.f20663v = c(bArr, iB + 2);
        this.f20664w = d(bArr, iB + 4);
        int iC = c(bArr, iB + 8);
        this.f20665x = iC;
        int iG = iB + 10;
        this.f20643b = new g[iC / 6];
        int i11 = iC + iG;
        int i12 = 0;
        while (true) {
            this.f20642a = i12;
            if (iG >= i11) {
                return iG - i10;
            }
            iG += g(bArr, iG);
            i12 = this.f20642a + 1;
        }
    }

    int i(byte[] bArr, int i10) {
        int iB = b(bArr, i10) + i10;
        return (iB + a(bArr, iB)) - i10;
    }

    abstract int j(byte[] bArr, int i10);

    int k(byte[] bArr, int i10) {
        l(this.f20644c, bArr, i10);
        bArr[i10 + 2] = (byte) ((this.f20652k ? 128 : 0) + ((this.f20645d << 3) & 120) + (this.f20653l ? 4 : 0) + (this.f20654m ? 2 : 0) + (this.f20655n ? 1 : 0));
        bArr[i10 + 3] = (byte) ((this.f20656o ? 128 : 0) + (this.f20657p ? 16 : 0) + (this.f20646e & 15));
        l(this.f20647f, bArr, i10 + 4);
        l(this.f20648g, bArr, i10 + 6);
        l(this.f20649h, bArr, i10 + 8);
        l(this.f20650i, bArr, i10 + 10);
        return 12;
    }

    int m(byte[] bArr, int i10) {
        int iD = this.f20658q.d(bArr, i10) + i10;
        l(this.f20660s, bArr, iD);
        l(this.f20661t, bArr, iD + 2);
        return (iD + 4) - i10;
    }

    int n(byte[] bArr, int i10) {
        int iK = k(bArr, i10) + i10;
        return (iK + j(bArr, iK)) - i10;
    }

    public String toString() {
        String str;
        String str2;
        int i10 = this.f20645d;
        String string = i10 != 0 ? i10 != 7 ? Integer.toString(i10) : "WACK" : "QUERY";
        int i11 = this.f20646e;
        if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            Ug.d.c(this.f20646e, 1);
        }
        int i12 = this.f20660s;
        String str3 = "NB";
        if (i12 == 32) {
            str = "NB";
        } else if (i12 != 33) {
            str = "0x" + Ug.d.c(this.f20660s, 4);
        } else {
            str = "NBSTAT";
        }
        int i13 = this.f20662u;
        if (i13 == 1) {
            str3 = SnmpConfigurator.O_AUTH_PASSPHRASE;
        } else if (i13 == 2) {
            str3 = "NS";
        } else if (i13 == 10) {
            str3 = "NULL";
        } else if (i13 != 32) {
            if (i13 != 33) {
                str3 = "0x" + Ug.d.c(this.f20662u, 4);
            } else {
                str3 = "NBSTAT";
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nameTrnId=");
        sb2.append(this.f20644c);
        sb2.append(",isResponse=");
        sb2.append(this.f20652k);
        sb2.append(",opCode=");
        sb2.append(string);
        sb2.append(",isAuthAnswer=");
        sb2.append(this.f20653l);
        sb2.append(",isTruncated=");
        sb2.append(this.f20654m);
        sb2.append(",isRecurAvailable=");
        sb2.append(this.f20656o);
        sb2.append(",isRecurDesired=");
        sb2.append(this.f20655n);
        sb2.append(",isBroadcast=");
        sb2.append(this.f20657p);
        sb2.append(",resultCode=");
        sb2.append(this.f20646e);
        sb2.append(",questionCount=");
        sb2.append(this.f20647f);
        sb2.append(",answerCount=");
        sb2.append(this.f20648g);
        sb2.append(",authorityCount=");
        sb2.append(this.f20649h);
        sb2.append(",additionalCount=");
        sb2.append(this.f20650i);
        sb2.append(",questionName=");
        sb2.append(this.f20658q);
        sb2.append(",questionType=");
        sb2.append(str);
        sb2.append(",questionClass=");
        String str4 = "IN";
        if (this.f20661t == 1) {
            str2 = "IN";
        } else {
            str2 = "0x" + Ug.d.c(this.f20661t, 4);
        }
        sb2.append(str2);
        sb2.append(",recordName=");
        sb2.append(this.f20659r);
        sb2.append(",recordType=");
        sb2.append(str3);
        sb2.append(",recordClass=");
        if (this.f20663v != 1) {
            str4 = "0x" + Ug.d.c(this.f20663v, 4);
        }
        sb2.append(str4);
        sb2.append(",ttl=");
        sb2.append(this.f20664w);
        sb2.append(",rDataLength=");
        sb2.append(this.f20665x);
        return new String(sb2.toString());
    }
}
