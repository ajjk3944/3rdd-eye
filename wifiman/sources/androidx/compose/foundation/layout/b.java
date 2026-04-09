package androidx.compose.foundation.layout;

import C0.AbstractC2521a;
import C0.D;
import E0.B;
import androidx.compose.ui.e;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class b extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private AbstractC2521a f28102n;

    /* renamed from: o, reason: collision with root package name */
    private float f28103o;

    /* renamed from: p, reason: collision with root package name */
    private float f28104p;

    public /* synthetic */ b(AbstractC2521a abstractC2521a, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2521a, f10, f11);
    }

    public final void D2(float f10) {
        this.f28104p = f10;
    }

    public final void E2(AbstractC2521a abstractC2521a) {
        this.f28102n = abstractC2521a;
    }

    public final void F2(float f10) {
        this.f28103o = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        return a.c(mVar, this.f28102n, this.f28103o, this.f28104p, b10, j10);
    }

    private b(AbstractC2521a abstractC2521a, float f10, float f11) {
        this.f28102n = abstractC2521a;
        this.f28103o = f10;
        this.f28104p = f11;
    }
}
