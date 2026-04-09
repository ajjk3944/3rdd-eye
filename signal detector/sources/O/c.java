package O;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f3034a;

    /* renamed from: b, reason: collision with root package name */
    public String f3035b;

    /* renamed from: c, reason: collision with root package name */
    public List f3036c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f3034a, cVar.f3034a) && Objects.equals(this.f3035b, cVar.f3035b) && Objects.equals(this.f3036c, cVar.f3036c);
    }

    public final int hashCode() {
        return Objects.hash(this.f3034a, this.f3035b, this.f3036c);
    }
}
