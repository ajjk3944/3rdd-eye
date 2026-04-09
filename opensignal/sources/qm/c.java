package qm;

import a5.d0;
import a5.v;
import ak.b0;
import ak.t;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import ba.m;
import c8.e0;
import ch.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsStates;
import com.survicate.surveys.infrastructure.network.URLRequest;
import com.survicate.surveys.infrastructure.serialization.SurvicateSerializer;
import dd.r;
import e2.p;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import ma.g0;
import mq.o;
import mq.w;
import mq.x;
import mq.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.l2;
import tg.e1;
import u.u;
import u5.a0;
import w6.q;
import x1.f0;
import x1.s;
import x1.u1;
import x1.v1;
import ya.l0;
import zc.c1;
import zc.f2;
import zc.k0;
import zc.p3;

/* loaded from: classes.dex */
public final class c implements o9.b, vg.b, w3.f, q, n0.c, dd.c, f2, k0 {

    /* renamed from: x, reason: collision with root package name */
    public static c f20915x;

    /* renamed from: y, reason: collision with root package name */
    public static c f20916y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20917a;

    /* renamed from: d, reason: collision with root package name */
    public Object f20918d;

    /* renamed from: g, reason: collision with root package name */
    public Object f20919g;

    /* renamed from: r, reason: collision with root package name */
    public Object f20920r;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f20917a = i10;
        this.f20918d = obj;
        this.f20919g = obj2;
        this.f20920r = obj3;
    }

    public static boolean C(wj.a aVar, List list) {
        List list2 = list;
        double d6 = aVar.f24538b;
        double d10 = aVar.f24537a;
        br.l.e(list2, "polygon");
        if (list2.size() < 3) {
            throw new IllegalArgumentException("Polygon needs at least 3 points");
        }
        int iZ = e5.z(list2);
        int size = list2.size();
        int i10 = iZ;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            wj.a aVar2 = (wj.a) list2.get(i10);
            wj.a aVar3 = (wj.a) list2.get(i11);
            double d11 = aVar3.f24538b;
            double d12 = aVar2.f24538b;
            int i12 = i11;
            double d13 = aVar2.f24537a;
            double d14 = d10 - d13;
            double d15 = aVar3.f24537a;
            if (Math.abs((d14 * (d11 - d12)) - ((d6 - d12) * (d15 - d13))) <= 1.0E-9d) {
                double dMin = Math.min(d12, d11) - 1.0E-9d;
                double dMax = Math.max(d12, d11) + 1.0E-9d;
                double dMin2 = Math.min(d13, d15) - 1.0E-9d;
                double dMax2 = Math.max(d13, d15) + 1.0E-9d;
                if (dMin <= d6 && d6 <= dMax && dMin2 <= d10 && d10 <= dMax2) {
                    return true;
                }
            }
            double d16 = aVar3.f24537a;
            boolean z11 = d16 > d10;
            double d17 = aVar2.f24537a;
            if (z11 != (d17 > d10)) {
                double d18 = aVar2.f24538b;
                double d19 = aVar3.f24538b;
                if (d6 < (((d10 - d16) * (d18 - d19)) / (d17 - d16)) + d19) {
                    z10 = !z10;
                }
            }
            i11 = i12 + 1;
            i10 = i12;
            list2 = list;
        }
        return z10;
    }

    public static final void H(ArrayList arrayList, JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("type");
        if (br.l.a(string, "Polygon")) {
            JSONArray jSONArray = jSONObject.getJSONArray("coordinates");
            if (jSONArray.length() > 0) {
                arrayList.add(L(jSONArray));
                return;
            }
            return;
        }
        if (br.l.a(string, "MultiPolygon")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("coordinates");
            int length = jSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONArray jSONArray3 = jSONArray2.getJSONArray(i10);
                if (jSONArray3.length() > 0) {
                    arrayList.add(L(jSONArray3));
                }
            }
        }
    }

    public static wj.d L(JSONArray jSONArray) throws JSONException {
        if (jSONArray.length() < 1) {
            throw new IllegalArgumentException("Polygon must have at least one ring");
        }
        JSONArray jSONArray2 = jSONArray.getJSONArray(0);
        br.l.d(jSONArray2, "getJSONArray(...)");
        List listR = R(jSONArray2);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 1; i10 < length; i10++) {
            JSONArray jSONArray3 = jSONArray.getJSONArray(i10);
            br.l.d(jSONArray3, "getJSONArray(...)");
            arrayList.add(R(jSONArray3));
        }
        return new wj.d(arrayList, listR);
    }

    public static List R(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            arrayList.add(new wj.a(jSONArray2.getDouble(1), jSONArray2.getDouble(0)));
        }
        if (arrayList.size() >= 2) {
            wj.a aVar = (wj.a) o.r0(arrayList);
            wj.a aVar2 = (wj.a) o.z0(arrayList);
            if (Math.abs(aVar.f24537a - aVar2.f24537a) < 1.0E-9d && Math.abs(aVar.f24538b - aVar2.f24538b) < 1.0E-9d) {
                return o.n0(arrayList);
            }
        }
        return arrayList;
    }

    public static c y() {
        if (f20915x == null) {
            f20915x = new c(0);
        }
        return f20915x;
    }

    public void A(String str, String str2, HashMap map) throws ProtocolException {
        ((io.sentry.internal.debugmeta.c) this.f20920r).b(Thread.currentThread());
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        this.f20918d = httpsURLConnection;
        httpsURLConnection.setConnectTimeout(1000);
        ((HttpsURLConnection) this.f20918d).setReadTimeout(1000);
        ((HttpsURLConnection) this.f20918d).setRequestMethod(str2);
        for (String str3 : map.keySet()) {
            ((HttpsURLConnection) this.f20918d).addRequestProperty(str3, (String) map.get(str3));
        }
    }

    public boolean B() {
        return !(((u1) ((o2.g) this.f20918d).f18754d).isEmpty() && ((u1) ((o2.g) this.f20920r).f18754d).isEmpty() && ((u1) ((o2.g) this.f20919g).f18754d).isEmpty());
    }

    public List D() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f20918d;
        boolean zContains = sharedPreferences.contains("eventsHistoryKey");
        w wVar = w.f16945a;
        if (!zContains) {
            return wVar;
        }
        try {
            SurvicateSerializer survicateSerializer = (SurvicateSerializer) this.f20919g;
            String string = sharedPreferences.getString("eventsHistoryKey", "");
            br.l.b(string);
            return survicateSerializer.deserializeEventsHistory(string);
        } catch (Exception unused) {
            ((sm.f) ((no.b) this.f20920r)).getClass();
            return wVar;
        }
    }

    public Map E(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f20918d;
        boolean zContains = sharedPreferences.contains(str);
        x xVar = x.f16946a;
        if (!zContains) {
            return xVar;
        }
        try {
            String string = sharedPreferences.getString(str, "");
            br.l.b(string);
            return m.u(((SurvicateSerializer) this.f20919g).deserializePresentationTimesMap(string));
        } catch (Exception unused) {
            ((sm.f) ((no.b) this.f20920r)).getClass();
            return xVar;
        }
    }

    public Set F() {
        y yVar = y.f16947a;
        try {
            Set<String> stringSet = ((SharedPreferences) this.f20918d).getStringSet("seenSurveyIds", yVar);
            br.l.b(stringSet);
            return stringSet;
        } catch (Exception unused) {
            ((sm.f) ((no.b) this.f20920r)).getClass();
            return yVar;
        }
    }

    public List G() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f20918d;
        boolean zContains = sharedPreferences.contains("userTraits");
        w wVar = w.f16945a;
        if (!zContains) {
            return wVar;
        }
        try {
            SurvicateSerializer survicateSerializer = (SurvicateSerializer) this.f20919g;
            String string = sharedPreferences.getString("userTraits", "");
            br.l.b(string);
            return survicateSerializer.deserializeUserTraits(string);
        } catch (Exception unused) {
            ((sm.f) ((no.b) this.f20920r)).getClass();
            return wVar;
        }
    }

    public String I(String str, String str2, HashMap map) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f20920r;
        StringBuilder sb2 = new StringBuilder("post() called with: url = [");
        sb2.append(str);
        sb2.append("], headers = [");
        sb2.append(map);
        sb2.append("], body = [");
        n.b("NetworkResource", w.g.j(sb2, str2, "]"));
        try {
            if (!URLUtil.isValidUrl(str)) {
                n.b("NetworkResource", "post(): Url is not valid");
                return null;
            }
            try {
                A(str, URLRequest.METHOD_POST, map);
                ((HttpsURLConnection) this.f20918d).setDoInput(true);
                ((HttpsURLConnection) this.f20918d).connect();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(((HttpsURLConnection) this.f20918d).getOutputStream());
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                return J();
            } catch (IOException | RuntimeException e4) {
                n.e("NetworkResource", e4);
                cVar.B(Thread.currentThread());
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f20918d;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return null;
            }
        } finally {
            cVar.B(Thread.currentThread());
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) this.f20918d;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
        }
    }

    public String J() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        InputStream inputStream = ((HttpsURLConnection) this.f20918d).getInputStream();
        do {
            int i10 = inputStream.read(bArr);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            }
            if (i10 == -1) {
                break;
            }
        } while (!((AtomicBoolean) this.f20919g).get());
        return byteArrayOutputStream.toString();
    }

    public void K() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f20919g;
        if (((HttpsURLConnection) this.f20918d) != null) {
            atomicBoolean.set(true);
            ((HttpsURLConnection) this.f20918d).disconnect();
            this.f20918d = null;
        }
        atomicBoolean.set(false);
    }

    public void M(mv.b bVar, boolean z10) {
        ov.b cVar;
        br.l.e(bVar, "definition");
        sv.a aVar = bVar.f17061c;
        boolean z11 = bVar.f17065g.f17068b || z10;
        jv.a aVar2 = (jv.a) this.f20918d;
        int i10 = tv.a.f23026a[bVar.f17063e.ordinal()];
        if (i10 == 1) {
            br.l.e(aVar2, "koin");
            cVar = new ov.c(aVar2, bVar);
        } else {
            if (i10 != 2) {
                throw new bf.n();
            }
            br.l.e(aVar2, "koin");
            cVar = new ov.a(aVar2, bVar);
        }
        N(vc.e.x(bVar.f17060b, aVar), cVar, z11);
        for (ir.d dVar : bVar.f17064f) {
            if (z11) {
                N(vc.e.x(dVar, aVar), cVar, z11);
            } else {
                String strX = vc.e.x(dVar, aVar);
                HashMap map = (HashMap) this.f20920r;
                if (!map.containsKey(strX)) {
                    map.put(strX, cVar);
                }
            }
        }
    }

    public void N(String str, ov.b bVar, boolean z10) {
        HashMap map = (HashMap) this.f20920r;
        if (map.containsKey(str) && !z10) {
            throw new IllegalStateException(h0.b.g('\'', "InstanceRegistry already contains index '", str).toString());
        }
        map.put(str, bVar);
    }

    public void O(m9.i iVar, int i10, boolean z10) {
        s9.a aVar = (s9.a) this.f20920r;
        Context context = (Context) this.f20918d;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f16360a;
        String str2 = iVar.f16360a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        j9.d dVar = iVar.f16362c;
        adler32.update(byteBufferAllocate.putInt(w9.a.a(dVar)).array());
        byte[] bArr = iVar.f16361b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        kc.f.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((t9.h) ((t9.d) this.f20919g)).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(w9.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
            Set set = ((s9.b) aVar.f21929b.get(dVar)).f21932c;
            if (set.contains(s9.d.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(s9.d.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(s9.d.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", w9.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            if (Log.isLoggable(kc.f.z("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void P(Object obj) {
        long jB = v0.i.b();
        if (jB == v0.k.f23754a) {
            this.f20920r = obj;
            return;
        }
        synchronized (this.f20919g) {
            v0.j jVar = (v0.j) ((AtomicReference) this.f20918d).get();
            int iA = jVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.f20918d).set(jVar.b(obj, jB));
            } else {
                jVar.f23753c[iA] = obj;
            }
        }
    }

    public void Q(Context context, f fVar) {
        fVar.getClass();
        if (f.a(context)) {
            Objects.toString(context);
            pc.a aVar = (pc.a) this.f20919g;
            aVar.getClass();
            bc.j jVar = new bc.j(0);
            jVar.f2610b = true;
            jVar.f2612d = ee.f.f8095g;
            jVar.f2611c = 2414;
            r rVarC = aVar.c(0, jVar.d());
            io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(24, this);
            rVarC.getClass();
            rVarC.d(dd.i.f7295a, eVar);
            pc.a aVar2 = (pc.a) this.f20919g;
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.g(10000L);
            locationRequest.e(5000L);
            tc.e.a(100);
            locationRequest.f5307a = 100;
            aVar2.e(locationRequest, (ji.a) this.f20920r, Looper.getMainLooper());
        }
    }

    public void S() {
        n.b("AndroidLocationSettingsRepo", "Update location settings");
        bk.f fVar = (bk.f) this.f20918d;
        if (fVar == null) {
            br.l.l("locationDataSource");
            throw null;
        }
        n.b("FusedLocationDataSource", "[getLocationSettings]");
        LocationRequest locationRequest = new LocationRequest();
        tc.e.a(105);
        locationRequest.f5307a = 105;
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequest);
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, false, false);
        pc.a aVar = (pc.a) fVar.f2805c;
        br.l.e(aVar, "settingsClient");
        bc.j jVar = new bc.j(0);
        jVar.f2610b = true;
        jVar.f2612d = new l2(1, locationSettingsRequest);
        jVar.f2611c = 2426;
        r rVarC = aVar.c(0, jVar.d());
        br.l.d(rVarC, "checkLocationSettings(...)");
        b0 b0Var = new b0(false, false, false);
        try {
            n.b("FusedLocationDataSource", "    calling Tasks.await()");
            tc.b bVar = (tc.b) e5.h(rVarC, 30L, TimeUnit.SECONDS);
            n.b("FusedLocationDataSource", "    got response: " + bVar);
            LocationSettingsStates locationSettingsStates = bVar.f22696a.f5319d;
            if (locationSettingsStates != null) {
                boolean z10 = locationSettingsStates.f5321d;
                boolean z11 = locationSettingsStates.f5320a;
                b0Var = new b0(z11 || z10, z11, z10);
            }
        } catch (Exception e4) {
            n.e("FusedLocationDataSource", e4);
        }
        n.b("AndroidLocationSettingsRepo", "newSettings: " + b0Var);
        n.b("AndroidLocationSettingsRepo", "locationSettings: " + ((b0) this.f20919g));
        if (b0Var.equals((b0) this.f20919g)) {
            n.b("AndroidLocationSettingsRepo", "Settings are the same. Do nothing.");
            return;
        }
        if (b0Var.f435a == ((b0) this.f20919g).f435a) {
            n.b("AndroidLocationSettingsRepo", "Settings enabled state is the same. Do nothing.");
            return;
        }
        this.f20919g = b0Var;
        n.b("AndroidLocationSettingsRepo", "Settings enabled/disabled updated. " + b0Var);
        synchronized (((ArrayList) this.f20920r)) {
            Iterator it = ((ArrayList) this.f20920r).iterator();
            while (it.hasNext()) {
                xi.m mVar = (xi.m) it.next();
                mVar.getClass();
                n.b("LocationSettingsUpdatedDS", "Location enabled state changed to " + b0Var.f435a);
                mVar.a1();
            }
        }
    }

    public synchronized void T(int i10, int i11, long j, long j7) {
        ((c1) this.f20918d).G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f20920r;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        r rVarD = ((ec.d) this.f20919g).d(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i10, 0, j, j7, null, null, 0, i11))));
        dj.i iVar = new dj.i(this, jElapsedRealtime);
        rVarD.getClass();
        rVarD.c(dd.i.f7295a, iVar);
    }

    @Override // w3.f
    public Uri a() {
        return (Uri) this.f20918d;
    }

    @Override // w6.q
    public void b(v vVar) {
        long jC;
        long j;
        a5.a.j((a5.b0) this.f20919g);
        int i10 = d0.f105a;
        a5.b0 b0Var = (a5.b0) this.f20919g;
        synchronized (b0Var) {
            try {
                long j7 = b0Var.f95c;
                jC = j7 != -9223372036854775807L ? j7 + b0Var.f94b : b0Var.c();
            } finally {
            }
        }
        a5.b0 b0Var2 = (a5.b0) this.f20919g;
        synchronized (b0Var2) {
            j = b0Var2.f94b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.r rVar = (androidx.media3.common.r) this.f20918d;
        if (j != rVar.L) {
            androidx.media3.common.q qVarA = rVar.a();
            qVarA.f1746o = j;
            androidx.media3.common.r rVar2 = new androidx.media3.common.r(qVarA);
            this.f20918d = rVar2;
            ((a0) this.f20920r).c(rVar2);
        }
        int iA = vVar.a();
        ((a0) this.f20920r).d(iA, vVar);
        ((a0) this.f20920r).a(jC, 1, iA, 0, null);
    }

    @Override // n0.c
    public void d(int i10, Object obj) {
        ((f0) this.f20920r).K(i10, (f0) obj);
    }

    @Override // n0.c
    public void e(Object obj) {
        ((ArrayList) this.f20919g).add(this.f20920r);
        this.f20920r = obj;
    }

    @Override // n0.c
    public void f() {
        a1.c cVar;
        f0 f0Var = (f0) this.f20920r;
        al.c cVar2 = f0Var.D;
        if (!f0Var.S()) {
            u1.a.a("onReuse is only expected on attached node");
        }
        f0Var.f24813s = false;
        if (f0Var.K) {
            f0Var.K = false;
        } else {
            z0.l lVar = (v1) f0Var.D.f824f;
            for (z0.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.f26499f) {
                if (lVar2.f26506o) {
                    lVar2.X();
                }
            }
            for (z0.l lVar3 = lVar; lVar3 != null; lVar3 = lVar3.f26499f) {
                if (lVar3.f26506o) {
                    lVar3.Z();
                }
            }
            while (lVar != null) {
                if (lVar.f26506o) {
                    lVar.T();
                }
                lVar = lVar.f26499f;
            }
        }
        int i10 = f0Var.f24799c;
        f0Var.f24799c = e2.h.f7710a.addAndGet(1);
        Owner owner = f0Var.f24808n;
        if (owner != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner;
            androidComposeView.getLayoutNodes().g(i10);
            androidComposeView.getLayoutNodes().h(f0Var.f24799c, f0Var);
        }
        for (z0.l lVar4 = (z0.l) cVar2.f825g; lVar4 != null; lVar4 = lVar4.f26500g) {
            lVar4.S();
        }
        cVar2.o();
        if (cVar2.i(8)) {
            f0Var.Q();
        }
        f0.o0(f0Var);
        Owner owner2 = f0Var.f24808n;
        if (owner2 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) owner2;
            if (AndroidComposeView.d() && (cVar = androidComposeView2._autofillManager) != null) {
                AndroidComposeView androidComposeView3 = cVar.f13c;
                b9.c cVar3 = cVar.f11a;
                u uVar = cVar.f17g;
                if (uVar.e(i10)) {
                    cVar3.p(androidComposeView3, i10, false);
                }
                SemanticsConfiguration semanticsConfigurationE = f0Var.E();
                if (semanticsConfigurationE != null && semanticsConfigurationE.f1191a.b(p.f7746p)) {
                    uVar.a(f0Var.f24799c);
                    cVar3.p(androidComposeView3, f0Var.f24799c, true);
                }
            }
            androidComposeView2.getRectManager().g(f0Var, true);
        }
    }

    @Override // w6.q
    public void g(a5.b0 b0Var, u5.m mVar, g0 g0Var) {
        this.f20919g = b0Var;
        g0Var.a();
        g0Var.b();
        a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 5);
        this.f20920r = a0VarMo36n;
        a0VarMo36n.c((androidx.media3.common.r) this.f20918d);
    }

    @Override // kq.a
    public Object get() {
        switch (this.f20917a) {
            case 1:
                return new c((Context) ((kq.a) this.f20918d).get(), (t9.d) ((kq.a) this.f20919g).get(), (s9.a) ((et.d) this.f20920r).get(), 3);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                Context context = (Context) ((i5.c) this.f20918d).f11238a;
                pq.h hVar = (pq.h) ((kq.a) this.f20919g).get();
                tg.g0 g0Var = (tg.g0) ((vg.c) this.f20920r).get();
                br.l.e(context, "appContext");
                br.l.e(hVar, "blockingDispatcher");
                br.l.e(g0Var, "sessionDataSerializer");
                return tg.o.b(g0Var, new a2.g(new cg.j(14, g0Var)), wt.w.b(hVar), new e0(context, 3));
            case 9:
                long jB = v0.i.b();
                if (jB == v0.k.f23754a) {
                    return this.f20920r;
                }
                v0.j jVar = (v0.j) ((AtomicReference) this.f20918d).get();
                int iA = jVar.a(jB);
                if (iA >= 0) {
                    return jVar.f23753c[iA];
                }
                return null;
            default:
                return new wg.o((pq.h) ((kq.a) this.f20918d).get(), (e1) ((kq.a) this.f20919g).get(), (d4.g) ((vg.c) this.f20920r).get());
        }
    }

    @Override // w3.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f20919g;
    }

    @Override // n0.c
    public void h(int i10, int i11, int i12) {
        f0 f0Var = (f0) this.f20920r;
        q3.a aVar = f0Var.j;
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            p0.e eVar = (p0.e) aVar.f20679d;
            pp.c cVar = (pp.c) aVar.f20680g;
            Object objK = eVar.k(i14);
            cVar.c();
            ((p0.e) aVar.f20679d).a(i15, (f0) objK);
            cVar.c();
        }
        f0Var.f0();
        f0Var.R();
        f0Var.N();
    }

    @Override // n0.c
    public void i(int i10, int i11) {
        f0 f0Var = (f0) this.f20920r;
        q3.a aVar = f0Var.j;
        if (i11 < 0) {
            u1.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            f0Var.d0((f0) ((p0.e) aVar.f20679d).f20230a[i12]);
            Object objK = ((p0.e) aVar.f20679d).k(i12);
            ((pp.c) aVar.f20680g).c();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    @Override // w3.f
    public Uri j() {
        return (Uri) this.f20920r;
    }

    @Override // n0.c
    public void k() {
        this.f20920r = ((ArrayList) this.f20919g).remove(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    @Override // zc.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(int r11, java.lang.Throwable r12, byte[] r13) {
        /*
            r10 = this;
            java.lang.Object r13 = r10.f20918d
            zc.d2 r13 = (zc.d2) r13
            r13.s1()
            java.lang.Object r0 = r10.f20920r
            com.google.android.gms.measurement.internal.zzom r0 = (com.google.android.gms.measurement.internal.zzom) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r11 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r11 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r11 != r1) goto L33
            r11 = r1
        L18:
            if (r12 != 0) goto L33
            java.lang.Object r11 = r13.f1504d
            zc.c1 r11 = (zc.c1) r11
            zc.j0 r11 = r11.f26889y
            zc.c1.g(r11)
            su.b r11 = r11.K
            long r1 = r0.f5412a
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r11.c(r12, r1)
            zc.j2 r11 = zc.j2.SUCCESS
            goto L6f
        L33:
            java.lang.Object r1 = r13.f1504d
            zc.c1 r1 = (zc.c1) r1
            zc.j0 r1 = r1.f26889y
            zc.c1.g(r1)
            su.b r1 = r1.F
            long r2 = r0.f5412a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.e(r4, r2, r3, r12)
            zc.t r12 = zc.u.f27210u
            r1 = 0
            java.lang.Object r12 = r12.a(r1)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r1 = ","
            java.lang.String[] r12 = r12.split(r1)
            java.util.List r12 = java.util.Arrays.asList(r12)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L6d
            zc.j2 r11 = zc.j2.BACKOFF
            goto L6f
        L6d:
            zc.j2 r11 = zc.j2.FAILURE
        L6f:
            java.lang.Object r12 = r10.f20919g
            java.util.concurrent.atomic.AtomicReference r12 = (java.util.concurrent.atomic.AtomicReference) r12
            java.lang.Object r1 = r13.f1504d
            zc.c1 r1 = (zc.c1) r1
            zc.x2 r3 = r1.j()
            com.google.android.gms.measurement.internal.zzaf r4 = new com.google.android.gms.measurement.internal.zzaf
            long r6 = r0.f5412a
            int r5 = r11.zza()
            long r8 = r0.f5417y
            r4.<init>(r5, r6, r8)
            r0 = r6
            r3.s1()
            r3.t1()
            r2 = 1
            com.google.android.gms.measurement.internal.zzr r2 = r3.I1(r2)
            r5 = r4
            r4 = r2
            bc.e0 r2 = new bc.e0
            r6 = 15
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r3.G1(r2)
            java.lang.Object r13 = r13.f1504d
            zc.c1 r13 = (zc.c1) r13
            zc.j0 r13 = r13.f26889y
            zc.c1.g(r13)
            su.b r13 = r13.K
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r13.d(r0, r11, r1)
            monitor-enter(r12)
            r12.set(r11)     // Catch: java.lang.Throwable -> Lbe
            r12.notifyAll()     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lbe
            return
        Lbe:
            r0 = move-exception
            r11 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lbe
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.c.l(int, java.lang.Throwable, byte[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:31:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    @Override // zc.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r7 = this;
            int r8 = r7.f20917a
            switch(r8) {
                case 28: goto Lad;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f20919g
            zc.q3 r8 = (zc.q3) r8
            long r0 = r8.f27109a
            java.lang.Object r8 = r7.f20920r
            zc.p3 r8 = (zc.p3) r8
            java.lang.Object r12 = r7.f20918d
            java.lang.String r12 = (java.lang.String) r12
            zc.a1 r2 = r8.J()
            r2.s1()
            r8.i0()
            r2 = 0
            if (r11 != 0) goto L27
            byte[] r11 = new byte[r2]     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r0 = move-exception
            r9 = r0
            goto La7
        L27:
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 == r3) goto L30
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 != r3) goto L6b
            r9 = r3
        L30:
            if (r10 != 0) goto L6b
            zc.l r10 = r8.f27099g     // Catch: java.lang.Throwable -> L23
            zc.p3.Q(r10)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r10.z1(r11)     // Catch: java.lang.Throwable -> L23
            zc.j0 r10 = r8.x()     // Catch: java.lang.Throwable -> L23
            su.b r10 = r10.K     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            r10.d(r12, r9, r11)     // Catch: java.lang.Throwable -> L23
            zc.m0 r9 = r8.f27095d     // Catch: java.lang.Throwable -> L23
            zc.p3.Q(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.M1()     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L67
            zc.l r9 = r8.f27099g     // Catch: java.lang.Throwable -> L23
            zc.p3.Q(r9)     // Catch: java.lang.Throwable -> L23
            boolean r9 = r9.y1(r12)     // Catch: java.lang.Throwable -> L23
            if (r9 == 0) goto L67
            r8.o(r12)     // Catch: java.lang.Throwable -> L23
            goto La1
        L67:
            r8.K()     // Catch: java.lang.Throwable -> L23
            goto La1
        L6b:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L23
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L23
            r3.<init>(r11, r4)     // Catch: java.lang.Throwable -> L23
            int r11 = r3.length()     // Catch: java.lang.Throwable -> L23
            r4 = 32
            int r11 = java.lang.Math.min(r4, r11)     // Catch: java.lang.Throwable -> L23
            java.lang.String r11 = r3.substring(r2, r11)     // Catch: java.lang.Throwable -> L23
            zc.j0 r3 = r8.x()     // Catch: java.lang.Throwable -> L23
            su.b r3 = r3.H     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L23
            if (r10 != 0) goto L8f
            r10 = r11
        L8f:
            r3.e(r4, r12, r9, r10)     // Catch: java.lang.Throwable -> L23
            zc.l r9 = r8.f27099g     // Catch: java.lang.Throwable -> L23
            zc.p3.Q(r9)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r9.E1(r10)     // Catch: java.lang.Throwable -> L23
            r8.K()     // Catch: java.lang.Throwable -> L23
        La1:
            r8.Q = r2
            r8.L()
            return
        La7:
            r8.Q = r2
            r8.L()
            throw r9
        Lad:
            java.lang.Object r8 = r7.f20920r
            r0 = r8
            zc.p3 r0 = (zc.p3) r0
            java.lang.Object r8 = r7.f20918d
            r5 = r8
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r7.f20919g
            r6 = r8
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r1 = 1
            r2 = r9
            r3 = r10
            r4 = r11
            r0.t(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.c.m(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    @Override // w3.f
    public Object n() {
        return null;
    }

    @Override // n0.c
    public /* bridge */ /* synthetic */ void p(int i10, Object obj) {
    }

    @Override // n0.c
    public void q() {
        Owner owner = ((f0) this.f20918d).f24808n;
        if (owner != null) {
            ((AndroidComposeView) owner).t();
        }
    }

    @Override // n0.c
    public Object r() {
        return this.f20920r;
    }

    @Override // dd.c
    public void s(r rVar) {
        yb.a aVar = (yb.a) this.f20918d;
        String str = (String) this.f20919g;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f20920r;
        synchronized (aVar.f26205a) {
            aVar.f26205a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void t(f0 f0Var, s sVar) {
        o2.g gVar = (o2.g) this.f20918d;
        o2.g gVar2 = (o2.g) this.f20919g;
        o2.g gVar3 = (o2.g) this.f20920r;
        int i10 = x1.l.f24876a[sVar.ordinal()];
        if (i10 == 1) {
            gVar.T(f0Var);
            gVar3.T(f0Var);
            return;
        }
        if (i10 == 2) {
            gVar2.T(f0Var);
            gVar3.T(f0Var);
            return;
        }
        if (i10 == 3) {
            if (f0Var.f24804h != null) {
                gVar3.T(f0Var);
                return;
            } else {
                gVar.T(f0Var);
                return;
            }
        }
        if (i10 != 4) {
            throw new bf.n();
        }
        if (f0Var.f24804h != null) {
            gVar3.T(f0Var);
        } else {
            gVar2.T(f0Var);
        }
    }

    public void u(b bVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f20918d;
        if (copyOnWriteArrayList.contains(bVar)) {
            return;
        }
        copyOnWriteArrayList.add(bVar);
    }

    public void v() {
        ((ArrayList) this.f20919g).clear();
        this.f20920r = this.f20918d;
        f0 f0Var = (f0) this.f20918d;
        q3.a aVar = f0Var.j;
        p0.e eVar = (p0.e) aVar.f20679d;
        p0.e eVar2 = (p0.e) aVar.f20679d;
        int i10 = eVar.f20232g;
        while (true) {
            i10--;
            if (-1 >= i10) {
                eVar2.g();
                ((pp.c) aVar.f20680g).c();
                return;
            }
            f0Var.d0((f0) eVar2.f20230a[i10]);
        }
    }

    public String w(String str, HashMap map) {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) this.f20920r;
        n.b("NetworkResource", "fetch() called with: url = [" + str + "], headers = [" + map + "]");
        try {
            if (!URLUtil.isValidUrl(str)) {
                n.b("NetworkResource", "executeRequest: Url is not valid");
                return null;
            }
            try {
                A(str, URLRequest.METHOD_GET, map);
                ((HttpsURLConnection) this.f20918d).connect();
                return J();
            } catch (IOException | RuntimeException e4) {
                n.e("NetworkResource", e4);
                cVar.B(Thread.currentThread());
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) this.f20918d;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                return null;
            }
        } finally {
            cVar.B(Thread.currentThread());
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) this.f20918d;
            if (httpsURLConnection2 != null) {
                httpsURLConnection2.disconnect();
            }
        }
    }

    public void x(File file, File file2) throws JSONException, IOException {
        FileInputStream fileInputStreamJ = xu.d.j(file2, new FileInputStream(file2));
        String str = new String(i3.g.C(fileInputStreamJ), tt.a.f22975a);
        ic.a.v(fileInputStreamJ);
        try {
            JSONArray jSONArray = new JSONArray("[" + str + ']');
            t tVarI = ((hk.k) this.f20918d).i();
            ak.d0 d0Var = ((ak.g) ((q3.a) this.f20919g).f20680g).f529f.f463q;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("resettableId", tVarI.f703h);
            StringBuilder sb2 = new StringBuilder("Android_");
            ch.f fVar = (ch.f) this.f20920r;
            String str2 = Build.VERSION.RELEASE;
            br.l.d(str2, "RELEASE");
            sb2.append(str2);
            jSONObject.put("platform", sb2.toString());
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("chipset", Build.MODEL);
            jSONObject.put("sdkVersion", "92.0.0");
            jSONObject.put("operatingSystem", fVar.f3941a);
            jSONObject.put("packageName", tVarI.k);
            jSONObject.put("applicationVersion", tVarI.f697b);
            jSONObject.put("applicationBuild", tVarI.f702g);
            jSONObject.put("report", d0Var.f497b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("device", jSONObject);
            jSONObject2.put("logs", jSONArray);
            io.sentry.instrumentation.file.h hVar = new io.sentry.instrumentation.file.h(file);
            try {
                hVar.write(jSONObject2.toString());
                hVar.close();
            } finally {
            }
        } catch (Exception e4) {
            cj.a.E(e4, "Failed to convert Mlvis log messages to JSON Array");
        }
    }

    public void z(pb.n nVar, Uri uri, Map map, long j, long j7, l0 l0Var) throws fa.d {
        ca.k[] kVarArr;
        ca.h hVar = new ca.h(nVar, j, j7);
        this.f20920r = hVar;
        if (((ca.k) this.f20919g) != null) {
            return;
        }
        synchronized (((ca.i) this.f20918d)) {
            try {
                ArrayList arrayList = new ArrayList(14);
                List list = (List) map.get("Content-Type");
                int iW = qb.b.w((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iW != -1) {
                    ca.i.a(iW, arrayList);
                }
                int iX = qb.b.x(uri);
                if (iX != -1 && iX != iW) {
                    ca.i.a(iX, arrayList);
                }
                int[] iArr = ca.i.f3481a;
                for (int i10 = 0; i10 < 14; i10++) {
                    int i11 = iArr[i10];
                    if (i11 != iW && i11 != iX) {
                        ca.i.a(i11, arrayList);
                    }
                }
                kVarArr = (ca.k[]) arrayList.toArray(new ca.k[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.f20919g = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                ca.k kVar = kVarArr[i12];
                try {
                } catch (EOFException unused) {
                    if (((ca.k) this.f20919g) != null || hVar.f3478r == j) {
                    }
                } catch (Throwable th3) {
                    if (((ca.k) this.f20919g) == null && hVar.f3478r != j) {
                        z10 = false;
                    }
                    qb.b.j(z10);
                    hVar.f3480y = 0;
                    throw th3;
                }
                if (kVar.g(hVar)) {
                    this.f20919g = kVar;
                    hVar.f3480y = 0;
                    break;
                } else {
                    boolean z11 = ((ca.k) this.f20919g) != null || hVar.f3478r == j;
                    qb.b.j(z11);
                    hVar.f3480y = 0;
                    i12++;
                }
            }
            if (((ca.k) this.f20919g) == null) {
                int i13 = qb.v.f20828a;
                StringBuilder sb2 = new StringBuilder();
                for (int i14 = 0; i14 < kVarArr.length; i14++) {
                    sb2.append(kVarArr[i14].getClass().getSimpleName());
                    if (i14 < kVarArr.length - 1) {
                        sb2.append(", ");
                    }
                }
                String string = sb2.toString();
                throw new fa.d(c7.a.k(c7.a.d(58, string), "None of the available extractors (", string, ") could read the stream."), null, false, 1);
            }
        }
        ((ca.k) this.f20919g).h(l0Var);
    }

    public /* synthetic */ c(p3 p3Var, String str, Object obj, int i10) {
        this.f20917a = i10;
        this.f20918d = str;
        this.f20919g = obj;
        this.f20920r = p3Var;
    }

    public c(Context context, c1 c1Var) {
        this.f20917a = 26;
        this.f20920r = new AtomicLong(-1L);
        this.f20919g = new ec.d(context, null, ec.d.k, new cc.i("measurement:api"), ac.e.f324b);
        this.f20918d = c1Var;
    }

    public c(SharedPreferences sharedPreferences, SurvicateSerializer survicateSerializer, sm.m mVar, no.b bVar) {
        this.f20917a = 4;
        br.l.e(sharedPreferences, "preferences");
        br.l.e(survicateSerializer, "serializer");
        br.l.e(mVar, "contactActionSerializer");
        br.l.e(bVar, "logger");
        this.f20918d = sharedPreferences;
        this.f20919g = survicateSerializer;
        this.f20920r = bVar;
    }

    public c(List list) {
        this.f20917a = 8;
        this.f20920r = list;
        this.f20918d = new ArrayList(list.size());
        this.f20919g = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((ArrayList) this.f20918d).add(new u8.m((List) ((z8.i) list.get(i10)).f26736b.f1504d));
            ((ArrayList) this.f20919g).add(((z8.i) list.get(i10)).f26737c.E0());
        }
    }

    @Override // w3.f
    public void c() {
    }

    public c(int i10) {
        this.f20917a = i10;
        switch (i10) {
            case 9:
                this.f20918d = new AtomicReference(v0.i.f23750b);
                this.f20919g = new Object();
                break;
            case 17:
                this.f20918d = new o2.g(27);
                this.f20919g = new o2.g(27);
                this.f20920r = new o2.g(27);
                break;
            case 19:
                break;
            case 20:
                this.f20919g = new b0(false, false, false);
                this.f20920r = new ArrayList();
                break;
            default:
                this.f20918d = new CopyOnWriteArrayList();
                this.f20920r = new ji.a(2, this);
                break;
        }
    }

    public c(oh.p pVar, q3.a aVar, sm.m mVar) {
        this.f20917a = 15;
        this.f20918d = pVar;
        this.f20919g = aVar;
        this.f20920r = kc.f.F(new wj.b(0));
    }

    public c(js.g gVar, l2 l2Var) {
        this.f20917a = 16;
        this.f20918d = gVar;
        this.f20919g = l2Var;
        this.f20920r = new ConcurrentHashMap();
    }

    public c(hk.k kVar, q3.a aVar, ch.f fVar, cj.a aVar2) {
        this.f20917a = 10;
        this.f20918d = kVar;
        this.f20919g = aVar;
        this.f20920r = fVar;
    }

    public c(io.sentry.internal.debugmeta.c cVar) {
        this.f20917a = 14;
        this.f20918d = null;
        this.f20919g = new AtomicBoolean(false);
        this.f20920r = cVar;
    }

    public c(jv.a aVar, uv.b bVar) {
        this.f20917a = 6;
        this.f20918d = aVar;
        this.f20919g = bVar;
        this.f20920r = new HashMap();
    }

    public c(String str) {
        this.f20917a = 12;
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.k = str;
        this.f20918d = new androidx.media3.common.r(qVar);
    }

    public c(ca.i iVar) {
        this.f20917a = 23;
        this.f20918d = iVar;
    }

    public c(rr.j jVar, List list, c cVar) {
        this.f20917a = 2;
        br.l.e(jVar, "classifierDescriptor");
        br.l.e(list, "arguments");
        this.f20918d = jVar;
        this.f20919g = list;
        this.f20920r = cVar;
    }

    public c(Runnable runnable) {
        this.f20917a = 7;
        this.f20918d = new CopyOnWriteArrayList();
        this.f20920r = new HashMap();
        this.f20919g = runnable;
    }

    public c(y9.g[] gVarArr) {
        this.f20917a = 21;
        y9.x xVar = new y9.x();
        y9.y yVar = new y9.y();
        yVar.f26018c = 1.0f;
        yVar.f26019d = 1.0f;
        y9.e eVar = y9.e.f25917e;
        yVar.f26020e = eVar;
        yVar.f26021f = eVar;
        yVar.f26022g = eVar;
        yVar.f26023h = eVar;
        ByteBuffer byteBuffer = y9.g.f25922a;
        yVar.k = byteBuffer;
        yVar.f26025l = byteBuffer.asShortBuffer();
        yVar.f26026m = byteBuffer;
        yVar.f26017b = -1;
        y9.g[] gVarArr2 = new y9.g[gVarArr.length + 2];
        this.f20918d = gVarArr2;
        System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
        this.f20919g = xVar;
        this.f20920r = yVar;
        gVarArr2[gVarArr.length] = xVar;
        gVarArr2[gVarArr.length + 1] = yVar;
    }

    public c(f0 f0Var) {
        this.f20917a = 18;
        this.f20918d = f0Var;
        this.f20919g = new ArrayList();
        this.f20920r = f0Var;
    }

    public c(y9.s sVar) {
        this.f20917a = 22;
        this.f20920r = sVar;
        this.f20918d = new Handler();
        this.f20919g = new f5.y(1, this);
    }
}
