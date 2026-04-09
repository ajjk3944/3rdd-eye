package af;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class q0 {

    public static final class a extends q0 {

        /* renamed from: a, reason: collision with root package name */
        private final com.ui.wifiman.ui.component.network.N f26175a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.ui.wifiman.ui.component.network.N topology) {
            super(null);
            AbstractC6492s.i(topology, "topology");
            this.f26175a = topology;
        }

        public final com.ui.wifiman.ui.component.network.N a() {
            return this.f26175a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f26175a, ((a) obj).f26175a);
        }

        public int hashCode() {
            return this.f26175a.hashCode();
        }

        public String toString() {
            return "Loaded(topology=" + this.f26175a + ")";
        }
    }

    public static final class b extends q0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26176a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -614664558;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private q0() {
    }
}
