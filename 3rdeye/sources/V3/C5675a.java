package v3;

/* compiled from: AutoValue_Event.java */
/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5675a<T> extends AbstractC5678d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f47035a;

    /* renamed from: b, reason: collision with root package name */
    public final e f47036b;

    /* renamed from: c, reason: collision with root package name */
    public final C5676b f47037c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5675a(Object obj, e eVar, C5676b c5676b) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f47035a = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f47036b = eVar;
        this.f47037c = c5676b;
    }

    @Override // v3.AbstractC5678d
    public final Integer a() {
        return null;
    }

    @Override // v3.AbstractC5678d
    public final T b() {
        return this.f47035a;
    }

    @Override // v3.AbstractC5678d
    public final e c() {
        return this.f47036b;
    }

    @Override // v3.AbstractC5678d
    public final f d() {
        return this.f47037c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5678d)) {
            return false;
        }
        AbstractC5678d abstractC5678d = (AbstractC5678d) obj;
        if (abstractC5678d.a() != null) {
            return false;
        }
        if (!this.f47035a.equals(abstractC5678d.b()) || !this.f47036b.equals(abstractC5678d.c())) {
            return false;
        }
        C5676b c5676b = this.f47037c;
        return c5676b == null ? abstractC5678d.d() == null : c5676b.equals(abstractC5678d.d());
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f47035a.hashCode()) * 1000003) ^ this.f47036b.hashCode()) * 1000003;
        C5676b c5676b = this.f47037c;
        return (iHashCode ^ (c5676b == null ? 0 : c5676b.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f47035a + ", priority=" + this.f47036b + ", productData=" + this.f47037c + ", eventContext=null}";
    }
}
