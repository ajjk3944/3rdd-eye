package ak;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f617a;

    /* renamed from: b, reason: collision with root package name */
    public final int f618b;

    public m0(String[] strArr, int i10) {
        br.l.e(strArr, "names");
        this.f617a = strArr;
        this.f618b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        br.l.c(obj, "null cannot be cast to non-null type com.opensignal.sdk.domain.model.RegionRestriction");
        m0 m0Var = (m0) obj;
        return this.f618b == m0Var.f618b && Arrays.equals(this.f617a, m0Var.f617a);
    }

    public final int hashCode() {
        return (this.f618b * 31) + Arrays.hashCode(this.f617a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RegionRestriction(names=");
        sb2.append(Arrays.toString(this.f617a));
        sb2.append(", decimalPrecision=");
        return c7.a.q(sb2, this.f618b, ')');
    }
}
