package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.g;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {

    /* renamed from: r, reason: collision with root package name */
    private static final String f16046r = "d";

    /* renamed from: s, reason: collision with root package name */
    private static Map<String, Map<Long, Object>> f16047s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    private static Map<String, Boolean> f16048t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    private static Map<String, k> f16049u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    private static Map<String, Integer> f16050v = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    private static Map<String, Integer> f16051w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    private static d f16052x = null;

    /* renamed from: y, reason: collision with root package name */
    private static int f16053y = -1;

    /* renamed from: z, reason: collision with root package name */
    private static int f16054z = -2;

    /* renamed from: b, reason: collision with root package name */
    private j f16055b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.click.a f16056c;

    /* renamed from: d, reason: collision with root package name */
    private l f16057d;

    /* renamed from: e, reason: collision with root package name */
    private String f16058e;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f16062i;

    /* renamed from: j, reason: collision with root package name */
    private List<Integer> f16063j;

    /* renamed from: k, reason: collision with root package name */
    protected List<Integer> f16064k;

    /* renamed from: l, reason: collision with root package name */
    private List<Integer> f16065l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16066m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16067n;

    /* renamed from: o, reason: collision with root package name */
    private int f16068o;

    /* renamed from: p, reason: collision with root package name */
    private int f16069p;

    /* renamed from: f, reason: collision with root package name */
    Queue<Integer> f16059f = null;

    /* renamed from: g, reason: collision with root package name */
    Queue<Long> f16060g = null;

    /* renamed from: h, reason: collision with root package name */
    private int f16061h = 0;

    /* renamed from: q, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f16070q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* renamed from: c, reason: collision with root package name */
        private int f16072c;

        /* renamed from: d, reason: collision with root package name */
        private int f16073d;

        /* renamed from: e, reason: collision with root package name */
        private int f16074e;

        /* renamed from: f, reason: collision with root package name */
        private int f16075f;

        /* renamed from: g, reason: collision with root package name */
        private int f16076g;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f16079j;

        /* renamed from: l, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f16081l;

        /* renamed from: h, reason: collision with root package name */
        private List<String> f16077h = null;

        /* renamed from: i, reason: collision with root package name */
        private boolean f16078i = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f16080k = true;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f16083a;

            public a(CampaignUnit campaignUnit) {
                this.f16083a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b.this.f16079j != null) {
                    b bVar = b.this;
                    d.this.f16034a.removeCallbacks(bVar.f16079j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f16083a);
                }
                if (d.f16047s.containsKey("0_" + b.this.unitId)) {
                    d.f16047s.remove("0_" + b.this.unitId);
                }
                if (b.this.f16076g > 0) {
                    if (this.f16083a.ads.size() > b.this.f16076g) {
                        b bVar2 = b.this;
                        bVar2.f16073d = bVar2.f16076g;
                    } else {
                        b.this.f16073d = this.f16083a.ads.size();
                    }
                } else if (b.this.f16076g == -1) {
                    b.this.f16073d = 0;
                } else if (b.this.f16076g == -3) {
                    b.this.f16073d = this.f16083a.ads.size();
                } else if (b.this.f16076g == -2) {
                    if (this.f16083a.getTemplate() == 3) {
                        if (b.this.f16075f != 0) {
                            b bVar3 = b.this;
                            bVar3.f16073d = bVar3.f16075f;
                        }
                    } else if (b.this.f16074e != 0) {
                        b bVar4 = b.this;
                        bVar4.f16073d = bVar4.f16074e;
                    }
                    if (b.this.f16073d <= 0) {
                        b.this.f16073d = ((Integer) d.f16050v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f16083a.ads.size() < b.this.f16073d) {
                    b.this.f16073d = this.f16083a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("adtp", 42);
                if (TextUtils.isEmpty(b.this.b())) {
                    eVar.a(CampaignEx.JSON_KEY_HB, 0);
                } else {
                    eVar.a(CampaignEx.JSON_KEY_HB, 1);
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b.this.b(), eVar, this.f16083a.getAds().get(0), b.this.unitId);
                for (int i10 = 0; i10 < this.f16083a.ads.size(); i10++) {
                    CampaignEx campaignEx = this.f16083a.ads.get(i10);
                    campaignEx.setLocalRequestId(cVarA.t());
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.f16073d && campaignEx.getOfferType() != 99) {
                        if (v0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            v0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f15049x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.f16066m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f16083a.getAds().get(0) != null ? this.f16083a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) b.this.unitId, (String) arrayList);
                }
                d.a(b.this.f16072c, b.this.unitId);
                if (Looper.myLooper() != null && z10) {
                    Looper.loop();
                }
                if (this.f16083a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f16083a.getAds().get(0).getMaitve(), this.f16083a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        public class C0284b extends c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f16085a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f16086b;

            public C0284b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f16085a = campaignEx;
                this.f16086b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f16085a, this.f16086b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16088a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f16089b;

            public c(String str, int i10) {
                this.f16088a = str;
                this.f16089b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f16078i) {
                    if (b.this.f16079j != null) {
                        b bVar = b.this;
                        d.this.f16034a.removeCallbacks(bVar.f16079j);
                    }
                    if (b.this.a() == 1 || b.this.f16080k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f16088a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.f16081l);
                    }
                } else if (b.this.f16080k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f16088a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.f16081l);
                }
                if (this.f16089b == -1) {
                    d.b(b.this.f16072c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        /* renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        public class RunnableC0285d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f16091a;

            public RunnableC0285d(List list) {
                this.f16091a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!b.this.f16078i && b.this.f16079j != null) {
                    b bVar = b.this;
                    d.this.f16034a.removeCallbacks(bVar.f16079j);
                }
                List list = this.f16091a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f16091a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.f16066m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f16091a);
                    if (d.f16047s.containsKey("1_" + b.this.unitId)) {
                        d.f16047s.remove("1_" + b.this.unitId);
                    }
                    d.f16047s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z10) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i10) {
            this.f16072c = i10;
        }

        public void b(List<String> list) {
            this.f16077h = list;
        }

        public void c(int i10) {
            this.f16074e = i10;
        }

        public void d(int i10) {
            this.f16073d = i10;
        }

        public void e(int i10) {
            this.f16075f = i10;
        }

        public void b(int i10) {
            this.f16076g = i10;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f16081l = aVar;
        }

        public void b(boolean z10) {
            this.f16080k = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f16078i = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<g> list, CampaignUnit campaignUnit) {
            d.this.f16067n = true;
            d.this.a(true, this.f16081l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0284b(campaignEx, contextD, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            d.this.a(new Thread(new c(str, i10)));
        }

        public void a(Runnable runnable) {
            this.f16079j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0285d(list)));
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f16093a;

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f16094b;

        /* renamed from: c, reason: collision with root package name */
        private int f16095c;

        /* renamed from: d, reason: collision with root package name */
        private String f16096d;

        /* renamed from: e, reason: collision with root package name */
        private String f16097e;

        /* renamed from: f, reason: collision with root package name */
        private com.mbridge.msdk.preload.listenter.a f16098f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f16099g = false;

        public c(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str, String str2) {
            this.f16093a = i10;
            this.f16094b = dVar;
            this.f16095c = i11;
            this.f16096d = str;
            this.f16097e = str2;
        }

        public void a(boolean z10) {
            this.f16099g = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16094b.a(true);
            int i10 = this.f16093a;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.f16095c, this.f16096d, this.f16097e, this.f16098f);
            } else {
                d.this.f16067n = true;
                if (this.f16099g || this.f16095c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.f16095c, this.f16096d, this.f16097e, this.f16098f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f16098f = aVar;
        }

        public void a(String str) {
            this.f16096d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f16034a = new a();
    }

    public static Map<String, Integer> c() {
        return f16050v;
    }

    public static Map<String, Integer> d() {
        return f16051w;
    }

    public static Map<String, k> e() {
        return f16049u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return f16047s;
    }

    public static Map<String, Boolean> g() {
        return f16048t;
    }

    public static void b(int i10, String str) {
        if (f16049u.containsKey(str)) {
            k kVar = f16049u.get(str);
            if (i10 == 1) {
                kVar.a(0);
            } else if (i10 == 2) {
                kVar.b(0);
            }
            f16049u.put(str, kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.util.Map<java.lang.String, java.lang.Object> r24, int r25) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(java.util.Map, int):void");
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
            return 0;
        } catch (Exception e10) {
            q0.b(f16046r, com.mbridge.msdk.mbnative.common.a.a(e10));
            return 0;
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = h.b().e("", str);
        this.f16057d = lVarE;
        if (lVarE == null) {
            this.f16057d = l.i(str);
        }
        List<Integer> listB = this.f16057d.b();
        this.f16063j = listB;
        if (listB == null || listB.size() <= 0 || !this.f16063j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i10);
    }

    public void a(int i10, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f16059f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f16059f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f16060g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.f16060g.poll().longValue();
            }
            q0.c(f16046r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.f16062i, i10, lVar, aVar);
        } catch (Throwable unused) {
            q0.b(f16046r, "queue poll exception");
        }
    }

    public void a(int i10, long j10, String str, String str2, Map<String, Object> map, int i11, l lVar, com.mbridge.msdk.preload.listenter.a aVar) throws JSONException {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        List<Campaign> listA;
        if (i10 != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null && (listA = bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, this.f16069p)) != null && listA.size() > 0) {
            a(true, aVar, (String) null);
            return;
        }
        if (i10 == 1) {
            a(i10, j10, i11, lVar, str, str2, true, aVar);
        } else if (i10 != 2) {
            a(i10, j10, i11, lVar, str, str2, aVar, false);
        } else {
            a(2, j10, i11, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0296 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0310 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x035f A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036c A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039e A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f9 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0428 A[Catch: Exception -> 0x0092, TryCatch #2 {Exception -> 0x0092, blocks: (B:3:0x0016, B:6:0x005f, B:8:0x0065, B:10:0x006d, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:19:0x0095, B:21:0x009f, B:22:0x00a9, B:24:0x00b3, B:26:0x00bd, B:28:0x00c3, B:29:0x00cc, B:31:0x00e5, B:32:0x00ec, B:34:0x00f2, B:35:0x00f7, B:37:0x011e, B:38:0x0123, B:45:0x013f, B:48:0x0147, B:50:0x014f, B:52:0x0155, B:54:0x015a, B:56:0x015e, B:61:0x016b, B:63:0x0173, B:65:0x0179, B:70:0x0185, B:71:0x0197, B:73:0x019b, B:75:0x01b6, B:77:0x01be, B:79:0x01cd, B:80:0x01e5, B:84:0x01f6, B:86:0x01fc, B:88:0x0210, B:90:0x0216, B:95:0x021f, B:97:0x0225, B:102:0x0235, B:109:0x0257, B:117:0x026d, B:119:0x0296, B:120:0x029d, B:122:0x02a5, B:124:0x02b7, B:125:0x02c0, B:127:0x02cb, B:133:0x02db, B:137:0x02eb, B:142:0x02f8, B:146:0x0324, B:148:0x035f, B:149:0x0364, B:151:0x036c, B:153:0x0376, B:154:0x0396, B:156:0x039e, B:158:0x03a8, B:159:0x03c8, B:163:0x03fc, B:165:0x0428, B:169:0x045c, B:168:0x0445, B:162:0x03f9, B:145:0x0310, B:134:0x02e0, B:135:0x02e5, B:108:0x024a, B:111:0x025e, B:170:0x0462), top: B:178:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043c  */
    @Override // com.mbridge.msdk.mbnative.controller.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r26, long r27, int r29, com.mbridge.msdk.setting.l r30, java.lang.String r31, java.lang.String r32, com.mbridge.msdk.preload.listenter.a r33, boolean r34) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.d.a(int, long, int, com.mbridge.msdk.setting.l, java.lang.String, java.lang.String, com.mbridge.msdk.preload.listenter.a, boolean):void");
    }

    public static void a(int i10, String str) {
        k kVar;
        if (f16049u.containsKey(str)) {
            kVar = f16049u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = f16050v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i10 == 1) {
            int iA = iIntValue + kVar.a();
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i10 == 2) {
            int iB = iIntValue + kVar.b();
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        f16049u.put(str, kVar);
    }

    public void a(String str, int i10, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        Log.e(f16046r, str);
        try {
            Queue<Integer> queue = this.f16059f;
            if (queue == null || queue.size() > 0) {
                if (this.f16059f != null) {
                    a(i10, this.f16057d, str2, str3, aVar);
                    return;
                }
            }
            a(false, aVar, str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.f16055b == null) {
            this.f16055b = new j();
        }
        this.f16055b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z10, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z10) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z10, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z10 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z10 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f16359p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        q0.b(f16046r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e10) {
                q0.b(f16046r, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }
}
