package io.sentry.android.replay.capture;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.util.Log;
import android.view.Display;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import androidx.media3.common.r;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import com.survicate.surveys.infrastructure.network.URLRequest;
import com.survicate.surveys.presentation.numerical.micro.MicroSurveyPointNumericalContentView;
import h7.h0;
import io.sentry.android.core.e0;
import io.sentry.b5;
import io.sentry.h4;
import io.sentry.m3;
import io.sentry.r3;
import io.sentry.u0;
import io.sentry.x5;
import io.sentry.z0;
import ja.q;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kg.a0;
import kg.c0;
import l5.y;
import l5.z;
import l9.u;
import wt.w;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements r3, io.sentry.util.d, m3, ne.h, dd.a, dd.c, y, dn.g, oa.j, dd.g, dd.e, pm.c, u9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11881a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11882d;

    public /* synthetic */ e(int i10, Object obj) {
        this.f11881a = i10;
        this.f11882d = obj;
    }

    @Override // l5.y, oa.j
    public int a(Object obj) {
        switch (this.f11881a) {
            case 14:
                r rVar = (r) this.f11882d;
                l5.n nVar = (l5.n) obj;
                String str = nVar.f14724b;
                return ((str.equals(rVar.H) || str.equals(z.b(rVar))) && nVar.c(rVar, false)) ? 1 : 0;
            default:
                try {
                    return ((oa.c) obj).c((Format) this.f11882d) ? 1 : 0;
                } catch (oa.h unused) {
                    return -1;
                }
        }
    }

    @Override // ne.h
    public Object apply(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f11881a) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                obj2 = (ja.i) this.f11882d;
                obj3 = (q) obj;
                break;
            default:
                obj2 = (l6.h) this.f11882d;
                obj3 = (l6.o) obj;
                break;
        }
        obj2.getClass();
        return obj3;
    }

    public k9.b b(io.sentry.k kVar) throws IOException {
        k9.c cVar = (k9.c) this.f11882d;
        URL url = (URL) kVar.f12397d;
        if (Log.isLoggable(kc.f.z("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f14226g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(URLRequest.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) kVar.f12399r;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    z7.j jVar = cVar.f14220a;
                    l9.m mVar = (l9.m) kVar.f12398g;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    zf.c cVar2 = (zf.c) jVar.f26706d;
                    zf.d dVar = new zf.d(bufferedWriter, cVar2.f27371a, cVar2.f27372b, cVar2.f27373c, cVar2.f27374d);
                    dVar.h(mVar);
                    dVar.j();
                    dVar.f27376b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable(kc.f.z("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    kc.f.q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    kc.f.q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new k9.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new k9.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            k9.b bVar = new k9.b(responseCode, null, u.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f15063a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e4) {
            e = e4;
            kc.f.t("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k9.b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            kc.f.t("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new k9.b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            kc.f.t("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k9.b(400, null, 0L);
        } catch (xf.b e12) {
            e = e12;
            kc.f.t("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new k9.b(400, null, 0L);
        }
    }

    public void c(Display display) {
        switch (this.f11881a) {
            case 25:
                rb.q qVar = (rb.q) this.f11882d;
                qVar.getClass();
                if (display == null) {
                    e0.p("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                    qVar.j = -9223372036854775807L;
                    qVar.k = -9223372036854775807L;
                    break;
                } else {
                    long refreshRate = (long) (1.0E9d / display.getRefreshRate());
                    qVar.j = refreshRate;
                    qVar.k = (refreshRate * 80) / 100;
                    break;
                }
            default:
                s5.h hVar = (s5.h) this.f11882d;
                hVar.getClass();
                if (display == null) {
                    a5.a.B("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                    hVar.k = -9223372036854775807L;
                    hVar.f21911l = -9223372036854775807L;
                    break;
                } else {
                    long refreshRate2 = (long) (1.0E9d / display.getRefreshRate());
                    hVar.k = refreshRate2;
                    hVar.f21911l = (refreshRate2 * 80) / 100;
                    break;
                }
        }
    }

    public void d(QuestionPointAnswer questionPointAnswer) {
        v vVarC;
        MicroSurveyPointNumericalContentView microSurveyPointNumericalContentView = (MicroSurveyPointNumericalContentView) this.f11882d;
        int i10 = MicroSurveyPointNumericalContentView.H;
        pp.a aVar = microSurveyPointNumericalContentView.f6472r;
        pq.c cVar = null;
        if (aVar == null) {
            br.l.l("bindingData");
            throw null;
        }
        if (aVar.a() && (vVarC = o0.c(microSurveyPointNumericalContentView)) != null) {
            w.s(o0.d(vVarC), null, null, new cq.h(microSurveyPointNumericalContentView, cVar, 6), 3);
        }
        ar.a aVar2 = microSurveyPointNumericalContentView.onValidationStateUpdate;
        if (aVar2 != null) {
            aVar2.c();
        }
        SurveyAnswer surveyAnswerC = microSurveyPointNumericalContentView.c(questionPointAnswer);
        ar.k kVar = microSurveyPointNumericalContentView.onAnswerSelected;
        if (kVar != null) {
            kVar.a(surveyAnswerC);
        }
    }

    @Override // io.sentry.util.d
    public Object e() throws IOException {
        io.sentry.cache.tape.i iVar;
        int maxBreadcrumbs;
        RandomAccessFile randomAccessFileB;
        switch (this.f11881a) {
            case 2:
                return ((io.sentry.cache.b) this.f11882d).f12122a.getSerializer();
            case 3:
                io.sentry.cache.f fVar = (io.sentry.cache.f) this.f11882d;
                x5 x5Var = fVar.f12133a;
                File fileB = io.sentry.cache.a.b(x5Var, ".scope-cache");
                if (fileB == null) {
                    x5Var.getLogger().m(b5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new io.sentry.cache.tape.b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    maxBreadcrumbs = x5Var.getMaxBreadcrumbs();
                    randomAccessFileB = io.sentry.cache.tape.i.b(file);
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = x5Var.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileB2 = io.sentry.cache.tape.i.b(file);
                    try {
                        iVar = new io.sentry.cache.tape.i(file, randomAccessFileB2, maxBreadcrumbs2);
                    } catch (Throwable th2) {
                        randomAccessFileB2.close();
                        throw th2;
                    }
                }
                try {
                    try {
                        iVar = new io.sentry.cache.tape.i(file, randomAccessFileB, maxBreadcrumbs);
                        return new io.sentry.cache.tape.e(iVar, new h0(fVar));
                    } catch (Throwable th3) {
                        randomAccessFileB.close();
                        throw th3;
                    }
                } catch (IOException e4) {
                    x5Var.getLogger().g(b5.ERROR, "Failed to create breadcrumbs queue", e4);
                    return new io.sentry.cache.tape.b();
                }
            default:
                return Boolean.valueOf(sm.f.J((u0) this.f11882d, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // io.sentry.m3
    public void f(io.sentry.k kVar) {
        ((z0) this.f11882d).t(new io.sentry.k(1));
    }

    @Override // u9.b
    public Object g() {
        SQLiteDatabase sQLiteDatabaseB;
        int i10 = this.f11881a;
        Object obj = this.f11882d;
        boolean z10 = false;
        switch (i10) {
            case 28:
                t9.h hVar = (t9.h) ((t9.c) obj);
                hVar.getClass();
                int i11 = p9.a.f20337e;
                js.e eVar = new js.e(9, z10);
                eVar.f13798g = null;
                eVar.f13797d = new ArrayList();
                eVar.f13799r = null;
                eVar.f13800x = "";
                HashMap map = new HashMap();
                sQLiteDatabaseB = hVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    p9.a aVar = (p9.a) t9.h.G(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new h4(hVar, map, eVar, 13));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            default:
                t9.h hVar2 = (t9.h) ((t9.d) obj);
                long jE = hVar2.f22680d.e() - hVar2.f22682r.f22669d;
                sQLiteDatabaseB = hVar2.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jE)};
                    Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.q(cursorRawQuery.getInt(0), p9.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB.setTransactionSuccessful();
                    sQLiteDatabaseB.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
        }
    }

    @Override // dd.e
    public void h(Object obj) {
        qm.c cVar = (qm.c) this.f11882d;
        Location location = (Location) obj;
        if (location != null) {
            Iterator it = ((CopyOnWriteArrayList) cVar.f20918d).iterator();
            while (it.hasNext()) {
                qm.b bVar = (qm.b) it.next();
                if (bVar != null) {
                    bVar.onLocationChanged(location);
                }
            }
        }
    }

    @Override // io.sentry.r3
    public void i(z0 z0Var) {
        switch (this.f11881a) {
            case 0:
                g gVar = (g) this.f11882d;
                br.l.e(z0Var, "it");
                z0Var.j(gVar.h());
                break;
            default:
                p pVar = (p) this.f11882d;
                br.l.e(z0Var, "it");
                z0Var.j(pVar.h());
                String strF = z0Var.F();
                String strT0 = strF != null ? tt.l.T0('.', strF, strF) : null;
                b bVar = pVar.f11870l;
                ir.v vVar = c.f11860q[2];
                bVar.getClass();
                br.l.e(vVar, "property");
                Object andSet = bVar.f11857b.getAndSet(strT0);
                if (!br.l.a(andSet, strT0)) {
                    a aVar = new a(andSet, strT0, bVar.f11859d, 3);
                    c cVar = bVar.f11858c;
                    x5 x5Var = cVar.f11861a;
                    if (x5Var.getThreadChecker().c()) {
                        ((ScheduledExecutorService) cVar.f11865e.getValue()).submit(new io.sentry.android.replay.util.c(new b4.e(17, aVar), "CaptureStrategy.runInBackground"));
                        break;
                    } else {
                        try {
                            aVar.c();
                            break;
                        } catch (Throwable th2) {
                            x5Var.getLogger().g(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                        }
                    }
                }
                break;
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        switch (this.f11881a) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return (dd.r) ((hf.j) this.f11882d).call();
            default:
                ((Runnable) this.f11882d).run();
                return e5.u(null);
        }
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        return e5.u((pg.f) this.f11882d);
    }

    @Override // dn.g
    public void onDismiss() throws MissingResourceException {
        TestsFragment testsFragment = (TestsFragment) this.f11882d;
        al.c cVar = testsFragment.I0;
        if (cVar == null) {
            br.l.l("presenter");
            throw null;
        }
        cVar.l();
        testsFragment.E0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0102 A[Catch: NumberFormatException | Exception -> 0x0168, TryCatch #3 {NumberFormatException | Exception -> 0x0168, blocks: (B:29:0x0099, B:33:0x00a7, B:37:0x00b1, B:41:0x00b9, B:45:0x00c5, B:49:0x00cf, B:51:0x00e6, B:52:0x00ea, B:54:0x00f0, B:56:0x00fa, B:61:0x0102, B:63:0x0108, B:65:0x010e, B:66:0x0121, B:68:0x0127, B:70:0x012d, B:71:0x015a, B:48:0x00cb, B:44:0x00c1, B:40:0x00b6, B:36:0x00ad, B:32:0x00a3), top: B:88:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: NumberFormatException | Exception -> 0x0168, TryCatch #3 {NumberFormatException | Exception -> 0x0168, blocks: (B:29:0x0099, B:33:0x00a7, B:37:0x00b1, B:41:0x00b9, B:45:0x00c5, B:49:0x00cf, B:51:0x00e6, B:52:0x00ea, B:54:0x00f0, B:56:0x00fa, B:61:0x0102, B:63:0x0108, B:65:0x010e, B:66:0x0121, B:68:0x0127, B:70:0x012d, B:71:0x015a, B:48:0x00cb, B:44:0x00c1, B:40:0x00b6, B:36:0x00ad, B:32:0x00a3), top: B:88:0x0099 }] */
    @Override // pm.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r14, java.util.ArrayList r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.e.r(int, java.util.ArrayList):void");
    }

    @Override // dd.c
    public void s(dd.r rVar) {
        switch (this.f11881a) {
            case 11:
                a0.b((Intent) this.f11882d);
                break;
            case 12:
                ((c0) this.f11882d).f14352b.c(null);
                break;
            default:
                ((ScheduledFuture) this.f11882d).cancel(false);
                break;
        }
    }

    public /* synthetic */ e(sm.f fVar, u0 u0Var) {
        this.f11881a = 4;
        this.f11882d = u0Var;
    }
}
