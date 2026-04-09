package Af;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final List f728a;

    public r(List items) {
        AbstractC6492s.i(items, "items");
        this.f728a = items;
    }

    public final List a() {
        return this.f728a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC6492s.d(this.f728a, ((r) obj).f728a);
    }

    public int hashCode() {
        return this.f728a.hashCode();
    }

    public String toString() {
        return "Model(items=" + this.f728a + ")";
    }
}
