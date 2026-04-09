package com.bytedance.sdk.openadsdk.component;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.shadow.okio.a;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.bly.fkw;
import com.bytedance.sdk.openadsdk.component.bly.pno;
import com.bytedance.sdk.openadsdk.component.le;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.zih;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    protected final int bly;

    /* renamed from: cf, reason: collision with root package name */
    protected FrameLayout f7892cf;
    private final pno ex = new pno();
    protected final vpp fkw;
    private rn jae;

    /* renamed from: jg, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.le.pno f7893jg;
    private float jqy;
    protected final com.bytedance.sdk.openadsdk.component.pno.ouw ko;
    private com.bytedance.sdk.openadsdk.core.le.yu ksc;

    /* renamed from: le, reason: collision with root package name */
    protected final boolean f7894le;

    /* renamed from: lh, reason: collision with root package name */
    private PAGLogoView f7895lh;
    protected com.bytedance.sdk.openadsdk.core.le.yu mwh;

    /* renamed from: od, reason: collision with root package name */
    private View f7896od;
    private RelativeLayout ouw;
    protected final com.bytedance.sdk.openadsdk.component.ouw pno;
    private com.bytedance.sdk.openadsdk.core.le.pno qbp;
    protected final FrameLayout ra;
    public com.bytedance.sdk.openadsdk.component.pno.lh rn;
    protected View ryl;
    private com.bytedance.sdk.openadsdk.core.le.pno tc;

    /* renamed from: th, reason: collision with root package name */
    private zih f7897th;
    protected int tlj;
    private ImageView vm;
    private float vpp;
    private ImageView vt;
    protected final Activity yu;
    private com.bytedance.sdk.openadsdk.core.le.pno zih;
    private com.bytedance.sdk.openadsdk.core.le.pno zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements le.lh {
        WeakReference<Activity> ouw;
        private final WeakReference<lh> vt;

        public ouw(Activity activity, lh lhVar) {
            this.ouw = new WeakReference<>(activity);
            this.vt = new WeakReference<>(lhVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.le.lh
        public final void ouw(Object obj) {
            lh lhVar;
            if (this.ouw.get() == null || this.ouw.get().isFinishing() || (lhVar = this.vt.get()) == null) {
                return;
            }
            lh.ouw(lhVar, obj);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements zih.ouw {
        private final WeakReference<lh> ouw;

        public vt(lh lhVar) {
            this.ouw = new WeakReference<>(lhVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void ouw() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
            lh lhVar;
            if (!vtVar.vt() || (lhVar = this.ouw.get()) == null) {
                return;
            }
            lhVar.ouw(vtVar);
            if (vtVar.f8671lh != null) {
                lh.ouw(lhVar, vtVar.vt);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.utils.zih.ouw
        public final void vt() {
        }
    }

    public lh(Activity activity, vpp vppVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.ouw ouwVar, int i4, boolean z3, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2) {
        this.yu = activity;
        this.fkw = vppVar;
        this.ra = frameLayout;
        this.tlj = i4;
        this.f7894le = z3;
        this.pno = ouwVar;
        this.bly = vppVar.fqk();
        this.ko = ouwVar2;
    }

    public final void le() {
        this.ryl.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.ouw ouwVar = lh.this.pno;
                if (ouwVar != null) {
                    ouwVar.lh();
                }
            }
        });
        this.mwh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.ouw ouwVar = lh.this.pno;
                if (ouwVar != null) {
                    ouwVar.vt();
                }
            }
        });
    }

    public void lh() {
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.rn;
        if (lhVar == null || (vtVar = lhVar.vt) == null) {
            return;
        }
        lhVar.ouw = null;
        vtVar.mwh();
        lhVar.vt = null;
    }

    public JSONObject ouw(JSONObject jSONObject) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void vt() {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.lh.vt():void");
    }

    public int yu() {
        return -1;
    }

    public void ouw(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        com.bytedance.sdk.openadsdk.component.bly.lh yuVar = new com.bytedance.sdk.openadsdk.component.bly.yu(this.yu, this.fkw);
        int iJg = this.fkw.jg();
        ko.vt("AppOpenAdNativeManager", "attachExpressView: splashLayoutId=".concat(String.valueOf(iJg)));
        if (iJg == 5) {
            yuVar = new com.bytedance.sdk.openadsdk.component.bly.le(this.yu, this.fkw);
        } else if (iJg == 4) {
            yuVar = new com.bytedance.sdk.openadsdk.component.bly.fkw(this.yu, this.fkw);
        }
        this.ouw = yuVar;
        viewGroup.addView(yuVar);
        this.vm = yuVar.getBackImage();
        this.f7892cf = yuVar.getVideoContainer();
        this.vt = yuVar.getImageView();
        this.zih = yuVar.getClickButton();
        this.f7895lh = yuVar.getAdLogo();
        this.tc = yuVar.getAdTitleTextView();
        this.ksc = yuVar.getAdIconView();
        this.jae = yuVar.getScoreBar();
        this.f7896od = yuVar.getOverlayLayout();
        if (this.fkw.ra()) {
            this.f7897th = yuVar.getIconOnlyView();
            this.qbp = yuVar.getTitle();
            this.zin = yuVar.getContent();
        }
        if (yuVar.getDspAdChoice() != null) {
            com.bytedance.sdk.openadsdk.core.widget.lh dspAdChoice = yuVar.getDspAdChoice();
            vpp vppVar = this.fkw;
            if (vppVar.cd() || (vppVar.pd() && vppVar.le())) {
                osn.ouw((View) dspAdChoice, 0);
                com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(dspAdChoice.getContext(), 14.0f, true), dspAdChoice, vppVar);
            }
        }
        if (!this.fkw.pd()) {
            pno pnoVar = this.ex;
            vpp vppVar2 = this.fkw;
            pnoVar.f7865lh = yuVar.getHostAppIcon();
            pnoVar.yu = yuVar.getHostAppName();
            View userInfo = yuVar.getUserInfo();
            if (yuVar instanceof com.bytedance.sdk.openadsdk.component.bly.yu) {
                com.bytedance.sdk.openadsdk.core.widget.zih zihVar = pnoVar.f7865lh;
                if (zihVar != null && (layoutParams2 = zihVar.getLayoutParams()) != null) {
                    if (vppVar2.jqy() == 1) {
                        int iOuw = osn.ouw(pnoVar.f7865lh.getContext(), 40.0f);
                        layoutParams2.width = iOuw;
                        layoutParams2.height = iOuw;
                    } else {
                        int iOuw2 = osn.ouw(pnoVar.f7865lh.getContext(), 30.0f);
                        layoutParams2.width = iOuw2;
                        layoutParams2.height = iOuw2;
                    }
                    pnoVar.f7865lh.setLayoutParams(layoutParams2);
                }
                if (pnoVar.yu != null) {
                    if (vppVar2.jqy() == 1) {
                        pnoVar.yu.setTextSize(30.0f);
                    } else {
                        pnoVar.yu.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (vppVar2.jqy() == 1) {
                        layoutParams.height = osn.ouw(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = osn.ouw(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.bly.pno.1
                    public AnonymousClass1() {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
            }
        }
        this.ryl = yuVar.getTopDisLike();
        this.mwh = yuVar.getTopSkip();
        this.f7893jg = yuVar.getTopCountDown();
        if (yuVar instanceof com.bytedance.sdk.openadsdk.component.bly.fkw) {
            ((com.bytedance.sdk.openadsdk.component.bly.fkw) yuVar).setRenderListener(new fkw.ouw() { // from class: com.bytedance.sdk.openadsdk.component.lh.1
                @Override // com.bytedance.sdk.openadsdk.component.bly.fkw.ouw
                public final void ouw() {
                    lh.this.pno.ra();
                }
            });
        }
    }

    public void fkw() {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ouw() {
        this.f7895lh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lh.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    lh lhVar = lh.this;
                    TTWebsiteActivity.ouw(lhVar.yu, lhVar.fkw, "open_ad");
                } catch (Throwable th2) {
                    qbp.lh("AppOpenAdNativeManager", th2.getMessage());
                }
            }
        });
        le();
        if (this.fkw.pd()) {
            return;
        }
        vpp vppVar = this.fkw;
        Activity activity = this.yu;
        com.bytedance.sdk.openadsdk.component.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.ouw.ouw(activity.getApplicationContext(), vppVar, "open_ad", this.ko);
        ouwVar.ouw(activity.findViewById(R.id.content));
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity.getApplicationContext(), vppVar, ouwVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(ouwVar, vppVar);
        ouwVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.lh.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                lh.this.pno.ra();
            }
        });
        ouwVar.ouw(this.rn);
        if (this.fkw.mwh() == 1) {
            this.ouw.setOnClickListener(ouwVar);
            this.ouw.setOnTouchListener(ouwVar);
        }
        this.zih.setOnClickListener(ouwVar);
        this.zih.setOnTouchListener(ouwVar);
    }

    public final boolean ouw(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = new com.bytedance.sdk.openadsdk.component.pno.lh(this.yu);
        this.rn = lhVar;
        return lhVar.ouw(frameLayout, this.pno, this.fkw);
    }

    private void ouw(int i4) {
        osn.ouw((View) this.f7892cf, i4);
    }

    public final void ouw(com.bytedance.sdk.openadsdk.th.ouw.vt vtVar) {
        ImageView imageView = this.vt;
        if (imageView == null) {
            return;
        }
        Bitmap bitmap = vtVar.f8671lh;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        Drawable drawable = vtVar.ouw;
        if (drawable != null) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.i(drawable)) {
                a.c(drawable).start();
            }
            this.vt.setImageDrawable(drawable);
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.zih> list = this.fkw.tc;
        if (list == null || list.get(0) == null) {
            return;
        }
        this.fkw.tc.get(0);
        Drawable drawableOuw = com.bytedance.sdk.openadsdk.utils.zih.ouw(vtVar.ouw());
        this.vt.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.vt.setImageDrawable(drawableOuw);
    }

    public final void ouw(float f10, float f11) {
        this.jqy = f10;
        this.vpp = f11;
    }

    public void ouw(int i4, boolean z3) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar;
        if (this.mwh == null || (pnoVar = this.f7893jg) == null) {
            return;
        }
        if (z3) {
            if (pnoVar.getVisibility() != 8) {
                this.f7893jg.setVisibility(8);
            }
            if (this.mwh.getVisibility() != 0) {
                this.mwh.setVisibility(0);
                return;
            }
            return;
        }
        this.f7893jg.setText(i4 + "s");
        if (this.f7893jg.getVisibility() != 0) {
            this.f7893jg.setVisibility(0);
        }
    }

    public static /* synthetic */ void ouw(lh lhVar, Object obj) {
        try {
            if (obj instanceof Bitmap) {
                lhVar.vm.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            qbp.yu("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    private void vt(int i4) {
        osn.ouw((View) this.vt, i4);
    }
}
