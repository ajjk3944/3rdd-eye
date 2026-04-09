package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.c;
import bm.d;
import f1.e;
import g1.m;
import ht.g;
import kotlin.Metadata;
import l1.a;
import m1.b;
import m1.c0;
import n0.b2;
import n0.x0;
import n0.x1;
import t2.i;
import x1.h0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Ll1/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorPainter extends a {

    /* renamed from: e, reason: collision with root package name */
    public final x0 f1141e = c.f(new e(0));

    /* renamed from: f, reason: collision with root package name */
    public final x0 f1142f = c.f(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    public final c0 f1143g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f1144h;

    /* renamed from: i, reason: collision with root package name */
    public float f1145i;
    public m j;
    public int k;

    public VectorPainter(b bVar) {
        c0 c0Var = new c0(bVar);
        c0Var.f16151f = new g(24, this);
        this.f1143g = c0Var;
        this.f1144h = c.c();
        this.f1145i = 1.0f;
        this.k = -1;
    }

    @Override // l1.a
    public final void a(float f10) {
        this.f1145i = f10;
    }

    @Override // l1.a
    public final void b(m mVar) {
        this.j = mVar;
    }

    @Override // l1.a
    public final long d() {
        return ((e) ((b2) this.f1141e).getValue()).f8416a;
    }

    @Override // l1.a
    public final void e(h0 h0Var) {
        i1.b bVar = h0Var.f24844b;
        m mVar = this.j;
        c0 c0Var = this.f1143g;
        if (mVar == null) {
            mVar = (m) ((b2) c0Var.f16152g).getValue();
        }
        if (((Boolean) ((b2) this.f1142f).getValue()).booleanValue() && h0Var.getLayoutDirection() == i.Rtl) {
            long jH = bVar.H();
            d dVar = bVar.f11141c;
            long jH2 = dVar.H();
            dVar.y().g();
            try {
                ((h7.h0) dVar.f2826d).V(-1.0f, 1.0f, jH);
                c0Var.e(h0Var, this.f1145i, mVar);
            } finally {
                dVar.y().n();
                dVar.R(jH2);
            }
        } else {
            c0Var.e(h0Var, this.f1145i, mVar);
        }
        this.k = this.f1144h.l();
    }
}
