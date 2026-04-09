package af;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: af.I, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3800I {

    /* renamed from: a, reason: collision with root package name */
    private final List f26005a;

    public C3800I(List warnings) {
        AbstractC6492s.i(warnings, "warnings");
        this.f26005a = warnings;
    }

    public final List a() {
        return this.f26005a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3800I) && AbstractC6492s.d(this.f26005a, ((C3800I) obj).f26005a);
    }

    public int hashCode() {
        return this.f26005a.hashCode();
    }

    public String toString() {
        return "Model(warnings=" + this.f26005a + ")";
    }
}
