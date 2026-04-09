package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.ycc;
import com.bytedance.sdk.openadsdk.component.zz.bw;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sba;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.core.ycc.msw;
import com.bytedance.sdk.openadsdk.utils.aa;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import w1.a;

/* loaded from: classes.dex */
public class xq {
    private ImageView aa;
    protected final com.bytedance.sdk.openadsdk.component.emc bw;
    private PAGLogoView cf;
    private com.bytedance.sdk.openadsdk.core.ycc.dg db;
    protected final FrameLayout dg;
    private msw ee;
    protected final Activity emc;
    protected msw gbl;
    private com.bytedance.sdk.openadsdk.component.msw.xq hxp;
    protected FrameLayout msw;
    private ImageView qh;
    private final com.bytedance.sdk.openadsdk.component.zz.msw rie = new com.bytedance.sdk.openadsdk.component.zz.msw();
    protected com.bytedance.sdk.openadsdk.core.ycc.dg ru;
    private vk sb;
    private aa sba;
    private View sf;
    private float sra;
    protected final com.bytedance.sdk.openadsdk.component.msw.emc sup;
    private RelativeLayout sz;
    private msw ul;
    protected int uym;
    private msw vk;
    protected final boolean xq;
    protected final int ycc;
    private float ylm;
    protected final rie ypw;
    private msw yzg;
    protected View zz;

    public static class emc implements ycc.xq {
        WeakReference<Activity> emc;
        private final WeakReference<xq> ypw;

