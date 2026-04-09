package J9;

import Zg.AbstractC3682n;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final List f9951a;

    public j(List tabs) {
        AbstractC6492s.i(tabs, "tabs");
        this.f9951a = tabs;
    }

    public final List a() {
        return this.f9951a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && AbstractC6492s.d(this.f9951a, ((j) obj).f9951a);
    }

    public int hashCode() {
        return this.f9951a.hashCode();
    }

    public String toString() {
        return "UiTabs(tabs=" + this.f9951a + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(a... tabs) {
        this(AbstractC3682n.d1(tabs));
        AbstractC6492s.i(tabs, "tabs");
    }
}
