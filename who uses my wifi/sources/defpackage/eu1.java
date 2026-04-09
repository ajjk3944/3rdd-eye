package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eu1 extends hu1 {
    public final nt1 h;
    public final long i;

    public eu1(jt1 jt1Var, fr1 fr1Var, int i, nt1 nt1Var) {
        super(jt1Var, "7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", fr1Var, i, 53);
        this.h = nt1Var;
        if (nt1Var != null) {
            if (nt1Var.q <= -2) {
                WeakReference weakReference = nt1Var.m;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    nt1Var.q = -3L;
                }
            }
            this.i = nt1Var.q;
        }
    }

    @Override // defpackage.hu1
    public final void a() {
        if (this.h != null) {
            long jLongValue = ((Long) this.e.invoke(null, Long.valueOf(this.i))).longValue();
            fr1 fr1Var = this.d;
            fr1Var.b();
            ((qr1) fr1Var.g).S(jLongValue);
        }
    }
}
