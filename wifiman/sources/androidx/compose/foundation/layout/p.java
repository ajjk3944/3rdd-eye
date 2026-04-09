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
final class p extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private float f28164n;

    /* renamed from: o, reason: collision with root package name */
    private float f28165o;

    /* renamed from: p, reason: collision with root package name */
    private float f28166p;

    /* renamed from: q, reason: collision with root package name */
    private float f28167q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28168r;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28170b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28171c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.m mVar) {
            super(1);
            this.f28170b = tVar;
            this.f28171c = mVar;
        }

        public final void a(t.a aVar) {
            if (p.this.D2()) {
                t.a.l(aVar, this.f28170b, this.f28171c.x1(p.this.E2()), this.f28171c.x1(p.this.F2()), 0.0f, 4, null);
            } else {
                t.a.h(aVar, this.f28170b, this.f28171c.x1(p.this.E2()), this.f28171c.x1(p.this.F2()), 0.0f, 4, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ p(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public final boolean D2() {
        return this.f28168r;
    }

    public final float E2() {
        return this.f28164n;
    }

    public final float F2() {
        return this.f28165o;
    }

    public final void G2(float f10) {
        this.f28167q = f10;
    }

    public final void H2(float f10) {
        this.f28166p = f10;
    }

    public final void I2(boolean z10) {
        this.f28168r = z10;
    }

    public final void J2(float f10) {
        this.f28164n = f10;
    }

    public final void K2(float f10) {
        this.f28165o = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        int iX1 = mVar.x1(this.f28164n) + mVar.x1(this.f28166p);
        int iX12 = mVar.x1(this.f28165o) + mVar.x1(this.f28167q);
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.n(j10, -iX1, -iX12));
        return androidx.compose.ui.layout.m.x0(mVar, Y0.c.i(j10, tVarT.I0() + iX1), Y0.c.h(j10, tVarT.C0() + iX12), null, new a(tVarT, mVar), 4, null);
    }

    private p(float f10, float f11, float f12, float f13, boolean z10) {
        this.f28164n = f10;
        this.f28165o = f11;
        this.f28166p = f12;
        this.f28167q = f13;
        this.f28168r = z10;
    }
}
