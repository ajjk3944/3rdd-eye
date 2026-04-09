package vd;

import com.ui.wifiman.model.speedtest.Speedtest;
import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8213a {
    AbstractC5912b a(C2254a c2254a);

    /* renamed from: vd.a$a, reason: collision with other inner class name */
    public static final class C2254a {

        /* renamed from: a, reason: collision with root package name */
        private final Speedtest.d f63547a;

        /* renamed from: b, reason: collision with root package name */
        private final long f63548b;

        public C2254a(Speedtest.d state, long j10) {
            AbstractC6492s.i(state, "state");
            this.f63547a = state;
            this.f63548b = j10;
        }

        public final Speedtest.d a() {
            return this.f63547a;
        }

        public final long b() {
            return this.f63548b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2254a)) {
                return false;
            }
            C2254a c2254a = (C2254a) obj;
            return AbstractC6492s.d(this.f63547a, c2254a.f63547a) && this.f63548b == c2254a.f63548b;
        }

        public int hashCode() {
            return (this.f63547a.hashCode() * 31) + Long.hashCode(this.f63548b);
        }

        public String toString() {
            return "Params(state=" + this.f63547a + ", timeoutMillis=" + this.f63548b + ")";
        }

        public /* synthetic */ C2254a(Speedtest.d dVar, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, (i10 & 2) != 0 ? 2000L : j10);
        }
    }
}
