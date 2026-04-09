package Ia;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final f f9009a;

    /* renamed from: b, reason: collision with root package name */
    private final List f9010b;

    public g(f state, List results) {
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(results, "results");
        this.f9009a = state;
        this.f9010b = results;
    }

    public final List a() {
        return this.f9010b;
    }

    public final f b() {
        return this.f9009a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9009a == gVar.f9009a && AbstractC6492s.d(this.f9010b, gVar.f9010b);
    }

    public int hashCode() {
        return (this.f9009a.hashCode() * 31) + this.f9010b.hashCode();
    }

    public String toString() {
        return "Status(state=" + this.f9009a + ", results=" + this.f9010b + ")";
    }
}