        public emc(Activity activity, xq xqVar) {
            this.emc = new WeakReference<>(activity);
            this.ypw = new WeakReference<>(xqVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ycc.xq
        public void emc(Object obj) {
            xq xqVar;
            if (this.emc.get() == null || this.emc.get().isFinishing() || (xqVar = this.ypw.get()) == null) {
                return;
            }
            xqVar.emc(obj);
        }
    }

    public static class ypw implements aa.emc {
        private final WeakReference<xq> emc;

        public ypw(xq xqVar) {
            this.emc = new WeakReference<>(xqVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.aa.emc
        public void emc() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.aa.emc
        public void emc(com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) {
            xq xqVar;
            if (!ypwVar.bw() || (xqVar = this.emc.get()) == null) {
                return;
            }
            xqVar.emc(ypwVar);
            if (ypwVar.ypw() != null) {
                xqVar.emc(ypwVar.emc());
            }
        }
    }

    public xq(Activity activity, rie rieVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.emc emcVar, int i, boolean z6, com.bytedance.sdk.openadsdk.component.msw.emc emcVar2) {
        this.emc = activity;
        this.ypw = rieVar;
        this.dg = frameLayout;
        this.uym = i;
        this.xq = z6;
        this.bw = emcVar;
        this.ycc = rieVar.tx();
        this.sup = emcVar2;
    }

    private void msw() {
        boolean z6;
        this.rie.emc();
        this.vk.setText(this.ypw.xxo());
        if (this.ypw.xmt()) {
            zz();
            return;
        }
        if (this.xq) {
            ypw(0);
            emc(8);
            if (emc(this.msw)) {
                this.bw.xq();
            } else {
                this.bw.dg();
            }
            ycc.emc(this.ypw, new emc(this.emc, this), 25);
        } else {
            ypw(8);
            emc(0);
            ru();
            this.bw.xq();
        }
        boolean z7 = true;
        if (this.ee == null) {
            z6 = false;
        } else {
            if (TextUtils.isEmpty(this.ypw.hs())) {
                if (this.ypw.mjd() != null) {
                    this.ee.setText(this.ypw.mjd().ypw());
                }
                z6 = false;
            } else {
                this.ee.setText(this.ypw.hs());
            }
            z6 = true;
        }
        if (this.db != null) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ypw.ya(), this.db, this.ypw);
        }
        vk vkVar = this.sb;
        if (vkVar != null) {
            vw.emc((TextView) null, vkVar, this.ypw);
            if (this.ypw.mjd() == null || this.ypw.mjd().dg() < 0.0d) {
                this.sb.setVisibility(8);
                z7 = z6;
            }
        } else {
            z7 = z6;
        }
        View view = this.sf;
        if (view != null) {
            view.setVisibility(z7 ? 0 : 8);
        }
    }

    private void ru() {
        sba sbaVar = this.ypw.rr().get(0);
        com.bytedance.sdk.openadsdk.utils.aa.emc(new com.bytedance.sdk.openadsdk.yzg.emc(sbaVar.emc(), sbaVar.uym()), sbaVar.ypw(), sbaVar.xq(), new ypw(this), com.bytedance.sdk.openadsdk.component.uym.emc.ypw(TextUtils.isEmpty(sbaVar.uym()) ? com.bytedance.sdk.component.utils.bw.emc(sbaVar.emc()) : sbaVar.uym()).getParent(), 25);
    }

    private void zz() {
        if (this.yzg != null) {
            if (this.ypw.mjd() != null && !TextUtils.isEmpty(this.ypw.mjd().ypw())) {
                this.yzg.setText(this.ypw.mjd().ypw());
            } else if (TextUtils.isEmpty(this.ypw.hs())) {
                this.yzg.setVisibility(8);
            } else {
                this.yzg.setText(this.ypw.hs());
            }
        }
        if (this.ul != null) {
            if (TextUtils.isEmpty(this.ypw.xou())) {
                this.ul.setVisibility(8);
            } else {
                this.ul.setText(this.ypw.xou());
            }
        }
        if (this.sba != null && this.ypw.ya() != null && !TextUtils.isEmpty(this.ypw.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.ypw.ya().emc(), this.ypw.ya().ypw(), this.ypw.ya().xq(), this.sba, this.ypw);
        }
        this.bw.xq();
    }

    public void bw() {
    }

    public int dg() {
        return -1;
    }

    public JSONObject emc(JSONObject jSONObject) {
        return null;
    }

    public com.bytedance.sdk.openadsdk.component.msw.xq uym() {
        return this.hxp;
    }

    public void xq() {
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar = this.hxp;
        if (xqVar != null) {
            xqVar.sup();
        }
    }

    public void ycc() {
        View view = this.zz;
        if (view == null || this.ru == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.xq.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.emc emcVar = xq.this.bw;
                if (emcVar != null) {
                    emcVar.ypw(view2);
                }
            }
        });
        this.ru.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.xq.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.emc emcVar = xq.this.bw;
                if (emcVar != null) {
                    emcVar.emc(view2);
                }
            }
        });
    }

    public void ypw() {
        Window window;
        if (this.ypw.yvi()) {
            this.bw.xq();
        } else {
            msw();
        }
        Activity activity = this.emc;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public void emc(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.zz.xq dgVar = new com.bytedance.sdk.openadsdk.component.zz.dg(this.emc, this.ypw);
        int iHj = this.ypw.hj();
        if (iHj == 5) {
            dgVar = new com.bytedance.sdk.openadsdk.component.zz.ycc(this.emc, this.ypw);
        } else if (iHj == 4) {
            dgVar = new com.bytedance.sdk.openadsdk.component.zz.bw(this.emc, this.ypw);
        }
        com.bytedance.sdk.openadsdk.component.zz.xq xqVar = dgVar;
        this.sz = xqVar;
        viewGroup.addView(xqVar);
        this.aa = xqVar.getBackImage();
        this.msw = xqVar.getVideoContainer();
        this.qh = xqVar.getImageView();
        this.vk = xqVar.getClickButton();
        this.cf = xqVar.getAdLogo();
        this.ee = xqVar.getAdTitleTextView();
        this.db = xqVar.getAdIconView();
        this.sb = xqVar.getScoreBar();
        this.sf = xqVar.getOverlayLayout();
        if (this.ypw.xmt()) {
            this.sba = xqVar.getIconOnlyView();
            this.yzg = xqVar.getTitle();
            this.ul = xqVar.getContent();
        }
        if (xqVar.getDspAdChoice() != null) {
            xqVar.getDspAdChoice().emc(14, this.ypw);
        }
        if (!this.ypw.yvi()) {
            this.rie.emc(xqVar, this.ypw, this.sra, this.ylm, this.xq);
        }
        this.zz = xqVar.getTopDisLike();
        this.ru = xqVar.getTopSkip();
        this.gbl = xqVar.getTopCountDown();
        if (xqVar instanceof com.bytedance.sdk.openadsdk.component.zz.bw) {
            ((com.bytedance.sdk.openadsdk.component.zz.bw) xqVar).setRenderListener(new bw.emc() { // from class: com.bytedance.sdk.openadsdk.component.xq.1
                @Override // com.bytedance.sdk.openadsdk.component.zz.bw.emc
                public void emc(View view, int i) {
                    xq.this.bw.bw();
                }
            });
        }
    }

    private void ypw(int i) {
        vw.emc((View) this.msw, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void emc() {
        this.cf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.xq.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    xq xqVar = xq.this;
                    TTWebsiteActivity.emc(xqVar.emc, xqVar.ypw, "open_ad");
                } catch (Throwable th) {
                    ul.xq("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        ycc();
        if (this.ypw.yvi()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.emc.emc emcVarEmc = com.bytedance.sdk.openadsdk.component.emc.ypw.emc(this.ypw, this.emc, this.sup);
        emcVarEmc.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.component.xq.3
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i) {
                xq.this.bw.bw();
            }
        });
        emcVarEmc.emc(this.hxp);
        if (this.ypw.ndl() == 1) {
            this.sz.setOnClickListener(emcVarEmc);
            this.sz.setOnTouchListener(emcVarEmc);
        }
        this.vk.setOnClickListener(emcVarEmc);
        this.vk.setOnTouchListener(emcVarEmc);
    }

    public boolean emc(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.msw.xq xqVar = new com.bytedance.sdk.openadsdk.component.msw.xq(this.emc);
        this.hxp = xqVar;
        return xqVar.emc(frameLayout, this.bw, this.ypw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.aa.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.aa.emc().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            ul.xq("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) {
        if (this.qh == null) {
            return;
        }
        if (ypwVar.ypw() != null) {
            this.qh.setImageBitmap(ypwVar.ypw());
            return;
        }
        Drawable drawableDg = ypwVar.dg();
        if (drawableDg != null) {
            this.qh.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && a.d(drawableDg)) {
                a.b(drawableDg).start();
            }
            this.qh.setImageDrawable(drawableDg);
            return;
        }
        if (this.ypw.rr() == null || this.ypw.rr().get(0) == null) {
            return;
        }
        Drawable drawableEmc = com.bytedance.sdk.openadsdk.utils.aa.emc(ypwVar.xq(), this.ypw.rr().get(0).ypw());
        this.qh.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.qh.setImageDrawable(drawableEmc);
    }

    public void emc(int i) {
        vw.emc((View) this.qh, i);
    }

    public void emc(float f2, float f5) {
        this.sra = f2;
        this.ylm = f5;
    }

    public void emc(int i, boolean z6) {
        msw mswVar;
        if (this.ru == null || (mswVar = this.gbl) == null) {
            return;
        }
        if (z6) {
            if (mswVar.getVisibility() != 8) {
                this.gbl.setVisibility(8);
            }
            if (this.ru.getVisibility() != 0) {
                this.ru.setVisibility(0);
                return;
            }
            return;
        }
        this.gbl.setText(i + "s");
        if (this.gbl.getVisibility() != 0) {
            this.gbl.setVisibility(0);
        }
    }
}
