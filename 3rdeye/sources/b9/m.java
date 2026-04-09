package b9;

import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public final class m<T> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f18085b;

    /* compiled from: Result.kt */
    public static final class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f18086b;

        public a(Throwable exception) {
            kotlin.jvm.internal.l.f(exception, "exception");
            this.f18086b = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.l.b(this.f18086b, ((a) obj).f18086b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f18086b.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f18086b + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f18086b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.l.b(this.f18085b, ((m) obj).f18085b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18085b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f18085b;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
