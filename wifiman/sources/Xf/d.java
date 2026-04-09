package xf;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f66040b = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f66041a;

    public d(C5969a bssid) {
        AbstractC6492s.i(bssid, "bssid");
        this.f66041a = bssid;
    }

    public final C5969a a() {
        return this.f66041a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && AbstractC6492s.d(this.f66041a, ((d) obj).f66041a);
    }

    public int hashCode() {
        return this.f66041a.hashCode();
    }

    public String toString() {
        return "Params(bssid=" + this.f66041a + ")";
    }
}
