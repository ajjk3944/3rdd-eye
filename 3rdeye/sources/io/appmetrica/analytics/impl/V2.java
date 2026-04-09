package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import c9.C2097r;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class V2 implements Wa {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f40264n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final T2 f40265o = new T2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f40266a;

    /* renamed from: b, reason: collision with root package name */
    protected final Qh f40267b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f40268c;

    /* renamed from: d, reason: collision with root package name */
    protected final Ln f40269d;

    /* renamed from: e, reason: collision with root package name */
    protected final Pg f40270e;

    /* renamed from: f, reason: collision with root package name */
    protected final N6 f40271f;

    /* renamed from: g, reason: collision with root package name */
    public final C4496b0 f40272g;

    /* renamed from: h, reason: collision with root package name */
    protected final Gi f40273h;
    public Hb i;

    /* renamed from: j, reason: collision with root package name */
    public final J6 f40274j;

    /* renamed from: k, reason: collision with root package name */
    public final C4609fa f40275k;

    /* renamed from: l, reason: collision with root package name */
    public final Ve f40276l;

    /* renamed from: m, reason: collision with root package name */
    public final C4519bn f40277m;

    public V2(Context context, Gi gi, Qh qh, C4609fa c4609fa, J6 j62, Ln ln, Pg pg, N6 n62, C4496b0 c4496b0, Ve ve) {
        Context applicationContext = context.getApplicationContext();
        this.f40266a = applicationContext;
        this.f40273h = gi;
        this.f40267b = qh;
        this.f40275k = c4609fa;
        this.f40269d = ln;
        this.f40270e = pg;
        this.f40271f = n62;
        this.f40272g = c4496b0;
        this.f40276l = ve;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(qh.b().getApiKey());
        this.f40268c = orCreatePublicLogger;
        if (AbstractC4989u3.a(qh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f40274j = j62;
        this.f40277m = new C4519bn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f40268c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f40268c.info("Put error environment pair <%s, %s>", str, str2);
        Qh qh = this.f40267b;
        synchronized (qh) {
            T8 t82 = qh.f40018c;
            t82.f40160b.b(t82.f40159a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC4623fo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f40267b.f()) {
            return;
        }
        this.f40273h.f39541d.c();
        Hb hb = this.i;
        hb.f39573a.removeCallbacks(hb.f39575c, hb.f39574b.f40267b.f40684b.getApiKey());
        this.f40267b.f40020e = true;
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4("", str, 3, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f40268c.info("Clear app environment", new Object[0]);
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        C4683i6 c4683i6N = C4681i4.n();
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str = qh.f40021f;
        }
        gi.a(new Gh(c4683i6N, false, 1, null, new Qh(nf, counterConfiguration, t82, str)));
    }

    public final void d(String str) {
        this.f40273h.f39541d.b();
        Hb hb = this.i;
        Hb.a(hb.f39573a, hb.f39574b, hb.f39575c);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4("", str, 6400, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40267b.f40020e = false;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Cf cf;
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        Gf gf = qh.f40019d;
        synchronized (qh) {
            str = qh.f40021f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey());
        Set set = O9.f39923a;
        JSONObject jSONObject = new JSONObject();
        if (gf != null && (cf = gf.f39532a) != null) {
            try {
                jSONObject.put("preloadInfo", cf.c());
            } catch (Throwable unused) {
            }
        }
        String string = jSONObject.toString();
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(string, "", 6144, 0, orCreatePublicLogger);
        c4681i4.c(str);
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f40268c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f40268c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f40268c.info("Put app environment: <%s, %s>", str, str2);
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        C4683i6 c4683i6B = C4681i4.b(str, str2);
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str3 = qh.f40021f;
        }
        gi.a(new Gh(c4683i6B, false, 1, null, new Qh(nf, counterConfiguration, t82, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArrB;
        C4522c0 c4522c0 = new C4522c0(new C4548d0(this, map));
        Ea ea2 = new Ea();
        J6 j62 = C5065x4.l().f42012a;
        Thread threadA = c4522c0.a();
        Map mapC = null;
        try {
            stackTraceElementArrB = c4522c0.b();
            if (stackTraceElementArrB == null) {
                try {
                    stackTraceElementArrB = threadA.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArrB = null;
        }
        C4907qn c4907qn = (C4907qn) ea2.apply(threadA, stackTraceElementArrB);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C5034vn());
        try {
            mapC = c4522c0.c();
        } catch (SecurityException unused3) {
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != threadA && thread != null) {
                arrayList.add((C4907qn) ea2.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new U(c4907qn, arrayList, j62.b()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f40268c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        for (Ni ni : eCommerceEvent.toProto()) {
            C4681i4 c4681i4 = new C4681i4(LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey()));
            EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
            c4681i4.f41047d = 41000;
            c4681i4.f41045b = c4681i4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ni.f39906a)));
            c4681i4.f41050g = ni.f39907b.getBytesTruncated();
            Nf nf = new Nf(qh.f40683a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
            T8 t82 = qh.f40018c;
            synchronized (qh) {
                str = qh.f40021f;
            }
            gi.a(new Gh(c4681i4, false, 1, null, new Qh(nf, counterConfiguration, t82, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Og og = new Og(str, a(th));
        Gi gi = this.f40273h;
        byte[] byteArray = MessageNano.toByteArray(this.f40270e.fromModel(og));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, str, 5892, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f40268c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4("", str, 1, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Xi xi = U2.f40223a;
        xi.getClass();
        C4752ko c4752koA = xi.a(revenue);
        if (!c4752koA.f41158a) {
            this.f40268c.warning("Passed revenue is not valid. Reason: " + c4752koA.f41159b, new Object[0]);
            return;
        }
        Gi gi = this.f40273h;
        Yi yi = new Yi(revenue, this.f40268c);
        Qh qh = this.f40267b;
        gi.getClass();
        C4681i4 c4681i4A = C4681i4.a(LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey()), yi);
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str = qh.f40021f;
        }
        gi.a(new Gh(c4681i4A, false, 1, null, new Qh(nf, counterConfiguration, t82, str)));
        this.f40268c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Kn knA = Nn.a(th, new U(null, null, this.f40274j.b()), null, (String) this.f40275k.f40848b.a(), (Boolean) this.f40275k.f40849c.a());
        Gi gi = this.f40273h;
        gi.a(gi.a(knA, this.f40267b));
        this.f40268c.info("Unhandled exception received: " + knA, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        Xn xn = new Xn(Xn.f40398c);
        Iterator<UserProfileUpdate<? extends Yn>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            Yn userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Nd) userProfileUpdatePatcher).f39900e = this.f40268c;
            userProfileUpdatePatcher.a(xn);
        }
        C4546co c4546co = new C4546co();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < xn.f40399a.size(); i++) {
            SparseArray sparseArray = xn.f40399a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((Zn) it2.next());
            }
        }
        c4546co.f40672a = (Zn[]) arrayList.toArray(new Zn[arrayList.size()]);
        C4752ko c4752koA = f40265o.a(c4546co);
        if (!c4752koA.f41158a) {
            this.f40268c.warning("UserInfo wasn't sent because " + c4752koA.f41159b, new Object[0]);
            return;
        }
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        C4683i6 c4683i6A = C4681i4.a(c4546co);
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str = qh.f40021f;
        }
        gi.a(new Gh(c4683i6A, false, 1, null, new Qh(nf, counterConfiguration, t82, str)));
        this.f40268c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f40268c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f40268c.info("Send event buffer", new Object[0]);
        Gi gi = this.f40273h;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        C4681i4 c4681i4 = new C4681i4("", "", 256, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z10) {
        this.f40267b.f40684b.setDataSendingEnabled(z10);
        this.f40268c.info("Updated data sending enabled: %s", Boolean.valueOf(z10));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c4681i4.f41058p = Collections.singletonMap(str, bArr);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Gi gi = this.f40273h;
        Qh qh = this.f40267b;
        gi.getClass();
        C4681i4 c4681i4 = new C4681i4(LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey()));
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        c4681i4.f41047d = 40962;
        c4681i4.c(str);
        c4681i4.f41045b = c4681i4.e(str);
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str2 = qh.f40021f;
        }
        gi.a(new Gh(c4681i4, false, 1, null, new Qh(nf, counterConfiguration, t82, str2)));
        this.f40268c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z10) {
        String str;
        Gi gi = this.f40273h;
        D d10 = new D(adRevenue, z10, this.f40277m, this.f40268c);
        Qh qh = this.f40267b;
        gi.getClass();
        C4681i4 c4681i4A = C4681i4.a(LoggerStorage.getOrCreatePublicLogger(qh.f40684b.getApiKey()), d10);
        Nf nf = new Nf(qh.f40683a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(qh.f40684b);
        T8 t82 = qh.f40018c;
        synchronized (qh) {
            str = qh.f40021f;
        }
        gi.a(new Gh(c4681i4A, false, 1, null, new Qh(nf, counterConfiguration, t82, str)));
        this.f40268c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC5122zb.b(adRevenue.payload) + ", autoCollected=" + z10 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void b(String str, String str2) {
        this.f40268c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(str2, str, 1, 0, publicLogger);
        c4681i4.f41054l = E9.JS;
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC4623fo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f40268c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(str2, str, 1, 0, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
    }

    public final Kn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTrace;
        if (th == null) {
            stackTrace = null;
            th2 = null;
        } else if (th instanceof T1) {
            stackTrace = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTrace = null;
        }
        return Nn.a(th2, new U(null, null, this.f40274j.b()), stackTrace != null ? Arrays.asList(stackTrace) : null, (String) this.f40275k.f40848b.a(), (Boolean) this.f40275k.f40849c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        M6 m62 = new M6(new Og(str2, a(th)), str);
        Gi gi = this.f40273h;
        byte[] byteArray = MessageNano.toByteArray(this.f40271f.fromModel(m62));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, str2, 5896, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Kn knA = this.f40276l.a(pluginErrorDetails);
        Gi gi = this.f40273h;
        An an = knA.f39725a;
        String str = an != null ? (String) WrapUtils.getOrDefault(an.f39126a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f40269d.fromModel(knA));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, str, 5891, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final boolean b() {
        return this.f40267b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Gi gi = this.f40273h;
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        gi.a(new C4681i4("", str, 1, 0, publicLogger), this.f40267b, 1, map);
        PublicLogger publicLogger2 = this.f40268c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4739kb, io.appmetrica.analytics.impl.InterfaceC4817nb
    public final void a(Kn kn) {
        Gi gi = this.f40273h;
        Gh ghA = gi.a(kn, this.f40267b);
        Qh qh = ghA.f39537e;
        Ml ml = gi.f39542e;
        if (ml != null) {
            qh.f40684b.setUuid(((Ll) ml).g());
        } else {
            qh.getClass();
        }
        gi.f39540c.b(ghA);
        this.f40268c.info("Unhandled exception received: " + kn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Kn knA;
        Ve ve = this.f40276l;
        if (pluginErrorDetails != null) {
            knA = ve.a(pluginErrorDetails);
        } else {
            ve.getClass();
            knA = null;
        }
        Og og = new Og(str, knA);
        Gi gi = this.f40273h;
        byte[] byteArray = MessageNano.toByteArray(this.f40270e.fromModel(og));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, str, 5896, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4739kb, io.appmetrica.analytics.impl.InterfaceC4573e0
    public final void a(U u8) {
        C4470a0 c4470a0 = new C4470a0(u8, (String) this.f40275k.f40848b.a(), (Boolean) this.f40275k.f40849c.a());
        Gi gi = this.f40273h;
        byte[] byteArray = MessageNano.toByteArray(this.f40272g.fromModel(c4470a0));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, "", 5968, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        String str = null;
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        PublicLogger publicLogger2 = this.f40268c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C4907qn c4907qn = u8.f40213a;
        if (c4907qn != null) {
            str = "Thread[name=" + c4907qn.f41496a + ",tid={" + c4907qn.f41498c + ", priority=" + c4907qn.f41497b + ", group=" + c4907qn.f41499d + "}] at " + C2097r.u0(c4907qn.f41501f, "\n", null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        E9 e92;
        if (f40264n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i = U8.f40230a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            e92 = E9.NATIVE;
        } else if (i == 2) {
            e92 = E9.SYSTEM;
        } else {
            throw new b9.j();
        }
        c4681i4.f41054l = e92;
        c4681i4.f41046c = AbstractC5122zb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            c4681i4.f41058p = moduleEvent.getExtras();
        }
        this.f40273h.a(c4681i4, this.f40267b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Kn knA;
        Ve ve = this.f40276l;
        if (pluginErrorDetails != null) {
            knA = ve.a(pluginErrorDetails);
        } else {
            ve.getClass();
            knA = null;
        }
        M6 m62 = new M6(new Og(str2, knA), str);
        Gi gi = this.f40273h;
        byte[] byteArray = MessageNano.toByteArray(this.f40271f.fromModel(m62));
        PublicLogger publicLogger = this.f40268c;
        Set set = O9.f39923a;
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        C4681i4 c4681i4 = new C4681i4(byteArray, str2, 5896, publicLogger);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4681i4, qh), qh, 1, null);
        this.f40268c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(String str) {
        Gi gi = this.f40273h;
        C4683i6 c4683i6A = C4683i6.a(str);
        Qh qh = this.f40267b;
        gi.getClass();
        gi.a(Gi.a(c4683i6A, qh), qh, 1, null);
    }
}
