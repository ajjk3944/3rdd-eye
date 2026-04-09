package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p60 extends e6 {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final ae m = new ae(7, Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final v60 f;
    public int g;
    public boolean h;
    public float i;
    public fa j;

    public p60(Context context, v60 v60Var) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = v60Var;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
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
        ObjectAnimator objectAnimator = this.c;
        v60 v60Var = this.f;
        objectAnimator.setDuration((long) (v60Var.n * 1800.0f));
        this.d.setDuration((long) (v60Var.n * 1800.0f));
        x();
    }

    @Override // defpackage.e6
    public final void m(fa faVar) {
        this.j = faVar;
    }

    @Override // defpackage.e6
    public final void n() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((n20) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.e6
    public final void p() {
        w();
        x();
        this.c.start();
    }

    @Override // defpackage.e6
    public final void q() {
        this.j = null;
    }

    public final void w() {
        ObjectAnimator objectAnimator = this.c;
        v60 v60Var = this.f;
        ae aeVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aeVar, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (v60Var.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new o60(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aeVar, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (v60Var.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new o60(this, 1));
        }
    }

    public final void x() {
        this.g = 0;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cq) obj).c = this.f.e[0];
        }
    }
}
