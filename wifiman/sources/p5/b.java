package p5;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public interface b {

    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: p5.b$b, reason: collision with other inner class name */
    public static final class C2029b {

        /* renamed from: a, reason: collision with root package name */
        private final String f57683a;

        public C2029b(String sessionId) {
            AbstractC6492s.i(sessionId, "sessionId");
            this.f57683a = sessionId;
        }

        public final String a() {
            return this.f57683a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2029b) && AbstractC6492s.d(this.f57683a, ((C2029b) obj).f57683a);
        }

        public int hashCode() {
            return this.f57683a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f57683a + ')';
        }
    }

    void a(C2029b c2029b);

    boolean b();

    a c();
}
