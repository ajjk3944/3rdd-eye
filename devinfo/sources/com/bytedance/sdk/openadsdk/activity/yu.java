package com.bytedance.sdk.openadsdk.activity;

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
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.o0;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.t1;
import androidx.recyclerview.widget.x1;
import b9.e;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import w8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends com.bytedance.sdk.openadsdk.activity.lh implements Handler.Callback {
    private final TopLayoutDislike2 bly;
    private int bs;

    /* renamed from: cd, reason: collision with root package name */
    private boolean f7790cd;

    /* renamed from: cf, reason: collision with root package name */
    private final FrameLayout f7791cf;

    /* renamed from: cj, reason: collision with root package name */
    private long f7792cj;
    private boolean ex;
    private ex.ouw ey;
    private int fak;
    private boolean fqk;
    private vt.fkw fvf;
    private FrameLayout hun;
    private int jae;

    /* renamed from: jg, reason: collision with root package name */
    private final HashSet<String> f7793jg;
    private int jqy;
    private JSONObject jvy;
    private boolean kn;
    private final boolean ko;
    private boolean ksc;

    /* renamed from: le, reason: collision with root package name */
    private final RecyclerView f7794le;
    private JSONObject lso;
    private View mt;
    private final AtomicBoolean mwh;
    private boolean myk;

    /* renamed from: od, reason: collision with root package name */
    private boolean f7795od;
    private boolean osn;

    /* renamed from: pd, reason: collision with root package name */
    private pno f7796pd;
    private final LinearLayoutManager pno;
    private long pv;
    private final boolean qbp;
    private final ouw ra;
    private final boolean rn;
    private int rrs;
    private final boolean ryl;
    private int tc;

    /* renamed from: th, reason: collision with root package name */
    private final ArrayList<Message> f7797th;
    private final Handler tlj;

    /* renamed from: ub, reason: collision with root package name */
    private JSONObject f7798ub;
    private boolean ucs;
    private com.bytedance.sdk.openadsdk.activity.fkw uoy;
    private int uq;
    private boolean ux;

    /* renamed from: vh, reason: collision with root package name */
    private Message f7799vh;
    private final PAGLogoView vm;
    private int vpp;
    private boolean wp;
    private boolean xdk;
    private boolean yhj;
    private le yib;
    private final HashSet<Integer> zih;
    private boolean zin;
    private long zvq;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static abstract class fkw extends x1 {
        public fkw(View view) {
            super(view);
        }

        public abstract void ouw(yu yuVar, C0067yu c0067yu, int i4);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static abstract class le implements Runnable {
        public long fkw;

        /* renamed from: le, reason: collision with root package name */
        public long f7805le;

        /* renamed from: lh, reason: collision with root package name */
        public final long f7806lh;
        private final Handler ouw = new Handler(Looper.getMainLooper());
        public long yu;

        public le(long j) {
            this.f7806lh = j;
        }

        public final void fkw() {
            this.ouw.postDelayed(this, this.f7806lh);
            this.yu = SystemClock.elapsedRealtime();
        }

        public final void lh() {
            long j = this.f7806lh - this.fkw;
            if (j < 0) {
                return;
            }
            this.ouw.removeCallbacks(this);
            this.ouw.postDelayed(this, j);
            this.yu = SystemClock.elapsedRealtime();
        }

        public abstract void ouw();

        @Override // java.lang.Runnable
        public void run() {
            ouw();
        }

        public final void vt() {
            this.ouw.removeCallbacks(this);
            if (this.f7805le > this.yu) {
                return;
            }
            this.fkw = (SystemClock.elapsedRealtime() - this.yu) + this.fkw;
            this.f7805le = SystemClock.elapsedRealtime();
        }

        public final void yu() {
            this.ouw.removeCallbacks(this);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh extends fkw {
        private final TextView ouw;

        public lh(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(view.getContext());
            this.ouw = pnoVar;
            pnoVar.setTextColor(Color.parseColor("#99FFFFFF"));
            pnoVar.setTextSize(14.0f);
            pnoVar.setGravity(17);
            pnoVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(pnoVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.yu.fkw
        public final void ouw(yu yuVar, C0067yu c0067yu, int i4) {
            this.ouw.setText(c0067yu.f7809lh);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends fkw {

        /* renamed from: lh, reason: collision with root package name */
        private final ouw f7808lh;
        final com.bytedance.sdk.openadsdk.component.reward.view.vt ouw;
        com.bytedance.sdk.openadsdk.activity.ouw vt;

        public vt(ouw ouwVar, View view) {
            super(view);
            this.f7808lh = ouwVar;
            this.ouw = (com.bytedance.sdk.openadsdk.component.reward.view.vt) view;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
        @Override // com.bytedance.sdk.openadsdk.activity.yu.fkw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void ouw(com.bytedance.sdk.openadsdk.activity.yu r8, com.bytedance.sdk.openadsdk.activity.yu.C0067yu r9, int r10) {
            /*
                r7 = this;
                int r3 = r7.getBindingAdapterPosition()
                android.app.Activity r6 = r8.ouw
                boolean r0 = com.bytedance.sdk.component.utils.vt.ouw(r6)
                if (r0 == 0) goto Le
                goto L88
            Le:
                com.bytedance.sdk.openadsdk.core.model.vpp r2 = r9.vt
                com.bytedance.sdk.openadsdk.activity.ouw r9 = r7.vt
                if (r9 == 0) goto L48
                boolean r0 = r9.fak()
                if (r0 == 0) goto L42
                com.bytedance.sdk.openadsdk.core.model.vpp r0 = r9.f7765le
                com.bytedance.sdk.openadsdk.core.model.pd r0 = r0.lht
                if (r0 == 0) goto L42
                com.bytedance.sdk.openadsdk.core.model.pd r1 = r2.lht
                java.lang.String r4 = r0.ouw
                java.lang.String r5 = r1.ouw
                boolean r4 = android.text.TextUtils.equals(r4, r5)
                if (r4 == 0) goto L42
                java.lang.String r0 = r0.vt
                java.lang.String r1 = r1.vt
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L42
                boolean r9 = r9.uoy()
                if (r9 == 0) goto L42
                com.bytedance.sdk.openadsdk.activity.ouw r9 = r7.vt
                r9.ouw(r2, r3, r10)
                goto L48
            L42:
                com.bytedance.sdk.openadsdk.activity.yu$ouw r9 = r7.f7808lh
                r0 = 0
                r9.ouw(r7, r0)
            L48:
                com.bytedance.sdk.openadsdk.activity.vt r1 = r8.yu
                com.bytedance.sdk.openadsdk.activity.ouw r9 = r7.vt
                if (r9 != 0) goto L65
                boolean r9 = r2.ey()
                if (r9 == 0) goto L5c
                com.bytedance.sdk.openadsdk.activity.ra r0 = new com.bytedance.sdk.openadsdk.activity.ra
                r5 = 0
                r4 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                goto L63
            L5c:
                r4 = r10
                com.bytedance.sdk.openadsdk.activity.le r0 = new com.bytedance.sdk.openadsdk.activity.le
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
            L63:
                r7.vt = r0
            L65:
                com.bytedance.sdk.openadsdk.activity.vt$fkw r9 = new com.bytedance.sdk.openadsdk.activity.vt$fkw
                r10 = 1
                r0 = 0
                r9.<init>(r10, r0)
                boolean r10 = com.bytedance.sdk.openadsdk.activity.yu.lh(r8)
                r9.yu = r10
                com.bytedance.sdk.openadsdk.activity.ouw r10 = r7.vt
                r10.vt(r6, r9)
                com.bytedance.sdk.openadsdk.activity.yu$ouw r9 = r7.f7808lh
                com.bytedance.sdk.openadsdk.activity.ouw r10 = r7.vt
                java.util.ArrayList<com.bytedance.sdk.openadsdk.activity.pno> r9 = r9.ouw
                r9.add(r10)
                com.bytedance.sdk.openadsdk.activity.ouw r9 = r7.vt
                com.bytedance.sdk.openadsdk.component.reward.view.bly r9 = r9.ouw()
                if (r9 != 0) goto L89
            L88:
                return
            L89:
                android.view.ViewParent r10 = r9.getParent()
                boolean r0 = r10 instanceof android.view.ViewGroup
                if (r0 == 0) goto L96
                android.view.ViewGroup r10 = (android.view.ViewGroup) r10
                r10.removeView(r9)
            L96:
                boolean r8 = com.bytedance.sdk.openadsdk.activity.yu.od(r8)
                if (r8 != 0) goto Lb3
                float r8 = r2.coz()
                r10 = 0
                int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r10 <= 0) goto Lab
                com.bytedance.sdk.openadsdk.component.reward.view.vt r10 = r7.ouw
                r10.setWidthAndHeightRatio(r8)
                goto Lb3
            Lab:
                com.bytedance.sdk.openadsdk.component.reward.view.vt r8 = r7.ouw
                r10 = 1061997773(0x3f4ccccd, float:0.8)
                r8.setWidthOrHeightInParentRatio(r10)
            Lb3:
                com.bytedance.sdk.openadsdk.component.reward.view.vt r8 = r7.ouw
                android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
                r0 = -1
                r10.<init>(r0, r0)
                com.bytedance.sdk.openadsdk.core.le.lh r0 = r8.ouw
                if (r0 == 0) goto Lc3
                r0.addView(r9, r10)
                goto Lc6
            Lc3:
                r8.addView(r9, r10)
            Lc6:
                com.bytedance.sdk.openadsdk.component.reward.view.vt r8 = r7.ouw
                com.bytedance.sdk.openadsdk.activity.ouw r9 = r7.vt
                r8.setScene(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.yu.vt.ouw(com.bytedance.sdk.openadsdk.activity.yu, com.bytedance.sdk.openadsdk.activity.yu$yu, int):void");
        }
    }

    public yu(final Activity activity, final vpp vppVar, final com.bytedance.sdk.openadsdk.activity.vt vtVar) throws IllegalStateException {
        ex exVar;
        ex exVar2;
        super(activity, vppVar, vtVar);
        this.tlj = new Handler(Looper.getMainLooper(), this);
        this.mwh = new AtomicBoolean(false);
        this.f7793jg = new HashSet<>();
        this.zih = new HashSet<>();
        this.f7797th = new ArrayList<>();
        this.vpp = 5;
        this.jqy = 3;
        this.uq = -1;
        this.fvf = new vt.fkw(1, null);
        boolean z3 = vppVar.fvf == 44;
        this.ko = z3;
        boolean zEy = vppVar.ey();
        this.ryl = zEy;
        this.rn = cf.ouw(activity, vppVar) == 1;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(activity) { // from class: com.bytedance.sdk.openadsdk.activity.yu.1
            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                yu.this.lso = null;
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.f7791cf = lhVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lhVar.setFitsSystemWindows(true);
        }
        activity.setContentView(lhVar);
        this.fkw = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.vm;
        if (ouwVar != null && (exVar2 = ouwVar.f8252le) != null) {
            this.osn = exVar2.ouw == 1;
            this.ey = exVar2.bly;
            int iMax = Math.max(0, exVar2.f8221le);
            this.bs = iMax;
            this.fak = iMax;
            this.f7795od = exVar2.f8222lh == 1;
            this.ksc = exVar2.yu == 1;
            int i4 = exVar2.ra;
            this.tc = i4;
            this.jvy = exVar2.f8219cf;
            this.ex = exVar2.fkw == 1;
            this.zin = exVar2.f8220jg == 1;
            this.fqk = i4 > 0;
            this.vpp = exVar2.ryl;
            this.jqy = exVar2.mwh;
            this.lso = exVar2.ouw();
            pd pdVar = exVar2.ko;
            this.f7798ub = pdVar == null ? null : pdVar.fkw;
            if (!this.ksc) {
                this.osn = false;
            }
        }
        if (zEy) {
            int i10 = vppVar.myk;
            if (i10 < 0) {
                zih.yu();
                i10 = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(vppVar.fqk())).f8455le;
            }
            this.jae = (int) ((1.0f - (Math.max(0, Math.min(100, i10)) / 100.0f)) * this.bs);
        }
        RecyclerView recyclerView = new RecyclerView(activity, null);
        this.f7794le = recyclerView;
        ex.ouw ouwVar2 = this.ey;
        if (ouwVar2 != null) {
            int i11 = ouwVar2.ouw;
            int i12 = ouwVar2.vt;
            if (i11 > 0 || i12 > 0) {
                recyclerView.setPadding(osn.ouw(activity, i11), 0, osn.ouw(activity, i12), 0);
            }
            ex.ouw ouwVar3 = this.ey;
            int i13 = ouwVar3.f8224lh;
            int i14 = ouwVar3.yu;
            int i15 = ouwVar3.fkw;
            if (i13 > 0 || i15 > 0 || i14 > 0) {
                final int iOuw = osn.ouw(activity, i13);
                final int iOuw2 = osn.ouw(activity, i14);
                final int iOuw3 = osn.ouw(activity, i15);
                recyclerView.i(new b1() { // from class: com.bytedance.sdk.openadsdk.activity.yu.12
                    @Override // androidx.recyclerview.widget.b1
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, t1 t1Var) {
                        recyclerView2.getClass();
                        int iN = RecyclerView.N(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (iN == 0) {
                            rect.top = iOuw;
                        } else {
                            rect.top = iOuw3 / 2;
                        }
                        if (iN == itemCount - 1) {
                            rect.bottom = iOuw2;
                        } else {
                            rect.bottom = iOuw3 / 2;
                        }
                    }
                });
            }
        }
        lhVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.bly = topLayoutDislike2;
        lhVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(vppVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        zih.yu();
        boolean zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(vppVar.fqk()));
        this.f7790cd = zRyl;
        topLayoutDislike2.setSoundMute(zRyl);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.yu.13
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                vtVar.vt();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                vpp vppVar2 = vppVar;
                com.bytedance.sdk.openadsdk.yu.lh.ouw("skip", vppVar2, vppVar2.vt(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.fkw(0L);
                    yuVar.yu(0L);
                }
                yu.ouw(yu.this);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                if (yu.this.f7796pd != null) {
                    yu.this.f7796pd.f_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                if (yu.this.f7796pd != null) {
                    yu.this.f7796pd.ouw(str);
                    yu.this.f7790cd = !r2.f7790cd;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity) { // from class: com.bytedance.sdk.openadsdk.activity.yu.14
            {
                super(1);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(t1 t1Var, int[] iArr) {
                super.calculateExtraLayoutSpace(t1Var, iArr);
                int height = yu.this.f7794le.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.pno = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        ouw ouwVar4 = new ouw(this, vppVar.vm.yu);
        this.ra = ouwVar4;
        recyclerView.setAdapter(ouwVar4);
        if (!this.fqk && !this.ex) {
            ouwVar4.ouw(com.bytedance.sdk.component.utils.vpp.ouw(activity, "tt_list_end_tip"));
        }
        if (z3) {
            new o0().attachToRecyclerView(recyclerView);
        } else if (this.ksc) {
            new com.bytedance.sdk.openadsdk.component.reward.view.ouw().attachToRecyclerView(recyclerView);
        }
        recyclerView.j(new j1() { // from class: com.bytedance.sdk.openadsdk.activity.yu.15
            private int fkw;

            /* renamed from: lh, reason: collision with root package name */
            private final Rect f7802lh = new Rect();
            private int yu = -1;

            @Override // androidx.recyclerview.widget.j1
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i16) {
                if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = yu.this.pno.findFirstCompletelyVisibleItemPosition();
                yu.this.pno.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = yu.this.pno.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i16 == 0 && iFindFirstCompletelyVisibleItemPosition != yu.this.uq) {
                    boolean z10 = false;
                    boolean z11 = iFindFirstCompletelyVisibleItemPosition == yu.this.rrs;
                    yu yuVar = yu.this;
                    if (yuVar.osn && z11) {
                        z10 = true;
                    }
                    yu.ouw(yuVar, iFindFirstCompletelyVisibleItemPosition, z10);
                    if (yu.this.osn && !z11 && yu.this.f7795od) {
                        yu.vm(yu.this);
                    }
                    if (yu.this.yib != null) {
                        yu.this.yib.yu();
                        yu.this.yib = null;
                    }
                }
                if (i16 == 0) {
                    yu.qbp(yu.this);
                }
                if (!yu.this.fqk || yu.this.tc <= 0 || iFindLastVisibleItemPosition < yu.this.ra.ouw() - yu.this.tc) {
                    return;
                }
                yu.this.zin();
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
            @Override // androidx.recyclerview.widget.j1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onScrolled(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
                /*
                    Method dump skipped, instructions count: 322
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.yu.AnonymousClass15.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
            }
        });
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar5 = this.vt.vm;
        if (ouwVar5 != null && (exVar = ouwVar5.f8252le) != null && !TextUtils.isEmpty(exVar.pno)) {
            this.uoy = new com.bytedance.sdk.openadsdk.activity.fkw(this.yu, this.vt, -1, 1, false, false, true);
        }
        final int iQbp = qbp();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.16
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                    return;
                }
                yu.ouw(yu.this, iQbp, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, vppVar);
        this.vm = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = osn.ouw(activity, 16.0f);
        lhVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.yu.17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = view.getContext();
                vpp vppVar2 = vppVar;
                TTWebsiteActivity.ouw(context, vppVar2, vppVar2.vt());
            }
        });
        this.qbp = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("draw_feed_item_reuse", 0) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    /* renamed from: jqy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.ouw mwh() {
        com.bytedance.sdk.openadsdk.activity.ouw ouwVar;
        x1 x1VarJ = this.f7794le.J(this.uq + 1);
        if (!(x1VarJ instanceof vt) || (ouwVar = ((vt) x1VarJ).vt) == null) {
            return null;
        }
        return ouwVar;
    }

    public static /* synthetic */ int qbp(yu yuVar) {
        yuVar.rrs = -1;
        return -1;
    }

    public static /* synthetic */ boolean tc(yu yuVar) {
        yuVar.xdk = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zin() {
        if (this.mwh.compareAndSet(false, true)) {
            AdSlot adSlot = this.vt.yiz;
            ksc kscVar = new ksc();
            kscVar.f8241le = true;
            vpp vppVar = this.vt;
            if (vppVar.xn != null || vppVar.lht != null) {
                kscVar.bly = 2;
            }
            kscVar.ra = this.jvy;
            this.ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(this.ouw, "tt_loading_more"));
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                zih.lh().ouw(adSlot, kscVar, this.vt.lna, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.activity.yu.18
                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(int i4, String str) {
                        yu.zin(yu.this);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                        yu.ouw(yu.this, ouwVar, lhVar);
                    }
                });
            } else {
                zih.lh().ouw(adSlot, kscVar, this.vt.lna, new vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.19
                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(int i4, String str) {
                        yu.zin(yu.this);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                        yu.ouw(yu.this, ouwVar, lhVar);
                    }
                });
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        FrameLayout frameLayout;
        if (this.ucs) {
            this.f7797th.add(this.tlj.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i4 = message.what;
        if (i4 == 1) {
            int i10 = this.bs;
            if (i10 > 0) {
                if (i10 <= this.jae) {
                    ex();
                }
                int i11 = (int) (((r0 - this.bs) * 100.0d) / this.fak);
                TopLayoutDislike2 topLayoutDislike2 = this.bly;
                StringBuilder sb2 = new StringBuilder();
                int i12 = this.bs;
                this.bs = i12 - 1;
                sb2.append(i12);
                sb2.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb2.toString(), i11);
                if (this.bs >= 0) {
                    this.tlj.removeMessages(message.what);
                    this.tlj.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                ex();
                if (yu()) {
                    this.bly.showSkipButton();
                } else {
                    this.bly.showCloseButton();
                }
            }
        } else if (i4 != 3) {
            if (i4 == 4 && (frameLayout = this.hun) != null) {
                ViewParent parent = frameLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.hun);
                }
                this.hun = null;
                pno pnoVar = this.f7796pd;
                if (pnoVar instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                    ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar).fvf();
                }
                tc();
                Message message2 = this.f7799vh;
                if (message2 != null) {
                    handleMessage(message2);
                    this.f7799vh = null;
                }
            }
        } else if (this.hun == null && this.lso != null && !this.xdk) {
            this.ux = true;
            this.hun = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw) { // from class: com.bytedance.sdk.openadsdk.activity.yu.10
                @Override // android.view.ViewGroup, android.view.View
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    yu.this.tlj.removeMessages(4);
                    yu.this.tlj.sendEmptyMessage(4);
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            View view = this.mt;
            if (view != null && view.getParent() == null) {
                this.hun.addView(this.mt, new FrameLayout.LayoutParams(-1, -1));
            }
            this.f7791cf.addView(this.hun, new FrameLayout.LayoutParams(-1, -1));
            this.tlj.sendEmptyMessageDelayed(4, this.jqy * 1000);
            pno pnoVar2 = this.f7796pd;
            if (pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar2).pd();
            }
            ksc();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i4) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final com.bytedance.sdk.openadsdk.component.reward.top.lh ryl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void th() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vm() {
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends t0 {
        private boolean fkw;

        /* renamed from: lh, reason: collision with root package name */
        private final ArrayList<C0067yu> f7807lh = new ArrayList<>();
        final ArrayList<pno> ouw = new ArrayList<>();
        boolean vt;
        private final yu yu;

        public ouw(yu yuVar, List<com.bytedance.sdk.openadsdk.core.model.vpp> list) {
            this.yu = yuVar;
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = list.get(i4);
                if (vppVar != null) {
                    vppVar.rn = yuVar.fkw;
                }
                this.f7807lh.add(new C0067yu(vppVar));
            }
        }

        @Override // androidx.recyclerview.widget.t0
        public final int getItemCount() {
            if (this.vt) {
                return Integer.MAX_VALUE;
            }
            return this.f7807lh.size();
        }

        @Override // androidx.recyclerview.widget.t0
        public final int getItemViewType(int i4) {
            C0067yu c0067yu = this.f7807lh.get(i4 % this.f7807lh.size());
            if (c0067yu.ouw != 0) {
                return -1;
            }
            pd pdVar = c0067yu.vt.lht;
            if (pdVar == null) {
                return 1;
            }
            return (pdVar.ouw + pdVar.vt).hashCode();
        }

        public final List<com.bytedance.sdk.openadsdk.core.model.vpp> lh() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C0067yu> arrayList2 = this.f7807lh;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                C0067yu c0067yu = arrayList2.get(i4);
                i4++;
                C0067yu c0067yu2 = c0067yu;
                if (c0067yu2.ouw == 0) {
                    arrayList.add(c0067yu2.vt);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ void onBindViewHolder(x1 x1Var, int i4) {
            fkw fkwVar = (fkw) x1Var;
            if (i4 >= this.f7807lh.size()) {
                i4 %= this.f7807lh.size();
            }
            fkwVar.ouw(this.yu, this.f7807lh.get(i4), i4);
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ x1 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == -1) {
                com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(viewGroup.getContext());
                lhVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new lh(lhVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.vt vtVar = new com.bytedance.sdk.openadsdk.component.reward.view.vt(viewGroup.getContext(), this.yu.rn, this.yu.ko, osn.ouw(viewGroup.getContext(), 10.0f));
            vtVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new vt(this, vtVar);
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(x1 x1Var) {
            super.onViewAttachedToWindow((fkw) x1Var);
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ void onViewDetachedFromWindow(x1 x1Var) {
            com.bytedance.sdk.openadsdk.activity.ouw ouwVar;
            ko koVar;
            e eVar;
            fkw fkwVar = (fkw) x1Var;
            super.onViewDetachedFromWindow(fkwVar);
            if (!(fkwVar instanceof vt) || (ouwVar = ((vt) fkwVar).vt) == null || (eVar = (koVar = ouwVar.ksc().ex).ra) == null || eVar.zin() == null) {
                return;
            }
            koVar.ouw = koVar.ra.rn();
            koVar.tlj();
            koVar.le();
            koVar.bly = true;
        }

        @Override // androidx.recyclerview.widget.t0
        public final /* synthetic */ void onViewRecycled(x1 x1Var) {
            fkw fkwVar = (fkw) x1Var;
            super.onViewRecycled(fkwVar);
            if (fkwVar instanceof vt) {
                vt vtVar = (vt) fkwVar;
                com.bytedance.sdk.openadsdk.activity.ouw ouwVar = vtVar.vt;
                boolean z3 = false;
                if (!this.yu.qbp) {
                    ouw(vtVar, false);
                    return;
                }
                if (ouwVar != null && ouwVar.fak()) {
                    z3 = true;
                }
                if (ouwVar != null) {
                    ouw(vtVar, z3);
                }
            }
        }

        public final int ouw() {
            int itemCount = getItemCount();
            return this.fkw ? itemCount - 1 : itemCount;
        }

        public final int vt() {
            return this.fkw ? this.f7807lh.size() - 1 : this.f7807lh.size();
        }

        public final void ouw(String str) {
            int size = this.f7807lh.size();
            C0067yu c0067yu = size > 0 ? this.f7807lh.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0067yu == null || c0067yu.ouw != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.f7807lh.add(new C0067yu(str));
                notifyItemInserted(size);
                this.fkw = true;
                return;
            }
            if (!zIsEmpty) {
                c0067yu.f7809lh = str;
                notifyItemChanged(size - 1);
            } else {
                this.f7807lh.remove(c0067yu);
                notifyItemRemoved(size - 1);
                this.fkw = false;
            }
        }

        public final void ouw(List<com.bytedance.sdk.openadsdk.core.model.vpp> list) {
            yu yuVar;
            int size = this.f7807lh.size();
            if (this.fkw) {
                size--;
            }
            for (int i4 = 0; i4 < list.size(); i4++) {
                com.bytedance.sdk.openadsdk.core.model.vpp vppVar = list.get(i4);
                if (vppVar != null && (yuVar = this.yu) != null) {
                    vppVar.rn = yuVar.fkw;
                }
                this.f7807lh.add(size + i4, new C0067yu(vppVar));
                vppVar.lvd();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public final void ouw(int i4, int i10) {
            if (this.vt) {
                return;
            }
            this.vt = true;
            if (i4 < 0) {
                i4 = 0;
            }
            int size = this.f7807lh.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i10) - (size - i4));
            notifyItemRangeInserted(0, i10 - i4);
        }

        public final void ouw(vt vtVar, boolean z3) {
            if (vtVar.vt == null) {
                return;
            }
            this.ouw.remove(vtVar.vt);
            com.bytedance.sdk.openadsdk.activity.ouw ouwVar = vtVar.vt;
            if (ouwVar != null) {
                ouwVar.yu(z3);
                vtVar.vt.qbp();
                if (!z3) {
                    vtVar.vt = null;
                }
                com.bytedance.sdk.openadsdk.component.reward.view.vt vtVar2 = vtVar.ouw;
                com.bytedance.sdk.openadsdk.core.le.lh lhVar = vtVar2.ouw;
                if (lhVar != null) {
                    lhVar.removeAllViews();
                } else {
                    vtVar2.removeAllViews();
                }
            }
        }
    }

    private void ex() {
        pno pnoVar;
        if (!this.ryl || this.yu.rn || (pnoVar = this.f7796pd) == null) {
            return;
        }
        pnoVar.ub();
    }

    private void ksc() {
        if (this.myk) {
            this.zvq = System.currentTimeMillis();
        }
        this.tlj.removeMessages(1);
        le leVar = this.yib;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public static /* synthetic */ boolean mwh(yu yuVar) {
        yuVar.kn = false;
        return false;
    }

    private int qbp() {
        if (!this.ex || this.ra.vt || this.mwh.get() || this.fqk) {
            return 0;
        }
        int iVt = vt(this.uq, this.ra.vt());
        this.ra.ouw(this.uq, iVt);
        if (this.uq < 0) {
            this.f7794le.k0(iVt);
            return iVt;
        }
        this.uq = iVt;
        return iVt;
    }

    private void tc() {
        if (this.zvq != 0) {
            pno pnoVar = this.f7796pd;
            if (pnoVar != null && od.vt(pnoVar.f7765le)) {
                int iCurrentTimeMillis = this.bs - ((int) ((System.currentTimeMillis() - this.zvq) / 1000));
                this.bs = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.bs = 0;
                }
            }
            this.zvq = 0L;
        }
        if (this.bs >= 0) {
            this.tlj.removeMessages(1);
            this.tlj.sendEmptyMessage(1);
        }
        le leVar = this.yib;
        if (leVar != null) {
            leVar.lh();
        }
    }

    public static /* synthetic */ boolean vm(yu yuVar) {
        yuVar.osn = false;
        return false;
    }

    private void vpp() {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.5
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                    return;
                }
                yu.this.mwh.set(false);
                if (!yu.this.ex) {
                    yu.this.ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_list_end_tip"));
                } else {
                    yu.this.ra.ouw("");
                    yu.jqy(yu.this);
                }
            }
        });
    }

    private static int vt(int i4, int i10) {
        if (i4 < 0) {
            i4 = 0;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 + 1073741823;
            if (i12 % i10 == i4) {
                return i12;
            }
            int i13 = 1073741823 - i11;
            if (i13 % i10 == i4) {
                return i13;
            }
        }
        return 1073741823;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno cf() {
        return this.f7796pd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean fkw() {
        return this.f7790cd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final List<com.bytedance.sdk.openadsdk.core.model.vpp> ko() {
        return this.ra.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void lh() {
        super.lh();
        this.ucs = true;
        pno pnoVar = this.f7796pd;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        ksc();
        this.yhj = this.yib != null;
        this.tlj.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int pno() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void rn() {
        if (this.wp) {
            return;
        }
        this.wp = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.pv;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.vt;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, vppVar, vppVar.vt(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.11
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int tlj() {
        return this.f7793jg.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean yu() {
        return this.uoy != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void zih() {
        super.zih();
        this.myk = true;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.activity.yu$yu, reason: collision with other inner class name */
    public static class C0067yu {

        /* renamed from: lh, reason: collision with root package name */
        public String f7809lh;
        public int ouw = 0;
        public com.bytedance.sdk.openadsdk.core.model.vpp vt;

        public C0067yu(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
            this.vt = vppVar;
        }

        public C0067yu(String str) {
            this.f7809lh = str;
        }
    }

    private void vt(pno pnoVar) {
        ArrayList<pno> arrayList = this.ra.ouw;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            pno pnoVar2 = arrayList.get(i4);
            i4++;
            pno pnoVar3 = pnoVar2;
            if (pnoVar3 != pnoVar) {
                pnoVar3.ouw(this.f7796pd, pnoVar, this.fvf);
            }
        }
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        if (fkwVar != null && fkwVar != pnoVar) {
            fkwVar.ouw(this.f7796pd, pnoVar, this.fvf);
        }
        pno pnoVar4 = this.f7796pd;
        this.f7796pd = pnoVar;
        if (pnoVar4 != null) {
            pnoVar4.ryl = false;
            pnoVar4.jg();
            pnoVar4.yu();
        }
        pnoVar.ryl = true;
        pnoVar.vt(this.ouw, new vt.fkw(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = pnoVar.ouw();
        if (blyVarOuw.getVisibility() != 0) {
            blyVarOuw.setVisibility(0);
        }
        if (blyVarOuw.getParent() == null) {
            this.f7791cf.addView(blyVarOuw, new FrameLayout.LayoutParams(-1, -1));
        }
        this.yu.lh(pnoVar);
        if (pnoVar.g_() != this.f7790cd) {
            pnoVar.ouw("card_sync");
        }
    }

    public static /* synthetic */ void jqy(yu yuVar) {
        if (yuVar.fqk) {
            return;
        }
        if (yuVar.ex) {
            yuVar.qbp();
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                        return;
                    }
                    yu.this.ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_list_end_tip"));
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Bundle bundle) throws JSONException {
        super.ouw(bundle);
        if (this.lso != null) {
            com.bytedance.sdk.openadsdk.core.cf.bly.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.bly.ouw(this.ouw);
            JSONObject jSONObject = this.lso;
            JSONObject jSONObjectVt = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.vt();
            JSONObject jSONObject2 = this.f7798ub;
            com.bytedance.sdk.openadsdk.core.cf.ra.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.ra.yu() { // from class: com.bytedance.sdk.openadsdk.activity.yu.9
                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
                public final void ouw(int i4, String str) {
                    yu.tc(yu.this);
                }

                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
                public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
                    View view = lhVar.fkw;
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    yu.this.mt = view;
                    if (yu.this.hun != null) {
                        yu.this.hun.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ouwVar.ouw(jSONObject, jSONObjectVt, jSONObject2, yuVar);
            } else {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.bly.ouw.1

                    /* renamed from: lh */
                    final /* synthetic */ JSONObject f8117lh;
                    final /* synthetic */ JSONObject ouw;
                    final /* synthetic */ JSONObject vt;
                    final /* synthetic */ yu yu;

                    public AnonymousClass1(JSONObject jSONObject3, JSONObject jSONObjectVt2, JSONObject jSONObject22, yu yuVar2) {
                        jSONObject = jSONObject3;
                        jSONObject = jSONObjectVt2;
                        jSONObject = jSONObject22;
                        yuVar = yuVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw(jSONObject, jSONObject, jSONObject, yuVar);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(final pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        long j;
        if (pnoVar != this.f7796pd) {
            return;
        }
        if (pnoVar.jae() || od.vt(pnoVar.f7765le)) {
            j = 500;
        } else {
            j = pnoVar.f7765le.ccd != null ? r6.ouw * 1000 : 0L;
        }
        le leVar = this.yib;
        if (leVar != null) {
            leVar.yu();
        }
        le leVar2 = new le(Math.max(500L, j)) { // from class: com.bytedance.sdk.openadsdk.activity.yu.7
            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
            public final void ouw() {
                if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                    return;
                }
                yu.ouw(yu.this, pnoVar);
            }
        };
        this.yib = leVar2;
        leVar2.fkw();
    }

    public static /* synthetic */ void zin(yu yuVar) {
        yuVar.fqk = false;
        yuVar.vpp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(boolean z3) {
        super.ouw(z3);
        pno pnoVar = this.f7796pd;
        if (pnoVar != null) {
            pnoVar.vt(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(Activity activity) {
        super.vt(activity);
        osn.ouw(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean ouw(pno pnoVar, int i4) {
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        return fkwVar != null && fkwVar == pnoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view) {
        super.ouw(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f7791cf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt() {
        super.vt();
        int i4 = 0;
        this.ucs = false;
        this.myk = false;
        pno pnoVar = this.f7796pd;
        if (pnoVar != null && !this.yhj) {
            pnoVar.lh();
        }
        if (this.pv == 0) {
            this.pv = SystemClock.elapsedRealtime();
        }
        tc();
        if (!this.ux && this.lso != null) {
            this.tlj.removeMessages(3);
            this.tlj.sendEmptyMessageDelayed(3, this.vpp * 1000);
        }
        ArrayList<Message> arrayList = this.f7797th;
        int size = arrayList.size();
        while (i4 < size) {
            Message message = arrayList.get(i4);
            i4++;
            handleMessage(message);
        }
        this.f7797th.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Activity activity) {
        super.ouw(activity);
        pno pnoVar = this.f7796pd;
        if (pnoVar != null) {
            pnoVar.vt(activity);
        }
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        if (fkwVar != null) {
            fkwVar.qbp();
        }
        ArrayList<pno> arrayList = this.ra.ouw;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            pno pnoVar2 = arrayList.get(i4);
            i4++;
            pnoVar2.qbp();
        }
        this.tlj.removeCallbacksAndMessages(null);
        le leVar = this.yib;
        if (leVar != null) {
            leVar.yu();
            this.yib = null;
        }
        pno pnoVar3 = this.f7796pd;
        if (pnoVar3 == null || pnoVar3.jqy() || this.vt.zn) {
            return;
        }
        jg.vt().post(new vt.lh(this.vt));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(pno pnoVar, int i4) {
        pno pnoVar2 = this.f7796pd;
        if (pnoVar != pnoVar2) {
            return;
        }
        if (i4 == 2) {
            ksc();
            return;
        }
        if (i4 != 1) {
            if (i4 == 3 || i4 == 4) {
                try {
                    pnoVar2.ksc().ex.zih();
                    return;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.yu("CardsLayoutManager", th2);
                    return;
                }
            }
            return;
        }
        FrameLayout frameLayout = this.hun;
        if (frameLayout != null && frameLayout.getParent() != null) {
            pno pnoVar3 = this.f7796pd;
            if (pnoVar3 instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar3).pd();
                return;
            }
            return;
        }
        tc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Map<String, Object> map, pno pnoVar) throws JSONException {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = pnoVar.ouw();
                ((JSONObject) jSONObject).put("width", blyVarOuw.getWidth());
                ((JSONObject) jSONObject).put("height", blyVarOuw.getHeight());
                int i4 = pnoVar.tlj;
                ((JSONObject) jSONObject).put("click_feed_top", i4 == this.pno.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i4 == this.ra.vt() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.bs);
                ((JSONObject) jSONObject).put("click_user_remaining", i4 == this.uq ? (SystemClock.elapsedRealtime() - this.f7792cj) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void ouw(yu yuVar) {
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = yuVar.uoy;
        if (fkwVar != null && fkwVar.od()) {
            yuVar.vt(yuVar.uoy);
            yuVar.f7791cf.removeView(yuVar.f7794le);
            yuVar.bly.setVisibility(8);
            yuVar.vm.setVisibility(8);
            return;
        }
        yuVar.yu.vt();
    }

    public static /* synthetic */ void ouw(yu yuVar, int i4, boolean z3) {
        int i10;
        String str;
        x1 x1VarJ = yuVar.f7794le.J(i4);
        if (x1VarJ == null || !(x1VarJ instanceof vt) || (i10 = yuVar.uq) == i4) {
            return;
        }
        if (i10 >= 0 && i4 >= 0 && i10 != i4) {
            if (z3) {
                str = "auto_down";
            } else {
                str = i4 > i10 ? "down" : "up";
            }
            final String str2 = str;
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - yuVar.f7792cj) / 1000;
            List<com.bytedance.sdk.openadsdk.core.model.vpp> listLh = yuVar.ra.lh();
            final int size = i10 % listLh.size();
            final int size2 = i4 % listLh.size();
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = listLh.get(size);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "slide", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.6
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() throws JSONException {
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
        yuVar.uq = i4;
        yuVar.f7792cj = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.activity.ouw ouwVar = ((vt) x1VarJ).vt;
        if (ouwVar != null) {
            yuVar.vt(ouwVar);
            yuVar.f7793jg.add(ouwVar.f7765le.tlj());
            if (yuVar.fqk && yuVar.tc > 0 && yuVar.uq >= yuVar.ra.ouw() - yuVar.tc) {
                yuVar.zin();
            }
            com.bytedance.sdk.openadsdk.activity.ouw ouwVarMwh = yuVar.mwh();
            if (ouwVarMwh != null) {
                if (!yuVar.ko && yuVar.pno.findLastVisibleItemPosition() >= yuVar.uq + 1) {
                    ouwVarMwh.f7766th = true;
                }
                yuVar.zih.add(Integer.valueOf(yuVar.uq + 1));
                ouwVarMwh.cd();
                yuVar.kn = false;
                return;
            }
            yuVar.kn = true;
        }
    }

    public static /* synthetic */ void ouw(yu yuVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        yuVar.fqk = false;
        List<com.bytedance.sdk.openadsdk.core.model.vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            ex exVar = ouwVar.f8252le;
            if (exVar != null) {
                yuVar.jvy = exVar.f8219cf;
                yuVar.fqk = exVar.tlj;
            }
            if (!yuVar.ko) {
                for (com.bytedance.sdk.openadsdk.core.model.vpp vppVar : ouwVar.yu) {
                    if (vppVar.f8309sd != null && com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = com.bytedance.sdk.openadsdk.core.model.vpp.ouw(((f1) CacheDirFactory.getICacheDir(vppVar.sm)).H(), vppVar);
                        vtVarOuw.ouw("material_meta", vppVar);
                        vtVarOuw.ouw("ad_slot", vppVar.yiz);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.activity.yu.3
                            @Override // w8.a
                            public final void ouw(a aVar, int i4) {
                            }

                            @Override // w8.a
                            public final void ouw(a aVar, int i4, String str) {
                            }
                        });
                    }
                }
            }
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                        return;
                    }
                    yu.this.mwh.set(false);
                    yu.this.ra.ouw("");
                    yu.this.ra.ouw(ouwVar.yu);
                    yu.jqy(yu.this);
                }
            });
            return;
        }
        lhVar.vt = -3;
        lhVar.ra = 1;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
        yuVar.vpp();
    }

    public static void ouw(yu yuVar, pno pnoVar) {
        x1 x1VarJ;
        pno pnoVar2 = yuVar.f7796pd;
        if (pnoVar == pnoVar2) {
            if (yuVar.osn) {
                if (yuVar.uq < yuVar.ra.ouw() - 1) {
                    int i4 = yuVar.uq;
                    int i10 = i4 + 1;
                    yuVar.rrs = i10;
                    if (yuVar.ko) {
                        yuVar.f7794le.n0(i10);
                    } else {
                        int iFindFirstVisibleItemPosition = yuVar.pno.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = yuVar.pno.findLastVisibleItemPosition();
                        if (i10 < iFindFirstVisibleItemPosition) {
                            yuVar.f7794le.n0(i10);
                        } else if (i10 <= iFindLastVisibleItemPosition) {
                            int i11 = i10 - iFindFirstVisibleItemPosition;
                            int childCount = yuVar.f7794le.getChildCount();
                            if (i11 > 0 && i11 < childCount && (x1VarJ = yuVar.f7794le.J(i4)) != null) {
                                yuVar.f7794le.m0(0, x1VarJ.itemView.getBottom(), false);
                            }
                        } else {
                            yuVar.f7794le.n0(yuVar.rrs);
                        }
                    }
                } else {
                    yuVar.rrs = 0;
                    yuVar.f7794le.k0(0);
                    yuVar.f7794le.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                                return;
                            }
                            yu yuVar2 = yu.this;
                            yu.ouw(yuVar2, yuVar2.rrs, true);
                        }
                    });
                }
            } else if (yuVar.yhj) {
                pnoVar2.lh();
            } else {
                pnoVar2.rrs();
            }
            yuVar.yib = null;
            yuVar.yhj = false;
        }
    }
}
