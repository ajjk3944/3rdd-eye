package x3;

import java.util.Arrays;
import x3.C;

/* compiled from: AutoValue_LogEvent.java */
/* loaded from: classes.dex */
public final class s extends C {

    /* renamed from: a, reason: collision with root package name */
    public final long f47733a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f47734b;

    /* renamed from: c, reason: collision with root package name */
    public final o f47735c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47736d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f47737e;

    /* renamed from: f, reason: collision with root package name */
    public final String f47738f;

    /* renamed from: g, reason: collision with root package name */
    public final long f47739g;

    /* renamed from: h, reason: collision with root package name */
    public final v f47740h;
    public final p i;

    /* compiled from: AutoValue_LogEvent.java */
    public static final class a extends C.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f47741a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f47742b;

        /* renamed from: c, reason: collision with root package name */
        public o f47743c;

        /* renamed from: d, reason: collision with root package name */
        public Long f47744d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f47745e;

        /* renamed from: f, reason: collision with root package name */
        public String f47746f;

        /* renamed from: g, reason: collision with root package name */
        public Long f47747g;

        /* renamed from: h, reason: collision with root package name */
        public v f47748h;
        public p i;
    }

    public s(long j4, Integer num, o oVar, long j10, byte[] bArr, String str, long j11, v vVar, p pVar) {
        this.f47733a = j4;
        this.f47734b = num;
        this.f47735c = oVar;
        this.f47736d = j10;
        this.f47737e = bArr;
        this.f47738f = str;
        this.f47739g = j11;
        this.f47740h = vVar;
        this.i = pVar;
    }

    @Override // x3.C
    public final y a() {
        return this.f47735c;
    }

    @Override // x3.C
    public final Integer b() {
        return this.f47734b;
    }

    @Override // x3.C
    public final long c() {
        return this.f47733a;
    }

    @Override // x3.C
    public final long d() {
        return this.f47736d;
    }

    @Override // x3.C
    public final z e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f47733a != c10.c()) {
            return false;
        }
        Integer num = this.f47734b;
        if (num == null) {
            if (c10.b() != null) {
                return false;
            }
        } else if (!num.equals(c10.b())) {
            return false;
        }
        o oVar = this.f47735c;
        if (oVar == null) {
            if (c10.a() != null) {
                return false;
            }
        } else if (!oVar.equals(c10.a())) {
            return false;
        }
        if (this.f47736d != c10.d()) {
            return false;
        }
        if (!Arrays.equals(this.f47737e, c10 instanceof s ? ((s) c10).f47737e : c10.g())) {
            return false;
        }
        String str = this.f47738f;
        if (str == null) {
            if (c10.h() != null) {
                return false;
            }
        } else if (!str.equals(c10.h())) {
            return false;
        }
        if (this.f47739g != c10.i()) {
            return false;
        }
        v vVar = this.f47740h;
        if (vVar == null) {
            if (c10.f() != null) {
                return false;
            }
        } else if (!vVar.equals(c10.f())) {
            return false;
        }
        p pVar = this.i;
        return pVar == null ? c10.e() == null : pVar.equals(c10.e());
    }

    @Override // x3.C
    public final F f() {
        return this.f47740h;
    }

    @Override // x3.C
    public final byte[] g() {
        return this.f47737e;
    }

    @Override // x3.C
    public final String h() {
        return this.f47738f;
    }

    public final int hashCode() {
        long j4 = this.f47733a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f47734b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        o oVar = this.f47735c;
        int iHashCode2 = (iHashCode ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        long j10 = this.f47736d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f47737e)) * 1000003;
        String str = this.f47738f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f47739g;
        int i10 = (iHashCode4 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f47740h;
        int iHashCode5 = (i10 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        p pVar = this.i;
        return iHashCode5 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // x3.C
    public final long i() {
        return this.f47739g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f47733a + ", eventCode=" + this.f47734b + ", complianceData=" + this.f47735c + ", eventUptimeMs=" + this.f47736d + ", sourceExtension=" + Arrays.toString(this.f47737e) + ", sourceExtensionJsonProto3=" + this.f47738f + ", timezoneOffsetSeconds=" + this.f47739g + ", networkConnectionInfo=" + this.f47740h + ", experimentIds=" + this.i + "}";
    }
}
