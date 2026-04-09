package com.applovin.impl.mediation;

import N7.G8;
import N7.H7;
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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20385a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f20386b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f20387c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f20388d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f20389e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f20390f = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: g, reason: collision with root package name */
    private final Map f20391g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f20392h = new Object();

    public class a implements d5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f20393a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f20394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f20395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f20396d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f20397e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map f20398f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f20399g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0312a f20400h;

        public a(long j4, Map map, String str, MaxAdFormat maxAdFormat, Map map2, Map map3, Context context, a.InterfaceC0312a interfaceC0312a) {
            this.f20393a = j4;
            this.f20394b = map;
            this.f20395c = str;
            this.f20396d = maxAdFormat;
            this.f20397e = map2;
            this.f20398f = map3;
            this.f20399g = context;
            this.f20400h = interfaceC0312a;
        }

        @Override // com.applovin.impl.d5.b
        public void a(JSONArray jSONArray) {
            this.f20394b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f20393a));
            this.f20394b.put("calfc", Integer.valueOf(e.this.b(this.f20395c)));
            j5 j5Var = new j5(this.f20395c, this.f20396d, this.f20397e, this.f20398f, this.f20394b, jSONArray, this.f20399g, e.this.f20385a, this.f20400h);
            if (((Boolean) e.this.f20385a.a(g3.L7)).booleanValue()) {
                e.this.f20385a.q0().a((w4) j5Var, r5.b.MEDIATION);
            } else {
                e.this.f20385a.q0().a(j5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0312a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f20401a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f20402b;

        /* renamed from: c, reason: collision with root package name */
        private final e f20403c;

        /* renamed from: d, reason: collision with root package name */
        private final c f20404d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f20405e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f20406f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f20407g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f20408h;
        private final int i;

        /* renamed from: j, reason: collision with root package name */
        private long f20409j;

        /* renamed from: k, reason: collision with root package name */
        private long f20410k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j4, long j10, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j4, j10, eVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            String str2;
            MaxError maxError2;
            this.f20403c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f20409j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                str2 = str;
                maxError2 = maxError;
                this.f20401a.X().processWaterfallInfoPostback(str2, this.f20405e, maxAdWaterfallInfoImpl, maxError2, this.f20410k, jElapsedRealtime);
            } else {
                str2 = str;
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && a7.c(this.f20401a) && ((Boolean) this.f20401a.a(l4.f19859W5)).booleanValue();
            if (this.f20401a.a(g3.f19368F7, this.f20405e) && this.f20404d.f20413c < this.i && !z10) {
                c.e(this.f20404d);
                int iPow = (int) Math.pow(2.0d, this.f20404d.f20413c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new p(this, iPow, str2, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f20404d.f20413c = 0;
            this.f20404d.f20412b.set(false);
            if (this.f20404d.f20414d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f20404d.f20411a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                l2.a(this.f20404d.f20414d, str2, maxError2);
                this.f20404d.f20414d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            q2 q2Var = (q2) maxAd;
            q2Var.i(this.f20404d.f20411a);
            q2Var.a(SystemClock.elapsedRealtime() - this.f20409j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) q2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f20401a.X().processWaterfallInfoPostback(q2Var.getAdUnitId(), this.f20405e, maxAdWaterfallInfoImpl, null, this.f20410k, q2Var.getRequestLatencyMillis());
            }
            this.f20403c.a(maxAd.getAdUnitId());
            this.f20404d.f20413c = 0;
            if (this.f20404d.f20414d == null) {
                this.f20403c.a(q2Var);
                this.f20404d.f20412b.set(false);
                int iK = q2Var.K();
                synchronized (this.f20403c.f20389e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f20403c.f20388d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iK) {
                    int i = sizeSafely + 1;
                    this.f20401a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20401a.O().a("MediationAdLoadManagerV2", H7.n(i, iK, "Preloading waterfall ", " of "));
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            q2Var.A().c().a(this.f20404d.f20414d);
            this.f20404d.f20414d.onAdLoaded(q2Var);
            this.f20403c.f20390f.put(maxAd.getAdUnitId(), q2Var);
            if (q2Var.M().endsWith("load")) {
                this.f20404d.f20414d.onAdRevenuePaid(q2Var);
            }
            this.f20404d.f20414d = null;
            if ((!this.f20401a.c(g3.f19364B7).contains(maxAd.getAdUnitId()) && !this.f20401a.a(g3.f19363A7, maxAd.getFormat())) || this.f20401a.s0().c() || this.f20401a.s0().d()) {
                this.f20404d.f20412b.set(false);
                return;
            }
            int iK2 = q2Var.K();
            this.f20401a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f20401a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iK2);
            }
            a(maxAd);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j4, long j10, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f20401a = kVar;
            this.f20402b = new WeakReference(context);
            this.f20403c = eVar;
            this.f20404d = cVar;
            this.f20405e = maxAdFormat;
            this.f20407g = map2;
            this.f20406f = map;
            this.f20408h = map3;
            this.f20409j = j4;
            this.f20410k = j10;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.i = Math.min(2, ((Integer) kVar.a(g3.f19367E7)).intValue());
            } else {
                this.i = ((Integer) kVar.a(g3.f19367E7)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f20402b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f20409j = SystemClock.elapsedRealtime();
            this.f20410k = System.currentTimeMillis();
            this.f20408h.put("art", EnumC2121h.SEQUENTIAL_OR_PRECACHE.b());
            this.f20403c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f20406f, this.f20407g, this.f20408h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, String str) {
            this.f20407g.put("retry_delay_sec", Integer.valueOf(i));
            this.f20407g.put("retry_attempt", Integer.valueOf(this.f20404d.f20413c));
            Context contextO = (Context) this.f20402b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f20408h.put("art", EnumC2121h.EXPONENTIAL_RETRY.b());
            this.f20408h.put("era", Integer.valueOf(this.f20404d.f20413c));
            this.f20410k = System.currentTimeMillis();
            this.f20403c.a(str, this.f20405e, this.f20406f, this.f20407g, this.f20408h, context, this);
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
        private final String f20411a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f20412b;

        /* renamed from: c, reason: collision with root package name */
        private int f20413c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0312a f20414d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i = cVar.f20413c;
            cVar.f20413c = i + 1;
            return i;
        }

        private c(String str) {
            this.f20412b = new AtomicBoolean();
            this.f20411a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f20385a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbU = G8.u(str);
        sbU.append(str2 != null ? "-".concat(str2) : "");
        return sbU.toString();
    }

    private q2 f(String str) {
        synchronized (this.f20389e) {
            try {
                Queue queue = (Queue) this.f20388d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (q2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f20389e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f20388d.get(str));
        }
        return z10;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        q2 q2Var = (q2) this.f20390f.get(str);
        if (q2Var != null) {
            arrayDeque.add(q2Var);
        }
        synchronized (this.f20387c) {
            try {
                Queue queue = (Queue) this.f20388d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f20392h) {
            try {
                this.f20385a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20385a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f20391g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f20391g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, EnumC2121h enumC2121h, Map map, Map map2, Context context, a.InterfaceC0312a interfaceC0312a) {
        q2 q2VarF = (this.f20385a.s0().d() || a7.f(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (q2VarF != null) {
            q2VarF.i(str2);
            q2VarF.A().c().a(interfaceC0312a);
            interfaceC0312a.onAdLoaded(q2VarF);
            this.f20390f.put(str, q2VarF);
            if (q2VarF.M().endsWith("load")) {
                interfaceC0312a.onAdRevenuePaid(q2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f20412b.compareAndSet(false, true)) {
            if (cVarA.f20414d != null && cVarA.f20414d != interfaceC0312a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f20414d = interfaceC0312a;
            return;
        }
        if (q2VarF == null) {
            cVarA.f20414d = interfaceC0312a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC2121h.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f20385a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f20392h) {
            try {
                Integer num = (Integer) this.f20391g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f20387c) {
            this.f20386b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0312a interfaceC0312a) {
        this.f20385a.q0().a((w4) new d5(str, maxAdFormat, map, context, this.f20385a, new a(SystemClock.elapsedRealtime(), map3, str, maxAdFormat, map, map2, context, interfaceC0312a)), r5.b.MEDIATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(q2 q2Var) {
        synchronized (this.f20389e) {
            try {
                Queue arrayDeque = (Queue) this.f20388d.get(q2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f20388d.put(q2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(q2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f20387c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f20386b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f20386b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f20392h) {
            try {
                this.f20385a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f20385a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f20391g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
