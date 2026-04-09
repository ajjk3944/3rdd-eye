package ak;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f531a;

    /* renamed from: b, reason: collision with root package name */
    public final int f532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f533c;

    /* renamed from: d, reason: collision with root package name */
    public final int f534d;

    /* renamed from: e, reason: collision with root package name */
    public final int f535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f537g;

    /* renamed from: h, reason: collision with root package name */
    public final String f538h;

    /* renamed from: i, reason: collision with root package name */
    public final String f539i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f540l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f541m;

    public g1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f531a = i10;
        this.f532b = i11;
        this.f533c = i12;
        this.f534d = i13;
        this.f535e = i14;
        this.f536f = i15;
        this.f537g = i16;
        this.f538h = str;
        this.f539i = str2;
        this.j = num;
        this.k = num2;
        this.f540l = num3;
        this.f541m = num4;
    }

    public static g1 a(g1 g1Var, int i10, int i11, int i12) {
        int i13 = g1Var.f531a;
        int i14 = g1Var.f532b;
        int i15 = (i12 & 4) != 0 ? g1Var.f533c : i10;
        int i16 = g1Var.f534d;
        int i17 = (i12 & 16) != 0 ? g1Var.f535e : 128;
        int i18 = g1Var.f536f;
        int i19 = (i12 & 64) != 0 ? g1Var.f537g : i11;
        String str = (i12 & 128) != 0 ? g1Var.f538h : "gce_0-whatsapp-opus-24kbps";
        String str2 = (i12 & 256) != 0 ? g1Var.f539i : "aslsp.nmbdn.com";
        Integer num = g1Var.j;
        Integer num2 = g1Var.k;
        Integer num3 = g1Var.f540l;
        Integer num4 = g1Var.f541m;
        g1Var.getClass();
        return new g1(i13, i14, i15, i16, i17, i18, i19, str, str2, num, num2, num3, num4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f531a == g1Var.f531a && this.f532b == g1Var.f532b && this.f533c == g1Var.f533c && this.f534d == g1Var.f534d && this.f535e == g1Var.f535e && this.f536f == g1Var.f536f && this.f537g == g1Var.f537g && br.l.a(this.f538h, g1Var.f538h) && br.l.a(this.f539i, g1Var.f539i) && br.l.a(this.j, g1Var.j) && br.l.a(this.k, g1Var.k) && br.l.a(this.f540l, g1Var.f540l) && br.l.a(this.f541m, g1Var.f541m);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f539i, c7.a.g(this.f538h, c7.a.C(this.f537g, c7.a.C(this.f536f, c7.a.C(this.f535e, c7.a.C(this.f534d, c7.a.C(this.f533c, c7.a.C(this.f532b, Integer.hashCode(this.f531a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.j;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f540l;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f541m;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpConfigItem(echoFactor=");
        sb2.append(this.f531a);
        sb2.append(", localPort=");
        sb2.append(this.f532b);
        sb2.append(", numberPacketsToSend=");
        sb2.append(this.f533c);
        sb2.append(", packetHeaderSizeBytes=");
        sb2.append(this.f534d);
        sb2.append(", payloadLengthBytes=");
        sb2.append(this.f535e);
        sb2.append(", remotePort=");
        sb2.append(this.f536f);
        sb2.append(", targetSendRateKbps=");
        sb2.append(this.f537g);
        sb2.append(", testName=");
        sb2.append(this.f538h);
        sb2.append(", url=");
        sb2.append(this.f539i);
        sb2.append(", verificationVersion=");
        sb2.append(this.j);
        sb2.append(", verificationPacketEncryption=");
        sb2.append(this.k);
        sb2.append(", verificationPacketsToSend=");
        sb2.append(this.f540l);
        sb2.append(", verificationPacketsSpacing=");
        return w.g.i(sb2, this.f541m, ')');
    }
}
