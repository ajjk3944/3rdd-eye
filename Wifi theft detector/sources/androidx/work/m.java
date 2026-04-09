package androidx.work;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f4528a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0055b f4529b;

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f4530a;

            public a(Throwable th) {
                this.f4530a = th;
            }

            public Throwable a() {
                return this.f4530a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f4530a.getMessage());
            }
        }

        /* renamed from: androidx.work.m$b$b, reason: collision with other inner class name */
        public static final class C0055b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0055b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }

    static {
        f4528a = new b.c();
        f4529b = new b.C0055b();
    }
}
