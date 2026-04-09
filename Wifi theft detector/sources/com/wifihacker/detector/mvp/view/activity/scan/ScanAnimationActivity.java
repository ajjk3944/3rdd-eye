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
import g8.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import l8.y;

/* loaded from: classes3.dex */
public class ScanAnimationActivity extends BaseActivity<y> {

    /* renamed from: j, reason: collision with root package name */
    public AnimatorSet f20441j;

    /* renamed from: k, reason: collision with root package name */
    public ObjectAnimator f20442k;

    /* renamed from: l, reason: collision with root package name */
    public ObjectAnimator f20443l;

    /* renamed from: m, reason: collision with root package name */
    public ObjectAnimator f20444m;

    /* renamed from: n, reason: collision with root package name */
    public ObjectAnimator f20445n;

    /* renamed from: o, reason: collision with root package name */
    public List f20446o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20447p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20448q = false;

    /* renamed from: r, reason: collision with root package name */
    public Timer f20449r = new Timer();

    public class a extends TimerTask {

        /* renamed from: com.wifihacker.detector.mvp.view.activity.scan.ScanAnimationActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0380a implements Runnable {
            public RunnableC0380a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    int iM = HackerApplication.l().m();
                    if (iM <= 10000) {
                        ((y) ScanAnimationActivity.this.f20418i).f23359x.setText("" + iM);
                        return;
                    }
                    ScanAnimationActivity.this.f20449r.cancel();
                    ScanAnimationActivity.this.m0();
                    HackerApplication.l().z(false);
                    ScanAnimationActivity scanAnimationActivity = ScanAnimationActivity.this;
                    h.l(scanAnimationActivity, null, scanAnimationActivity.f20447p, false);
                    ScanAnimationActivity.this.finish();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            ScanAnimationActivity.this.runOnUiThread(new RunnableC0380a());
        }
    }

    public class b implements i8.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f20452a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                f.c(ScanAnimationActivity.this, bVar.f20452a, null);
                b bVar2 = b.this;
                ScanAnimationActivity.this.n0(bVar2.f20452a);
            }
        }

        /* renamed from: com.wifihacker.detector.mvp.view.activity.scan.ScanAnimationActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0381b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f20455a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f20456b;

            public RunnableC0381b(String str, String str2) {
                this.f20455a = str;
                this.f20456b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                if (bVar.f20452a == null) {
                    bVar.f20452a = new ArrayList();
                }
                HostInfo hostInfo = new HostInfo();
                String str = this.f20455a;
                hostInfo.ipAddress = str;
                hostInfo.hostName = this.f20456b;
                if (TextUtils.equals(str, i8.b.k().h())) {
                    hostInfo.isMine = true;
                }
                if (TextUtils.equals(this.f20455a, i8.b.k().i())) {
                    hostInfo.isGateWay = true;
                }
                b.this.f20452a.add(hostInfo);
                ((y) ScanAnimationActivity.this.f20418i).f23359x.setText(String.valueOf(b.this.f20452a.size()));
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                ScanAnimationActivity.this.n0(bVar.f20452a);
            }
        }

        public b() {
        }

        @Override // i8.a
        public void a(String str, String str2) {
            ScanAnimationActivity.this.runOnUiThread(new RunnableC0381b(str, str2));
        }

        @Override // i8.a
        public void b(HashMap map) {
            ScanAnimationActivity.this.runOnUiThread(new a());
        }

        @Override // i8.a
        public void c() {
            ScanAnimationActivity.this.runOnUiThread(new c());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public float[] f20459a = new float[2];

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Path f20460b;

        public c(Path path) {
            this.f20460b = path;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            PathMeasure pathMeasure = new PathMeasure(this.f20460b, true);
            pathMeasure.getPosTan(pathMeasure.getLength() * animatedFraction, this.f20459a, null);
            ((y) ScanAnimationActivity.this.f20418i).f23361z.setX(this.f20459a[0]);
            ((y) ScanAnimationActivity.this.f20418i).f23361z.setY(this.f20459a[1]);
        }
    }

    public class d implements z7.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f20462a;

        /* renamed from: b, reason: collision with root package name */
        public HashSet f20463b = null;

