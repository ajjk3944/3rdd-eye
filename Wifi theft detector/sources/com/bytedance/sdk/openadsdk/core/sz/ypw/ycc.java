package com.bytedance.sdk.openadsdk.core.sz.ypw;

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
import androidx.activity.o;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.mkp;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sz.ypw.xq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.core.zz.hxp;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.dg.uym;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import s2.b;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class ycc extends com.bytedance.sdk.openadsdk.core.ycc.xq implements b.InterfaceC0477b, sf.emc, xq.emc {

    /* renamed from: aa, reason: collision with root package name */
    private final Context f9302aa;
    public boolean bw;
    protected boolean cf;
    private boolean cuf;
    private boolean db;
    protected boolean dg;
    private long dr;
    private boolean ee;
    protected final rie emc;
    protected boolean gbl;
    private String hxp;
    private final String iyl;
    private final Handler lt;
    private boolean mkp;
    protected ImageView msw;
    private View mxo;
    boolean qh;
    private final AtomicBoolean ra;
    private long rtt;
    protected ImageView ru;
    private boolean sb;
    private ViewGroup sba;
    private boolean sf;
    protected String sup;
    protected int sz;
    private b.c tp;
    private boolean ul;
    protected RelativeLayout uym;
    public ypw vk;
    private ViewTreeObserver.OnGlobalLayoutListener vw;
    private final Runnable wo;
    private final boolean xmt;
    protected FrameLayout xq;
    private final AtomicBoolean xxg;
    public uym ycc;
    private String ylm;
    protected xq ypw;
    private final ViewTreeObserver.OnScrollChangedListener yz;
    private boolean yzg;
    protected ImageView zz;
    private static final Integer sra = 0;
    private static final Integer rie = 1;

    public interface emc {
        void emc(View view, int i10);
    }

    public interface ypw {
        void emc(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    public ycc(@NonNull Context context, @NonNull rie rieVar, boolean z10, uym uymVar) {
        this(context, rieVar, z10, "embeded_ad", false, false, uymVar);
    }

    private void bw() {
        addView(emc(this.f9302aa));
        yzg();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ycc.this.sba();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                ycc.this.sba();
            }
        });
    }

    private boolean cuf() {
        return this.ul;
    }

    private boolean db() {
        if (cuf() || !ee()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void dg() {
        emc(0L, 0);
        this.tp = null;
    }

    private void dr() {
        if (this.ypw == null || cuf()) {
            return;
        }
        if ((!ee() || com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_is_update_flag", false)) && ee()) {
            long jZz = this.ypw.zz();
            long jUym = this.ypw.uym() + jZz;
            boolean zEmc = com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_native_video_complete", false);
            long jEmc = com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long jEmc2 = com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_total_play_duration", jUym);
            long jEmc3 = com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_duration", jZz);
            com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.ypw.ypw(zEmc);
            this.ypw.ypw(jEmc);
            this.ypw.xq(jEmc2);
            this.ypw.dg(jEmc3);
        }
    }

    private boolean ee() {
        rie rieVar = this.emc;
        if (rieVar == null) {
            return false;
        }
        return rieVar.bkx();
    }

    private void hxp() {
        this.cuf = sup();
        iyl.emc(this.wo);
    }

    private boolean lt() {
        return 5 == aa.dg().ypw(this.emc.tx());
    }

    private void rie() throws JSONException {
        if (!this.ra.get()) {
            this.ra.set(true);
            xq xqVar = this.ypw;
            if (xqVar != null) {
                xqVar.emc(true, 3);
            }
        }
        this.xxg.set(false);
    }

    private void rtt() {
        vw.bw(this.zz);
        vw.bw(this.uym);
    }

    private void sb() {
        if (cuf() || !ee()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.dg.emc.emc("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sba() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.lt;
        if (handler == null || jElapsedRealtime - this.rtt <= 500) {
            return;
        }
        this.rtt = jElapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private void sf() {
        this.lt.removeMessages(1);
        qh.xq().removeCallbacks(this.wo);
    }

    private void sra() throws JSONException {
        this.vk = null;
        if (o.a(this.ypw) && !cuf()) {
            this.ypw.iyl();
        }
        gbl();
        emc(false);
        rie();
    }

    private void ul() {
        xq xqVar = this.ypw;
        if (xqVar == null) {
            return;
        }
        xqVar.dg(this.yzg);
        this.ypw.emc((xq.emc) this);
        this.ypw.emc((b.InterfaceC0477b) this);
    }

    private boolean xmt() {
        return 2 == aa.dg().ypw(this.emc.tx());
    }

    private void ylm() {
        xq xqVar = this.ypw;
        if (xqVar == null) {
            yzg();
        } else if (o.a(xqVar) && !cuf()) {
            this.ypw.vk();
        }
        if (this.ypw == null || !this.ra.get()) {
            return;
        }
        this.ra.set(false);
        ypw();
        if (!msw()) {
            if (this.ypw.sz()) {
                this.ypw.sz();
                ypw(true);
                return;
            } else {
                uym();
                vw.emc((View) this.uym, 0);
                return;
            }
        }
        vw.emc((View) this.uym, 8);
        ImageView imageView = this.zz;
        if (imageView != null) {
            vw.emc((View) imageView, 8);
        }
        rie rieVar = this.emc;
        if (rieVar == null || rieVar.iat() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).xq(), this.emc);
        ypwVarEmc.ypw(this.emc.ye());
        ypwVarEmc.ypw(this.sba.getWidth());
        ypwVarEmc.xq(this.sba.getHeight());
        ypwVarEmc.xq(this.emc.wdp());
        ypwVarEmc.emc(0L);
        ypwVarEmc.emc(zz());
        emc(ypwVarEmc);
        this.ypw.emc(ypwVarEmc);
        this.ypw.ypw(false);
    }

    private void yzg() {
        this.ypw = new xq(this.f9302aa, this.xq, this.emc, this.sup, !cuf(), this.db, this.sb, this.ycc);
        ul();
        if (this.vw == null) {
            this.vw = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ycc yccVar;
                    xq xqVar;
                    if (ycc.this.sba == null || ycc.this.sba.getViewTreeObserver() == null || (xqVar = (yccVar = ycc.this).ypw) == null) {
                        return;
                    }
                    xqVar.emc(yccVar.sba.getWidth(), ycc.this.sba.getHeight());
                    ycc.this.sba.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ycc.this.vw = null;
                }
            };
            this.sba.getViewTreeObserver().addOnGlobalLayoutListener(this.vw);
        }
    }

    public void cf() {
        if (sba.xq(aa.emc()) != 0 && sup()) {
            if (this.ypw.gbl() != null) {
                if (this.ypw.gbl().uym()) {
                    emc(true, rie.intValue());
                    ypw();
                    Handler handler = this.lt;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.ypw.gbl().ypw() && !this.cf) {
                    ru();
                    if (o.a(this.ypw)) {
                        this.ypw.tp();
                        return;
                    }
                    return;
                }
            }
            if (msw() || this.xxg.get()) {
                return;
            }
            this.xxg.set(true);
            rtt();
            rie rieVar = this.emc;
            if (rieVar != null && rieVar.iat() != null) {
                rtt();
                this.emc.iat();
                com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).xq(), this.emc);
                ypwVarEmc.ypw(this.emc.ye());
                ypwVarEmc.ypw(this.sba.getWidth());
                ypwVarEmc.xq(this.sba.getHeight());
                ypwVarEmc.xq(this.emc.wdp());
                ypwVarEmc.emc(this.dr);
                ypwVarEmc.emc(zz());
                ypwVarEmc.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).xq());
                emc(ypwVarEmc);
                this.ypw.emc(ypwVarEmc);
            }
            Handler handler2 = this.lt;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            emc(false);
        }
    }

    @Override // s2.b.InterfaceC0477b
    public void emc() {
    }

    public void gbl() {
        bw bwVarSup;
        xq xqVar = this.ypw;
        if (xqVar == null || (bwVarSup = xqVar.sup()) == null) {
            return;
        }
        bwVarSup.emc();
        View viewXq = bwVarSup.xq();
        if (viewXq != null) {
            viewXq.setVisibility(8);
            if (viewXq.getParent() != null) {
                ((ViewGroup) viewXq.getParent()).removeView(viewXq);
            }
        }
    }

    public double getCurrentPlayTime() {
        if (this.ypw != null) {
            return (r0.ycc() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public xq getNativeVideoController() {
        return this.ypw;
    }

    public boolean msw() {
        return this.yzg;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ylm();
        if (this.cf) {
            getViewTreeObserver().addOnScrollChangedListener(this.yz);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() throws JSONException {
        super.onDetachedFromWindow();
        sra();
        if (this.cf) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.yz);
            }
            ViewGroup viewGroup = this.sba;
            if (viewGroup == null || this.vw == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.vw);
                this.vw = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ylm();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ypw ypwVar;
        xq xqVar;
        if (!this.ul && (ypwVar = this.vk) != null && (xqVar = this.ypw) != null) {
            ypwVar.emc(xqVar.sz(), this.ypw.zz(), this.ypw.rtt(), this.ypw.ycc(), this.yzg);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() throws JSONException {
        super.onStartTemporaryDetach();
        sra();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) throws JSONException {
        xq xqVar;
        xq xqVar2;
        xq xqVar3;
        xq xqVar4;
        if ("open_ad".equals(this.sup)) {
            sf();
            return;
        }
        this.ee = z10;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(this.emc, z10);
        dr();
        if (this.cf) {
            if (db() && (xqVar4 = this.ypw) != null && xqVar4.sz()) {
                sb();
                vw.emc((View) this.uym, 8);
                ypw(true);
                dg();
                return;
            }
            ypw();
            if (!cuf() && msw() && (xqVar2 = this.ypw) != null && !xqVar2.rie()) {
                if (this.lt != null) {
                    if (z10 && (xqVar3 = this.ypw) != null && !xqVar3.sz()) {
                        this.lt.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        sf();
                        emc(false, sra.intValue());
                        return;
                    }
                }
                return;
            }
            if (msw()) {
                return;
            }
            if (!z10 && (xqVar = this.ypw) != null && xqVar.gbl() != null && this.ypw.gbl().ycc()) {
                sf();
                emc(false, sra.intValue());
            } else if (z10) {
                this.lt.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        xq xqVar;
        rie rieVar;
        xq xqVar2;
        xq xqVar3;
        super.onWindowVisibilityChanged(i10);
        dr();
        if (db() && (xqVar3 = this.ypw) != null && xqVar3.sz()) {
            sb();
            vw.emc((View) this.uym, 8);
            ypw(true);
            dg();
            return;
        }
        ypw();
        if (cuf() || !msw() || (xqVar = this.ypw) == null || xqVar.rie() || (rieVar = this.emc) == null) {
            return;
        }
        if (this.sf && rieVar.iat() != null) {
            this.emc.iat();
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).xq(), this.emc);
            ypwVarEmc.ypw(this.emc.ye());
            ypwVarEmc.ypw(this.sba.getWidth());
            ypwVarEmc.xq(this.sba.getHeight());
            ypwVarEmc.xq(this.emc.wdp());
            ypwVarEmc.emc(this.dr);
            ypwVarEmc.emc(zz());
            emc(ypwVarEmc);
            this.ypw.emc(ypwVarEmc);
            this.sf = false;
            vw.emc((View) this.uym, 8);
        }
        if (i10 != 0 || !this.cf || this.lt == null || (xqVar2 = this.ypw) == null || xqVar2.sz()) {
            return;
        }
        this.lt.obtainMessage(1).sendToTarget();
    }

    public void qh() throws JSONException {
        if (getNativeVideoController() == null || !o.a(getNativeVideoController())) {
            return;
        }
        xq nativeVideoController = getNativeVideoController();
        nativeVideoController.emc(nativeVideoController.sup(), this);
    }

    public void ru() {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            bw bwVarSup = xqVar.sup();
            if (bwVarSup != null) {
                bwVarSup.emc();
            }
            rtt();
        }
    }

    public void setAdCreativeClickListener(emc emcVar) {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.emc(emcVar);
        }
    }

    public void setControllerStatusCallBack(ypw ypwVar) {
        this.vk = ypwVar;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.mkp) {
            return;
        }
        int iYpw = aa.dg().ypw(this.emc.tx());
        if (z10 && iYpw != 4 && (!sba.bw(this.f9302aa) ? !(!sba.ycc(this.f9302aa) ? sba.dg(this.f9302aa) : xmt() || lt()) : !xmt())) {
            z10 = false;
        }
        this.yzg = z10;
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.dg(z10);
        }
        if (this.yzg) {
            vw.emc((View) this.uym, 8);
        } else {
            uym();
            RelativeLayout relativeLayout = this.uym;
            if (relativeLayout != null) {
                vw.emc((View) relativeLayout, 0);
                rie rieVar = this.emc;
                if (rieVar != null && rieVar.iat() != null) {
                    com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.emc.iat().r(), this.emc.iat().B(), this.emc.iat().I(), this.msw, this.emc);
                }
            }
        }
        this.mkp = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.gbl = z10;
    }

    public void setNeedSelfManagerVideo(boolean z10) {
        this.cf = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.emc(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(b.c cVar) {
        this.tp = cVar;
    }

    public void setVideoAdLoadListener(b.a aVar) {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.emc(aVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.ylm = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.sz.ypw.ypw ypwVar) {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.emc(ypwVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) throws JSONException {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            rie();
        }
    }

    public boolean sup() {
        return mkp.emc(this, 50, hxp.ypw(this.sup) ? 1 : 5, false);
    }

    public boolean sz() {
        boolean z10 = false;
        if (sba.xq(aa.emc()) == 0) {
            return false;
        }
        if (this.ypw.gbl() != null && this.ypw.gbl().ycc()) {
            emc(false, sra.intValue());
            Handler handler = this.lt;
            z10 = true;
            if (handler != null) {
                handler.removeMessages(1);
            }
        }
        return z10;
    }

    public void uym() {
        View view;
        if (this.f9302aa == null || (view = this.mxo) == null || view.getParent() == null || this.emc == null || this.uym != null) {
            return;
        }
        ViewParent parent = this.mxo.getParent();
        RelativeLayout relativeLayoutYpw = ypw(this.f9302aa);
        if (parent != null && (parent instanceof ViewGroup)) {
            emc(relativeLayoutYpw, (ViewGroup) parent, this.mxo);
        }
        this.uym = relativeLayoutYpw;
        if (this.gbl) {
            vw.emc((View) this.ru, 0);
        }
        if (this.emc.iat() != null && this.emc.iat().r() != null) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.emc.iat().r(), this.emc.iat().B(), this.emc.iat().I(), this.msw, this.emc);
        }
        ImageView imageView = this.ru;
        if (imageView != null) {
            imageView.setClickable(true);
            this.ru.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    ycc.this.xq();
                }
            });
        }
    }

    public void vk() {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        rie rieVar = this.emc;
        if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.bw(this.dr);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.xq.emc
    public void ycc() {
        b.c cVar = this.tp;
        if (cVar != null) {
            cVar.g_();
        }
    }

    @Override // s2.b.InterfaceC0477b
    public void ypw(long j10, int i10) {
    }

    public boolean zz() {
        return this.dg;
    }

    public ycc(@NonNull Context context, @NonNull rie rieVar, String str, boolean z10, boolean z11, uym uymVar) {
        this(context, rieVar, false, str, z10, z11, uymVar);
    }

    public void xq() {
        if (sz()) {
            return;
        }
        cf();
    }

    public ycc(@NonNull Context context, @NonNull rie rieVar, uym uymVar) {
        this(context, rieVar, false, uymVar);
    }

    public void ypw() {
        rie rieVar = this.emc;
        if (rieVar == null) {
            return;
        }
        int iTx = rieVar.tx();
        int iYpw = aa.dg().ypw(iTx);
        int iXq = sba.xq(aa.emc());
        if (iYpw == 1) {
            this.yzg = tp.dg(iXq);
        } else if (iYpw == 2) {
            this.yzg = tp.bw(iXq) || tp.dg(iXq) || tp.ycc(iXq);
        } else if (iYpw == 3) {
            this.yzg = false;
        } else if (iYpw == 4) {
            this.qh = true;
        } else if (iYpw == 5) {
            this.yzg = tp.dg(iXq) || tp.ycc(iXq);
        }
        if (!this.ul) {
            if (!this.bw || !hxp.ypw(this.sup)) {
                this.dg = aa.dg().xq(String.valueOf(iTx));
            }
        } else {
            this.dg = false;
        }
        if ("open_ad".equals(this.sup)) {
            this.yzg = true;
            this.dg = true;
        }
        if (hxp.ypw(this.sup)) {
            this.dg = true;
        }
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.dg(this.yzg);
        }
        this.bw = true;
    }

    public ycc(@NonNull Context context, @NonNull rie rieVar, boolean z10, String str, boolean z11, boolean z12, uym uymVar) {
        super(context);
        this.yzg = true;
        this.dg = true;
        this.ul = false;
        this.bw = false;
        this.ee = true;
        this.db = false;
        this.sb = true;
        this.gbl = true;
        this.sup = "embeded_ad";
        this.sz = 50;
        this.sf = true;
        this.xmt = false;
        this.lt = new sf(qh.ypw().getLooper(), this);
        this.mkp = false;
        this.iyl = Build.MODEL;
        this.qh = false;
        this.cf = true;
        this.ra = new AtomicBoolean(false);
        this.wo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                ycc yccVar = ycc.this;
                yccVar.emc(yccVar.cuf, ycc.sra.intValue());
            }
        };
        this.xxg = new AtomicBoolean(false);
        this.yz = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ycc.this.sba();
            }
        };
        try {
            if (rieVar.jn()) {
                this.hxp = CacheDirFactory.getICacheDir(0).ypw();
            }
        } catch (Throwable unused) {
        }
        if (uymVar != null) {
            this.ycc = uymVar;
        }
        this.sup = str;
        this.f9302aa = context;
        this.emc = rieVar;
        this.ul = z10;
        setContentDescription("NativeVideoTsView");
        this.db = z11;
        this.sb = z12;
        ypw();
        bw();
    }

    @Override // s2.b.InterfaceC0477b
    public void emc(long j10, int i10) {
        b.c cVar = this.tp;
        if (cVar != null) {
            cVar.j_();
        }
    }

    @Override // s2.b.InterfaceC0477b
    public void emc(long j10, long j11) {
        b.c cVar = this.tp;
        if (cVar != null) {
            cVar.emc(j10, j11);
        }
    }

    private View emc(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.sba = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.xq = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.mxo = view;
        return frameLayout;
    }

    private RelativeLayout ypw(Context context) {
        com.bytedance.sdk.openadsdk.core.ycc.uym uymVar = new com.bytedance.sdk.openadsdk.core.ycc.uym(context);
        uymVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        uymVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        dgVar.setLayoutParams(layoutParams);
        dgVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.msw = dgVar;
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        dgVar2.setLayoutParams(layoutParams2);
        dgVar2.setVisibility(8);
        dgVar2.setBackground(com.bytedance.sdk.component.utils.rie.xq(context, "tt_new_play_video"));
        this.ru = dgVar2;
        uymVar.addView(dgVar);
        uymVar.addView(dgVar2);
        return uymVar;
    }

    private void emc(View view, ViewGroup viewGroup, View view2) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    public boolean emc(long j10, boolean z10, boolean z11) {
        boolean zEmc = false;
        this.sba.setVisibility(0);
        this.dr = j10;
        if (!cuf()) {
            return true;
        }
        this.ypw.emc(false);
        rie rieVar = this.emc;
        if (rieVar != null && rieVar.iat() != null) {
            com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(CacheDirFactory.getICacheDir(this.emc.zxw()).xq(), this.emc);
            ypwVarEmc.ypw(this.emc.ye());
            ypwVarEmc.ypw(this.sba.getWidth());
            ypwVarEmc.xq(this.sba.getHeight());
            ypwVarEmc.xq(this.emc.wdp());
            ypwVarEmc.emc(j10);
            ypwVarEmc.emc(zz());
            emc(ypwVarEmc);
            if (z11) {
                this.ypw.ypw(ypwVarEmc);
                return true;
            }
            zEmc = this.ypw.emc(ypwVarEmc);
        }
        if (((j10 > 0 && !z10 && !z11) || (j10 > 0 && z10)) && this.ypw != null) {
            cf.emc emcVar = new cf.emc();
            emcVar.ypw(this.ypw.ycc());
            emcVar.dg(this.ypw.zz());
            emcVar.xq(this.ypw.uym());
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.ypw(this.ypw.sup(), emcVar);
        }
        return zEmc;
    }

    public void ypw(boolean z10) {
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.ypw(z10);
            bw bwVarSup = this.ypw.sup();
            if (bwVarSup != null) {
                bwVarSup.ypw();
                View viewXq = bwVarSup.xq();
                if (viewXq != null) {
                    if (viewXq.getParent() != null) {
                        ((ViewGroup) viewXq.getParent()).removeView(viewXq);
                    }
                    viewXq.setVisibility(0);
                    addView(viewXq);
                    bwVarSup.emc((Object) this.emc, new WeakReference(this.f9302aa), false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what == 1) {
            hxp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(boolean z10, int i10) throws JSONException {
        if (this.emc == null || this.ypw == null) {
            return;
        }
        boolean zDb = db();
        sb();
        if (zDb && this.ypw.sz()) {
            this.ypw.sz();
            ypw(true);
            dg();
            return;
        }
        if (z10 && this.ee && !this.ypw.sz() && !this.ypw.rie()) {
            if (this.ypw.gbl() != null && this.ypw.gbl().uym()) {
                if (this.yzg || i10 == 1) {
                    xq xqVar = this.ypw;
                    if (xqVar != null) {
                        emc(xqVar.hxp(), "changeVideoStatus");
                    }
                    if ("ALP-AL00".equals(this.iyl)) {
                        this.ypw.xq();
                    } else {
                        if (!zz.ypw().cf()) {
                            zDb = true;
                        }
                        this.ypw.uym(zDb);
                    }
                    emc(false);
                    b.c cVar = this.tp;
                    if (cVar != null) {
                        cVar.i_();
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.yzg && this.ypw.gbl() == null) {
                if (!this.ra.get()) {
                    this.ra.set(true);
                }
                this.xxg.set(false);
                ylm();
                return;
            }
            return;
        }
        if (this.ypw.gbl() == null || !this.ypw.gbl().ycc()) {
            return;
        }
        this.ypw.ypw();
        emc(true);
        b.c cVar2 = this.tp;
        if (cVar2 != null) {
            cVar2.h_();
        }
    }

    public void emc(boolean z10, String str) {
        if (hxp.ypw(this.sup)) {
            z10 = true;
        }
        this.dg = z10;
        xq xqVar = this.ypw;
        if (xqVar != null) {
            xqVar.emc(z10, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.xq.emc
    public void emc(int i10) {
        ypw();
    }

    public void emc(boolean z10) {
        if (this.zz == null) {
            this.zz = new ImageView(getContext());
            if (zz.ypw().vk() != null) {
                this.zz.setImageBitmap(zz.ypw().vk());
            } else {
                this.zz.setImageResource(com.bytedance.sdk.component.utils.rie.dg(aa.emc(), "tt_new_play_video"));
            }
            this.zz.setScaleType(ImageView.ScaleType.FIT_XY);
            int iYpw = vw.ypw(getContext(), this.sz);
            int iYpw2 = vw.ypw(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iYpw, iYpw);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = iYpw2;
            layoutParams.bottomMargin = iYpw2;
            this.sba.addView(this.zz, layoutParams);
            this.zz.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ycc.this.cf();
                }
            });
        }
        if (z10) {
            this.zz.setVisibility(0);
        } else {
            this.zz.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.sup.ycc emc(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (o.a(this.ypw)) {
            return this.ypw.emc(this, list);
        }
        return null;
    }

    private void emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
        try {
            if (this.emc.jn()) {
                xqVar.emc(this.hxp);
            }
        } catch (Throwable unused) {
        }
    }
}
