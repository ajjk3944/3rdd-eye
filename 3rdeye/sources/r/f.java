package R;

import C.m0;
import C.r;
import G.n;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C1686e0;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.J;
import java.util.ArrayList;

/* compiled from: VirtualCamera.java */
/* loaded from: classes.dex */
public final class f implements J {

    /* renamed from: b, reason: collision with root package name */
    public final J f11579b;

    /* renamed from: c, reason: collision with root package name */
    public final j f11580c;

    /* renamed from: d, reason: collision with root package name */
    public final k f11581d;

    /* renamed from: e, reason: collision with root package name */
    public final h f11582e;

    public f(J j4, h hVar, B.d dVar) {
        this.f11579b = j4;
        this.f11582e = hVar;
        this.f11580c = new j(j4.f(), dVar);
        this.f11581d = new k(j4.n());
    }

    @Override // androidx.camera.core.impl.J, C.InterfaceC0625l
    public final r a() {
        return n();
    }

    @Override // androidx.camera.core.impl.J
    public final boolean b() {
        return ((C1686e0) a()).g() == 0;
    }

    @Override // C.m0.b
    public final void c(m0 m0Var) {
        n.a();
        this.f11582e.c(m0Var);
    }

    @Override // androidx.camera.core.impl.J
    public final InterfaceC1715t0<J.a> e() {
        return this.f11579b.e();
    }

    @Override // androidx.camera.core.impl.J
    public final F f() {
        return this.f11580c;
    }

    @Override // androidx.camera.core.impl.J
    public final B g() {
        return D.f14872a;
    }

    @Override // C.m0.b
    public final void h(m0 m0Var) {
        n.a();
        this.f11582e.h(m0Var);
    }

    @Override // androidx.camera.core.impl.J
    public final void j(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.J
    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.J
    public final boolean l() {
        return false;
    }

    @Override // androidx.camera.core.impl.J
    public final I n() {
        return this.f11581d;
    }

    @Override // C.m0.b
    public final void o(m0 m0Var) {
        n.a();
        this.f11582e.o(m0Var);
    }

    @Override // C.m0.b
    public final void p(m0 m0Var) {
        n.a();
        this.f11582e.p(m0Var);
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ void d(B b10) {
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ void i(boolean z10) {
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ void m(boolean z10) {
    }
}
