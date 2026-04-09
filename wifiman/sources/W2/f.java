package W2;

/* loaded from: classes.dex */
public abstract class f {

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f23586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f23587b;

        a(b bVar) {
            this.f23587b = bVar;
        }

        @Override // W2.f.b
        public Object get() {
            if (this.f23586a == null) {
                synchronized (this) {
                    try {
                        if (this.f23586a == null) {
                            this.f23586a = k.d(this.f23587b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f23586a;
        }
    }

    public interface b {
        Object get();
    }

    public static b a(b bVar) {
        return new a(bVar);
    }
}
