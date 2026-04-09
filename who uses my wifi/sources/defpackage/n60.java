package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n60 extends e6 {
    public static final ae i = new ae(6, Float.class, "animationFraction");
    public ObjectAnimator c;
    public final fu d;
    public final v60 e;
    public int f;
    public boolean g;
    public float h;

    public n60(v60 v60Var) {
        super(3);
        this.f = 1;
        this.e = v60Var;
        this.d = new fu(1);
    }

    @Override // defpackage.e6
    public final void c() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.e6
    public final void k() {
        w();
        this.c.setDuration((long) (this.e.n * 333.0f));
        x();
    }

    @Override // defpackage.e6
    public final void p() {
        w();
        x();
        this.c.start();
    }

    public final void w() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new n1(7, this));
        }
    }

    public final void x() {
        this.g = true;
        this.f = 1;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            cq cqVar = (cq) obj;
            v60 v60Var = this.e;
            cqVar.c = v60Var.e[0];
            cqVar.d = v60Var.i / 2;
        }
    }

    @Override // defpackage.e6
    public final void n() {
    }

    @Override // defpackage.e6
    public final void q() {
    }

    @Override // defpackage.e6
    public final void m(fa faVar) {
    }
}
