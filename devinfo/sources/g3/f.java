package g3;

import android.graphics.Canvas;
import com.google.android.gms.internal.ads.xz;
import i2.e0;
import i2.m1;
import i2.y1;
import i2.z1;
import me.t1;
import nm.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24466c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, e0 e0Var, x xVar2) {
        super(1);
        this.f24464a = 0;
        this.f24465b = xVar;
        this.f24467d = e0Var;
        this.f24466c = xVar2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [mk.c, nk.l] */
    @Override // mk.c
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.f24464a) {
            case 0:
                x xVar = (x) this.f24465b;
                e0 e0Var = (e0) this.f24467d;
                x xVar2 = (x) this.f24466c;
                p1.q qVarX = ((r1.d) obj).M().x();
                if (xVar.getView().getVisibility() != 8) {
                    xVar.f24500y = true;
                    m1 m1Var = e0Var.f25639o;
                    j2.r rVar = m1Var instanceof j2.r ? (j2.r) m1Var : null;
                    if (rVar != null) {
                        Canvas canvasA = p1.d.a(qVarX);
                        rVar.getAndroidViewsHandler$ui().getClass();
                        xVar2.draw(canvasA);
                    }
                    xVar.f24500y = false;
                }
                return yj.u.f37649a;
            case 1:
                z1 z1Var = (z1) obj;
                l1.e eVar = (l1.e) z1Var;
                if (!((l1.b) ((j2.r) i2.k.t((l1.e) this.f24466c)).m191getDragAndDropManager()).f28539b.contains(eVar) || !jm.a.a(eVar, t1.p((jf.c) this.f24467d))) {
                    return y1.f25816a;
                }
                ((nk.u) this.f24465b).f29986a = z1Var;
                return y1.f25818c;
            case 2:
                n1.s sVar = (n1.s) obj;
                if (nk.k.a(sVar, (n1.s) this.f24465b)) {
                    zBooleanValue = false;
                } else {
                    if (nk.k.a(sVar, (n1.s) ((xz) this.f24466c).f18586c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((nk.l) this.f24467d).invoke(sVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                c0 c0Var = (c0) obj;
                nk.k.e(c0Var, "item");
                long jB = c0Var.b();
                o1.c cVarI = com.bumptech.glide.e.i(com.bumptech.glide.d.a((int) (jB >> 32), (int) (jB & 4294967295L)), t1.F(c0Var.c()));
                nm.e0 e0Var2 = (nm.e0) this.f24465b;
                return Boolean.valueOf(((Boolean) e0Var2.f30021i.invoke((o1.c) this.f24466c, cVarI)).booleanValue() && e0Var2.f30029r.contains(c0Var.f30008a.f25486i) && ((Boolean) ((mk.c) this.f24467d).invoke(c0Var)).booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i4) {
        super(1);
        this.f24464a = i4;
        this.f24465b = obj;
        this.f24466c = obj2;
        this.f24467d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(n1.s sVar, xz xzVar, mk.c cVar) {
        super(1);
        this.f24464a = 2;
        this.f24465b = sVar;
        this.f24466c = xzVar;
        this.f24467d = (nk.l) cVar;
    }
}
