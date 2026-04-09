package io.sentry.internal.debugmeta;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.media.MediaCodec;
import android.net.TrafficStats;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import as.d0;
import br.l;
import cc.s;
import ch.f;
import cj.n;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.activities.MainActivity;
import dd.g;
import dd.r;
import g4.j;
import h7.r1;
import h7.x1;
import h7.y1;
import h9.r2;
import ht.b0;
import ht.c1;
import ht.o0;
import ht.x;
import io.sentry.android.core.e0;
import io.sentry.b5;
import io.sentry.u0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lq.q;
import ls.d;
import mq.o;
import mq.p;
import mq.w;
import ns.e;
import o.m;
import or.h;
import org.json.JSONException;
import org.json.JSONObject;
import u3.i0;
import u3.l0;
import vs.a0;
import vs.i;
import vs.k;
import vs.u;
import vs.v;
import vs.y;
import vs.z;
import ya.r0;

/* loaded from: classes.dex */
public final class c implements a, d0, n, fj.a, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12352a;

    /* renamed from: d, reason: collision with root package name */
    public Object f12353d;

    /* renamed from: g, reason: collision with root package name */
    public Object f12354g;

    public /* synthetic */ c(int i10, Object obj, Object obj2, boolean z10) {
        this.f12352a = i10;
        this.f12353d = obj2;
        this.f12354g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.internal.debugmeta.c a(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            io.sentry.internal.debugmeta.c r2 = new io.sentry.internal.debugmeta.c     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 20
            r2.<init>(r5, r3, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            io.sentry.android.core.e0.c(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.internal.debugmeta.c.a(android.content.Context):io.sentry.internal.debugmeta.c");
    }

    public static int n(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.internal.debugmeta.c v(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            cv.j[] r0 = new cv.j[r0]     // Catch: java.io.IOException -> L6d
            cv.g r1 = new cv.g     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = d9.b.f7177x     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.p0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.v0(r4, r9, r8)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.u0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.v0(r4, r9, r7)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.p0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f6706d     // Catch: java.io.IOException -> L6d
            cv.j r4 = r1.k(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            io.sentry.internal.debugmeta.c r1 = new io.sentry.internal.debugmeta.c     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            cv.v r0 = ba.m.F(r0)     // Catch: java.io.IOException -> L6d
            r2 = 14
            r1.<init>(r12, r2, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.internal.debugmeta.c.v(java.lang.String[]):io.sentry.internal.debugmeta.c");
    }

    public void A() throws IOException {
        try {
            ((FileLock) this.f12354g).release();
            ((FileChannel) this.f12353d).close();
        } catch (IOException e4) {
            e0.c("CrossProcessLock", "encountered error while releasing, ignoring", e4);
        }
    }

    public void B(Thread thread) {
        l.e(thread, "thread");
        if (((f) this.f12353d).c()) {
            synchronized (((HashMap) this.f12354g)) {
                long id2 = thread.getId();
                Integer num = (Integer) ((HashMap) this.f12354g).get(Long.valueOf(id2));
                if (num != null) {
                    TrafficStats.setThreadStatsTag(num.intValue());
                    ((HashMap) this.f12354g).remove(Long.valueOf(id2));
                }
            }
        }
    }

    public vs.g C(x xVar, d dVar, ns.f fVar) {
        l.e(dVar, "value");
        l.e(fVar, "nameResolver");
        boolean zBooleanValue = e.M.e(dVar.I).booleanValue();
        ls.c cVar = dVar.f15744g;
        switch (cVar == null ? -1 : dt.d.f7481a[cVar.ordinal()]) {
            case 1:
                byte b2 = (byte) dVar.f15745r;
                return zBooleanValue ? new a0(b2) : new vs.d(b2);
            case 2:
                return new vs.e(Character.valueOf((char) dVar.f15745r));
            case 3:
                short s8 = (short) dVar.f15745r;
                return zBooleanValue ? new a0(s8) : new vs.x(s8);
            case 4:
                int i10 = (int) dVar.f15745r;
                return zBooleanValue ? new a0(i10) : new k(i10);
            case j.STRING_FIELD_NUMBER /* 5 */:
                long j = dVar.f15745r;
                return zBooleanValue ? new a0(j) : new v(j);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new vs.c(dVar.f15746x);
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new vs.c(dVar.f15747y);
            case j.BYTES_FIELD_NUMBER /* 8 */:
                return new vs.c(Boolean.valueOf(dVar.f15745r != 0));
            case 9:
                return new y(fVar.getString(dVar.B));
            case 10:
                return new u(io.sentry.config.a.T(fVar, dVar.D), dVar.H);
            case 11:
                return new i(io.sentry.config.a.T(fVar, dVar.D), io.sentry.config.a.Y(fVar, dVar.E));
            case 12:
                ls.g gVar = dVar.F;
                l.d(gVar, "value.annotation");
                return new vs.a((Object) e(gVar, fVar));
            case 13:
                List<d> list = dVar.G;
                l.d(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                for (d dVar2 : list) {
                    b0 b0VarE = ((rr.a0) this.f12353d).n().e();
                    l.d(dVar2, "it");
                    arrayList.add(C(b0VarE, dVar2, fVar));
                }
                return new z(arrayList, xVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + dVar.f15744g + " (expected " + xVar + ')').toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public nq.i D(ht.x0 r17, java.util.List r18, fs.a r19) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.internal.debugmeta.c.D(ht.x0, java.util.List, fs.a):nq.i");
    }

    public ca.x E(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f12353d;
            if (i11 >= iArr.length) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("Unmatched track of type: ");
                sb2.append(i10);
                e0.d("BaseMediaChunkOutput", sb2.toString());
                return new ca.j();
            }
            if (i10 == iArr[i11]) {
                return ((r0[]) this.f12354g)[i11];
            }
            i11++;
        }
    }

    public void b(Thread thread) {
        l.e(thread, "thread");
        if (((f) this.f12353d).c()) {
            synchronized (((HashMap) this.f12354g)) {
            }
        }
    }

    public void c() {
        switch (this.f12352a) {
            case 11:
                this.f12353d = null;
                this.f12354g = null;
                break;
            default:
                this.f12353d = null;
                this.f12354g = null;
                break;
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List d() throws IOException {
        InputStream inputStreamOpenStream;
        u0 u0Var = (u0) this.f12353d;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.f12354g).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    inputStreamOpenStream = urlNextElement.openStream();
                } catch (RuntimeException e4) {
                    u0Var.f(b5.ERROR, e4, "%s file is malformed.", urlNextElement);
                }
                try {
                    Properties properties = new Properties();
                    properties.load(inputStreamOpenStream);
                    arrayList.add(properties);
                    u0Var.m(b5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                    if (inputStreamOpenStream != null) {
                        inputStreamOpenStream.close();
                    }
                } catch (Throwable th2) {
                    if (inputStreamOpenStream != null) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (IOException e10) {
            u0Var.f(b5.ERROR, e10, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        u0Var.m(b5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Type inference failed for: r6v0, types: [lq.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public sr.c e(ls.g r11, ns.f r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.internal.debugmeta.c.e(ls.g, ns.f):sr.c");
    }

    public void f(d5.c cVar) {
        synchronized (cVar) {
        }
        Handler handler = (Handler) this.f12353d;
        if (handler != null) {
            handler.post(new f5.c(this, cVar, 1));
        }
    }

    public boolean g(vs.g gVar, x xVar, d dVar) {
        vs.g gVar2;
        d dVar2;
        rr.a0 a0Var = (rr.a0) this.f12353d;
        ls.c cVar = dVar.f15744g;
        int i10 = cVar == null ? -1 : dt.d.f7481a[cVar.ordinal()];
        if (i10 == 10) {
            rr.i iVarP = xVar.Z().p();
            rr.f fVar = iVarP instanceof rr.f ? (rr.f) iVarP : null;
            if (fVar != null) {
                qs.g gVar3 = h.f19672e;
                if (!h.b(fVar, or.n.P)) {
                    return false;
                }
            }
            return true;
        }
        if (i10 != 13) {
            return l.a(gVar.a(a0Var), xVar);
        }
        if (gVar instanceof vs.b) {
            Object obj = ((vs.b) gVar).f23957a;
            if (((List) obj).size() == dVar.G.size()) {
                x xVarF = a0Var.n().f(xVar);
                Collection collection = (Collection) obj;
                l.e(collection, "<this>");
                Iterable dVar3 = new hr.d(0, collection.size() - 1, 1);
                if (!(dVar3 instanceof Collection) || !((Collection) dVar3).isEmpty()) {
                    Iterator it = dVar3.iterator();
                    do {
                        hr.c cVar2 = (hr.c) it;
                        if (cVar2.f10868g) {
                            int iNextInt = cVar2.nextInt();
                            gVar2 = (vs.g) ((List) obj).get(iNextInt);
                            dVar2 = (d) dVar.G.get(iNextInt);
                            l.d(dVar2, "value.getArrayElement(i)");
                        }
                    } while (g(gVar2, xVarF, dVar2));
                    return false;
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    public View h(int i10, int i11, int i12, int i13) {
        x1 x1Var = (x1) this.f12354g;
        y1 y1Var = (y1) this.f12353d;
        int iE = y1Var.e();
        int iH = y1Var.h();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewK = y1Var.k(i10);
            int iD = y1Var.d(viewK);
            int iM = y1Var.m(viewK);
            x1Var.f10264b = iE;
            x1Var.f10265c = iH;
            x1Var.f10266d = iD;
            x1Var.f10267e = iM;
            if (i12 != 0) {
                x1Var.f10263a = i12;
                if (x1Var.a()) {
                    return viewK;
                }
            }
            if (i13 != 0) {
                x1Var.f10263a = i13;
                if (x1Var.a()) {
                    view = viewK;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File i() {
        if (((File) this.f12353d) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f12353d) == null) {
                        se.f fVar = (se.f) this.f12354g;
                        fVar.a();
                        this.f12353d = new File(fVar.f22007a.getFilesDir(), "PersistedInstallation." + ((se.f) this.f12354g).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f12353d;
    }

    public c1 j(fs.a aVar) {
        c1 c1VarR;
        b0 b0Var = aVar.f9056f;
        return (b0Var == null || (c1VarR = se.b.R(b0Var)) == null) ? (kt.h) ((q) this.f12353d).getValue() : c1VarR;
    }

    public x k(rr.r0 r0Var, fs.a aVar) {
        l.e(r0Var, "typeParameter");
        l.e(aVar, "typeAttr");
        return (x) ((gt.e) this.f12354g).a(new o0(r0Var, aVar));
    }

    @Override // fj.a
    public List l(TelephonyManager telephonyManager) throws InterruptedException {
        boolean zI = ((ag.b) this.f12353d).i("android.permission.ACCESS_FINE_LOCATION");
        ch.n.b("PostApi29CellInfoUpdater", "hasFineLocationPermission: " + zI);
        w wVar = w.f16945a;
        if (!zI) {
            return wVar;
        }
        br.w wVar2 = new br.w();
        wVar2.f2917a = wVar;
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            if (telephonyManager != null) {
                telephonyManager.requestCellInfoUpdate((Executor) this.f12354g, new fj.e(wVar2, countDownLatch));
            }
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (IllegalStateException | InterruptedException | NullPointerException unused) {
        }
        return (List) wVar2.f2917a;
    }

    public synchronized Map m() {
        try {
            if (((Map) this.f12354g) == null) {
                this.f12354g = Collections.unmodifiableMap(new HashMap((HashMap) this.f12353d));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f12354g;
    }

    @Override // dd.g
    public r o(Object obj) {
        Boolean bool = (Boolean) obj;
        hf.l lVar = (hf.l) this.f12354g;
        if (bool.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue = bool.booleanValue();
            cj.a aVar = lVar.f10668b;
            if (zBooleanValue) {
                ((dd.h) aVar.f3978y).c(null);
                return ((r) this.f12353d).k(lVar.f10671e.f13707a, new r1(1, this));
            }
            aVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        of.b bVar = lVar.f10673g;
        Iterator it = of.b.m(((File) bVar.f19423g).listFiles(hf.l.f10665r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        of.b bVar2 = ((of.a) lVar.f10677m.f10471d).f19418b;
        of.a.a(of.b.m(((File) bVar2.f19425x).listFiles()));
        of.a.a(of.b.m(((File) bVar2.f19426y).listFiles()));
        of.a.a(of.b.m(((File) bVar2.B).listFiles()));
        lVar.f10681q.c(null);
        return e5.u(null);
    }

    public String p(String str) {
        String str2 = (String) this.f12354g;
        Resources resources = (Resources) this.f12353d;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void q(gg.b bVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f9570a);
            jSONObject.put("Status", bVar.f9571b.ordinal());
            jSONObject.put("AuthToken", bVar.f9572c);
            jSONObject.put("RefreshToken", bVar.f9573d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f9575f);
            jSONObject.put("ExpiresInSecs", bVar.f9574e);
            jSONObject.put("FisError", bVar.f9576g);
            se.f fVar = (se.f) this.f12354g;
            fVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f22007a.getFilesDir());
            FileOutputStream fileOutputStreamK = xu.l.k(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamK.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStreamK.close();
            if (fileCreateTempFile.renameTo(i())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void r() {
        ((SparseIntArray) this.f12353d).clear();
    }

    @Override // cj.n
    public void run() {
        ch.d dVar = (ch.d) this.f12353d;
        if (!dVar.F().f3943c) {
            ch.n.g("PokeTheSdkAfterAnAppUpgradeCommand", "Not running PokeTheSdkAfterAnAppUpgradeCommand. This Android API is too low to run SDK.");
            return;
        }
        ch.n.b("PokeTheSdkAfterAnAppUpgradeCommand", "running PokeTheSdkAfterAnAppUpgradeCommand command");
        if (!tt.l.q0("com.opensignal.sdk", (String) this.f12354g, false)) {
            ArrayList arrayList = null;
            if (dVar.T4 == null) {
                ab.g gVarW = dVar.w();
                ch.n.b("DatabaseDataSourceFactory", "Using RawDatabaseDataSource");
                fi.h hVar = new fi.h(23, ((ch.d) gVarW.f309g).X());
                om.f fVar = new om.f(hVar, 28, dVar.V());
                if (dVar.f3900t == null) {
                    dVar.f3900t = new gi.e(dVar);
                }
                gi.e eVar = dVar.f3900t;
                if (eVar == null) {
                    l.l("_taskMapper");
                    throw null;
                }
                dVar.T4 = new r2(new io.sentry.k(hVar, eVar, dVar.y0(), 27), dVar.P0(), fVar, dVar.U(), dVar.C0(), dVar.X());
            }
            r2 r2Var = dVar.T4;
            if (r2Var == null) {
                l.l("_databaseMigrator");
                throw null;
            }
            Context contextD = dVar.d();
            om.f fVar2 = (om.f) r2Var.f10473r;
            ch.n.b("LegacyDataMigrator", "migrate() called");
            SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) r2Var.f10475y;
            File databasePath = contextD.getDatabasePath(sQLiteOpenHelper.getDatabaseName());
            boolean zExists = databasePath.exists();
            ch.n.b("LegacyDataMigrator", "databaseNameChanged: databasePath: " + databasePath + ", exists: " + zExists);
            if (!zExists || l.a(sQLiteOpenHelper.getDatabaseName(), "opensignal-database") || fVar2.k("is_legacy_migration_done")) {
                ch.n.b("LegacyDataMigrator", "Migration already executed, ignore ...");
            } else {
                ch.n.b("LegacyDataMigrator", "Migration not done yet, will proceed");
                tv.b bVar = (tv.b) r2Var.f10474x;
                String strC = bVar.c();
                if (!l.a(strC, "16")) {
                    ArrayList arrayListA = bVar.a();
                    if (arrayListA != null) {
                        arrayList = new ArrayList();
                        Iterator it = arrayListA.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (!l.a((String) next, strC)) {
                                arrayList.add(next);
                            }
                        }
                    }
                    bVar.e("16");
                    if (arrayList != null) {
                        bVar.f(o.x0(o.R0(arrayList), ",", null, null, null, 62));
                    }
                }
                try {
                    r2Var.O0();
                    r2Var.P0();
                } catch (SQLiteException e4) {
                    ch.n.c("LegacyDataMigrator", "Migration encountered an issue: " + e4.getLocalizedMessage());
                }
                synchronized (((qj.a) fVar2.f19554d)) {
                    fVar2.u("is_legacy_migration_done", String.valueOf(true));
                }
                SQLiteOpenHelper sQLiteOpenHelperX = dVar.X();
                try {
                    sQLiteOpenHelperX.close();
                    contextD.deleteDatabase(sQLiteOpenHelperX.getDatabaseName());
                } catch (Exception e10) {
                    ch.n.e("PokeTheSdkAfterAnAppUpgradeCommand", e10);
                }
                dVar.n().H0();
                al.b bVarF = dVar.f();
                q3.a aVar = (q3.a) bVarF.f812d;
                if (!aVar.J0()) {
                    ((ch.d) aVar.f20679d).U().t(-1L, "back");
                }
                bVarF.n();
            }
        }
        bm.d dVarF0 = dVar.F0();
        boolean zD = dVar.s0().D();
        String strC2 = dVarF0.C();
        if (!zD || strC2 == null) {
            return;
        }
        ch.n.b("InitialiseSdkCommand", "running InitialiseSdkCommand command");
        if (strC2.length() <= 0) {
            ch.n.c("InitialiseSdkCommand", "API key provided is Empty, returning.");
            return;
        }
        Context contextD2 = dVar.d();
        ch.n.b("InitialiseSdkCommand", "DEVICE_ID_TIME: ".concat(ah.f.a(contextD2)));
        mj.g.g0(contextD2, strC2);
    }

    public Boolean s() {
        KeyguardManager keyguardManager = (KeyguardManager) this.f12354g;
        if (keyguardManager == null) {
            ch.n.b("CurrentScreenStatus", "perform() keyguardManager is null. Will return null.");
            return null;
        }
        ch.n.b("CurrentScreenStatus", "isScreenLocked: " + keyguardManager.isKeyguardLocked());
        return Boolean.valueOf(keyguardManager.isKeyguardLocked());
    }

    public Boolean t() {
        PowerManager powerManager = (PowerManager) this.f12353d;
        if (powerManager == null) {
            ch.n.b("CurrentScreenStatus", "perform() powerManager is null. Will return null.");
            return null;
        }
        ch.n.b("CurrentScreenStatus", "isScreenOn: " + powerManager.isInteractive());
        return Boolean.valueOf(powerManager.isInteractive());
    }

    public boolean u(View view) {
        x1 x1Var = (x1) this.f12354g;
        y1 y1Var = (y1) this.f12353d;
        int iE = y1Var.e();
        int iH = y1Var.h();
        int iD = y1Var.d(view);
        int iM = y1Var.m(view);
        x1Var.f10264b = iE;
        x1Var.f10265c = iH;
        x1Var.f10266d = iD;
        x1Var.f10267e = iM;
        x1Var.f10263a = 24579;
        return x1Var.a();
    }

    public void w(n.a aVar) {
        js.e eVar = (js.e) this.f12353d;
        ((ActionMode.Callback) eVar.f13798g).onDestroyActionMode(eVar.V(aVar));
        i.a0 a0Var = (i.a0) this.f12354g;
        if (a0Var.S != null) {
            a0Var.H.getDecorView().removeCallbacks(a0Var.T);
        }
        if (a0Var.R != null) {
            l0 l0Var = a0Var.U;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 l0VarA = i0.a(a0Var.R);
            l0VarA.a(0.0f);
            a0Var.U = l0VarA;
            l0VarA.d(new i.r(2, this));
        }
        a0Var.Q = null;
        ViewGroup viewGroup = a0Var.W;
        WeakHashMap weakHashMap = i0.f23177a;
        u3.x.c(viewGroup);
        a0Var.H();
    }

    public void x(Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ff.b bVar = "clx".equals(bundle2.getString("_o")) ? (bm.d) this.f12353d : (b9.e) this.f12354g;
            if (bVar == null) {
                return;
            }
            bVar.n(string, bundle2);
        }
    }

    public boolean y(n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((i.a0) this.f12354g).W;
        WeakHashMap weakHashMap = i0.f23177a;
        u3.x.c(viewGroup);
        js.e eVar = (js.e) this.f12353d;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f13798g;
        n.e eVarV = eVar.V(aVar);
        u.i0 i0Var = (u.i0) eVar.f13800x;
        Menu b0Var = (Menu) i0Var.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) eVar.f13799r, (m) menu);
            i0Var.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarV, b0Var);
    }

    public gg.b z() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileI = i();
            FileInputStream fileInputStreamJ = xu.d.j(fileI, new FileInputStream(fileI));
            while (true) {
                try {
                    int i10 = fileInputStreamJ.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStreamJ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStreamJ.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        gg.d dVar = gg.d.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", dVar.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = gg.b.f9569h;
        gg.a aVar = new gg.a();
        aVar.f9566f = 0L;
        aVar.f9568h = (byte) (aVar.f9568h | 2);
        aVar.b(dVar);
        aVar.f9565e = 0L;
        aVar.f9568h = (byte) (aVar.f9568h | 1);
        aVar.f9561a = strOptString;
        aVar.b(gg.d.values()[iOptInt]);
        aVar.f9563c = strOptString2;
        aVar.f9564d = strOptString3;
        aVar.f9566f = jOptLong;
        byte b2 = (byte) (aVar.f9568h | 2);
        aVar.f9565e = jOptLong2;
        aVar.f9568h = (byte) (b2 | 1);
        aVar.f9567g = strOptString4;
        return aVar.a();
    }

    public /* synthetic */ c(int i10, boolean z10) {
        this.f12352a = i10;
    }

    public /* synthetic */ c(Object obj, int i10, Object obj2) {
        this.f12352a = i10;
        this.f12353d = obj;
        this.f12354g = obj2;
    }

    public c(Context context, int i10) {
        this.f12352a = i10;
        switch (i10) {
            case 18:
                this.f12353d = context;
                this.f12354g = null;
                break;
            default:
                s.h(context);
                Resources resources = context.getResources();
                this.f12353d = resources;
                this.f12354g = resources.getResourcePackageName(zb.h.common_google_play_services_unknown_issue);
                break;
        }
    }

    public c(f fVar) {
        this.f12352a = 7;
        this.f12353d = fVar;
        this.f12354g = new HashMap();
    }

    public c(MainActivity mainActivity, q3.a aVar) {
        this.f12352a = 27;
        l.e(mainActivity, "context");
        this.f12353d = aVar;
        AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity);
        builder.setView(qk.i.rating_dialog);
        AlertDialog alertDialogCreate = builder.setCancelable(false).create();
        l.d(alertDialogCreate, "create(...)");
        this.f12354g = alertDialogCreate;
    }

    public c(ag.b bVar, Executor executor) {
        this.f12352a = 21;
        l.e(executor, "executor");
        this.f12353d = bVar;
        this.f12354g = executor;
    }

    public c(ch.d dVar) {
        this.f12352a = 16;
        l.e(dVar, "serviceLocator");
        this.f12353d = dVar;
        this.f12354g = dVar.s().X("+4eqNSNlnk0uKEVP+J6gQocIOIgPVJku1cJQKA4g2hk=");
    }

    public c(et.d dVar) {
        this.f12352a = 28;
        gt.l lVar = new gt.l("Type parameter upper bound erasure results");
        this.f12353d = kc.f.F(new ht.g(2, this));
        this.f12354g = lVar.b(new as.d(21, this));
    }

    public c(u0 u0Var) {
        this.f12352a = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.f12353d = u0Var;
        this.f12354g = y3.e(classLoader);
    }

    public c(rr.a0 a0Var, js.e eVar) {
        this.f12352a = 17;
        l.e(a0Var, "module");
        l.e(eVar, "notFoundClasses");
        this.f12353d = a0Var;
        this.f12354g = eVar;
    }

    public c(int i10) {
        this.f12352a = i10;
        switch (i10) {
            case 23:
                this.f12353d = new SparseIntArray();
                this.f12354g = new SparseIntArray();
                break;
            case 26:
                this.f12353d = new AtomicInteger();
                this.f12354g = new AtomicInteger();
                break;
            default:
                this.f12353d = new HashMap();
                break;
        }
    }

    public c(se.f fVar) {
        this.f12352a = 22;
        this.f12354g = fVar;
    }

    public c(Map map) {
        this.f12352a = 4;
        this.f12353d = map;
        this.f12354g = new gt.l("Java nullability annotation states").c(new as.d(1, this));
    }

    public c(y1 y1Var) {
        this.f12352a = 24;
        this.f12353d = y1Var;
        x1 x1Var = new x1();
        x1Var.f10263a = 0;
        this.f12354g = x1Var;
    }

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f12352a = 8;
        this.f12353d = cryptoInfo;
        this.f12354g = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
