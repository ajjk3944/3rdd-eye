package L0;

import L0.J;
import l0.C6533i;

/* loaded from: classes.dex */
public interface J {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11067a = a.f11068a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11068a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final J f11069b = new J() { // from class: L0.G
            @Override // L0.J
            public final boolean a(C6533i c6533i, C6533i c6533i2) {
                return J.a.d(c6533i, c6533i2);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        private static final J f11070c = new J() { // from class: L0.H
            @Override // L0.J
            public final boolean a(C6533i c6533i, C6533i c6533i2) {
                return J.a.e(c6533i, c6533i2);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        private static final J f11071d = new J() { // from class: L0.I
            @Override // L0.J
            public final boolean a(C6533i c6533i, C6533i c6533i2) {
                return J.a.f(c6533i, c6533i2);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(C6533i c6533i, C6533i c6533i2) {
            return c6533i.v(c6533i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(C6533i c6533i, C6533i c6533i2) {
            return !c6533i2.u() && c6533i.k() >= c6533i2.k() && c6533i.l() <= c6533i2.l() && c6533i.n() >= c6533i2.n() && c6533i.e() <= c6533i2.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(C6533i c6533i, C6533i c6533i2) {
            return c6533i2.b(c6533i.i());
        }

        public final J g() {
            return f11069b;
        }

        public final J h() {
            return f11071d;
        }
    }

    boolean a(C6533i c6533i, C6533i c6533i2);
}
