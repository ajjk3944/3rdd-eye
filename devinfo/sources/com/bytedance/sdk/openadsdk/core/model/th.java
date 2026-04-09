package com.bytedance.sdk.openadsdk.core.model;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b9.b;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.lh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class th implements Handler.Callback {
    public View bly;
    public ValueAnimator bs;

    /* renamed from: cd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f8263cd;

    /* renamed from: cf, reason: collision with root package name */
    public TextView f8264cf;

    /* renamed from: cj, reason: collision with root package name */
    public int f8265cj;
    private boolean coz;
    public FrameLayout ex;
    public com.bytedance.sdk.openadsdk.core.lh.vt ey;
    public ObjectAnimator fak;
    public FrameLayout fkw;
    public ILoader fqk;
    public ObjectAnimator fvf;
    public final View jae;

    /* renamed from: jg, reason: collision with root package name */
    public bs f8266jg;
    public final vpp jqy;
    public String jvy;
    public FrameLayout kn;
    public com.bytedance.sdk.component.bly.le ko;
    public final com.bytedance.sdk.openadsdk.core.mwh.yu.vt ksc;

    /* renamed from: le, reason: collision with root package name */
    public View f8267le;

    /* renamed from: lh, reason: collision with root package name */
    public FrameLayout f8268lh;
    private com.bytedance.sdk.openadsdk.core.bly.qbp lvd;
    private final boolean mq;
    public TextView mwh;
    public ValueAnimator myk;

    /* renamed from: od, reason: collision with root package name */
    public int f8270od;
    com.bytedance.sdk.openadsdk.core.lh.ouw osn;
    public Handler ouw;

    /* renamed from: pd, reason: collision with root package name */
    public boolean f8271pd;
    public View pno;
    public com.bytedance.sdk.openadsdk.common.fkw pv;
    public View qbp;
    public RelativeLayout ra;
    public FrameLayout rn;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.fkw rrs;
    public com.bytedance.sdk.openadsdk.core.widget.zih ryl;
    public String tc;

    /* renamed from: th, reason: collision with root package name */
    public ImageView f8273th;
    public TextView tlj;

    /* renamed from: ub, reason: collision with root package name */
    public int f8274ub;
    public AtomicBoolean ucs;
    public b uoy;
    public com.bytedance.sdk.openadsdk.yu.mwh uq;

    /* renamed from: vh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.zih f8275vh;
    public View vm;
    public final Activity vpp;
    public ImageView vt;
    public com.bytedance.sdk.openadsdk.core.le.yu wp;
    public LinearLayout.LayoutParams yhj;
    public com.bytedance.sdk.openadsdk.core.le.pno yib;
    public TextView yu;
    public com.bytedance.sdk.openadsdk.common.mwh zih;
    public long zin;
    public vt zvq;

    /* renamed from: ng, reason: collision with root package name */
    private final AtomicBoolean f8269ng = new AtomicBoolean(false);
    private final AtomicBoolean fwd = new AtomicBoolean(false);
    public volatile int hun = 0;
    public volatile int ux = 0;
    public volatile int lso = 0;

    /* renamed from: sd, reason: collision with root package name */
    private float f8272sd = -1.0f;
    public final AtomicBoolean mt = new AtomicBoolean(false);
    public long xdk = -1;
    private final AtomicBoolean euf = new AtomicBoolean(false);
    private long njr = 0;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.fkw.pno {
        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), bitmap, 25);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements com.bytedance.sdk.openadsdk.yu.ryl {

        /* renamed from: lh, reason: collision with root package name */
        private final String f8280lh;
        private final int ouw;
        private final vpp vt;
        private final WeakReference<th> yu;

        public vt(int i4, vpp vppVar, String str, th thVar) {
            this.ouw = i4;
            this.vt = vppVar;
            this.f8280lh = str;
            this.yu = new WeakReference<>(thVar);
        }

        @Override // com.bytedance.sdk.openadsdk.yu.ryl
        public final void ouw(int i4) {
            th thVar = this.yu.get();
            if (thVar != null) {
                lh.ouw.ouw(this.ouw, thVar.lso, thVar.ux, thVar.hun - thVar.ux, this.vt, this.f8280lh, i4);
            }
        }
    }

    public th(Activity activity, final vpp vppVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, View view) {
        this.vpp = activity;
        this.jqy = vppVar;
        this.tc = str;
        this.ksc = vtVar;
        this.jae = view;
        this.f8270od = uoy.ouw(str);
        if (vppVar != null) {
            this.jvy = vppVar.f8298ki;
        }
        this.mq = vppVar.tpk && fkw(vppVar);
        if (!TextUtils.isEmpty(this.jvy)) {
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            this.fqk = com.bytedance.sdk.openadsdk.ra.vt.vt();
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.fqk, this.jvy);
            this.f8274ub = iOuw;
            this.f8265cj = iOuw > 0 ? 2 : 0;
        }
        boolean zYu = yu(vppVar);
        boolean zRa = ra(vppVar);
        boolean zVt = vt(vppVar);
        if (zVt) {
            this.tc = "landingpage_split_screen";
        } else if (zYu) {
            this.tc = "landingpage_direct";
        } else if (zRa) {
            this.tc = "aggregate_page";
        } else if (lh(vppVar)) {
            this.tc = "landingpage_split_ceiling";
        }
        this.osn = new com.bytedance.sdk.openadsdk.core.lh.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), vppVar, this.tc, uoy.ouw(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.osn.ouw(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.osn.ouw(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.lh.vt(activity, vppVar, this.tc, uoy.ouw(str)) { // from class: com.bytedance.sdk.openadsdk.core.model.th.1
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt
            public final boolean ouw(cf cfVar, Map<String, Object> map2) {
                if (th.tlj(vppVar) && th.this.rrs != null) {
                    th.this.rrs.f8479cf = cfVar;
                    th.this.rrs.ryl = map2;
                    if (th.bly(th.this.jqy) || th.this.coz) {
                        return true;
                    }
                }
                return super.ouw(cfVar, map2);
            }
        };
        this.ey = vtVar2;
        vtVar2.ouw(map);
        this.ey.ouw(viewFindViewById);
        this.ex = frameLayout;
        if (zVt || zYu || zRa) {
            try {
                this.ouw = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e2) {
                Log.e("LandingPageModel", "LandingPageModel: ", e2);
                return;
            }
        }
        if (vppVar.tpk) {
            return;
        }
        if (zYu || zRa) {
            Handler handler = this.ouw;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static /* synthetic */ int jg(th thVar) {
        int i4 = thVar.ux;
        thVar.ux = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int ko(th thVar) {
        int i4 = thVar.lso;
        thVar.lso = i4 + 1;
        return i4;
    }

    public static boolean ouw(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 4 || i4 == 5;
    }

    public static /* synthetic */ int ryl(th thVar) {
        int i4 = thVar.hun;
        thVar.hun = i4 + 1;
        return i4;
    }

    public static /* synthetic */ boolean uq(th thVar) {
        return vpp.fkw(thVar.jqy);
    }

    public static /* synthetic */ boolean vpp(th thVar) {
        thVar.coz = true;
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        vpp vppVar;
        qbp qbpVar;
        vpp vppVar2;
        qbp qbpVar2;
        int i4 = message.what;
        if (i4 == 100) {
            int i10 = message.arg1;
            long j = (!yu(this.jqy) || (vppVar2 = this.jqy) == null || (qbpVar2 = vppVar2.kq) == null) ? (!ra(this.jqy) || (vppVar = this.jqy) == null || (qbpVar = vppVar.kq) == null) ? 20L : qbpVar.yu : qbpVar2.vt;
            b bVar = this.uoy;
            if (bVar != null) {
                bVar.ouw(i10 * 1000, j * 1000);
            }
            long j8 = i10;
            if (j8 >= j) {
                b bVar2 = this.uoy;
                if (bVar2 != null) {
                    bVar2.ouw(j * 1000, 100);
                }
            } else if (j8 < j && this.ouw != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 + 1;
                this.ouw.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i4 == 101) {
            le();
        }
        return true;
    }

    public final void le() {
        if ("landingpage_split_screen".equals(this.tc) && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("default_split_style", false) && this.euf.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.10
                @Override // java.lang.Runnable
                public final void run() {
                    th.this.myk = ValueAnimator.ofFloat(1.0f, 0.0f);
                    th.this.myk.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (th.this.qbp != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.qbp.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                th.this.qbp.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    th.this.myk.setDuration(500L);
                    th.this.myk.start();
                    if (th.this.vm != null) {
                        th.this.vm.setVisibility(8);
                    }
                }
            });
        }
    }

    public static boolean bly(vpp vppVar) {
        return (vppVar == null || vppVar.f8292cj == 1 || !tlj(vppVar)) ? false : true;
    }

    public static boolean cf(vpp vppVar) {
        return vppVar != null && vppVar.fvf == 19;
    }

    public static boolean mwh(vpp vppVar) {
        return (vppVar == null || !com.bytedance.sdk.openadsdk.core.zih.yu().jg() || !vppVar.vm() || vt(vppVar) || yu(vppVar) || ra(vppVar)) ? false : true;
    }

    public static boolean pno(vpp vppVar) {
        return yu(vppVar) && !cf(vppVar);
    }

    private void ra() {
        this.ra.setVisibility(8);
        if (yu(this.jqy) || ra(this.jqy) || !vt() || lh(this.jqy)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.fak = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.fak.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.rn.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                th thVar = th.this;
                ((Float) valueAnimator.getAnimatedValue()).getClass();
                thVar.lh();
                th.this.rn.setLayoutParams(layoutParams);
            }
        });
        this.fak.start();
    }

    public static boolean ryl(vpp vppVar) {
        if (vppVar != null) {
            return fkw(vppVar) || le(vppVar);
        }
        return false;
    }

    public static boolean tlj(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        int i4 = vppVar.fvf;
        return i4 == 19 || i4 == 20;
    }

    private void yu(int i4) {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onHideLoadingLayout ->".concat(String.valueOf(i4)));
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.le();
        }
    }

    public final boolean fkw() {
        AtomicBoolean atomicBoolean;
        return (!lh(this.jqy) || (atomicBoolean = this.ucs) == null || atomicBoolean.get()) ? false : true;
    }

    public final boolean vt() {
        int i4 = this.jqy.ucs;
        return i4 == 15 || i4 == 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fkw(int i4) {
        osn.ouw((View) this.f8275vh, i4);
        osn.ouw((View) this.yib, i4);
        if (this.fwd.get()) {
            osn.ouw((View) this.tlj, i4);
            osn.ouw((View) this.f8264cf, i4);
            osn.ouw((View) this.ryl, i4);
            osn.ouw((View) this.mwh, 0);
        }
    }

    public final void lh() {
        try {
            this.ksc.ko();
        } catch (Throwable unused) {
        }
    }

    public static boolean le(vpp vppVar) {
        tc tcVar;
        return (vppVar == null || (tcVar = vppVar.ccd) == null || tcVar.f8262lh != 2) ? false : true;
    }

    public static boolean lh(vpp vppVar) {
        return vppVar != null && vppVar.f8305pd == 3 && vppVar.bs == 38 && vppVar.jqy() == 1;
    }

    public final void vt(int i4) {
        com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar = this.lvd;
        if (qbpVar != null) {
            qbpVar.yu(i4);
        }
    }

    public static boolean yu(vpp vppVar) {
        if (vppVar == null) {
            return false;
        }
        if (cf(vppVar)) {
            return true;
        }
        return vppVar.f8305pd == 3 && (vppVar.fvf == 5 || fkw(vppVar)) && !od.vt(vppVar) && (vppVar.ex() == 0.0f || vppVar.ex() == 100.0f);
    }

    public static /* synthetic */ void le(th thVar) {
        LinearLayout.LayoutParams layoutParams;
        if (thVar.f8269ng.get()) {
            return;
        }
        if ((yu(thVar.jqy) || ra(thVar.jqy)) && (thVar.vpp instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.vt)) {
            thVar.ksc.zih();
            thVar.ksc.vm();
        }
        thVar.fwd.set(true);
        thVar.yu(-1);
        thVar.ksc.ryl();
        com.bytedance.sdk.openadsdk.common.mwh mwhVar = thVar.zih;
        if (mwhVar != null) {
            mwhVar.vt();
        }
        if (ra(thVar.jqy)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.jqy, thVar.tc, "show_agg_backup");
            View view = thVar.bly;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) thVar.bly.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                thVar.bly.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = thVar.ra;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        thVar.pno.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) thVar.pno.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        thVar.pno.setLayoutParams(layoutParams3);
        zih zihVar = thVar.jqy.fak;
        if (zihVar != null && !TextUtils.isEmpty(zihVar.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = thVar.jqy;
            zih zihVar2 = vppVar.fak;
            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar2.ouw, zihVar2.vt, zihVar2.f8323lh, thVar.ryl, vppVar);
        }
        thVar.tlj.setText(thVar.jqy.f8315vh);
        thVar.f8264cf.setText(thVar.jqy.hun);
        if (thVar.mwh != null) {
            vpp vppVar2 = thVar.jqy;
            if (vppVar2 != null && !TextUtils.isEmpty(vppVar2.vpp())) {
                thVar.mwh.setText(thVar.jqy.vpp());
            }
            thVar.mwh.setClickable(true);
            thVar.mwh.setOnClickListener(thVar.osn);
            thVar.mwh.setOnTouchListener(thVar.osn);
        }
        if (!lh(thVar.jqy) || (layoutParams = thVar.yhj) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            thVar.fkw(8);
        } else {
            thVar.fkw(0);
        }
    }

    public static boolean vt(vpp vppVar) {
        return vppVar != null && vppVar.f8305pd == 3 && vppVar.fvf == 6 && !od.vt(vppVar) && vppVar.jqy() == 1 && (vppVar.ex() == 0.0f || vppVar.ex() == 100.0f);
    }

    public static boolean ouw(vpp vppVar) {
        if (vppVar == null || cf(vppVar) || le(vppVar) || fkw(vppVar)) {
            return false;
        }
        return yu(vppVar) || vt(vppVar) || ra(vppVar);
    }

    public static boolean ra(vpp vppVar) {
        return vppVar != null && vppVar.fvf == 33;
    }

    public static boolean fkw(vpp vppVar) {
        tc tcVar;
        return vppVar != null && vppVar.f8305pd == 3 && !od.vt(vppVar) && (vppVar.ex() == 0.0f || vppVar.ex() == 100.0f) && (tcVar = vppVar.ccd) != null && tcVar.f8262lh == 1;
    }

    public final void ouw() {
        com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onPageFinished loadSuccess =" + this.f8269ng.get() + ",hasShowBackup ->" + this.fwd.get());
        if (this.f8269ng.get() || this.fwd.get()) {
            return;
        }
        this.f8269ng.set(true);
        yu(0);
        long jElapsedRealtime = this.xdk == -1 ? 0L : SystemClock.elapsedRealtime() - this.xdk;
        if (lh(this.jqy)) {
            com.bytedance.sdk.openadsdk.yu.lh.lh(this.jqy, this.tc, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(this.jqy, this.tc, System.currentTimeMillis() - this.zin, true);
        ra();
    }

    public final void yu() {
        FrameLayout frameLayout = this.rn;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.qbp;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.qbp qbpVar, FrameLayout frameLayout) {
        this.lvd = qbpVar;
        this.kn = frameLayout;
    }

    public static /* synthetic */ boolean ouw(th thVar, Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - thVar.njr < 100) {
            return false;
        }
        thVar.njr = jCurrentTimeMillis;
        runnable.run();
        return true;
    }
}
