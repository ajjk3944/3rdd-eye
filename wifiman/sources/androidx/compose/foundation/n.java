package androidx.compose.foundation;

import E0.v0;
import J0.t;
import J0.w;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
final class n extends e.c implements v0 {

    /* renamed from: n, reason: collision with root package name */
    private o f28372n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28373o;

    /* renamed from: p, reason: collision with root package name */
    private w.n f28374p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28375q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28376r;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.D2().m());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.D2().l());
        }
    }

    public n(o oVar, boolean z10, w.n nVar, boolean z11, boolean z12) {
        this.f28372n = oVar;
        this.f28373o = z10;
        this.f28374p = nVar;
        this.f28375q = z11;
        this.f28376r = z12;
    }

    public final o D2() {
        return this.f28372n;
    }

    public final void E2(w.n nVar) {
        this.f28374p = nVar;
    }

    public final void F2(boolean z10) {
        this.f28373o = z10;
    }

    public final void G2(boolean z10) {
        this.f28375q = z10;
    }

    public final void H2(o oVar) {
        this.f28372n = oVar;
    }

    public final void I2(boolean z10) {
        this.f28376r = z10;
    }

    @Override // E0.v0
    public void q(w wVar) {
        t.w0(wVar, true);
        J0.h hVar = new J0.h(new a(), new b(), this.f28373o);
        if (this.f28376r) {
            t.x0(wVar, hVar);
        } else {
            t.e0(wVar, hVar);
        }
    }
}
