package as;

import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2259a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f2260b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2261c = mq.x.f16946a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2262d;

    public y(f0 f0Var, f0 f0Var2) {
        this.f2259a = f0Var;
        this.f2260b = f0Var2;
        kc.f.F(new x(0, this));
        f0 f0Var3 = f0.IGNORE;
        this.f2262d = f0Var == f0Var3 && f0Var2 == f0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f2259a == yVar.f2259a && this.f2260b == yVar.f2260b && br.l.a(this.f2261c, yVar.f2261c);
    }

    public final int hashCode() {
        int iHashCode = this.f2259a.hashCode() * 31;
        f0 f0Var = this.f2260b;
        return this.f2261c.hashCode() + ((iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f2259a + ", migrationLevel=" + this.f2260b + ", userDefinedLevelForSpecificAnnotation=" + this.f2261c + ')';
    }
}
