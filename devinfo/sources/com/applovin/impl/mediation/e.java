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
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4721a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4722b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f4723c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f4724d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f4725e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f4726f = DesugarCollections.synchronizedMap(new HashMap(4));
    private final Map g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f4727h = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements p5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f4728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f4729b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4730c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f4731d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f4732e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0014a f4733f;

        public a(long j, Map map, String str, a3 a3Var, Context context, a.InterfaceC0014a interfaceC0014a) {
            this.f4728a = j;
            this.f4729b = map;
            this.f4730c = str;
            this.f4731d = a3Var;
            this.f4732e = context;
            this.f4733f = interfaceC0014a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f4729b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f4728a));
            this.f4729b.put("calfc", Integer.valueOf(e.this.b(this.f4730c)));
            v5 v5Var = new v5(this.f4731d, jSONArray, this.f4732e, e.this.f4721a, this.f4733f);
            if (((Boolean) e.this.f4721a.a(r3.f5231o8)).booleanValue()) {
                e.this.f4721a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f4721a.q0().a(v5Var);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b implements a.InterfaceC0014a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f4734a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f4735b;

        /* renamed from: c, reason: collision with root package name */
        private final e f4736c;

        /* renamed from: d, reason: collision with root package name */
        private final c f4737d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f4738e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f4739f;
        private final Map g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f4740h;

        /* renamed from: i, reason: collision with root package name */
        private final int f4741i;
        private long j;

        /* renamed from: k, reason: collision with root package name */
        private long f4742k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j8, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j8, eVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f4736c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f4734a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f4742k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z3 = maxError2.getCode() == -5603 && n7.c(this.f4734a) && ((Boolean) this.f4734a.a(x4.A6)).booleanValue();
            if (this.f4734a.a(r3.f5224i8, this.f4738e) && this.f4737d.f4745c < this.f4741i && !z3) {
                c.e(this.f4737d);
                int iPow = (int) Math.pow(2.0d, this.f4737d.f4745c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new m(this, iPow, str, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f4737d.f4745c = 0;
            this.f4737d.f4744b.set(false);
            if (this.f4737d.f4746d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f4737d.f4743a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f4737d.f4746d, str, maxError2);
                this.f4737d.f4746d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f4737d.f4743a);
            y2Var.a(SystemClock.elapsedRealtime() - this.j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f4734a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f4742k, y2Var.getRequestLatencyMillis());
            }
            this.f4736c.a(maxAd.getAdUnitId());
            this.f4737d.f4745c = 0;
            if (this.f4737d.f4746d == null) {
                this.f4736c.a(y2Var);
                this.f4737d.f4744b.set(false);
                int iL = y2Var.L();
                synchronized (this.f4736c.f4725e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f4736c.f4724d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i4 = sizeSafely + 1;
                    this.f4734a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4734a.O().a("MediationAdLoadManagerV2", a0.g.i(i4, iL, "Preloading waterfall ", " of "));
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f4737d.f4746d);
            this.f4737d.f4746d.onAdLoaded(y2Var);
            this.f4736c.f4726f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f4737d.f4746d.onAdRevenuePaid(y2Var);
            }
            this.f4737d.f4746d = null;
            if ((!this.f4734a.c(r3.f5220d8).contains(maxAd.getAdUnitId()) && !this.f4734a.a(r3.f5219c8, maxAd.getFormat())) || this.f4734a.s0().c() || this.f4734a.s0().d()) {
                this.f4737d.f4744b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f4734a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f4734a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j8, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f4734a = kVar;
            this.f4735b = new WeakReference(context);
            this.f4736c = eVar;
            this.f4737d = cVar;
            this.f4738e = maxAdFormat;
            this.g = map2;
            this.f4739f = map;
            this.f4740h = map3;
            this.j = j;
            this.f4742k = j8;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f4741i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f4741i = Math.min(2, ((Integer) kVar.a(r3.h8)).intValue());
            } else {
                this.f4741i = ((Integer) kVar.a(r3.h8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f4735b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.j = SystemClock.elapsedRealtime();
            this.f4742k = System.currentTimeMillis();
            this.f4740h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f4736c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f4739f, this.g, this.f4740h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i4, String str) {
            this.g.put("retry_delay_sec", Integer.valueOf(i4));
            this.g.put("retry_attempt", Integer.valueOf(this.f4737d.f4745c));
            Context contextO = (Context) this.f4735b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f4740h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f4740h.put("era", Integer.valueOf(this.f4737d.f4745c));
            this.f4742k = System.currentTimeMillis();
            this.f4736c.a(str, this.f4738e, this.f4739f, this.g, this.f4740h, context, this);
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
        private final String f4743a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f4744b;

        /* renamed from: c, reason: collision with root package name */
        private int f4745c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0014a f4746d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i4 = cVar.f4745c;
            cVar.f4745c = i4 + 1;
            return i4;
        }

        private c(String str) {
            this.f4744b = new AtomicBoolean();
            this.f4743a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f4721a = kVar;
    }

    private String b(String str, String str2) {
        StringBuilder sbZ = d.h.z(str);
        sbZ.append(str2 != null ? "-".concat(str2) : "");
        return sbZ.toString();
    }

    private y2 f(String str) {
        synchronized (this.f4725e) {
            try {
                Queue queue = (Queue) this.f4724d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(String str) {
        boolean z3;
        synchronized (this.f4725e) {
            z3 = !CollectionUtils.isEmpty((Queue) this.f4724d.get(str));
        }
        return z3;
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f4726f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f4723c) {
            try {
                Queue queue = (Queue) this.f4724d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayDeque;
    }

    public void d(String str) {
        synchronized (this.f4727h) {
            try {
                this.f4721a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4721a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0014a interfaceC0014a) {
        y2 y2VarF = (this.f4721a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0014a);
            interfaceC0014a.onAdLoaded(y2VarF);
            this.f4726f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0014a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f4744b.compareAndSet(false, true)) {
            if (cVarA.f4746d != null && cVarA.f4746d != interfaceC0014a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f4746d = interfaceC0014a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f4746d = interfaceC0014a;
        }
        Map mapR = a0.g.r();
        mapR.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapR.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapR, context, new b(map, map2, mapR, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f4721a, context, null));
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f4727h) {
            try {
                Integer num = (Integer) this.g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void c(String str, String str2) {
        synchronized (this.f4723c) {
            this.f4722b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0014a interfaceC0014a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f4721a.q0().a((i5) new p5(a3Var, context, this.f4721a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0014a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f4721a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f4721a.Y();
            s3 s3Var = s3.f5289e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f4721a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f4725e) {
            try {
                Queue arrayDeque = (Queue) this.f4724d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f4724d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f4723c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f4722b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f4722b.put(strB, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f4727h) {
            try {
                this.f4721a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4721a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.g.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
