package androidx.compose.runtime.snapshots;

import d0.AbstractC5277i;
import d0.InterfaceC5279k;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6835l f28627g;

    /* renamed from: h, reason: collision with root package name */
    private final g f28628h;

    public d(int i10, i iVar, InterfaceC6835l interfaceC6835l, g gVar) {
        super(i10, iVar, null);
        this.f28627g = interfaceC6835l;
        this.f28628h = gVar;
        gVar.m(this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public InterfaceC6835l h() {
        return this.f28627g;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void p(InterfaceC5279k interfaceC5279k) {
        j.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public d x(InterfaceC6835l interfaceC6835l) {
        return new d(f(), g(), j.L(interfaceC6835l, h(), false, 4, null), this.f28628h);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (e()) {
            return;
        }
        if (f() != this.f28628h.f()) {
            b();
        }
        this.f28628h.n(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public InterfaceC6835l k() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
    }
}
