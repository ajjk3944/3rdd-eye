package B3;

import android.animation.ObjectAnimator;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import m0.C2650a;

/* loaded from: classes.dex */
public final class i extends u {

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f591c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f592d;

    /* renamed from: e, reason: collision with root package name */
    public final C2650a f593e;

    /* renamed from: f, reason: collision with root package name */
    public final l f594f;

    /* renamed from: g, reason: collision with root package name */
    public int f595g;

    /* renamed from: h, reason: collision with root package name */
    public float f596h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public c f597j;

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f587k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f588l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f589m = {TTAdConstant.STYLE_SIZE_RADIO_1_1, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final h f590n = new h(0, Float.class, "animationFraction");

    /* renamed from: C, reason: collision with root package name */
    public static final h f586C = new h(1, Float.class, "completeEndFraction");

    public i(l lVar) {
        super(1);
        this.f595g = 0;
        this.f597j = null;
        this.f594f = lVar;
        this.f593e = new C2650a(1);
    }

    public final void D() {
        ObjectAnimator objectAnimator = this.f591c;
        l lVar = this.f594f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f590n, 0.0f, 1.0f);
            this.f591c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (lVar.f571n * 5400.0f));
            this.f591c.setInterpolator(null);
            this.f591c.setRepeatCount(-1);
            this.f591c.addListener(new g(this, 0));
        }
        if (this.f592d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f586C, 0.0f, 1.0f);
            this.f592d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (lVar.f571n * 333.0f));
            this.f592d.setInterpolator(this.f593e);
            this.f592d.addListener(new g(this, 1));
        }
    }

    @Override // B3.u
    public final void c() {
        ObjectAnimator objectAnimator = this.f591c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // B3.u
    public final void q() {
        D();
        ObjectAnimator objectAnimator = this.f591c;
        l lVar = this.f594f;
        objectAnimator.setDuration((long) (lVar.f571n * 5400.0f));
        this.f592d.setDuration((long) (lVar.f571n * 333.0f));
        this.f595g = 0;
        ((r) ((ArrayList) this.f663b).get(0)).f648c = lVar.f563e[0];
        this.i = 0.0f;
    }

    @Override // B3.u
    public final void t(c cVar) {
        this.f597j = cVar;
    }

    @Override // B3.u
    public final void u() {
        ObjectAnimator objectAnimator = this.f592d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((v) this.f662a).isVisible()) {
            this.f592d.start();
        } else {
            c();
        }
    }

    @Override // B3.u
    public final void w() {
        D();
        this.f595g = 0;
        ((r) ((ArrayList) this.f663b).get(0)).f648c = this.f594f.f563e[0];
        this.i = 0.0f;
        this.f591c.start();
    }

    @Override // B3.u
    public final void x() {
        this.f597j = null;
    }
}
