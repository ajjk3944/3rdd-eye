package w3;

import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;
import w3.h;

/* loaded from: classes2.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final long f24805a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f24806b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24807c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f24808d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24809e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24810f;

    /* renamed from: g, reason: collision with root package name */
    public final NetworkConnectionInfo f24811g;

    public static final class b extends h.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f24812a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f24813b;

        /* renamed from: c, reason: collision with root package name */
        public Long f24814c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f24815d;

        /* renamed from: e, reason: collision with root package name */
        public String f24816e;

        /* renamed from: f, reason: collision with root package name */
        public Long f24817f;

        /* renamed from: g, reason: collision with root package name */
        public NetworkConnectionInfo f24818g;

        @Override // w3.h.a
        public h a() {
            String str = "";
            if (this.f24812a == null) {
                str = " eventTimeMs";
            }
            if (this.f24814c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f24817f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new d(this.f24812a.longValue(), this.f24813b, this.f24814c.longValue(), this.f24815d, this.f24816e, this.f24817f.longValue(), this.f24818g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w3.h.a
        public h.a b(Integer num) {
            this.f24813b = num;
            return this;
        }

        @Override // w3.h.a
        public h.a c(long j10) {
            this.f24812a = Long.valueOf(j10);
            return this;
        }

        @Override // w3.h.a
        public h.a d(long j10) {
            this.f24814c = Long.valueOf(j10);
            return this;
        }

        @Override // w3.h.a
        public h.a e(NetworkConnectionInfo networkConnectionInfo) {
            this.f24818g = networkConnectionInfo;
            return this;
        }

        @Override // w3.h.a
        public h.a f(byte[] bArr) {
            this.f24815d = bArr;
            return this;
        }

        @Override // w3.h.a
        public h.a g(String str) {
            this.f24816e = str;
            return this;
        }

        @Override // w3.h.a
        public h.a h(long j10) {
            this.f24817f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // w3.h
    public Integer b() {
        return this.f24806b;
    }

    @Override // w3.h
    public long c() {
        return this.f24805a;
    }

    @Override // w3.h
    public long d() {
        return this.f24807c;
    }

    @Override // w3.h
    public NetworkConnectionInfo e() {
        return this.f24811g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        NetworkConnectionInfo networkConnectionInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f24805a == hVar.c() && ((num = this.f24806b) != null ? num.equals(hVar.b()) : hVar.b() == null) && this.f24807c == hVar.d()) {
                if (Arrays.equals(this.f24808d, hVar instanceof d ? ((d) hVar).f24808d : hVar.f()) && ((str = this.f24809e) != null ? str.equals(hVar.g()) : hVar.g() == null) && this.f24810f == hVar.h() && ((networkConnectionInfo = this.f24811g) != null ? networkConnectionInfo.equals(hVar.e()) : hVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w3.h
    public byte[] f() {
        return this.f24808d;
    }

    @Override // w3.h
    public String g() {
        return this.f24809e;
    }

    @Override // w3.h
    public long h() {
        return this.f24810f;
    }

    public int hashCode() {
        long j10 = this.f24805a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f24806b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f24807c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f24808d)) * 1000003;
        String str = this.f24809e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f24810f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f24811g;
        return i11 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f24805a + ", eventCode=" + this.f24806b + ", eventUptimeMs=" + this.f24807c + ", sourceExtension=" + Arrays.toString(this.f24808d) + ", sourceExtensionJsonProto3=" + this.f24809e + ", timezoneOffsetSeconds=" + this.f24810f + ", networkConnectionInfo=" + this.f24811g + "}";
    }

    public d(long j10, Integer num, long j11, byte[] bArr, String str, long j12, NetworkConnectionInfo networkConnectionInfo) {
        this.f24805a = j10;
        this.f24806b = num;
        this.f24807c = j11;
        this.f24808d = bArr;
        this.f24809e = str;
        this.f24810f = j12;
        this.f24811g = networkConnectionInfo;
    }
}
