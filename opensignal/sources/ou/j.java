package ou;

import java.util.ArrayList;
import java.util.Set;
import lf.t1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f19921c = new j(mq.o.U0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f19922a;

    /* renamed from: b, reason: collision with root package name */
    public final t1 f19923b;

    public j(Set set, t1 t1Var) {
        this.f19922a = set;
        this.f19923b = t1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return br.l.a(jVar.f19922a, this.f19922a) && br.l.a(jVar.f19923b, this.f19923b);
    }

    public final int hashCode() {
        int iHashCode = (this.f19922a.hashCode() + 1517) * 41;
        t1 t1Var = this.f19923b;
        return iHashCode + (t1Var != null ? t1Var.hashCode() : 0);
    }
}
