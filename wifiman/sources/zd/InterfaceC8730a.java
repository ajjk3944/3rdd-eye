package zd;

import gg.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8730a {

    /* renamed from: zd.a$a, reason: collision with other inner class name */
    public static final class C2389a {
        public static /* synthetic */ i a(InterfaceC8730a interfaceC8730a, b bVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: process");
            }
            int i11 = 1;
            if ((i10 & 1) != 0) {
                bVar = new b(0L, i11, null);
            }
            return interfaceC8730a.a(bVar);
        }
    }

    i a(b bVar);

    /* renamed from: zd.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f67249a;

        public b(long j10) {
            this.f67249a = j10;
        }

        public final long a() {
            return this.f67249a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f67249a == ((b) obj).f67249a;
        }

        public int hashCode() {
            return Long.hashCode(this.f67249a);
        }

        public String toString() {
            return "Params(durationMillis=" + this.f67249a + ")";
        }

        public /* synthetic */ b(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 1500L : j10);
        }
    }
}
