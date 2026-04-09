package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m41 extends ba {
    public final Object i;

    public m41(Object obj, vq2 vq2Var) {
        super(Collections.EMPTY_LIST);
        j(vq2Var);
        this.i = obj;
    }

    @Override // defpackage.ba
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.ba
    public final Object e() {
        vq2 vq2Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return vq2Var.j(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.ba
    public final Object f(w40 w40Var, float f) {
        return e();
    }

    @Override // defpackage.ba
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.ba
    public final void i(float f) {
        this.d = f;
    }
}
