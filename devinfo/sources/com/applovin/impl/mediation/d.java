package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.a3;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.p5;
import com.applovin.impl.r3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.v5;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4660a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4661b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f4662c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f4663d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f4664e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f4665f = new HashMap();
    private final Object g = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements p5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f4667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f4669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f4670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0014a f4671f;

        public a(long j, Map map, String str, a3 a3Var, Context context, a.InterfaceC0014a interfaceC0014a) {
            this.f4666a = j;
            this.f4667b = map;
            this.f4668c = str;
            this.f4669d = a3Var;
            this.f4670e = context;
            this.f4671f = interfaceC0014a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f4667b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f4666a));
            this.f4667b.put("calfc", Integer.valueOf(d.this.b(this.f4668c)));
            v5 v5Var = new v5(this.f4669d, jSONArray, this.f4670e, d.this.f4660a, this.f4671f);
            if (((Boolean) d.this.f4660a.a(r3.f5231o8)).booleanValue()) {
                d.this.f4660a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f4660a.q0().a(v5Var);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b implements a.InterfaceC0014a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f4672a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f4673b;

        /* renamed from: c, reason: collision with root package name */
        private final d f4674c;

        /* renamed from: d, reason: collision with root package name */
        private final c f4675d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f4676e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f4677f;
        private final Map g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f4678h;

        /* renamed from: i, reason: collision with root package name */
        private final int f4679i;
        private long j;

        /* renamed from: k, reason: collision with root package name */
        private long f4680k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j8, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j8, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f4674c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f4672a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f4680k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z3 = maxError2.getCode() == -5603 && n7.c(this.f4672a) && ((Boolean) this.f4672a.a(x4.A6)).booleanValue();
            if (this.f4672a.a(r3.f5224i8, this.f4676e) && this.f4675d.f4683c < this.f4679i && !z3) {
                c.e(this.f4675d);
                int iPow = (int) Math.pow(2.0d, this.f4675d.f4683c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new m(this, iPow, str, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f4675d.f4683c = 0;
            this.f4675d.f4682b.set(false);
            if (this.f4675d.f4684d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f4675d.f4681a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f4675d.f4684d, str, maxError2);
                this.f4675d.f4684d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f4675d.f4681a);
            y2Var.a(SystemClock.elapsedRealtime() - this.j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f4672a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f4680k, y2Var.getRequestLatencyMillis());
            }
            this.f4674c.a(maxAd.getAdUnitId());
            this.f4675d.f4683c = 0;
            if (this.f4675d.f4684d == null) {
                this.f4674c.a(y2Var);
                this.f4675d.f4682b.set(false);
                return;
            }
            y2Var.A().c().a(this.f4675d.f4684d);
            this.f4675d.f4684d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f4675d.f4684d.onAdRevenuePaid(y2Var);
            }
            this.f4675d.f4684d = null;
            if (((Boolean) this.f4672a.a(r3.f5222f8)).booleanValue() || !this.f4674c.a(maxAd)) {
                this.f4675d.f4682b.set(false);
                return;
            }
            Context contextO = (Context) this.f4673b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.j = SystemClock.elapsedRealtime();
            this.f4680k = System.currentTimeMillis();
            this.f4678h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f4674c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f4677f, this.g, this.f4678h, context, this);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j8, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f4672a = kVar;
            this.f4673b = new WeakReference(context);
            this.f4674c = dVar;
            this.f4675d = cVar;
            this.f4676e = maxAdFormat;
            this.g = map2;
            this.f4677f = map;
            this.f4678h = map3;
            this.j = j;
            this.f4680k = j8;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f4679i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f4679i = Math.min(2, ((Integer) kVar.a(r3.h8)).intValue());
            } else {
                this.f4679i = ((Integer) kVar.a(r3.h8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i4, String str) {
            this.g.put("retry_delay_sec", Integer.valueOf(i4));
            this.g.put("retry_attempt", Integer.valueOf(this.f4675d.f4683c));
            Context contextO = (Context) this.f4673b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f4678h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f4678h.put("era", Integer.valueOf(this.f4675d.f4683c));
            this.f4680k = System.currentTimeMillis();
            this.f4674c.a(str, this.f4676e, this.f4677f, this.g, this.f4678h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f4681a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f4682b;

        /* renamed from: c, reason: collision with root package name */
        private int f4683c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0014a f4684d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i4 = cVar.f4683c;
            cVar.f4683c = i4 + 1;
            return i4;
        }

        private c(String str) {
            this.f4682b = new AtomicBoolean();
            this.f4681a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f4660a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbZ = d.h.z(str);
        sbZ.append(str2 != null ? "-".concat(str2) : "");
        return sbZ.toString();
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f4664e) {
            y2Var = (y2) this.f4663d.get(str);
            this.f4663d.remove(str);
        }
        return y2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f4662c) {
            this.f4661b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z3;
        synchronized (this.f4664e) {
            z3 = this.f4663d.get(str) != null;
        }
        return z3;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0014a interfaceC0014a) {
        y2 y2VarE = (this.f4660a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0014a);
            interfaceC0014a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0014a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f4660a.a(r3.f5222f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f4682b.compareAndSet(false, true)) {
            if (cVarA.f4684d != null && cVarA.f4684d != interfaceC0014a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f4684d = interfaceC0014a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f4684d = interfaceC0014a;
        }
        Map mapR = a0.g.r();
        mapR.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapR.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapR, context, new b(map, map2, mapR, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f4660a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.g) {
            try {
                this.f4660a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4660a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f4665f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f4665f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.g) {
            try {
                Integer num = (Integer) this.f4665f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0014a interfaceC0014a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f4660a.q0().a((i5) new p5(a3Var, context, this.f4660a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0014a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f4660a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f4660a.Y();
            s3 s3Var = s3.f5289e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f4660a.Y().a(s3Var, t3.a(maxAdFormat));
            return new com.applovin.impl.h(iA, iA2, a(mapA2, aVar), a(mapA2, aVar2));
        }
        return new com.applovin.impl.h(-1, -1, -1, -1);
    }

    private int a(Map map, s3.a aVar) {
        Long l10;
        if (map == null || (l10 = (Long) map.get(aVar.b())) == null) {
            return -1;
        }
        return l10.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y2 y2Var) {
        synchronized (this.f4664e) {
            try {
                if (this.f4663d.containsKey(y2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
                }
                this.f4663d.put(y2Var.getAdUnitId(), y2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f4662c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f4661b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f4661b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            try {
                this.f4660a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4660a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f4665f.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f4660a.c(r3.f5220d8).contains(maxAd.getAdUnitId()) && !this.f4660a.a(r3.f5219c8, maxAd.getFormat())) || this.f4660a.s0().c() || this.f4660a.s0().d()) ? false : true;
    }
}
