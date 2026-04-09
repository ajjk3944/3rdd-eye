package Af;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final S8.c f640a;

    /* renamed from: b, reason: collision with root package name */
    private final List f641b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f642c;

    public B(S8.c cVar, List supported, Map map) {
        AbstractC6492s.i(supported, "supported");
        this.f640a = cVar;
        this.f641b = supported;
        this.f642c = map;
    }

    public final Map a() {
        return this.f642c;
    }

    public final S8.c b() {
        return this.f640a;
    }

    public final List c() {
        return this.f641b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        return this.f640a == b10.f640a && AbstractC6492s.d(this.f641b, b10.f641b) && AbstractC6492s.d(this.f642c, b10.f642c);
    }

    public int hashCode() {
        S8.c cVar = this.f640a;
        int iHashCode = (((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f641b.hashCode()) * 31;
        Map map = this.f642c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "Model(selected=" + this.f640a + ", supported=" + this.f641b + ", apCount=" + this.f642c + ")";
    }

    public /* synthetic */ B(S8.c cVar, List list, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, list, (i10 & 4) != 0 ? null : map);
    }
}
