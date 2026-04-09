package com.applovin.impl.mediation;

import N7.G8;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.EnumC2121h;
import com.applovin.impl.a7;
import com.applovin.impl.d5;
import com.applovin.impl.g3;
import com.applovin.impl.j5;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q2;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20322a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f20323b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f20324c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f20325d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f20326e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f20327f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f20328g = new Object();

    public class a implements d5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f20330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20331c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f20332d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f20333e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f20334f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f20335g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0312a f20336h;

        public a(long j4, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0312a interfaceC0312a) {
            this.f20329a = j4;
            this.f20330b = map;
            this.f20331c = str;
            this.f20332d = maxAdFormat;
            this.f20333e = map2;
            this.f20334f = map3;
            this.f20335g = context;
            this.f20336h = interfaceC0312a;
        }

        @Override // com.applovin.impl.d5.b
        public void a(JSONArray jSONArray) {
            this.f20330b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f20329a));
            this.f20330b.put("calfc", Integer.valueOf(d.this.b(this.f20331c)));
            j5 j5Var = new j5(this.f20331c, this.f20332d, this.f20333e, this.f20334f, this.f20330b, jSONArray, this.f20335g, d.this.f20322a, this.f20336h);
            if (((Boolean) d.this.f20322a.a(g3.L7)).booleanValue()) {
                d.this.f20322a.q0().a((w4) j5Var, r5.b.MEDIATION);
            } else {
                d.this.f20322a.q0().a(j5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0312a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f20337a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f20338b;

        /* renamed from: c, reason: collision with root package name */
        private final d f20339c;

        /* renamed from: d, reason: collision with root package name */
        private final c f20340d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f20341e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f20342f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f20343g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f20344h;
        private final int i;

        /* renamed from: j, reason: collision with root package name */
        private long f20345j;

        /* renamed from: k, reason: collision with root package name */
        private long f20346k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j4, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j4, j10, dVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            String str2;
            MaxError maxError2;
            this.f20339c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20345j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                str2 = str;
                maxError2 = maxError;
                this.f20337a.X().processWaterfallInfoPostback(str2, this.f20341e, maxAdWaterfallInfoImpl, maxError2, this.f20346k, jElapsedRealtime);
            } else {
                str2 = str;
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && a7.c(this.f20337a) && ((Boolean) this.f20337a.a(l4.f19859W5)).booleanValue();
            if (this.f20337a.a(g3.f19368F7, this.f20341e) && this.f20340d.f20349c < this.i && !z10) {
                c.e(this.f20340d);
                int iPow = (int) Math.pow(2.0d, this.f20340d.f20349c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new p(this, iPow, str2, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f20340d.f20349c = 0;
            this.f20340d.f20348b.set(false);
            if (this.f20340d.f20350d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f20340d.f20347a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                l2.a(this.f20340d.f20350d, str2, maxError2);
                this.f20340d.f20350d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            q2 q2Var = (q2) maxAd;
            q2Var.i(this.f20340d.f20347a);
            q2Var.a(SystemClock.elapsedRealtime() - this.f20345j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) q2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f20337a.X().processWaterfallInfoPostback(q2Var.getAdUnitId(), this.f20341e, maxAdWaterfallInfoImpl, null, this.f20346k, q2Var.getRequestLatencyMillis());
            }
            this.f20339c.a(maxAd.getAdUnitId());
            this.f20340d.f20349c = 0;
            if (this.f20340d.f20350d == null) {
                this.f20339c.a(q2Var);
                this.f20340d.f20348b.set(false);
                return;
            }
            q2Var.A().c().a(this.f20340d.f20350d);
            this.f20340d.f20350d.onAdLoaded(q2Var);
            if (q2Var.M().endsWith("load")) {
                this.f20340d.f20350d.onAdRevenuePaid(q2Var);
            }
            this.f20340d.f20350d = null;
            if ((!this.f20337a.c(g3.f19364B7).contains(maxAd.getAdUnitId()) && !this.f20337a.a(g3.f19363A7, maxAd.getFormat())) || this.f20337a.s0().c() || this.f20337a.s0().d()) {
                this.f20340d.f20348b.set(false);
                return;
            }
            Context contextO = (Context) this.f20338b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f20345j = SystemClock.elapsedRealtime();
            this.f20346k = System.currentTimeMillis();
            this.f20344h.put("art", EnumC2121h.SEQUENTIAL_OR_PRECACHE.b());
            this.f20339c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f20342f, this.f20343g, this.f20344h, context, this);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j4, long j10, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f20337a = kVar;
            this.f20338b = new WeakReference(context);
            this.f20339c = dVar;
            this.f20340d = cVar;
            this.f20341e = maxAdFormat;
            this.f20343g = map2;
            this.f20342f = map;
            this.f20344h = map3;
            this.f20345j = j4;
            this.f20346k = j10;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) kVar.a(g3.f19367E7)).intValue());
            } else {
                this.i = ((Integer) kVar.a(g3.f19367E7)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str) {
            this.f20343g.put("retry_delay_sec", Integer.valueOf(i));
            this.f20343g.put("retry_attempt", Integer.valueOf(this.f20340d.f20349c));
            Context contextO = (Context) this.f20338b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f20344h.put("art", EnumC2121h.EXPONENTIAL_RETRY.b());
            this.f20344h.put("era", Integer.valueOf(this.f20340d.f20349c));
            this.f20346k = System.currentTimeMillis();
            this.f20339c.a(str, this.f20341e, this.f20342f, this.f20343g, this.f20344h, context, this);
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

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f20347a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f20348b;

        /* renamed from: c, reason: collision with root package name */
        private int f20349c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0312a f20350d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i = cVar.f20349c;
            cVar.f20349c = i + 1;
            return i;
        }

        private c(String str) {
            this.f20348b = new AtomicBoolean();
            this.f20347a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f20322a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbU = G8.u(str);
        sbU.append(str2 != null ? "-".concat(str2) : "");
        return sbU.toString();
    }

    private q2 e(String str) {
        q2 q2Var;
        synchronized (this.f20326e) {
            q2Var = (q2) this.f20325d.get(str);
            this.f20325d.remove(str);
        }
        return q2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f20324c) {
            this.f20323b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f20326e) {
            z10 = this.f20325d.get(str) != null;
        }
        return z10;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC2121h enumC2121h, Map map, Map map2, Context context, a.InterfaceC0312a interfaceC0312a) {
        q2 q2VarE = (this.f20322a.s0().d() || a7.f(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (q2VarE != null) {
            q2VarE.i(str2);
            q2VarE.A().c().a(interfaceC0312a);
            interfaceC0312a.onAdLoaded(q2VarE);
            if (q2VarE.M().endsWith("load")) {
                interfaceC0312a.onAdRevenuePaid(q2VarE);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f20348b.compareAndSet(false, true)) {
            if (cVarA.f20350d != null && cVarA.f20350d != interfaceC0312a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f20350d = interfaceC0312a;
            return;
        }
        if (q2VarE == null) {
            cVarA.f20350d = interfaceC0312a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC2121h.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f20322a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f20328g) {
            try {
                Integer num = (Integer) this.f20327f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void c(String str) {
        synchronized (this.f20328g) {
            try {
                this.f20322a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20322a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f20327f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f20327f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0312a interfaceC0312a) {
        this.f20322a.q0().a((w4) new d5(str, maxAdFormat, map, context, this.f20322a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0312a)), r5.b.MEDIATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q2 q2Var) {
        synchronized (this.f20326e) {
            try {
                if (this.f20325d.containsKey(q2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + q2Var.getAdUnitId());
                }
                this.f20325d.put(q2Var.getAdUnitId(), q2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f20324c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f20323b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f20323b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f20328g) {
            try {
                this.f20322a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20322a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f20327f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
