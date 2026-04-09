package F7;

import java.util.List;

/* compiled from: RawJsonRepository.kt */
/* loaded from: classes.dex */
public interface o {

    /* compiled from: RawJsonRepository.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<J7.a> f1702a;

        /* renamed from: b, reason: collision with root package name */
        public final F7.a f1703b;

        public a() {
            throw null;
        }

        public a(List list) {
            F7.a actionOnError = F7.a.ABORT_TRANSACTION;
            kotlin.jvm.internal.l.f(actionOnError, "actionOnError");
            this.f1702a = list;
            this.f1703b = actionOnError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f1702a, aVar.f1702a) && this.f1703b == aVar.f1703b;
        }

        public final int hashCode() {
            return this.f1703b.hashCode() + (this.f1702a.hashCode() * 31);
        }

        public final String toString() {
            return "Payload(jsons=" + this.f1702a + ", actionOnError=" + this.f1703b + ')';
        }
    }

    r a(C9.r rVar);

    s b(List<String> list);

    s c(a aVar);
}
