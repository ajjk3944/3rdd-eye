package androidx.compose.foundation.layout;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class m extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private float f28145n;

    /* renamed from: o, reason: collision with root package name */
    private float f28146o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28147p;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.m mVar) {
            super(1);
            this.f28149b = tVar;
            this.f28150c = mVar;
        }

        public final void a(t.a aVar) {
            if (m.this.D2()) {
                t.a.l(aVar, this.f28149b, this.f28150c.x1(m.this.E2()), this.f28150c.x1(m.this.F2()), 0.0f, 4, null);
            } else {
                t.a.h(aVar, this.f28149b, this.f28150c.x1(m.this.E2()), this.f28150c.x1(m.this.F2()), 0.0f, 4, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ m(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    public final boolean D2() {
        return this.f28147p;
    }

    public final float E2() {
        return this.f28145n;
    }

    public final float F2() {
        return this.f28146o;
    }

    public final void G2(boolean z10) {
        this.f28147p = z10;
    }

    public final void H2(float f10) {
        this.f28145n = f10;
    }

    public final void I2(float f10) {
        this.f28146o = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(j10);
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT, mVar), 4, null);
    }

    private m(float f10, float f11, boolean z10) {
        this.f28145n = f10;
        this.f28146o = f11;
        this.f28147p = z10;
    }
}
