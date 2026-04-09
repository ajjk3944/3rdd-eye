package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d2;
import com.applovin.impl.d4;
import com.applovin.impl.d6;
import com.applovin.impl.g2;
import com.applovin.impl.h2;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private final k f5593b;

    /* renamed from: c, reason: collision with root package name */
    private final o f5594c;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f5597f;

    /* renamed from: a, reason: collision with root package name */
    private final String f5592a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f5595d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f5596e = new HashSet();
    private final g2 g = a();

    public m(k kVar) {
        this.f5593b = kVar;
        this.f5594c = kVar.O();
        this.f5597f = ((Boolean) kVar.a(x4.U0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f5595d) {
            try {
                if (this.f5596e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.f5594c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f5593b.D().a(d2.Q0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th2) {
            try {
                if (o.a()) {
                    this.f5594c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th2);
                }
                this.f5593b.D().a("FileManager", "removeFile", th2);
                h(file);
                return false;
            } catch (Throwable th3) {
                h(file);
                throw th3;
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f5595d) {
            try {
                if (!this.f5596e.remove(absolutePath)) {
                    this.f5593b.D().a(d2.Q0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f5595d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f5593b.q0().a((i5) new r6(this.f5593b, false, "removeCachedResourcesForAd", new a0(this, bVar, context, 0)), d6.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f5593b.q0().a((i5) new r6(this.f5593b, false, "removeCachedVideoResourceForAd", new a0(this, bVar, context, 1)), d6.b.CACHING);
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f5594c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z3 = true;
        try {
        } catch (Throwable th2) {
            th = th2;
            z3 = false;
        }
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String strA = a(fileInputStream);
                            boolean z10 = strA == null;
                            fileInputStream.close();
                            if (z10 && ((Boolean) this.f5593b.a(x4.M0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return strA;
                        } catch (Throwable th3) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (FileNotFoundException e2) {
                        if (o.a()) {
                            this.f5594c.d("FileManager", "File not found. " + e2);
                        }
                        this.f5594c.a("FileManager", e2);
                        this.f5593b.D().a("FileManager", "readFileNotFound", e2);
                        if (0 != 0 && ((Boolean) this.f5593b.a(x4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th5) {
                    if (o.a()) {
                        this.f5594c.a("FileManager", "Unknown failure to read file.", th5);
                    }
                    this.f5594c.a("FileManager", th5);
                    this.f5593b.D().a("FileManager", "readFile", th5);
                    if (((Boolean) this.f5593b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (IOException e10) {
                if (o.a()) {
                    this.f5594c.a("FileManager", "Failed to read file: " + file.getName() + e10);
                }
                this.f5594c.a("FileManager", e10);
                this.f5593b.D().a("FileManager", "readFileIO", e10);
                if (((Boolean) this.f5593b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            if (z3 && ((Boolean) this.f5593b.a(x4.M0)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            h(file);
            throw th;
        }
    }

    private g2 a() {
        if (o0.d() && ((Boolean) this.f5593b.a(x4.f6134s3)).booleanValue()) {
            try {
                return new d4(this.f5593b);
            } catch (Throwable th2) {
                if (o.a()) {
                    this.f5594c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th2);
                }
                this.f5593b.D().a("FileManager", "instantiateOkHttpLoader", th2);
            }
        }
        return new h2(this.f5593b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f5595d) {
            zContains = this.f5596e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f5595d) {
            boolean zAdd = this.f5596e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f5595d.wait();
                    zAdd = this.f5596e.add(absolutePath);
                } catch (InterruptedException e2) {
                    if (o.a()) {
                        this.f5594c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e2);
                    }
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f5593b.E0()) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.l0() == null) {
            return;
        }
        g(a(bVar.l0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.f5594c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f5594c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f5593b.D().a(d2.Q0, "createNoMediaFile");
        } catch (IOException e2) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Failed to create .nomedia file", e2);
            }
        }
    }

    private File a(String str, boolean z3, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            a0.g.x("Looking up cached resource: ", str, this.f5594c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z3) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th2) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Unable to make cache directory at " + fileD, th2);
            }
            this.f5593b.D().a("FileManager", "createCacheDir", th2);
            return null;
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z3 = false;
            boolean z10 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z11 = parentFile != null && parentFile.exists();
            if (z11 && parentFile.canWrite()) {
                z3 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z10 + "\nparentDirectoryExists: " + z11 + "\nisParentDirectoryWritable: " + z3;
        } catch (Throwable th2) {
            return "Error retrieving file deletion failure reason: " + th2;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f5597f) {
            return b(str, context);
        }
        boolean z3 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z3 = true;
        }
        h(fileA);
        return z3;
    }

    private long b() {
        long jLongValue = ((Long) this.f5593b.a(x4.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i4 = inputStream.read(bArr, 0, Segment.SIZE);
                    if (i4 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i4);
                    } else {
                        String string = byteArrayOutputStream.toString("UTF-8");
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f5594c.a("FileManager", th2);
            this.f5593b.D().a("FileManager", "readInputStreamAsString", th2);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z3) {
        return a(inputStream, file, z3, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0250 A[Catch: all -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01d5, blocks: (B:109:0x01d1, B:112:0x01d8, B:115:0x01ea, B:117:0x01f0, B:119:0x01f6, B:120:0x020e, B:133:0x0250), top: B:244:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f6 A[Catch: all -> 0x02fc, TRY_LEAVE, TryCatch #19 {all -> 0x02fc, blocks: (B:181:0x02f0, B:183:0x02f6), top: B:257:0x02f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0322 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0264 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x02b9 A[EDGE_INSN: B:269:0x02b9->B:163:0x02b9 BREAK  A[LOOP:1: B:137:0x025d->B:270:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149 A[Catch: all -> 0x014f, TryCatch #8 {all -> 0x014f, blocks: (B:72:0x0143, B:74:0x0149, B:77:0x0152), top: B:236:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i4, String str2, Map map) {
        return a(file, str, list, true, i4, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z3, int i4, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f5593b.g().d(d2.L, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 1;
        while (i10 <= i4) {
            if (a(file, str, list, z3, str2, map2)) {
                a(true, str, i10, jElapsedRealtime, map);
                return true;
            }
            i10++;
            map2 = map;
        }
        a(false, str, i4, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z3, String str2, Map map) {
        Boolean bool = (Boolean) this.f5593b.a(x4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                a0.g.x("File exists for ", str, this.f5594c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f5593b.g().d(d2.M, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z3, map);
            try {
                if (o.a()) {
                    this.f5594c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f5594c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = n7.d(jElapsedRealtime2);
                    double dC = n7.c(file.length());
                    long j = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f5593b.g().d(d2.R, mapA);
                    this.f5593b.d0().b(j, str, str2);
                } else {
                    if (o.a()) {
                        this.f5594c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f5593b.g().d(d2.S, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f5594c.a("FileManager", th2);
                this.f5593b.D().a("FileManager", "loadAndCacheResource", th2);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z3, String str, int i4, long j, Map map) {
        d2 d2Var = z3 ? d2.N : d2.O;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i4));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f5593b.g().d(d2Var, map2);
    }

    public InputStream a(String str, List list, boolean z3, Map map) {
        if (z3 && !n7.a(str, list)) {
            if (o.a()) {
                a0.g.x("Domain is not whitelisted, skipping precache for url: ", str, this.f5594c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f5594c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f5593b.g().d(d2.P, mapHashMap);
        try {
            return this.g.a(httpsString, map);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Error loading " + httpsString, th2);
            }
            this.f5593b.D().a("FileManager", "loadResource", th2, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listT = bVar.T();
        if (bVar.M0() || listT.contains(str)) {
            return bVar.B();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z3, int i4, String str3, Map map) {
        return a(context, str, str2, list, z3, false, i4, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z3, boolean z10, int i4, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f5593b.D().a(d2.Q0, "cacheResource");
            return null;
        }
        String strA = n7.a(Uri.parse(str), str2, this.f5593b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z3, i4, str3, map)) {
            return null;
        }
        if (o.a()) {
            a0.g.x("Caching succeeded for file ", strA, this.f5594c, "FileManager");
        }
        return z10 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z3 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f5593b.c(x4.G0);
        long length = 0;
        for (File file : c(context)) {
            if (!z3 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f5594c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j, Context context) {
        long jIntValue = ((Integer) this.f5593b.a(x4.C0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j) > jIntValue) {
                if (o.a()) {
                    this.f5594c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.f5594c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.l().keySet());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            g(a(Uri.parse((String) obj).getLastPathSegment(), context));
        }
        Uri uriL0 = bVar.l0();
        if (uriL0 != null) {
            g(a(uriL0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f5594c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f5593b.D().a(d2.Q0, str, mapHashMap);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f5594c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th2);
            }
            this.f5593b.D().a("FileManager", str, th2);
        }
    }

    private long a(long j) {
        return j / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
