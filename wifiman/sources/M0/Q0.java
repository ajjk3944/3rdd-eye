package m0;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6536l;
import l0.C6533i;
import l0.C6535k;

/* loaded from: classes.dex */
public abstract class Q0 {

    public static final class a extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private final U0 f52842a;

        public a(U0 u02) {
            super(null);
            this.f52842a = u02;
        }

        @Override // m0.Q0
        public C6533i a() {
            return this.f52842a.getBounds();
        }

        public final U0 b() {
            return this.f52842a;
        }
    }

    public static final class b extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private final C6533i f52843a;

        public b(C6533i c6533i) {
            super(null);
            this.f52843a = c6533i;
        }

        @Override // m0.Q0
        public C6533i a() {
            return this.f52843a;
        }

        public final C6533i b() {
            return this.f52843a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f52843a, ((b) obj).f52843a);
        }

        public int hashCode() {
            return this.f52843a.hashCode();
        }
    }

    public static final class c extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private final C6535k f52844a;

        /* renamed from: b, reason: collision with root package name */
        private final U0 f52845b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6535k c6535k) {
            super(0 == true ? 1 : 0);
            U0 u02 = null;
            this.f52844a = c6535k;
            if (!AbstractC6536l.f(c6535k)) {
                U0 u0A = AbstractC6688Y.a();
                U0.t(u0A, c6535k, null, 2, null);
                u02 = u0A;
            }
            this.f52845b = u02;
        }

        @Override // m0.Q0
        public C6533i a() {
            return AbstractC6536l.e(this.f52844a);
        }

        public final C6535k b() {
            return this.f52844a;
        }

        public final U0 c() {
            return this.f52845b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6492s.d(this.f52844a, ((c) obj).f52844a);
        }

        public int hashCode() {
            return this.f52844a.hashCode();
        }
    }

    public /* synthetic */ Q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C6533i a();

    private Q0() {
    }
}
