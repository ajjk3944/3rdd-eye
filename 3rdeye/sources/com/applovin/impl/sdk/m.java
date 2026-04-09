package com.applovin.impl.sdk;

import N7.C1154e9;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.a7;
import com.applovin.impl.f6;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.impl.y1;
import com.google.android.gms.common.internal.ImagesContract;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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
    private final k f21270b;

    /* renamed from: c, reason: collision with root package name */
    private final o f21271c;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21274f;

    /* renamed from: a, reason: collision with root package name */
    private final String f21269a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f21272d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f21273e = new HashSet();

    public m(k kVar) {
        this.f21270b = kVar;
        this.f21271c = kVar.O();
        this.f21274f = ((Boolean) kVar.a(l4.f19819R0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21272d) {
            try {
                if (this.f21273e.contains(absolutePath)) {
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
            this.f21271c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f21270b.E().a(y1.f21824v0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f21270b.E().a("FileManager", "removeFile", th);
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
        synchronized (this.f21272d) {
            try {
                if (!this.f21273e.remove(absolutePath)) {
                    this.f21270b.E().a(y1.f21824v0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f21272d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f21270b.q0().a((w4) new f6(this.f21270b, false, "removeCachedResourcesForAd", new J4.e(this, bVar, context, 10)), r5.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f21270b.q0().a((w4) new f6(this.f21270b, false, "removeCachedVideoResourceForAd", new J4.f(this, bVar, context, 6)), r5.b.CACHING);
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f21271c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
        } catch (Throwable th) {
            th = th;
            z10 = false;
        }
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String strA = a(fileInputStream);
                            boolean z11 = strA == null;
                            fileInputStream.close();
                            if (z11 && ((Boolean) this.f21270b.a(l4.f19765J0)).booleanValue()) {
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
                    } catch (FileNotFoundException e4) {
                        if (o.a()) {
                            this.f21271c.d("FileManager", "File not found. " + e4);
                        }
                        this.f21271c.a("FileManager", e4);
                        this.f21270b.E().a("FileManager", "readFileNotFound", e4);
                        if (0 != 0 && ((Boolean) this.f21270b.a(l4.f19765J0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th4) {
                    if (o.a()) {
                        this.f21271c.a("FileManager", "Unknown failure to read file.", th4);
                    }
                    this.f21271c.a("FileManager", th4);
                    this.f21270b.E().a("FileManager", "readFile", th4);
                    if (((Boolean) this.f21270b.a(l4.f19765J0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (IOException e10) {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Failed to read file: " + file.getName() + e10);
                }
                this.f21271c.a("FileManager", e10);
                this.f21270b.E().a("FileManager", "readFileIO", e10);
                if (((Boolean) this.f21270b.a(l4.f19765J0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            if (z10 && ((Boolean) this.f21270b.a(l4.f19765J0)).booleanValue()) {
                a(file, "removeFileAfterReadFail");
            }
            h(file);
            throw th;
        }
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21272d) {
            zContains = this.f21273e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f21272d) {
            boolean zAdd = this.f21273e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f21272d.wait();
                    zAdd = this.f21273e.add(absolutePath);
                } catch (InterruptedException e4) {
                    if (o.a()) {
                        this.f21271c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e4);
                    }
                    throw new RuntimeException(e4);
                }
            }
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void b(Context context) {
        if (this.f21270b.E0()) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            C1154e9.m("Looking up cached resource: ", str, this.f21271c, "FileManager");
        }
        if (str.contains("icon")) {
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
                this.f21271c.a("FileManager", "Unable to make cache directory at " + fileD, th);
            }
            this.f21270b.E().a("FileManager", "createCacheDir", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.w0() == null) {
            return;
        }
        g(a(bVar.w0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.f21271c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f21271c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f21270b.E().a(y1.f21824v0, "createNoMediaFile");
        } catch (IOException e4) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Failed to create .nomedia file", e4);
            }
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
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f21274f) {
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

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        String string = byteArrayOutputStream.toString(Constants.ENCODING);
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f21271c.a("FileManager", th);
            this.f21270b.E().a("FileManager", "readInputStreamAsString", th);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01c9 A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #11 {all -> 0x01cf, blocks: (B:113:0x01c3, B:115:0x01c9), top: B:154:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee A[Catch: all -> 0x00f4, TryCatch #12 {all -> 0x00f4, blocks: (B:54:0x00e8, B:56:0x00ee, B:59:0x00f7), top: B:156:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i, String str2, Map map) {
        return a(file, str, list, true, i, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z10, int i, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ImagesContract.URL, str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f21270b.g().d(y1.f21827x, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 1;
        while (i10 <= i) {
            if (a(file, str, list, z10, str2, map2)) {
                a(true, str, i10, jElapsedRealtime, map);
                return true;
            }
            i10++;
            map2 = map;
        }
        a(false, str, i, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f21270b.a(l4.f19826S0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                C1154e9.m("File exists for ", str, this.f21271c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ImagesContract.URL, str);
            mapHashMap.putAll(map);
            this.f21270b.g().d(y1.f21829y, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f21271c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = a7.d(jElapsedRealtime2);
                    double dC = a7.c(file.length());
                    long j4 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j4), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f21270b.g().d(y1.f21757C, mapA);
                    if (StringUtils.isValidString(str2) && str.endsWith(str2)) {
                        this.f21270b.B().a(Long.valueOf(j4));
                    }
                } else {
                    if (o.a()) {
                        this.f21271c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f21270b.g().d(y1.f21759D, a(file, str, jElapsedRealtime2, map));
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
                this.f21271c.a("FileManager", th);
                this.f21270b.E().a("FileManager", "loadAndCacheResource", th);
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

    private Map a(File file, String str, long j4, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid(ImagesContract.URL, str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j4), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z10, String str, int i, long j4, Map map) {
        y1 y1Var = z10 ? y1.f21831z : y1.f21753A;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j4;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i));
        map2.put(ImagesContract.URL, str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f21270b.g().d(y1Var, map2);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        HttpURLConnection httpURLConnection;
        if (z10 && !a7.a(str, list)) {
            if (o.a()) {
                C1154e9.m("Domain is not whitelisted, skipping precache for url: ", str, this.f21271c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f21271c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap(ImagesContract.URL, httpsString);
        mapHashMap.putAll(map);
        this.f21270b.g().d(y1.f21755B, mapHashMap);
        try {
            httpURLConnection = (HttpURLConnection) new URL(httpsString).openConnection();
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setConnectTimeout(((Integer) this.f21270b.a(l4.f19781L2)).intValue());
            httpURLConnection.setReadTimeout(((Integer) this.f21270b.a(l4.f19788M2)).intValue());
            httpURLConnection.setDefaultUseCaches(true);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            int responseCode = httpURLConnection.getResponseCode();
            this.f21270b.E().a("loadResource", httpsString, responseCode, httpURLConnection.getResponseMessage());
            if (responseCode >= 200 && responseCode < 300) {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Opened stream to resource " + httpsString);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                if (((Boolean) this.f21270b.a(l4.f19952j3)).booleanValue()) {
                    a7.a(httpURLConnection, this.f21270b);
                }
                return inputStream;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            try {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Error loading " + httpsString, th);
                }
                this.f21270b.E().a("FileManager", "loadResource", th, CollectionUtils.hashMap(ImagesContract.URL, httpsString));
                if (((Boolean) this.f21270b.a(l4.f19952j3)).booleanValue()) {
                    a7.a(httpURLConnection, this.f21270b);
                }
                return null;
            } finally {
                if (((Boolean) this.f21270b.a(l4.f19952j3)).booleanValue()) {
                    a7.a(httpURLConnection, this.f21270b);
                }
            }
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listD0 = bVar.d0();
        if (bVar.Y0() || listD0.contains(str)) {
            return bVar.K();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f21270b.E().a(y1.f21824v0, "cacheResource");
            return null;
        }
        String strA = a7.a(Uri.parse(str), str2, this.f21270b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i, str3, map)) {
            return null;
        }
        if (o.a()) {
            C1154e9.m("Caching succeeded for file ", strA, this.f21271c, "FileManager");
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jA = a();
        boolean z10 = jA != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f21270b.c(l4.f19749H0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jA) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f21271c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j4, Context context) {
        long jIntValue = ((Integer) this.f21270b.a(l4.f19718D0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j4) > jIntValue) {
                if (o.a()) {
                    this.f21271c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.f21271c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.l());
        CollectionUtils.addObjectIfExists(bVar.w0(), arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g(a(((Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f21271c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f21270b.E().a(y1.f21824v0, str, mapHashMap);
        } catch (Throwable th) {
            if (o.a()) {
                this.f21271c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f21270b.E().a("FileManager", str, th);
        }
    }

    private long a() {
        long jLongValue = ((Long) this.f21270b.a(l4.f19710C0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    private long a(long j4) {
        return j4 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
