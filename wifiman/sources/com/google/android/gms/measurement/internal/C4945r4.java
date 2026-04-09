package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import k2.AbstractC6359a;
import o.C7010a;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4945r4 extends I2 {

    /* renamed from: c, reason: collision with root package name */
    private C4867h5 f36688c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4906m4 f36689d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f36690e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36691f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f36692g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f36693h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f36694i;

    /* renamed from: j, reason: collision with root package name */
    private int f36695j;

    /* renamed from: k, reason: collision with root package name */
    private A f36696k;

    /* renamed from: l, reason: collision with root package name */
    private A f36697l;

    /* renamed from: m, reason: collision with root package name */
    private PriorityQueue f36698m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f36699n;

    /* renamed from: o, reason: collision with root package name */
    private C4839e4 f36700o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicLong f36701p;

    /* renamed from: q, reason: collision with root package name */
    private long f36702q;

    /* renamed from: r, reason: collision with root package name */
    final D7 f36703r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f36704s;

    /* renamed from: t, reason: collision with root package name */
    private A f36705t;

    /* renamed from: u, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f36706u;

    /* renamed from: v, reason: collision with root package name */
    private A f36707v;

    /* renamed from: w, reason: collision with root package name */
    private final w7 f36708w;

    protected C4945r4(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36690e = new CopyOnWriteArraySet();
        this.f36693h = new Object();
        this.f36694i = false;
        this.f36695j = 1;
        this.f36704s = true;
        this.f36708w = new C4804a5(this);
        this.f36692g = new AtomicReference();
        this.f36700o = C4839e4.f36433c;
        this.f36702q = -1L;
        this.f36701p = new AtomicLong(0L);
        this.f36703r = new D7(c4976v3);
    }

    public static int B(String str) {
        AbstractC7901p.f(str);
        return 25;
    }

    private final EnumC4962t5 C(final N6 n62) throws MalformedURLException {
        try {
            URL url = new URI(n62.f36140c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strD = l().D();
            zzj().G().d("[sgtm] Uploading data from app. row_id, url, uncompressed size", Long.valueOf(n62.f36138a), n62.f36140c, Integer.valueOf(n62.f36139b.length));
            if (!TextUtils.isEmpty(n62.f36144g)) {
                zzj().G().c("[sgtm] Uploading data from app. row_id", Long.valueOf(n62.f36138a), n62.f36144g);
            }
            HashMap map = new HashMap();
            for (String str : n62.f36141d.keySet()) {
                String string = n62.f36141d.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            C4915n5 c4915n5F = f();
            byte[] bArr = n62.f36139b;
            InterfaceC4899l5 interfaceC4899l5 = new InterfaceC4899l5() { // from class: com.google.android.gms.measurement.internal.C4
                @Override // com.google.android.gms.measurement.internal.InterfaceC4899l5
                public final void a(String str2, int i10, Throwable th2, byte[] bArr2, Map map2) {
                    C4945r4.a0(this.f35809a, atomicReference, n62, str2, i10, th2, bArr2, map2);
                }
            };
            c4915n5F.l();
            AbstractC7901p.l(url);
            AbstractC7901p.l(bArr);
            AbstractC7901p.l(interfaceC4899l5);
            c4915n5F.zzl().v(new RunnableC4931p5(c4915n5F, strD, url, bArr, map, interfaceC4899l5));
            try {
                x7 x7VarG = g();
                long jA = x7VarG.zzb().a() + 60000;
                synchronized (atomicReference) {
                    for (long jA2 = 60000; atomicReference.get() == null && jA2 > 0; jA2 = jA - x7VarG.zzb().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                zzj().H().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC4962t5.UNKNOWN : (EnumC4962t5) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            zzj().C().d("[sgtm] Bad upload url for row_id", n62.f36140c, Long.valueOf(n62.f36138a), e10);
            return EnumC4962t5.FAILURE;
        }
    }

    private final void J(Bundle bundle, int i10, long j10) {
        u();
        String strK = C4839e4.k(bundle);
        if (strK != null) {
            zzj().I().b("Ignoring invalid consent setting", strK);
            zzj().I().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zG = zzl().G();
        C4839e4 c4839e4C = C4839e4.c(bundle, i10);
        if (c4839e4C.y()) {
            O(c4839e4C, zG);
        }
        D dB = D.b(bundle, i10);
        if (dB.k()) {
            M(dB, zG);
        }
        Boolean boolE = D.e(bundle);
        if (boolE != null) {
            String str = i10 == -30 ? "tcf" : "app";
            if (zG) {
                m0(str, "allow_personalized_ads", boolE.toString(), j10);
            } else {
                o0(str, "allow_personalized_ads", boolE.toString(), false, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0() {
        j();
        String strA = e().f36275o.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                m0("app", "_npa", null, zzb().a());
            } else {
                m0("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), zzb().a());
            }
        }
        if (!this.f36331a.n() || !this.f36704s) {
            zzj().B().a("Updating Scion state (FE)");
            q().f0();
        } else {
            zzj().B().a("Recording app launch after enabling measurement for the first time (FE)");
            C0();
            r().f36854e.a();
            zzl().z(new N4(this));
        }
    }

    static /* synthetic */ void R0(C4945r4 c4945r4, int i10) {
        if (c4945r4.f36696k == null) {
            c4945r4.f36696k = new K4(c4945r4, c4945r4.f36331a);
        }
        c4945r4.f36696k.b(i10 * 1000);
    }

    public static /* synthetic */ void S(C4945r4 c4945r4, SharedPreferences sharedPreferences, String str) {
        if (c4945r4.a().p(N.f36096l1)) {
            if (!Objects.equals(str, "IABTCF_TCString") && !Objects.equals(str, "IABTCF_gdprApplies") && !Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
                return;
            }
        } else if (!Objects.equals(str, "IABTCF_TCString")) {
            return;
        }
        c4945r4.zzj().G().a("IABTCF_TCString change picked up in listener.");
        ((A) AbstractC7901p.l(c4945r4.f36707v)).b(500L);
    }

    static /* synthetic */ void S0(C4945r4 c4945r4, Bundle bundle) {
        c4945r4.j();
        c4945r4.u();
        AbstractC7901p.l(bundle);
        String strF = AbstractC7901p.f(bundle.getString("name"));
        if (!c4945r4.f36331a.n()) {
            c4945r4.zzj().G().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c4945r4.q().F(new C4877j(bundle.getString("app_id"), "", new r7(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c4945r4.g().D(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public static /* synthetic */ void T(C4945r4 c4945r4, Bundle bundle) {
        Bundle bundle2;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            bundle2 = new Bundle(c4945r4.e().f36262A.a());
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    c4945r4.g();
                    if (x7.e0(obj)) {
                        c4945r4.g();
                        x7.U(c4945r4.f36708w, 27, null, null, 0);
                    }
                    c4945r4.zzj().I().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (x7.D0(str)) {
                    c4945r4.zzj().I().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundle2.remove(str);
                } else if (c4945r4.g().h0("param", str, c4945r4.a().n(null, false), obj)) {
                    c4945r4.g().K(bundle2, str, obj);
                }
            }
            c4945r4.g();
            if (x7.d0(bundle2, c4945r4.a().w())) {
                c4945r4.g();
                x7.U(c4945r4.f36708w, 26, null, null, 0);
                c4945r4.zzj().I().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        c4945r4.e().f36262A.b(bundle2);
        if (!bundle.isEmpty() || c4945r4.a().p(N.f36075e1)) {
            c4945r4.q().z(bundle2);
        }
    }

    public static /* synthetic */ void U(C4945r4 c4945r4, Bundle bundle, long j10) {
        if (TextUtils.isEmpty(c4945r4.l().E())) {
            c4945r4.J(bundle, 0, j10);
        } else {
            c4945r4.zzj().I().a("Using developer consent only; google app id found");
        }
    }

    static /* synthetic */ void V(C4945r4 c4945r4, C4839e4 c4839e4, long j10, boolean z10, boolean z11) {
        c4945r4.j();
        c4945r4.u();
        C4839e4 c4839e4J = c4945r4.e().J();
        if (j10 <= c4945r4.f36702q && C4839e4.l(c4839e4J.b(), c4839e4.b())) {
            c4945r4.zzj().F().b("Dropped out-of-date consent setting, proposed settings", c4839e4);
            return;
        }
        if (!c4945r4.e().w(c4839e4)) {
            c4945r4.zzj().F().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c4839e4.b()));
            return;
        }
        c4945r4.zzj().G().b("Setting storage consent(FE)", c4839e4);
        c4945r4.f36702q = j10;
        if (c4945r4.q().j0()) {
            c4945r4.q().o0(z10);
        } else {
            c4945r4.q().W(z10);
        }
        if (z11) {
            c4945r4.q().R(new AtomicReference());
        }
    }

    private final void V0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().z(new O4(this, str, str2, j10, x7.z(bundle), z10, z11, z12, str3));
    }

    public static /* synthetic */ void X(C4945r4 c4945r4, String str) {
        if (c4945r4.l().I(str)) {
            c4945r4.l().G();
        }
    }

    public static /* synthetic */ void Y(C4945r4 c4945r4, List list) {
        c4945r4.j();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray sparseArrayH = c4945r4.e().H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                K6 k62 = (K6) it.next();
                if (!sparseArrayH.contains(k62.f35973c) || ((Long) sparseArrayH.get(k62.f35973c)).longValue() < k62.f35972b) {
                    c4945r4.A0().add(k62);
                }
            }
            c4945r4.I0();
        }
    }

    public static /* synthetic */ void Z(C4945r4 c4945r4, AtomicReference atomicReference) {
        Bundle bundleA = c4945r4.e().f36276p.a();
        C5 c5Q = c4945r4.q();
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        c5Q.S(atomicReference, bundleA);
    }

    public static /* synthetic */ void a0(C4945r4 c4945r4, AtomicReference atomicReference, N6 n62, String str, int i10, Throwable th2, byte[] bArr, Map map) {
        EnumC4962t5 enumC4962t5;
        c4945r4.j();
        if ((i10 == 200 || i10 == 204 || i10 == 304) && th2 == null) {
            c4945r4.zzj().G().b("[sgtm] Upload succeeded for row_id", Long.valueOf(n62.f36138a));
            enumC4962t5 = EnumC4962t5.SUCCESS;
        } else {
            c4945r4.zzj().H().d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(n62.f36138a), Integer.valueOf(i10), th2);
            enumC4962t5 = Arrays.asList(((String) N.f36117u.a(null)).split(",")).contains(String.valueOf(i10)) ? EnumC4962t5.BACKOFF : EnumC4962t5.FAILURE;
        }
        c4945r4.q().E(new C4861h(n62.f36138a, enumC4962t5.zza(), n62.f36143f));
        c4945r4.zzj().G().c("[sgtm] Updated status for row_id", Long.valueOf(n62.f36138a), enumC4962t5);
        synchronized (atomicReference) {
            atomicReference.set(enumC4962t5);
            atomicReference.notifyAll();
        }
    }

    static /* synthetic */ void b1(C4945r4 c4945r4, Bundle bundle) {
        c4945r4.j();
        c4945r4.u();
        AbstractC7901p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC7901p.f(string);
        AbstractC7901p.f(string2);
        AbstractC7901p.l(bundle.get("value"));
        if (!c4945r4.f36331a.n()) {
            c4945r4.zzj().G().a("Conditional property not set since app measurement is disabled");
            return;
        }
        r7 r7Var = new r7(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            L lD = c4945r4.g().D(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c4945r4.q().F(new C4877j(bundle.getString("app_id"), string2, r7Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c4945r4.g().D(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), lD, bundle.getLong("time_to_live"), c4945r4.g().D(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(Boolean bool, boolean z10) {
        j();
        u();
        zzj().B().b("Setting app measurement enabled (FE)", bool);
        e().r(bool);
        if (z10) {
            e().B(bool);
        }
        if (this.f36331a.o() || !(bool == null || bool.booleanValue())) {
            L0();
        }
    }

    private final void i0(String str, String str2, long j10, Object obj) {
        zzl().z(new R4(this, str, str2, obj, j10));
    }

    static /* synthetic */ int z(C4945r4 c4945r4, Throwable th2) {
        String message = th2.getMessage();
        c4945r4.f36699n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            c4945r4.f36699n = true;
        }
        return 1;
    }

    final PriorityQueue A0() {
        if (this.f36698m == null) {
            this.f36698m = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.u4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((K6) obj).f35972b);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.t4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f36698m;
    }

    public final void B0() {
        j();
        u();
        C5 c5Q = q();
        c5Q.j();
        c5Q.u();
        if (c5Q.k0() && c5Q.g().E0() < 242600) {
            return;
        }
        q().Z();
    }

    public final void C0() {
        j();
        u();
        if (this.f36331a.q()) {
            Boolean boolC = a().C("google_analytics_deferred_deep_link_enabled");
            if (boolC != null && boolC.booleanValue()) {
                zzj().B().a("Deferred Deep Link feature enabled.");
                zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.B4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35796a.G0();
                    }
                });
            }
            q().a0();
            this.f36704s = false;
            String strN = e().N();
            if (TextUtils.isEmpty(strN)) {
                return;
            }
            b().l();
            if (strN.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strN);
            c1("auto", "_ou", bundle);
        }
    }

    final void D0() {
        j();
        A a10 = this.f36697l;
        if (a10 != null) {
            a10.a();
        }
    }

    public final ArrayList E(String str, String str2) {
        if (zzl().G()) {
            zzj().C().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C4834e.a()) {
            zzj().C().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f36331a.zzl().r(atomicReference, 5000L, "get conditional user properties", new V4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return x7.p0(list);
        }
        zzj().C().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final void E0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f36688c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f36688c);
    }

    public final Map F(String str, String str2, boolean z10) {
        if (zzl().G()) {
            zzj().C().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (C4834e.a()) {
            zzj().C().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f36331a.zzl().r(atomicReference, 5000L, "get user properties", new Y4(this, atomicReference, null, str, str2, z10));
        List<r7> list = (List) atomicReference.get();
        if (list == null) {
            zzj().C().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        C7010a c7010a = new C7010a(list.size());
        for (r7 r7Var : list) {
            Object objB = r7Var.b();
            if (objB != null) {
                c7010a.put(r7Var.f36713b, objB);
            }
        }
        return c7010a;
    }

    final void F0() {
        if (com.google.android.gms.internal.measurement.U6.a() && a().p(N.f36054W0)) {
            if (zzl().G()) {
                zzj().C().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C4834e.a()) {
                zzj().C().a("Cannot get trigger URIs from main thread");
                return;
            }
            u();
            zzj().G().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().r(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.v4
                @Override // java.lang.Runnable
                public final void run() {
                    C4945r4.Z(this.f36834a, atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().C().a("Timed out waiting for get trigger URIs");
            } else {
                zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.y4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4945r4.Y(this.f36883a, list);
                    }
                });
            }
        }
    }

    public final void G(long j10) {
        U0(null);
        zzl().z(new U4(this, j10));
    }

    public final void G0() {
        j();
        if (e().f36282v.b()) {
            zzj().B().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = e().f36283w.a();
        e().f36283w.b(1 + jA);
        if (jA >= 5) {
            zzj().H().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f36282v.a(true);
        } else {
            if (this.f36705t == null) {
                this.f36705t = new S4(this, this.f36331a);
            }
            this.f36705t.b(0L);
        }
    }

    public final void H(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            zzj().F().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzj().F().a("[sgtm] Preview Mode was not enabled.");
            a().J(null);
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        zzj().F().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
        a().J(queryParameter2);
    }

    public final void H0() {
        D6 d62;
        D6 d63;
        j();
        zzj().B().a("Handle tcf update.");
        SharedPreferences sharedPreferencesE = e().E();
        HashMap map = new HashMap();
        C4936q2 c4936q2 = N.f36096l1;
        if (((Boolean) c4936q2.a(null)).booleanValue()) {
            d62 = new D6(new G6(sharedPreferencesE).c());
        } else {
            String strE = G6.e(sharedPreferencesE, "IABTCF_VendorConsents");
            if (!"".equals(strE) && strE.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strE.charAt(754)));
            }
            int iA = G6.a(sharedPreferencesE, "IABTCF_gdprApplies");
            if (iA != -1) {
                map.put("gdprApplies", String.valueOf(iA));
            }
            int iA2 = G6.a(sharedPreferencesE, "IABTCF_EnableAdvertiserConsentMode");
            if (iA2 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iA2));
            }
            int iA3 = G6.a(sharedPreferencesE, "IABTCF_PolicyVersion");
            if (iA3 != -1) {
                map.put("PolicyVersion", String.valueOf(iA3));
            }
            String strE2 = G6.e(sharedPreferencesE, "IABTCF_PurposeConsents");
            if (!"".equals(strE2)) {
                map.put("PurposeConsents", strE2);
            }
            int iA4 = G6.a(sharedPreferencesE, "IABTCF_CmpSdkID");
            if (iA4 != -1) {
                map.put("CmpSdkID", String.valueOf(iA4));
            }
            d62 = new D6(map);
        }
        zzj().G().b("Tcf preferences read", d62);
        if (!a().p(c4936q2)) {
            if (e().x(d62)) {
                Bundle bundleA = d62.a();
                zzj().G().b("Consent generated from Tcf", bundleA);
                if (bundleA != Bundle.EMPTY) {
                    J(bundleA, -30, zzb().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", d62.d());
                c1("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        String strY = e().y();
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(strY)) {
            d63 = new D6(map2);
        } else {
            for (String str : strY.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && G6.f35885o.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            d63 = new D6(map2);
        }
        if (e().x(d62)) {
            Bundle bundleA2 = d62.a();
            zzj().G().b("Consent generated from Tcf", bundleA2);
            if (bundleA2 != Bundle.EMPTY) {
                J(bundleA2, -30, zzb().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", d62.b(d63));
            bundle2.putString("_tcfd2", d62.c());
            bundle2.putString("_tcfd", d62.d());
            c1("auto", "_tcf", bundle2);
        }
    }

    public final void I(Bundle bundle) {
        K(bundle, zzb().a());
    }

    final void I0() {
        K6 k62;
        AbstractC6359a abstractC6359aN0;
        j();
        this.f36699n = false;
        if (A0().isEmpty() || this.f36694i || (k62 = (K6) A0().poll()) == null || (abstractC6359aN0 = g().N0()) == null) {
            return;
        }
        this.f36694i = true;
        zzj().G().b("Registering trigger URI", k62.f35971a);
        com.google.common.util.concurrent.d dVarC = abstractC6359aN0.c(Uri.parse(k62.f35971a));
        if (dVarC != null) {
            com.google.common.util.concurrent.b.a(dVarC, new H4(this, k62), new I4(this));
        } else {
            this.f36694i = false;
            A0().add(k62);
        }
    }

    public final void J0() {
        j();
        zzj().B().a("Register tcfPrefChangeListener.");
        if (this.f36706u == null) {
            this.f36707v = new P4(this, this.f36331a);
            this.f36706u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.E4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C4945r4.S(this.f35855a, sharedPreferences, str);
                }
            };
        }
        e().E().registerOnSharedPreferenceChangeListener(this.f36706u);
    }

    public final void K(Bundle bundle, long j10) {
        AbstractC7901p.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().H().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC7901p.l(bundle2);
        AbstractC4848f4.a(bundle2, "app_id", String.class, null);
        AbstractC4848f4.a(bundle2, "origin", String.class, null);
        AbstractC4848f4.a(bundle2, "name", String.class, null);
        AbstractC4848f4.a(bundle2, "value", Object.class, null);
        AbstractC4848f4.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC4848f4.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC4848f4.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC4848f4.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC4848f4.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC4848f4.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC4848f4.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC4848f4.a(bundle2, "expired_event_name", String.class, null);
        AbstractC4848f4.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC7901p.f(bundle2.getString("name"));
        AbstractC7901p.f(bundle2.getString("origin"));
        AbstractC7901p.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (g().n0(string) != 0) {
            zzj().C().b("Invalid conditional user property name", c().g(string));
            return;
        }
        if (g().s(string, obj) != 0) {
            zzj().C().c("Invalid conditional user property value", c().g(string), obj);
            return;
        }
        Object objX0 = g().x0(string, obj);
        if (objX0 == null) {
            zzj().C().c("Unable to normalize conditional user property value", c().g(string), obj);
            return;
        }
        AbstractC4848f4.b(bundle2, objX0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            zzj().C().c("Invalid conditional user property timeout", c().g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            zzj().C().c("Invalid conditional user property time to live", c().g(string), Long.valueOf(j12));
        } else {
            zzl().z(new T4(this, bundle2));
        }
    }

    final boolean K0() {
        return this.f36699n;
    }

    public final void L(com.google.android.gms.internal.measurement.U0 u02) {
        zzl().z(new X4(this, u02));
    }

    final void M(D d10, boolean z10) {
        RunnableC4831d5 runnableC4831d5 = new RunnableC4831d5(this, d10);
        if (!z10) {
            zzl().z(runnableC4831d5);
        } else {
            j();
            runnableC4831d5.run();
        }
    }

    final void N(C4839e4 c4839e4) {
        j();
        boolean z10 = (c4839e4.x() && c4839e4.w()) || q().i0();
        if (z10 != this.f36331a.o()) {
            this.f36331a.t(z10);
            Boolean boolL = e().L();
            if (!z10 || boolL == null || boolL.booleanValue()) {
                d0(Boolean.valueOf(z10), false);
            }
        }
    }

    final void N0(long j10) {
        j();
        u();
        zzj().B().a("Resetting analytics data (FE)");
        C4987w6 c4987w6R = r();
        c4987w6R.j();
        c4987w6R.f36855f.b();
        l().G();
        boolean zN = this.f36331a.n();
        X2 x2E = e();
        x2E.f36267g.b(j10);
        if (!TextUtils.isEmpty(x2E.e().f36284x.a())) {
            x2E.f36284x.b(null);
        }
        x2E.f36278r.b(0L);
        x2E.f36279s.b(0L);
        if (!x2E.a().U()) {
            x2E.D(!zN);
        }
        x2E.f36285y.b(null);
        x2E.f36286z.b(0L);
        x2E.f36262A.b(null);
        q().d0();
        r().f36854e.a();
        this.f36704s = !zN;
    }

    public final void O(C4839e4 c4839e4, boolean z10) {
        boolean z11;
        C4839e4 c4839e42;
        boolean zS;
        boolean z12;
        u();
        int iB = c4839e4.b();
        if (iB != -10) {
            EnumC4866h4 enumC4866h4R = c4839e4.r();
            EnumC4866h4 enumC4866h4 = EnumC4866h4.UNINITIALIZED;
            if (enumC4866h4R == enumC4866h4 && c4839e4.t() == enumC4866h4) {
                zzj().I().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f36693h) {
            try {
                z11 = false;
                if (C4839e4.l(iB, this.f36700o.b())) {
                    zS = c4839e4.s(this.f36700o);
                    if (c4839e4.x() && !this.f36700o.x()) {
                        z11 = true;
                    }
                    C4839e4 c4839e4O = c4839e4.o(this.f36700o);
                    this.f36700o = c4839e4O;
                    c4839e42 = c4839e4O;
                    z12 = z11;
                    z11 = true;
                } else {
                    c4839e42 = c4839e4;
                    zS = false;
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            zzj().F().b("Ignoring lower-priority consent settings, proposed settings", c4839e42);
            return;
        }
        long andIncrement = this.f36701p.getAndIncrement();
        if (zS) {
            U0(null);
            RunnableC4858g5 runnableC4858g5 = new RunnableC4858g5(this, c4839e42, andIncrement, z12);
            if (!z10) {
                zzl().C(runnableC4858g5);
                return;
            } else {
                j();
                runnableC4858g5.run();
                return;
            }
        }
        RunnableC4849f5 runnableC4849f5 = new RunnableC4849f5(this, c4839e42, andIncrement, z12);
        if (z10) {
            j();
            runnableC4849f5.run();
        } else if (iB == 30 || iB == -10) {
            zzl().C(runnableC4849f5);
        } else {
            zzl().z(runnableC4849f5);
        }
    }

    public final void O0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.x4
            @Override // java.lang.Runnable
            public final void run() {
                C4945r4.T(this.f36859a, bundle2);
            }
        });
    }

    public final void P(InterfaceC4906m4 interfaceC4906m4) {
        InterfaceC4906m4 interfaceC4906m42;
        j();
        u();
        if (interfaceC4906m4 != null && interfaceC4906m4 != (interfaceC4906m42 = this.f36689d)) {
            AbstractC7901p.p(interfaceC4906m42 == null, "EventInterceptor already set.");
        }
        this.f36689d = interfaceC4906m4;
    }

    public final void P0(final Bundle bundle, final long j10) {
        zzl().C(new Runnable() { // from class: com.google.android.gms.measurement.internal.z4
            @Override // java.lang.Runnable
            public final void run() {
                C4945r4.U(this.f36907a, bundle, j10);
            }
        });
    }

    public final void Q(InterfaceC4930p4 interfaceC4930p4) {
        u();
        AbstractC7901p.l(interfaceC4930p4);
        if (this.f36690e.add(interfaceC4930p4)) {
            return;
        }
        zzj().H().a("OnEventListener already registered");
    }

    public final void Q0(InterfaceC4930p4 interfaceC4930p4) {
        u();
        AbstractC7901p.l(interfaceC4930p4);
        if (this.f36690e.remove(interfaceC4930p4)) {
            return;
        }
        zzj().H().a("OnEventListener had not been registered");
    }

    final void U0(String str) {
        this.f36692g.set(str);
    }

    public final void W0(String str, String str2, Bundle bundle) {
        l0(str, str2, bundle, true, true, zzb().a());
    }

    public final void X0(boolean z10) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f36688c == null) {
                this.f36688c = new C4867h5(this);
            }
            if (z10) {
                application.unregisterActivityLifecycleCallbacks(this.f36688c);
                application.registerActivityLifecycleCallbacks(this.f36688c);
                zzj().G().a("Registered activity lifecycle callback");
            }
        }
    }

    final void Y0(long j10) {
        j();
        if (this.f36697l == null) {
            this.f36697l = new G4(this, this.f36331a);
        }
        this.f36697l.b(j10);
    }

    public final void Z0(Bundle bundle, long j10) {
        J(bundle, -20, j10);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    public final void c0(Boolean bool) {
        u();
        zzl().z(new RunnableC4840e5(this, bool));
    }

    final void c1(String str, String str2, Bundle bundle) {
        j();
        g0(str, str2, zzb().a(), bundle);
    }

    public final void d1(boolean z10) {
        u();
        zzl().z(new J4(this, z10));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    final void e0(Runnable runnable) throws MalformedURLException {
        if (a().p(N.f36044R0)) {
            u();
            if (zzl().G()) {
                zzj().C().a("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (zzl().F()) {
                zzj().C().a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            if (C4834e.a()) {
                zzj().C().a("Cannot retrieve and upload batches from main thread");
                return;
            }
            zzj().G().a("[sgtm] Started client-side batch upload work.");
            boolean z10 = false;
            int size = 0;
            int i10 = 0;
            while (!z10) {
                zzj().G().a("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                zzl().r(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.A4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35775a.q().T(atomicReference, Q6.b(EnumC4954s5.SGTM_CLIENT));
                    }
                });
                S6 s62 = (S6) atomicReference.get();
                if (s62 == null || s62.f36206a.isEmpty()) {
                    break;
                }
                zzj().G().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(s62.f36206a.size()));
                size += s62.f36206a.size();
                Iterator it = s62.f36206a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    EnumC4962t5 enumC4962t5C = C((N6) it.next());
                    if (enumC4962t5C == EnumC4962t5.SUCCESS) {
                        i10++;
                    } else if (enumC4962t5C == EnumC4962t5.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            }
            zzj().G().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
            runnable.run();
        }
    }

    public final void e1(long j10) {
        zzl().z(new L4(this, j10));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    public final void f0(final String str, long j10) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f36331a.zzj().H().a("User ID must be non-empty or null");
        } else {
            zzl().z(new Runnable() { // from class: com.google.android.gms.measurement.internal.w4
                @Override // java.lang.Runnable
                public final void run() {
                    C4945r4.X(this.f36845a, str);
                }
            });
            o0(null, "_id", str, true, j10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    final void g0(String str, String str2, long j10, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        j();
        h0(str, str2, j10, bundle, true, this.f36689d == null || x7.D0(str2), true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    protected final void h0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str4;
        ArrayList arrayList;
        long j11;
        int i10;
        Object obj;
        int length;
        AbstractC7901p.f(str);
        AbstractC7901p.l(bundle);
        j();
        u();
        if (!this.f36331a.n()) {
            zzj().B().a("Event not sent since app measurement is disabled");
            return;
        }
        List listF = l().F();
        if (listF != null && !listF.contains(str2)) {
            zzj().B().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f36691f) {
            this.f36691f = true;
            try {
                try {
                    (!this.f36331a.r() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e10) {
                    zzj().H().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                zzj().F().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            m0("auto", "_lgclid", bundle.getString("gclid"), zzb().a());
        }
        if (z10 && x7.G0(str2)) {
            g().J(bundle, e().f36262A.a());
        }
        if (!z12 && !"_iap".equals(str2)) {
            x7 x7VarK = this.f36331a.K();
            int i11 = 2;
            if (x7VarK.z0("event", str2)) {
                if (!x7VarK.l0("event", AbstractC4898l4.f36581a, AbstractC4898l4.f36582b, str2)) {
                    i11 = 13;
                } else if (x7VarK.f0("event", 40, str2)) {
                    i11 = 0;
                }
            }
            if (i11 != 0) {
                zzj().D().b("Invalid public event name. Event will not be logged (FE)", c().c(str2));
                this.f36331a.K();
                String strF = x7.F(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f36331a.K();
                x7.U(this.f36708w, i11, "_ev", strF, length);
                return;
            }
        }
        C4970u5 c4970u5Z = p().z(false);
        if (c4970u5Z != null && !bundle.containsKey("_sc")) {
            c4970u5Z.f36783d = true;
        }
        x7.T(c4970u5Z, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str);
        boolean zD0 = x7.D0(str2);
        if (z10 && this.f36689d != null && !zD0 && !zEquals) {
            zzj().B().c("Passing event to registered event handler (FE)", c().c(str2), c().a(bundle));
            AbstractC7901p.l(this.f36689d);
            this.f36689d.a(str, str2, bundle, j10);
            return;
        }
        if (this.f36331a.q()) {
            int iR = g().r(str2);
            if (iR != 0) {
                zzj().D().b("Invalid event name. Event will not be logged (FE)", c().c(str2));
                g();
                String strF2 = x7.F(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f36331a.K();
                x7.V(this.f36708w, str3, iR, "_ev", strF2, length);
                return;
            }
            String str5 = "_o";
            Bundle bundleB = g().B(str3, str2, bundle, com.google.android.gms.common.util.e.b("_o", "_sn", "_sc", "_si"), z12);
            AbstractC7901p.l(bundleB);
            if (p().z(false) != null && "_ae".equals(str2)) {
                C6 c62 = r().f36855f;
                long jC = c62.f35822d.zzb().c();
                long j12 = jC - c62.f35820b;
                c62.f35820b = jC;
                if (j12 > 0) {
                    g().I(bundleB, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                x7 x7VarG = g();
                String string = bundleB.getString("_ffr");
                if (com.google.android.gms.common.util.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, x7VarG.e().f36284x.a())) {
                    x7VarG.zzj().B().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                x7VarG.e().f36284x.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = g().e().f36284x.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleB.putString("_ffr", strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleB);
            boolean zC = a().p(N.f36066b1) ? r().C() : e().f36281u.b();
            if (e().f36278r.a() > 0 && e().u(j10) && zC) {
                zzj().G().a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j11 = 0;
                str4 = "_ae";
                m0("auto", "_sid", null, zzb().a());
                m0("auto", "_sno", null, zzb().a());
                m0("auto", "_se", null, zzb().a());
                e().f36279s.b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j11 = 0;
            }
            if (bundleB.getLong("extend_session", j11) == 1) {
                zzj().G().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i10 = 1;
                this.f36331a.J().f36854e.b(j10, true);
            } else {
                i10 = 1;
            }
            ArrayList arrayList3 = new ArrayList(bundleB.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj2 = arrayList3.get(i12);
                i12 += i10;
                String str6 = (String) obj2;
                if (str6 != null) {
                    g();
                    Bundle[] bundleArrU0 = x7.u0(bundleB.get(str6));
                    if (bundleArrU0 != null) {
                        bundleB.putParcelableArray(str6, bundleArrU0);
                    }
                }
                i10 = 1;
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundleA = (Bundle) arrayList4.get(i13);
                String str7 = i13 != 0 ? "_ep" : str2;
                bundleA.putString(str5, str);
                if (z11) {
                    obj = null;
                    bundleA = g().A(bundleA, null);
                } else {
                    obj = null;
                }
                Bundle bundle2 = bundleA;
                String str8 = str5;
                q().G(new L(str7, new K(bundle2), str, j10), str3);
                if (!zEquals) {
                    Iterator it = this.f36690e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC4930p4) it.next()).a(str, str2, new Bundle(bundle2), j10);
                    }
                }
                i13++;
                arrayList = arrayList4;
                str5 = str8;
            }
            if (p().z(false) == null || !str4.equals(str2)) {
                return;
            }
            r().B(true, true, zzb().c());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final void j0(String str, String str2, Bundle bundle) {
        long jA = zzb().a();
        AbstractC7901p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().z(new W4(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ B k() {
        return super.k();
    }

    public final void k0(String str, String str2, Bundle bundle, String str3) {
        i();
        V0(str, str2, zzb().a(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5007z2 l() {
        return super.l();
    }

    public final void l0(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            p().A(bundle2, j10);
        } else {
            V0(str3, str2, j10, bundle2, z11, !z11 || this.f36689d == null || x7.D0(str2), z10, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C2 m() {
        return super.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m0(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            s3.AbstractC7901p.f(r10)
            s3.AbstractC7901p.f(r11)
            r9.j()
            r9.u()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L6e
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r12 = "false"
            boolean r11 = r12.equals(r11)
            r2 = 1
            if (r11 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.X2 r0 = r9.e()
            com.google.android.gms.measurement.internal.a3 r0 = r0.f36275o
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r12 = "true"
        L4b:
            r0.b(r12)
            r12 = r11
        L4f:
            r11 = r1
            goto L5f
        L51:
            if (r12 != 0) goto L5f
            com.google.android.gms.measurement.internal.X2 r11 = r9.e()
            com.google.android.gms.measurement.internal.a3 r11 = r11.f36275o
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L4f
        L5f:
            com.google.android.gms.measurement.internal.L2 r0 = r9.zzj()
            com.google.android.gms.measurement.internal.N2 r0 = r0.G()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L6e:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.v3 r11 = r9.f36331a
            boolean r11 = r11.n()
            if (r11 != 0) goto L86
            com.google.android.gms.measurement.internal.L2 r10 = r9.zzj()
            com.google.android.gms.measurement.internal.N2 r10 = r10.G()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L86:
            com.google.android.gms.measurement.internal.v3 r11 = r9.f36331a
            boolean r11 = r11.q()
            if (r11 != 0) goto L8f
            return
        L8f:
            com.google.android.gms.measurement.internal.r7 r11 = new com.google.android.gms.measurement.internal.r7
            r3 = r11
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.C5 r10 = r9.q()
            r10.P(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4945r4.m0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4945r4 n() {
        return super.n();
    }

    public final void n0(String str, String str2, Object obj, boolean z10) {
        o0(str, str2, obj, z10, zzb().a());
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4939q5 o() {
        return super.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(java.lang.String r7, java.lang.String r8, java.lang.Object r9, boolean r10, long r11) {
        /*
            r6 = this;
            if (r7 != 0) goto L4
            java.lang.String r7 = "app"
        L4:
            r1 = r7
            r7 = 0
            r0 = 24
            if (r10 == 0) goto L13
            com.google.android.gms.measurement.internal.x7 r10 = r6.g()
            int r10 = r10.n0(r8)
            goto L35
        L13:
            com.google.android.gms.measurement.internal.x7 r10 = r6.g()
            java.lang.String r2 = "user property"
            boolean r3 = r10.z0(r2, r8)
            r4 = 6
            if (r3 != 0) goto L22
        L20:
            r10 = r4
            goto L35
        L22:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.AbstractC4914n4.f36603a
            boolean r3 = r10.k0(r2, r3, r8)
            if (r3 != 0) goto L2d
            r10 = 15
            goto L35
        L2d:
            boolean r10 = r10.f0(r2, r0, r8)
            if (r10 != 0) goto L34
            goto L20
        L34:
            r10 = r7
        L35:
            java.lang.String r2 = "_ev"
            r3 = 1
            if (r10 == 0) goto L52
            r6.g()
            java.lang.String r9 = com.google.android.gms.measurement.internal.x7.F(r8, r0, r3)
            if (r8 == 0) goto L47
            int r7 = r8.length()
        L47:
            com.google.android.gms.measurement.internal.v3 r8 = r6.f36331a
            r8.K()
            com.google.android.gms.measurement.internal.w7 r8 = r6.f36708w
            com.google.android.gms.measurement.internal.x7.U(r8, r10, r2, r9, r7)
            return
        L52:
            if (r9 == 0) goto L91
            com.google.android.gms.measurement.internal.x7 r10 = r6.g()
            int r10 = r10.s(r8, r9)
            if (r10 == 0) goto L80
            r6.g()
            java.lang.String r8 = com.google.android.gms.measurement.internal.x7.F(r8, r0, r3)
            boolean r11 = r9 instanceof java.lang.String
            if (r11 != 0) goto L6d
            boolean r11 = r9 instanceof java.lang.CharSequence
            if (r11 == 0) goto L75
        L6d:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            int r7 = r7.length()
        L75:
            com.google.android.gms.measurement.internal.v3 r9 = r6.f36331a
            r9.K()
            com.google.android.gms.measurement.internal.w7 r9 = r6.f36708w
            com.google.android.gms.measurement.internal.x7.U(r9, r10, r2, r8, r7)
            return
        L80:
            com.google.android.gms.measurement.internal.x7 r7 = r6.g()
            java.lang.Object r5 = r7.x0(r8, r9)
            if (r5 == 0) goto L90
            r0 = r6
            r2 = r8
            r3 = r11
            r0.i0(r1, r2, r3, r5)
        L90:
            return
        L91:
            r5 = 0
            r0 = r6
            r2 = r8
            r3 = r11
            r0.i0(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4945r4.o0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4994x5 p() {
        return super.p();
    }

    public final C4917o p0() {
        j();
        return q().X();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5 q() {
        return super.q();
    }

    public final InterfaceC4875i5 q0() {
        return this.f36688c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4987w6 r() {
        return super.r();
    }

    public final Boolean r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().r(atomicReference, 15000L, "boolean test flag value", new D4(this, atomicReference));
    }

    public final Double s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().r(atomicReference, 15000L, "double test flag value", new RunnableC4813b5(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.I2
    protected final boolean t() {
        return false;
    }

    public final Integer t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().r(atomicReference, 15000L, "int test flag value", new RunnableC4822c5(this, atomicReference));
    }

    public final Long u0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().r(atomicReference, 15000L, "long test flag value", new Z4(this, atomicReference));
    }

    public final String v0() {
        return (String) this.f36692g.get();
    }

    public final String w0() {
        C4970u5 c4970u5L = this.f36331a.H().L();
        if (c4970u5L != null) {
            return c4970u5L.f36781b;
        }
        return null;
    }

    public final String x0() {
        C4970u5 c4970u5L = this.f36331a.H().L();
        if (c4970u5L != null) {
            return c4970u5L.f36780a;
        }
        return null;
    }

    public final String y0() {
        if (this.f36331a.L() != null) {
            return this.f36331a.L();
        }
        try {
            return new C4937q3(zza(), this.f36331a.O()).b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f36331a.zzj().C().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final String z0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().r(atomicReference, 15000L, "String test flag value", new Q4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
