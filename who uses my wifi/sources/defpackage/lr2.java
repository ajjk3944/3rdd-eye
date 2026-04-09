package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lr2 implements ov1 {
    public final /* synthetic */ String f;
    public final /* synthetic */ pr2 g;

    public lr2(pr2 pr2Var, String str) {
        this.f = str;
        this.g = pr2Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hv1, rs2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [hv1, rs2] */
    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        if (!((Boolean) tw1.e.c.a(mz1.R1)).booleanValue()) {
            if (nv1Var.j) {
                pr2 pr2Var = this.g;
                if (pr2Var.w != null) {
                    pr2Var.H.put(this.f, Boolean.TRUE);
                    ?? r0 = pr2Var.w;
                    if (r0 == 0) {
                        return;
                    }
                    pr2Var.t(r0.X0(), r0.g(), r0.k(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (nv1Var.j) {
                    pr2 pr2Var2 = this.g;
                    if (pr2Var2.w != null) {
                        pr2Var2.H.put(this.f, Boolean.TRUE);
                        ?? r02 = pr2Var2.w;
                        if (r02 == 0) {
                        } else {
                            pr2Var2.t(r02.X0(), pr2Var2.w.g(), pr2Var2.w.k(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
