package androidx.compose.ui;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class f extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private float f28786n;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f28787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f28788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t tVar, f fVar) {
            super(1);
            this.f28787a = tVar;
            this.f28788b = fVar;
        }

        public final void a(t.a aVar) {
            aVar.g(this.f28787a, 0, 0, this.f28788b.D2());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public f(float f10) {
        this.f28786n = f10;
    }

    public final float D2() {
        return this.f28786n;
    }

    public final void E2(float f10) {
        this.f28786n = f10;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        t tVarT = b10.T(j10);
        return m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT, this), 4, null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f28786n + ')';
    }
}
