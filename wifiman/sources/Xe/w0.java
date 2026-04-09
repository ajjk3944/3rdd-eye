package xe;

import kotlin.jvm.internal.AbstractC6492s;
import org.kodein.di.DI;

/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final DI f66027a;

    public w0(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f66027a = di2;
    }

    public final DI a() {
        return this.f66027a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && AbstractC6492s.d(this.f66027a, ((w0) obj).f66027a);
    }

    public int hashCode() {
        return this.f66027a.hashCode();
    }

    public String toString() {
        return "Params(di=" + this.f66027a + ")";
    }
}
