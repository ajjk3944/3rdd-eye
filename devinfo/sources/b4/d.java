package b4;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f1670a;

    /* renamed from: b, reason: collision with root package name */
    public String f1671b;

    /* renamed from: c, reason: collision with root package name */
    public List f1672c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f1670a, dVar.f1670a) && Objects.equals(this.f1671b, dVar.f1671b) && Objects.equals(this.f1672c, dVar.f1672c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1670a, this.f1671b, this.f1672c);
    }
}
