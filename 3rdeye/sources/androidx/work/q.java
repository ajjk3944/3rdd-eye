package androidx.work;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface q {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c f17018a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f17019b = new a.b();

    /* compiled from: Operation.java */
    public static abstract class a {

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.q$a$a, reason: collision with other inner class name */
        public static final class C0272a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f17020a;

            public C0272a(Throwable th) {
                this.f17020a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.f17020a.getMessage() + ")";
            }
        }

        /* compiled from: Operation.java */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation.java */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
