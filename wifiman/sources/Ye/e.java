package Ye;

import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        private final C5969a f24920a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5969a bssid) {
            super(null);
            AbstractC6492s.i(bssid, "bssid");
            this.f24920a = bssid;
        }

        public final C5969a a() {
            return this.f24920a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f24920a, ((a) obj).f24920a);
        }

        public int hashCode() {
            return this.f24920a.hashCode();
        }

        public String toString() {
            return "AP(bssid=" + this.f24920a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f24921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String ssid) {
            super(null);
            AbstractC6492s.i(ssid, "ssid");
            this.f24921a = ssid;
        }

        public final String a() {
            return this.f24921a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f24921a, ((b) obj).f24921a);
        }

        public int hashCode() {
            return this.f24921a.hashCode();
        }

        public String toString() {
            return "Network(ssid=" + this.f24921a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }
}
