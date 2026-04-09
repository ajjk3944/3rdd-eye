package x5;

import N7.B8;
import kotlin.jvm.internal.l;

/* compiled from: SessionSubscriber.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: SessionSubscriber.kt */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f47786a;

        public b(String str) {
            this.f47786a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && l.b(this.f47786a, ((b) obj).f47786a);
        }

        public final int hashCode() {
            return this.f47786a.hashCode();
        }

        public final String toString() {
            return B8.j(new StringBuilder("SessionDetails(sessionId="), this.f47786a, ')');
        }
    }

    boolean a();

    a b();

    void c(b bVar);
}
