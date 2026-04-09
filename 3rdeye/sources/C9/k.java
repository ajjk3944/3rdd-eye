package C9;

/* compiled from: Channel.kt */
/* loaded from: classes3.dex */
public final class k<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1004b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1005a;

    /* compiled from: Channel.kt */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f1006a;

        public a(Throwable th) {
            this.f1006a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return kotlin.jvm.internal.l.b(this.f1006a, ((a) obj).f1006a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f1006a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // C9.k.b
        public final String toString() {
            return "Closed(" + this.f1006a + ')';
        }
    }

    /* compiled from: Channel.kt */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l.b(this.f1005a, ((k) obj).f1005a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1005a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1005a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
