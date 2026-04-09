package df;

import b8.AbstractC4074a;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: df.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5367a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4074a f46062a;

    public C5367a(AbstractC4074a availability) {
        AbstractC6492s.i(availability, "availability");
        this.f46062a = availability;
    }

    public final AbstractC4074a a() {
        return this.f46062a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5367a) && AbstractC6492s.d(this.f46062a, ((C5367a) obj).f46062a);
    }

    public int hashCode() {
        return this.f46062a.hashCode();
    }

    public String toString() {
        return "InternetState(availability=" + this.f46062a + ")";
    }
}
