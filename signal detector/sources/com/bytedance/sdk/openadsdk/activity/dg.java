package com.bytedance.sdk.openadsdk.activity;

import A2.C0115c;
import K1.c;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.U;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.g0;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.component.reward.emc.gbl;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.cuf;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ee;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sb;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.ul;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.ylm;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends com.bytedance.sdk.openadsdk.activity.xq implements Handler.Callback {
    private final HashSet<Integer> aa;
    private boolean but;
    private final boolean cf;
    private boolean cn;
    private ypw.bw cuf;
    private boolean db;
    private boolean dr;
    private int ee;
    private Message ffd;
    private long fu;
    private final FrameLayout gbl;
    private boolean hj;
    private boolean hxp;
    private com.bytedance.sdk.openadsdk.activity.bw iyl;
    private msw lt;
    private int mkp;
    private final LinearLayoutManager msw;
    private boolean mxo;
    private ycc ndl;
    private boolean nw;
    private JSONObject pxa;
    private final HashSet<String> qh;
    private JSONObject ra;
    private int rie;
    private long rqm;
    private int rtt;
    private final Handler ru;
    private int sb;
    private final PAGLogoView sba;
    private boolean sf;
    private int sra;
    private final boolean sup;
    private final AtomicBoolean sz;
    private ee.emc tp;
    private final boolean ul;
    private final emc uym;
    private final boolean vk;
    private int vw;
    private long wa;
    private boolean wad;
    private boolean wd;
    private boolean wo;
    private JSONObject wpn;
    private View xhi;
    private int xmt;
    private FrameLayout xxg;
    private final RecyclerView ycc;
    private boolean ylm;
    private boolean yz;
    private final ArrayList<Message> yzg;
    private final TopLayoutDislike2 zz;

    public static abstract class bw extends g0 {
        public bw(View view) {
            super(view);
        }

        public abstract void emc(dg dgVar, C0047dg c0047dg, int i);
    }

    public static class xq extends bw {
        private final TextView emc;

        public xq(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(view.getContext());
            this.emc = mswVar;
            mswVar.setTextColor(Color.parseColor("#99FFFFFF"));
            mswVar.setTextSize(14.0f);
            mswVar.setGravity(17);
            mswVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(mswVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.dg.bw
        public void emc(dg dgVar, C0047dg c0047dg, int i) {
            this.emc.setText(c0047dg.xq);
        }
    }

    public static abstract class ycc implements Runnable {
        private long bw;
        private long dg;
        private final Handler emc = new Handler(Looper.getMainLooper());
        private long xq;
        private final long ypw;

        public ycc(long j6) {
            this.ypw = j6;
        }

        public void bw() {
            this.emc.postDelayed(this, this.ypw);
            this.xq = SystemClock.elapsedRealtime();
        }

        public void dg() {
            this.emc.removeCallbacks(this);
        }

        public abstract void emc();

        @Override // java.lang.Runnable
        public void run() {
            emc();
        }

        public void xq() {
            long j6 = this.ypw - this.dg;
            if (j6 < 0) {
                return;
            }
            this.emc.removeCallbacks(this);
            this.emc.postDelayed(this, j6);
            this.xq = SystemClock.elapsedRealtime();
        }

        public long ycc() {
            long jElapsedRealtime;
            long j6;
            if (this.xq > this.bw) {
                jElapsedRealtime = this.ypw - (SystemClock.elapsedRealtime() - this.xq);
                j6 = this.dg;
            } else {
                jElapsedRealtime = this.ypw;
                j6 = this.dg;
            }
            long j7 = jElapsedRealtime - j6;
            if (j7 < 0) {
                return 0L;
            }
            return j7;
        }

        public void ypw() {
            this.emc.removeCallbacks(this);
            if (this.bw > this.xq) {
                return;
            }
            this.dg = (SystemClock.elapsedRealtime() - this.xq) + this.dg;
            this.bw = SystemClock.elapsedRealtime();
        }
    }

    public static class ypw extends bw {
        private final emc emc;
        private com.bytedance.sdk.openadsdk.activity.emc xq;
        private final com.bytedance.sdk.openadsdk.component.reward.view.ypw ypw;

        public ypw(emc emcVar, View view) {
            super(view);
            this.emc = emcVar;
            this.ypw = (com.bytedance.sdk.openadsdk.component.reward.view.ypw) view;
        }

        public msw emc() {
            return this.xq;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.dg.bw
        public void emc(dg dgVar, C0047dg c0047dg, int i) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = dgVar.emc;
            if (com.bytedance.sdk.component.utils.ypw.emc(activity)) {
                return;
            }
            rie rieVar = c0047dg.ypw;
            com.bytedance.sdk.openadsdk.activity.emc emcVar = this.xq;
            if (emcVar != null) {
                if (emc(emcVar, rieVar)) {
                    this.xq.emc(rieVar, bindingAdapterPosition, i);
                } else {
                    this.emc.emc(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.ypw ypwVar = dgVar.dg;
            if (this.xq == null) {
                this.xq = rieVar.zc() ? new uym(ypwVar, rieVar, bindingAdapterPosition, i, false) : new com.bytedance.sdk.openadsdk.activity.ycc(ypwVar, rieVar, bindingAdapterPosition, i, false);
            }
            ypw.bw bwVar = new ypw.bw(1, null);
            bwVar.dg = dgVar.dr;
            this.xq.ypw(activity, bwVar);
            this.emc.emc(this.xq);
            com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc = this.xq.emc();
            if (mswVarEmc == null) {
                return;
            }
            ViewParent parent = mswVarEmc.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mswVarEmc);
            }
            if (!dgVar.cf) {
                float fBb = rieVar.bb();
                if (fBb > 0.0f) {
                    this.ypw.setWidthAndHeightRatio(fBb);
                } else {
                    this.ypw.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.ypw.emc(mswVarEmc, new FrameLayout.LayoutParams(-1, -1));
            this.ypw.setScene(this.xq);
        }

        private boolean emc(msw mswVar, rie rieVar) {
            cuf cufVarKv;
            if (mswVar.cuf() && (cufVarKv = mswVar.ycc.kv()) != null) {
                cuf cufVarKv2 = rieVar.kv();
                if (TextUtils.equals(cufVarKv.emc(), cufVarKv2.emc()) && TextUtils.equals(cufVarKv.ypw(), cufVarKv2.ypw()) && mswVar.rtt()) {
                    return true;
                }
            }
            return false;
        }

        public void emc(boolean z6) {
            com.bytedance.sdk.openadsdk.activity.emc emcVar = this.xq;
            if (emcVar == null) {
                return;
            }
            emcVar.ycc(z6);
            this.xq.yzg();
            if (!z6) {
                this.xq = null;
            }
            this.ypw.emc();
        }
    }

    public dg(final Activity activity, final rie rieVar, final com.bytedance.sdk.openadsdk.activity.ypw ypwVar) {
        ee eeVarSup;
        super(activity, rieVar, ypwVar);
        this.ru = new Handler(Looper.getMainLooper(), this);
        this.sz = new AtomicBoolean(false);
        this.qh = new HashSet<>();
        this.aa = new HashSet<>();
        this.yzg = new ArrayList<>();
        this.sra = 5;
        this.rie = 3;
        this.xmt = -1;
        int i = 1;
        this.cuf = new ypw.bw(1, null);
        boolean z6 = rieVar.fu() == 44;
        this.cf = z6;
        boolean zZc = rieVar.zc();
        this.sup = zZc;
        this.vk = gbl.emc(activity, rieVar) == 1;
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(activity) { // from class: com.bytedance.sdk.openadsdk.activity.dg.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                dg.this.wpn = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.gbl = xqVar;
        if (Build.VERSION.SDK_INT >= 35) {
            xqVar.setFitsSystemWindows(true);
        }
        activity.setContentView(xqVar);
        this.bw = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg = rieVar.dg();
        if (emcVarDg != null && (eeVarSup = emcVarDg.sup()) != null) {
            this.mxo = eeVarSup.cf();
            this.tp = eeVarSup.ycc();
            int iMax = Math.max(0, eeVarSup.zz());
            this.rtt = iMax;
            this.mkp = iMax;
            this.sf = eeVarSup.qh();
            this.db = eeVarSup.gbl();
            this.ee = eeVarSup.msw();
            this.ra = eeVarSup.sup();
            this.hxp = eeVarSup.ru();
            this.ylm = eeVarSup.emc();
            this.wo = this.ee > 0;
            this.sra = eeVarSup.dg();
            this.rie = eeVarSup.bw();
            this.wpn = eeVarSup.ypw();
            this.pxa = eeVarSup.xq();
            if (!this.db) {
                this.mxo = false;
            }
        }
        if (zZc) {
            this.sb = (int) ((1.0f - (Math.max(0, Math.min(100, rieVar.bv() < 0 ? aa.dg().db(String.valueOf(rieVar.tx())).ycc : r5)) / 100.0f)) * this.rtt);
        }
        RecyclerView recyclerView = new RecyclerView(activity, null);
        this.ycc = recyclerView;
        ee.emc emcVar = this.tp;
        if (emcVar != null) {
            int iXq = emcVar.xq();
            int iDg = this.tp.dg();
            if (iXq > 0 || iDg > 0) {
                recyclerView.setPadding(vw.ypw(activity, iXq), 0, vw.ypw(activity, iDg), 0);
            }
            int iYpw = this.tp.ypw();
            int iEmc = this.tp.emc();
            int iBw = this.tp.bw();
            if (iYpw > 0 || iBw > 0 || iEmc > 0) {
                final int iYpw2 = vw.ypw(activity, iYpw);
                final int iYpw3 = vw.ypw(activity, iEmc);
                final int iYpw4 = vw.ypw(activity, iBw);
                recyclerView.g(new M() { // from class: com.bytedance.sdk.openadsdk.activity.dg.12
                    @Override // androidx.recyclerview.widget.M
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, d0 d0Var) {
                        recyclerView2.getClass();
                        g0 g0VarJ = RecyclerView.J(view);
                        int absoluteAdapterPosition = g0VarJ != null ? g0VarJ.getAbsoluteAdapterPosition() : -1;
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (absoluteAdapterPosition == 0) {
                            rect.top = iYpw2;
                        } else {
                            rect.top = iYpw4 / 2;
                        }
                        if (absoluteAdapterPosition == itemCount - 1) {
                            rect.bottom = iYpw3;
                        } else {
                            rect.bottom = iYpw4 / 2;
                        }
                    }
                });
            }
        }
        xqVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.zz = topLayoutDislike2;
        xqVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(rieVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zAa = aa.dg().aa(String.valueOf(rieVar.tx()));
        this.dr = zAa;
        topLayoutDislike2.setSoundMute(zAa);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.dg.13
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void dg(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                rie rieVar2 = rieVar;
                com.bytedance.sdk.openadsdk.dg.xq.emc("skip", rieVar2, rieVar2.bw(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = rieVar.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.ycc(0L);
                    dgVarEmc.bw(0L);
                }
                dg.this.ee();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void xq(View view) {
                ypwVar.uym();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void ypw(View view) {
                if (dg.this.lt != null) {
                    dg.this.lt.e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ypw
            public void emc(View view, String str) {
                if (dg.this.lt != null) {
                    dg.this.lt.emc(str);
                    dg.this.dr = !r1.dr;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i, z) { // from class: com.bytedance.sdk.openadsdk.activity.dg.14
            {
                super(i, z);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(d0 d0Var, int[] iArr) {
                super.calculateExtraLayoutSpace(d0Var, iArr);
                int height = dg.this.ycc.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.msw = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        emc emcVar2 = new emc(this, rieVar.ji());
        this.uym = emcVar2;
        recyclerView.setAdapter(emcVar2);
        if (!this.wo && !this.hxp) {
            emcVar2.emc(com.bytedance.sdk.component.utils.rie.emc(activity, "tt_list_end_tip"));
        }
        if (z6) {
            new C().attachToRecyclerView(recyclerView);
        } else if (this.db) {
            new com.bytedance.sdk.openadsdk.component.reward.view.emc().attachToRecyclerView(recyclerView);
        }
        recyclerView.h(new U() { // from class: com.bytedance.sdk.openadsdk.activity.dg.15
            private int bw;
            private final Rect xq = new Rect();
            private int dg = -1;

            /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void emc() {
                /*
                    r8 = this;
                    com.bytedance.sdk.openadsdk.activity.dg r0 = com.bytedance.sdk.openadsdk.activity.dg.this
                    boolean r0 = com.bytedance.sdk.openadsdk.activity.dg.bw(r0)
                    if (r0 != 0) goto La
                    goto L93
                La:
                    com.bytedance.sdk.openadsdk.activity.dg r0 = com.bytedance.sdk.openadsdk.activity.dg.this
                    com.bytedance.sdk.openadsdk.activity.dg$emc r0 = com.bytedance.sdk.openadsdk.activity.dg.ycc(r0)
                    int r0 = r0.dg()
                    if (r0 != 0) goto L18
                    goto L93
                L18:
                    com.bytedance.sdk.openadsdk.activity.dg r1 = com.bytedance.sdk.openadsdk.activity.dg.this
                    androidx.recyclerview.widget.LinearLayoutManager r1 = com.bytedance.sdk.openadsdk.activity.dg.uym(r1)
                    int r1 = r1.findFirstVisibleItemPosition()
                    com.bytedance.sdk.openadsdk.activity.dg r2 = com.bytedance.sdk.openadsdk.activity.dg.this
                    androidx.recyclerview.widget.LinearLayoutManager r2 = com.bytedance.sdk.openadsdk.activity.dg.uym(r2)
                    int r2 = r2.findLastVisibleItemPosition()
                    int r3 = r2 % r0
                    int r4 = r8.dg
                    if (r3 <= r4) goto L93
                    r3 = r1
                L33:
                    if (r3 > r2) goto L93
                    int r4 = r3 % r0
                    int r5 = r8.dg
                    if (r4 <= r5) goto L90
                    if (r3 == r1) goto L3f
                    if (r3 != r2) goto L6d
                L3f:
                    com.bytedance.sdk.openadsdk.activity.dg r5 = com.bytedance.sdk.openadsdk.activity.dg.this
                    androidx.recyclerview.widget.LinearLayoutManager r5 = com.bytedance.sdk.openadsdk.activity.dg.uym(r5)
                    android.view.View r5 = r5.findViewByPosition(r3)
                    if (r5 == 0) goto L6d
                    android.graphics.Rect r6 = r8.xq
                    r6.setEmpty()
                    android.graphics.Rect r6 = r8.xq
                    r5.getGlobalVisibleRect(r6)
                    int r5 = r5.getHeight()
                    if (r5 <= 0) goto L90
                    android.graphics.Rect r6 = r8.xq
                    int r6 = r6.height()
                    float r6 = (float) r6
                    r7 = 1065353216(0x3f800000, float:1.0)
                    float r6 = r6 * r7
                    float r5 = (float) r5
                    float r6 = r6 / r5
                    r5 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
                    if (r5 < 0) goto L90
                L6d:
                    com.bytedance.sdk.openadsdk.activity.dg r5 = com.bytedance.sdk.openadsdk.activity.dg.this
                    androidx.recyclerview.widget.RecyclerView r5 = com.bytedance.sdk.openadsdk.activity.dg.dg(r5)
                    androidx.recyclerview.widget.g0 r5 = r5.F(r3)
                    boolean r6 = r5 instanceof com.bytedance.sdk.openadsdk.activity.dg.ypw
                    if (r6 == 0) goto L8a
                    com.bytedance.sdk.openadsdk.activity.dg$ypw r5 = (com.bytedance.sdk.openadsdk.activity.dg.ypw) r5
                    com.bytedance.sdk.openadsdk.activity.emc r6 = com.bytedance.sdk.openadsdk.activity.dg.ypw.emc(r5)
                    if (r6 == 0) goto L8a
                    com.bytedance.sdk.openadsdk.activity.emc r5 = com.bytedance.sdk.openadsdk.activity.dg.ypw.emc(r5)
                    r5.fu()
                L8a:
                    int r5 = r8.dg
                    if (r4 <= r5) goto L90
                    r8.dg = r4
                L90:
                    int r3 = r3 + 1
                    goto L33
                L93:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.dg.AnonymousClass15.emc():void");
            }

            @Override // androidx.recyclerview.widget.U
            public void onScrollStateChanged(RecyclerView recyclerView2, int i3) {
                if (com.bytedance.sdk.component.utils.ypw.emc(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = dg.this.msw.findFirstCompletelyVisibleItemPosition();
                dg.this.msw.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = dg.this.msw.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i3 == 0 && iFindFirstCompletelyVisibleItemPosition != dg.this.xmt) {
                    boolean z7 = iFindFirstCompletelyVisibleItemPosition == dg.this.vw;
                    dg dgVar = dg.this;
                    dgVar.emc(iFindFirstCompletelyVisibleItemPosition, dgVar.mxo && z7);
                    if (dg.this.mxo && !z7 && dg.this.sf) {
                        dg.this.mxo = false;
                    }
                    if (dg.this.ndl != null) {
                        dg.this.ndl.dg();
                        dg.this.ndl = null;
                    }
                }
                if (i3 == 0) {
                    dg.this.vw = -1;
                }
                if (!dg.this.wo || dg.this.ee <= 0 || iFindLastVisibleItemPosition < dg.this.uym.emc() - dg.this.ee) {
                    return;
                }
                dg.this.sra();
            }

            @Override // androidx.recyclerview.widget.U
            public void onScrolled(RecyclerView recyclerView2, int i3, int i6) {
                if (i6 == 0 || com.bytedance.sdk.component.utils.ypw.emc(activity)) {
                    return;
                }
                emc();
                int iFindLastVisibleItemPosition = dg.this.msw.findLastVisibleItemPosition();
                if (i6 > 0 && dg.this.wo && dg.this.ee > 0 && iFindLastVisibleItemPosition >= dg.this.uym.emc() - dg.this.ee) {
                    dg.this.sra();
                }
                if (this.bw != iFindLastVisibleItemPosition) {
                    this.bw = iFindLastVisibleItemPosition;
                    if (!dg.this.aa.isEmpty() && dg.this.aa.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        dg.this.aa.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        g0 g0VarF = recyclerView2.F(iFindLastVisibleItemPosition);
                        if (g0VarF instanceof ypw) {
                            ypw ypwVar2 = (ypw) g0VarF;
                            ypwVar2.xq.bw(true);
                            ypwVar2.xq.sf();
                            return;
                        }
                        return;
                    }
                    if (dg.this.but) {
                        dg.this.but = false;
                        g0 g0VarF2 = recyclerView2.F(iFindLastVisibleItemPosition);
                        if (g0VarF2 instanceof ypw) {
                            ypw ypwVar3 = (ypw) g0VarF2;
                            if (ypwVar3.xq != null) {
                                ypwVar3.xq.bw(true);
                                ypwVar3.xq.sb();
                            }
                        }
                    }
                }
            }
        });
        lt();
        final int iYlm = ylm();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.dg.16
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ypw.emc(activity)) {
                    return;
                }
                dg.this.emc(iYlm, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, rieVar);
        this.sba = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = vw.ypw(activity, 16.0f);
        xqVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.dg.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                rie rieVar2 = rieVar;
                TTWebsiteActivity.emc(context, rieVar2, rieVar2.bw());
            }
        });
        this.ul = com.bytedance.sdk.openadsdk.sra.emc.emc("draw_feed_item_reuse", 0) == 1;
    }

    private boolean cuf() {
        FrameLayout frameLayout = this.xxg;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void db() {
        FrameLayout frameLayout = this.xxg;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.xxg);
        }
        this.xxg = null;
        msw mswVar = this.lt;
        if (mswVar instanceof com.bytedance.sdk.openadsdk.activity.emc) {
            ((com.bytedance.sdk.openadsdk.activity.emc) mswVar).xmt();
        }
        rtt();
        Message message = this.ffd;
        if (message != null) {
            handleMessage(message);
            this.ffd = null;
        }
    }

    private void dr() {
        if (this.wpn == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.gbl.zz.emc(this.emc).emc(this.wpn, com.bytedance.sdk.openadsdk.core.zz.emc.ypw.ypw(), this.pxa, new com.bytedance.sdk.openadsdk.core.gbl.uym.dg() { // from class: com.bytedance.sdk.openadsdk.activity.dg.9
            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.dg
            public void emc(int i, String str) {
                dg.this.cn = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.dg
            public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
                View viewGbl = xqVar.gbl();
                ViewGroup viewGroup = (ViewGroup) viewGbl.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewGbl);
                }
                dg.this.xhi = viewGbl;
                if (dg.this.xxg != null) {
                    dg.this.xxg.addView(viewGbl, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void lt() {
        ee eeVarSup;
        com.bytedance.sdk.openadsdk.core.model.emc emcVarDg = this.ypw.dg();
        if (emcVarDg == null || (eeVarSup = emcVarDg.sup()) == null || TextUtils.isEmpty(eeVarSup.uym())) {
            return;
        }
        this.iyl = new com.bytedance.sdk.openadsdk.activity.bw(this.dg, this.ypw, -1, 1, false, false, true);
    }

    private void mkp() {
        if (this.nw) {
            this.fu = System.currentTimeMillis();
        }
        this.ru.removeMessages(1);
        ycc yccVar = this.ndl;
        if (yccVar != null) {
            yccVar.ypw();
        }
    }

    private void rtt() {
        if (this.fu != 0) {
            msw mswVar = this.lt;
            if (mswVar != null && dr.ypw(mswVar.ycc)) {
                int iCurrentTimeMillis = this.rtt - ((int) ((System.currentTimeMillis() - this.fu) / 1000));
                this.rtt = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.rtt = 0;
                }
            }
            this.fu = 0L;
        }
        if (this.rtt >= 0) {
            this.ru.removeMessages(1);
            this.ru.sendEmptyMessage(1);
        }
        ycc yccVar = this.ndl;
        if (yccVar != null) {
            yccVar.xq();
        }
    }

    private void sb() {
        msw mswVar;
        if (!this.sup || this.dg.vk() || (mswVar = this.lt) == null) {
            return;
        }
        mswVar.rqm();
    }

    private void sf() {
        if (this.yz || this.wpn == null) {
            return;
        }
        this.ru.removeMessages(3);
        this.ru.sendEmptyMessageDelayed(3, this.sra * 1000);
    }

    private void xmt() {
        if (this.xxg != null || this.wpn == null || this.cn) {
            return;
        }
        this.yz = true;
        this.xxg = new com.bytedance.sdk.openadsdk.core.ycc.xq(this.emc) { // from class: com.bytedance.sdk.openadsdk.activity.dg.10
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                dg.this.ru.removeMessages(4);
                dg.this.ru.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.xhi;
        if (view != null && view.getParent() == null) {
            this.xxg.addView(this.xhi, new FrameLayout.LayoutParams(-1, -1));
        }
        this.gbl.addView(this.xxg, new FrameLayout.LayoutParams(-1, -1));
        this.ru.sendEmptyMessageDelayed(4, this.rie * 1000);
        msw mswVar = this.lt;
        if (mswVar instanceof com.bytedance.sdk.openadsdk.activity.emc) {
            ((com.bytedance.sdk.openadsdk.activity.emc) mswVar).dr();
        }
        mkp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(int i) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.wd) {
            this.yzg.add(this.ru.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i = message.what;
        if (i == 1) {
            int i3 = this.rtt;
            if (i3 > 0) {
                if (i3 <= this.sb) {
                    sb();
                }
                int i6 = (int) (((r0 - this.rtt) * 100.0d) / this.mkp);
                TopLayoutDislike2 topLayoutDislike2 = this.zz;
                StringBuilder sb = new StringBuilder();
                int i7 = this.rtt;
                this.rtt = i7 - 1;
                sb.append(i7);
                sb.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i6);
                if (this.rtt >= 0) {
                    this.ru.removeMessages(message.what);
                    this.ru.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                sb();
                if (dg()) {
                    this.zz.showSkipButton();
                } else {
                    this.zz.showCloseButton();
                }
            }
        } else if (i == 3) {
            xmt();
        } else if (i == 4) {
            db();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void sba() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public com.bytedance.sdk.openadsdk.component.reward.top.xq sup() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void yzg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ee() {
        com.bytedance.sdk.openadsdk.activity.bw bwVar = this.iyl;
        if (bwVar == null || !bwVar.hxp()) {
            this.dg.uym();
            return;
        }
        ypw(this.iyl);
        this.gbl.removeView(this.ycc);
        this.zz.setVisibility(8);
        this.sba.setVisibility(8);
    }

    private void hxp() {
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.dg.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ypw.emc(dg.this.emc)) {
                    return;
                }
                dg.this.sz.set(false);
                if (!dg.this.hxp) {
                    dg.this.uym.emc(com.bytedance.sdk.component.utils.rie.emc(aa.emc(), "tt_list_end_tip"));
                } else {
                    dg.this.uym.emc("");
                    dg.this.rie();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rie() {
        if (this.wo) {
            return;
        }
        if (this.hxp) {
            ylm();
        } else {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.dg.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.ypw.emc(dg.this.emc)) {
                        return;
                    }
                    dg.this.uym.emc(com.bytedance.sdk.component.utils.rie.emc(aa.emc(), "tt_list_end_tip"));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sra() {
        if (this.sz.compareAndSet(false, true)) {
            AdSlot adSlotVaf = this.ypw.vaf();
            sb sbVar = new sb();
            sbVar.ycc = true;
            if (this.ypw.zhk() != null || this.ypw.kv() != null) {
                sbVar.zz = 2;
            }
            sbVar.uym = this.ra;
            this.uym.emc(com.bytedance.sdk.component.utils.rie.emc(this.emc, "tt_loading_more"));
            if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                aa.xq().emc(adSlotVaf, sbVar, this.ypw.blf(), (ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.activity.dg.18
                    @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                    public void emc(int i, String str) {
                        dg.this.emc(i, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
                    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                        dg.this.emc(emcVar, xqVar);
                    }
                });
            } else {
                aa.xq().emc(adSlotVaf, sbVar, this.ypw.blf(), new sra.emc() { // from class: com.bytedance.sdk.openadsdk.activity.dg.19
                    @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                    public void emc(int i, String str) {
                        dg.this.emc(i, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.sra.emc
                    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
                        dg.this.emc(emcVar, xqVar);
                    }
                });
            }
        }
    }

    private int ylm() {
        if (!this.hxp || this.uym.xq() || this.sz.get() || this.wo) {
            return 0;
        }
        int iEmc = emc(this.xmt, this.uym.dg(), 1073741823);
        this.uym.emc(this.xmt, iEmc);
        if (this.xmt < 0) {
            this.ycc.c0(iEmc);
            return iEmc;
        }
        this.xmt = iEmc;
        return iEmc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void aa() {
        super.aa();
        this.nw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public boolean bw() {
        return this.dr;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public List<rie> cf() {
        return this.uym.bw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public msw gbl() {
        return this.lt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public int msw() {
        return this.rtt;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public int ru() {
        return this.qh.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    /* renamed from: ul, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.emc sz() {
        g0 g0VarF = this.ycc.F(this.xmt + 1);
        if (!(g0VarF instanceof ypw)) {
            return null;
        }
        msw mswVarEmc = ((ypw) g0VarF).emc();
        if (mswVarEmc instanceof com.bytedance.sdk.openadsdk.activity.emc) {
            return (com.bytedance.sdk.openadsdk.activity.emc) mswVarEmc;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void vk() {
        if (this.wad) {
            return;
        }
        this.wad = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.rqm;
        long jCurrentTimeMillis = System.currentTimeMillis();
        rie rieVar = this.ypw;
        com.bytedance.sdk.openadsdk.dg.xq.emc(jCurrentTimeMillis, rieVar, rieVar.bw(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.activity.dg.11
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject ypw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.dg$dg, reason: collision with other inner class name */
    public static class C0047dg {
        public int emc = 0;
        public String xq;
        public rie ypw;

        public C0047dg(rie rieVar) {
            this.ypw = rieVar;
        }

        public C0047dg(String str) {
            this.xq = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(msw mswVar) {
        msw mswVar2 = this.lt;
        if (mswVar != mswVar2) {
            return;
        }
        if (this.mxo) {
            if (this.xmt < this.uym.emc() - 1) {
                int i = this.xmt + 1;
                this.vw = i;
                if (this.cf) {
                    this.ycc.e0(i);
                } else {
                    ypw(i);
                }
            } else {
                this.vw = 0;
                this.ycc.c0(0);
                this.ycc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.dg.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.ypw.emc(dg.this.emc)) {
                            return;
                        }
                        dg dgVar = dg.this;
                        dgVar.emc(dgVar.vw, true);
                    }
                });
            }
        } else if (this.hj) {
            mswVar2.xq();
        } else {
            mswVar2.mxo();
        }
        this.ndl = null;
        this.hj = false;
    }

    private void ypw(msw mswVar) {
        ArrayList<msw> arrayListYpw = this.uym.ypw();
        int size = arrayListYpw.size();
        int i = 0;
        while (i < size) {
            msw mswVar2 = arrayListYpw.get(i);
            i++;
            msw mswVar3 = mswVar2;
            if (mswVar3 != mswVar) {
                mswVar3.emc(this.lt, mswVar, this.cuf);
            }
        }
        com.bytedance.sdk.openadsdk.activity.bw bwVar = this.iyl;
        if (bwVar != null && bwVar != mswVar) {
            bwVar.emc(this.lt, mswVar, this.cuf);
        }
        msw mswVar4 = this.lt;
        this.lt = mswVar;
        if (mswVar4 != null) {
            mswVar4.sup = false;
            mswVar4.qh();
            mswVar4.dg();
        }
        mswVar.sup = true;
        mswVar.ypw(this.emc, new ypw.bw(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc = mswVar.emc();
        if (mswVarEmc.getVisibility() != 0) {
            mswVarEmc.setVisibility(0);
        }
        if (mswVarEmc.getParent() == null) {
            this.gbl.addView(mswVarEmc, new FrameLayout.LayoutParams(-1, -1));
        }
        this.dg.ypw(mswVar);
        if (mswVar.f_() != this.dr) {
            mswVar.emc("card_sync");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public boolean dg() {
        return this.iyl != null;
    }

    public static class emc extends G {
        private boolean bw;
        private boolean dg;
        private final dg xq;
        private final ArrayList<C0047dg> emc = new ArrayList<>();
        private final ArrayList<msw> ypw = new ArrayList<>();

        public emc(dg dgVar, List<rie> list) {
            this.xq = dgVar;
            for (int i = 0; i < list.size(); i++) {
                rie rieVar = list.get(i);
                if (rieVar != null && dgVar != null) {
                    rieVar.iyl(dgVar.bw);
                }
                this.emc.add(new C0047dg(rieVar));
            }
        }

        public List<rie> bw() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C0047dg> arrayList2 = this.emc;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                C0047dg c0047dg = arrayList2.get(i);
                i++;
                C0047dg c0047dg2 = c0047dg;
                if (c0047dg2.emc == 0) {
                    arrayList.add(c0047dg2.ypw);
                }
            }
            return arrayList;
        }

        public int dg() {
            return this.dg ? this.emc.size() - 1 : this.emc.size();
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public bw onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -1) {
                com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(viewGroup.getContext());
                xqVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new xq(xqVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ypw ypwVar = new com.bytedance.sdk.openadsdk.component.reward.view.ypw(viewGroup.getContext(), this.xq.vk, this.xq.cf, vw.ypw(viewGroup.getContext(), 10.0f));
            ypwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new ypw(this, ypwVar);
        }

        @Override // androidx.recyclerview.widget.G
        public int getItemCount() {
            if (this.bw) {
                return Integer.MAX_VALUE;
            }
            return this.emc.size();
        }

        @Override // androidx.recyclerview.widget.G
        public int getItemViewType(int i) {
            C0047dg c0047dg = this.emc.get(i % this.emc.size());
            if (c0047dg.emc != 0) {
                return -1;
            }
            cuf cufVarKv = c0047dg.ypw.kv();
            if (cufVarKv == null) {
                return 1;
            }
            return (cufVarKv.emc() + cufVarKv.ypw()).hashCode();
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: xq, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(bw bwVar) {
            super.onViewRecycled(bwVar);
            if (bwVar instanceof ypw) {
                ypw ypwVar = (ypw) bwVar;
                com.bytedance.sdk.openadsdk.activity.emc emcVar = ypwVar.xq;
                if (!this.xq.ul) {
                    emc(ypwVar, false);
                    return;
                }
                boolean zYpw = ypw(emcVar);
                if (emcVar != null) {
                    emc(ypwVar, zYpw);
                }
            }
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(bw bwVar) {
            com.bytedance.sdk.openadsdk.activity.emc emcVar;
            super.onViewDetachedFromWindow(bwVar);
            if (!(bwVar instanceof ypw) || (emcVar = ((ypw) bwVar).xq) == null) {
                return;
            }
            emcVar.ee().ylm.xxg();
        }

        private boolean ypw(msw mswVar) {
            return mswVar != null && mswVar.cuf();
        }

        public ArrayList<msw> ypw() {
            return this.ypw;
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(bw bwVar, int i) {
            if (i >= this.emc.size()) {
                i %= this.emc.size();
            }
            bwVar.emc(this.xq, this.emc.get(i), i);
        }

        public boolean xq() {
            return this.bw;
        }

        @Override // androidx.recyclerview.widget.G
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(bw bwVar) {
            super.onViewAttachedToWindow(bwVar);
        }

        public int emc() {
            int itemCount = getItemCount();
            return this.dg ? itemCount - 1 : itemCount;
        }

        public void emc(String str) {
            int size = this.emc.size();
            C0047dg c0047dg = size > 0 ? this.emc.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0047dg == null || c0047dg.emc != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.emc.add(new C0047dg(str));
                notifyItemInserted(size);
                this.dg = true;
                return;
            }
            if (!zIsEmpty) {
                c0047dg.xq = str;
                notifyItemChanged(size - 1);
            } else {
                this.emc.remove(c0047dg);
                notifyItemRemoved(size - 1);
                this.dg = false;
            }
        }

        public void emc(msw mswVar) {
            this.ypw.add(mswVar);
        }

        public void emc(List<rie> list) {
            dg dgVar;
            int size = this.emc.size();
            if (this.dg) {
                size--;
            }
            for (int i = 0; i < list.size(); i++) {
                rie rieVar = list.get(i);
                if (rieVar != null && (dgVar = this.xq) != null) {
                    rieVar.iyl(dgVar.bw);
                }
                this.emc.add(size + i, new C0047dg(rieVar));
                rieVar.ksn();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void emc(int i, int i3) {
            if (this.bw) {
                return;
            }
            this.bw = true;
            if (i < 0) {
                i = 0;
            }
            int size = this.emc.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i3) - (size - i));
            notifyItemRangeInserted(0, i3 - i);
        }

        public void emc(ypw ypwVar, boolean z6) {
            if (ypwVar.xq == null) {
                return;
            }
            this.ypw.remove(ypwVar.xq);
            ypwVar.emc(z6);
        }
    }

    private static int emc(int i, int i3, int i6) {
        if (i < 0) {
            i = 0;
        }
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = i6 + i7;
            if (i8 % i3 == i) {
                return i8;
            }
            int i9 = i6 - i7;
            if (i9 % i3 == i) {
                return i9;
            }
        }
        return i6;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(Bundle bundle) {
        super.emc(bundle);
        dr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, String str) {
        this.wo = false;
        hxp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) {
        this.wo = false;
        if (emcVar.dg() != null && !emcVar.dg().isEmpty()) {
            emc(emcVar);
            return;
        }
        xqVar.emc(-3);
        xqVar.xq(1);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
        hxp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void xq() {
        super.xq();
        this.wd = true;
        msw mswVar = this.lt;
        if (mswVar != null) {
            mswVar.qh();
        }
        mkp();
        this.hj = this.ndl != null;
        this.ru.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw(Activity activity) {
        super.ypw(activity);
        vw.emc(activity);
    }

    private void emc(final com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        ee eeVarSup = emcVar.sup();
        if (eeVarSup != null) {
            this.ra = eeVarSup.sup();
            this.wo = eeVarSup.sz();
        }
        if (!this.cf) {
            for (rie rieVar : emcVar.dg()) {
                if (rieVar.iat() != null && rie.bw(rieVar)) {
                    com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(rieVar.zxw())).b(), rieVar);
                    ypwVarEmc.emc("material_meta", rieVar);
                    ypwVarEmc.emc("ad_slot", rieVar.vaf());
                    com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.activity.dg.3
                        @Override // K1.a
                        public void emc(b bVar, int i) {
                        }

                        @Override // K1.a
                        public void emc(b bVar, int i, String str) {
                        }
                    });
                }
            }
        }
        iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.dg.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ypw.emc(dg.this.emc)) {
                    return;
                }
                dg.this.sz.set(false);
                dg.this.uym.emc("");
                dg.this.uym.emc(emcVar.dg());
                dg.this.rie();
            }
        });
    }

    private void ypw(int i) {
        g0 g0VarF;
        int iFindFirstVisibleItemPosition = this.msw.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.msw.findLastVisibleItemPosition();
        if (i < iFindFirstVisibleItemPosition) {
            this.ycc.e0(i);
            return;
        }
        if (i <= iFindLastVisibleItemPosition) {
            int i3 = i - iFindFirstVisibleItemPosition;
            int childCount = this.ycc.getChildCount();
            if (i3 <= 0 || i3 >= childCount || (g0VarF = this.ycc.F(i - 1)) == null) {
                return;
            }
            this.ycc.d0(0, g0VarF.itemView.getBottom(), false);
            return;
        }
        this.ycc.e0(this.vw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw() {
        super.ypw();
        int i = 0;
        this.wd = false;
        this.nw = false;
        msw mswVar = this.lt;
        if (mswVar != null && !this.hj) {
            mswVar.xq();
        }
        if (this.rqm == 0) {
            this.rqm = SystemClock.elapsedRealtime();
        }
        rtt();
        sf();
        ArrayList<Message> arrayList = this.yzg;
        int size = arrayList.size();
        while (i < size) {
            Message message = arrayList.get(i);
            i++;
            handleMessage(message);
        }
        this.yzg.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(int i, boolean z6) {
        int i3;
        g0 g0VarF = this.ycc.F(i);
        if (g0VarF == null || !(g0VarF instanceof ypw) || (i3 = this.xmt) == i) {
            return;
        }
        emc(i3, i, z6);
        this.xmt = i;
        this.wa = SystemClock.elapsedRealtime();
        msw mswVarEmc = ((ypw) g0VarF).emc();
        if (mswVarEmc == null) {
            return;
        }
        ypw(mswVarEmc);
        this.qh.add(mswVarEmc.ycc.wa());
        if (this.wo && this.ee > 0 && this.xmt >= this.uym.emc() - this.ee) {
            sra();
        }
        com.bytedance.sdk.openadsdk.activity.emc emcVarSz = sz();
        if (emcVarSz != null) {
            if (!this.cf && this.msw.findLastVisibleItemPosition() >= this.xmt + 1) {
                emcVarSz.bw(true);
            }
            this.aa.add(Integer.valueOf(this.xmt + 1));
            emcVarSz.sb();
            this.but = false;
            return;
        }
        this.but = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void ypw(msw mswVar, int i) {
        msw mswVar2 = this.lt;
        if (mswVar != mswVar2) {
            return;
        }
        if (i == 2) {
            mkp();
            return;
        }
        if (i == 1) {
            if (cuf()) {
                msw mswVar3 = this.lt;
                if (mswVar3 instanceof com.bytedance.sdk.openadsdk.activity.emc) {
                    ((com.bytedance.sdk.openadsdk.activity.emc) mswVar3).dr();
                    return;
                }
                return;
            }
            rtt();
            return;
        }
        if (i == 3 || i == 4) {
            try {
                mswVar2.ee().ylm.xmt();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("CardsLayoutManager", th);
            }
        }
    }

    private void emc(int i, int i3, boolean z6) {
        String str;
        if (i < 0 || i3 < 0 || i == i3) {
            return;
        }
        if (z6) {
            str = "auto_down";
        } else {
            str = i3 > i ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.wa) / 1000;
        List<rie> listBw = this.uym.bw();
        final int size = i % listBw.size();
        final int size2 = i3 % listBw.size();
        rie rieVar = listBw.get(size);
        com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), rieVar, rieVar.bw(), "slide", new com.bytedance.sdk.openadsdk.vk.xq.emc() { // from class: com.bytedance.sdk.openadsdk.activity.dg.6
            @Override // com.bytedance.sdk.openadsdk.vk.xq.emc, com.bytedance.sdk.openadsdk.vk.xq.ypw
            public JSONObject emc() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(final msw mswVar, msw mswVar2, ypw.bw bwVar) {
        long jDg;
        if (mswVar != this.lt) {
            return;
        }
        if (mswVar.db() || dr.ypw(mswVar.ycc)) {
            jDg = 500;
        } else {
            jDg = mswVar.ycc.ivb() != null ? r6.dg() * 1000 : 0L;
        }
        ycc yccVar = this.ndl;
        if (yccVar != null) {
            yccVar.dg();
        }
        ycc yccVar2 = new ycc(Math.max(500L, jDg)) { // from class: com.bytedance.sdk.openadsdk.activity.dg.7
            @Override // com.bytedance.sdk.openadsdk.activity.dg.ycc
            public void emc() {
                if (com.bytedance.sdk.component.utils.ypw.emc(dg.this.emc)) {
                    return;
                }
                dg.this.xq(mswVar);
            }
        };
        this.ndl = yccVar2;
        yccVar2.bw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(boolean z6) {
        super.emc(z6);
        msw mswVar = this.lt;
        if (mswVar != null) {
            mswVar.xq(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public boolean emc(msw mswVar, int i) {
        com.bytedance.sdk.openadsdk.activity.bw bwVar = this.iyl;
        return bwVar != null && bwVar == mswVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(View view) {
        super.emc(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.gbl.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(Activity activity) {
        super.emc(activity);
        msw mswVar = this.lt;
        if (mswVar != null) {
            mswVar.ypw(activity);
        }
        com.bytedance.sdk.openadsdk.activity.bw bwVar = this.iyl;
        if (bwVar != null) {
            bwVar.yzg();
        }
        ArrayList<msw> arrayListYpw = this.uym.ypw();
        int size = arrayListYpw.size();
        int i = 0;
        while (i < size) {
            msw mswVar2 = arrayListYpw.get(i);
            i++;
            mswVar2.yzg();
        }
        this.ru.removeCallbacksAndMessages(null);
        ycc yccVar = this.ndl;
        if (yccVar != null) {
            yccVar.dg();
            this.ndl = null;
        }
        msw mswVar3 = this.lt;
        if (mswVar3 == null || mswVar3.sra() || this.ypw.wh()) {
            return;
        }
        qh.ypw().post(new ypw.xq(this.ypw));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.xq
    public void emc(Map<String, Object> map, msw mswVar, float f2, float f5) throws JSONException {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.msw mswVarEmc = mswVar.emc();
                ((JSONObject) jSONObject).put("width", mswVarEmc.getWidth());
                ((JSONObject) jSONObject).put("height", mswVarEmc.getHeight());
                int i = mswVar.ru;
                ((JSONObject) jSONObject).put("click_feed_top", i == this.msw.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i == this.uym.dg() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.rtt);
                ((JSONObject) jSONObject).put("click_user_remaining", i == this.xmt ? (SystemClock.elapsedRealtime() - this.wa) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
