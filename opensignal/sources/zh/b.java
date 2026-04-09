package zh;

import java.util.Objects;
import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f27409a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f27410b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f27411c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f27412d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27409a == bVar.f27409a && Objects.equals(this.f27411c, bVar.f27411c) && Objects.equals(this.f27412d, bVar.f27412d)) {
            return Objects.equals(this.f27410b, bVar.f27410b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f27409a * 961;
        Integer num = this.f27410b;
        int iHashCode = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f27411c;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f27412d;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InternalServiceState{state=");
        sb2.append(this.f27409a);
        sb2.append(", nrStatus=null, nrBearer=");
        sb2.append(this.f27410b);
        sb2.append(", nrState=");
        sb2.append(this.f27411c);
        sb2.append(", nrFrequencyRange=");
        return g.i(sb2, this.f27412d, '}');
    }
}
