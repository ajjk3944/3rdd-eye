package U9;

import U9.C3621h;
import com.ui.core.ui.sso.UiSSO;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class k implements C3621h.a {

    /* renamed from: a, reason: collision with root package name */
    private final UiSSO.a f22214a;

    public k(UiSSO.a authResponse) {
        AbstractC6492s.i(authResponse, "authResponse");
        this.f22214a = authResponse;
    }

    public final UiSSO.a a() {
        return this.f22214a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && AbstractC6492s.d(this.f22214a, ((k) obj).f22214a);
    }

    public int hashCode() {
        return this.f22214a.hashCode();
    }

    public String toString() {
        return "StartFlow(authResponse=" + this.f22214a + ")";
    }
}
