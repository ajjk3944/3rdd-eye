package kt;

import at.n;
import ht.b0;
import ht.c1;
import ht.i0;
import ht.m0;
import ht.x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends b0 {
    public final String[] B;
    public final String D;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f14512d;

    /* renamed from: g, reason: collision with root package name */
    public final f f14513g;

    /* renamed from: r, reason: collision with root package name */
    public final j f14514r;

    /* renamed from: x, reason: collision with root package name */
    public final List f14515x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f14516y;

    public h(m0 m0Var, f fVar, j jVar, List list, boolean z10, String... strArr) {
        br.l.e(jVar, "kind");
        br.l.e(list, "arguments");
        br.l.e(strArr, "formatParams");
        this.f14512d = m0Var;
        this.f14513g = fVar;
        this.f14514r = jVar;
        this.f14515x = list;
        this.f14516y = z10;
        this.B = strArr;
        String debugMessage = jVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.D = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // ht.x
    public final List L() {
        return this.f14515x;
    }

    @Override // ht.x
    public final n W() {
        return this.f14513g;
    }

    @Override // ht.x
    public final i0 X() {
        i0.f10910d.getClass();
        return i0.f10911g;
    }

    @Override // ht.x
    public final m0 Z() {
        return this.f14512d;
    }

    @Override // ht.x
    public final boolean c0() {
        return this.f14516y;
    }

    @Override // ht.x
    /* renamed from: h0 */
    public final x q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // ht.c1
    public final c1 q0(jt.f fVar) {
        br.l.e(fVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // ht.b0, ht.c1
    public final c1 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return this;
    }

    @Override // ht.b0
    /* renamed from: u0 */
    public final b0 p0(boolean z10) {
        String[] strArr = this.B;
        return new h(this.f14512d, this.f14513g, this.f14514r, this.f14515x, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // ht.b0
    /* renamed from: v0 */
    public final b0 r0(i0 i0Var) {
        br.l.e(i0Var, "newAttributes");
        return this;
    }
}
