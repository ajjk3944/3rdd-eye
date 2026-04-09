package w;

import E0.A0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class w extends e.c implements A0 {

    /* renamed from: p, reason: collision with root package name */
    public static final a f64034p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f64035q = 8;

    /* renamed from: n, reason: collision with root package name */
    private final Object f64036n = f64034p;

    /* renamed from: o, reason: collision with root package name */
    private boolean f64037o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w(boolean z10) {
        this.f64037o = z10;
    }

    public final boolean D2() {
        return this.f64037o;
    }

    public final void E2(boolean z10) {
        this.f64037o = z10;
    }

    @Override // E0.A0
    public Object W() {
        return this.f64036n;
    }
}
