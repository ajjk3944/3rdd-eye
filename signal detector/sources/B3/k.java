package B3;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import e3.AbstractC2303a;
import java.util.ArrayList;
import m0.C2650a;

/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f605c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f606d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f607e;

    /* renamed from: f, reason: collision with root package name */
    public final l f608f;

    /* renamed from: g, reason: collision with root package name */
    public int f609g;

    /* renamed from: h, reason: collision with root package name */
    public float f610h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public c f611j;

    /* renamed from: k, reason: collision with root package name */
    public static final C2650a f601k = AbstractC2303a.f19928b;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f602l = {0, TTAdConstant.STYLE_SIZE_RADIO_3_2, 3000, 4500};

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f603m = {0.1f, 0.87f};

    /* renamed from: n, reason: collision with root package name */
    public static final h f604n = new h(2, Float.class, "animationFraction");

    /* renamed from: C, reason: collision with root package name */
    public static final h f600C = new h(3, Float.class, "completeEndFraction");

    public k(Context context, l lVar) {
        super(1);
        this.f609g = 0;
        this.f611j = null;
        this.f608f = lVar;
        this.f607e = com.bumptech.glide.d.P(context, R.attr.motionEasingStandardInterpolator, f601k);
    }

    public final void D() {
        ObjectAnimator objectAnimator = this.f605c;
        l lVar = this.f608f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f604n, 0.0f, 1.0f);
            this.f605c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (lVar.f571n * 6000.0f));
            this.f605c.setInterpolator(null);
            this.f605c.setRepeatCount(-1);
            this.f605c.addListener(new j(this, 0));
        }
        if (this.f606d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f600C, 0.0f, 1.0f);
            this.f606d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (lVar.f571n * 500.0f));
            this.f606d.addListener(new j(this, 1));
        }
    }

    @Override // B3.u
    public final void c() {
        ObjectAnimator objectAnimator = this.f605c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B3.u
    public final void q() {
        D();
        ObjectAnimator objectAnimator = this.f605c;
        l lVar = this.f608f;
        objectAnimator.setDuration((long) (lVar.f571n * 6000.0f));
        this.f606d.setDuration((long) (lVar.f571n * 500.0f));
        this.f609g = 0;
        ((r) ((ArrayList) this.f663b).get(0)).f648c = lVar.f563e[0];
        this.i = 0.0f;
    }

    @Override // B3.u
    public final void t(c cVar) {
        this.f611j = cVar;
    }

    @Override // B3.u
    public final void u() {
        ObjectAnimator objectAnimator = this.f606d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((v) this.f662a).isVisible()) {
            this.f606d.start();
        } else {
            c();
        }
    }

    @Override // B3.u
    public final void w() {
        D();
        this.f609g = 0;
        ((r) ((ArrayList) this.f663b).get(0)).f648c = this.f608f.f563e[0];
        this.i = 0.0f;
        this.f605c.start();
    }

    @Override // B3.u
    public final void x() {
        this.f611j = null;
    }
}
