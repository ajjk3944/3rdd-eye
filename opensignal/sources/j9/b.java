package j9;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13428a;

    public b(Integer num) {
        this.f13428a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        Integer num = ((b) obj).f13428a;
        Integer num2 = this.f13428a;
        return num2 == null ? num == null : num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.f13428a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f13428a + "}";
    }
}
