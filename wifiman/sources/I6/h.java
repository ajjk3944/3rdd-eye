package I6;

import G6.D;
import G6.Q;
import java.util.Objects;

/* loaded from: classes3.dex */
public class h implements D {

    /* renamed from: a, reason: collision with root package name */
    public final Q f8646a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f8647b;

    public h(Q q10, Q q11) {
        this.f8646a = q10;
        this.f8647b = q11;
    }

    @Override // G6.D
    public Q a() {
        return this.f8646a;
    }

    @Override // G6.D
    public Q b() {
        return this.f8647b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        return this.f8646a.equals(d10.a()) && this.f8647b.equals(d10.b());
    }

    public int hashCode() {
        return Objects.hash(this.f8647b, this.f8646a);
    }

    public String toString() {
        return "PhyPair{txPhy=" + this.f8646a + ", rxPhy=" + this.f8647b + '}';
    }
}
