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
    private final com.applovin.impl.sdk.k f6783a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6784b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f6785c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f6786d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f6787e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f6788f = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: g, reason: collision with root package name */
    private final Map f6789g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f6790h = new Object();

    public class a implements p5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f6792b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6793c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f6794d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f6795e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0078a f6796f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0078a interfaceC0078a) {
            this.f6791a = j10;
            this.f6792b = map;
            this.f6793c = str;
            this.f6794d = a3Var;
            this.f6795e = context;
            this.f6796f = interfaceC0078a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f6792b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f6791a));
            this.f6792b.put("calfc", Integer.valueOf(e.this.b(this.f6793c)));
            v5 v5Var = new v5(this.f6794d, jSONArray, this.f6795e, e.this.f6783a, this.f6796f);
            if (((Boolean) e.this.f6783a.a(r3.f7472o8)).booleanValue()) {
                e.this.f6783a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                e.this.f6783a.q0().a(v5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0078a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f6798a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f6799b;

        /* renamed from: c, reason: collision with root package name */
        private final e f6800c;

        /* renamed from: d, reason: collision with root package name */
        private final c f6801d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f6802e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f6803f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f6804g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f6805h;

        /* renamed from: i, reason: collision with root package name */
        private final int f6806i;

        /* renamed from: j, reason: collision with root package name */
        private long f6807j;

        /* renamed from: k, reason: collision with root package name */
        private long f6808k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, eVar, kVar, context);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            MaxError maxError2;
            this.f6800c.d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6807j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f6798a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f6808k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && n7.c(this.f6798a) && ((Boolean) this.f6798a.a(x4.A6)).booleanValue();
            if (this.f6798a.a(r3.f7463i8, this.f6802e) && this.f6801d.f6811c < this.f6806i && !z10) {
                c.e(this.f6801d);
                final int iPow = (int) Math.pow(2.0d, this.f6801d.f6811c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6959a.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f6801d.f6811c = 0;
            this.f6801d.f6810b.set(false);
            if (this.f6801d.f6812d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f6801d.f6809a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f6801d.f6812d, str, maxError2);
                this.f6801d.f6812d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f6801d.f6809a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f6807j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f6798a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f6808k, y2Var.getRequestLatencyMillis());
            }
            this.f6800c.a(maxAd.getAdUnitId());
            this.f6801d.f6811c = 0;
            if (this.f6801d.f6812d == null) {
                this.f6800c.a(y2Var);
                this.f6801d.f6810b.set(false);
                int iL = y2Var.L();
                synchronized (this.f6800c.f6787e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f6800c.f6786d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iL) {
                    int i10 = sizeSafely + 1;
                    this.f6798a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6798a.O().a("MediationAdLoadManagerV2", "Preloading waterfall " + i10 + " of " + iL);
                    }
                    a(maxAd);
                    return;
                }
                return;
            }
            y2Var.A().c().a(this.f6801d.f6812d);
            this.f6801d.f6812d.onAdLoaded(y2Var);
            this.f6800c.f6788f.put(maxAd.getAdUnitId(), y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f6801d.f6812d.onAdRevenuePaid(y2Var);
            }
            this.f6801d.f6812d = null;
            if ((!this.f6798a.c(r3.f7458d8).contains(maxAd.getAdUnitId()) && !this.f6798a.a(r3.f7457c8, maxAd.getFormat())) || this.f6798a.s0().c() || this.f6798a.s0().d()) {
                this.f6801d.f6810b.set(false);
                return;
            }
            int iL2 = y2Var.L();
            this.f6798a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6798a.O().a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iL2);
            }
            a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, e eVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f6798a = kVar;
            this.f6799b = new WeakReference(context);
            this.f6800c = eVar;
            this.f6801d = cVar;
            this.f6802e = maxAdFormat;
            this.f6804g = map2;
            this.f6803f = map;
            this.f6805h = map3;
            this.f6807j = j10;
            this.f6808k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f6806i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f6806i = Math.min(2, ((Integer) kVar.a(r3.f7462h8)).intValue());
            } else {
                this.f6806i = ((Integer) kVar.a(r3.f7462h8)).intValue();
            }
        }

        private void a(MaxAd maxAd) {
            Context contextO = (Context) this.f6799b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f6807j = SystemClock.elapsedRealtime();
            this.f6808k = System.currentTimeMillis();
            this.f6805h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f6800c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f6803f, this.f6804g, this.f6805h, context, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f6804g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f6804g.put("retry_attempt", Integer.valueOf(this.f6801d.f6811c));
            Context contextO = (Context) this.f6799b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f6805h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f6805h.put("era", Integer.valueOf(this.f6801d.f6811c));
            this.f6808k = System.currentTimeMillis();
            this.f6800c.a(str, this.f6802e, this.f6803f, this.f6804g, this.f6805h, context, this);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f6809a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f6810b;

        /* renamed from: c, reason: collision with root package name */
        private int f6811c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0078a f6812d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f6811c;
            cVar.f6811c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f6810b = new AtomicBoolean();
            this.f6809a = str;
        }
    }

    public e(com.applovin.impl.sdk.k kVar) {
        this.f6783a = kVar;
    }

    private y2 f(String str) {
        synchronized (this.f6787e) {
            try {
                Queue queue = (Queue) this.f6786d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (y2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(String str) {
        boolean z10;
        synchronized (this.f6787e) {
            z10 = !CollectionUtils.isEmpty((Queue) this.f6786d.get(str));
        }
        return z10;
    }

    private String b(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    public Queue c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        y2 y2Var = (y2) this.f6788f.get(str);
        if (y2Var != null) {
            arrayDeque.add(y2Var);
        }
        synchronized (this.f6785c) {
            try {
                Queue queue = (Queue) this.f6786d.get(str);
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
        synchronized (this.f6790h) {
            try {
                this.f6783a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6783a.O().a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f6789g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f6789g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b(String str) {
        int iIntValue;
        synchronized (this.f6790h) {
            try {
                Integer num = (Integer) this.f6789g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0078a interfaceC0078a) {
        y2 y2VarF = (this.f6783a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : f(str);
        if (y2VarF != null) {
            y2VarF.i(str2);
            y2VarF.A().c().a(interfaceC0078a);
            interfaceC0078a.onAdLoaded(y2VarF);
            this.f6788f.put(str, y2VarF);
            if (y2VarF.O().endsWith("load")) {
                interfaceC0078a.onAdRevenuePaid(y2VarF);
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f6810b.compareAndSet(false, true)) {
            if (cVarA.f6812d != null && cVarA.f6812d != interfaceC0078a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f6812d = interfaceC0078a;
            return;
        }
        if (y2VarF == null) {
            cVarA.f6812d = interfaceC0078a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f6783a, context, null));
    }

    public void c(String str, String str2) {
        synchronized (this.f6785c) {
            this.f6784b.remove(b(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0078a interfaceC0078a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f6783a.q0().a((i5) new p5(a3Var, context, this.f6783a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0078a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f6783a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f6783a.Y();
            s3 s3Var = s3.f7537e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f6783a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f6787e) {
            try {
                Queue arrayDeque = (Queue) this.f6786d.get(y2Var.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f6786d.put(y2Var.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f6785c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f6784b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f6784b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f6790h) {
            try {
                this.f6783a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6783a.O().a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f6789g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
