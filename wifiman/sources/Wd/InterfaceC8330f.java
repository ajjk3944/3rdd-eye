package wd;

import com.ui.wifiman.model.speedtest.Speedtest;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: wd.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8330f {

    /* renamed from: wd.f$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f64896a;

        /* renamed from: b, reason: collision with root package name */
        private final String f64897b;

        public b(String str, String str2) {
            this.f64896a = str;
            this.f64897b = str2;
        }

        public final String a() {
            return this.f64896a;
        }

        public final String b() {
            return this.f64897b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f64896a, bVar.f64896a) && AbstractC6492s.d(this.f64897b, bVar.f64897b);
        }

        public int hashCode() {
            String str = this.f64896a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f64897b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Result(serverResultId=" + this.f64896a + ", unifiControllerResultID=" + this.f64897b + ")";
        }
    }

    i a(a aVar);

    /* renamed from: wd.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Speedtest.d f64894a;

        /* renamed from: b, reason: collision with root package name */
        private final long f64895b;

        public a(Speedtest.d state, long j10) {
            AbstractC6492s.i(state, "state");
            this.f64894a = state;
            this.f64895b = j10;
        }

        public final Speedtest.d a() {
            return this.f64894a;
        }

        public final long b() {
            return this.f64895b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f64894a, aVar.f64894a) && this.f64895b == aVar.f64895b;
        }

        public int hashCode() {
            return (this.f64894a.hashCode() * 31) + Long.hashCode(this.f64895b);
        }

        public String toString() {
            return "Params(state=" + this.f64894a + ", timeoutMillis=" + this.f64895b + ")";
        }

        public /* synthetic */ a(Speedtest.d dVar, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i10 & 2) != 0 ? 3000L : j10);
        }
    }
}
