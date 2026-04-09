package com.bytedance.sdk.openadsdk.core.bly;

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
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.tlj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.lh;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.fak;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.uoy;
import com.bytedance.sdk.openadsdk.core.yu.ra;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class qbp extends com.bytedance.sdk.openadsdk.core.le.lh implements com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.ko, com.bytedance.sdk.component.adexpress.vt.pno, ko, ouw.InterfaceC0087ouw {
    private float bly;
    private String bs;

    /* renamed from: cd, reason: collision with root package name */
    long f8072cd;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.yu.fkw f8073cf;

    /* renamed from: cj, reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f8074cj;
    private float coz;
    private com.bytedance.sdk.openadsdk.core.yu.bly euf;
    protected ViewGroup ex;
    private ra.ouw ey;
    private com.bytedance.sdk.openadsdk.core.cf.lh.vt fak;
    private PAGExpressAdWrapperListener fkw;
    private lh fqk;
    public com.bytedance.sdk.component.adexpress.vt.yu<? extends View> fvf;
    private float fwd;
    private final ViewTreeObserver.OnScrollChangedListener hun;
    boolean jae;

    /* renamed from: jg, reason: collision with root package name */
    protected AdSlot f8075jg;
    protected HashSet<String> jqy;
    private vpp jvy;
    private List<com.bytedance.sdk.component.adexpress.vt.tlj> kn;
    public com.bytedance.sdk.openadsdk.core.model.vpp ko;
    int ksc;

    /* renamed from: le, reason: collision with root package name */
    private pno f8076le;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.lh.lh f8077lh;
    private final Runnable lso;
    private float lvd;
    private com.bytedance.sdk.component.adexpress.vt.bly mt;
    protected String mwh;
    private final SparseArray<lh.ouw> myk;

    /* renamed from: ng, reason: collision with root package name */
    private float f8078ng;

    /* renamed from: od, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.yu.ra f8079od;
    private String osn;
    private boolean ouw;

    /* renamed from: pd, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.vt.vt f8080pd;
    private String pno;
    private ex pv;
    boolean qbp;
    private bly ra;
    public FrameLayout rn;
    private boolean rrs;
    public final Context ryl;

    /* renamed from: sd, reason: collision with root package name */
    private long f8081sd;
    public boolean tc;

    /* renamed from: th, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.vt.lh f8082th;
    private float tlj;

    /* renamed from: ub, reason: collision with root package name */
    private final Runnable f8083ub;
    private com.bytedance.sdk.component.adexpress.vt.rn ucs;
    private boolean uoy;
    public final AtomicBoolean uq;
    private final Runnable ux;

    /* renamed from: vh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.le f8084vh;
    protected boolean vm;
    protected String vpp;
    private int vt;
    private tlj.ouw wp;
    private com.bytedance.sdk.component.adexpress.vt.mwh xdk;
    private com.bytedance.sdk.openadsdk.core.cf.le.yu yhj;
    private com.bytedance.sdk.openadsdk.core.cf.vt.ra yib;
    private TTDislikeDialogAbstract yu;
    protected boolean zih;
    protected int zin;
    private int zvq;

    public qbp(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.vm = false;
        this.qbp = true;
        this.zin = -1;
        this.bs = "";
        this.tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f8079od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f8072cd = 0L;
        this.uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f8083ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f8078ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f8081sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.ko = vppVar;
        this.f8075jg = adSlot;
        this.tc = false;
        pno();
    }

    private static void qbp() {
        if (com.bytedance.sdk.openadsdk.core.jg.fkw()) {
            return;
        }
        ryl.ouw();
    }

    private void th() {
        if (com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.mwh)) {
            com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu(this.ryl, this.ko, this.tc, (com.bytedance.sdk.openadsdk.core.cf.le.ouw) this.xdk, this, this.bly, this.tlj, this.vm, this.mwh);
            com.bytedance.sdk.openadsdk.core.cf.vt.ra raVar = new com.bytedance.sdk.openadsdk.core.cf.vt.ra(this.ryl, yuVar, this, this.xdk);
            yuVar.ouw((ko) this);
            this.kn.add(raVar);
            return;
        }
        com.bytedance.sdk.component.adexpress.vt.le leVar = new com.bytedance.sdk.component.adexpress.vt.le(this.ryl, this.xdk, new zin(this, this.xdk));
        this.f8084vh = leVar;
        this.kn.add(leVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zin() {
        if (this.uq.get()) {
            this.f8079od.ouw(System.currentTimeMillis(), fak.ouw(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.ko
    public final void a_(int i4) {
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            if (!this.ouw) {
                blyVar.bly();
            }
            this.mt.tlj();
            ((mwh) this.mt).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderFail(this, com.bytedance.sdk.openadsdk.core.pno.ouw(i4), i4);
        }
        vpp vppVar = this.jvy;
        if (vppVar != null) {
            vppVar.ouw(this.ko, this.mwh);
        }
    }

    public boolean bly() {
        return true;
    }

    public void cf() {
        com.bytedance.sdk.component.bly.le leVar;
        ex exVar = this.pv;
        if (exVar == null || exVar.lh() == null || (leVar = this.pv.f7318le) == null) {
            return;
        }
        try {
            leVar.getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.bly.pno r0 = r12.f8076le
            r1 = 0
            if (r0 == 0) goto L1e
            int r2 = r13.getDeviceId()
            r0.vt(r2)
            com.bytedance.sdk.openadsdk.core.bly.pno r0 = r12.f8076le
            int r2 = r13.getSource()
            r0.ouw(r2)
            com.bytedance.sdk.openadsdk.core.bly.pno r0 = r12.f8076le
            int r2 = r13.getToolType(r1)
            r0.lh(r2)
        L1e:
            com.bytedance.sdk.openadsdk.core.bly.bly r0 = r12.ra
            if (r0 == 0) goto L3b
            int r2 = r13.getDeviceId()
            r0.vt(r2)
            com.bytedance.sdk.openadsdk.core.bly.bly r0 = r12.ra
            int r2 = r13.getSource()
            r0.ouw(r2)
            com.bytedance.sdk.openadsdk.core.bly.bly r0 = r12.ra
            int r2 = r13.getToolType(r1)
            r0.lh(r2)
        L3b:
            int r0 = r13.getActionMasked()
            if (r0 == 0) goto L9a
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L4b
            r3 = 2
            if (r0 == r3) goto L4f
            if (r0 == r1) goto L4d
            r1 = -1
        L4b:
            r5 = r1
            goto Lb0
        L4d:
            r1 = 4
            goto L4b
        L4f:
            float r0 = r12.coz
            float r1 = r13.getX()
            float r4 = r12.f8078ng
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.coz = r1
            float r0 = r12.lvd
            float r1 = r13.getY()
            float r4 = r12.fwd
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r1 = r1 + r0
            r12.lvd = r1
            float r0 = r13.getX()
            r12.f8078ng = r0
            float r0 = r13.getY()
            r12.fwd = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r12.f8081sd
            long r0 = r0 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L98
            float r0 = r12.coz
            r1 = 1090519040(0x41000000, float:8.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L96
            float r0 = r12.lvd
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L98
        L96:
            r5 = r2
            goto Lb0
        L98:
            r5 = r3
            goto Lb0
        L9a:
            float r0 = r13.getRawX()
            r12.f8078ng = r0
            float r0 = r13.getRawY()
            r12.fwd = r0
            long r2 = java.lang.System.currentTimeMillis()
            r12.f8081sd = r2
            com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(r13)
            goto L4b
        Lb0:
            android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh$ouw> r0 = r12.myk
            if (r0 == 0) goto Lce
            int r1 = r13.getActionMasked()
            com.bytedance.sdk.openadsdk.core.lh.lh$ouw r4 = new com.bytedance.sdk.openadsdk.core.lh.lh$ouw
            float r2 = r13.getSize()
            double r6 = (double) r2
            float r2 = r13.getPressure()
            double r8 = (double) r2
            long r10 = java.lang.System.currentTimeMillis()
            r4.<init>(r5, r6, r8, r10)
            r0.put(r1, r4)
        Lce:
            boolean r13 = super.dispatchTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.qbp.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public long fkw() {
        return 0L;
    }

    public com.bytedance.sdk.openadsdk.yu.ra getAdShowTime() {
        return this.f8079od;
    }

    public lh getBrandBannerController() {
        return this.fqk;
    }

    public pno getClickCreativeListener() {
        return this.f8076le;
    }

    public bly getClickListener() {
        return this.ra;
    }

    public String getClosedListenerKey() {
        return this.osn;
    }

    public int getDynamicShowType() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null) {
            return yuVar.vt();
        }
        return 0;
    }

    public int getExpectExpressHeight() {
        return Float.valueOf(this.tlj).intValue();
    }

    public int getExpectExpressWidth() {
        return Float.valueOf(this.bly).intValue();
    }

    public bs getJsObject() {
        ex exVar = this.pv;
        if (exVar != null) {
            return exVar.f8054jg;
        }
        return null;
    }

    public int getRenderEngineCacheType() {
        tlj tljVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        int i4 = 0;
        if (!(yuVar instanceof ex) || (tljVar = ((ex) yuVar).ko) == null) {
            return 0;
        }
        ArrayList<Integer> arrayList = tljVar.ouw;
        int size = arrayList.size();
        while (i4 < size) {
            Integer num = arrayList.get(i4);
            i4++;
            Integer num2 = num;
            if (num2.intValue() == 3 || num2.intValue() == 2 || num2.intValue() == -1) {
                return num2.intValue();
            }
        }
        return TextUtils.isEmpty(tljVar.ouw()) ? -1 : 1;
    }

    public int getRenderTimeout() {
        return com.bytedance.sdk.openadsdk.core.zih.yu().ko();
    }

    public String getUgenTemplateErrorReason() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0087ouw
    public long getVideoProgress() {
        com.bytedance.sdk.openadsdk.core.yu.bly blyVar = this.euf;
        if (blyVar != null) {
            return blyVar.getVideoProgress();
        }
        return 0L;
    }

    public com.bytedance.sdk.component.bly.le getWebView() {
        ex exVar = this.pv;
        if (exVar == null) {
            return null;
        }
        return exVar.f7318le;
    }

    public final void jg() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar2 = this.fvf;
        if (yuVar2 instanceof ex) {
            if (yuVar2 == null) {
                return;
            }
            ((ex) yuVar2).le();
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.6
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    qbp.this.yu(1);
                }
            }, (this.ko != null ? r0.f8301mb.f8287lh : 5) * 1000);
        } else if (yuVar2 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar2).cf();
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ko;
        if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            yuVar.ouw();
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.ko, false)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar3 = this.fvf;
            if (this.fak != null) {
                try {
                    if (yuVar3 instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) {
                        ViewGroup viewGroup = (ViewGroup) ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar3).ra().fkw;
                        this.ex = viewGroup;
                        if (viewGroup != null) {
                            this.fak.ouw();
                            View viewVt = this.fak.vt();
                            if (viewVt != null) {
                                ViewGroup viewGroup2 = (ViewGroup) viewVt.getParent();
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(viewVt);
                                }
                                this.ex.addView(viewVt, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void ko() {
        if (this.ko == null) {
            return;
        }
        this.f8072cd = SystemClock.elapsedRealtime();
        if (!this.ko.pd()) {
            this.f8073cf.ouw();
            tlj.ouw ouwVar = this.wp;
            if (ouwVar != null) {
                ouwVar.ouw(this);
            }
            try {
                this.wp.ouw();
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        final lh lhVar = this.fqk;
        if (lhVar == null) {
            a_(106);
            return;
        }
        lhVar.vt = this;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = lhVar.yu;
        if (vppVar != null && vppVar.lso()) {
            lhVar.fkw = com.bytedance.sdk.openadsdk.utils.bs.ouw().schedule(new lh.vt(lhVar.ouw.pno), com.bytedance.sdk.openadsdk.core.zih.yu().ko(), TimeUnit.MILLISECONDS);
        }
        lh.ouw ouwVar2 = lhVar.ouw;
        if (ouwVar2 == null) {
            com.bytedance.sdk.component.adexpress.vt.ko koVar = lhVar.vt;
            if (koVar != null) {
                koVar.a_(106);
                return;
            }
            return;
        }
        ouwVar2.ouw(new com.bytedance.sdk.component.adexpress.vt.ra() { // from class: com.bytedance.sdk.openadsdk.core.bly.lh.1
            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(View view, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                if (lh.this.f8062lh == null || view == null) {
                    if (lh.this.vt != null) {
                        lh.this.vt.a_(106);
                    }
                } else if (lh.this.vt != null) {
                    lh.this.vt.ouw(lh.this.ouw, jgVar);
                }
                lh.this.vt();
            }

            @Override // com.bytedance.sdk.component.adexpress.vt.ra
            public final void ouw(int i4, String str) {
                if (lh.this.vt != null) {
                    lh.this.vt.a_(106);
                }
                lh.this.vt();
            }
        });
        View viewLh = lhVar.ouw.lh();
        lhVar.f8062lh.removeView(viewLh);
        if (viewLh.getParent() != null) {
            ((ViewGroup) viewLh.getParent()).removeView(viewLh);
        }
        lhVar.f8062lh.addView(viewLh, new ViewGroup.LayoutParams(-1, -1));
    }

    public boolean l_() {
        return false;
    }

    public int le() {
        return 0;
    }

    public void lh() {
    }

    public void mwh() {
        try {
            lh lhVar = this.fqk;
            if (lhVar != null) {
                lhVar.ouw();
            }
            vm();
            removeAllViews();
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.kn;
            if (list != null) {
                Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
                while (it.hasNext()) {
                    it.next().ouw();
                }
            }
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ko);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.ko);
            this.f8077lh = null;
            this.yu = null;
            this.f8075jg = null;
            this.ko = null;
            this.fkw = null;
            this.f8076le = null;
            this.f8082th = null;
            this.ra = null;
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = this.fak;
            if (vtVar != null) {
                vtVar.lh();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("NativeExpressView", "detach error", th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zin();
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onAttachedToWindow+++");
        getViewTreeObserver().addOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().ouw(this.osn, this.ey);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.hun);
        com.bytedance.sdk.openadsdk.core.bly.ouw().yu(this.osn);
        List<com.bytedance.sdk.component.adexpress.vt.tlj> list = this.kn;
        if (list != null) {
            Iterator<com.bytedance.sdk.component.adexpress.vt.tlj> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onDetachedFromWindow===");
        ouw(8, true, true);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onFinishTemporaryDetach+++");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        zin();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.bytedance.sdk.component.utils.ko.fkw("webviewpool", "onStartTemporaryDetach===");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (Build.VERSION.SDK_INT < 28) {
            onWindowVisibilityChanged(z3 ? getVisibility() : 8);
        }
        zin();
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.ko, z3);
        if (z3) {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ko, 4);
        } else {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ko, 8);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        ouw(i4, true, false);
    }

    public void ouw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x030b A[Catch: Exception -> 0x02f6, TryCatch #5 {Exception -> 0x02f6, blocks: (B:103:0x02de, B:105:0x02e6, B:107:0x02ed, B:112:0x02f9, B:114:0x0301, B:116:0x0305, B:118:0x030b, B:129:0x0324, B:131:0x0328, B:133:0x032c, B:135:0x0349, B:134:0x0338, B:136:0x0362, B:137:0x038a, B:141:0x03b7, B:144:0x03c2), top: B:175:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c2 A[Catch: Exception -> 0x02f6, TRY_LEAVE, TryCatch #5 {Exception -> 0x02f6, blocks: (B:103:0x02de, B:105:0x02e6, B:107:0x02ed, B:112:0x02f9, B:114:0x0301, B:116:0x0305, B:118:0x030b, B:129:0x0324, B:131:0x0328, B:133:0x032c, B:135:0x0349, B:134:0x0338, B:136:0x0362, B:137:0x038a, B:141:0x03b7, B:144:0x03c2), top: B:175:0x02de }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void pno() {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.bly.qbp.pno():void");
    }

    public final void rn() {
        try {
            FrameLayout frameLayout = this.rn;
            if (frameLayout == null || frameLayout.getParent() == null) {
                return;
            }
            removeView(this.rn);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "backupDestroy remove video container error", th2);
        }
    }

    public void setBackupListener(com.bytedance.sdk.component.adexpress.vt.lh lhVar) {
        this.f8082th = lhVar;
        com.bytedance.sdk.component.adexpress.vt.le leVar = this.f8084vh;
        if (leVar != null) {
            leVar.ouw.ouw(lhVar);
        }
    }

    public void setBannerClickClosedListener(ra.ouw ouwVar) {
        this.ey = ouwVar;
    }

    public void setClickCreativeListener(pno pnoVar) {
        this.f8076le = pnoVar;
        if (pnoVar != null) {
            pnoVar.ouw((ouw.InterfaceC0087ouw) this);
        }
    }

    public void setClickListener(bly blyVar) {
        this.ra = blyVar;
    }

    public void setClosedListenerKey(String str) {
        lh.ouw ouwVar;
        this.osn = str;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.f8066lh = str;
    }

    public void setDislike(com.bytedance.sdk.openadsdk.lh.lh lhVar) {
        lh.ouw ouwVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeInner(lhVar);
        }
        lh lhVar2 = this.fqk;
        if (lhVar2 != null && (ouwVar = lhVar2.ouw) != null && lhVar != null) {
            ouwVar.ouw = lhVar;
        }
        this.f8077lh = lhVar;
    }

    public void setExpressInteractionListener(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        lh.ouw ouwVar;
        this.fkw = pAGExpressAdWrapperListener;
        lh lhVar = this.fqk;
        if (lhVar == null || (ouwVar = lhVar.ouw) == null) {
            return;
        }
        ouwVar.bly = pAGExpressAdWrapperListener;
    }

    public void setJsbLandingPageOpenListener(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        if (this.pv != null && getJsObject() != null) {
            getJsObject().vt = fkwVar;
        }
        com.bytedance.sdk.openadsdk.core.cf.le.yu yuVar = this.yhj;
        if (yuVar != null) {
            yuVar.ouw(fkwVar);
        }
    }

    public void setOuterDislike(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        lh.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        ouw ouwVar2;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar != null && (yuVar instanceof zin) && (ouwVar2 = (ouw) yuVar.lh()) != null) {
            ouwVar2.setDislikeOuter(tTDislikeDialogAbstract);
        }
        lh lhVar = this.fqk;
        if (lhVar != null && (ouwVar = lhVar.ouw) != null) {
            if (tTDislikeDialogAbstract != null && (vppVar = ouwVar.fkw) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
            }
            ouwVar.vt = tTDislikeDialogAbstract;
        }
        this.yu = tTDislikeDialogAbstract;
    }

    public void setSoundMute(boolean z3) {
        this.tc = z3;
        com.bytedance.sdk.component.adexpress.vt.vt vtVar = this.f8080pd;
        if (vtVar != null && vtVar.vt() != null) {
            this.f8080pd.vt().setSoundMute(z3);
        }
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setSoundMute(z3);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i4, int i10, boolean z3) throws NumberFormatException {
        bs bsVar;
        com.bytedance.sdk.openadsdk.mwh.vt vtVar;
        int iMin;
        c cVar;
        try {
            int i11 = Integer.parseInt(String.valueOf(charSequence));
            if (!TextUtils.equals(this.mwh, "banner_ad")) {
                int i12 = this.ksc;
                int i13 = ((i4 < i12 || i12 < 0 || !(this.jae || TextUtils.equals(this.mwh, "open_ad"))) && !((i11 == 0 && TextUtils.equals(this.mwh, "open_ad")) || le() == 5)) ? 0 : 1;
                int i14 = this.ksc;
                if (i4 <= i14) {
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ko;
                    iMin = (vppVar == null || (cVar = vppVar.f8309sd) == null) ? i14 - i4 : (int) (Math.min(i14, cVar.f6576d * cVar.f6588r) - i4);
                } else {
                    iMin = 0;
                }
                com.bytedance.sdk.component.adexpress.vt.vt vtVar2 = this.f8080pd;
                if (vtVar2 != null && vtVar2.vt() != null) {
                    this.f8080pd.vt().setTime(String.valueOf(i11), i13, iMin, false);
                }
                com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
                if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
                    ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).setTime(String.valueOf(i11), i13, iMin, false);
                }
            }
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar3 = this.fak;
            if (vtVar3 != null) {
                com.bytedance.sdk.openadsdk.core.cf.lh.lh lhVar = vtVar3.ouw;
                if (!(lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.lh.yu) || (bsVar = ((com.bytedance.sdk.openadsdk.core.cf.lh.yu) lhVar).ouw) == null || (vtVar = bsVar.jqy) == null) {
                    return;
                }
                vtVar.ouw(i11);
            }
        } catch (NumberFormatException unused) {
        }
    }

    public void setVastVideoHelper(com.bytedance.sdk.openadsdk.core.yu.bly blyVar) {
        this.euf = blyVar;
    }

    public void setVideoBusiness(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar;
        ex exVar = this.pv;
        if (exVar == null || (bsVar = exVar.f8054jg) == null) {
            return;
        }
        bsVar.uq = vtVar;
    }

    public void setVideoFrameChangeListener(com.bytedance.sdk.openadsdk.mwh.ra raVar) {
        if (this.pv == null || getJsObject() == null) {
            return;
        }
        getJsObject().jae = raVar;
    }

    public boolean tlj() {
        return true;
    }

    public final void vm() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ko;
        if (vppVar == null || (yuVarSd = vppVar.sd()) == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.yu(getVideoProgress());
    }

    public void vt(int i4) {
    }

    public long yu() {
        return 0L;
    }

    public final boolean zih() {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        return yuVar != null && (yuVar instanceof zin);
    }

    public final void le(int i4) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if ((yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && i4 == 4) {
            ((com.bytedance.sdk.openadsdk.core.cf.le.ra) yuVar).tlj();
        }
    }

    public void ouw(int i4) {
    }

    public void vt(JSONObject jSONObject) {
    }

    public final void fkw(int i4) {
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex)) {
            return;
        }
        ((ex) yuVar).ouw(i4);
        this.zvq = i4;
    }

    public fkw.ouw lh(int i4) {
        return new fkw.ouw(i4);
    }

    public void ouw(int i4, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
    }

    public final void yu(int i4) throws JSONException {
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.ko)) {
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
            if (yuVar instanceof ex) {
                ex exVar = (ex) yuVar;
                com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "notifyWillZoom() method called");
                if (exVar.f8054jg != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("zoom_type", i4);
                        exVar.f8054jg.ouw("expressAdViewWillZoom", jSONObject);
                    } catch (JSONException e2) {
                        com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e2.getMessage());
                    }
                }
            }
        }
    }

    public void ouw(int i4, String str) {
    }

    public final void vt(int i4, String str) throws JSONException {
        bs bsVar;
        com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = this.fvf;
        if (yuVar == null || !(yuVar instanceof ex) || (bsVar = ((ex) yuVar).f8054jg) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", i4);
            jSONObject.put("flag", str);
            bsVar.ouw("onVideoPaused", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void ouw(mwh.ouw ouwVar) {
    }

    public void ouw(String str, JSONObject jSONObject) {
    }

    public void ouw(boolean z3, String str) {
    }

    public boolean ouw(JSONObject jSONObject) {
        return false;
    }

    public final void ouw(int i4, boolean z3, boolean z10) {
        this.qbp = z3;
        removeCallbacks(this.f8083ub);
        removeCallbacks(this.lso);
        if (i4 == 0) {
            if (z10) {
                this.lso.run();
                return;
            } else {
                postDelayed(this.lso, 50L);
                return;
            }
        }
        if (z10) {
            this.f8083ub.run();
        } else {
            postDelayed(this.f8083ub, 50L);
        }
    }

    public void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        View view2;
        JSONObject jSONObject;
        com.bytedance.sdk.component.utils.qbp.ouw("ClickCreativeListener", "trigger Class2 method1", Integer.valueOf(i4));
        if (i4 == -1 || lhVar == null) {
            return;
        }
        HashMap map = new HashMap();
        if (od.lh(this.ko)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 1);
        }
        com.bytedance.sdk.openadsdk.core.model.ko koVar = (com.bytedance.sdk.openadsdk.core.model.ko) lhVar;
        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.ko)) {
            try {
                JSONObject jSONObject2 = koVar.mwh;
                if (jSONObject2 != null) {
                    int iOptInt = jSONObject2.optInt("click_type", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("click_type", iOptInt);
                    map.put("pag_json_data", jSONObject3.toString());
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.qbp.yu(th2.toString(), new Object[0]);
            }
        }
        pno pnoVar = this.f8076le;
        if (pnoVar != null) {
            pnoVar.yu(getDynamicShowType());
            this.f8076le.ouw(map);
        }
        bly blyVar = this.ra;
        if (blyVar != null) {
            blyVar.yu(getDynamicShowType());
            this.ra.ouw(map);
        }
        float f10 = koVar.ouw;
        float f11 = koVar.vt;
        float f12 = koVar.f8235lh;
        float f13 = koVar.yu;
        boolean z3 = koVar.f8232cf;
        SparseArray<lh.ouw> sparseArray = koVar.tlj;
        if (sparseArray == null || sparseArray.size() == 0) {
            sparseArray = this.myk;
        }
        SparseArray<lh.ouw> sparseArray2 = sparseArray;
        String str = koVar.ra;
        if (view == null) {
            view2 = this;
        } else {
            jSONObjectOuw = view != this ? ouw(view) : null;
            view2 = view;
        }
        koVar.pno = i4;
        if (jSONObjectOuw != null && koVar.bly == null) {
            koVar.bly = jSONObjectOuw;
        }
        if (i4 != 13) {
            switch (i4) {
                case 1:
                    FrameLayout frameLayout = this.rn;
                    if (frameLayout != null) {
                        frameLayout.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.ko;
                    if (vppVar == null || vppVar.ajl != 1 || z3) {
                        bly blyVar2 = this.ra;
                        if (blyVar2 != null) {
                            blyVar2.bly = koVar;
                            blyVar2.ex = str;
                            blyVar2.ouw(view2, f10, f11, f12, f13, sparseArray2, z3);
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
                        if (pAGExpressAdWrapperListener != null && !koVar.f8233jg) {
                            pAGExpressAdWrapperListener.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (koVar.ryl > 0) {
                        uoy.ouw(true);
                    }
                    pno pnoVar2 = this.f8076le;
                    if (pnoVar2 != null) {
                        pnoVar2.bly = koVar;
                        pnoVar2.ex = str;
                        if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.ko) && (jSONObject = koVar.mwh) != null) {
                            ((com.bytedance.sdk.openadsdk.core.lh.ouw) this.f8076le).ra = jSONObject.optBoolean("is_ceiling_page", false);
                        }
                        this.f8076le.ouw(view2, f10, f11, f12, f13, sparseArray2, z3);
                    }
                    PAGExpressAdWrapperListener pAGExpressAdWrapperListener2 = this.fkw;
                    if (pAGExpressAdWrapperListener2 != null && !koVar.f8233jg) {
                        pAGExpressAdWrapperListener2.onAdClicked();
                    }
                    uoy.ouw(false);
                    com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.ko, 9);
                    break;
                case 3:
                    TTDislikeDialogAbstract tTDislikeDialogAbstract = this.yu;
                    if (tTDislikeDialogAbstract != null) {
                        tTDislikeDialogAbstract.show();
                        break;
                    } else {
                        com.bytedance.sdk.openadsdk.lh.lh lhVar2 = this.f8077lh;
                        if (lhVar2 != null) {
                            lhVar2.ouw();
                            break;
                        } else {
                            TTDelegateActivity.ouw(this.ko, this.osn);
                            break;
                        }
                    }
                case 4:
                    FrameLayout frameLayout2 = this.rn;
                    if (frameLayout2 != null) {
                        frameLayout2.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0));
                    }
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.ko;
                    if (vppVar2 == null || vppVar2.ajl != 1 || z3) {
                        StringBuilder sb2 = new StringBuilder("Creativity....mAdType=");
                        sb2.append(this.mwh);
                        sb2.append(",!mVideoPause=");
                        sb2.append(!this.zih);
                        sb2.append("，isAutoPlay=");
                        sb2.append(com.bytedance.sdk.openadsdk.utils.uoy.lh(this.ko));
                        com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", sb2.toString());
                        if ("embeded_ad".equals(this.mwh) && com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.ko) && !this.zih && com.bytedance.sdk.openadsdk.utils.uoy.lh(this.ko)) {
                            com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "Creative....");
                            pno pnoVar3 = this.f8076le;
                            if (pnoVar3 != null) {
                                pnoVar3.bly = koVar;
                                pnoVar3.ex = str;
                                pnoVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z3);
                            }
                        } else {
                            com.bytedance.sdk.component.utils.ko.vt("ClickCreativeListener", "normal....");
                            bly blyVar3 = this.ra;
                            if (blyVar3 != null) {
                                blyVar3.bly = koVar;
                                blyVar3.ex = str;
                                blyVar3.ouw(view2, f10, f11, f12, f13, sparseArray2, z3);
                            }
                        }
                        PAGExpressAdWrapperListener pAGExpressAdWrapperListener3 = this.fkw;
                        if (pAGExpressAdWrapperListener3 != null && !koVar.f8233jg) {
                            pAGExpressAdWrapperListener3.onAdClicked();
                            break;
                        }
                    }
                    break;
                case 5:
                    ouw(!this.tc, "dynamicClick");
                    break;
                case 6:
                    ouw();
                    break;
                case 7:
                    TTWebsiteActivity.ouw(this.ryl, this.ko, this.mwh);
                    break;
            }
            return;
        }
        int i10 = koVar.ko;
        if (i10 >= 0) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("switch", i10);
                ouw(jSONObject4);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    public void ra() {
    }

    public void ryl() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i4) {
    }

    public qbp(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z3, boolean z10) {
        super(context);
        this.ouw = true;
        this.vt = 0;
        this.mwh = "embeded_ad";
        this.pno = null;
        this.vm = false;
        this.qbp = true;
        this.zin = -1;
        this.bs = "";
        this.tc = false;
        this.rrs = true;
        this.ksc = -1;
        this.f8079od = new com.bytedance.sdk.openadsdk.yu.ra();
        this.f8072cd = 0L;
        this.uq = new AtomicBoolean(false);
        this.hun = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                qbp qbpVar = qbp.this;
                if (qbpVar.qbp && qbpVar.tlj()) {
                    qbp.this.zin();
                    qbp qbpVar2 = qbp.this;
                    qbpVar2.removeCallbacks(qbpVar2.ux);
                    qbp qbpVar3 = qbp.this;
                    qbpVar3.postDelayed(qbpVar3.ux, 500L);
                }
            }
        };
        this.ux = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.2
            @Override // java.lang.Runnable
            public final void run() {
                if (!fak.ouw(qbp.this, 0, 5, false)) {
                    qbp.this.fkw(8);
                } else {
                    qbp qbpVar = qbp.this;
                    qbpVar.fkw(qbpVar.getVisibility());
                }
            }
        };
        this.lso = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.3
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(0);
            }
        };
        this.f8083ub = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.4
            @Override // java.lang.Runnable
            public final void run() {
                qbp.this.fkw(8);
            }
        };
        this.zvq = 8;
        this.myk = new SparseArray<>();
        this.f8078ng = -1.0f;
        this.fwd = -1.0f;
        this.coz = -1.0f;
        this.lvd = -1.0f;
        this.f8081sd = 0L;
        this.mwh = str;
        this.ryl = context;
        this.ko = vppVar;
        this.f8075jg = adSlot;
        this.tc = z3;
        this.rrs = z10;
        pno();
    }

    public static JSONObject ouw(View view) throws JSONException {
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            jSONObject.put("left", iArr[0]);
            jSONObject.put("top", iArr[1]);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        this.uq.set(true);
        this.fvf = yuVar;
        com.bytedance.sdk.component.utils.ko.ouw("NativeExpressView", "render type is  ", Integer.valueOf(yuVar.vt()));
        if (this.zvq != getWindowVisibility() && bly()) {
            fkw(getWindowVisibility());
        }
        if (yuVar.vt() == 3 && (vppVar = this.ko) != null && vppVar.fvf == 1) {
            vppVar.fvf = 0;
        }
        if (yuVar.vt() != 1 || (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu)) {
            View viewLh = yuVar.lh();
            if (viewLh.getParent() != null) {
                ((ViewGroup) viewLh.getParent()).removeView(viewLh);
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                arrayList.add(getChildAt(i4));
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) instanceof com.bytedance.sdk.component.bly.le) {
                    removeView((View) arrayList.get(i10));
                }
            }
            if (com.bytedance.sdk.openadsdk.core.model.th.lh(this.ko)) {
                addView(yuVar.lh(), new FrameLayout.LayoutParams(-1, -1));
            } else {
                addView(yuVar.lh());
            }
        }
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.ko;
        if (vppVar2 != null) {
            com.bytedance.sdk.openadsdk.rn.lh.ouw(vppVar2.ouw, this.f8072cd, this.mwh, yuVar.vt());
        }
        com.bytedance.sdk.component.adexpress.vt.bly blyVar = this.mt;
        if (blyVar != null) {
            ((mwh) blyVar).ryl();
        }
        PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.fkw;
        if (pAGExpressAdWrapperListener != null) {
            pAGExpressAdWrapperListener.onRenderSuccess(this, (float) jgVar.f7393lh, (float) jgVar.yu);
        }
        if ((this.fvf instanceof com.bytedance.sdk.openadsdk.core.cf.le.ra) && com.bytedance.sdk.openadsdk.core.model.rn.ouw(this.ko, false)) {
            com.bytedance.sdk.openadsdk.core.cf.lh.vt vtVar = new com.bytedance.sdk.openadsdk.core.cf.lh.vt(this.ryl, this.ko);
            this.fak = vtVar;
            vtVar.ouw(this);
            this.fak.ouw(new com.bytedance.sdk.openadsdk.core.cf.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.core.bly.qbp.7
                @Override // com.bytedance.sdk.openadsdk.core.cf.lh.ouw
                public final void ouw(View view, int i11, com.bytedance.sdk.component.adexpress.lh lhVar) {
                    while (true) {
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this, this.ko, lh(getDynamicShowType()));
        vpp vppVar3 = this.jvy;
        if (vppVar3 != null) {
            vppVar3.ouw(this.ko, this.mwh);
        }
    }

    public final JSONObject ouw(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) throws JSONException {
        if (!(this.fvf instanceof ex)) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            int renderEngineCacheType = getRenderEngineCacheType();
            if (vppVar != null) {
                vpp.ouw ouwVar = vppVar.xn;
                if (ouwVar != null && ouwVar.ouw()) {
                    jSONObject.put("engine_version", vppVar.xn.tlj);
                } else if (vppVar.lht != null) {
                    jSONObject.put("engine_version", "v3");
                } else {
                    jSONObject.put("engine_version", "v1");
                }
            }
            jSONObject.put("engine_type", renderEngineCacheType);
            return jSONObject;
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.vt("NativeExpressView", "exception:" + e2.getMessage());
            return jSONObject;
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, AdSlot adSlot, String str, boolean z3, boolean z10) {
        if (vppVar == null) {
            return;
        }
        this.mwh = str;
        this.ko = vppVar;
        this.f8075jg = adSlot;
        this.tc = z3;
        this.rrs = z10;
        int i4 = vppVar.kfa;
        this.vt = i4;
        if (i4 != 10) {
            return;
        }
        this.uoy = true;
        pno();
        ko();
        this.uoy = false;
    }
}
