package com.wifihacker.detector.mvp.view.activity.scan;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.Toolbar;
import com.mbridge.msdk.MBridgeConstans;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.f;
import g8.h;
import g8.k;
import g8.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l8.y;

/* loaded from: classes3.dex */
public class QuickScanAnimationActivity extends BaseActivity<y> {

    /* renamed from: j, reason: collision with root package name */
    public AnimatorSet f20420j;

    /* renamed from: k, reason: collision with root package name */
    public ObjectAnimator f20421k;

    /* renamed from: l, reason: collision with root package name */
    public ObjectAnimator f20422l;

    /* renamed from: m, reason: collision with root package name */
    public ObjectAnimator f20423m;

    /* renamed from: n, reason: collision with root package name */
    public ObjectAnimator f20424n;

    /* renamed from: o, reason: collision with root package name */
    public List f20425o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20426p = false;

    public class a implements i8.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f20427a;

        /* renamed from: com.wifihacker.detector.mvp.view.activity.scan.QuickScanAnimationActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0379a implements Runnable {
            public RunnableC0379a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                f.c(QuickScanAnimationActivity.this, aVar.f20427a, null);
                a aVar2 = a.this;
                QuickScanAnimationActivity.this.j0(aVar2.f20427a);
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f20430a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f20431b;

            public b(String str, String str2) {
                this.f20430a = str;
                this.f20431b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                if (aVar.f20427a == null) {
                    aVar.f20427a = new ArrayList();
                }
                HostInfo hostInfo = new HostInfo();
                String str = this.f20430a;
                hostInfo.ipAddress = str;
                hostInfo.hostName = this.f20431b;
                if (TextUtils.equals(str, i8.b.k().h())) {
                    hostInfo.isMine = true;
                }
                if (TextUtils.equals(this.f20430a, i8.b.k().i())) {
                    hostInfo.isGateWay = true;
                }
                a.this.f20427a.add(hostInfo);
                ((y) QuickScanAnimationActivity.this.f20418i).f23359x.setText(String.valueOf(a.this.f20427a.size()));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                QuickScanAnimationActivity.this.j0(aVar.f20427a);
            }
        }

        public a() {
        }

        @Override // i8.a
        public void a(String str, String str2) {
            QuickScanAnimationActivity.this.runOnUiThread(new b(str, str2));
        }

        @Override // i8.a
        public void b(HashMap map) {
            QuickScanAnimationActivity.this.runOnUiThread(new RunnableC0379a());
        }

        @Override // i8.a
        public void c() {
            QuickScanAnimationActivity.this.runOnUiThread(new c());
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public float[] f20434a = new float[2];

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Path f20435b;

        public b(Path path) {
            this.f20435b = path;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            PathMeasure pathMeasure = new PathMeasure(this.f20435b, true);
            pathMeasure.getPosTan(pathMeasure.getLength() * animatedFraction, this.f20434a, null);
            ((y) QuickScanAnimationActivity.this.f20418i).f23361z.setX(this.f20434a[0]);
            ((y) QuickScanAnimationActivity.this.f20418i).f23361z.setY(this.f20434a[1]);
        }
    }

    public class c implements z7.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f20437a;

        /* renamed from: b, reason: collision with root package name */
        public HashSet f20438b = null;

        /* renamed from: c, reason: collision with root package name */
        public HashMap f20439c = null;

        public c() {
        }

        @Override // z7.a
        public void a(HostInfo hostInfo) {
        }

        @Override // z7.a
        public void b(int i10) {
        }

        @Override // z7.a
        public void c(HostInfo hostInfo) {
            if (this.f20437a == null) {
                this.f20437a = new ArrayList();
            }
            if (QuickScanAnimationActivity.this.f20425o == null) {
                QuickScanAnimationActivity quickScanAnimationActivity = QuickScanAnimationActivity.this;
                quickScanAnimationActivity.f20425o = f.b(quickScanAnimationActivity);
            }
            this.f20437a.add(hostInfo);
            ((y) QuickScanAnimationActivity.this.f20418i).f23359x.setText(this.f20437a.size() + "");
        }

        @Override // z7.a
        public void onFinish() {
            if (QuickScanAnimationActivity.this.f20425o == null) {
                QuickScanAnimationActivity quickScanAnimationActivity = QuickScanAnimationActivity.this;
                quickScanAnimationActivity.f20425o = f.b(quickScanAnimationActivity);
            }
            QuickScanAnimationActivity quickScanAnimationActivity2 = QuickScanAnimationActivity.this;
            f.c(quickScanAnimationActivity2, this.f20437a, quickScanAnimationActivity2.f20425o);
            f.d(QuickScanAnimationActivity.this, this.f20437a);
            QuickScanAnimationActivity.this.f20425o = null;
            QuickScanAnimationActivity.this.j0(this.f20437a);
        }
    }

    private void k0() {
        int left = ((y) this.f20418i).f23361z.getLeft();
        int top = ((y) this.f20418i).f23361z.getTop();
        int right = ((y) this.f20418i).f23361z.getRight();
        int bottom = ((y) this.f20418i).f23361z.getBottom();
        int i10 = ((right - left) / 2) - 15;
        int i11 = ((y) this.f20418i).f23361z.getLayoutParams().width / 2;
        int i12 = ((y) this.f20418i).f23361z.getLayoutParams().height / 2;
        RectF rectF = new RectF((left - i11) + i10, (top - i12) + i10, (right - i11) - i10, (bottom - i12) - i10);
        Path path = new Path();
        path.arcTo(rectF, 0.0f, 359.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new b(path));
        valueAnimatorOfFloat.start();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((y) this.f20418i).f23360y, "rotation", 0.0f, 360.0f);
        this.f20421k = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.f20421k.setDuration(3000L);
        this.f20421k.setInterpolator(new LinearInterpolator());
        this.f20421k.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "scaleX", 1.0f, 1.8f);
        this.f20422l = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "scaleY", 1.0f, 1.8f);
        this.f20423m = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "alpha", 1.0f, 0.0f);
        this.f20424n = objectAnimatorOfFloat4;
        objectAnimatorOfFloat4.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f20420j = animatorSet;
        animatorSet.setDuration(1000L);
        this.f20420j.setInterpolator(new LinearInterpolator());
        this.f20420j.play(this.f20422l).with(this.f20423m).with(this.f20424n);
        this.f20420j.start();
    }

    private void m0() {
        if (i8.b.k().l()) {
            r.a(R.string.rescan_toast);
        } else {
            ((y) this.f20418i).f23359x.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            i8.b.k().p(getApplicationContext(), new a());
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public boolean S() {
        return false;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public String T() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public Toolbar U() {
        return null;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public int V() {
        return R.layout.activity_scan_animation;
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void W(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 30) {
            l0();
        } else {
            m0();
        }
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20426p = getIntent().getBooleanExtra("back_main", false);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    public final void i0() {
        ObjectAnimator objectAnimator = this.f20421k;
        if (objectAnimator == null) {
            return;
        }
        try {
            objectAnimator.cancel();
            this.f20420j.cancel();
            this.f20422l.cancel();
            this.f20423m.cancel();
            this.f20424n.cancel();
        } catch (Exception e10) {
            k.b(Log.getStackTraceString(e10));
        }
    }

    public final void j0(ArrayList arrayList) {
        i0();
        HackerApplication.l().z(false);
        h.l(this, arrayList, false, this.f20426p);
        finish();
    }

    public final void l0() {
        HackerApplication.l().z(true);
        w7.a.b().f(this, new c());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            k0();
        }
    }
}
