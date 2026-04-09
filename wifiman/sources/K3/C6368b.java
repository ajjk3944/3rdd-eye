package k3;

import c3.AbstractC4208i;
import c3.AbstractC4215p;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6368b extends AbstractC6377k {

    /* renamed from: a, reason: collision with root package name */
    private final long f51168a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4215p f51169b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4208i f51170c;

    C6368b(long j10, AbstractC4215p abstractC4215p, AbstractC4208i abstractC4208i) {
        this.f51168a = j10;
        if (abstractC4215p == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f51169b = abstractC4215p;
        if (abstractC4208i == null) {
            throw new NullPointerException("Null event");
        }
        this.f51170c = abstractC4208i;
    }

    @Override // k3.AbstractC6377k
    public AbstractC4208i b() {
        return this.f51170c;
    }

    @Override // k3.AbstractC6377k
    public long c() {
        return this.f51168a;
    }

    @Override // k3.AbstractC6377k
    public AbstractC4215p d() {
        return this.f51169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6377k)) {
            return false;
        }
        AbstractC6377k abstractC6377k = (AbstractC6377k) obj;
        return this.f51168a == abstractC6377k.c() && this.f51169b.equals(abstractC6377k.d()) && this.f51170c.equals(abstractC6377k.b());
    }

    public int hashCode() {
        long j10 = this.f51168a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f51169b.hashCode()) * 1000003) ^ this.f51170c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f51168a + ", transportContext=" + this.f51169b + ", event=" + this.f51170c + "}";
    }
}
