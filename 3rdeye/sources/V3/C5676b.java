package v3;

/* compiled from: AutoValue_ProductData.java */
/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5676b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f47038a;

    public C5676b(Integer num) {
        this.f47038a = num;
    }

    @Override // v3.f
    public final Integer a() {
        return this.f47038a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.f47038a;
        Integer numA = ((f) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    public final int hashCode() {
        Integer num = this.f47038a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f47038a + "}";
    }
}
