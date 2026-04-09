package com.google.firebase.installations;

import com.google.firebase.installations.f;

/* loaded from: classes3.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f38875a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38876b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38877c;

    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private String f38878a;

        /* renamed from: b, reason: collision with root package name */
        private Long f38879b;

        /* renamed from: c, reason: collision with root package name */
        private Long f38880c;

        b() {
        }

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.f38878a == null) {
                str = " token";
            }
            if (this.f38879b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f38880c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f38878a, this.f38879b.longValue(), this.f38880c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f38878a = str;
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j10) {
            this.f38880c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j10) {
            this.f38879b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    public String b() {
        return this.f38875a;
    }

    @Override // com.google.firebase.installations.f
    public long c() {
        return this.f38877c;
    }

    @Override // com.google.firebase.installations.f
    public long d() {
        return this.f38876b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f38875a.equals(fVar.b()) && this.f38876b == fVar.d() && this.f38877c == fVar.c();
    }

    public int hashCode() {
        int iHashCode = (this.f38875a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f38876b;
        long j11 = this.f38877c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f38875a + ", tokenExpirationTimestamp=" + this.f38876b + ", tokenCreationTimestamp=" + this.f38877c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f38875a = str;
        this.f38876b = j10;
        this.f38877c = j11;
    }
}
