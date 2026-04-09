package Q4;

import N7.C1094a9;
import N7.G8;
import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes2.dex */
public final class B extends f0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10975d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10976e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10977f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10978g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10979h;
    public final List<f0.a.AbstractC0135a> i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    public static final class a extends f0.a.b {

        /* renamed from: a, reason: collision with root package name */
        public int f10980a;

        /* renamed from: b, reason: collision with root package name */
        public String f10981b;

        /* renamed from: c, reason: collision with root package name */
        public int f10982c;

        /* renamed from: d, reason: collision with root package name */
        public int f10983d;

        /* renamed from: e, reason: collision with root package name */
        public long f10984e;

        /* renamed from: f, reason: collision with root package name */
        public long f10985f;

        /* renamed from: g, reason: collision with root package name */
        public long f10986g;

        /* renamed from: h, reason: collision with root package name */
        public String f10987h;
        public List<f0.a.AbstractC0135a> i;

        /* renamed from: j, reason: collision with root package name */
        public byte f10988j;

        public final B a() {
            String str;
            if (this.f10988j == 63 && (str = this.f10981b) != null) {
                return new B(this.f10980a, str, this.f10982c, this.f10983d, this.f10984e, this.f10985f, this.f10986g, this.f10987h, this.i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f10988j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f10981b == null) {
                sb.append(" processName");
            }
            if ((this.f10988j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f10988j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f10988j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f10988j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f10988j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public B() {
        throw null;
    }

    public B(int i, String str, int i10, int i11, long j4, long j10, long j11, String str2, List list) {
        this.f10972a = i;
        this.f10973b = str;
        this.f10974c = i10;
        this.f10975d = i11;
        this.f10976e = j4;
        this.f10977f = j10;
        this.f10978g = j11;
        this.f10979h = str2;
        this.i = list;
    }

    @Override // Q4.f0.a
    public final List<f0.a.AbstractC0135a> a() {
        return this.i;
    }

    @Override // Q4.f0.a
    public final int b() {
        return this.f10975d;
    }

    @Override // Q4.f0.a
    public final int c() {
        return this.f10972a;
    }

    @Override // Q4.f0.a
    public final String d() {
        return this.f10973b;
    }

    @Override // Q4.f0.a
    public final long e() {
        return this.f10976e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f10972a != aVar.c() || !this.f10973b.equals(aVar.d()) || this.f10974c != aVar.f() || this.f10975d != aVar.b() || this.f10976e != aVar.e() || this.f10977f != aVar.g() || this.f10978g != aVar.h()) {
            return false;
        }
        String str = this.f10979h;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        List<f0.a.AbstractC0135a> list = this.i;
        return list == null ? aVar.a() == null : list.equals(aVar.a());
    }

    @Override // Q4.f0.a
    public final int f() {
        return this.f10974c;
    }

    @Override // Q4.f0.a
    public final long g() {
        return this.f10977f;
    }

    @Override // Q4.f0.a
    public final long h() {
        return this.f10978g;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f10972a ^ 1000003) * 1000003) ^ this.f10973b.hashCode()) * 1000003) ^ this.f10974c) * 1000003) ^ this.f10975d) * 1000003;
        long j4 = this.f10976e;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f10977f;
        int i10 = (i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f10978g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f10979h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.AbstractC0135a> list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // Q4.f0.a
    public final String i() {
        return this.f10979h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.f10972a);
        sb.append(", processName=");
        sb.append(this.f10973b);
        sb.append(", reasonCode=");
        sb.append(this.f10974c);
        sb.append(", importance=");
        sb.append(this.f10975d);
        sb.append(", pss=");
        sb.append(this.f10976e);
        sb.append(", rss=");
        sb.append(this.f10977f);
        sb.append(", timestamp=");
        sb.append(this.f10978g);
        sb.append(", traceFile=");
        sb.append(this.f10979h);
        sb.append(", buildIdMappingForArch=");
        return C1094a9.h(sb, this.i, "}");
    }
}
