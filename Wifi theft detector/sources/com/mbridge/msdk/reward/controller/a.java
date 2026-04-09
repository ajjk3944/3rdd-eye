package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.cache.a;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.reward.adapter.b;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b0, reason: collision with root package name */
    public static String f16757b0 = "";

    /* renamed from: c0, reason: collision with root package name */
    public static String f16758c0;

    /* renamed from: d0, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f16759d0 = new ConcurrentHashMap<>();

    /* renamed from: e0, reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f16760e0 = new ConcurrentHashMap<>();

    /* renamed from: f0, reason: collision with root package name */
    public static ConcurrentHashMap<String, i> f16761f0 = new ConcurrentHashMap<>();
    private Queue<Integer> I;
    private String J;
    private CopyOnWriteArrayList<CampaignEx> S;
    private List<CampaignEx> T;

    /* renamed from: a, reason: collision with root package name */
    private Context f16762a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.reward.adapter.c f16764b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f16765c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f16766d;

    /* renamed from: e, reason: collision with root package name */
    private volatile InterVideoOutListener f16767e;

    /* renamed from: f, reason: collision with root package name */
    private volatile h f16768f;

    /* renamed from: g, reason: collision with root package name */
    private String f16769g;

    /* renamed from: h, reason: collision with root package name */
    private String f16770h;

    /* renamed from: i, reason: collision with root package name */
    private MBridgeIds f16771i;

    /* renamed from: j, reason: collision with root package name */
    g f16772j;

    /* renamed from: k, reason: collision with root package name */
    private String f16773k;

    /* renamed from: l, reason: collision with root package name */
    private volatile String f16774l;

    /* renamed from: m, reason: collision with root package name */
    private String f16775m;

    /* renamed from: q, reason: collision with root package name */
    private int f16779q;

    /* renamed from: r, reason: collision with root package name */
    private int f16780r;

    /* renamed from: s, reason: collision with root package name */
    private int f16781s;

    /* renamed from: x, reason: collision with root package name */
    private boolean f16786x;

    /* renamed from: n, reason: collision with root package name */
    private int f16776n = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f16778p = 2;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16782t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16783u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16784v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16785w = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f16787y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f16788z = "";
    private String A = "";
    private ArrayList<Integer> B = new ArrayList<>(7);
    private boolean C = false;
    private final Object D = new Object();
    public boolean E = false;
    int F = 25;
    int G = 1;
    private List<CampaignEx> H = new ArrayList();
    private com.mbridge.msdk.foundation.db.g K = null;
    private volatile boolean L = true;
    private volatile boolean M = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private volatile boolean Q = false;
    private volatile boolean R = false;
    volatile boolean U = false;
    volatile boolean V = false;
    volatile boolean W = false;
    volatile boolean X = false;
    volatile boolean Y = false;
    private JSONArray Z = new JSONArray();

    /* renamed from: a0, reason: collision with root package name */
    private int f16763a0 = 1;

    /* renamed from: o, reason: collision with root package name */
    private Handler f16777o = new com.mbridge.msdk.reward.controller.b(this);

    /* renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    public class C0302a implements com.mbridge.msdk.videocommon.net.c {
        public C0302a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    public class c implements b.n {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f16809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16810b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f16811c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f16812d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f16813e;

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z10, int i10) {
            this.f16810b = campaignEx;
            this.f16811c = copyOnWriteArrayList;
            this.f16812d = z10;
            this.f16813e = i10;
            this.f16809a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.j().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (bVar != null) {
                bVar.c("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f16809a == null) {
                this.f16809a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f16809a.b(this.f16811c);
            this.f16809a.a(bVar);
            if (!this.f16812d && a.this.f16768f != null) {
                if (a.this.X) {
                    return;
                }
                a.this.X = true;
                a.this.f16768f.b(bVar, this.f16809a);
                return;
            }
            if (this.f16813e != 1 || a.this.X || a.this.f16768f == null) {
                return;
            }
            a.this.X = true;
            a.this.f16768f.b(bVar, this.f16809a);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.K == null) {
                    a.this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.K);
                if (hVarA != null) {
                    hVarA.b(a.this.f16770h);
                }
            } catch (Throwable unused) {
                q0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f16828a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16829b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16830c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16831d = false;

        /* renamed from: e, reason: collision with root package name */
        private int f16832e;

        /* renamed from: f, reason: collision with root package name */
        private String f16833f;

        /* renamed from: g, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.report.metrics.c f16834g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i10, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f16828a = cVar;
            this.f16829b = i10;
            this.f16830c = z10;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f16833f = str;
            this.f16834g = cVar2;
        }

        public void a() {
            this.f16831d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16831d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f16828a;
            if (cVar != null) {
                cVar.c(true);
            }
            q0.b("RewardVideoController", "adSource=" + this.f16829b + " CommonCancelTimeTask mIsDevCall：" + this.f16830c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.f16834g);
        }

        public void a(int i10) {
            this.f16832e = i10;
        }
    }

    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f16836a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16837b;

        /* renamed from: c, reason: collision with root package name */
        private f f16838c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z10) {
            this.f16836a = cVar;
            this.f16837b = z10;
        }

        public void a(f fVar) {
            this.f16838c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f16838c;
            if (fVar != null) {
                fVar.a();
                a.this.f16777o.removeCallbacks(this.f16838c);
            }
            if (a.this.f16768f != null) {
                a.this.f16768f.a(a.this.f16774l, a.this.f16770h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f16838c;
            if (fVar != null) {
                fVar.a();
                a.this.f16777o.removeCallbacks(this.f16838c);
            }
            a.this.a(list);
            if (a.this.f16768f != null) {
                if (list != null && list.size() == 1) {
                    CampaignEx campaignEx = list.get(0);
                    if (!com.mbridge.msdk.foundation.same.c.a(a.this.f16762a, campaignEx) && campaignEx.getFilterAdsVideoCallState() == 0) {
                        if (a.this.f16763a0 <= 1) {
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception second");
                            if (cVar != null) {
                                cVar.a(bVarA);
                                cVar.b(true);
                            }
                            a.this.f16768f.a(bVarA, cVar);
                            return;
                        }
                        a.m(a.this);
                        return;
                    }
                }
                a.this.f16768f.c(a.this.f16774l, a.this.f16770h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.f16838c;
            if (fVar != null) {
                fVar.a();
                a.this.f16777o.removeCallbacks(this.f16838c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f16836a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f16836a = null;
            }
            a.this.a(list);
            if (a.this.f16768f != null) {
                a.this.f16768f.a(bVar, cVar);
            }
        }
    }

    public final class h {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f16840a;

        /* renamed from: b, reason: collision with root package name */
        private volatile AtomicInteger f16841b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f16842c;

        /* renamed from: d, reason: collision with root package name */
        private String f16843d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16844e;

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0302a c0302a) {
            this(interVideoOutListener, handler, str);
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f16842c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f16841b.get() == 2 || this.f16842c == null) {
                return;
            }
            a.m(a.this);
            this.f16841b.set(2);
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f16842c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.f16842c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f16841b.get() == 2 || this.f16842c == null) {
                return;
            }
            if (this.f16841b.get() == 1) {
                this.f16841b.set(3);
            }
            if (a.this.O) {
                return;
            }
            a.this.O = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.H);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.t());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.f16842c.sendMessage(messageObtain);
            }
            if (a.this.P) {
                this.f16841b.set(2);
            }
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f16840a = new WeakReference<>(interVideoOutListener);
            this.f16841b = new AtomicInteger(0);
            this.f16842c = handler;
            this.f16843d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f16842c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f16842c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.f16841b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i10) {
            this.f16841b.set(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.f16841b.get() != 1 && this.f16841b.get() != 3) || this.f16842c == null || a.this.N) {
                return;
            }
            a.this.N = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.t());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.f16842c.sendMessage(messageObtain);
                if (s0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.f16842c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.t());
                    messageObtain.setData(bundle);
                }
                this.f16842c.sendMessage(messageObtain);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.mbridge.msdk.foundation.error.b r12, com.mbridge.msdk.foundation.same.report.metrics.c r13) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.h.a(com.mbridge.msdk.foundation.error.b, com.mbridge.msdk.foundation.same.report.metrics.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strL;
            WeakReference<InterVideoOutListener> weakReference = this.f16840a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.f16841b.get() == 2 || this.f16842c == null) {
                return;
            }
            a.this.Q = true;
            if (bVar != null) {
                strL = bVar.l();
            } else {
                strL = "";
            }
            if (strL.contains("resource load timeout")) {
                a.this.P = true;
            }
            if (a.this.Q && a.this.P && !a.this.O) {
                this.f16841b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strL;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.t());
                        messageObtain.setData(bundle);
                    }
                    this.f16842c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f16841b.set(2);
            b(str, cVar);
        }

        public void a(boolean z10) {
            this.f16844e = z10;
        }
    }

    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {

        /* renamed from: c, reason: collision with root package name */
        private a f16846c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f16847d;

        /* renamed from: e, reason: collision with root package name */
        private int f16848e;

        /* renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        public class RunnableC0309a implements Runnable {
            public RunnableC0309a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f16846c != null) {
                    i.this.f16846c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.f16782t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, a.this.f16770h, true, 1));
                }
            }
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0302a c0302a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.f16846c;
                if (aVar == null || aVar.f16767e == null) {
                    return;
                }
                try {
                    this.f16846c.f16767e.onVideoComplete(a.this.f16771i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f16848e = 5;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        public void e() {
            a.this.B.clear();
            this.f16846c = null;
        }

        private i(a aVar, Handler handler) {
            this.f16848e = 0;
            this.f16846c = aVar;
            this.f16847d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.E = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(a.this.f16770h, a.this.f16782t);
                a aVar2 = this.f16846c;
                aVar.a(cVar.t(), (aVar2 == null || aVar2.f16764b == null) ? "" : this.f16846c.f16764b.H, 3, a.f16757b0);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
            try {
                a aVar3 = this.f16846c;
                if (aVar3 != null) {
                    aVar3.C = true;
                    if (this.f16846c.f16764b != null) {
                        this.f16846c.f16764b.H = "";
                    }
                    this.f16846c.q();
                    if (a.this.f16783u) {
                        a.this.a();
                    }
                    a aVar4 = a.this;
                    aVar4.a("2000130", cVar, aVar4.f16767e, "");
                    b();
                    if (this.f16846c.f16767e != null) {
                        this.f16846c.f16767e.onAdShow(a.this.f16771i);
                        this.f16848e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.f16846c;
                if (aVar != null && aVar.f16767e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.f16846c.f16775m);
                    }
                    if (a.this.f16783u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.f16770h, a.this.m());
                    }
                    this.f16846c.f16767e.onAdClose(a.this.f16771i, new RewardInfo(z10, cVar2.c(), String.valueOf(cVar2.a())));
                    this.f16848e = 7;
                    this.f16846c.C = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.E = false;
                if (this.f16846c != null) {
                    if (aVar.f16783u) {
                        a.this.a();
                    }
                    this.f16846c.C = false;
                    a.this.a("2000131", cVar, this.f16846c.f16767e, str);
                    a();
                    if (this.f16846c.f16767e != null) {
                        try {
                            this.f16846c.f16767e.onShowFail(cVar, a.this.f16771i, str);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f16848e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f16848e = 0;
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, String str, String str2) {
            try {
                a aVar = this.f16846c;
                if (aVar == null || aVar.f16767e == null) {
                    return;
                }
                if (a.this.f16783u) {
                    a.this.a();
                }
                this.f16846c.C = false;
                try {
                    this.f16846c.f16767e.onVideoAdClicked(z10, a.this.f16771i);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z10, int i10) {
            try {
                a aVar = this.f16846c;
                if (aVar == null || aVar.f16767e == null) {
                    return;
                }
                try {
                    this.f16846c.f16767e.onAdCloseWithIVReward(a.this.f16771i, new RewardInfo(z10, i10));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.f16846c;
                if (aVar == null || aVar.f16767e == null) {
                    return;
                }
                try {
                    this.f16846c.f16767e.onEndcardShow(a.this.f16771i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
                this.f16848e = 6;
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e11.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i10, String str, String str2) {
            this.f16848e = i10;
            a aVar = this.f16846c;
            if (aVar == null || aVar.f16783u || this.f16846c.f16782t || this.f16846c.f16765c == null || !this.f16846c.f16765c.a(this.f16848e) || this.f16846c.f16768f == null || this.f16846c.f16768f.a() == 1 || this.f16846c.f16768f.a() == 3 || a.this.B.contains(Integer.valueOf(this.f16848e))) {
                return;
            }
            a.this.B.add(Integer.valueOf(this.f16848e));
            int iF = this.f16846c.f16765c.f() * 1000;
            if (this.f16848e == 4) {
                iF = 3000;
            }
            Handler handler = this.f16847d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.f16847d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0309a(), iF);
            }
        }
    }

    public class j {
        public j() {
        }

        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f16763a0++;
            a aVar = a.this;
            aVar.b(aVar.f16786x, str, cVar);
        }
    }

    public static /* synthetic */ int m(a aVar) {
        int i10 = aVar.f16763a0;
        aVar.f16763a0 = i10 - 1;
        return i10;
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f16762a)).b(this.f16770h);
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f16762a)).c(this.f16770h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.f16770h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        com.mbridge.msdk.videocommon.a.e(this.f16770h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().j());
                    }
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    public void f(boolean z10) {
        this.f16787y = z10;
    }

    public MBridgeIds g() {
        return this.f16771i;
    }

    public List<CampaignEx> h() {
        return this.T;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.S;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f16764b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f16768f;
    }

    public String l() {
        return this.f16774l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.f16764b;
        return cVar != null ? cVar.a(this.C) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.f16764b;
    }

    public InterVideoOutListener o() {
        return this.f16767e;
    }

    public String p() {
        return this.f16770h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.f16783u;
    }

    public boolean s() {
        return this.f16786x;
    }

    public boolean t() {
        return this.f16782t;
    }

    public boolean u() {
        return (this.f16767e == null || this.f16768f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.C || (concurrentHashMap = f16760e0) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        f16760e0.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z10);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(v0.d());
            } else {
                strA = a(str);
            }
            this.A = strA;
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e10) {
                    e = e10;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e.getMessage());
                    }
                    return cVar;
                }
            }
            cVar2.i(strA);
            cVar2.n(this.f16770h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.h(str2);
                    if (str2.equals("1")) {
                        cVar2.g(str);
                    }
                }
            }
            cVar2.f(z10 ? "2" : "1");
            if (z10) {
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            }
            return cVar2;
        } catch (Exception e11) {
            e = e11;
            cVar = cVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.O) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th) {
                q0.b("RewardVideoController", th.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f16762a, this.f16774l, this.f16770h);
        this.f16764b = cVar;
        cVar.d(this.f16782t);
        this.f16764b.e(this.f16783u);
        if (this.f16782t) {
            this.f16764b.a(this.f16779q, this.f16780r, this.f16781s);
        }
        this.f16764b.a(this.f16765c);
    }

    public void d(boolean z10) {
        this.f16782t = z10;
        if (z10) {
            this.f16778p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.f16778p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e(boolean z10) {
        this.f16783u = z10;
    }

    public class d implements b.n {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f16815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f16817c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f16818d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f16819e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f16820f;

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z10, int i10) {
            this.f16816b = campaignEx;
            this.f16817c = copyOnWriteArrayList;
            this.f16818d = cVar;
            this.f16819e = z10;
            this.f16820f = i10;
            this.f16815a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.V = true;
            if (!a.this.U || a.this.W || a.this.f16777o == null) {
                return;
            }
            a.this.W = true;
            a.this.f16777o.post(new RunnableC0307a(str3, str, str2));
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.j().getUnitId();
                bVar.c("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.T);
            if (this.f16815a == null) {
                this.f16815a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f16815a.a(bVar);
            this.f16815a.b(this.f16817c);
            a.this.V = false;
            if (a.this.f16768f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            a.this.f16768f.b(bVar, this.f16815a);
        }

        /* renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        public class RunnableC0307a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f16823b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16824c;

            public RunnableC0307a(String str, String str2, String str3) {
                this.f16822a = str;
                this.f16823b = str2;
                this.f16824c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z10 = a.this.f16787y;
                Handler handler = a.this.f16777o;
                boolean z11 = a.this.f16782t;
                boolean z12 = a.this.f16783u;
                String str = this.f16822a;
                String requestIdNotice = d.this.f16816b.getRequestIdNotice();
                String str2 = this.f16823b;
                String str3 = this.f16824c;
                String cMPTEntryUrl = d.this.f16816b.getCMPTEntryUrl();
                int i10 = a.this.f16778p;
                d dVar = d.this;
                bVarB.a(z10, handler, z11, z12, str, requestIdNotice, str2, str3, cMPTEntryUrl, i10, dVar.f16816b, dVar.f16817c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.f16816b.getCMPTEntryUrl()), this.f16824c, a.this.f16765c, new C0308a(), true);
            }

            /* renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            public class C0308a implements b.o {
                public C0308a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0347a c0347a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.f16818d;
                    if (cVar != null && cVar.a(dVar.f16817c, dVar.f16819e, dVar.f16820f)) {
                        if (a.this.f16768f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.f16817c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f16815a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.f16817c);
                        }
                        a.this.f16768f.d(str2, str3, d.this.f16815a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f16815a == null) {
                        dVar4.f16815a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f16815a.b(dVar5.f16817c);
                    d.this.f16815a.a(bVarA);
                    a.this.f16768f.b(bVarA, d.this.f16815a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0347a c0347a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0307a runnableC0307a = RunnableC0307a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0307a.f16824c, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f16815a == null) {
                        dVar.f16815a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f16815a.b(dVar2.f16817c);
                    d.this.f16815a.a(bVar);
                    a.this.f16768f.b(bVar, d.this.f16815a);
                }
            }
        }
    }

    public void e() {
        o0.b();
    }

    private boolean d() {
        if (this.f16764b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.f16764b;
        if (cVar != null) {
            return cVar.b(true);
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f16762a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.f16770h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.f16774l = str;
            this.f16771i = new MBridgeIds(this.f16774l, this.f16770h);
            this.f16766d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f16762a, this.f16770h));
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th) {
            q0.b("RewardVideoController", th.getMessage(), th);
        }
    }

    public void a(int i10) {
        this.f16778p = i10;
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.n(this.f16770h);
            cVar.a(this.f16782t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            y0.b(this.f16762a, "MBridge_ConfirmTitle" + this.f16770h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            y0.b(this.f16762a, "MBridge_ConfirmContent" + this.f16770h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            y0.b(this.f16762a, "MBridge_CancelText" + this.f16770h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        y0.b(this.f16762a, "MBridge_ConfirmText" + this.f16770h, str3.trim());
    }

    public class b implements b.h {

        /* renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f16790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f16792c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f16793d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f16794e;

        public b(CampaignEx campaignEx, boolean z10, com.mbridge.msdk.reward.adapter.c cVar, int i10) {
            this.f16791b = campaignEx;
            this.f16792c = z10;
            this.f16793d = cVar;
            this.f16794e = i10;
            this.f16790a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.U = true;
            if (this.f16792c) {
                if (!a.this.V || a.this.W || a.this.f16777o == null) {
                    return;
                }
                a.this.W = true;
                a.this.f16777o.post(new RunnableC0305b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().j()) || next.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.f16777o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.f16793d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.f16792c, this.f16794e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.T);
                        if (a.this.f16768f != null && !a.this.X) {
                            a.this.X = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f16790a == null) {
                                this.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f16790a.b(a.this.S);
                            this.f16790a.a(bVarA);
                            a.this.f16768f.b(bVarA, this.f16790a);
                        }
                    } else if (a.this.f16768f != null && !a.this.Y) {
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f16790a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f16768f.d(str, str2, this.f16790a);
                    }
                } else {
                    a.this.f16777o.post(new RunnableC0303a(next, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        public class RunnableC0303a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f16796a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f16797b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16798c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16799d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f16800e;

            public RunnableC0303a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f16796a = campaignEx;
                this.f16797b = copyOnWriteArrayList;
                this.f16798c = str;
                this.f16799d = str2;
                this.f16800e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f16787y, a.this.f16777o, a.this.f16782t, a.this.f16783u, null, this.f16796a.getRewardTemplateMode().j(), a.this.f16778p, b.this.f16791b, this.f16797b, H5DownLoadManager.getInstance().getH5ResAddress(this.f16796a.getRewardTemplateMode().j()), this.f16798c, this.f16799d, this.f16800e, this.f16796a.getRequestIdNotice(), a.this.f16765c, new C0304a());
            }

            /* renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            public class C0304a implements b.o {
                public C0304a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0347a c0347a) {
                    RunnableC0303a runnableC0303a = RunnableC0303a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f16793d;
                    if (cVar != null && cVar.a(runnableC0303a.f16797b, bVar.f16792c, bVar.f16794e)) {
                        if (a.this.f16768f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        RunnableC0303a runnableC0303a2 = RunnableC0303a.this;
                        a.this.a(runnableC0303a2.f16797b);
                        a.this.f16768f.d(str2, str3, b.this.f16790a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f16790a == null) {
                        bVar2.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0303a runnableC0303a3 = RunnableC0303a.this;
                    b.this.f16790a.b(runnableC0303a3.f16797b);
                    b.this.f16790a.a(bVarA);
                    a.this.f16768f.b(bVarA, b.this.f16790a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0347a c0347a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0303a runnableC0303a = RunnableC0303a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0303a.f16799d, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    bVar.c("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f16790a == null) {
                        bVar2.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f16790a.b(a.this.S);
                    b.this.f16790a.a(bVar);
                    a.this.f16768f.b(bVar, b.this.f16790a);
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        public class RunnableC0305b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16803a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f16804b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16805c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f16806d;

            public RunnableC0305b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f16803a = str;
                this.f16804b = str2;
                this.f16805c = str3;
                this.f16806d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.f16787y, a.this.f16777o, a.this.f16782t, a.this.f16783u, this.f16803a, b.this.f16791b.getRequestIdNotice(), this.f16804b, this.f16805c, b.this.f16791b.getCMPTEntryUrl(), a.this.f16778p, b.this.f16791b, this.f16806d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.f16791b.getCMPTEntryUrl()), this.f16805c, a.this.f16765c, new C0306a(), true);
            }

            /* renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            public class C0306a implements b.o {
                public C0306a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, a.C0347a c0347a) {
                    RunnableC0305b runnableC0305b = RunnableC0305b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.f16793d;
                    if (cVar != null && cVar.a(runnableC0305b.f16806d, bVar.f16792c, bVar.f16794e)) {
                        if (a.this.f16768f == null || a.this.Y) {
                            return;
                        }
                        a.this.Y = true;
                        q0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0305b runnableC0305b2 = RunnableC0305b.this;
                        a.this.a(runnableC0305b2.f16806d);
                        RunnableC0305b runnableC0305b3 = RunnableC0305b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f16790a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0305b3.f16806d);
                        }
                        a.this.f16768f.d(str2, str3, b.this.f16790a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f16790a == null) {
                        bVar2.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f16790a.a(bVarA);
                    RunnableC0305b runnableC0305b4 = RunnableC0305b.this;
                    b.this.f16790a.b(runnableC0305b4.f16806d);
                    a.this.f16768f.b(bVarA, b.this.f16790a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, a.C0347a c0347a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0305b runnableC0305b = RunnableC0305b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0305b.f16805c, (List<CampaignEx>) aVar.T);
                    if (a.this.f16768f == null || a.this.X) {
                        return;
                    }
                    a.this.X = true;
                    if (bVar != null) {
                        bVar.c("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f16790a == null) {
                        bVar2.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0305b runnableC0305b2 = RunnableC0305b.this;
                    b.this.f16790a.b(runnableC0305b2.f16806d);
                    b.this.f16790a.a(bVar);
                    a.this.f16768f.b(bVar, b.this.f16790a);
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.U = false;
            a aVar = a.this;
            aVar.c(aVar.f16770h, (List<CampaignEx>) a.this.T);
            if (a.this.f16768f == null || a.this.X) {
                return;
            }
            a.this.X = true;
            if (this.f16790a == null) {
                this.f16790a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f16790a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.c("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f16790a.a(bVar);
            a.this.f16768f.b(bVar, this.f16790a);
        }
    }

    public boolean c(boolean z10) {
        try {
            if (c()) {
                if (z10) {
                    d("is_ready_start", "over cap check error");
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 10);
                    cVar.a("m_offer_ready", eVar);
                    a(false, cVar, (List<CampaignEx>) this.f16764b.h());
                }
            } else if (this.f16783u) {
                try {
                    return a(z10);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            } else {
                return d();
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", th.getMessage());
            }
        }
        return false;
    }

    public void a(int i10, int i11, int i12) throws JSONException {
        this.f16779q = i10;
        this.f16780r = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.K) {
            this.f16781s = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f16781s = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.mbridge.msdk.setting.h.b().i(this.f16770h, jSONObject.toString());
        } catch (Exception unused) {
            q0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f16768f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f16768f.a(strB, cVar);
        }
    }

    private boolean c() {
        try {
            if (this.K == null) {
                this.K = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.K);
            if (this.f16765c == null) {
                this.f16765c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f16770h, this.f16782t);
            }
            int iK = this.f16765c.k();
            if (hVarA != null) {
                return hVarA.a(this.f16770h, iK);
            }
            return false;
        } catch (Throwable unused) {
            q0.b("RewardVideoController", "cap check error");
            return false;
        }
    }

    public static void a(String str, int i10) {
        try {
            if (f16759d0 == null || !a1.b(str)) {
                return;
            }
            f16759d0.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f16770h, str, vcn);
                        return copyOnWriteArrayList;
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = f16760e0) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        f16760e0.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.f16771i;
            if (mBridgeIds != null) {
                if (!this.C) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = f16760e0;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(f16760e0.get(strM))) {
                    str = f16760e0.get(strM);
                }
                this.f16771i.setBidToken(str);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.f16767e = interVideoOutListener;
        this.f16768f = new h(this, interVideoOutListener, this.f16777o, this.f16770h, null);
    }

    public void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z10, "", eVar);
    }

    public void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a aVar;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z10, str, eVar);
        this.f16788z = str;
        if (this.f16768f == null) {
            aVar = this;
            aVar.f16768f = new h(aVar, null, this.f16777o, this.f16770h, null);
        } else {
            aVar = this;
        }
        if (aVar.f16768f != null && aVar.f16768f.a() == 1) {
            a(z10, cVarB);
            return;
        }
        aVar.f16763a0 = 1;
        if (aVar.f16768f != null && aVar.f16768f.a() == 3) {
            aVar.L = false;
        } else {
            aVar.L = true;
            if (aVar.f16768f != null) {
                aVar.f16768f.a(1);
            }
        }
        aVar.f16786x = z10;
        aVar.f16777o.removeMessages(1001001);
        aVar.O = false;
        aVar.N = false;
        aVar.P = false;
        aVar.Q = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (aVar.f16782t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(aVar.f16774l, aVar.f16770h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(aVar.f16774l, aVar.f16770h);
                }
            }
            if (aVar.f16783u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f16770h);
            aVar.f16765c = cVarC;
            if (cVarC == null) {
                aVar.J = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(aVar.J, com.mbridge.msdk.foundation.controller.c.n().c(), aVar.f16770h, new C0302a());
                aVar.f16765c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), aVar.f16770h, aVar.f16782t);
            }
            if (!TextUtils.isEmpty(aVar.f16774l)) {
                aVar.f16765c.f(aVar.f16774l);
            }
            int iN = aVar.f16765c.n() * 1000;
            if (aVar.f16777o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.t());
                    messageObtain.setData(bundle);
                }
                aVar.f16777o.sendMessageDelayed(messageObtain, iN);
            }
            aVar.I = aVar.f16765c.z();
            try {
                a(z10, str, cVarB);
            } catch (Exception e10) {
                if (aVar.f16768f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    aVar.f16768f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardVideoController", e10.getMessage());
                }
            }
        } catch (Exception e11) {
            if (aVar.f16768f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                aVar.f16768f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.f16764b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f16762a, this.f16774l, str);
                this.f16764b = cVar2;
                cVar2.d(this.f16782t);
                this.f16764b.e(this.f16783u);
            }
            this.f16764b.a(this.f16778p);
            this.f16764b.a(this.f16765c);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.f16783u);
        this.T = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.f16783u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
            if (copyOnWriteArrayList == null) {
                this.S = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.S.add(campaignEx);
            }
            a(this.S);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043 A[Catch: Exception -> 0x00e5, TRY_ENTER, TryCatch #2 {Exception -> 0x00e5, blocks: (B:3:0x002c, B:11:0x005c, B:14:0x006b, B:19:0x008f, B:10:0x0043), top: B:39:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r9, java.lang.String r10, com.mbridge.msdk.foundation.same.report.metrics.c r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.b(boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f16768f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f16768f.a("bidToken is empty", cVar);
        }
    }

    private boolean b() {
        if (this.f16764b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f16770h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.f16764b.c(cVar.a());
                this.f16764b.b(cVar.d());
                if (this.f16764b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().d(this.f16770h, cVar.a());
            }
        }
        return false;
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.f16786x) {
            if (z10) {
                this.f16786x = z10;
            }
        } else if (z10) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f16768f.b(strB, cVar);
        }
    }

    private void b(boolean z10) {
        List<String> listE;
        if (z10) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f16762a));
                if (eVarA != null && (listE = eVarA.e(this.f16770h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().d(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().E()) {
                        it2.remove();
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private void a(boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.reward.candidate.a aVar;
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.reward.candidate.a aVar2;
        com.mbridge.msdk.foundation.cache.c cVar3;
        String str2 = str;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar4 = cVar;
        if (this.f16768f != null) {
            if (!this.f16783u) {
                this.R = b(this.f16770h, cVar4.t());
                if (this.R) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.S;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("cache", 1);
                            cVar4.a("2000127", eVar);
                            cVar4.a("2000048", eVar);
                            cVar4.a(copyOnWriteArrayList);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardVideoController", e10.getMessage());
                            }
                        }
                        this.f16768f.b(this.f16774l, this.f16770h, cVar4);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f16768f.a(this.f16783u);
                        com.mbridge.msdk.reward.adapter.c cVar5 = this.f16764b;
                        if (cVar5 != null && cVar5.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f16768f.d(this.f16774l, this.f16770h, cVar4);
                        } else {
                            a(copyOnWriteArrayList, this.f16764b);
                        }
                        if (this.L) {
                            com.mbridge.msdk.reward.adapter.c cVar6 = this.f16764b;
                            if (cVar6 != null) {
                                cVar6.c(this.S);
                            }
                            a(this.I, z10, str2, cVar4);
                            return;
                        }
                        return;
                    }
                    q0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.S;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.S.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.f16770h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar7 = this.f16764b;
                    if (cVar7 != null) {
                        cVar7.c(this.S);
                    }
                    if (z10) {
                        if (this.f16768f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar4.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar4.b(true);
                            this.f16768f.a(strB, cVar4);
                            return;
                        }
                        return;
                    }
                    this.R = false;
                    this.f16768f.a(this.f16783u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                if (!c()) {
                    this.R = false;
                    com.mbridge.msdk.reward.adapter.c cVar8 = this.f16764b;
                    if (cVar8 != null) {
                        cVar8.c(this.S);
                    }
                    this.f16768f.a(this.f16783u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                if (z10) {
                    if (this.f16768f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar4.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar4.b(true);
                        this.f16768f.a(strB2, cVar4);
                        return;
                    }
                    return;
                }
                this.R = false;
                com.mbridge.msdk.reward.adapter.c cVar9 = this.f16764b;
                if (cVar9 != null) {
                    cVar9.c(this.S);
                }
                this.f16768f.a(this.f16783u);
                a(this.I, z10, str2, cVar4);
                return;
            }
            List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.f16770h, 1, this.f16783u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = null;
            if (listB != null && listB.size() > 0) {
                if (!c()) {
                    if (this.f16764b == null) {
                        f();
                    }
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str2, listB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str2, cVar4);
                        return;
                    }
                    try {
                        aVar2 = new com.mbridge.msdk.reward.candidate.a(this.f16770h, this.f16782t);
                        cVar3 = new com.mbridge.msdk.foundation.cache.c();
                        try {
                            if (aVar2.a(str2)) {
                                cVar3 = aVar2.a(str2, cVar4, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f16764b);
                                if (cVar3 != null && cVar3.g() == com.mbridge.msdk.foundation.cache.c.f14684l && cVar3.c() != null && cVar3.c().size() > 0 && this.f16764b != null) {
                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar3.c();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator<CampaignEx> it2 = listB.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next = it2.next();
                                        if (next != null) {
                                            String requestId = next.getRequestId();
                                            if (!TextUtils.isEmpty(requestId)) {
                                                for (int i10 = 0; i10 < copyOnWriteArrayListC.size(); i10++) {
                                                    CampaignEx campaignEx2 = copyOnWriteArrayListC.get(i10);
                                                    if (campaignEx2 != null) {
                                                        if (requestId.equals(campaignEx2.getRequestId())) {
                                                            break;
                                                        } else if (i10 == copyOnWriteArrayListC.size() - 1) {
                                                            arrayList.add(next);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC.size() == 0) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        }
                                    }
                                    this.f16764b.c(arrayList);
                                    this.f16764b.a(cVar3.c(), false, true, true);
                                    copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar3.c());
                                }
                            } else {
                                copyOnWriteArrayListB = b(str2, listB);
                                if (copyOnWriteArrayListB.size() > 0) {
                                    com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                                }
                                cVar3.d("cb is closed");
                                cVar3.a(com.mbridge.msdk.foundation.cache.c.f14683k);
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cVar4 = cVar;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    try {
                        aVar2.a(cVar, str2, cVar3, (List<a.b>) null, (JSONObject) null, 1);
                        cVar4 = cVar;
                        str2 = str2;
                        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                            a(copyOnWriteArrayListB, str2, cVar4);
                            if (this.f16764b != null && !aVar2.a(str2)) {
                                this.f16764b.c(copyOnWriteArrayListB);
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                        cVar4 = cVar;
                        str2 = str2;
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardVideoController", e.getMessage());
                        }
                        this.R = false;
                        this.f16768f.a(this.f16783u);
                        a(this.I, z10, str2, cVar4);
                        return;
                    }
                    this.R = false;
                    this.f16768f.a(this.f16783u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().b(this.f16770h, str2);
                if (!z10 || this.f16768f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar4 != null) {
                    cVar4.a(bVarA);
                    cVar4.b(true);
                }
                this.f16768f.a(strB3, cVar4);
                return;
            }
            if (!c()) {
                try {
                    aVar = new com.mbridge.msdk.reward.candidate.a(this.f16770h, this.f16782t);
                    cVar2 = new com.mbridge.msdk.foundation.cache.c();
                    try {
                        if (aVar.a(str2)) {
                            if (this.f16764b == null) {
                                com.mbridge.msdk.reward.adapter.c cVar10 = new com.mbridge.msdk.reward.adapter.c(this.f16762a, this.f16774l, this.f16770h);
                                this.f16764b = cVar10;
                                cVar10.d(this.f16782t);
                                this.f16764b.e(this.f16783u);
                                if (this.f16782t) {
                                    this.f16764b.a(this.f16779q, this.f16780r, this.f16781s);
                                }
                                this.f16764b.a(this.f16778p);
                                this.f16764b.a(this.f16765c);
                            }
                            cVar2 = aVar.a(str2, cVar4, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.f16764b);
                            if (cVar2 != null && cVar2.g() == com.mbridge.msdk.foundation.cache.c.f14684l && cVar2.c() != null && cVar2.c().size() > 0 && this.f16764b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar2.c();
                                if (listB != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator<CampaignEx> it3 = listB.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        CampaignEx next2 = it3.next();
                                        if (next2 != null) {
                                            String requestId2 = next2.getRequestId();
                                            if (!TextUtils.isEmpty(requestId2)) {
                                                for (int i11 = 0; i11 < copyOnWriteArrayListC2.size(); i11++) {
                                                    CampaignEx campaignEx3 = copyOnWriteArrayListC2.get(i11);
                                                    if (campaignEx3 != null) {
                                                        if (requestId2.equals(campaignEx3.getRequestId())) {
                                                            break;
                                                        } else if (i11 == copyOnWriteArrayListC2.size() - 1) {
                                                            arrayList2.add(next2);
                                                        }
                                                    }
                                                }
                                                if (copyOnWriteArrayListC2.size() == 0) {
                                                    arrayList2.add(next2);
                                                }
                                            }
                                        }
                                    }
                                    this.f16764b.c(arrayList2);
                                }
                                this.f16764b.a(cVar2.c(), false, true, true);
                                copyOnWriteArrayListB = new CopyOnWriteArrayList<>(cVar2.c());
                            }
                        } else {
                            copyOnWriteArrayListB = b(str2, listB);
                            if (copyOnWriteArrayListB.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str2, copyOnWriteArrayListB);
                            }
                            cVar2.d("cb is closed 2");
                            cVar2.a(com.mbridge.msdk.foundation.cache.c.f14683k);
                        }
                    } catch (Exception e14) {
                        e = e14;
                        cVar4 = cVar;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
                try {
                    aVar.a(cVar, str2, cVar2, (List<a.b>) null, (JSONObject) null, 1);
                    cVar4 = cVar;
                    str2 = str2;
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        a(copyOnWriteArrayListB, str2, cVar4);
                        if (this.f16764b != null && !aVar.a(str2)) {
                            this.f16764b.c(copyOnWriteArrayListB);
                        }
                    }
                } catch (Exception e16) {
                    e = e16;
                    cVar4 = cVar;
                    str2 = str2;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e.getMessage());
                    }
                    this.R = false;
                    this.f16768f.a(this.f16783u);
                    a(this.I, z10, str2, cVar4);
                    return;
                }
                this.R = false;
                this.f16768f.a(this.f16783u);
                a(this.I, z10, str2, cVar4);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().b(this.f16770h, str2);
            if (!z10 || this.f16768f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar4 != null) {
                cVar4.a(bVarA2);
                cVar4.b(true);
            }
            this.f16768f.a(strB4, cVar4);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e10) {
            q0.b("RewardVideoController", e10.getMessage());
        }
        this.R = true;
        this.f16768f.a(this.f16783u);
        this.f16768f.b(this.f16774l, this.f16770h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.f16764b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f16768f.d(this.f16774l, this.f16770h, cVar);
        } else {
            a(copyOnWriteArrayList, this.f16764b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean zIsEmpty = TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        boolean z10 = !zIsEmpty;
        int nscpt = campaignEx.getNscpt();
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f16762a, z10, nscpt, this.f16783u, this.f16782t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, this.f16774l, this.f16770h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z10, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z10, nscpt));
        if (zIsEmpty) {
            return;
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f16762a, campaignEx, this.f16774l, this.f16770h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z10, nscpt));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.Queue<java.lang.Integer> r12, boolean r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.c r15) {
        /*
            r11 = this;
            java.lang.String r1 = "RewardVideoController"
            java.lang.String r2 = "load mv api error:"
            r0 = 25
            r3 = 880020(0xd6d94, float:1.23317E-39)
            r4 = 1
            r11.F = r0     // Catch: java.lang.Exception -> L6f
            r11.G = r4     // Catch: java.lang.Exception -> L6f
            if (r12 == 0) goto L2a
            int r0 = r12.size()     // Catch: java.lang.Exception -> L25
            if (r0 <= 0) goto L2a
            java.lang.Object r12 = r12.poll()     // Catch: java.lang.Exception -> L25
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Exception -> L25
            if (r12 == 0) goto L2a
            int r12 = r12.intValue()     // Catch: java.lang.Exception -> L25
            r11.F = r12     // Catch: java.lang.Exception -> L25
            goto L2a
        L25:
            r0 = move-exception
            r12 = r0
            r5 = r11
            r10 = r15
            goto L73
        L2a:
            int r6 = r11.G     // Catch: java.lang.Exception -> L39
            int r7 = r11.F     // Catch: java.lang.Exception -> L39
            r5 = r11
            r8 = r13
            r9 = r14
            r10 = r15
            r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L36
            return
        L36:
            r0 = move-exception
        L37:
            r12 = r0
            goto L3d
        L39:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L37
        L3d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5d
            r13.<init>()     // Catch: java.lang.Exception -> L5d
            r13.append(r2)     // Catch: java.lang.Exception -> L5d
            java.lang.String r14 = r12.getMessage()     // Catch: java.lang.Exception -> L5d
            r13.append(r14)     // Catch: java.lang.Exception -> L5d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L5d
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)     // Catch: java.lang.Exception -> L5d
            if (r10 == 0) goto L60
            r10.a(r13)     // Catch: java.lang.Exception -> L5d
            r10.b(r4)     // Catch: java.lang.Exception -> L5d
            goto L60
        L5d:
            r0 = move-exception
        L5e:
            r12 = r0
            goto L73
        L60:
            r11.a(r13, r10)     // Catch: java.lang.Exception -> L5d
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L5d
            if (r13 == 0) goto La0
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Exception -> L5d
            com.mbridge.msdk.foundation.tools.q0.b(r1, r12)     // Catch: java.lang.Exception -> L5d
            goto La0
        L6f:
            r0 = move-exception
            r5 = r11
            r10 = r15
            goto L5e
        L73:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            java.lang.String r14 = r12.getMessage()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.mbridge.msdk.foundation.error.b r13 = com.mbridge.msdk.foundation.error.a.a(r3, r13)
            if (r10 == 0) goto L92
            r10.a(r13)
            r10.b(r4)
        L92:
            r11.a(r13, r10)
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r13 == 0) goto La0
            java.lang.String r12 = r12.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r1, r12)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.Queue, boolean, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f16768f != null) {
            this.Q = true;
            this.f16768f.a(bVar, cVar);
        }
    }

    public void a(int i10, int i11, boolean z10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f16764b;
            if (cVar2 == null || !this.f16770h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f16762a, this.f16774l, this.f16770h);
                this.f16764b = cVar3;
                cVar3.d(this.f16782t);
                this.f16764b.e(this.f16783u);
            }
            if (this.f16782t) {
                this.f16764b.a(this.f16779q, this.f16780r, this.f16781s);
            }
            this.H = new ArrayList();
            this.f16764b.a(this.f16778p);
            this.f16764b.a(this.f16765c);
            f fVar = new f(this.f16764b, i10, z10, str, cVar);
            fVar.a(i11);
            g gVar = new g(this.f16764b, z10);
            this.f16772j = gVar;
            gVar.a(fVar);
            this.f16764b.a(this.f16772j);
            this.f16764b.a(0, "");
            this.f16764b.a(new j());
            this.f16764b.a(i10, i11, z10, str, this.f16787y, cVar);
            this.f16777o.postDelayed(fVar, i11 * 1000);
        } catch (Exception e10) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e10.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e10.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.f16764b == null) {
                f();
            }
            if (this.f16764b != null) {
                q0.b("RewardVideoController", "controller 819");
                if (this.f16783u) {
                    zL = a(false);
                } else {
                    zL = this.f16764b.l();
                }
                C0302a c0302a = null;
                if (zL) {
                    q0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.f16777o, c0302a);
                    f16761f0.put(this.f16770h, iVar);
                    this.f16764b.a(iVar, str, this.f16769g, this.f16778p, this.f16773k, cVar);
                    this.E = false;
                    return;
                }
                if (this.f16783u) {
                    zM = b();
                } else {
                    zM = this.f16764b.m();
                }
                if (zM) {
                    q0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.f16777o, c0302a);
                    f16761f0.put(this.f16770h, iVar2);
                    this.f16764b.a(iVar2, str, this.f16769g, this.f16778p, this.f16773k, cVar);
                    this.E = false;
                    return;
                }
            }
            this.E = false;
            a("2000131", cVar, this.f16767e, "can't show because load is failed");
            if (this.f16767e != null) {
                try {
                    this.f16767e.onShowFail(cVar, this.f16771i, "can't show because load is failed");
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e10.getMessage());
                    }
                }
            }
            if (this.f16782t || this.f16783u || (cVar3 = this.f16765c) == null || !cVar3.a(4) || this.f16768f == null || this.f16768f.a() == 1 || this.f16768f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f16770h, true, 1));
        } catch (Exception e11) {
            this.E = false;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoController", e11.getLocalizedMessage());
            }
            a("2000131", cVar, this.f16767e, "show exception");
            if (this.f16767e != null) {
                try {
                    this.f16767e.onShowFail(cVar, this.f16771i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardVideoController", e11.getMessage());
                    }
                }
            }
            if (this.f16782t || this.f16783u || (cVar2 = this.f16765c) == null || !cVar2.a(4) || this.f16768f == null || this.f16768f.a() == 1 || this.f16768f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.f16770h, true, 1));
        }
    }

    private boolean a(boolean z10) {
        if (this.f16764b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f16770h);
        String str = this.A;
        if (listA == null || listA.size() <= 0) {
            if (z10) {
                d("is_ready_ctir_false", "no effective campaign list");
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.i(str);
                cVar.g(this.f16788z);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 8);
                cVar.a("m_offer_ready", eVar);
                a(false, cVar, (List<CampaignEx>) this.f16764b.h());
            }
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.f16770h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD, z10);
        if (z10) {
            d("is_ready_ctir_" + zA, "");
        }
        if (!zA) {
            for (com.mbridge.msdk.foundation.entity.c cVar2 : listA) {
                if (cVar2 != null) {
                    this.f16764b.c(cVar2.a());
                    this.f16764b.b(cVar2.d());
                    if (this.f16764b.b(z10)) {
                        cVar2.d();
                        return true;
                    }
                }
            }
        } else if (z10) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar3.i(str);
            a(zA, cVar3, this.f16764b.h());
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str, boolean z10) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.f16764b.c(cVar.a());
                this.f16764b.b(cVar.d());
                if (this.f16764b.l()) {
                    if (!z10) {
                        return true;
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    cVar2.i(cVar.d());
                    a(false, cVar2, (List<CampaignEx>) this.f16764b.h());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r12, java.lang.String r13, java.lang.String r14, com.mbridge.msdk.foundation.same.report.metrics.e r15) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.same.report.metrics.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e r9) {
        /*
            r8 = this;
            java.lang.String r0 = "RewardVideoController"
            r1 = 0
            com.mbridge.msdk.videocommon.download.b r2 = com.mbridge.msdk.videocommon.download.b.getInstance()     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = r8.f16770h     // Catch: java.lang.Exception -> L25
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.b(r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = ""
            r4 = 0
            if (r2 == 0) goto L28
            int r5 = r2.size()     // Catch: java.lang.Exception -> L25
            if (r5 <= 0) goto L28
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch: java.lang.Exception -> L25
            if (r5 == 0) goto L28
            java.lang.String r3 = r5.getCurrentLocalRid()     // Catch: java.lang.Exception -> L25
            goto L28
        L25:
            r9 = move-exception
            goto Lf0
        L28:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L25
            if (r5 != 0) goto L3d
            com.mbridge.msdk.foundation.same.report.metrics.d r5 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L25
            java.util.LinkedHashMap r5 = r5.c()     // Catch: java.lang.Exception -> L25
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.foundation.same.report.metrics.c r5 = (com.mbridge.msdk.foundation.same.report.metrics.c) r5     // Catch: java.lang.Exception -> L25
            r1 = r5
        L3d:
            com.mbridge.msdk.foundation.tools.s0 r5 = com.mbridge.msdk.foundation.tools.s0.a()     // Catch: java.lang.Exception -> L79
            java.lang.String r6 = "a_u_a_c_f_s"
            boolean r5 = r5.a(r6, r4)     // Catch: java.lang.Exception -> L79
            if (r5 == 0) goto L95
            java.lang.String r5 = "null"
            com.mbridge.msdk.foundation.controller.c r6 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L79
            if (r6 == 0) goto L7b
            com.mbridge.msdk.foundation.controller.c r6 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L79
            android.content.Context r6 = r6.f()     // Catch: java.lang.Exception -> L79
            boolean r7 = r6 instanceof android.app.Activity     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L7b
            android.app.Activity r6 = (android.app.Activity) r6     // Catch: java.lang.Exception -> L79
            java.lang.Class r4 = r6.getClass()     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = r4.getSimpleName()     // Catch: java.lang.Exception -> L79
            boolean r4 = r6.isFinishing()     // Catch: java.lang.Exception -> L79
            if (r4 == 0) goto L6f
            r4 = 2
            goto L7b
        L6f:
            boolean r4 = r6.isDestroyed()     // Catch: java.lang.Exception -> L79
            if (r4 == 0) goto L77
            r4 = 3
            goto L7b
        L77:
            r4 = 1
            goto L7b
        L79:
            r4 = move-exception
            goto L8a
        L7b:
            java.lang.String r6 = "context_status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L79
            r9.a(r6, r4)     // Catch: java.lang.Exception -> L79
            java.lang.String r4 = "activity_name"
            r9.a(r4, r5)     // Catch: java.lang.Exception -> L79
            goto L95
        L8a:
            boolean r5 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Exception -> L25
            if (r5 == 0) goto L95
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.foundation.tools.q0.b(r0, r4)     // Catch: java.lang.Exception -> L25
        L95:
            java.lang.String r4 = "2000128"
            if (r1 == 0) goto Laf
            r1.b(r2)     // Catch: java.lang.Exception -> L25
            r1.a(r4, r9)     // Catch: java.lang.Exception -> L25
            r1.i(r3)     // Catch: java.lang.Exception -> L25
            java.lang.String r9 = r8.f16770h     // Catch: java.lang.Exception -> L25
            r1.n(r9)     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.reward.report.metrics.a r9 = com.mbridge.msdk.reward.report.metrics.a.a()     // Catch: java.lang.Exception -> L25
            r9.a(r4, r1)     // Catch: java.lang.Exception -> L25
            return r1
        Laf:
            com.mbridge.msdk.foundation.same.report.metrics.c r5 = new com.mbridge.msdk.foundation.same.report.metrics.c     // Catch: java.lang.Exception -> L25
            r5.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r8.f16770h     // Catch: java.lang.Exception -> Ld5
            r5.n(r1)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r1 = "metrics_data_reason"
            java.lang.String r6 = "未获取到待展示的campaign信息 本地new metricsData"
            r9.a(r1, r6)     // Catch: java.lang.Exception -> Ld5
            r5.a(r4, r9)     // Catch: java.lang.Exception -> Ld5
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> Ld5
            if (r9 == 0) goto Ld7
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.v0.d()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r9)     // Catch: java.lang.Exception -> Ld5
            r5.i(r9)     // Catch: java.lang.Exception -> Ld5
            goto Le8
        Ld5:
            r9 = move-exception
            goto Lf1
        Ld7:
            r5.i(r3)     // Catch: java.lang.Exception -> Ld5
            r5.b(r2)     // Catch: java.lang.Exception -> Ld5
            com.mbridge.msdk.foundation.same.report.metrics.d r9 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> Ld5
            java.util.LinkedHashMap r9 = r9.c()     // Catch: java.lang.Exception -> Ld5
            r9.put(r3, r5)     // Catch: java.lang.Exception -> Ld5
        Le8:
            com.mbridge.msdk.reward.report.metrics.a r9 = com.mbridge.msdk.reward.report.metrics.a.a()     // Catch: java.lang.Exception -> Ld5
            r9.a(r4, r5)     // Catch: java.lang.Exception -> Ld5
            goto Lfc
        Lf0:
            r5 = r1
        Lf1:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r1 == 0) goto Lfc
            java.lang.String r9 = r9.getMessage()
            com.mbridge.msdk.foundation.tools.q0.b(r0, r9)
        Lfc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(com.mbridge.msdk.foundation.same.report.metrics.e):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    public void a(List<CampaignEx> list) {
        if (list != null && list.size() > 0) {
            this.H = list;
        } else {
            this.H = new ArrayList();
        }
    }

    private String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(v0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(v0.d()) : md5;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
            return md5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(android.os.Message r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1f
            android.os.Bundle r3 = r3.getData()     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L1f
            com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "metrics_data_lrid"
            java.lang.String r3 = r3.getString(r1)     // Catch: java.lang.Exception -> L17
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = r0.b(r3)     // Catch: java.lang.Exception -> L17
            goto L20
        L17:
            r3 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L1f
            r3.printStackTrace()
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L27
            com.mbridge.msdk.foundation.same.report.metrics.c r3 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r3.<init>()
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(android.os.Message):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.f16786x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.H);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6, com.mbridge.msdk.foundation.same.report.metrics.c r7) {
        /*
            r5 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.mbridge.msdk.foundation.same.report.metrics.c r1 = new com.mbridge.msdk.foundation.same.report.metrics.c
            r1.<init>()
            java.lang.String r2 = ""
            if (r6 == 0) goto L3c
            int r3 = r6.size()     // Catch: java.lang.Exception -> L30
            if (r3 <= 0) goto L3c
            r3 = 0
            java.lang.Object r4 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            if (r4 == 0) goto L32
            java.lang.Object r2 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = r2.getLocalRequestId()     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L30
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = r3.getNLRid()     // Catch: java.lang.Exception -> L30
            goto L33
        L30:
            r6 = move-exception
            goto L9d
        L32:
            r3 = r2
        L33:
            r1.i(r2)     // Catch: java.lang.Exception -> L30
            r1.b(r6)     // Catch: java.lang.Exception -> L30
            r6 = r2
            r2 = r3
            goto L3d
        L3c:
            r6 = r2
        L3d:
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L44
            return r7
        L44:
            com.mbridge.msdk.foundation.same.report.metrics.e r7 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Exception -> L30
            r7.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "cache"
            r7.a(r2, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "hb"
            r7.a(r2, r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "auto_load"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L30
            r7.a(r0, r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "2000127"
            r1.a(r0, r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = "2000048"
            r1.a(r0, r7)     // Catch: java.lang.Exception -> L30
            boolean r7 = r5.f16782t     // Catch: java.lang.Exception -> L30
            if (r7 == 0) goto L6e
            r7 = 287(0x11f, float:4.02E-43)
            goto L70
        L6e:
            r7 = 94
        L70:
            r1.a(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "1"
            r1.h(r7)     // Catch: java.lang.Exception -> L30
            java.lang.String r7 = "2"
            r1.f(r7)     // Catch: java.lang.Exception -> L30
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L30
            if (r7 != 0) goto La4
            com.mbridge.msdk.foundation.same.report.metrics.d r7 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L30
            java.util.LinkedHashMap r7 = r7.c()     // Catch: java.lang.Exception -> L30
            boolean r7 = r7.containsKey(r6)     // Catch: java.lang.Exception -> L30
            if (r7 != 0) goto La4
            com.mbridge.msdk.foundation.same.report.metrics.d r7 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Exception -> L30
            java.util.LinkedHashMap r7 = r7.c()     // Catch: java.lang.Exception -> L30
            r7.put(r6, r1)     // Catch: java.lang.Exception -> L30
            return r1
        L9d:
            boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r7 == 0) goto La4
            r6.printStackTrace()
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.controller.a.a(java.util.List, com.mbridge.msdk.foundation.same.report.metrics.c):com.mbridge.msdk.foundation.same.report.metrics.c");
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, List<CampaignEx> list) {
        if (cVar == null) {
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null) {
                cVar.i(campaignEx.getLocalRequestId());
                cVar.g(campaignEx.getBidToken());
            }
            cVar.b(list);
        }
        a(z10, cVar, (com.mbridge.msdk.foundation.same.report.metrics.e) null);
    }

    private void a(boolean z10, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (eVar == null) {
            eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        }
        cVar.n(this.f16770h);
        cVar.a(this.f16782t ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
        eVar.a("result", Integer.valueOf(z10 ? 1 : 2));
        eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f16783u ? 1 : 0));
        cVar.a("m_offer_ready", eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a("m_offer_ready", cVar);
    }
}
