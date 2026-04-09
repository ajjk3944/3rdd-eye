package y3;

import N7.G8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import y3.m;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f48052a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f48053b;

    /* renamed from: c, reason: collision with root package name */
    public final l f48054c;

    /* renamed from: d, reason: collision with root package name */
    public final long f48055d;

    /* renamed from: e, reason: collision with root package name */
    public final long f48056e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f48057f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f48058g;

    /* renamed from: h, reason: collision with root package name */
    public final String f48059h;
    public final byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f48060j;

    /* compiled from: AutoValue_EventInternal.java */
    public static final class a extends m.a {

        /* renamed from: a, reason: collision with root package name */
        public String f48061a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f48062b;

        /* renamed from: c, reason: collision with root package name */
        public l f48063c;

        /* renamed from: d, reason: collision with root package name */
        public Long f48064d;

        /* renamed from: e, reason: collision with root package name */
        public Long f48065e;

        /* renamed from: f, reason: collision with root package name */
        public HashMap f48066f;

        /* renamed from: g, reason: collision with root package name */
        public Integer f48067g;

        /* renamed from: h, reason: collision with root package name */
        public String f48068h;
        public byte[] i;

        /* renamed from: j, reason: collision with root package name */
        public byte[] f48069j;

        public final h b() {
            String strS = this.f48061a == null ? " transportName" : "";
            if (this.f48063c == null) {
                strS = strS.concat(" encodedPayload");
            }
            if (this.f48064d == null) {
                strS = G8.s(strS, " eventMillis");
            }
            if (this.f48065e == null) {
                strS = G8.s(strS, " uptimeMillis");
            }
            if (this.f48066f == null) {
                strS = G8.s(strS, " autoMetadata");
            }
            if (strS.isEmpty()) {
                return new h(this.f48061a, this.f48062b, this.f48063c, this.f48064d.longValue(), this.f48065e.longValue(), this.f48066f, this.f48067g, this.f48068h, this.i, this.f48069j);
            }
            throw new IllegalStateException("Missing required properties:".concat(strS));
        }
    }

    public h() {
        throw null;
    }

    public h(String str, Integer num, l lVar, long j4, long j10, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f48052a = str;
        this.f48053b = num;
        this.f48054c = lVar;
        this.f48055d = j4;
        this.f48056e = j10;
        this.f48057f = map;
        this.f48058g = num2;
        this.f48059h = str2;
        this.i = bArr;
        this.f48060j = bArr2;
    }

    @Override // y3.m
    public final Map<String, String> b() {
        return this.f48057f;
    }

    @Override // y3.m
    public final Integer c() {
        return this.f48053b;
    }

    @Override // y3.m
    public final l d() {
        return this.f48054c;
    }

    @Override // y3.m
    public final long e() {
        return this.f48055d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f48052a.equals(mVar.k())) {
            return false;
        }
        Integer num = this.f48053b;
        if (num == null) {
            if (mVar.c() != null) {
                return false;
            }
        } else if (!num.equals(mVar.c())) {
            return false;
        }
        if (!this.f48054c.equals(mVar.d()) || this.f48055d != mVar.e() || this.f48056e != mVar.l() || !this.f48057f.equals(mVar.b())) {
            return false;
        }
        Integer num2 = this.f48058g;
        if (num2 == null) {
            if (mVar.i() != null) {
                return false;
            }
        } else if (!num2.equals(mVar.i())) {
            return false;
        }
        String str = this.f48059h;
        if (str == null) {
            if (mVar.j() != null) {
                return false;
            }
        } else if (!str.equals(mVar.j())) {
            return false;
        }
        boolean z10 = mVar instanceof h;
        if (Arrays.equals(this.i, z10 ? ((h) mVar).i : mVar.f())) {
            return Arrays.equals(this.f48060j, z10 ? ((h) mVar).f48060j : mVar.g());
        }
        return false;
    }

    @Override // y3.m
    public final byte[] f() {
        return this.i;
    }

    @Override // y3.m
    public final byte[] g() {
        return this.f48060j;
    }

    public final int hashCode() {
        int iHashCode = (this.f48052a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f48053b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f48054c.hashCode()) * 1000003;
        long j4 = this.f48055d;
        int i = (iHashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f48056e;
        int iHashCode3 = (((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f48057f.hashCode()) * 1000003;
        Integer num2 = this.f48058g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f48059h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.f48060j);
    }

    @Override // y3.m
    public final Integer i() {
        return this.f48058g;
    }

    @Override // y3.m
    public final String j() {
        return this.f48059h;
    }

    @Override // y3.m
    public final String k() {
        return this.f48052a;
    }

    @Override // y3.m
    public final long l() {
        return this.f48056e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f48052a + ", code=" + this.f48053b + ", encodedPayload=" + this.f48054c + ", eventMillis=" + this.f48055d + ", uptimeMillis=" + this.f48056e + ", autoMetadata=" + this.f48057f + ", productId=" + this.f48058g + ", pseudonymousId=" + this.f48059h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f48060j) + "}";
    }
}
