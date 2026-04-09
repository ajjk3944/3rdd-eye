package Je;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final int f10030b = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C5969a f10031a;

    public m(C5969a mac) {
        AbstractC6492s.i(mac, "mac");
        this.f10031a = mac;
    }

    public final C5969a a() {
        return this.f10031a;
    }

    public final C5969a b() {
        return this.f10031a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && AbstractC6492s.d(this.f10031a, ((m) obj).f10031a);
    }

    public int hashCode() {
        return this.f10031a.hashCode();
    }

    public String toString() {
        return "Params(mac=" + this.f10031a + ")";
    }
}
