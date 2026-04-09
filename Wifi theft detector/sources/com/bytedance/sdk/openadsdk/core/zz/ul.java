package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ypw.ru;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.dg.uym;
import com.bytedance.sdk.openadsdk.core.iyl;
import com.bytedance.sdk.openadsdk.core.mkp;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.xq.emc;
import com.bytedance.sdk.openadsdk.core.xq.xq;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ul extends com.bytedance.sdk.openadsdk.core.ycc.xq implements com.bytedance.sdk.component.adexpress.dynamic.dg, com.bytedance.sdk.component.adexpress.ypw.cf, com.bytedance.sdk.component.adexpress.ypw.msw, emc.InterfaceC0166emc, cf {

    /* renamed from: aa, reason: collision with root package name */
    boolean f9309aa;
    private List<com.bytedance.sdk.component.adexpress.ypw.ru> but;
    private PAGExpressAdWrapperListener bw;
    protected boolean cf;
    private com.bytedance.sdk.component.adexpress.ypw.sz cn;
    private String cuf;
    long db;
    private TTDislikeDialogAbstract dg;
    private float dr;
    public com.bytedance.sdk.openadsdk.dg.uym ee;
    private boolean emc;
    private com.bytedance.sdk.component.adexpress.ypw.ycc ffd;
    private int fu;
    protected AdSlot gbl;
    private com.bytedance.sdk.openadsdk.core.gbl.ycc.dg hj;
    boolean hxp;
    private String iyl;
    private float jp;
    private com.bytedance.sdk.openadsdk.dg.dg.bw lt;
    private float ltx;
    private boolean mkp;
    private String msw;
    private uym.emc mxo;
    private com.bytedance.sdk.openadsdk.core.gbl.ypw.uym ndl;
    private final SparseArray<xq.emc> nw;
    private long pe;
    private final Runnable pxa;
    protected boolean qh;
    private final AtomicBoolean ra;
    int rie;
    private float rig;
    private hxp rqm;
    private com.bytedance.sdk.openadsdk.core.gbl.xq.ypw rtt;
    protected String ru;
    protected com.bytedance.sdk.component.adexpress.ypw.ypw sb;
    protected int sba;
    public com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> sf;
    public boolean sra;
    protected com.bytedance.sdk.openadsdk.core.model.rie sup;
    public FrameLayout sz;
    private boolean tp;
    protected HashSet<String> ul;
    private zz uym;
    protected com.bytedance.sdk.component.adexpress.ypw.xq vk;
    private sra vw;
    private ThemeStatusBroadcastReceiver wa;
    private ru.emc wad;
    private float wbn;
    private com.bytedance.sdk.component.adexpress.ypw.vk wd;
    private xq wo;
    private final Runnable wpn;
    private com.bytedance.sdk.component.adexpress.ypw.zz xhi;
    private float xmt;
    private com.bytedance.sdk.openadsdk.xq.xq xq;
    private final ViewTreeObserver.OnScrollChangedListener xxg;
    private msw ycc;
    private com.bytedance.sdk.openadsdk.core.dg.zz yid;
    protected ViewGroup ylm;
    private int ypw;
    private final Runnable yz;
    protected String yzg;
    protected final Context zz;

    public ul(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, AdSlot adSlot, String str) {
        super(context);
        this.emc = true;
        this.ypw = 0;
        this.ru = "embeded_ad";
        this.msw = null;
        this.cf = false;
        this.f9309aa = true;
        this.sba = -1;
        this.cuf = "";
        this.sra = false;
        this.tp = true;
        this.rie = -1;
        this.ee = new com.bytedance.sdk.openadsdk.dg.uym();
        this.db = 0L;
        this.ra = new AtomicBoolean(false);
        this.xxg = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ul ulVar = ul.this;
                if (ulVar.f9309aa && ulVar.zz()) {
                    ul.this.sb();
                    ul ulVar2 = ul.this;
                    ulVar2.removeCallbacks(ulVar2.yz);
                    ul ulVar3 = ul.this;
                    ulVar3.postDelayed(ulVar3.yz, 500L);
                }
            }
        };
        this.yz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.2
            @Override // java.lang.Runnable
            public void run() {
                if (!mkp.emc(ul.this, 0, 5, false)) {
                    ul.this.ycc(8);
                } else {
                    ul ulVar = ul.this;
                    ulVar.ycc(ulVar.getVisibility());
                }
            }
        };
        this.wpn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.3
            @Override // java.lang.Runnable
            public void run() {
                ul.this.ycc(0);
            }
        };
        this.pxa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.4
            @Override // java.lang.Runnable
            public void run() {
                ul.this.ycc(8);
            }
        };
        this.fu = 8;
        this.nw = new SparseArray<>();
        this.wbn = -1.0f;
        this.jp = -1.0f;
        this.ltx = -1.0f;
        this.rig = -1.0f;
        this.pe = 0L;
        this.ru = str;
        this.zz = context;
        this.sup = rieVar;
        this.gbl = adSlot;
        this.sra = false;
        uym();
    }

    private void aa() {
        if (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg.emc(this.ru)) {
            com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg dgVar = new com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg(this.zz, this.sup, this.sra, (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) this.cn, this, this.dr, this.xmt, this.cf, this.ru);
            com.bytedance.sdk.openadsdk.core.gbl.ypw.uym uymVar = new com.bytedance.sdk.openadsdk.core.gbl.ypw.uym(this.zz, dgVar, this, this.cn);
            dgVar.emc((cf) this);
            this.but.add(uymVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.ypw.ycc yccVar = new com.bytedance.sdk.component.adexpress.ypw.ycc(this.zz, this.cn, new ylm(this, this.wa, this.cn));
        this.ffd = yccVar;
        this.but.add(yccVar);
    }

    private void cf() {
        if (this.sup.mfx() == 1 && this.sup.ak()) {
            aa();
            this.wad = new com.bytedance.sdk.component.adexpress.ypw.sup(this.but, this.xhi);
            return;
        }
        if (lt()) {
            vk();
            return;
        }
        try {
            ee();
            hxp hxpVar = new hxp(this.zz, this.cn, this.wa, this.lt, this.sup);
            this.rqm = hxpVar;
            com.bytedance.sdk.component.adexpress.ypw.vk vkVar = new com.bytedance.sdk.component.adexpress.ypw.vk(this.zz, this.cn, hxpVar, this);
            this.wd = vkVar;
            this.but.add(vkVar);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.emc("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        aa();
        this.wad = new com.bytedance.sdk.component.adexpress.ypw.sup(this.but, this.xhi);
    }

    private void db() {
        ul ulVar;
        com.bytedance.sdk.openadsdk.core.gbl.ycc.dg dgVar;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.sup;
        if (rieVar2 == null || rieVar2.mfx() != 1 || this.sup.yid() == 2) {
            if (!com.bytedance.sdk.openadsdk.core.gbl.ycc.emc.dg.emc(this.ru) || (rieVar = this.sup) == null || rieVar.yid() == 2) {
                com.bytedance.sdk.openadsdk.core.uym.emc.emc emcVar = new com.bytedance.sdk.openadsdk.core.uym.emc.emc();
                int i10 = this.ypw;
                if (i10 != 0) {
                    if (i10 == 3) {
                        com.bytedance.sdk.component.adexpress.dynamic.bw.uym uymVar = new com.bytedance.sdk.component.adexpress.dynamic.bw.uym();
                        Context applicationContext = this.zz.getApplicationContext();
                        com.bytedance.sdk.component.adexpress.ypw.sz szVar = this.cn;
                        ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver = this.wa;
                        boolean z10 = this.sra;
                        com.bytedance.sdk.component.adexpress.ypw.ypw ypwVar = new com.bytedance.sdk.component.adexpress.ypw.ypw(applicationContext, szVar, themeStatusBroadcastReceiver, z10, uymVar, this, emcVar, new ycc(this.zz, themeStatusBroadcastReceiver, z10, uymVar, szVar, emcVar));
                        this.sb = ypwVar;
                        this.but.add(ypwVar);
                        return;
                    }
                    if (i10 == 7) {
                        com.bytedance.sdk.openadsdk.core.gbl.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.gbl.ycc.dg(this.zz, this.sup, this.sra, (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) this.cn, this);
                        this.hj = dgVar2;
                        com.bytedance.sdk.openadsdk.core.gbl.ypw.uym uymVar2 = new com.bytedance.sdk.openadsdk.core.gbl.ypw.uym(this.zz, dgVar2, this, this.cn);
                        this.ndl = uymVar2;
                        uymVar2.emc(this);
                        this.but.add(this.ndl);
                        return;
                    }
                    if (i10 != 9) {
                        if (i10 != 10) {
                            return;
                        }
                        if (!this.mkp || (dgVar = this.hj) == null) {
                            ulVar = this;
                            ulVar.hj = new com.bytedance.sdk.openadsdk.core.gbl.ycc.uym(this.zz, this.sup, this.sra, (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) this.cn, this);
                        } else {
                            dgVar.emc(this.sup, this.sra, (com.bytedance.sdk.openadsdk.core.gbl.ycc.emc) this.cn, this);
                            ulVar = this;
                        }
                        com.bytedance.sdk.openadsdk.core.gbl.ypw.uym uymVar3 = new com.bytedance.sdk.openadsdk.core.gbl.ypw.uym(ulVar.zz, ulVar.hj, this, ulVar.cn);
                        ulVar.ndl = uymVar3;
                        uymVar3.emc(this);
                        ulVar.but.add(ulVar.ndl);
                        return;
                    }
                }
                hxp hxpVar = new hxp(this.zz, this.cn, this.wa, this.lt, this.sup);
                this.rqm = hxpVar;
                com.bytedance.sdk.component.adexpress.ypw.vk vkVar = new com.bytedance.sdk.component.adexpress.ypw.vk(this.zz, this.cn, hxpVar, this);
                this.wd = vkVar;
                this.but.add(vkVar);
            }
        }
    }

    private void dr() {
        List<com.bytedance.sdk.component.adexpress.ypw.ru> list = this.but;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ypw.ru> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void ee() {
        if (com.bytedance.sdk.openadsdk.core.qh.bw()) {
            return;
        }
        sup.emc();
    }

    private boolean lt() {
        return TextUtils.equals(this.ru, "fullscreen_interstitial_ad") || TextUtils.equals(this.ru, "rewarded_video") || TextUtils.equals("open_ad", this.ru) || hxp.ypw(this.ru) || TextUtils.equals(this.ru, "embeded_ad");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qh() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.zz.ul.qh():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sb() {
        if (this.ra.get()) {
            this.ee.emc(System.currentTimeMillis(), mkp.emc(this));
        }
    }

    private boolean sf() {
        return com.bytedance.sdk.openadsdk.core.model.rie.bw(this.sup);
    }

    private void sz() {
        rie.emc emcVarZhk = this.sup.zhk();
        if (!TextUtils.equals(this.ru, "embeded_ad") || emcVarZhk == null) {
            return;
        }
        String strRu = emcVarZhk.ru();
        if (TextUtils.isEmpty(strRu)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strRu);
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            if (iOptInt == 0 || iOptInt2 == 0) {
                return;
            }
            this.xmt = iOptInt2;
            this.dr = iOptInt;
        } catch (Exception unused) {
        }
    }

    private void vk() {
        this.ypw = this.sup.ej();
        try {
            ee();
            db();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ul.emc("NativeExpressView", "NativeExpressView dynamicRender fail", e10);
        }
        boolean z10 = this.sup.yuz() == 1;
        this.emc = z10;
        if (z10) {
            aa();
        }
        Objects.toString(this.but);
        this.wad = new com.bytedance.sdk.component.adexpress.ypw.sup(this.but, this.xhi);
    }

    private void xmt() {
        List<com.bytedance.sdk.component.adexpress.ypw.ru> list = this.but;
        if (list == null) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.ypw.ru> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.cf
    public void a_(int i10) {
        com.bytedance.sdk.component.adexpress.ypw.zz zzVar = this.xhi;
        if (zzVar != null) {
            if (!this.emc) {
                zzVar.msw();
            }
            this.xhi.zz();
            ((sz) this.xhi).gbl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.msw.emc(i10), i10);
        }
        sra sraVar = this.vw;
        if (sraVar != null) {
            sraVar.emc(this.sup, this.ru);
        }
    }

    public int bw() {
        return 0;
    }

    public long dg() {
        return 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        msw mswVar = this.ycc;
        if (mswVar != null) {
            mswVar.ypw(motionEvent.getDeviceId());
            this.ycc.emc(motionEvent.getSource());
            this.ycc.xq(motionEvent.getToolType(0));
        }
        zz zzVar = this.uym;
        if (zzVar != null) {
            zzVar.ypw(motionEvent.getDeviceId());
            this.uym.emc(motionEvent.getSource());
            this.uym.xq(motionEvent.getToolType(0));
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            int i11 = 3;
            if (actionMasked == 1) {
                i10 = i11;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
                i10 = i11;
            } else {
                this.ltx += Math.abs(motionEvent.getX() - this.wbn);
                this.rig += Math.abs(motionEvent.getY() - this.jp);
                this.wbn = motionEvent.getX();
                this.jp = motionEvent.getY();
                i10 = (System.currentTimeMillis() - this.pe <= 200 || (this.ltx <= 8.0f && this.rig <= 8.0f)) ? 2 : 1;
            }
        } else {
            this.wbn = motionEvent.getRawX();
            this.jp = motionEvent.getRawY();
            this.pe = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.ru.xq.emc(motionEvent);
            i10 = 0;
        }
        SparseArray<xq.emc> sparseArray = this.nw;
        if (sparseArray != null) {
            sparseArray.put(motionEvent.getActionMasked(), new xq.emc(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void emc() {
    }

    public void gbl() {
    }

    public com.bytedance.sdk.openadsdk.dg.uym getAdShowTime() {
        return this.ee;
    }

    public xq getBrandBannerController() {
        return this.wo;
    }

    public msw getClickCreativeListener() {
        return this.ycc;
    }

    public zz getClickListener() {
        return this.uym;
    }

    public String getClosedListenerKey() {
        return this.iyl;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar != null) {
            return dgVar.xq();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.xmt).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.dr).intValue();
    }

    public PAGExpressAdWrapperListener getExpressInteractionListener() {
        return this.bw;
    }

    public rtt getJsObject() {
        hxp hxpVar = this.rqm;
        if (hxpVar != null) {
            return hxpVar.vk();
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        ru ruVarCf;
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (!(dgVar instanceof hxp) || (ruVarCf = ((hxp) dgVar).cf()) == null) {
            return 0;
        }
        return ruVarCf.emc();
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.aa.dg().mkp();
    }

    public String getUgenTemplateErrorReason() {
        return this.cuf;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc.InterfaceC0166emc
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.dg.zz zzVar = this.yid;
        if (zzVar != null) {
            return zzVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.zz.ycc getWebView() {
        hxp hxpVar = this.rqm;
        if (hxpVar == null) {
            return null;
        }
        return hxpVar.emc();
    }

    public void hxp() {
        com.bytedance.sdk.openadsdk.core.gbl.xq.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.gbl.xq.ypw(this.zz, this.sup);
        this.rtt = ypwVar;
        ypwVar.emc(this);
        this.rtt.emc(new com.bytedance.sdk.openadsdk.core.gbl.xq.emc() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.7
            @Override // com.bytedance.sdk.openadsdk.core.gbl.xq.emc
            public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
                emc(view, i10, xqVar);
            }
        });
    }

    public boolean msw() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sb();
        dr();
        getViewTreeObserver().addOnScrollChangedListener(this.xxg);
        com.bytedance.sdk.openadsdk.core.zz.ypw().emc(this.iyl, this.mxo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.xxg);
        com.bytedance.sdk.openadsdk.core.zz.ypw().ycc(this.iyl);
        xmt();
        emc(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        sb();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z10 ? getVisibility() : 8);
        }
        sb();
        com.bytedance.sdk.openadsdk.ee.emc.xq.emc(this.sup, z10);
        if (z10) {
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.sup, 4);
        } else {
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.sup, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        emc(i10, true, false);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void onvideoComplate() {
    }

    public boolean rie() {
        return this.ra.get();
    }

    public void ru() {
        hxp hxpVar = this.rqm;
        if (hxpVar == null || hxpVar.bw() == null) {
            return;
        }
        this.rqm.ycc();
    }

    public void sba() {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof hxp) {
            if (dgVar == null) {
                return;
            }
            ((hxp) dgVar).msw();
            com.bytedance.sdk.component.utils.zz.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.6
                @Override // java.lang.Runnable
                public void run() {
                    ul.this.bw(1);
                }
            }, (this.sup != null ? r0.db().dg() : 5) * 1000);
        } else if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) dgVar).gbl();
        }
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
        if (rieVar != null && (dgVarEh = rieVar.eh()) != null && (dgVarEmc = dgVarEh.emc()) != null) {
            dgVarEmc.emc(0L);
        }
        if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) && com.bytedance.sdk.openadsdk.core.model.aa.emc(this.sup)) {
            emc(this.sf);
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.ypw.xq xqVar) {
        this.vk = xqVar;
        com.bytedance.sdk.component.adexpress.ypw.ycc yccVar = this.ffd;
        if (yccVar != null) {
            yccVar.emc(xqVar);
        }
    }

    public void setBannerClickClosedListener(uym.emc emcVar) {
        this.mxo = emcVar;
    }

    public void setClickCreativeListener(msw mswVar) {
        this.ycc = mswVar;
        if (mswVar != null) {
            mswVar.emc((emc.InterfaceC0166emc) this);
        }
    }

    public void setClickListener(zz zzVar) {
        this.uym = zzVar;
    }

    public void setClosedListenerKey(String str) {
        this.iyl = str;
        xq xqVar = this.wo;
        if (xqVar != null) {
            xqVar.emc(str);
        }
    }

    public void setDislike(com.bytedance.sdk.openadsdk.xq.xq xqVar) {
        emc emcVar;
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar != null && (dgVar instanceof ylm) && (emcVar = (emc) dgVar.bw()) != null) {
            emcVar.setDislikeInner(xqVar);
        }
        xq xqVar2 = this.wo;
        if (xqVar2 != null) {
            xqVar2.emc(xqVar);
        }
        this.xq = xqVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.bw = pAGExpressAdWrapperListener;
        xq xqVar = this.wo;
        if (xqVar != null) {
            xqVar.emc(pAGExpressAdWrapperListener);
        }
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.bw bwVar) {
        if (this.rqm != null && getJsObject() != null) {
            getJsObject().emc(bwVar);
        }
        com.bytedance.sdk.openadsdk.core.gbl.ycc.dg dgVar = this.hj;
        if (dgVar != null) {
            dgVar.emc(bwVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        emc emcVar;
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar != null && (dgVar instanceof ylm) && (emcVar = (emc) dgVar.bw()) != null) {
            emcVar.setDislikeOuter(tTDislikeDialogAbstract);
        }
        xq xqVar = this.wo;
        if (xqVar != null) {
            xqVar.emc(tTDislikeDialogAbstract);
        }
        this.dg = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z10) {
        this.sra = z10;
        com.bytedance.sdk.component.adexpress.ypw.ypw ypwVar = this.sb;
        if (ypwVar != null && ypwVar.ypw() != null) {
            this.sb.ypw().setSoundMute(z10);
        }
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(String.valueOf(charSequence));
            ypw(i12, i10);
            com.bytedance.sdk.openadsdk.core.gbl.xq.ypw ypwVar = this.rtt;
            if (ypwVar != null) {
                ypwVar.emc(i12);
            }
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dg
    public void setTimeUpdate(int i10) {
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.dg.zz zzVar) {
        this.yid = zzVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar) {
        hxp hxpVar = this.rqm;
        if (hxpVar != null) {
            hxpVar.emc(ypwVar);
        }
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.sz.uym uymVar) {
        if (this.rqm == null || getJsObject() == null) {
            return;
        }
        getJsObject().emc(uymVar);
    }

    public void sra() {
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh;
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
        if (rieVar == null || (dgVarEh = rieVar.eh()) == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.bw(getVideoProgress());
    }

    public void sup() {
        try {
            xq xqVar = this.wo;
            if (xqVar != null) {
                xqVar.ypw();
            }
            sra();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.ypw.ru> list = this.but;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.ypw.ru> it = list.iterator();
                while (it.hasNext()) {
                    it.next().emc();
                }
            }
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.sup);
            com.bytedance.sdk.openadsdk.ee.emc.xq.ypw(this.sup);
            this.xq = null;
            this.dg = null;
            this.gbl = null;
            this.sup = null;
            this.bw = null;
            this.ycc = null;
            this.vk = null;
            this.uym = null;
            com.bytedance.sdk.openadsdk.core.gbl.xq.ypw ypwVar = this.rtt;
            if (ypwVar != null) {
                ypwVar.dg();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("NativeExpressView", "detach error", th);
        }
    }

    public void ul() {
        try {
            FrameLayout frameLayout = this.sz;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.sz);
        } catch (Throwable unused) {
        }
    }

    public void uym() {
        this.ul = new HashSet<>();
        this.wa = new ThemeStatusBroadcastReceiver();
        AdSlot adSlot = this.gbl;
        if (adSlot != null) {
            this.dr = adSlot.getExpressViewAcceptedWidth();
            this.xmt = this.gbl.getExpressViewAcceptedHeight();
            sz();
            this.msw = this.gbl.getCodeId();
            if (TextUtils.equals(this.ru, "fullscreen_interstitial_ad")) {
                this.rie = this.sup.bhr();
            } else if (TextUtils.equals(this.ru, "rewarded_video")) {
                this.rie = this.sup.iw();
            } else if (TextUtils.equals(this.ru, "open_ad")) {
                com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
                if (rieVar == null || rieVar.ypw() < 0) {
                    this.rie = com.bytedance.sdk.openadsdk.core.aa.dg().sra(this.msw);
                } else {
                    this.rie = this.sup.ypw();
                }
                if (this.rie < 0) {
                    this.rie = 5;
                }
            }
        }
        setBackgroundColor(0);
        if (this.sup.yvi()) {
            this.wo = new xq(this.zz, this, this.sup, this.ru);
            return;
        }
        qh();
        this.but = new ArrayList();
        cf();
        com.bytedance.sdk.component.adexpress.ypw.vk vkVar = this.wd;
        if (vkVar != null) {
            this.rqm = (hxp) vkVar.ypw();
        }
        rtt jsObject = getJsObject();
        if (jsObject != null) {
            jsObject.ycc(this.ru);
        }
    }

    public long xq() {
        return 0L;
    }

    public void ycc() {
    }

    public boolean ylm() {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        return dgVar != null && (dgVar instanceof ylm);
    }

    public void ypw() {
    }

    public void yzg() {
        if (this.sup == null) {
            return;
        }
        this.db = SystemClock.elapsedRealtime();
        if (this.sup.yvi()) {
            xq xqVar = this.wo;
            if (xqVar == null) {
                a_(106);
                return;
            } else {
                xqVar.emc((com.bytedance.sdk.component.adexpress.ypw.cf) this);
                this.wo.emc();
                return;
            }
        }
        this.lt.emc();
        ru.emc emcVar = this.wad;
        if (emcVar != null) {
            emcVar.emc(this);
        }
        try {
            this.wad.emc();
        } catch (Throwable unused) {
        }
    }

    public boolean zz() {
        return true;
    }

    public void emc(int i10) {
    }

    public void xq(JSONObject jSONObject) {
    }

    public void ycc(int i10) {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar == null || !(dgVar instanceof hxp)) {
            return;
        }
        ((hxp) dgVar).emc(i10);
        this.fu = i10;
    }

    public void ypw(int i10) {
    }

    public void bw(int i10) {
        if (com.bytedance.sdk.openadsdk.core.model.ul.xq(this.sup)) {
            com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
            if (dgVar instanceof hxp) {
                ((hxp) dgVar).ypw(i10);
            }
        }
    }

    public void emc(int i10, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
    }

    public boolean ypw(com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        return true;
    }

    public void emc(int i10, String str) {
    }

    public bw.emc xq(int i10) {
        return new bw.emc(i10);
    }

    public boolean ypw(JSONObject jSONObject) {
        return false;
    }

    public void emc(sz.emc emcVar) {
    }

    public void emc(String str, JSONObject jSONObject) {
    }

    public void ypw(int i10, int i11) {
        int iMin;
        if (TextUtils.equals(this.ru, "banner_ad")) {
            return;
        }
        String str = this.ru;
        int i12 = this.rie;
        int i13 = ((i11 < i12 || i12 < 0 || !(this.hxp || TextUtils.equals(str, "open_ad"))) && !((i10 == 0 && TextUtils.equals(this.ru, "open_ad")) || bw() == 5)) ? 0 : 1;
        if (i11 <= this.rie) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
            if (rieVar != null && rieVar.iat() != null) {
                iMin = (int) (Math.min(this.rie, this.sup.iat().E() * this.sup.iat().u()) - i11);
            } else {
                iMin = this.rie - i11;
            }
        } else {
            iMin = 0;
        }
        com.bytedance.sdk.component.adexpress.ypw.ypw ypwVar = this.sb;
        if (ypwVar != null && ypwVar.ypw() != null) {
            this.sb.ypw().setTime(String.valueOf(i10), i13, iMin, false);
        }
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.dg) dgVar).setTime(String.valueOf(i10), i13, iMin, false);
        }
    }

    public void emc(boolean z10, String str) {
    }

    public boolean emc(JSONObject jSONObject) {
        return false;
    }

    public void emc(int i10, boolean z10, boolean z11) {
        this.f9309aa = z10;
        removeCallbacks(this.pxa);
        removeCallbacks(this.wpn);
        if (i10 == 0) {
            if (z11) {
                this.wpn.run();
                return;
            } else {
                postDelayed(this.wpn, 50L);
                return;
            }
        }
        if (z11) {
            this.pxa.run();
        } else {
            postDelayed(this.pxa, 50L);
        }
    }

    public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.ul.emc("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i10));
        if (i10 == -1 || xqVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (dr.xq(this.sup)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.vk vkVar = (com.bytedance.sdk.openadsdk.core.model.vk) xqVar;
        if (com.bytedance.sdk.openadsdk.core.model.ul.xq(this.sup)) {
            try {
                JSONObject jSONObject2 = vkVar.sz;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq(th.toString(), new Object[0]);
            }
        }
        msw mswVar = this.ycc;
        if (mswVar != null) {
            mswVar.dg(getDynamicShowType());
            this.ycc.emc(map);
        }
        zz zzVar = this.uym;
        if (zzVar != null) {
            zzVar.dg(getDynamicShowType());
            this.uym.emc(map);
        }
        float f10 = vkVar.emc;
        float f11 = vkVar.ypw;
        float f12 = vkVar.xq;
        float f13 = vkVar.dg;
        boolean z10 = vkVar.gbl;
        SparseArray<xq.emc> sparseArray = vkVar.ru;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.nw;
        }
        SparseArray<xq.emc> sparseArray2 = sparseArray;
        String str = vkVar.uym;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectEmc = view != this ? emc(view) : null;
            view2 = view;
        }
        vkVar.msw = i10;
        if (jSONObjectEmc != null && vkVar.zz == null) {
            vkVar.zz = jSONObjectEmc;
        }
        if (i10 != 13) {
            switch (i10) {
                case 1:
                    FrameLayout frameLayout = this.sz;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.sup;
                    if (rieVar == null || rieVar.jp() != 1 || z10) {
                        zz zzVar2 = this.uym;
                        if (zzVar2 != null) {
                            zzVar2.emc(vkVar);
                            this.uym.emc(str);
                            this.uym.emc(view2, f10, f11, f12, f13, sparseArray2, z10);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bw;
                        if (pAGExpressAdWrapperListener != null && !vkVar.qh) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (vkVar.sup > 0) {
                        iyl.emc(true);
                    }
                    msw mswVar2 = this.ycc;
                    if (mswVar2 != null) {
                        mswVar2.emc(vkVar);
                        this.ycc.emc(str);
                        if (com.bytedance.sdk.openadsdk.core.model.ul.xq(this.sup) && (jSONObject = vkVar.sz) != null) {
                            this.ycc.dg(jSONObject.optBoolean("is_ceiling_page", false));
                        }
                        this.ycc.emc(view2, f10, f11, f12, f13, sparseArray2, z10);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.bw;
                    if (pAGExpressAdWrapperListener2 != null && !vkVar.qh) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    iyl.emc(false);
                    com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this.sup, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.dg;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                        break;
                    } else {
                        com.bytedance.sdk.openadsdk.xq.xq xqVar2 = this.xq;
                        if (xqVar2 != null) {
                            xqVar2.emc();
                            break;
                        } else {
                            TTDelegateActivity.emc(this.sup, this.iyl);
                            break;
                        }
                    }
                case 4:
                    FrameLayout frameLayout2 = this.sz;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.sup;
                    if (rieVar2 == null || rieVar2.jp() != 1 || z10) {
                        tp.xq(this.sup);
                        if ("embeded_ad".equals(this.ru) && sf() && !this.qh && tp.xq(this.sup)) {
                            msw mswVar3 = this.ycc;
                            if (mswVar3 != null) {
                                mswVar3.emc(vkVar);
                                this.ycc.emc(str);
                                this.ycc.emc(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        } else {
                            zz zzVar3 = this.uym;
                            if (zzVar3 != null) {
                                zzVar3.emc(vkVar);
                                this.uym.emc(str);
                                this.uym.emc(view2, f10, f11, f12, f13, sparseArray2, z10);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.bw;
                        if (pAGExpressAdWrapperListener3 != null && !vkVar.qh) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    emc(!this.sra, "dynamicClick");
                    break;
                case 6:
                    emc();
                    break;
                case 7:
                    TTWebsiteActivity.emc(this.zz, this.sup, this.ru);
                    break;
            }
            return;
        }
        int i11 = vkVar.cf;
        if (i11 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i11);
                emc(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    public void ypw(int i10, String str) throws JSONException {
        rtt rttVarVk;
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if (dgVar == null || !(dgVar instanceof hxp) || (rttVarVk = ((hxp) dgVar).vk()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i10);
            jSONObject.put("flag", str);
            rttVarVk.emc("onVideoPaused", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void uym(int i10) {
        com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar = this.sf;
        if ((dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) && i10 == 4) {
            ((com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) dgVar).ru();
        }
    }

    public ul(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        super(context);
        this.emc = true;
        this.ypw = 0;
        this.ru = "embeded_ad";
        this.msw = null;
        this.cf = false;
        this.f9309aa = true;
        this.sba = -1;
        this.cuf = "";
        this.sra = false;
        this.tp = true;
        this.rie = -1;
        this.ee = new com.bytedance.sdk.openadsdk.dg.uym();
        this.db = 0L;
        this.ra = new AtomicBoolean(false);
        this.xxg = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                ul ulVar = ul.this;
                if (ulVar.f9309aa && ulVar.zz()) {
                    ul.this.sb();
                    ul ulVar2 = ul.this;
                    ulVar2.removeCallbacks(ulVar2.yz);
                    ul ulVar3 = ul.this;
                    ulVar3.postDelayed(ulVar3.yz, 500L);
                }
            }
        };
        this.yz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.2
            @Override // java.lang.Runnable
            public void run() {
                if (!mkp.emc(ul.this, 0, 5, false)) {
                    ul.this.ycc(8);
                } else {
                    ul ulVar = ul.this;
                    ulVar.ycc(ulVar.getVisibility());
                }
            }
        };
        this.wpn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.3
            @Override // java.lang.Runnable
            public void run() {
                ul.this.ycc(0);
            }
        };
        this.pxa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.ul.4
            @Override // java.lang.Runnable
            public void run() {
                ul.this.ycc(8);
            }
        };
        this.fu = 8;
        this.nw = new SparseArray<>();
        this.wbn = -1.0f;
        this.jp = -1.0f;
        this.ltx = -1.0f;
        this.rig = -1.0f;
        this.pe = 0L;
        this.ru = str;
        this.zz = context;
        this.sup = rieVar;
        this.gbl = adSlot;
        this.sra = z10;
        this.tp = z11;
        uym();
    }

    public static JSONObject emc(View view) throws JSONException {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put(TtmlNode.LEFT, iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void emc(com.bytedance.sdk.component.adexpress.ypw.dg<? extends View> dgVar, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar;
        this.ra.set(true);
        this.sf = dgVar;
        dgVar.xq();
        if (this.fu != getWindowVisibility() && msw()) {
            ycc(getWindowVisibility());
        }
        if (dgVar.xq() == 3 && (rieVar = this.sup) != null && rieVar.fu() == 1) {
            this.sup.sup(0);
        }
        if (dgVar.xq() != 1 || (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.dg)) {
            View viewBw = dgVar.bw();
            if (viewBw.getParent() != null) {
                ((ViewGroup) viewBw.getParent()).removeView(viewBw);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                arrayList.add(getChildAt(i10));
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (arrayList.get(i11) instanceof com.bytedance.sdk.component.zz.ycc) {
                    removeView((View) arrayList.get(i11));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.ul.xq(this.sup)) {
                addView(dgVar.bw(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(dgVar.bw());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.rie rieVar2 = this.sup;
        if (rieVar2 != null) {
            com.bytedance.sdk.openadsdk.vk.xq.emc(rieVar2.zz(), this.db, this.ru, dgVar.xq());
        }
        com.bytedance.sdk.component.adexpress.ypw.zz zzVar = this.xhi;
        if (zzVar != null) {
            ((sz) zzVar).gbl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) qhVar.xq(), (float) qhVar.dg());
        }
        if ((this.sf instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) && com.bytedance.sdk.openadsdk.core.model.aa.emc(this.sup)) {
            hxp();
        }
        if (ypw(qhVar)) {
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(this, this.sup, xq(getDynamicShowType()));
        }
        sra sraVar = this.vw;
        if (sraVar != null) {
            sraVar.emc(this.sup, this.ru);
        }
    }

    public JSONObject emc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.rie rieVar) throws JSONException {
        if (!(this.sf instanceof hxp)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (rieVar != null) {
                if (rieVar.zhk() != null && rieVar.zhk().sup()) {
                    jSONObject.put("engine_version", rieVar.zhk().gbl());
                } else if (rieVar.kv() != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public void emc(com.bytedance.sdk.component.adexpress.ypw.dg dgVar) {
        if (this.rtt == null) {
            return;
        }
        try {
            if (dgVar instanceof com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) {
                ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.gbl.ycc.uym) dgVar).ycc().gbl();
                this.ylm = viewGroup;
                if (viewGroup != null) {
                    this.rtt.ypw();
                    View viewXq = this.rtt.xq();
                    if (viewXq != null) {
                        ViewGroup viewGroup2 = (ViewGroup) viewXq.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewXq);
                        }
                        this.ylm.addView(viewXq, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, AdSlot adSlot, String str, boolean z10, boolean z11) {
        if (rieVar == null) {
            return;
        }
        this.ru = str;
        this.sup = rieVar;
        this.gbl = adSlot;
        this.sra = z10;
        this.tp = z11;
        int iEj = rieVar.ej();
        this.ypw = iEj;
        if (iEj != 10) {
            return;
        }
        this.mkp = true;
        uym();
        yzg();
        this.mkp = false;
    }
}
