package androidx.compose.ui.platform;

import T.InterfaceC3551q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y0.AbstractC8597r;
import y0.C8571K;

/* loaded from: classes.dex */
public final class F1 implements E1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29155b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC3551q0 f29156c = T.t1.d(C8571K.a(AbstractC8597r.a()), null, 2, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f29157a = T.t1.d(Boolean.FALSE, null, 2, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.compose.ui.platform.E1
    public boolean a() {
        return ((Boolean) this.f29157a.getValue()).booleanValue();
    }

    public void b(int i10) {
        f29156c.setValue(C8571K.a(i10));
    }

    public void c(boolean z10) {
        this.f29157a.setValue(Boolean.valueOf(z10));
    }
}
