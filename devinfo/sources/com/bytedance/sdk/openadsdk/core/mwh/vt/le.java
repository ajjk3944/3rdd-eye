package com.bytedance.sdk.openadsdk.core.mwh.vt;

import a0.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.f1;
import b9.a;
import b9.b;
import b9.d;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.core.mwh.vt.lh;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class le extends com.bytedance.sdk.openadsdk.core.le.lh implements b, jae.ouw, lh.ouw {
    protected ImageView bly;
    private long bs;

    /* renamed from: cd, reason: collision with root package name */
    private long f8350cd;

    /* renamed from: cf, reason: collision with root package name */
    protected boolean f8351cf;
    private String ex;
    private a ey;
    private boolean fak;
    public boolean fkw;
    private final Runnable fqk;
    private boolean fvf;
    private final AtomicBoolean hun;
    private boolean jae;

    /* renamed from: jg, reason: collision with root package name */
    boolean f8352jg;
    private final AtomicBoolean jvy;
    protected boolean ko;
    private boolean ksc;

    /* renamed from: le, reason: collision with root package name */
    public ra f8353le;

    /* renamed from: lh, reason: collision with root package name */
    protected FrameLayout f8354lh;
    protected int mwh;

    /* renamed from: od, reason: collision with root package name */
    private boolean f8355od;
    private View osn;
    protected final vpp ouw;

    /* renamed from: pd, reason: collision with root package name */
    private final Handler f8356pd;
    protected ImageView pno;
    private boolean qbp;
    protected RelativeLayout ra;
    public vt rn;
    private ViewTreeObserver.OnGlobalLayoutListener rrs;
    protected String ryl;
    private boolean tc;

    /* renamed from: th, reason: collision with root package name */
    private boolean f8357th;
    protected ImageView tlj;
    private final String uoy;
    private final boolean uq;
    private final ViewTreeObserver.OnScrollChangedListener ux;
    private ViewGroup vm;
    protected lh vt;
    protected boolean yu;
    private final Context zih;
    private String zin;
    private static final Integer vpp = 0;
    private static final Integer jqy = 1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void ouw(View view, int i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface vt {
        void ouw(boolean z3, long j, long j8, long j9, boolean z10);
    }

    public le(Context context, vpp vppVar, boolean z3, ra raVar) {
        this(context, vppVar, z3, "embeded_ad", false, raVar);
    }

    private boolean ex() {
        int iFqk = this.ouw.fqk();
        zih.yu();
        return 2 == cf.vt(iFqk);
    }

    private void fkw() {
        this.vt = new lh(this.zih, this.f8354lh, this.ouw, this.ryl, !this.qbp, this.ksc, this.jae, this.f8353le);
        ko();
        if (this.rrs == null) {
            this.rrs = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    le leVar;
                    lh lhVar;
                    if (le.this.vm == null || le.this.vm.getViewTreeObserver() == null || (lhVar = (leVar = le.this).vt) == null) {
                        return;
                    }
                    lhVar.ouw(leVar.vm.getWidth(), le.this.vm.getHeight());
                    le.this.vm.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    le.this.rrs = null;
                }
            };
            this.vm.getViewTreeObserver().addOnGlobalLayoutListener(this.rrs);
        }
    }

    private void jae() {
        osn.fkw(this.bly);
        osn.fkw(this.ra);
    }

    private void jqy() {
        if (this.vt == null || this.qbp) {
            return;
        }
        if ((!th() || com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", false)) && th()) {
            long jTh = this.vt.th();
            long jZih = this.vt.zih() + jTh;
            boolean zOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", false);
            long jOuw = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jOuw2 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", jZih);
            long jOuw3 = com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", jTh);
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            lh lhVar = this.vt;
            lhVar.f8335jg = zOuw;
            lhVar.vt(jOuw);
            lh lhVar2 = this.vt;
            lhVar2.uoy = jOuw2;
            lhVar2.bs = jOuw3;
            StringBuilder sb2 = new StringBuilder("onResumeFeedNativeVideoControllerData-isComplete=");
            sb2.append(zOuw);
            sb2.append(",position=");
            sb2.append(jOuw);
            g.A(sb2, ",totalPlayDuration=", jOuw2, ",duration=");
            sb2.append(jOuw3);
            ko.fkw("MultiProcess", sb2.toString());
        }
    }

    private void ko() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            return;
        }
        lhVar.osn = this.f8357th;
        lhVar.ouw((lh.ouw) this);
        this.vt.f8338od = this;
    }

    private void ksc() {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || (fkwVar = lhVar.ra) == null) {
            return;
        }
        fkwVar.ouw();
        View viewLh = fkwVar.lh();
        if (viewLh != null) {
            viewLh.setVisibility(8);
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
        }
    }

    private boolean od() {
        return fak.ouw(this, 50, ex.vt(this.ryl) ? 1 : 5, false);
    }

    private boolean qbp() {
        if (this.qbp || !th()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void rn() {
        lh lhVar = this.vt;
        if (lhVar == null) {
            fkw();
        } else if (!this.qbp) {
            lhVar.ey();
        }
        if (this.vt == null || !this.jvy.get()) {
            return;
        }
        this.jvy.set(false);
        vt();
        if (!this.f8357th) {
            if (!this.vt.f8335jg) {
                ko.lh("NativeVideoTsView", "attachTask.......mRlImgCover.....VISIBLE");
                pno();
                osn.ouw((View) this.ra, 0);
                return;
            } else {
                ko.vt("NativeVideoTsView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.vt.f8335jg);
                bly();
                return;
            }
        }
        osn.ouw((View) this.ra, 8);
        ImageView imageView = this.bly;
        if (imageView != null) {
            osn.ouw((View) imageView, 8);
        }
        vpp vppVar = this.ouw;
        if (vppVar == null || vppVar.f8309sd == null) {
            ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
            return;
        }
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).E(), this.ouw);
        vtVarOuw.f6566le = this.ouw.pv;
        vtVarOuw.ra = this.vm.getWidth();
        vtVarOuw.pno = this.vm.getHeight();
        vtVarOuw.bly = this.ouw.yhj;
        vtVarOuw.tlj = 0L;
        vtVarOuw.f6564cf = this.yu;
        ouw(vtVarOuw);
        this.vt.ouw(vtVarOuw);
        this.vt.f8335jg = false;
    }

    private void tc() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            fkw fkwVar = lhVar.ra;
            if (fkwVar != null) {
                fkwVar.ouw();
            }
            jae();
        }
    }

    private boolean th() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return false;
        }
        int i4 = vppVar.fvf;
        return (i4 == 2 || i4 == 1) && 3 == vppVar.f8305pd;
    }

    private void vm() {
        if (!this.jvy.get()) {
            this.jvy.set(true);
            lh lhVar = this.vt;
            if (lhVar != null) {
                lhVar.jg();
            }
        }
        this.hun.set(false);
    }

    private void vpp() {
        this.f8356pd.removeMessages(1);
        jg.lh().removeCallbacks(this.fqk);
    }

    private void yu() {
        ouw(0L, 0);
        this.ey = null;
    }

    private void zih() {
        this.rn = null;
        lh lhVar = this.vt;
        if (lhVar != null && !this.qbp) {
            lhVar.rrs();
        }
        ksc();
        ouw(false);
        vm();
    }

    private void zin() {
        if (this.qbp || !th()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    public final void bly() {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.f8335jg = true;
            fkw fkwVar = lhVar.ra;
            if (fkwVar != null) {
                fkwVar.vt();
                View viewLh = fkwVar.lh();
                if (viewLh != null) {
                    if (viewLh.getParent() != null) {
                        ((ViewGroup) viewLh.getParent()).removeView(viewLh);
                    }
                    viewLh.setVisibility(0);
                    addView(viewLh);
                    vpp vppVar = this.ouw;
                    new WeakReference(this.zih);
                    fkwVar.ouw((Object) vppVar);
                }
            }
        }
    }

    public final void cf() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        getNativeVideoController().ouw();
    }

    public double getCurrentPlayTime() {
        if (this.vt != null) {
            return (r0.bly * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public lh getNativeVideoController() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void le() {
        a aVar = this.ey;
        if (aVar != null) {
            aVar.h_();
        }
    }

    public final void mwh() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        vpp vppVar = this.ouw;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(this.f8350cd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        rn();
        if (this.ko) {
            getViewTreeObserver().addOnScrollChangedListener(this.ux);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zih();
        if (this.ko) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.ux);
            }
            ViewGroup viewGroup = this.vm;
            if (viewGroup == null || this.rrs == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.rrs);
                this.rrs = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        rn();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vt vtVar;
        lh lhVar;
        if (!this.qbp && (vtVar = this.rn) != null && (lhVar = this.vt) != null) {
            boolean z3 = lhVar.f8335jg;
            long jTh = lhVar.th();
            lh lhVar2 = this.vt;
            vtVar.ouw(z3, jTh, lhVar2.bly + lhVar2.zih(), this.vt.bly, this.f8357th);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        zih();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        lh lhVar;
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2;
        lh lhVar3;
        lh lhVar4;
        if ("open_ad".equals(this.ryl)) {
            vpp();
            return;
        }
        this.tc = z3;
        super.onWindowFocusChanged(z3);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.ouw, z3);
        jqy();
        if (this.ko) {
            if (qbp() && (lhVar4 = this.vt) != null && lhVar4.f8335jg) {
                zin();
                osn.ouw((View) this.ra, 8);
                bly();
                yu();
                return;
            }
            vt();
            if (!this.qbp && this.f8357th && (lhVar3 = this.vt) != null && !lhVar3.zih) {
                Handler handler = this.f8356pd;
                if (handler != null) {
                    if (z3 && lhVar3 != null && !lhVar3.f8335jg) {
                        handler.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        vpp();
                        ouw(false, vpp.intValue());
                        return;
                    }
                }
                return;
            }
            if (this.f8357th) {
                return;
            }
            if (!z3 && (lhVar = this.vt) != null && (lhVar2 = lhVar.f8336le) != null && lhVar2.le()) {
                vpp();
                ouw(false, vpp.intValue());
            } else if (z3) {
                this.f8356pd.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i4) {
        lh lhVar;
        vpp vppVar;
        Handler handler;
        lh lhVar2;
        lh lhVar3;
        super.onWindowVisibilityChanged(i4);
        jqy();
        if (qbp() && (lhVar3 = this.vt) != null && lhVar3.f8335jg) {
            zin();
            osn.ouw((View) this.ra, 8);
            bly();
            yu();
            return;
        }
        vt();
        if (this.qbp || !this.f8357th || (lhVar = this.vt) == null || lhVar.zih || (vppVar = this.ouw) == null) {
            return;
        }
        if (!this.f8355od || vppVar.f8309sd == null) {
            ko.fkw("NativeVideoTsView", "attachTask materialMeta.getVideo() is null !!");
        } else {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).E(), this.ouw);
            vtVarOuw.f6566le = this.ouw.pv;
            vtVarOuw.ra = this.vm.getWidth();
            vtVarOuw.pno = this.vm.getHeight();
            vtVarOuw.bly = this.ouw.yhj;
            vtVarOuw.tlj = this.f8350cd;
            vtVarOuw.f6564cf = this.yu;
            ouw(vtVarOuw);
            this.vt.ouw(vtVarOuw);
            this.f8355od = false;
            osn.ouw((View) this.ra, 8);
        }
        if (i4 != 0 || !this.ko || (handler = this.f8356pd) == null || (lhVar2 = this.vt) == null || lhVar2.f8335jg) {
            return;
        }
        handler.obtainMessage(1).sendToTarget();
    }

    public final void pno() {
        View view;
        if (this.zih == null || (view = this.osn) == null || view.getParent() == null || this.ouw == null || this.ra != null) {
            return;
        }
        ViewParent parent = this.osn.getParent();
        Context context = this.zih;
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        raVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        yuVar.setLayoutParams(layoutParams);
        yuVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.pno = yuVar;
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        yuVar2.setLayoutParams(layoutParams2);
        yuVar2.setVisibility(8);
        yuVar2.setBackground(com.bytedance.sdk.component.utils.vpp.lh(context, "tt_new_play_video"));
        this.tlj = yuVar2;
        raVar.addView(yuVar);
        raVar.addView(yuVar2);
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View view2 = this.osn;
            int iIndexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeViewInLayout(view2);
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            if (layoutParams3 != null) {
                viewGroup.addView(raVar, iIndexOfChild, layoutParams3);
            } else {
                viewGroup.addView(raVar, iIndexOfChild);
            }
        }
        this.ra = raVar;
        if (this.f8351cf) {
            osn.ouw((View) this.tlj, 0);
        }
        c cVar = this.ouw.f8309sd;
        if (cVar != null && cVar.f6578f != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            c cVar2 = vppVar.f8309sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(cVar2.f6578f, cVar2.f6574b, cVar2.f6573a, this.pno, vppVar);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setClickable(true);
            this.tlj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    le.this.lh();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.lh.ouw
    public final void ra() {
        vt();
    }

    public final void ryl() {
        if (ksc.ouw(zih.ouw(), 60000L) != 0 && od()) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f8336le;
            if (lhVar != null) {
                if (lhVar.ra()) {
                    ouw(true, jqy.intValue());
                    vt();
                    Handler handler = this.f8356pd;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.vt.f8336le.vt() && !this.ko) {
                    tc();
                    lh lhVar2 = this.vt;
                    if (lhVar2 != null) {
                        lhVar2.jvy();
                        return;
                    }
                    return;
                }
            }
            if (this.f8357th || this.hun.get()) {
                return;
            }
            this.hun.set(true);
            jae();
            vpp vppVar = this.ouw;
            if (vppVar != null && vppVar.f8309sd != null) {
                jae();
                com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(this.ouw.sm)).E(), this.ouw);
                vtVarOuw.f6566le = this.ouw.pv;
                vtVarOuw.ra = this.vm.getWidth();
                vtVarOuw.pno = this.vm.getHeight();
                vpp vppVar2 = this.ouw;
                vtVarOuw.bly = vppVar2.yhj;
                vtVarOuw.tlj = this.f8350cd;
                vtVarOuw.f6564cf = this.yu;
                vtVarOuw.f6567lh = ((f1) CacheDirFactory.getICacheDir(vppVar2.sm)).E();
                ouw(vtVarOuw);
                this.vt.ouw(vtVarOuw);
            }
            Handler handler2 = this.f8356pd;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            ouw(false);
        }
    }

    public void setAdCreativeClickListener(final ouw ouwVar) {
        fkw fkwVar;
        final lh lhVar = this.vt;
        if (lhVar == null || !lhVar.ko || (fkwVar = lhVar.ra) == null) {
            return;
        }
        fkwVar.ey = new ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.2
            @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.ouw
            public final void ouw(View view, int i4) {
                le.ouw ouwVar2 = ouwVar;
                if (ouwVar2 != null) {
                    ouwVar2.ouw(view, i4);
                }
            }
        };
    }

    public void setControllerStatusCallBack(vt vtVar) {
        this.rn = vtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setIsAutoPlay(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.fak
            if (r0 == 0) goto L5
            return
        L5:
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.ouw
            int r0 = r0.fqk()
            com.bytedance.sdk.openadsdk.core.zih.yu()
            int r0 = com.bytedance.sdk.openadsdk.core.settings.cf.vt(r0)
            r1 = 0
            if (r6 == 0) goto L54
            r2 = 4
            if (r0 == r2) goto L54
            android.content.Context r0 = r5.zih
            r2 = 60000(0xea60, double:2.9644E-319)
            int r0 = com.bytedance.sdk.component.utils.ksc.ouw(r0, r2)
            r4 = 5
            if (r0 != r4) goto L2c
            boolean r0 = r5.ex()
            if (r0 != 0) goto L54
        L2a:
            r6 = r1
            goto L54
        L2c:
            android.content.Context r0 = r5.zih
            int r0 = com.bytedance.sdk.component.utils.ksc.ouw(r0, r2)
            r2 = 6
            if (r0 != r2) goto L4b
            boolean r0 = r5.ex()
            if (r0 != 0) goto L54
            com.bytedance.sdk.openadsdk.core.model.vpp r0 = r5.ouw
            int r0 = r0.fqk()
            com.bytedance.sdk.openadsdk.core.zih.yu()
            int r0 = com.bytedance.sdk.openadsdk.core.settings.cf.vt(r0)
            if (r4 != r0) goto L2a
            goto L54
        L4b:
            android.content.Context r0 = r5.zih
            boolean r0 = com.bytedance.sdk.component.utils.vm.ouw(r0)
            if (r0 != 0) goto L54
            goto L2a
        L54:
            r5.f8357th = r6
            com.bytedance.sdk.openadsdk.core.mwh.vt.lh r0 = r5.vt
            if (r0 == 0) goto L5c
            r0.osn = r6
        L5c:
            if (r6 != 0) goto L83
            r5.pno()
            android.widget.RelativeLayout r6 = r5.ra
            if (r6 == 0) goto L8a
            com.bytedance.sdk.openadsdk.utils.osn.ouw(r6, r1)
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r5.ouw
            if (r6 == 0) goto L8a
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.c r6 = r6.f8309sd
            if (r6 == 0) goto L8a
            com.bytedance.sdk.openadsdk.th.vt.ouw()
            com.bytedance.sdk.openadsdk.core.model.vpp r6 = r5.ouw
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.c r0 = r6.f8309sd
            java.lang.String r1 = r0.f6578f
            int r2 = r0.f6574b
            int r0 = r0.f6573a
            android.widget.ImageView r3 = r5.pno
            com.bytedance.sdk.openadsdk.th.vt.ouw(r1, r2, r0, r3, r6)
            goto L8a
        L83:
            android.widget.RelativeLayout r6 = r5.ra
            r0 = 8
            com.bytedance.sdk.openadsdk.utils.osn.ouw(r6, r0)
        L8a:
            r6 = 1
            r5.fak = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.vt.le.setIsAutoPlay(boolean):void");
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z3) {
        this.f8351cf = z3;
    }

    public void setNeedSelfManagerVideo(boolean z3) {
        this.ko = z3;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        fkw fkwVar;
        lh lhVar = this.vt;
        if (lhVar == null || !lhVar.ko || (fkwVar = lhVar.ra) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = fkwVar.fak;
        if (ouwVar != null) {
            ouwVar.ouw(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = fkwVar.uoy;
        if (ouwVar2 != null) {
            ouwVar2.ouw(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(a aVar) {
        this.ey = aVar;
    }

    public void setVideoAdLoadListener(d dVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.jvy = new WeakReference<>(dVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.zin = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.mwh.vt.vt vtVar) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.fqk = vtVar;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (i4 == 4 || i4 == 8) {
            vm();
        }
    }

    public final boolean tlj() {
        boolean z3 = false;
        if (ksc.ouw(zih.ouw(), 60000L) == 0) {
            return false;
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.vt.f8336le;
        if (lhVar != null && lhVar.le()) {
            ouw(false, vpp.intValue());
            Handler handler = this.f8356pd;
            z3 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z3;
    }

    public le(Context context, vpp vppVar, String str, ra raVar) {
        this(context, vppVar, false, str, true, raVar);
    }

    public void lh() {
        if (tlj()) {
            return;
        }
        ryl();
    }

    @Override // b9.b
    public final void vt(long j, int i4) {
        ko.vt("NativeVideoTsView", "onError() called with: totalPlayTime = [" + j + "], percent = [" + i4 + "]");
    }

    public le(Context context, vpp vppVar, ra raVar) {
        this(context, vppVar, false, raVar);
    }

    @Override // b9.b
    public final void ouw(long j, int i4) {
        ko.vt("NativeVideoTsView", "onComplete() called with: totalPlayTime = [" + j + "], percent = [" + i4 + "]");
        a aVar = this.ey;
        if (aVar != null) {
            aVar.j_();
        }
    }

    public void vt() {
        vpp vppVar = this.ouw;
        if (vppVar == null) {
            return;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            this.f8357th = uoy.yu(iOuw);
        } else if (iVt == 2) {
            this.f8357th = uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw);
        } else if (iVt == 3) {
            this.f8357th = false;
        } else if (iVt == 4) {
            this.f8352jg = true;
        } else if (iVt == 5) {
            this.f8357th = uoy.yu(iOuw) || uoy.le(iOuw);
        }
        if (!this.qbp) {
            if (!this.fkw || !ex.vt(this.ryl)) {
                zih.yu();
                this.yu = cf.vt(String.valueOf(iFqk));
            }
        } else {
            this.yu = false;
        }
        if ("open_ad".equals(this.ryl)) {
            this.f8357th = true;
            this.yu = true;
        }
        if (ex.vt(this.ryl)) {
            this.yu = true;
        }
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.osn = this.f8357th;
        }
        this.fkw = true;
    }

    public le(Context context, vpp vppVar, boolean z3, String str, boolean z10, ra raVar) {
        super(context);
        this.f8357th = true;
        this.yu = true;
        this.qbp = false;
        this.fkw = false;
        this.tc = true;
        this.ksc = false;
        this.jae = true;
        this.f8351cf = true;
        this.ryl = "embeded_ad";
        this.mwh = 50;
        this.f8355od = true;
        this.uq = false;
        this.f8356pd = new jae(jg.vt().getLooper(), this);
        this.fak = false;
        this.uoy = Build.MODEL;
        this.f8352jg = false;
        this.ko = true;
        this.jvy = new AtomicBoolean(false);
        this.fqk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.4
            @Override // java.lang.Runnable
            public final void run() {
                le leVar = le.this;
                leVar.ouw(leVar.fvf, le.vpp.intValue());
            }
        };
        this.hun = new AtomicBoolean(false);
        this.ux = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                le.ouw(le.this);
            }
        };
        try {
            if (vppVar.osn()) {
                this.ex = ((f1) CacheDirFactory.getICacheDir(0)).M();
            }
        } catch (Throwable unused) {
        }
        if (raVar != null) {
            this.f8353le = raVar;
        }
        this.ryl = str;
        this.zih = context;
        this.ouw = vppVar;
        this.qbp = z3;
        setContentDescription("NativeVideoTsView");
        this.ksc = z10;
        this.jae = false;
        vt();
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.vm = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.f8354lh = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.osn = view;
        addView(frameLayout);
        fkw();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                le.ouw(le.this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                le.ouw(le.this);
            }
        });
    }

    @Override // b9.b
    public final void ouw() {
        ko.ouw("NativeVideoTsView", "embeded_ad", "onTimeOut、、、、、、、、");
    }

    @Override // b9.b
    public final void ouw(long j, long j8) {
        a aVar = this.ey;
        if (aVar != null) {
            aVar.ouw(j, j8);
        }
    }

    public final boolean ouw(long j, boolean z3, boolean z10) throws JSONException {
        boolean zOuw = false;
        this.vm.setVisibility(0);
        this.f8350cd = j;
        if (!this.qbp) {
            return true;
        }
        this.vt.vt(false);
        vpp vppVar = this.ouw;
        if (vppVar != null && vppVar.f8309sd != null) {
            com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).E(), this.ouw);
            vtVarOuw.f6566le = this.ouw.pv;
            vtVarOuw.ra = this.vm.getWidth();
            vtVarOuw.pno = this.vm.getHeight();
            vtVarOuw.bly = this.ouw.yhj;
            vtVarOuw.tlj = j;
            vtVarOuw.f6564cf = this.yu;
            ouw(vtVarOuw);
            if (z10) {
                this.vt.vt(vtVarOuw);
                return true;
            }
            zOuw = this.vt.ouw(vtVarOuw);
        }
        if (((j > 0 && !z3 && !z10) || (j > 0 && z3)) && this.vt != null) {
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(this.vt.bly);
            ouwVar.vt(this.vt.th());
            ouwVar.vt = this.vt.zih();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.vt(this.vt.ra, ouwVar);
        }
        return zOuw;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1) {
            this.fvf = od();
            bs.ouw(this.fqk);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(boolean z3, int i4) {
        if (this.ouw == null || this.vt == null) {
            return;
        }
        boolean zQbp = qbp();
        zin();
        if (zQbp && this.vt.f8335jg) {
            com.bytedance.sdk.component.utils.ko.vt("NativeVideoTsView", "changeVideoStatus---isFromDetailPage()=" + zQbp + "，mNativeVideoController.isPlayComplete()=" + this.vt.f8335jg);
            bly();
            yu();
            return;
        }
        if (z3 && this.tc) {
            lh lhVar = this.vt;
            if (!lhVar.f8335jg && !lhVar.zih) {
                com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar2 = lhVar.f8336le;
                if (lhVar2 != null && lhVar2.ra()) {
                    if (this.f8357th || i4 == 1) {
                        lh lhVar3 = this.vt;
                        if (lhVar3 != null) {
                            ouw(lhVar3.rn, "changeVideoStatus");
                        }
                        if ("ALP-AL00".equals(this.uoy)) {
                            this.vt.ryl();
                        } else {
                            bly.ouw();
                            this.vt.yu(zQbp);
                        }
                        ouw(false);
                        a aVar = this.ey;
                        if (aVar != null) {
                            aVar.i_();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.f8357th && this.vt.f8336le == null) {
                    if (!this.jvy.get()) {
                        this.jvy.set(true);
                    }
                    this.hun.set(false);
                    rn();
                    return;
                }
                return;
            }
        }
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar4 = this.vt.f8336le;
        if (lhVar4 == null || !lhVar4.le()) {
            return;
        }
        this.vt.cf();
        ouw(true);
        a aVar2 = this.ey;
        if (aVar2 != null) {
            aVar2.vt();
        }
    }

    public final void ouw(boolean z3, String str) {
        if (ex.vt(this.ryl)) {
            z3 = true;
        }
        this.yu = z3;
        lh lhVar = this.vt;
        if (lhVar != null) {
            lhVar.ouw(z3, str);
        }
    }

    public void ouw(boolean z3) {
        if (this.bly == null) {
            this.bly = new ImageView(getContext());
            if (bly.ouw().mwh() != null) {
                this.bly.setImageBitmap(bly.ouw().mwh());
            } else {
                this.bly.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(zih.ouw(), "tt_new_play_video"));
            }
            this.bly.setScaleType(ImageView.ScaleType.FIT_XY);
            int iOuw = osn.ouw(getContext(), this.mwh);
            int iOuw2 = osn.ouw(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOuw, iOuw);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iOuw2;
            layoutParams.bottomMargin = iOuw2;
            this.vm.addView(this.bly, layoutParams);
            this.bly.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.le.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    le.this.ryl();
                }
            });
        }
        if (z3) {
            this.bly.setVisibility(0);
        } else {
            this.bly.setVisibility(8);
        }
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(List<Pair<View, FriendlyObstructionPurpose>> list) {
        lh lhVar = this.vt;
        if (lhVar != null) {
            return lhVar.ouw(this, list);
        }
        return null;
    }

    private void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        try {
            if (this.ouw.osn()) {
                aVar.f6567lh = this.ex;
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void ouw(le leVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = leVar.f8356pd;
        if (handler == null || jElapsedRealtime - leVar.bs <= 500) {
            return;
        }
        leVar.bs = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }
}
