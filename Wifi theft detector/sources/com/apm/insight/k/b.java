package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f5024b;

    /* renamed from: a, reason: collision with root package name */
    private Context f5025a;

    /* renamed from: f, reason: collision with root package name */
    private C0065b f5029f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, C0065b> f5030g;

    /* renamed from: c, reason: collision with root package name */
    private List<File> f5026c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<File> f5027d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f5028e = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f5031h = false;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f5032i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private Runnable f5033j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    public static class C0065b {

        /* renamed from: a, reason: collision with root package name */
        String f5048a;

        /* renamed from: d, reason: collision with root package name */
        a f5051d;

        /* renamed from: e, reason: collision with root package name */
        a f5052e;

        /* renamed from: b, reason: collision with root package name */
        List<a> f5049b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<a> f5050c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        boolean f5053f = false;

        /* renamed from: g, reason: collision with root package name */
        int f5054g = 0;

        public C0065b(String str) {
            this.f5048a = str;
        }
    }

    private b(Context context) {
        this.f5025a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f5031h || this.f5030g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f5025a)) {
            e();
        }
        if (this.f5028e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f5028e = 1;
            } else {
                this.f5028e = 0;
            }
        }
        boolean z10 = this.f5028e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f5025a);
        Iterator<C0065b> it = this.f5030g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0065b> it2 = this.f5030g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0065b> it3 = this.f5030g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f5025a, it3.next().f5048a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f5031h = true;
        this.f5030g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f5031h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f5025a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f5032i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f5025a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (f5024b == null) {
            synchronized (b.class) {
                try {
                    if (f5024b == null) {
                        f5024b = new b(com.apm.insight.e.g());
                    }
                } finally {
                }
            }
        }
        return f5024b;
    }

    public final void b() {
        try {
            if (!this.f5031h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f5033j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f5031h;
    }

    private void b(HashMap<String, C0065b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f5025a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0065b c0065b = map.get(name);
                    if (c0065b == null) {
                        c0065b = new C0065b(name);
                        map.put(name, c0065b);
                    }
                    c0065b.f5050c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        File f5043a;

        /* renamed from: b, reason: collision with root package name */
        long f5044b;

        /* renamed from: c, reason: collision with root package name */
        long f5045c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        CrashType f5046d;

        /* renamed from: e, reason: collision with root package name */
        String f5047e;

        public a(File file, @Nullable CrashType crashType) {
            this.f5044b = -1L;
            this.f5045c = -1L;
            this.f5043a = file;
            this.f5046d = crashType;
            this.f5047e = file.getName();
        }

        public a(File file, long j10, @Nullable CrashType crashType) {
            this.f5045c = -1L;
            this.f5043a = file;
            this.f5044b = j10;
            this.f5046d = crashType;
            this.f5047e = file.getName();
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f5029f == null) {
                this.f5029f = new C0065b("old_uuid");
                HashMap<String, C0065b> map = new HashMap<>();
                this.f5030g = map;
                a(map);
                a(this.f5030g, this.f5029f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f5025a));
                b(this.f5030g);
                b(this.f5029f, true, null);
                a(this.f5029f, true, null);
                this.f5029f = null;
                if (this.f5030g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0065b c0065b, boolean z10, @Nullable com.apm.insight.runtime.f fVar) {
        boolean z11;
        JSONObject jSONObjectA;
        if (c0065b.f5050c.size() <= 1 && c0065b.f5050c.isEmpty()) {
            c0065b.f5052e = c0065b.f5051d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f5025a);
        c0065b.f5052e = c0065b.f5051d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f5025a);
        for (a aVar2 : c0065b.f5050c) {
            final File file = aVar2.f5043a;
            try {
                aVar.a(file);
                jSONObjectA = a(aVar);
            } catch (Throwable th) {
                th = th;
                z11 = zB;
            }
            if (jSONObjectA != null && jSONObjectA.length() != 0) {
                if (jSONObjectA.length() != 0) {
                    if (!z10) {
                        long jOptLong = jSONObjectA.optLong("crash_time");
                        try {
                            a aVar3 = c0065b.f5052e;
                            if (aVar3 == null) {
                                c0065b.f5052e = aVar2;
                                c0065b.f5053f = true;
                                if (fVar == null || fVar.a(BuildConfig.FLAVOR)) {
                                    z11 = zB;
                                } else {
                                    aVar.i();
                                }
                            } else {
                                z11 = zB;
                                try {
                                    if (!c0065b.f5053f && jOptLong < aVar3.f5044b) {
                                        c0065b.f5052e = aVar2;
                                        if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                                            aVar.i();
                                            zB = z11;
                                        } else {
                                            a(file);
                                            c0065b.f5053f = true;
                                        }
                                    } else {
                                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject("header").opt("aid")));
                                        jSONObjectA.optJSONObject("header").put("aid", 2010);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                    zB = z11;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z11 = zB;
                        }
                    } else {
                        z11 = zB;
                        if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                            aVar.i();
                        }
                    }
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0065b.f5048a);
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                    if (z11) {
                        try {
                            c.a aVar4 = new c.a(jSONObjectA, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject) {
                                    d.a();
                                    d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f5025a, c0065b.f5048a));
                                }
                            });
                            if (!aVar.i()) {
                                aVar.f();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                            zB = z11;
                        }
                    }
                    c.a(CrashType.NATIVE, jSONObjectA);
                } else {
                    z11 = zB;
                }
                zB = z11;
            } else {
                z11 = zB;
                aVar.i();
                zB = z11;
            }
        }
    }

    private void a(HashMap<String, C0065b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f5025a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0065b c0065b = map.get(name);
                    if (c0065b == null) {
                        c0065b = new C0065b(name);
                        map.put(name, c0065b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0065b.f5054g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:57:0x00d8, B:59:0x00e0, B:60:0x00e8, B:62:0x00f3, B:70:0x010b, B:65:0x00fd, B:67:0x0101, B:69:0x0109, B:54:0x00d0, B:55:0x00d3, B:56:0x00d6, B:38:0x00a7, B:41:0x00b1, B:44:0x00bb, B:71:0x0111, B:72:0x012e, B:29:0x0080), top: B:79:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0065b> r17, com.apm.insight.k.b.C0065b r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b):void");
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:97|38|39|(1:41)(1:43)|44|(18:46|89|47|(1:49)|91|55|56|87|57|70|71|93|72|(1:74)|75|78|69|113)(1:52)|53|(5:91|55|56|87|57)(4:64|(0)(1:68)|69|113)|70|71|93|72|(0)|75|78|69|113) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:72:0x0148, B:74:0x0154, B:78:0x0168), top: B:93:0x0148 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.apm.insight.k.b.C0065b r19, boolean r20, @androidx.annotation.Nullable com.apm.insight.runtime.f r21) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.f):void");
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #1 {all -> 0x01e1, blocks: (B:31:0x0072, B:39:0x0090, B:42:0x009d, B:47:0x00b3, B:46:0x00ac), top: B:92:0x0072 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.apm.insight.f.b a(java.io.File r24, com.apm.insight.CrashType r25, java.lang.String r26, long r27, long r29) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.io.File, com.apm.insight.CrashType, java.lang.String, long, long):com.apm.insight.f.b");
    }
}
