package t5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.measurement.d5;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import pb.l0;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34252a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34253b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34254c;

    /* renamed from: d, reason: collision with root package name */
    public Object f34255d;

    /* renamed from: e, reason: collision with root package name */
    public Object f34256e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34257f;
    public Object g;

    public p() {
        this.f34254c = new Object();
        this.f34255d = "";
        this.f34256e = "";
        this.f34252a = false;
        this.f34253b = false;
        this.f34257f = "";
    }

    public static final void a(p pVar, d6.a aVar) throws Exception {
        Object objH;
        t tVar = (t) pVar.f34255d;
        a aVar2 = (a) pVar.f34254c;
        r rVar = aVar2.g;
        r rVar2 = r.f34277c;
        if (rVar == rVar2) {
            i0.g(aVar, "PRAGMA journal_mode = WAL");
        } else {
            i0.g(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.g == rVar2) {
            i0.g(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            i0.g(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        d6.c cVarS = aVar.S("PRAGMA user_version");
        try {
            cVarS.P();
            int i4 = (int) cVarS.getLong(0);
            d5.c(cVarS, null);
            int i10 = tVar.f34287a;
            if (i4 != i10) {
                i0.g(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i4 == 0) {
                        pVar.d(aVar);
                    } else {
                        pVar.e(aVar, i4, i10);
                    }
                    i0.g(aVar, "PRAGMA user_version = " + i10);
                    objH = yj.u.f37649a;
                } catch (Throwable th2) {
                    objH = ci.b.h(th2);
                }
                if (!(objH instanceof yj.k)) {
                    i0.g(aVar, "END TRANSACTION");
                }
                Throwable thA = yj.l.a(objH);
                if (thA != null) {
                    i0.g(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            pVar.f(aVar);
        } finally {
        }
    }

    public static void b(d6.a aVar) throws Exception {
        d6.c cVarS = aVar.S("PRAGMA busy_timeout");
        try {
            cVarS.P();
            long j = cVarS.getLong(0);
            d5.c(cVarS, null);
            if (j < 3000) {
                i0.g(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d5.c(cVarS, th2);
                throw th3;
            }
        }
    }

    public static final String q(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", ua.j.C.f35261c.F(context, str2));
        ya.p pVarA = new ya.r(context).a(0, str, map, null);
        try {
            return (String) pVarA.f11625a.get(((Integer) va.s.f36163e.f36166c.a(sk.M5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            za.i.f("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e2);
            pVarA.cancel(true);
            return null;
        } catch (TimeoutException e10) {
            za.i.f("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e10);
            pVarA.cancel(true);
            return null;
        } catch (Exception e11) {
            za.i.f("Error retrieving a response from: ".concat(String.valueOf(str)), e11);
            return null;
        }
    }

    public e6.c c() {
        km.i iVar;
        v5.b bVar = (v5.b) this.f34257f;
        w5.b bVar2 = bVar instanceof w5.b ? (w5.b) bVar : null;
        if (bVar2 == null || (iVar = bVar2.f36471a) == null) {
            return null;
        }
        return (e6.c) iVar.f28426b;
    }

    public void d(d6.a aVar) throws Exception {
        t tVar = (t) this.f34255d;
        nk.k.e(aVar, "connection");
        d6.c cVarS = aVar.S("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (cVarS.P()) {
                if (cVarS.getLong(0) == 0) {
                    z3 = true;
                }
            }
            d5.c(cVarS, null);
            tVar.a(aVar);
            if (!z3) {
                l0 l0VarG = tVar.g(aVar);
                if (!l0VarG.f31648a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + l0VarG.f31649b).toString());
                }
            }
            g(aVar);
            tVar.c(aVar);
            Iterator it = ((List) this.f34256e).iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
                if (aVar instanceof w5.a) {
                    nk.k.e(((w5.a) aVar).f36470a, "db");
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00aa A[EDGE_INSN: B:126:0x00aa->B:38:0x00aa BREAK  A[LOOP:4: B:9:0x0033->B:130:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(d6.a r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.p.e(d6.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(d6.a r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.p.f(d6.a):void");
    }

    public void g(d6.a aVar) throws Exception {
        i0.g(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) ((t) this.f34255d).f34288b;
        nk.k.e(str, "hash");
        i0.g(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public void h(Context context) {
        ff0 ff0Var;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16387wa)).booleanValue() || (ff0Var = (ff0) this.g) == null) {
            return;
        }
        ff0Var.f(new ya.h(this, context), ef0.f10775d);
    }

    public boolean i(Context context, String str, String str2) {
        pk pkVar = sk.K5;
        va.s sVar = va.s.f36163e;
        String strQ = q(context, r(context, (String) sVar.f36166c.a(pkVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strQ)) {
            za.i.c("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strQ.trim()).optString("debug_mode"));
            m(zEquals);
            if (((Boolean) sVar.f36166c.a(sk.f16387wa)).booleanValue()) {
                ya.c0 c0VarI = ua.j.C.f35265h.i();
                if (true != zEquals) {
                    str = "";
                }
                c0VarI.i(str);
            }
            return zEquals;
        } catch (JSONException e2) {
            za.i.i("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    public void j(Context context, String str, String str2) {
        ya.f0 f0Var = ua.j.C.f35261c;
        ya.f0.v(context, r(context, (String) va.s.f36163e.f36166c.a(sk.I5), str, str2));
    }

    public boolean k(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !o()) {
            return false;
        }
        za.i.c("Sending troubleshooting signals to the server.");
        l(context, str, str2, str3);
        return true;
    }

    public void l(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = r(context, (String) va.s.f36163e.f36166c.a(sk.L5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        ya.f0 f0Var = ua.j.C.f35261c;
        new ya.u(context, str, builderBuildUpon.build().toString(), null).A();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0028, B:11:0x002e, B:13:0x0034, B:16:0x0039, B:17:0x003d, B:19:0x0043, B:22:0x0049), top: B:26:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0028, B:11:0x002e, B:13:0x0034, B:16:0x0039, B:17:0x003d, B:19:0x0043, B:22:0x0049), top: B:26:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f34254c
            monitor-enter(r0)
            r3.f34253b = r4     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.f16387wa     // Catch: java.lang.Throwable -> L47
            va.s r2 = va.s.f36163e     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            ua.j r1 = ua.j.C     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zw r1 = r1.f35265h     // Catch: java.lang.Throwable -> L47
            ya.c0 r1 = r1.i()     // Catch: java.lang.Throwable -> L47
            r1.h(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r3.g     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.ff0 r1 = (com.google.android.gms.internal.ads.ff0) r1     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            boolean r2 = r1.f11147u     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L32
            if (r4 == 0) goto L3d
            r1.k()     // Catch: java.lang.Throwable -> L47
            goto L34
        L32:
            if (r4 == 0) goto L3d
        L34:
            boolean r4 = r1.f11145s     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L39
            goto L3d
        L39:
            r1.l()     // Catch: java.lang.Throwable -> L47
            goto L49
        L3d:
            boolean r4 = r1.g()     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L49
            r1.m()     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r4 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.p.m(boolean):void");
    }

    public boolean n() {
        boolean z3;
        synchronized (this.f34254c) {
            z3 = this.f34253b;
        }
        return z3;
    }

    public boolean o() {
        boolean z3;
        synchronized (this.f34254c) {
            z3 = this.f34252a;
        }
        return z3;
    }

    public void p(Context context, String str, boolean z3, boolean z10) {
        if (context instanceof Activity) {
            ya.f0.f37440l.post(new ya.i(this, context, str, z3, z10));
        } else {
            za.i.g("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0034, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0015, B:7:0x001b, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0036, B:20:0x006d, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.net.Uri r(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            java.lang.Object r0 = r5.f34254c
            monitor-enter(r0)
            java.lang.Object r1 = r5.f34255d     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L6d
            ua.j r1 = ua.j.C     // Catch: java.lang.Throwable -> L34
            ya.f0 r1 = r1.f35261c     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r6.openFileInput(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r4 = 1
            tb.b.e(r1, r3, r4)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r1 = r3.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            goto L3d
        L34:
            r6 = move-exception
            goto L86
        L36:
            java.lang.String r1 = "Error reading from internal storage."
            za.i.c(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = ""
        L3d:
            r5.f34255d = r2     // Catch: java.lang.Throwable -> L34
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L6d
            ua.j r1 = ua.j.C     // Catch: java.lang.Throwable -> L34
            ya.f0 r1 = r1.f35261c     // Catch: java.lang.Throwable -> L34
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L34
            r5.f34255d = r1     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L67
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L67
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L67
            r6.write(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L67
            r6.close()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L67
            goto L6d
        L67:
            r6 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            za.i.f(r1, r6)     // Catch: java.lang.Throwable -> L34
        L6d:
            java.lang.Object r6 = r5.f34255d     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "linkedDeviceId"
            r7.appendQueryParameter(r0, r6)
            java.lang.String r6 = "adSlotPath"
            r7.appendQueryParameter(r6, r8)
            java.lang.String r6 = "afmaVersion"
            r7.appendQueryParameter(r6, r9)
            android.net.Uri r6 = r7.build()
            return r6
        L86:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.p.r(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public p(a aVar, sl.b bVar) {
        this.f34254c = aVar;
        this.f34255d = new n(-1, "", "");
        List list = aVar.f34175e;
        zj.s sVar = zj.s.f38317a;
        this.f34256e = list == null ? sVar : list;
        ArrayList arrayListK0 = zj.n.k0(list == null ? sVar : list, new o(new b7.u(19, this)));
        Context context = aVar.f34171a;
        String str = aVar.f34172b;
        e6.b bVar2 = aVar.f34173c;
        km.y yVar = aVar.f34174d;
        boolean z3 = aVar.f34176f;
        r rVar = aVar.g;
        Executor executor = aVar.f34177h;
        Executor executor2 = aVar.f34178i;
        Intent intent = aVar.j;
        boolean z10 = aVar.f34179k;
        boolean z11 = aVar.f34180l;
        Set set = aVar.f34181m;
        String str2 = aVar.f34182n;
        File file = aVar.f34183o;
        Callable callable = aVar.f34184p;
        List list2 = aVar.f34185q;
        List list3 = aVar.f34186r;
        boolean z12 = aVar.f34187s;
        d6.b bVar3 = aVar.f34188t;
        ck.h hVar = aVar.f34189u;
        nk.k.e(context, "context");
        nk.k.e(yVar, "migrationContainer");
        nk.k.e(executor, "queryExecutor");
        nk.k.e(executor2, "transactionExecutor");
        nk.k.e(list2, "typeConverters");
        nk.k.e(list3, "autoMigrationSpecs");
        bVar.invoke(new a(context, str, bVar2, yVar, arrayListK0, z3, rVar, executor, executor2, intent, z10, z11, set, str2, file, callable, list2, list3, z12, bVar3, hVar));
        throw null;
    }

    public p(a aVar, t tVar) {
        int i4;
        v5.e eVar;
        r rVar = aVar.g;
        e6.b bVar = aVar.f34173c;
        String str = aVar.f34172b;
        this.f34254c = aVar;
        this.f34255d = tVar;
        Object obj = aVar.f34175e;
        this.f34256e = obj == null ? zj.s.f38317a : obj;
        d6.b bVar2 = aVar.f34188t;
        if (bVar2 != null) {
            if (str == null) {
                eVar = new v5.e(new km.o(this, bVar2));
            } else {
                km.o oVar = new km.o(this, bVar2);
                int iOrdinal = rVar.ordinal();
                if (iOrdinal == 1) {
                    i4 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + rVar + '\'').toString());
                    }
                    i4 = 4;
                }
                int iOrdinal2 = rVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + rVar + '\'').toString());
                }
                eVar = new v5.e(oVar, str, i4);
            }
            this.f34257f = eVar;
        } else if (bVar != null) {
            Context context = aVar.f34171a;
            nk.k.e(context, "context");
            this.f34257f = new w5.b(new km.i(bVar.c(new ur0(context, str, new t7.m(this, tVar.f34287a), false, false))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z3 = rVar == r.f34277c;
        e6.c cVarC = c();
        if (cVarC != null) {
            cVarC.setWriteAheadLoggingEnabled(z3);
        }
    }
}
