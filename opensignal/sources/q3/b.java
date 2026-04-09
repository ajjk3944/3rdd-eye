package q3;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f20681a;

    /* renamed from: b, reason: collision with root package name */
    public String f20682b;

    /* renamed from: c, reason: collision with root package name */
    public List f20683c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f20681a, bVar.f20681a) && Objects.equals(this.f20682b, bVar.f20682b) && Objects.equals(this.f20683c, bVar.f20683c);
    }

    public final int hashCode() {
        return Objects.hash(this.f20681a, this.f20682b, this.f20683c);
    }
}
