package i8;

import h9.C5969a;
import i8.InterfaceC6084a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class g extends InterfaceC6084a.b.AbstractC6093k {

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f48960a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C5969a bssid) {
        super(null);
        AbstractC6492s.i(bssid, "bssid");
        this.f48960a = bssid;
    }

    public final C5969a a() {
        return this.f48960a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && AbstractC6492s.d(this.f48960a, ((g) obj).f48960a);
    }

    public int hashCode() {
        return this.f48960a.hashCode();
    }

    public String toString() {
        return "AP(bssid=" + this.f48960a + ")";
    }
}
