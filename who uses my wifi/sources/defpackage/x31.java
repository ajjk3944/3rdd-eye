package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x31 extends ht0 {
    public final ThreadLocal j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public x31(hk hkVar, qj qjVar) {
        y31 y31Var = y31.f;
        super(hkVar.h(y31Var) == null ? hkVar.g(y31Var) : hkVar, qjVar);
        this.j = new ThreadLocal();
        if (qjVar.getContext().h(pz.h) instanceof lk) {
            return;
        }
        Object objY = wl2.y(hkVar, null);
        wl2.v(hkVar, objY);
        S(hkVar, objY);
    }

    public final boolean R() {
        boolean z = this.threadLocalIsSet && this.j.get() == null;
        this.j.remove();
        return !z;
    }

    public final void S(hk hkVar, Object obj) {
        this.threadLocalIsSet = true;
        this.j.set(new gk0(hkVar, obj));
    }

    @Override // defpackage.ht0, defpackage.g40
    public final void n(Object obj) {
        if (this.threadLocalIsSet) {
            gk0 gk0Var = (gk0) this.j.get();
            if (gk0Var != null) {
                wl2.v((hk) gk0Var.f, gk0Var.g);
            }
            this.j.remove();
        }
        Object objW = i41.w(obj);
        qj qjVar = this.i;
        hk context = qjVar.getContext();
        Object objY = wl2.y(context, null);
        x31 x31VarY = objY != wl2.i ? bd2.y(qjVar, context, objY) : null;
        try {
            this.i.e(objW);
            if (x31VarY == null || x31VarY.R()) {
                wl2.v(context, objY);
            }
        } catch (Throwable th) {
            if (x31VarY == null || x31VarY.R()) {
                wl2.v(context, objY);
            }
            throw th;
        }
    }
}
