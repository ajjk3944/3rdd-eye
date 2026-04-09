package A;

import B.L;
import Zg.AbstractC3689v;
import androidx.compose.foundation.lazy.layout.d;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2394a implements w {

    /* renamed from: a, reason: collision with root package name */
    private final int f55a;

    /* renamed from: b, reason: collision with root package name */
    private int f56b = -1;

    /* renamed from: c, reason: collision with root package name */
    private d.b f57c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f58d;

    public C2394a(int i10) {
        this.f55a = i10;
    }

    @Override // A.w
    public void a(L l10, int i10) {
        int i11 = this.f55a;
        for (int i12 = 0; i12 < i11; i12++) {
            l10.a(i10 + i12);
        }
    }

    @Override // A.w
    public void c(v vVar, float f10, q qVar) {
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (qVar.j().isEmpty()) {
            return;
        }
        boolean z10 = f10 < 0.0f;
        int index = z10 ? ((l) AbstractC3689v.B0(qVar.j())).getIndex() + 1 : ((l) AbstractC3689v.q0(qVar.j())).getIndex() - 1;
        if (index < 0 || index >= qVar.h()) {
            return;
        }
        if (index != this.f56b) {
            if (this.f58d != z10 && (bVar3 = this.f57c) != null) {
                bVar3.cancel();
            }
            this.f58d = z10;
            this.f56b = index;
            this.f57c = vVar.a(index);
        }
        if (!z10) {
            if (qVar.g() - ((l) AbstractC3689v.q0(qVar.j())).b() >= f10 || (bVar = this.f57c) == null) {
                return;
            }
            bVar.b();
            return;
        }
        l lVar = (l) AbstractC3689v.B0(qVar.j());
        if (((lVar.b() + lVar.a()) + qVar.i()) - qVar.d() >= (-f10) || (bVar2 = this.f57c) == null) {
            return;
        }
        bVar2.b();
    }

    @Override // A.w
    public void d(v vVar, q qVar) {
        if (this.f56b == -1 || qVar.j().isEmpty()) {
            return;
        }
        if (this.f56b != (this.f58d ? ((l) AbstractC3689v.B0(qVar.j())).getIndex() + 1 : ((l) AbstractC3689v.q0(qVar.j())).getIndex() - 1)) {
            this.f56b = -1;
            d.b bVar = this.f57c;
            if (bVar != null) {
                bVar.cancel();
            }
            this.f57c = null;
        }
    }
}
