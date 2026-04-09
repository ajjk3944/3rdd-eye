package T0;

import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import androidx.emoji2.text.f;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    private z1 f21325a;

    public static final class a extends f.AbstractC1100f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f21326a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f21327b;

        a(InterfaceC3551q0 interfaceC3551q0, k kVar) {
            this.f21326a = interfaceC3551q0;
            this.f21327b = kVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC1100f
        public void a(Throwable th2) {
            this.f21327b.f21325a = o.f21332a;
        }

        @Override // androidx.emoji2.text.f.AbstractC1100f
        public void b() {
            this.f21326a.setValue(Boolean.TRUE);
            this.f21327b.f21325a = new p(true);
        }
    }

    public k() {
        this.f21325a = androidx.emoji2.text.f.k() ? c() : null;
    }

    private final z1 c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.g() == 1) {
            return new p(true);
        }
        InterfaceC3551q0 interfaceC3551q0D = t1.d(Boolean.FALSE, null, 2, null);
        fVarC.v(new a(interfaceC3551q0D, this));
        return interfaceC3551q0D;
    }

    @Override // T0.n
    public z1 a() {
        z1 z1Var = this.f21325a;
        if (z1Var != null) {
            AbstractC6492s.f(z1Var);
            return z1Var;
        }
        if (!androidx.emoji2.text.f.k()) {
            return o.f21332a;
        }
        z1 z1VarC = c();
        this.f21325a = z1VarC;
        AbstractC6492s.f(z1VarC);
        return z1VarC;
    }
}
