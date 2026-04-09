package P;

import E0.AbstractC2631i;
import E0.AbstractC2640s;
import Yg.J;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6670H;
import m0.InterfaceC6717n0;
import m0.InterfaceC6739y0;
import mh.InterfaceC6824a;
import o0.InterfaceC7039f;
import oh.AbstractC7137b;
import y.InterfaceC8556k;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public final class b extends q implements k {

    /* renamed from: y, reason: collision with root package name */
    private j f17879y;

    /* renamed from: z, reason: collision with root package name */
    private n f17880z;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final void a() {
            AbstractC2640s.a(b.this);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public /* synthetic */ b(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a);
    }

    private final j R2() {
        j jVar = this.f17879y;
        if (jVar != null) {
            AbstractC6492s.f(jVar);
            return jVar;
        }
        j jVarC = t.c(t.e((View) AbstractC2631i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.f17879y = jVarC;
        AbstractC6492s.f(jVarC);
        return jVarC;
    }

    private final void S2(n nVar) {
        this.f17880z = nVar;
        AbstractC2640s.a(this);
    }

    @Override // P.k
    public void E0() {
        S2(null);
    }

    @Override // P.q
    public void I2(InterfaceC8560o.b bVar, long j10, float f10) {
        n nVarB = R2().b(this);
        nVarB.b(bVar, K2(), j10, AbstractC7137b.e(f10), M2(), ((g) L2().invoke()).d(), new a());
        S2(nVarB);
    }

    @Override // P.q
    public void J2(InterfaceC7039f interfaceC7039f) {
        InterfaceC6717n0 interfaceC6717n0D = interfaceC7039f.k1().d();
        n nVar = this.f17880z;
        if (nVar != null) {
            nVar.f(N2(), M2(), ((g) L2().invoke()).d());
            nVar.draw(AbstractC6670H.d(interfaceC6717n0D));
        }
    }

    @Override // P.q
    public void P2(InterfaceC8560o.b bVar) {
        n nVar = this.f17880z;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        j jVar = this.f17879y;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    private b(InterfaceC8556k interfaceC8556k, boolean z10, float f10, InterfaceC6739y0 interfaceC6739y0, InterfaceC6824a interfaceC6824a) {
        super(interfaceC8556k, z10, f10, interfaceC6739y0, interfaceC6824a, null);
    }
}
