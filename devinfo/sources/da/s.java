package da;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f22155a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22156b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f22157c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22158d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22159e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22160f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f22161h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f22162i;

    public s(long j, Integer num, a0 a0Var, long j8, byte[] bArr, String str, long j9, i0 i0Var, b0 b0Var) {
        this.f22155a = j;
        this.f22156b = num;
        this.f22157c = a0Var;
        this.f22158d = j8;
        this.f22159e = bArr;
        this.f22160f = str;
        this.g = j9;
        this.f22161h = i0Var;
        this.f22162i = b0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        a0 a0Var;
        String str;
        i0 i0Var;
        b0 b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            b0 b0Var2 = sVar.f22162i;
            i0 i0Var2 = sVar.f22161h;
            String str2 = sVar.f22160f;
            a0 a0Var2 = sVar.f22157c;
            Integer num2 = sVar.f22156b;
            if (this.f22155a == sVar.f22155a && ((num = this.f22156b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f22157c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f22158d == sVar.f22158d) {
                if (Arrays.equals(this.f22159e, e0Var instanceof s ? ((s) e0Var).f22159e : sVar.f22159e) && ((str = this.f22160f) != null ? str.equals(str2) : str2 == null) && this.g == sVar.g && ((i0Var = this.f22161h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f22162i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22155a;
        int i4 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f22156b;
        int iHashCode = (i4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f22157c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j8 = this.f22158d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f22159e)) * 1000003;
        String str = this.f22160f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j9 = this.g;
        int i10 = (iHashCode4 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        i0 i0Var = this.f22161h;
        int iHashCode5 = (i10 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f22162i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f22155a + ", eventCode=" + this.f22156b + ", complianceData=" + this.f22157c + ", eventUptimeMs=" + this.f22158d + ", sourceExtension=" + Arrays.toString(this.f22159e) + ", sourceExtensionJsonProto3=" + this.f22160f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.f22161h + ", experimentIds=" + this.f22162i + "}";
    }
}
