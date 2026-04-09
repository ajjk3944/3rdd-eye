package al;

import ak.t0;
import ak.v0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import ch.n;
import dt.k;
import e5.w;
import h7.h0;
import h9.r2;
import io.sentry.android.core.e0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jj.m0;
import kg.q;
import l9.g0;
import l9.j0;
import l9.o;
import l9.p;
import l9.r;
import l9.s;
import l9.t;
import l9.v;
import l9.x;
import l9.z;
import m9.i;
import m9.m;
import ns.h;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import p.v2;
import pg.j;
import rr.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Object f809a;

    /* renamed from: b, reason: collision with root package name */
    public Object f810b;

    /* renamed from: c, reason: collision with root package name */
    public Object f811c;

    /* renamed from: d, reason: collision with root package name */
    public Object f812d;

    /* renamed from: e, reason: collision with root package name */
    public Object f813e;

    /* renamed from: f, reason: collision with root package name */
    public Object f814f;

    /* renamed from: g, reason: collision with root package name */
    public Object f815g;

    /* renamed from: h, reason: collision with root package name */
    public Object f816h;

    /* renamed from: i, reason: collision with root package name */
    public Object f817i;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        this.f810b = obj;
        this.f811c = obj2;
        this.f812d = obj3;
        this.f813e = obj4;
        this.f814f = obj5;
        this.f815g = obj6;
        this.f816h = obj7;
        this.f809a = obj8;
        this.f817i = obj9;
    }

    public static String l(Integer num) {
        if (num.intValue() == -1) {
            return "None (" + num + ')';
        }
        if (num.intValue() == 0) {
            return "Mobile (" + num + ')';
        }
        if (num.intValue() == 1) {
            return "WIFI (" + num + ')';
        }
        return "Unknown type (" + num + ')';
    }

    public void a(int i10, long j) {
        if (i10 != 0) {
            ((ScheduledExecutorService) this.f815g).schedule(new pg.b(this, i10, j), ((Random) this.f816h).nextInt(4), TimeUnit.SECONDS);
        } else {
            og.d dVar = og.d.UNKNOWN;
            new og.g("Unable to fetch the latest version of the template.");
            m();
        }
    }

    public b b(l lVar, List list, ns.f fVar, h0 h0Var, h hVar, ns.a aVar) {
        br.l.e(list, "typeParameterProtos");
        br.l.e(fVar, "nameResolver");
        br.l.e(hVar, "versionRequirementTable");
        br.l.e(aVar, "metadataVersion");
        k kVar = (k) this.f810b;
        int i10 = aVar.f18520b;
        if ((i10 != 1 || aVar.f18521c < 4) && i10 <= 1) {
            hVar = (h) this.f814f;
        }
        return new b(kVar, fVar, lVar, h0Var, hVar, aVar, (ft.k) this.f816h, (v2) this.f809a, list);
    }

    public qf.b d(qf.c cVar) {
        qf.b bVar = null;
        try {
            if (!qf.c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject jSONObjectI = ((l2) this.f814f).I();
                if (jSONObjectI != null) {
                    qf.b bVarD0 = ((o2.g) this.f812d).d0(jSONObjectI);
                    jSONObjectI.toString();
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    ((ee.f) this.f813e).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!qf.c.IGNORE_CACHE_EXPIRATION.equals(cVar) && bVarD0.f20889c < jCurrentTimeMillis) {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return null;
                    }
                    try {
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        return bVarD0;
                    } catch (Exception e4) {
                        e = e4;
                        bVar = bVarD0;
                        e0.c("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return bVar;
                    }
                }
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
            return null;
        } catch (Exception e10) {
            e = e10;
        }
    }

    public int e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f812d).getActiveNetworkInfo();
        int type = activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
        n.b("DeviceNetworkStateRepository", "Network type: " + l(Integer.valueOf(type)));
        return type;
    }

    public Integer f() {
        NetworkInfo.DetailedState detailedState;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f812d).getActiveNetworkInfo();
        if (activeNetworkInfo == null || (detailedState = activeNetworkInfo.getDetailedState()) == null) {
            return null;
        }
        return Integer.valueOf(detailedState.ordinal());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ak.e1 g(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.b.g(int, int):ak.e1");
    }

    public qf.b h() {
        return (qf.b) ((AtomicReference) this.f809a).get();
    }

    public void i(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strF = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strF = w.g.f(strF, line);
            if (line.contains("}")) {
                int iIndexOf = strF.indexOf(123);
                int iLastIndexOf = strF.lastIndexOf(125);
                strF = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strF.substring(iIndexOf, iLastIndexOf + 1);
                if (!strF.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strF);
                    } catch (JSONException e4) {
                        Throwable cause = e4.getCause();
                        og.d dVar = og.d.UNKNOWN;
                        new og.c("Unable to parse config update message.", cause);
                        m();
                        e0.c("FirebaseRemoteConfig", "Unable to parse latest config update message.", e4);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        j jVar = (j) this.f814f;
                        og.d dVar2 = og.d.UNKNOWN;
                        new og.g("The server is temporarily unavailable. Try again in a few minutes.");
                        jVar.a();
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f810b).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((pg.h) this.f812d).f20520g.f20550a.getLong("last_template_version", 0L);
                        long j7 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j7 > j) {
                            a(3, j7);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        o(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strF = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    public Boolean j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f812d).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return Boolean.valueOf(activeNetworkInfo.isConnected());
        }
        return null;
    }

    public void k(i iVar, int i10) {
        byte[] bArr;
        long j;
        n9.a aVar;
        String str;
        k9.b bVarB;
        String str2;
        Integer numValueOf;
        String str3;
        b bVar;
        final b bVar2 = this;
        final i iVar2 = iVar;
        byte[] bArr2 = iVar2.f16361b;
        u9.c cVar = (u9.c) bVar2.f815g;
        n9.f fVarA = ((n9.e) bVar2.f811c).a(iVar2.f16360a);
        if (n9.c.OK == null) {
            throw new NullPointerException("Null status");
        }
        long jMax = 0;
        while (true) {
            final int i11 = 0;
            u9.b bVar3 = new u9.b(bVar2) { // from class: s9.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al.b f21941d;

                {
                    this.f21941d = bVar2;
                }

                @Override // u9.b
                public final Object g() {
                    Boolean bool;
                    switch (i11) {
                        case 0:
                            i iVar3 = iVar2;
                            t9.h hVar = (t9.h) ((t9.d) this.f21941d.f812d);
                            SQLiteDatabase sQLiteDatabaseB = hVar.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lF = t9.h.f(sQLiteDatabaseB, iVar3);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            t9.h hVar2 = (t9.h) ((t9.d) this.f21941d.f812d);
                            hVar2.getClass();
                            return (Iterable) hVar2.h(new q(hVar2, 10, iVar2));
                    }
                }
            };
            t9.h hVar = (t9.h) cVar;
            if (!((Boolean) hVar.w(bVar3)).booleanValue()) {
                hVar.w(new w(bVar2, iVar2, jMax, 3));
                return;
            }
            final int i12 = 1;
            Iterable iterable = (Iterable) hVar.w(new u9.b(bVar2) { // from class: s9.f

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ al.b f21941d;

                {
                    this.f21941d = bVar2;
                }

                @Override // u9.b
                public final Object g() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            i iVar3 = iVar2;
                            t9.h hVar2 = (t9.h) ((t9.d) this.f21941d.f812d);
                            SQLiteDatabase sQLiteDatabaseB = hVar2.b();
                            sQLiteDatabaseB.beginTransaction();
                            try {
                                Long lF = t9.h.f(sQLiteDatabaseB, iVar3);
                                if (lF == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = hVar2.b().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th2) {
                                        cursorRawQuery.close();
                                        throw th2;
                                    }
                                }
                                sQLiteDatabaseB.setTransactionSuccessful();
                                return bool;
                            } finally {
                                sQLiteDatabaseB.endTransaction();
                            }
                        default:
                            t9.h hVar22 = (t9.h) ((t9.d) this.f21941d.f812d);
                            hVar22.getClass();
                            return (Iterable) hVar22.h(new q(hVar22, 10, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (fVarA == null) {
                kc.f.q("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar = new n9.a(n9.c.FATAL_ERROR, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t9.b) it.next()).f22673c);
                }
                String str4 = "proto";
                if (bArr2 != null) {
                    t9.c cVar2 = (t9.c) bVar2.f817i;
                    Objects.requireNonNull(cVar2);
                    p9.a aVar2 = (p9.a) hVar.w(new io.sentry.android.replay.capture.e(28, cVar2));
                    c cVar3 = new c(4);
                    cVar3.f825g = new HashMap();
                    cVar3.f823e = Long.valueOf(((v9.a) bVar2.f816h).e());
                    cVar3.f824f = Long.valueOf(((v9.a) bVar2.f809a).e());
                    cVar3.f820b = "GDT_CLIENT_METRICS";
                    j9.c cVar4 = new j9.c("proto");
                    aVar2.getClass();
                    bm.d dVar = m.f16366a;
                    dVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dVar.t(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    cVar3.f822d = new m9.k(cVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(((k9.c) fVarA).a(cVar3.e()));
                }
                k9.c cVar5 = (k9.c) fVarA;
                HashMap map = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    m9.h hVar2 = (m9.h) it2.next();
                    String str5 = hVar2.f16351a;
                    if (map.containsKey(str5)) {
                        ((List) map.get(str5)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    m9.h hVar3 = (m9.h) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.DEFAULT;
                    long jE = cVar5.f14225f.e();
                    long jE2 = cVar5.f14224e.e();
                    l9.n nVar = new l9.n(x.ANDROID_FIREBASE, new l9.l(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (m9.h hVar4 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        m9.k kVar = hVar4.f16353c;
                        long j7 = jMax;
                        byte[] bArr4 = hVar4.j;
                        j9.c cVar6 = kVar.f16363a;
                        byte[] bArr5 = kVar.f16364b;
                        if (cVar6.equals(new j9.c(str4))) {
                            bVar = new b();
                            bVar.f814f = bArr5;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar6.equals(new j9.c("json"))) {
                                String str6 = new String(bArr5, Charset.forName("UTF-8"));
                                b bVar4 = new b();
                                bVar4.f815g = str6;
                                bVar = bVar4;
                            } else {
                                String strZ = kc.f.z("CctTransportBackend");
                                if (Log.isLoggable(strZ, 5)) {
                                    e0.p(strZ, "Received event of unsupported encoding " + cVar6 + ". Skipping...");
                                }
                                bArr2 = bArr3;
                                jMax = j7;
                                str4 = str3;
                            }
                        }
                        bVar.f810b = Long.valueOf(hVar4.f16354d);
                        bVar.f813e = Long.valueOf(hVar4.f16355e);
                        String str7 = (String) hVar4.f16356f.get("tz-offset");
                        bVar.f816h = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        bVar.f809a = new v(l9.h0.forNumber(hVar4.b("net-type")), g0.forNumber(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f16352b;
                        if (num != null) {
                            bVar.f811c = num;
                        }
                        Integer num2 = hVar4.f16357g;
                        if (num2 != null) {
                            bVar.f812d = new o(new r(new l9.q(num2)), z.EVENT_OVERRIDE);
                        }
                        byte[] bArr6 = hVar4.f16359i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            bVar.f817i = new p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strF = ((Long) bVar.f810b) == null ? " eventTimeMs" : "";
                        if (((Long) bVar.f813e) == null) {
                            strF = strF.concat(" eventUptimeMs");
                        }
                        if (((Long) bVar.f816h) == null) {
                            strF = w.g.f(strF, " timezoneOffsetSeconds");
                        }
                        if (!strF.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strF));
                        }
                        arrayList4.add(new s(((Long) bVar.f810b).longValue(), (Integer) bVar.f811c, (o) bVar.f812d, ((Long) bVar.f813e).longValue(), (byte[]) bVar.f814f, (String) bVar.f815g, ((Long) bVar.f816h).longValue(), (v) bVar.f809a, (p) bVar.f817i));
                        bArr2 = bArr3;
                        jMax = j7;
                        str4 = str3;
                    }
                    arrayList3.add(new t(jE, jE2, nVar, numValueOf, str2, arrayList4, j0Var));
                }
                bArr = bArr2;
                j = jMax;
                l9.m mVar = new l9.m(arrayList3);
                URL urlB = cVar5.f14223d;
                if (bArr != null) {
                    try {
                        k9.a aVarA = k9.a.a(bArr);
                        str = aVarA.f14216b;
                        if (str == null) {
                            str = null;
                        }
                        String str8 = aVarA.f14215a;
                        if (str8 != null) {
                            urlB = k9.c.b(str8);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new n9.a(n9.c.FATAL_ERROR, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    io.sentry.k kVar2 = new io.sentry.k(urlB, mVar, str, 9);
                    io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(10, cVar5);
                    int i13 = 5;
                    do {
                        bVarB = eVar.b(kVar2);
                        URL url = (URL) bVarB.f14219c;
                        if (url != null) {
                            kc.f.q("CctTransportBackend", "Following redirect to: %s", url);
                            kVar2 = new io.sentry.k(url, (l9.m) kVar2.f12398g, (String) kVar2.f12399r, 9);
                        } else {
                            kVar2 = null;
                        }
                        if (kVar2 == null) {
                            break;
                        } else {
                            i13--;
                        }
                    } while (i13 >= 1);
                    int i14 = bVarB.f14217a;
                    aVar = i14 == 200 ? new n9.a(n9.c.OK, bVarB.f14218b) : (i14 >= 500 || i14 == 404) ? new n9.a(n9.c.TRANSIENT_ERROR, -1L) : i14 == 400 ? new n9.a(n9.c.INVALID_PAYLOAD, -1L) : new n9.a(n9.c.FATAL_ERROR, -1L);
                } catch (IOException e4) {
                    kc.f.t("CctTransportBackend", "Could not make request to the backend", e4);
                    aVar = new n9.a(n9.c.TRANSIENT_ERROR, -1L);
                }
            }
            n9.c cVar7 = n9.c.TRANSIENT_ERROR;
            n9.c cVar8 = aVar.f17396a;
            if (cVar8 == cVar7) {
                hVar.w(new cf.b(this, iterable, iVar, j));
                ((qm.c) this.f813e).O(iVar, i10 + 1, true);
                return;
            }
            bVar2 = this;
            jMax = j;
            hVar.w(new q(bVar2, 8, iterable));
            if (cVar8 == n9.c.OK) {
                jMax = Math.max(jMax, aVar.f17397b);
                if (bArr != null) {
                    hVar.w(new s9.g(0, bVar2));
                }
            } else if (cVar8 == n9.c.INVALID_PAYLOAD) {
                HashMap map2 = new HashMap();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    String str9 = ((t9.b) it3.next()).f22673c.f16351a;
                    if (map2.containsKey(str9)) {
                        map2.put(str9, Integer.valueOf(((Integer) map2.get(str9)).intValue() + 1));
                    } else {
                        map2.put(str9, 1);
                    }
                }
                hVar.w(new q(bVar2, 9, map2));
            }
            iVar2 = iVar;
            bArr2 = bArr;
        }
    }

    public synchronized void m() {
        Iterator it = ((LinkedHashSet) this.f810b).iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public void n() {
        Object next;
        List list = ((ak.g) ((q3.a) this.f812d).f20680g).f530g.f757b;
        ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xj.m) this.f815g).a((v0) it.next()));
        }
        hk.k kVar = (hk.k) this.f813e;
        n.b("TaskScheduler", "schedulePreConfiguredTasks() called with " + arrayList.size() + " tasks");
        synchronized (kVar.f10841n) {
            try {
                ArrayList arrayListD0 = ((r2) kVar.f10833d).d0();
                kVar.r(arrayList, arrayListD0);
                n.b("TaskScheduler", "Schedule pre configured tasks - start");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    hk.h hVar = (hk.h) it2.next();
                    n.b("TaskScheduler", hVar.c() + " Checking if present");
                    Iterator it3 = arrayListD0.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            if (br.l.a(((hk.h) next).f10805b, hVar.f10805b)) {
                                break;
                            }
                        }
                    }
                    hk.h hVar2 = (hk.h) next;
                    if (hVar2 != null) {
                        n.b("TaskScheduler", hVar.c() + " Update existing pre-configured task");
                        hk.h hVarB = kVar.B(hVar, hVar2);
                        if (!hVar.f10809f.f9624l) {
                            kVar.v(hVarB, true, m0.SCHEDULE_PRECONFIGURED_TASK_TRIGGER);
                        }
                    } else if (hVar.f10809f.f9624l) {
                        n.b("TaskScheduler", hVar.c() + " Ignoring manual execution task");
                    } else {
                        kVar.u(hVar);
                    }
                }
                n.b("TaskScheduler", "Schedule pre configured tasks - end");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dj.g gVar = (dj.g) this.f814f;
        synchronized (gVar.c()) {
            gVar.e(gVar.c().b(), true);
        }
        dj.g gVar2 = (dj.g) this.f814f;
        n.b("TriggerRegistry", "initialise() called");
        List list2 = ((ak.g) gVar2.f7401a.n().f20680g).f530g.f757b;
        ArrayList arrayList2 = new ArrayList(mq.p.a0(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(gVar2.f7401a.N0().a((v0) it4.next()));
        }
        n.b("TriggerRegistry", "registerAllTaskTriggers");
        synchronized (gVar2.c()) {
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                hk.h hVar3 = (hk.h) it5.next();
                br.l.e(hVar3, "task");
                dj.g.d(gVar2, hVar3.f10807d);
                dj.g.d(gVar2, hVar3.f10808e);
            }
        }
        n.b("TriggerRegistry", "registerAllTaskConfigTriggers called");
        t0 t0Var = ((ak.g) gVar2.f7401a.n().f20680g).f530g.f756a;
        synchronized (gVar2.c()) {
            n.b("TriggerRegistry", "Initialise task config");
            n.b("TriggerRegistry", t0Var.f720a.size() + " cross task delays found");
            Iterator it6 = t0Var.f720a.iterator();
            while (it6.hasNext()) {
                ArrayList arrayListE = gVar2.f7401a.Y0().e(((ak.k) it6.next()).f600b);
                n.b("TriggerRegistry", "Register " + arrayListE.size() + " triggers for cross task delays");
                dj.g.d(gVar2, arrayListE);
            }
        }
    }

    public synchronized void o(int i10) {
        ((gc.a) this.f809a).getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (i10 * 1000));
        pg.m mVar = (pg.m) this.f817i;
        synchronized (mVar.f20553d) {
            mVar.f20550a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x014c A[Catch: JSONException -> 0x015a, LOOP:4: B:37:0x0146->B:39:0x014c, LOOP_END, TRY_LEAVE, TryCatch #2 {JSONException -> 0x015a, blocks: (B:36:0x013d, B:37:0x0146, B:39:0x014c), top: B:69:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: al.b.p(java.lang.String):void");
    }

    public b(k kVar, ns.f fVar, l lVar, h0 h0Var, h hVar, ns.a aVar, ft.k kVar2, v2 v2Var, List list) {
        String strY;
        br.l.e(kVar, "components");
        br.l.e(fVar, "nameResolver");
        br.l.e(lVar, "containingDeclaration");
        br.l.e(hVar, "versionRequirementTable");
        br.l.e(aVar, "metadataVersion");
        br.l.e(list, "typeParameters");
        this.f810b = kVar;
        this.f811c = fVar;
        this.f812d = lVar;
        this.f813e = h0Var;
        this.f814f = hVar;
        this.f815g = aVar;
        this.f816h = kVar2;
        this.f809a = new v2(this, v2Var, list, "Deserializer for \"" + lVar.getName() + '\"', (kVar2 == null || (strY = kVar2.y()) == null) ? "[container not found]" : strY);
        this.f817i = new dt.t(this);
    }
}
