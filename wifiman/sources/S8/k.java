package S8;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f20403a;

    private /* synthetic */ k(String str) {
        this.f20403a = str;
    }

    public static final /* synthetic */ k a(String str) {
        return new k(str);
    }

    public static String b(String bssid) {
        AbstractC6492s.i(bssid, "bssid");
        return bssid;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof k) && AbstractC6492s.d(str, ((k) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return AbstractC6492s.d(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "WifiSignalID(bssid=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f20403a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f20403a;
    }

    public int hashCode() {
        return e(this.f20403a);
    }

    public String toString() {
        return f(this.f20403a);
    }
}
