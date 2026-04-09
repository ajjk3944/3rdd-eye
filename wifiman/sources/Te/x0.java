package Te;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private final gc.c f21945a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21946b;

    public x0(gc.c cVar, List supported) {
        AbstractC6492s.i(supported, "supported");
        this.f21945a = cVar;
        this.f21946b = supported;
    }

    public final gc.c a() {
        return this.f21945a;
    }

    public final List b() {
        return this.f21946b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f21945a == x0Var.f21945a && AbstractC6492s.d(this.f21946b, x0Var.f21946b);
    }

    public int hashCode() {
        gc.c cVar = this.f21945a;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f21946b.hashCode();
    }

    public String toString() {
        return "Model(selected=" + this.f21945a + ", supported=" + this.f21946b + ")";
    }
}
