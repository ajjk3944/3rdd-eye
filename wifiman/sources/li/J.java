package Li;

/* loaded from: classes4.dex */
public interface J {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11860a = a.f11861a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11861a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final J f11862b = new K();

        /* renamed from: c, reason: collision with root package name */
        private static final J f11863c = new L();

        private a() {
        }

        public static /* synthetic */ J b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final J a(long j10, long j11) {
            return new M(j10, j11);
        }

        public final J c() {
            return f11862b;
        }

        public final J d() {
            return f11863c;
        }
    }

    InterfaceC3220g a(N n10);
}
