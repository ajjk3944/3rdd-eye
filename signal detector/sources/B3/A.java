package B3;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A extends u {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f522k = {533, 567, 850, 750};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f523l = {1267, TTAdConstant.STYLE_SIZE_RADIO_1_1, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    public static final h f524m = new h(6, Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f525c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f526d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f527e;

    /* renamed from: f, reason: collision with root package name */
    public final B f528f;

    /* renamed from: g, reason: collision with root package name */
    public int f529g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f530h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public c f531j;

    public A(Context context, B b5) {
        super(2);
        this.f529g = 0;
        this.f531j = null;
        this.f528f = b5;
        this.f527e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    public final void D() {
        ObjectAnimator objectAnimator = this.f525c;
        int i = 0;
        B b5 = this.f528f;
        h hVar = f524m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, hVar, 0.0f, 1.0f);
            this.f525c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (b5.f571n * 1800.0f));
            this.f525c.setInterpolator(null);
            this.f525c.setRepeatCount(-1);
            this.f525c.addListener(new z(this, i));
        }
        if (this.f526d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, hVar, 1.0f);
            this.f526d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (b5.f571n * 1800.0f));
            this.f526d.setInterpolator(null);
            this.f526d.addListener(new z(this, 1));
        }
    }

    public final void E() {
        this.f529g = 0;
        ArrayList arrayList = (ArrayList) this.f663b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((r) obj).f648c = this.f528f.f563e[0];
        }
    }

    @Override // B3.u
    public final void c() {
        ObjectAnimator objectAnimator = this.f525c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B3.u
    public final void q() {
        D();
        ObjectAnimator objectAnimator = this.f525c;
        B b5 = this.f528f;
        objectAnimator.setDuration((long) (b5.f571n * 1800.0f));
        this.f526d.setDuration((long) (b5.f571n * 1800.0f));
        E();
    }

    @Override // B3.u
    public final void t(c cVar) {
        this.f531j = cVar;
    }

    @Override // B3.u
    public final void u() {
        ObjectAnimator objectAnimator = this.f526d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((v) this.f662a).isVisible()) {
            this.f526d.setFloatValues(this.i, 1.0f);
            this.f526d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.f526d.start();
        }
    }

    @Override // B3.u
    public final void w() {
        D();
        E();
        this.f525c.start();
    }

    @Override // B3.u
    public final void x() {
        this.f531j = null;
    }
}
