package us;

import at.n;
import br.l;
import ht.b0;
import ht.c1;
import ht.i0;
import ht.m0;
import ht.p0;
import ht.x;
import java.util.List;
import jt.f;
import kt.g;
import kt.k;
import mq.w;

/* loaded from: classes.dex */
public final class a extends b0 implements lt.c {

    /* renamed from: d, reason: collision with root package name */
    public final p0 f23687d;

    /* renamed from: g, reason: collision with root package name */
    public final c f23688g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23689r;

    /* renamed from: x, reason: collision with root package name */
    public final i0 f23690x;

    public a(p0 p0Var, c cVar, boolean z10, i0 i0Var) {
        l.e(p0Var, "typeProjection");
        l.e(i0Var, "attributes");
        this.f23687d = p0Var;
        this.f23688g = cVar;
        this.f23689r = z10;
        this.f23690x = i0Var;
    }

    @Override // ht.x
    public final List L() {
        return w.f16945a;
    }

    @Override // ht.x
    public final n W() {
        return k.a(g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // ht.x
    public final i0 X() {
        return this.f23690x;
    }

    @Override // ht.x
    public final m0 Z() {
        return this.f23688g;
    }

    @Override // ht.x
    public final boolean c0() {
        return this.f23689r;
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        return new a(this.f23687d.d(fVar), this.f23688g, this.f23689r, this.f23690x);
    }

    @Override // ht.b0, ht.c1
    public final c1 p0(boolean z10) {
        if (z10 == this.f23689r) {
            return this;
        }
        return new a(this.f23687d, this.f23688g, z10, this.f23690x);
    }

    @Override // ht.c1
    public final c1 q0(f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        return new a(this.f23687d.d(fVar), this.f23688g, this.f23689r, this.f23690x);
    }

    @Override // ht.b0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f23687d);
        sb2.append(')');
        sb2.append(this.f23689r ? "?" : "");
        return sb2.toString();
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        if (z10 == this.f23689r) {
            return this;
        }
        return new a(this.f23687d, this.f23688g, z10, this.f23690x);
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        l.e(i0Var, "newAttributes");
        return new a(this.f23687d, this.f23688g, this.f23689r, i0Var);
    }
}
