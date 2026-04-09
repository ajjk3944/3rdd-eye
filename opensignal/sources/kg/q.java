package kg;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.internal.measurement.e5;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.goldstar.loadingconfig.LoadConfigActivity;
import com.staircase3.opensignal.goldstar.onboarding.ui.OnboardingActivity;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements dd.a, dn.f, bf.f, dd.g, u9.b, t9.f, qb.h, qb.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14390a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14391d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14392g;

    public /* synthetic */ q(Object obj, int i10, Object obj2) {
        this.f14390a = i10;
        this.f14391d = obj;
        this.f14392g = obj2;
    }

    private final Object e(dd.r rVar) {
        pg.h hVar = (pg.h) this.f14391d;
        Date date = (Date) this.f14392g;
        hVar.getClass();
        if (rVar.j()) {
            pg.m mVar = hVar.f20520g;
            synchronized (mVar.f20551b) {
                mVar.f20550a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return rVar;
        }
        Exception excG = rVar.g();
        if (excG == null) {
            return rVar;
        }
        if (excG instanceof og.f) {
            pg.m mVar2 = hVar.f20520g;
            synchronized (mVar2.f20551b) {
                mVar2.f20550a.edit().putInt("last_fetch_status", 2).apply();
            }
            return rVar;
        }
        pg.m mVar3 = hVar.f20520g;
        synchronized (mVar3.f20551b) {
            mVar3.f20550a.edit().putInt("last_fetch_status", 1).apply();
        }
        return rVar;
    }

    @Override // qb.h, a5.j
    public void a(Object obj) {
        switch (this.f14390a) {
            case 11:
                AnalyticsCollector.lambda$onVideoSizeChanged$24((x9.q) this.f14391d, (rb.v) this.f14392g, (AnalyticsListener) obj);
                break;
            case 12:
            default:
                ((AnalyticsListener) obj).onAudioAttributesChanged((x9.q) this.f14391d, (y9.b) this.f14392g);
                break;
            case 13:
                ((AnalyticsListener) obj).onStaticMetadataChanged((x9.q) this.f14391d, (List) this.f14392g);
                break;
            case 14:
                ((AnalyticsListener) obj).onMetadata((x9.q) this.f14391d, (Metadata) this.f14392g);
                break;
            case 15:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((x9.q) this.f14391d, (c1) this.f14392g);
                break;
            case 16:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((x9.q) this.f14391d, (b1) this.f14392g);
                break;
            case 17:
                ((AnalyticsListener) obj).onPlayerError((x9.q) this.f14391d, (z0) this.f14392g);
                break;
        }
    }

    @Override // t9.f
    public Object apply(Object obj) {
        t9.h hVar = (t9.h) this.f14391d;
        m9.i iVar = (m9.i) this.f14392g;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        t9.a aVar = hVar.f22682r;
        ArrayList arrayListI = hVar.i(sQLiteDatabase, iVar, aVar.f22667b);
        for (j9.d dVar : j9.d.values()) {
            if (dVar != iVar.f16362c) {
                int size = aVar.f22667b - arrayListI.size();
                if (size <= 0) {
                    break;
                }
                arrayListI.addAll(hVar.i(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListI.size(); i10++) {
            sb2.append(((t9.b) arrayListI.get(i10)).f22671a);
            if (i10 < arrayListI.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new t9.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListI.listIterator();
        while (listIterator.hasNext()) {
            t9.b bVar = (t9.b) listIterator.next();
            long j7 = bVar.f22671a;
            if (map.containsKey(Long.valueOf(j7))) {
                al.c cVarC = bVar.f22673c.c();
                for (t9.g gVar : (Set) map.get(Long.valueOf(j7))) {
                    cVarC.b(gVar.f22676a, gVar.f22677b);
                }
                listIterator.set(new t9.b(j7, bVar.f22672b, cVarC.e()));
            }
        }
        return arrayListI;
    }

    @Override // dn.f
    public void b(String str) {
        TestsFragment testsFragment = (TestsFragment) this.f14391d;
        dn.i iVar = (dn.i) this.f14392g;
        if (br.l.a(str, "compass_uri")) {
            al.c cVar = testsFragment.I0;
            if (cVar == null) {
                br.l.l("presenter");
                throw null;
            }
            Activity activity = (Activity) ((om.f) cVar.f821c).f19554d;
            if (activity instanceof MainActivity) {
                ((MainActivity) activity).z(new Intent("shortcuts.action.show_compass"));
                return;
            }
            return;
        }
        if (str == null || str.length() <= 0 || str.length() == 0 || new Intent(str).resolveActivity(testsFragment.X().getPackageManager()) == null) {
            return;
        }
        Intent intent = new Intent(str);
        intent.setFlags(268435456);
        iVar.X().startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lq.h] */
    public void c() {
        br.t tVar = (br.t) this.f14391d;
        LoadConfigActivity loadConfigActivity = (LoadConfigActivity) this.f14392g;
        int i10 = LoadConfigActivity.X;
        if (tVar.f2914a) {
            return;
        }
        tVar.f2914a = true;
        boolean z10 = ((vl.a) loadConfigActivity.T.getValue()).f23928a.getBoolean("first_use", true);
        ((gl.a) loadConfigActivity.U.getValue()).getClass();
        br.l.e("shouldShowTutorial: " + z10, "message");
        loadConfigActivity.startActivity(z10 ? new Intent(loadConfigActivity, (Class<?>) OnboardingActivity.class) : new Intent(loadConfigActivity, (Class<?>) MainActivity.class));
        loadConfigActivity.finishAffinity();
    }

    @Override // qb.i
    public void d(Object obj, qb.f fVar) {
        ((AnalyticsCollector) this.f14391d).lambda$setPlayer$1((g1) this.f14392g, (AnalyticsListener) obj, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    @Override // bf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(h9.r2 r5) {
        /*
            r4 = this;
            int r0 = r4.f14390a
            switch(r0) {
                case 2: goto L1f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f14392g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f14391d
            bf.c r1 = (bf.c) r1
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1a
            bf.f r0 = r1.f2708f     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r0.f(r5)     // Catch: java.lang.Throwable -> L1a
            android.os.Trace.endSection()
            return r5
        L1a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
        L1f:
            java.lang.Object r0 = r4.f14392g
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r4.f14391d
            p5.b r1 = (p5.b) r1
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r5 = r5.a(r2)
            android.content.Context r5 = (android.content.Context) r5
            int r1 = r1.f20251a
            switch(r1) {
                case 2: goto L99;
                case 3: goto L8c;
                case 4: goto L4a;
                default: goto L34;
            }
        L34:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r5 = r1.getInstallerPackageName(r5)
            if (r5 == 0) goto L47
            java.lang.String r5 = com.google.firebase.FirebaseCommonRegistrar.a(r5)
            goto La5
        L47:
            java.lang.String r5 = ""
            goto La5
        L4a:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.television"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L5b
            java.lang.String r5 = "tv"
            goto La5
        L5b:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.watch"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L6a
            java.lang.String r5 = "watch"
            goto La5
        L6a:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r3 = "android.hardware.type.automotive"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r2 == 0) goto L79
            java.lang.String r5 = "auto"
            goto La5
        L79:
            r2 = 26
            if (r1 < r2) goto L47
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.type.embedded"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 == 0) goto L47
            java.lang.String r5 = "embedded"
            goto La5
        L8c:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L47
            int r5 = r5.minSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto La5
        L99:
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            if (r5 == 0) goto L47
            int r5 = r5.targetSdkVersion
            java.lang.String r5 = java.lang.String.valueOf(r5)
        La5:
            ng.a r1 = new ng.a
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.q.f(h9.r2):java.lang.Object");
    }

    @Override // u9.b
    public Object g() {
        switch (this.f14390a) {
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                al.b bVar = (al.b) this.f14391d;
                Iterable iterable = (Iterable) this.f14392g;
                t9.h hVar = (t9.h) ((t9.d) bVar.f812d);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.b().compileStatement("DELETE FROM events WHERE _id in " + t9.h.y(iterable)).execute();
                    break;
                }
                break;
            default:
                al.b bVar2 = (al.b) this.f14391d;
                Iterator it = ((HashMap) this.f14392g).entrySet().iterator();
                while (it.hasNext()) {
                    ((t9.h) ((t9.c) bVar2.f817i)).q(((Integer) r2.getValue()).intValue(), p9.c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0060 A[EXC_TOP_SPLITTER, PHI: r13
  0x0060: PHI (r13v7 java.io.InputStream) = (r13v6 java.io.InputStream), (r13v8 java.io.InputStream) binds: [B:30:0x006f, B:19:0x005e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ed A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #15 {all -> 0x0075, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:20:0x0060, B:27:0x006a, B:28:0x006d, B:37:0x0079, B:74:0x00e9, B:76:0x00ed, B:78:0x00f0, B:82:0x00f4, B:77:0x00ee), top: B:163:0x001b, inners: #12 }] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pg.k] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v5, types: [dd.r] */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // dd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(dd.r r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.q.j(dd.r):java.lang.Object");
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        pg.c cVar = (pg.c) this.f14391d;
        pg.d dVar = (pg.d) this.f14392g;
        synchronized (cVar) {
            cVar.f20496c = e5.u(dVar);
        }
        return e5.u(dVar);
    }

    public /* synthetic */ q(String str, Object obj, int i10) {
        this.f14390a = i10;
        this.f14392g = str;
        this.f14391d = obj;
    }
}
