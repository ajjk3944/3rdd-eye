package androidx.compose.runtime.snapshots;

import Yg.J;
import androidx.compose.runtime.snapshots.h;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import o.I;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: s, reason: collision with root package name */
    private final b f28625s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f28626t;

    public c(int i10, i iVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, b bVar) {
        super(i10, iVar, interfaceC6835l, interfaceC6835l2);
        this.f28625s = bVar;
        bVar.m(this);
    }

    private final void T() {
        if (this.f28626t) {
            return;
        }
        this.f28626t = true;
        this.f28625s.n(this);
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        Map mapR;
        if (this.f28625s.D() || this.f28625s.e()) {
            return new h.a(this);
        }
        I iE = E();
        int iF = f();
        if (iE != null) {
            b bVar = this.f28625s;
            mapR = j.R(bVar, this, bVar.g());
        } else {
            mapR = null;
        }
        synchronized (j.I()) {
            try {
                j.g0(this);
                if (iE == null || iE.c() == 0) {
                    b();
                } else {
                    h hVarI = I(this.f28625s.f(), mapR, this.f28625s.g());
                    if (!AbstractC6492s.d(hVarI, h.b.f28639a)) {
                        return hVarI;
                    }
                    I iE2 = this.f28625s.E();
                    if (iE2 != null) {
                        iE2.j(iE);
                    } else {
                        this.f28625s.P(iE);
                        P(null);
                    }
                }
                if (this.f28625s.f() < iF) {
                    this.f28625s.B();
                }
                b bVar2 = this.f28625s;
                bVar2.v(bVar2.g().k(iF).j(F()));
                this.f28625s.J(iF);
                this.f28625s.L(y());
                this.f28625s.K(F());
                this.f28625s.M(G());
                J j10 = J.f24997a;
                O(true);
                T();
                return h.b.f28639a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        T();
    }
}
