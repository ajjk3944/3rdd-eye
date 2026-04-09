package Te;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class H {

    public static final class a extends H {

        /* renamed from: a, reason: collision with root package name */
        private final N f21640a;

        /* renamed from: b, reason: collision with root package name */
        private final List f21641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N color, List data) {
            super(null);
            AbstractC6492s.i(color, "color");
            AbstractC6492s.i(data, "data");
            this.f21640a = color;
            this.f21641b = data;
        }

        @Override // Te.H
        public List a() {
            return this.f21641b;
        }

        public final N b() {
            return this.f21640a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21640a == aVar.f21640a && AbstractC6492s.d(this.f21641b, aVar.f21641b);
        }

        public int hashCode() {
            return (this.f21640a.hashCode() * 31) + this.f21641b.hashCode();
        }

        public String toString() {
            return "Colored(color=" + this.f21640a + ", data=" + this.f21641b + ")";
        }
    }

    public static final class b extends H {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21642b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final b f21643c = new b(AbstractC3689v.l());

        /* renamed from: a, reason: collision with root package name */
        private final List f21644a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                return b.f21643c;
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List data) {
            super(null);
            AbstractC6492s.i(data, "data");
            this.f21644a = data;
        }

        @Override // Te.H
        public List a() {
            return this.f21644a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f21644a, ((b) obj).f21644a);
        }

        public int hashCode() {
            return this.f21644a.hashCode();
        }

        public String toString() {
            return "ColoredByLevel(data=" + this.f21644a + ")";
        }
    }

    public /* synthetic */ H(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract List a();

    private H() {
    }
}
