package X2;

/* loaded from: classes.dex */
public abstract class c {

    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f24019a;

        b() {
            super();
        }

        @Override // X2.c
        public void b(boolean z10) {
            this.f24019a = z10;
        }

        @Override // X2.c
        public void c() {
            if (this.f24019a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static c a() {
        return new b();
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }
}
