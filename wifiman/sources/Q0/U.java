package Q0;

import T.z1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface U extends z1 {

    public static final class a implements U, z1 {

        /* renamed from: a, reason: collision with root package name */
        private final C3429f f19018a;

        public a(C3429f c3429f) {
            this.f19018a = c3429f;
        }

        @Override // T.z1
        public Object getValue() {
            return this.f19018a.getValue();
        }

        @Override // Q0.U
        public boolean h() {
            return this.f19018a.i();
        }
    }

    boolean h();

    public static final class b implements U {

        /* renamed from: a, reason: collision with root package name */
        private final Object f19019a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f19020b;

        public b(Object obj, boolean z10) {
            this.f19019a = obj;
            this.f19020b = z10;
        }

        @Override // T.z1
        public Object getValue() {
            return this.f19019a;
        }

        @Override // Q0.U
        public boolean h() {
            return this.f19020b;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
