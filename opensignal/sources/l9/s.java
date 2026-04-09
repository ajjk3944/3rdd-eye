package l9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15047a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f15048b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f15049c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15050d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15051e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15052f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15053g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f15054h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f15055i;

    public s(long j, Integer num, a0 a0Var, long j7, byte[] bArr, String str, long j10, i0 i0Var, b0 b0Var) {
        this.f15047a = j;
        this.f15048b = num;
        this.f15049c = a0Var;
        this.f15050d = j7;
        this.f15051e = bArr;
        this.f15052f = str;
        this.f15053g = j10;
        this.f15054h = i0Var;
        this.f15055i = b0Var;
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
            b0 b0Var2 = sVar.f15055i;
            i0 i0Var2 = sVar.f15054h;
            String str2 = sVar.f15052f;
            a0 a0Var2 = sVar.f15049c;
            Integer num2 = sVar.f15048b;
            if (this.f15047a == sVar.f15047a && ((num = this.f15048b) != null ? num.equals(num2) : num2 == null) && ((a0Var = this.f15049c) != null ? a0Var.equals(a0Var2) : a0Var2 == null) && this.f15050d == sVar.f15050d) {
                if (Arrays.equals(this.f15051e, e0Var instanceof s ? ((s) e0Var).f15051e : sVar.f15051e) && ((str = this.f15052f) != null ? str.equals(str2) : str2 == null) && this.f15053g == sVar.f15053g && ((i0Var = this.f15054h) != null ? i0Var.equals(i0Var2) : i0Var2 == null) && ((b0Var = this.f15055i) != null ? b0Var.equals(b0Var2) : b0Var2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f15047a;
        int i10 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f15048b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        a0 a0Var = this.f15049c;
        int iHashCode2 = (iHashCode ^ (a0Var == null ? 0 : a0Var.hashCode())) * 1000003;
        long j7 = this.f15050d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f15051e)) * 1000003;
        String str = this.f15052f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f15053g;
        int i11 = (iHashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        i0 i0Var = this.f15054h;
        int iHashCode5 = (i11 ^ (i0Var == null ? 0 : i0Var.hashCode())) * 1000003;
        b0 b0Var = this.f15055i;
        return iHashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f15047a + ", eventCode=" + this.f15048b + ", complianceData=" + this.f15049c + ", eventUptimeMs=" + this.f15050d + ", sourceExtension=" + Arrays.toString(this.f15051e) + ", sourceExtensionJsonProto3=" + this.f15052f + ", timezoneOffsetSeconds=" + this.f15053g + ", networkConnectionInfo=" + this.f15054h + ", experimentIds=" + this.f15055i + "}";
    }
}
