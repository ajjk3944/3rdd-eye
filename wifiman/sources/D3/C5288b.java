package d3;

import d3.AbstractC5293g;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5288b extends AbstractC5293g {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5293g.a f45733a;

    /* renamed from: b, reason: collision with root package name */
    private final long f45734b;

    C5288b(AbstractC5293g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f45733a = aVar;
        this.f45734b = j10;
    }

    @Override // d3.AbstractC5293g
    public long b() {
        return this.f45734b;
    }

    @Override // d3.AbstractC5293g
    public AbstractC5293g.a c() {
        return this.f45733a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5293g)) {
            return false;
        }
        AbstractC5293g abstractC5293g = (AbstractC5293g) obj;
        return this.f45733a.equals(abstractC5293g.c()) && this.f45734b == abstractC5293g.b();
    }

    public int hashCode() {
        int iHashCode = (this.f45733a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f45734b;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f45733a + ", nextRequestWaitMillis=" + this.f45734b + "}";
    }
}
