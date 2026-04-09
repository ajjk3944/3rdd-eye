package be;

import ce.ApiNetworkWifimanSpeedtestFeedbackReport;
import ce.ApiNetworkWifimanSpeedtestReport;
import gg.AbstractC5912b;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: be.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4089c {

    /* renamed from: be.c$a */
    public interface a {
        InterfaceC4089c a(b bVar);
    }

    z a();

    z b();

    z c(ApiNetworkWifimanSpeedtestReport apiNetworkWifimanSpeedtestReport);

    AbstractC5912b d(String str, ApiNetworkWifimanSpeedtestFeedbackReport apiNetworkWifimanSpeedtestFeedbackReport);

    /* renamed from: be.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f33117a;

        /* renamed from: b, reason: collision with root package name */
        private final int f33118b;

        public b(String host, int i10) {
            AbstractC6492s.i(host, "host");
            this.f33117a = host;
            this.f33118b = i10;
        }

        public final String a() {
            return this.f33117a;
        }

        public final int b() {
            return this.f33118b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f33117a, bVar.f33117a) && this.f33118b == bVar.f33118b;
        }

        public int hashCode() {
            return (this.f33117a.hashCode() * 31) + Integer.hashCode(this.f33118b);
        }

        public String toString() {
            return "Params(host=" + this.f33117a + ", port=" + this.f33118b + ")";
        }

        public /* synthetic */ b(String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 8900 : i10);
        }
    }
}
