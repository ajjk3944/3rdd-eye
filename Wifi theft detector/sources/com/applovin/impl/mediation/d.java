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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6712a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6713b = new HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private final Object f6714c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f6715d = new HashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private final Object f6716e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map f6717f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Object f6718g = new Object();

    public class a implements p5.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f6719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f6720b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f6721c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a3 f6722d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f6723e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0078a f6724f;

        public a(long j10, Map map, String str, a3 a3Var, Context context, a.InterfaceC0078a interfaceC0078a) {
            this.f6719a = j10;
            this.f6720b = map;
            this.f6721c = str;
            this.f6722d = a3Var;
            this.f6723e = context;
            this.f6724f = interfaceC0078a;
        }

        @Override // com.applovin.impl.p5.b
        public void a(JSONArray jSONArray) {
            this.f6720b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f6719a));
            this.f6720b.put("calfc", Integer.valueOf(d.this.b(this.f6721c)));
            v5 v5Var = new v5(this.f6722d, jSONArray, this.f6723e, d.this.f6712a, this.f6724f);
            if (((Boolean) d.this.f6712a.a(r3.f7472o8)).booleanValue()) {
                d.this.f6712a.q0().a((i5) v5Var, d6.b.MEDIATION);
            } else {
                d.this.f6712a.q0().a(v5Var);
            }
        }
    }

    public static class b implements a.InterfaceC0078a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f6726a;

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference f6727b;

        /* renamed from: c, reason: collision with root package name */
        private final d f6728c;

        /* renamed from: d, reason: collision with root package name */
        private final c f6729d;

        /* renamed from: e, reason: collision with root package name */
        private final MaxAdFormat f6730e;

        /* renamed from: f, reason: collision with root package name */
        private final Map f6731f;

        /* renamed from: g, reason: collision with root package name */
        private final Map f6732g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f6733h;

        /* renamed from: i, reason: collision with root package name */
        private final int f6734i;

        /* renamed from: j, reason: collision with root package name */
        private long f6735j;

        /* renamed from: k, reason: collision with root package name */
        private long f6736k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j10, j11, dVar, kVar, context);
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
            this.f6728c.c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6735j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f6726a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f6736k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z10 = maxError2.getCode() == -5603 && n7.c(this.f6726a) && ((Boolean) this.f6726a.a(x4.A6)).booleanValue();
            if (this.f6726a.a(r3.f7463i8, this.f6730e) && this.f6729d.f6739c < this.f6734i && !z10) {
                c.e(this.f6729d);
                final int iPow = (int) Math.pow(2.0d, this.f6729d.f6739c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6952a.a(iPow, str);
                    }
                }, TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f6729d.f6739c = 0;
            this.f6729d.f6738b.set(false);
            if (this.f6729d.f6740d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f6729d.f6737a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                t2.a(this.f6729d.f6740d, str, maxError2);
                this.f6729d.f6740d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            y2 y2Var = (y2) maxAd;
            y2Var.i(this.f6729d.f6737a);
            y2Var.a(SystemClock.elapsedRealtime() - this.f6735j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) y2Var.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f6726a.X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f6736k, y2Var.getRequestLatencyMillis());
            }
            this.f6728c.a(maxAd.getAdUnitId());
            this.f6729d.f6739c = 0;
            if (this.f6729d.f6740d == null) {
                this.f6728c.a(y2Var);
                this.f6729d.f6738b.set(false);
                return;
            }
            y2Var.A().c().a(this.f6729d.f6740d);
            this.f6729d.f6740d.onAdLoaded(y2Var);
            if (y2Var.O().endsWith("load")) {
                this.f6729d.f6740d.onAdRevenuePaid(y2Var);
            }
            this.f6729d.f6740d = null;
            if (((Boolean) this.f6726a.a(r3.f7460f8)).booleanValue() || !this.f6728c.a(maxAd)) {
                this.f6729d.f6738b.set(false);
                return;
            }
            Context contextO = (Context) this.f6727b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f6735j = SystemClock.elapsedRealtime();
            this.f6736k = System.currentTimeMillis();
            this.f6733h.put("art", com.applovin.impl.i.SEQUENTIAL_OR_PRECACHE.b());
            this.f6728c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f6731f, this.f6732g, this.f6733h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j10, long j11, d dVar, com.applovin.impl.sdk.k kVar, Context context) {
            this.f6726a = kVar;
            this.f6727b = new WeakReference(context);
            this.f6728c = dVar;
            this.f6729d = cVar;
            this.f6730e = maxAdFormat;
            this.f6732g = map2;
            this.f6731f = map;
            this.f6733h = map3;
            this.f6735j = j10;
            this.f6736k = j11;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f6734i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f6734i = Math.min(2, ((Integer) kVar.a(r3.f7462h8)).intValue());
            } else {
                this.f6734i = ((Integer) kVar.a(r3.f7462h8)).intValue();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10, String str) {
            this.f6732g.put("retry_delay_sec", Integer.valueOf(i10));
            this.f6732g.put("retry_attempt", Integer.valueOf(this.f6729d.f6739c));
            Context contextO = (Context) this.f6727b.get();
            if (contextO == null) {
                contextO = com.applovin.impl.sdk.k.o();
            }
            Context context = contextO;
            this.f6733h.put("art", com.applovin.impl.i.EXPONENTIAL_RETRY.b());
            this.f6733h.put("era", Integer.valueOf(this.f6729d.f6739c));
            this.f6736k = System.currentTimeMillis();
            this.f6728c.a(str, this.f6730e, this.f6731f, this.f6732g, this.f6733h, context, this);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f6737a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f6738b;

        /* renamed from: c, reason: collision with root package name */
        private int f6739c;

        /* renamed from: d, reason: collision with root package name */
        private volatile a.InterfaceC0078a f6740d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ int e(c cVar) {
            int i10 = cVar.f6739c;
            cVar.f6739c = i10 + 1;
            return i10;
        }

        private c(String str) {
            this.f6738b = new AtomicBoolean();
            this.f6737a = str;
        }
    }

    public d(com.applovin.impl.sdk.k kVar) {
        this.f6712a = kVar;
    }

    private y2 e(String str) {
        y2 y2Var;
        synchronized (this.f6716e) {
            y2Var = (y2) this.f6715d.get(str);
            this.f6715d.remove(str);
        }
        return y2Var;
    }

    public void c(String str, String str2) {
        synchronized (this.f6714c) {
            this.f6713b.remove(b(str, str2));
        }
    }

    public boolean d(String str) {
        boolean z10;
        synchronized (this.f6716e) {
            z10 = this.f6715d.get(str) != null;
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

    public int b(String str) {
        int iIntValue;
        synchronized (this.f6718g) {
            try {
                Integer num = (Integer) this.f6717f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, com.applovin.impl.i iVar, Map map, Map map2, Context context, a.InterfaceC0078a interfaceC0078a) {
        y2 y2VarE = (this.f6712a.s0().d() || n7.h(com.applovin.impl.sdk.k.o())) ? null : e(str);
        if (y2VarE != null) {
            y2VarE.i(str2);
            y2VarE.A().c().a(interfaceC0078a);
            interfaceC0078a.onAdLoaded(y2VarE);
            if (y2VarE.O().endsWith("load")) {
                interfaceC0078a.onAdRevenuePaid(y2VarE);
            }
            if (((Boolean) this.f6712a.a(r3.f7460f8)).booleanValue() && a((MaxAd) y2VarE)) {
                return;
            }
        }
        c cVarA = a(str, str2);
        if (!cVarA.f6738b.compareAndSet(false, true)) {
            if (cVarA.f6740d != null && cVarA.f6740d != interfaceC0078a) {
                com.applovin.impl.sdk.o.j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarA.f6740d = interfaceC0078a;
            return;
        }
        if (y2VarE == null) {
            cVarA.f6740d = interfaceC0078a;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", iVar.b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarA, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f6712a, context, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        synchronized (this.f6718g) {
            try {
                this.f6712a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6712a.O().a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f6717f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f6717f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, a.InterfaceC0078a interfaceC0078a) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a3 a3Var = new a3(str, maxAdFormat, map, map2, map3, a(str, maxAdFormat));
        this.f6712a.q0().a((i5) new p5(a3Var, context, this.f6712a, new a(jElapsedRealtime, map3, str, a3Var, context, interfaceC0078a)), d6.b.MEDIATION);
    }

    private com.applovin.impl.h a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f6712a.a(x4.M4)).booleanValue()) {
            u3 u3VarY = this.f6712a.Y();
            s3 s3Var = s3.f7537e;
            Map mapA = u3VarY.a(s3Var, t3.a(str));
            s3.a aVar = s3.a.SESSION;
            int iA = a(mapA, aVar);
            s3.a aVar2 = s3.a.INSTALL;
            int iA2 = a(mapA, aVar2);
            Map mapA2 = this.f6712a.Y().a(s3Var, t3.a(maxAdFormat));
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
        synchronized (this.f6716e) {
            try {
                if (this.f6715d.containsKey(y2Var.getAdUnitId())) {
                    com.applovin.impl.sdk.o.h("AppLovinSdk", "Ad in cache already: " + y2Var.getAdUnitId());
                }
                this.f6715d.put(y2Var.getAdUnitId(), y2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private c a(String str, String str2) {
        c cVar;
        synchronized (this.f6714c) {
            try {
                String strB = b(str, str2);
                cVar = (c) this.f6713b.get(strB);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f6713b.put(strB, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f6718g) {
            try {
                this.f6712a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6712a.O().a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f6717f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(MaxAd maxAd) {
        return ((!this.f6712a.c(r3.f7458d8).contains(maxAd.getAdUnitId()) && !this.f6712a.a(r3.f7457c8, maxAd.getFormat())) || this.f6712a.s0().c() || this.f6712a.s0().d()) ? false : true;
    }
}
