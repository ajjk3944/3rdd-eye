package eg;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.liuzh.deviceinfo.utilities.o;
import je.u;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class l extends ej.i {

    /* renamed from: l0, reason: collision with root package name */
    public i0.f f23472l0;

    /* renamed from: m0, reason: collision with root package name */
    public long f23473m0;

    /* renamed from: k0, reason: collision with root package name */
    public LottieAnimationView f23471k0 = null;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f23474n0 = false;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f23475o0 = false;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f23476p0 = false;

    @Override // ej.i, b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        int i4 = 0;
        if (bundle != null) {
            this.f23474n0 = bundle.getBoolean("isCompleted", false);
            this.f23475o0 = bundle.getBoolean("isPlayedCompleteAnim", false);
        }
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        if (com.liuzh.deviceinfo.utilities.f.g()) {
            return;
        }
        u.k(W(), new k(i4, this), ag.a.b("ca-app-pub-3724073793374078/7414422718"));
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        this.f23476p0 = true;
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        this.f23476p0 = false;
    }

    @Override // b5.z
    public final void O(Bundle bundle) {
        bundle.putBoolean("isCompleted", this.f23474n0);
        bundle.putBoolean("isPlayedCompleteAnim", this.f23475o0);
    }

    @Override // ej.i, b5.z
    public final void R(View view, Bundle bundle) {
        super.R(view, bundle);
        this.f23473m0 = System.currentTimeMillis();
    }

    @Override // ej.i
    public final void f0(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        Context context = frameLayout.getContext();
        if (this.f23471k0 == null) {
            this.f23471k0 = new LottieAnimationView(context);
        }
        int iC = a4.a.c(t(), 220.0f);
        this.f23471k0.setAnimation(o.f21286a);
        this.f23471k0.setRepeatCount(-1);
        frameLayout.addView(this.f23471k0, new FrameLayout.LayoutParams(iC, iC, 17));
        this.f23471k0.f();
    }

    @Override // ej.i
    public final void g0(kj.f fVar) {
        if (i0.l(n()) || this.C || !y()) {
            return;
        }
        if (this.f23474n0) {
            j0(fVar);
            return;
        }
        this.f23508d0 = fVar;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f23473m0;
        long j = 3000;
        if (jCurrentTimeMillis < 3000) {
            j = 5000;
        } else if (jCurrentTimeMillis >= 8000) {
            j = 0;
        }
        this.f23471k0.postDelayed(new vd.a(this, false, fVar, 27), this.f23475o0 ? 0L : j);
    }

    @Override // ej.i
    public final void h0(FrameLayout frameLayout) {
        LottieAnimationView lottieAnimationView = this.f23471k0;
        if (lottieAnimationView != null) {
            frameLayout.removeView(lottieAnimationView);
            this.f23471k0.a();
        }
    }

    public final void j0(kj.f fVar) {
        super.g0(fVar);
        this.f23474n0 = true;
    }
}
