package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: o, reason: collision with root package name */
    public static String f15622o;

    /* renamed from: p, reason: collision with root package name */
    public static Map<String, Integer> f15623p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static Map<String, Integer> f15624q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static Map<String, d> f15625r = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Context f15627b;

    /* renamed from: c, reason: collision with root package name */
    private String f15628c;

    /* renamed from: d, reason: collision with root package name */
    private String f15629d;

    /* renamed from: e, reason: collision with root package name */
    private String f15630e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f15631f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f15632g;

    /* renamed from: h, reason: collision with root package name */
    private l f15633h;

    /* renamed from: i, reason: collision with root package name */
    private InterstitialListener f15634i;

    /* renamed from: a, reason: collision with root package name */
    private String f15626a = "InterstitialController";

    /* renamed from: j, reason: collision with root package name */
    public boolean f15635j = false;

    /* renamed from: k, reason: collision with root package name */
    private String f15636k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f15637l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f15638m = "";

    /* renamed from: n, reason: collision with root package name */
    private boolean f15639n = false;

    /* renamed from: com.mbridge.msdk.interstitial.controller.a$a, reason: collision with other inner class name */
    public class HandlerC0273a extends Handler {
        public HandlerC0273a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                if (a.this.f15634i != null) {
                    a.this.f15634i.onInterstitialLoadSuccess(a.this.f15631f);
                    return;
                }
                return;
            }
            String str = "";
            if (i10 == 2) {
                if (a.this.f15634i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    a.this.f15634i.onInterstitialLoadFail(a.this.f15631f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 3) {
                a aVar = a.this;
                aVar.f15635j = true;
                if (aVar.f15634i != null) {
                    a.this.f15634i.onInterstitialShowSuccess(a.this.f15631f);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                if (a.this.f15634i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    a.this.f15634i.onInterstitialShowFail(a.this.f15631f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i10 == 6) {
                if (a.this.f15634i != null) {
                    a.this.f15634i.onInterstitialAdClick(a.this.f15631f);
                }
            } else {
                if (i10 != 7) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f15635j = false;
                if (aVar2.f15634i != null) {
                    a.this.f15634i.onInterstitialClosed(a.this.f15631f);
                }
            }
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f15641a;

        /* renamed from: b, reason: collision with root package name */
        private c f15642b;

        public b(com.mbridge.msdk.interstitial.adapter.a aVar, c cVar) {
            this.f15641a = aVar;
            this.f15642b = cVar;
        }

        public void a(boolean z10, String str) {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f15641a;
                if (aVar != null) {
                    aVar.a((b) null);
                    this.f15641a = null;
                }
                if (this.f15642b != null) {
                    if (a.this.f15632g != null) {
                        a.this.f15632g.removeCallbacks(this.f15642b);
                    }
                    if (z10) {
                        if (a.this.f15634i != null) {
                            a.this.c(str);
                        }
                    } else if (a.this.f15634i != null) {
                        a.this.b(str);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b(boolean z10, String str) {
            try {
                a.this.f15636k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    com.mbridge.msdk.interstitial.adapter.a aVar = this.f15641a;
                    if (aVar != null && aVar.d() != null) {
                        arrayList.add(this.f15641a.d());
                    }
                    a.this.f15637l = com.mbridge.msdk.foundation.same.c.b(arrayList);
                } catch (Exception e10) {
                    q0.b(a.this.f15626a, e10.getMessage());
                }
                if (this.f15642b != null) {
                    if (a.this.f15632g != null) {
                        a.this.f15632g.removeCallbacks(this.f15642b);
                    }
                    if (z10) {
                        a.this.b(false);
                    } else if (a.this.f15634i != null) {
                        a.this.h();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.interstitial.adapter.a f15644a;

        public c(com.mbridge.msdk.interstitial.adapter.a aVar) {
            this.f15644a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = this.f15644a;
                if (aVar != null) {
                    if (aVar.f()) {
                        a.this.c("load timeout");
                    } else if (a.this.f15634i != null) {
                        a.this.b("load timeout");
                    }
                    this.f15644a.a((b) null);
                    this.f15644a = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public a() {
        try {
            c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Handler handler = this.f15632g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Handler handler = this.f15632g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public void g() {
        try {
            new j().a(this.f15627b, (String) null, (String) null, this.f15628c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void j() {
        try {
            if (this.f15627b == null) {
                c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f15628c)) {
                c("unitid is null");
            } else if (!this.f15639n) {
                c("init error");
            } else {
                e();
                b(true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c("can't show because unknow error");
        }
    }

    public class d {
        public d() {
        }

        public void a(String str) {
            try {
                a.this.c(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void b() {
            try {
                if (a.this.f15632g != null) {
                    a.this.f15632g.sendEmptyMessage(7);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void c() {
            try {
                a.this.i();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public void a() {
            try {
                if (a.this.f15632g != null) {
                    a.this.f15632g.sendEmptyMessage(6);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void e() {
        try {
            g();
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f15628c);
            this.f15633h = lVarE;
            if (lVarE == null) {
                this.f15633h = l.h(this.f15628c);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f() {
        try {
            if (this.f15627b == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f15628c)) {
                b("unitid is null");
            } else {
                if (!this.f15639n) {
                    b("init error");
                    return;
                }
                e();
                d();
                a(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
        }
    }

    private void c() {
        try {
            this.f15632g = new HandlerC0273a(Looper.getMainLooper());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        try {
            l lVar = this.f15633h;
            if (lVar != null) {
                int iE = lVar.e();
                int iY = this.f15633h.y();
                if (iE <= 0) {
                    iE = 1;
                }
                if (iY <= 0) {
                    iY = 1;
                }
                int i10 = iY * iE;
                if (f15624q == null || TextUtils.isEmpty(this.f15628c)) {
                    return;
                }
                f15624q.put(this.f15628c, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String b() {
        if (this.f15635j) {
            return this.f15638m;
        }
        return this.f15636k;
    }

    public static void a(String str, int i10) {
        try {
            if (f15623p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f15623p.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            if (this.f15632g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f15632g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        try {
            CampaignEx campaignExD = new com.mbridge.msdk.interstitial.adapter.a(this.f15627b, this.f15628c, this.f15629d, this.f15630e, true).d();
            if (campaignExD != null) {
                a(campaignExD);
            } else if (z10) {
                a(true);
            } else {
                c("no ads available can show");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (this.f15634i != null) {
                c("can't show because unknow error");
            }
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f15623p) == null || !map.containsKey(str) || (num = f15623p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public void a(InterstitialListener interstitialListener) {
        this.f15634i = interstitialListener;
    }

    public boolean a(Context context, Map<String, Object> map) {
        try {
            this.f15639n = false;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f15639n = false;
        }
        if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                this.f15630e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            this.f15628c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            this.f15627b = context;
            if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                this.f15629d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            this.f15631f = new MBridgeIds(this.f15629d, this.f15628c);
            this.f15639n = true;
            return this.f15639n;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f15632g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f15632g.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String a() {
        return this.f15637l;
    }

    public void a(boolean z10) {
        boolean z11;
        try {
            z11 = z10;
            try {
                com.mbridge.msdk.interstitial.adapter.a aVar = new com.mbridge.msdk.interstitial.adapter.a(this.f15627b, this.f15628c, this.f15629d, this.f15630e, z11);
                c cVar = new c(aVar);
                aVar.a(new b(aVar, cVar));
                Handler handler = this.f15632g;
                if (handler != null) {
                    handler.postDelayed(cVar, 30000L);
                }
                aVar.j();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                if (z11) {
                    return;
                }
                b("can't show because unknow error");
            }
        } catch (Exception e11) {
            e = e11;
            z11 = z10;
        }
    }

    private void a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f15625r != null && !TextUtils.isEmpty(this.f15628c)) {
            f15625r.put(this.f15628c, dVar);
        }
        Intent intent = new Intent(this.f15627b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f15628c)) {
            intent.putExtra("unitId", this.f15628c);
        }
        if (campaignEx != null) {
            this.f15638m = campaignEx.getRequestId();
            intent.putExtra(MBInterstitialActivity.INTENT_CAMAPIGN, campaignEx);
        }
        Context context = this.f15627b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