        /* renamed from: c, reason: collision with root package name */
        public HashMap f20464c = null;

        public d() {
        }

        @Override // z7.a
        public void a(HostInfo hostInfo) {
        }

        @Override // z7.a
        public void b(int i10) {
        }

        @Override // z7.a
        public void c(HostInfo hostInfo) {
            if (this.f20462a == null) {
                this.f20462a = new ArrayList();
            }
            if (ScanAnimationActivity.this.f20446o == null) {
                ScanAnimationActivity scanAnimationActivity = ScanAnimationActivity.this;
                scanAnimationActivity.f20446o = f.b(scanAnimationActivity);
            }
            this.f20462a.add(hostInfo);
            ((y) ScanAnimationActivity.this.f20418i).f23359x.setText(String.valueOf(this.f20462a.size()));
        }

        @Override // z7.a
        public void onFinish() {
            if (ScanAnimationActivity.this.f20446o == null) {
                ScanAnimationActivity scanAnimationActivity = ScanAnimationActivity.this;
                scanAnimationActivity.f20446o = f.b(scanAnimationActivity);
            }
            ScanAnimationActivity scanAnimationActivity2 = ScanAnimationActivity.this;
            f.c(scanAnimationActivity2, this.f20462a, scanAnimationActivity2.f20446o);
            f.d(ScanAnimationActivity.this, this.f20462a);
            ScanAnimationActivity.this.f20446o = null;
            ScanAnimationActivity.this.n0(this.f20462a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        ObjectAnimator objectAnimator = this.f20442k;
        if (objectAnimator == null) {
            return;
        }
        try {
            objectAnimator.cancel();
            this.f20441j.cancel();
            this.f20443l.cancel();
            this.f20444m.cancel();
            this.f20445n.cancel();
        } catch (Exception e10) {
            k.b(Log.getStackTraceString(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(ArrayList arrayList) {
        m0();
        if (!s.o() && !s.t()) {
            h8.c.d().g();
        }
        HackerApplication.l().z(false);
        h.l(this, arrayList, this.f20447p, false);
        finish();
    }

    private void o0() {
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
        valueAnimatorOfFloat.addUpdateListener(new c(path));
        valueAnimatorOfFloat.start();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((y) this.f20418i).f23360y, "rotation", 0.0f, 360.0f);
        this.f20442k = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.f20442k.setDuration(3000L);
        this.f20442k.setInterpolator(new LinearInterpolator());
        this.f20442k.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "scaleX", 1.0f, 1.8f);
        this.f20443l = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "scaleY", 1.0f, 1.8f);
        this.f20444m = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(((y) this.f20418i).A, "alpha", 1.0f, 0.0f);
        this.f20445n = objectAnimatorOfFloat4;
        objectAnimatorOfFloat4.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f20441j = animatorSet;
        animatorSet.setDuration(1000L);
        this.f20441j.setInterpolator(new LinearInterpolator());
        this.f20441j.play(this.f20443l).with(this.f20444m).with(this.f20445n);
        this.f20441j.start();
    }

    private void p0() {
        w7.a.b().f(this, new d());
    }

    private void q0() {
        if (i8.b.k().l()) {
            r.a(R.string.rescan_toast);
            finish();
        } else {
            ((y) this.f20418i).f23359x.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            i8.b.k().p(getApplicationContext(), new b());
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
        if (this.f20448q) {
            this.f20449r.schedule(new a(), 500L, 500L);
        } else if (Build.VERSION.SDK_INT < 30) {
            p0();
        } else {
            q0();
        }
        if (s.o() || s.t()) {
            return;
        }
        h8.c.d().g();
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Y() {
        super.Y();
        HackerApplication.l().y(true);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void Z() {
        this.f20447p = getIntent().getBooleanExtra("main", false);
        this.f20448q = getIntent().getBooleanExtra("first_scan", false);
    }

    @Override // com.wifihacker.detector.mvp.view.activity.base.BaseActivity
    public void a0() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            this.f20449r.cancel();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            o0();
        }
    }
}
