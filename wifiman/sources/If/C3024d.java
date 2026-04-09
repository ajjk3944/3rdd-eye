package If;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: If.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3024d {

    /* renamed from: a, reason: collision with root package name */
    private final List f9165a;

    public C3024d(List list) {
        AbstractC6492s.i(list, "list");
        this.f9165a = list;
    }

    public final List a() {
        return this.f9165a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3024d) && AbstractC6492s.d(this.f9165a, ((C3024d) obj).f9165a);
    }

    public int hashCode() {
        return this.f9165a.hashCode();
    }

    public String toString() {
        return "Devices(list=" + this.f9165a + ")";
    }
}
