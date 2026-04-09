package s;

import C0.L;
import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import E0.h0;
import E0.i0;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: s.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7828A extends e.c implements InterfaceC2630h, h0 {

    /* renamed from: n, reason: collision with root package name */
    private L.a f60612n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f60613o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f60614p;

    /* renamed from: s.A$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.N f60615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7828A f60616b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.N n10, C7828A c7828a) {
            super(0);
            this.f60615a = n10;
            this.f60616b = c7828a;
        }

        public final void a() {
            this.f60615a.f51689a = AbstractC2631i.a(this.f60616b, C0.M.a());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    private final C0.L D2() {
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        i0.a(this, new a(n10, this));
        return (C0.L) n10.f51689a;
    }

    public final void E2(boolean z10) {
        if (z10) {
            C0.L lD2 = D2();
            this.f60612n = lD2 != null ? lD2.a() : null;
        } else {
            L.a aVar = this.f60612n;
            if (aVar != null) {
                aVar.release();
            }
            this.f60612n = null;
        }
        this.f60613o = z10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f60614p;
    }

    @Override // androidx.compose.ui.e.c
    public void p2() {
        L.a aVar = this.f60612n;
        if (aVar != null) {
            aVar.release();
        }
        this.f60612n = null;
    }

    @Override // E0.h0
    public void q1() {
        C0.L lD2 = D2();
        if (this.f60613o) {
            L.a aVar = this.f60612n;
            if (aVar != null) {
                aVar.release();
            }
            this.f60612n = lD2 != null ? lD2.a() : null;
        }
    }
}
