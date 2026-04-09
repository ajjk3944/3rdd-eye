package jj;

import A.B;
import A.l;
import Ii.N;
import Y0.r;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import w.q;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: t, reason: collision with root package name */
    public static final int f50940t = 0;

    /* renamed from: s, reason: collision with root package name */
    private final B f50941s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(B listState, N scope, float f10, InterfaceC6839p onMove, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6350b dragCancelledAnimation) {
        super(scope, f10, onMove, interfaceC6839p, interfaceC6839p2, dragCancelledAnimation);
        AbstractC6492s.i(listState, "listState");
        AbstractC6492s.i(scope, "scope");
        AbstractC6492s.i(onMove, "onMove");
        AbstractC6492s.i(dragCancelledAnimation, "dragCancelledAnimation");
        this.f50941s = listState;
    }

    @Override // jj.i
    protected int E() {
        return this.f50941s.w().d();
    }

    @Override // jj.i
    protected int F() {
        return this.f50941s.w().g();
    }

    @Override // jj.i
    protected List G() {
        return this.f50941s.w().j();
    }

    @Override // jj.i
    public boolean I() {
        return this.f50941s.w().e() == q.Vertical;
    }

    @Override // jj.i
    public boolean L(int i10, int i11) {
        return I() ? super.L(0, i11) : super.L(i10, 0);
    }

    @Override // jj.i
    protected Object M(int i10, int i11, InterfaceC5380e interfaceC5380e) {
        Object objJ = this.f50941s.J(i10, i11, interfaceC5380e);
        return objJ == AbstractC5467b.g() ? objJ : J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public l j(l lVar, List items, int i10, int i11) {
        AbstractC6492s.i(items, "items");
        return I() ? (l) super.j(lVar, items, 0, i11) : (l) super.j(lVar, items, i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List k(int i10, int i11, l selected) {
        AbstractC6492s.i(selected, "selected");
        return I() ? super.k(0, i11, selected) : super.k(i10, 0, selected);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public int l(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (!I()) {
            return 0;
        }
        if (this.f50941s.w().a()) {
            return r.f(this.f50941s.w().b()) - lVar.b();
        }
        return lVar.a() + lVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public int v(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (I()) {
            return lVar.a();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public int x(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        return lVar.getIndex();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Object y(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        return lVar.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public int z(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (I()) {
            return 0;
        }
        return this.f50941s.w().a() ? (r.g(this.f50941s.w().b()) - lVar.b()) - lVar.a() : lVar.b();
    }

    public final B Y() {
        return this.f50941s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public int A(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (I()) {
            return 0;
        }
        if (this.f50941s.w().a()) {
            return r.g(this.f50941s.w().b()) - lVar.b();
        }
        return lVar.a() + lVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public int D(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (I()) {
            return this.f50941s.w().a() ? (r.f(this.f50941s.w().b()) - lVar.b()) - lVar.a() : lVar.b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // jj.i
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public int H(l lVar) {
        AbstractC6492s.i(lVar, "<this>");
        if (I()) {
            return 0;
        }
        return lVar.a();
    }

    @Override // jj.i
    protected int t() {
        return this.f50941s.r();
    }

    @Override // jj.i
    protected int u() {
        return this.f50941s.s();
    }
}
