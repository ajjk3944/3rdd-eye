package qd;

import com.ui.wifiman.model.speedtest.Speedtest;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: qd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7451a extends Speedtest {

    /* renamed from: qd.a$a, reason: collision with other inner class name */
    public static final class C2063a implements Speedtest.b {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f58608a;

        /* renamed from: b, reason: collision with root package name */
        private final int f58609b;

        /* renamed from: c, reason: collision with root package name */
        private final String f58610c;

        /* renamed from: d, reason: collision with root package name */
        private final String f58611d;

        public C2063a(inet.ipaddr.g ip, int i10, String str, String str2) {
            AbstractC6492s.i(ip, "ip");
            this.f58608a = ip;
            this.f58609b = i10;
            this.f58610c = str;
            this.f58611d = str2;
        }

        public final inet.ipaddr.g a() {
            return this.f58608a;
        }

        public final String b() {
            return this.f58611d;
        }

        public final String c() {
            return this.f58610c;
        }

        public final int d() {
            return this.f58609b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2063a)) {
                return false;
            }
            C2063a c2063a = (C2063a) obj;
            return AbstractC6492s.d(this.f58608a, c2063a.f58608a) && this.f58609b == c2063a.f58609b && AbstractC6492s.d(this.f58610c, c2063a.f58610c) && AbstractC6492s.d(this.f58611d, c2063a.f58611d);
        }

        public int hashCode() {
            int iHashCode = ((this.f58608a.hashCode() * 31) + Integer.hashCode(this.f58609b)) * 31;
            String str = this.f58610c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f58611d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Params(ip=" + this.f58608a + ", port=" + this.f58609b + ", name=" + this.f58610c + ", model=" + this.f58611d + ")";
        }
    }

    /* renamed from: qd.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f58612a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f58613b;

        public b(int i10, Integer num) {
            this.f58612a = i10;
            this.f58613b = num;
        }

        public final Integer a() {
            return this.f58613b;
        }

        public final int b() {
            return this.f58612a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f58612a == bVar.f58612a && AbstractC6492s.d(this.f58613b, bVar.f58613b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f58612a) * 31;
            Integer num = this.f58613b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ServerEvaluation(latencyMs=" + this.f58612a + ", jitterMs=" + this.f58613b + ")";
        }
    }
}
