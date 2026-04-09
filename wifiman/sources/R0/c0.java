package R0;

import L0.C3174d;
import R0.c0;

/* loaded from: classes.dex */
public interface c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19456a = a.f19457a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f19457a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final c0 f19458b = new c0() { // from class: R0.b0
            @Override // R0.c0
            public final a0 a(C3174d c3174d) {
                return c0.a.b(c3174d);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 b(C3174d c3174d) {
            return new a0(c3174d, H.f19391a.a());
        }

        public final c0 c() {
            return f19458b;
        }
    }

    a0 a(C3174d c3174d);
}
