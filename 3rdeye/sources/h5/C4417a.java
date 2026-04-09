package h5;

import N7.C1094a9;

/* compiled from: AutoValue_InstallationTokenResult.java */
/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4417a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final String f38243a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38244b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38245c;

    public C4417a(String str, long j4, long j10) {
        this.f38243a = str;
        this.f38244b = j4;
        this.f38245c = j10;
    }

    @Override // h5.g
    public final String a() {
        return this.f38243a;
    }

    @Override // h5.g
    public final long b() {
        return this.f38245c;
    }

    @Override // h5.g
    public final long c() {
        return this.f38244b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f38243a.equals(gVar.a()) && this.f38244b == gVar.c() && this.f38245c == gVar.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f38243a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f38244b;
        long j10 = this.f38245c;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f38243a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f38244b);
        sb.append(", tokenCreationTimestamp=");
        return C1094a9.f(sb, this.f38245c, "}");
    }
}
