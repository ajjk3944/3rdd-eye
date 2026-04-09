package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: h, reason: collision with root package name */
    public static final a f51736h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Yg.m f51737i = Yg.n.b(f.f51735a);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return (g) g.f51737i.getValue();
        }

        private a() {
        }
    }

    public g(boolean z10) {
        super(new oi.f("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g F0() {
        return new g(false, 1, null);
    }

    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
