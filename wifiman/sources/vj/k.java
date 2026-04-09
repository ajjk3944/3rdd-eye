package vj;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.kodein.type.q;

/* loaded from: classes3.dex */
abstract class k {

    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        private final q f63694a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f63695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q type) {
            super(null);
            AbstractC6492s.i(type, "type");
            this.f63694a = type;
            this.f63695b = AbstractC6492s.d(b(), q.f56966a.a());
        }

        @Override // vj.k
        public boolean a(q other) {
            AbstractC6492s.i(other, "other");
            return this.f63695b || b().d(other);
        }

        public q b() {
            return this.f63694a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(b(), ((a) obj).b());
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "Down(type=" + b() + ')';
        }
    }

    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        private final q f63696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q type) {
            super(null);
            AbstractC6492s.i(type, "type");
            this.f63696a = type;
        }

        @Override // vj.k
        public boolean a(q other) {
            AbstractC6492s.i(other, "other");
            return AbstractC6492s.d(other, q.f56966a.a()) || other.d(b());
        }

        public q b() {
            return this.f63696a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(b(), ((b) obj).b());
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "Up(type=" + b() + ')';
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(q qVar);

    private k() {
    }
}
