package E0;

import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class j0 implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3939b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f3940c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC6835l f3941d = a.f3943a;

    /* renamed from: a, reason: collision with root package name */
    private final h0 f3942a;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3943a = new a();

        a() {
            super(1);
        }

        public final void a(j0 j0Var) {
            if (j0Var.h0()) {
                j0Var.b().q1();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((j0) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC6835l a() {
            return j0.f3941d;
        }

        private b() {
        }
    }

    public j0(h0 h0Var) {
        this.f3942a = h0Var;
    }

    public final h0 b() {
        return this.f3942a;
    }

    @Override // E0.n0
    public boolean h0() {
        return this.f3942a.h1().k2();
    }
}
