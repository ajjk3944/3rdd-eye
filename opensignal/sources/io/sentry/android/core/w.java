package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.internal.measurement.e5;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.t4;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import zc.c1;
import zc.l2;
import zc.o2;
import zc.x2;
import zc.z1;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11787a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final long f11788d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11789g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f11790r;

    public w(o2 o2Var, l2 l2Var, long j) {
        this.f11789g = l2Var;
        this.f11788d = j;
        Objects.requireNonNull(o2Var);
        this.f11790r = o2Var;
    }

    public void a(ApplicationExitInfo applicationExitInfo, boolean z10) {
        kg.r rVar;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f11790r;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z11 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    rVar = new kg.r(y.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i10 = traceInputStream.read(bArr2, 0, 1024);
                            if (i10 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, i10);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                    aVar.f11620a = line;
                                    arrayList.add(aVar);
                                }
                                c3.h hVar = new c3.h(arrayList);
                                io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(sentryAndroidOptions, z11);
                                bVar.d(hVar);
                                ArrayList arrayList2 = bVar.f11635e;
                                rVar = arrayList2.isEmpty() ? new kg.r(y.NO_DUMP) : new kg.r(y.DUMP, byteArray, arrayList2, new ArrayList(bVar.f11634d.values()));
                                bufferedReader.close();
                            } finally {
                            }
                        } catch (Throwable th2) {
                            sentryAndroidOptions.getLogger().g(b5.WARNING, "Failed to parse ANR thread dump", th2);
                            y yVar = y.ERROR;
                            rVar = new kg.r();
                            rVar.f14395a = yVar;
                            rVar.f14396d = byteArray;
                            rVar.f14397g = null;
                            rVar.f14398r = null;
                        }
                    } finally {
                    }
                }
            } finally {
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().g(b5.WARNING, "Failed to read ANR thread dump", th3);
            rVar = new kg.r(y.NO_DUMP);
        }
        y yVar2 = (y) rVar.f14395a;
        if (yVar2 == y.NO_DUMP) {
            sentryAndroidOptions.getLogger().m(b5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        x xVar = new x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z10, z11);
        io.sentry.h0 h0VarJ = dr.a.j(xVar);
        t4 t4Var = new t4();
        if (yVar2 == y.ERROR) {
            io.sentry.protocol.l lVar = new io.sentry.protocol.l();
            lVar.f12586a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            t4Var.M = lVar;
        } else if (yVar2 == y.DUMP) {
            t4Var.O = new fh.f((List) rVar.f14397g);
            ArrayList arrayList3 = (ArrayList) rVar.f14398r;
            if (arrayList3 != null) {
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                dVar.f12531d = new ArrayList(arrayList3);
                t4Var.J = dVar;
            }
        }
        t4Var.Q = b5.FATAL;
        t4Var.L = dr.a.r(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) rVar.f14396d) != null) {
            h0VarJ.f12298f = new io.sentry.a(bArr);
        }
        if (c4.c().y(t4Var, h0VarJ).equals(io.sentry.protocol.t.f12636d) || xVar.d()) {
            return;
        }
        sentryAndroidOptions.getLogger().m(b5.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", t4Var.f12268a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strN;
        int i10 = this.f11787a;
        ApplicationExitInfo applicationExitInfo = null;
        long j = this.f11788d;
        Object obj = this.f11789g;
        Object obj2 = this.f11790r;
        switch (i10) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj2;
                List historicalProcessExitReasons = ((ActivityManager) ((Context) obj).getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    io.sentry.cache.c envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
                    if ((envelopeDiskCache instanceof io.sentry.cache.b) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
                        io.sentry.cache.b bVar = (io.sentry.cache.b) envelopeDiskCache;
                        if (!bVar.g()) {
                            sentryAndroidOptions.getLogger().m(b5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                            bVar.f12126x.countDown();
                        }
                    }
                    ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
                    int i11 = io.sentry.android.core.cache.a.G;
                    String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                    ir.f0.T(cacheDirPath, "Cache dir path should be set for getting ANRs reported");
                    File file = new File(cacheDirPath, "last_anr_report");
                    try {
                        strN = e5.N(file);
                    } catch (Throwable th2) {
                        if (th2 instanceof FileNotFoundException) {
                            sentryAndroidOptions.getLogger().m(b5.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
                        } else {
                            sentryAndroidOptions.getLogger().g(b5.ERROR, "Error reading last ANR marker", th2);
                        }
                    }
                    Long lValueOf = strN.equals("null") ? null : Long.valueOf(Long.parseLong(strN.trim()));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ApplicationExitInfo applicationExitInfoG = a5.q.g(it.next());
                            if (applicationExitInfoG.getReason() == 6) {
                                arrayList.remove(applicationExitInfoG);
                                applicationExitInfo = applicationExitInfoG;
                            }
                        }
                    }
                    if (applicationExitInfo != null) {
                        if (applicationExitInfo.getTimestamp() >= j) {
                            if (lValueOf != null && applicationExitInfo.getTimestamp() <= lValueOf.longValue()) {
                                sentryAndroidOptions.getLogger().m(b5.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                                break;
                            } else {
                                if (sentryAndroidOptions.isReportHistoricalAnrs()) {
                                    Collections.reverse(arrayList);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        ApplicationExitInfo applicationExitInfoG2 = a5.q.g(it2.next());
                                        if (applicationExitInfoG2.getReason() == 6) {
                                            if (applicationExitInfoG2.getTimestamp() < j) {
                                                sentryAndroidOptions.getLogger().m(b5.DEBUG, "ANR happened too long ago %s.", applicationExitInfoG2);
                                            } else if (lValueOf == null || applicationExitInfoG2.getTimestamp() > lValueOf.longValue()) {
                                                a(applicationExitInfoG2, false);
                                            } else {
                                                sentryAndroidOptions.getLogger().m(b5.DEBUG, "ANR has already been reported %s.", applicationExitInfoG2);
                                            }
                                        }
                                    }
                                }
                                a(applicationExitInfo, true);
                                break;
                            }
                        } else {
                            sentryAndroidOptions.getLogger().m(b5.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                            break;
                        }
                    } else {
                        sentryAndroidOptions.getLogger().m(b5.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                        break;
                    }
                } else {
                    sentryAndroidOptions.getLogger().m(b5.DEBUG, "No records in historical exit reasons.", new Object[0]);
                    break;
                }
                break;
            default:
                o2 o2Var = (o2) obj2;
                o2Var.w1((l2) obj, false, j);
                o2Var.f27057y = null;
                x2 x2VarJ = ((c1) o2Var.f1504d).j();
                x2VarJ.s1();
                x2VarJ.t1();
                x2VarJ.G1(new z1(x2VarJ, (l2) null));
                break;
        }
    }

    public w(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.d dVar) {
        this.f11789g = context;
        this.f11790r = sentryAndroidOptions;
        dVar.getClass();
        this.f11788d = System.currentTimeMillis() - AnrV2Integration.f11483r;
    }
}
