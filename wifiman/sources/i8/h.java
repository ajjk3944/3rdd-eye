package i8;

import i8.InterfaceC6084a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class h extends InterfaceC6084a.b.AbstractC6093k {

    /* renamed from: a, reason: collision with root package name */
    private final String f48961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String ssid) {
        super(null);
        AbstractC6492s.i(ssid, "ssid");
        this.f48961a = ssid;
    }

    public final String a() {
        return this.f48961a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && AbstractC6492s.d(this.f48961a, ((h) obj).f48961a);
    }

    public int hashCode() {
        return this.f48961a.hashCode();
    }

    public String toString() {
        return "Network(ssid=" + this.f48961a + ")";
    }
}
