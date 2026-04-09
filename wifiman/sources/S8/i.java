package S8;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class i implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20383b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f20384a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(C5969a bssid) {
            AbstractC6492s.i(bssid, "bssid");
            return i.d("1-" + bssid);
        }

        public final String b(String ssid) {
            AbstractC6492s.i(ssid, "ssid");
            return i.d("0-" + ssid);
        }

        private a() {
        }
    }

    private /* synthetic */ i(String str) {
        this.f20384a = str;
    }

    public static final /* synthetic */ i a(String str) {
        return new i(str);
    }

    public static int c(String str, String other) {
        AbstractC6492s.i(other, "other");
        return str.compareTo(other);
    }

    public static String d(String id2) {
        AbstractC6492s.i(id2, "id");
        return id2;
    }

    public static boolean g(String str, Object obj) {
        return (obj instanceof i) && AbstractC6492s.d(str, ((i) obj).l());
    }

    public static int h(String str) {
        return str.hashCode();
    }

    public static String j(String str) {
        return "WifiNetworkID(id=" + str + ")";
    }

    public int b(String other) {
        AbstractC6492s.i(other, "other");
        return c(this.f20384a, other);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return b(((i) obj).l());
    }

    public boolean equals(Object obj) {
        return g(this.f20384a, obj);
    }

    public int hashCode() {
        return h(this.f20384a);
    }

    public final /* synthetic */ String l() {
        return this.f20384a;
    }

    public String toString() {
        return j(this.f20384a);
    }
}
