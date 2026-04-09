package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.d4;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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

/* loaded from: classes.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private final k f7898b;

    /* renamed from: c, reason: collision with root package name */
    private final o f7899c;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7902f;

    /* renamed from: a, reason: collision with root package name */
    private final String f7897a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f7900d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f7901e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.g2 f7903g = a();

    public m(k kVar) {
        this.f7898b = kVar;
        this.f7899c = kVar.O();
        this.f7902f = ((Boolean) kVar.a(x4.U0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7900d) {
            try {
                if (this.f7901e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.f7899c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f7898b.D().a(com.applovin.impl.d2.Q0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (o.a()) {
                    this.f7899c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f7898b.D().a("FileManager", "removeFile", th);
                h(file);
                return false;
            } catch (Throwable th2) {
                h(file);
                throw th2;
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7900d) {
            try {
                if (!this.f7901e.remove(absolutePath)) {
                    this.f7898b.D().a(com.applovin.impl.d2.Q0, "unlockFile", CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, absolutePath));
                }
                this.f7900d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f7898b.q0().a((i5) new r6(this.f7898b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.n2
            @Override // java.lang.Runnable
            public final void run() {
                this.f7922a.a(bVar, context);
            }
        }), d6.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f7898b.q0().a((i5) new r6(this.f7898b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.o2
            @Override // java.lang.Runnable
            public final void run() {
                this.f8060a.b(bVar, context);
            }
        }), d6.b.CACHING);
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f7899c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        d(file);
                        String strA = a(fileInputStream);
                        boolean z11 = strA == null;
                        fileInputStream.close();
                        if (z11 && ((Boolean) this.f7898b.a(x4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return strA;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e10) {
                    if (o.a()) {
                        this.f7899c.a("FileManager", "Failed to read file: " + file.getName() + e10);
                    }
                    this.f7899c.a("FileManager", e10);
                    this.f7898b.D().a("FileManager", "readFileIO", e10);
                    if (((Boolean) this.f7898b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                } catch (Throwable th4) {
                    if (o.a()) {
                        this.f7899c.a("FileManager", "Unknown failure to read file.", th4);
                    }
                    this.f7899c.a("FileManager", th4);
                    this.f7898b.D().a("FileManager", "readFile", th4);
                    if (((Boolean) this.f7898b.a(x4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (FileNotFoundException e11) {
                if (o.a()) {
                    this.f7899c.d("FileManager", "File not found. " + e11);
                }
                this.f7899c.a("FileManager", e11);
                this.f7898b.D().a("FileManager", "readFileNotFound", e11);
                if (0 != 0 && ((Boolean) this.f7898b.a(x4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            z10 = false;
            if (z10 && ((Boolean) this.f7898b.a(x4.M0)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            h(file);
            throw th;
        }
    }

    private com.applovin.impl.g2 a() {
        if (com.applovin.impl.o0.d() && ((Boolean) this.f7898b.a(x4.f8574s3)).booleanValue()) {
            try {
                return new d4(this.f7898b);
            } catch (Throwable th) {
                if (o.a()) {
                    this.f7899c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f7898b.D().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new com.applovin.impl.h2(this.f7898b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7900d) {
            zContains = this.f7901e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f7900d) {
            boolean zAdd = this.f7901e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f7900d.wait();
                    zAdd = this.f7901e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (o.a()) {
                        this.f7899c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f7898b.E0()) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Compacting cache...");
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
                this.f7899c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f7899c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f7898b.D().a(com.applovin.impl.d2.Q0, "createNoMediaFile");
        } catch (IOException e10) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            this.f7899c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains(RewardPlus.ICON)) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z10) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Unable to make cache directory at " + fileD, th);
            }
            this.f7898b.D().a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z10 = false;
            boolean z11 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z12 = parentFile != null && parentFile.exists();
            if (z12 && parentFile.canWrite()) {
                z10 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z11 + "\nparentDirectoryExists: " + z12 + "\nisParentDirectoryWritable: " + z10;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    public boolean c(String str, Context context) {
        if (this.f7902f) {
            return b(str, context);
        }
        boolean z10 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z10 = true;
        }
        h(fileA);
        return z10;
    }

    private long b() {
        long jLongValue = ((Long) this.f7898b.a(x4.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 8192);
                    if (i10 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        String string = byteArrayOutputStream.toString(C.UTF8_NAME);
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f7899c.a("FileManager", th);
            this.f7898b.D().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0302 A[Catch: all -> 0x0308, TRY_LEAVE, TryCatch #9 {all -> 0x0308, blocks: (B:184:0x02fc, B:186:0x0302), top: B:241:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02c5 A[EDGE_INSN: B:272:0x02c5->B:166:0x02c5 BREAK  A[LOOP:1: B:139:0x0268->B:273:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f A[Catch: all -> 0x0155, TryCatch #18 {all -> 0x0155, blocks: (B:73:0x0149, B:75:0x014f, B:78:0x0158), top: B:258:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i10, String str2, Map map) {
        return a(file, str, list, true, i10, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z10, int i10, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f7898b.g().d(com.applovin.impl.d2.L, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = 1;
        while (i11 <= i10) {
            if (a(file, str, list, z10, str2, map2)) {
                a(true, str, i11, jElapsedRealtime, map);
                return true;
            }
            i11++;
            map2 = map;
        }
        a(false, str, i10, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f7898b.a(x4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                this.f7899c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f7898b.g().d(com.applovin.impl.d2.M, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (o.a()) {
                    this.f7899c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f7899c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = n7.d(jElapsedRealtime2);
                    double dC = n7.c(file.length());
                    long j10 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j10), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f7898b.g().d(com.applovin.impl.d2.R, mapA);
                    this.f7898b.d0().b(j10, str, str2);
                } else {
                    if (o.a()) {
                        this.f7899c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f7898b.g().d(com.applovin.impl.d2.S, a(file, str, jElapsedRealtime2, map));
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
        } catch (Throwable th) {
            try {
                this.f7899c.a("FileManager", th);
                this.f7898b.D().a("FileManager", "loadAndCacheResource", th);
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

    private Map a(File file, String str, long j10, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j10), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z10, String str, int i10, long j10, Map map) {
        com.applovin.impl.d2 d2Var = z10 ? com.applovin.impl.d2.N : com.applovin.impl.d2.O;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i10));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f7898b.g().d(d2Var, map2);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        if (z10 && !n7.a(str, list)) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f7899c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f7898b.g().d(com.applovin.impl.d2.P, mapHashMap);
        try {
            return this.f7903g.a(httpsString, map);
        } catch (Throwable th) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.f7898b.D().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
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

    public String a(Context context, String str, String str2, List list, boolean z10, int i10, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i10, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f7898b.D().a(com.applovin.impl.d2.Q0, "cacheResource");
            return null;
        }
        String strA = n7.a(Uri.parse(str), str2, this.f7898b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i10, str3, map)) {
            return null;
        }
        if (o.a()) {
            this.f7899c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z10 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f7898b.c(x4.G0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f7899c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j10, Context context) {
        long jIntValue = ((Integer) this.f7898b.a(x4.C0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j10) > jIntValue) {
                if (o.a()) {
                    this.f7899c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.f7899c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.l().keySet());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g(a(Uri.parse((String) obj).getLastPathSegment(), context));
        }
        Uri uriL0 = bVar.l0();
        if (uriL0 != null) {
            g(a(uriL0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f7899c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f7898b.D().a(com.applovin.impl.d2.Q0, str, mapHashMap);
        } catch (Throwable th) {
            if (o.a()) {
                this.f7899c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f7898b.D().a("FileManager", str, th);
        }
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
