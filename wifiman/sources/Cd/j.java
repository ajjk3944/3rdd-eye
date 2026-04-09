package Cd;

import com.ui.wifiman.model.speedtest.Speedtest;
import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface j extends Speedtest {

    /* renamed from: a, reason: collision with root package name */
    public static final b f2592a = b.f2593a;

    public interface a {
        z a(inet.ipaddr.g gVar, long j10);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f2593a = new b();

        private b() {
        }

        public final String a(inet.ipaddr.g ip, int i10) {
            AbstractC6492s.i(ip, "ip");
            return "http://" + ip + ":" + i10;
        }
    }

    public static final class c implements Speedtest.b {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f2594a;

        public c(inet.ipaddr.g ip) {
            AbstractC6492s.i(ip, "ip");
            this.f2594a = ip;
        }

        public final inet.ipaddr.g a() {
            return this.f2594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f2594a, ((c) obj).f2594a);
        }

        public int hashCode() {
            return this.f2594a.hashCode();
        }

        public String toString() {
            return "Params(ip=" + this.f2594a + ")";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final int f2595a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f2596b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2597c;

        public d(int i10, Integer num, String str) {
            this.f2595a = i10;
            this.f2596b = num;
            this.f2597c = str;
        }

        public final Integer a() {
            return this.f2596b;
        }

        public final int b() {
            return this.f2595a;
        }

        public final String c() {
            return this.f2597c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f2595a == dVar.f2595a && AbstractC6492s.d(this.f2596b, dVar.f2596b) && AbstractC6492s.d(this.f2597c, dVar.f2597c);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f2595a) * 31;
            Integer num = this.f2596b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f2597c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ServerEvaluation(latencyMs=" + this.f2595a + ", jitterMs=" + this.f2596b + ", serverVersion=" + this.f2597c + ")";
        }
    }
}
