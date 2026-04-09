package Bh;

/* loaded from: classes4.dex */
public interface g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f1784a = new a();

    static class a implements g0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // Bh.g0
        public h0 a() {
            h0 h0Var = h0.f1785a;
            if (h0Var == null) {
                d(0);
            }
            return h0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    h0 a();
}
