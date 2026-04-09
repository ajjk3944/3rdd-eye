package androidx.compose.runtime.snapshots;

import d0.InterfaceC5279k;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6835l f28630g;

    /* renamed from: h, reason: collision with root package name */
    private int f28631h;

    public f(int i10, i iVar, InterfaceC6835l interfaceC6835l) {
        super(i10, iVar, null);
        this.f28630g = interfaceC6835l;
        this.f28631h = 1;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public InterfaceC6835l h() {
        return this.f28630g;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (e()) {
            return;
        }
        n(this);
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
    public void m(g gVar) {
        this.f28631h++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g gVar) {
        int i10 = this.f28631h - 1;
        this.f28631h = i10;
        if (i10 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(InterfaceC5279k interfaceC5279k) {
        j.Z();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(InterfaceC6835l interfaceC6835l) {
        j.g0(this);
        return new d(f(), g(), j.L(interfaceC6835l, h(), false, 4, null), this);
    }
}
