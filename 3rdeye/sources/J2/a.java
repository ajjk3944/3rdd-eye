package J2;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f2718b;

    /* renamed from: c, reason: collision with root package name */
    public final File f2719c;

    /* renamed from: d, reason: collision with root package name */
    public final File f2720d;

    /* renamed from: e, reason: collision with root package name */
    public final File f2721e;

    /* renamed from: g, reason: collision with root package name */
    public final long f2723g;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f2725j;

    /* renamed from: l, reason: collision with root package name */
    public int f2727l;
    public long i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f2726k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f2728m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f2729n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: o, reason: collision with root package name */
    public final CallableC0047a f2730o = new CallableC0047a();

    /* renamed from: f, reason: collision with root package name */
    public final int f2722f = 1;

    /* renamed from: h, reason: collision with root package name */
    public final int f2724h = 1;

    /* compiled from: DiskLruCache.java */
    /* renamed from: J2.a$a, reason: collision with other inner class name */
    public class CallableC0047a implements Callable<Void> {
        public CallableC0047a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.f2725j == null) {
                        return null;
                    }
                    aVar.m0();
                    if (a.this.n()) {
                        a.this.W();
                        a.this.f2727l = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f2732a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f2733b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2734c;

        public c(d dVar) {
            this.f2732a = dVar;
            this.f2733b = dVar.f2740e ? null : new boolean[a.this.f2724h];
        }

        public final void a() throws IOException {
            a.a(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                try {
                    d dVar = this.f2732a;
                    if (dVar.f2741f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.f2740e) {
                        this.f2733b[0] = true;
                    }
                    file = dVar.f2739d[0];
                    a.this.f2718b.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f2736a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f2737b;

        /* renamed from: c, reason: collision with root package name */
        public final File[] f2738c;

        /* renamed from: d, reason: collision with root package name */
        public final File[] f2739d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2740e;

        /* renamed from: f, reason: collision with root package name */
        public c f2741f;

        public d(String str) {
            this.f2736a = str;
            int i = a.this.f2724h;
            this.f2737b = new long[i];
            this.f2738c = new File[i];
            this.f2739d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < a.this.f2724h; i10++) {
                sb.append(i10);
                File[] fileArr = this.f2738c;
                String string = sb.toString();
                File file = a.this.f2718b;
                fileArr[i10] = new File(file, string);
                sb.append(".tmp");
                this.f2739d[i10] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j4 : this.f2737b) {
                sb.append(' ');
                sb.append(j4);
            }
            return sb.toString();
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final File[] f2743a;

        public e(File[] fileArr) {
            this.f2743a = fileArr;
        }
    }

    public a(File file, long j4) {
        this.f2718b = file;
        this.f2719c = new File(file, "journal");
        this.f2720d = new File(file, "journal.tmp");
        this.f2721e = new File(file, "journal.bkp");
        this.f2723g = j4;
    }

    public static a A(File file, long j4) throws IOException {
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                k0(file2, file3, false);
            }
        }
        a aVar = new a(file, j4);
        if (aVar.f2719c.exists()) {
            try {
                aVar.D();
                aVar.B();
                return aVar;
            } catch (IOException e4) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e4.getMessage() + ", removing");
                aVar.close();
                J2.c.a(aVar.f2718b);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j4);
        aVar2.W();
        return aVar2;
    }

    public static void a(a aVar, c cVar, boolean z10) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.f2732a;
            if (dVar.f2741f != cVar) {
                throw new IllegalStateException();
            }
            if (z10 && !dVar.f2740e) {
                for (int i = 0; i < aVar.f2724h; i++) {
                    if (!cVar.f2733b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.f2739d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < aVar.f2724h; i10++) {
                File file = dVar.f2739d[i10];
                if (!z10) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = dVar.f2738c[i10];
                    file.renameTo(file2);
                    long j4 = dVar.f2737b[i10];
                    long length = file2.length();
                    dVar.f2737b[i10] = length;
                    aVar.i = (aVar.i - j4) + length;
                }
            }
            aVar.f2727l++;
            dVar.f2741f = null;
            if (dVar.f2740e || z10) {
                dVar.f2740e = true;
                aVar.f2725j.append((CharSequence) "CLEAN");
                aVar.f2725j.append(' ');
                aVar.f2725j.append((CharSequence) dVar.f2736a);
                aVar.f2725j.append((CharSequence) dVar.a());
                aVar.f2725j.append('\n');
                if (z10) {
                    aVar.f2728m++;
                }
            } else {
                aVar.f2726k.remove(dVar.f2736a);
                aVar.f2725j.append((CharSequence) "REMOVE");
                aVar.f2725j.append(' ');
                aVar.f2725j.append((CharSequence) dVar.f2736a);
                aVar.f2725j.append('\n');
            }
            k(aVar.f2725j);
            if (aVar.i > aVar.f2723g || aVar.n()) {
                aVar.f2729n.submit(aVar.f2730o);
            }
        }
    }

    @TargetApi(26)
    public static void c(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void k(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void k0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void B() throws IOException {
        d(this.f2720d);
        Iterator<d> it = this.f2726k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f2741f;
            int i = this.f2724h;
            int i10 = 0;
            if (cVar == null) {
                while (i10 < i) {
                    this.i += next.f2737b[i10];
                    i10++;
                }
            } else {
                next.f2741f = null;
                while (i10 < i) {
                    d(next.f2738c[i10]);
                    d(next.f2739d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void D() throws IOException {
        File file = this.f2719c;
        J2.b bVar = new J2.b(new FileInputStream(file), J2.c.f2750a);
        try {
            String strA = bVar.a();
            String strA2 = bVar.a();
            String strA3 = bVar.a();
            String strA4 = bVar.a();
            String strA5 = bVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f2722f).equals(strA3) || !Integer.toString(this.f2724h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    F(bVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.f2727l = i - this.f2726k.size();
                    if (bVar.f2748f == -1) {
                        W();
                    } else {
                        this.f2725j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), J2.c.f2750a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e4) {
                        throw e4;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void F(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.f2726k;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f2741f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f2740e = true;
        dVar.f2741f = null;
        if (strArrSplit.length != a.this.f2724h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                dVar.f2737b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void W() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.f2725j;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2720d), J2.c.f2750a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2722f));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f2724h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f2726k.values()) {
                    if (dVar.f2741f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f2736a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f2736a + dVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f2719c.exists()) {
                    k0(this.f2719c, this.f2721e, true);
                }
                k0(this.f2720d, this.f2719c, false);
                this.f2721e.delete();
                this.f2725j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f2719c, true), J2.c.f2750a));
            } catch (Throwable th) {
                c(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f2725j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f2726k.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f2741f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            m0();
            c(this.f2725j);
            this.f2725j = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c e(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.f2725j == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f2726k.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f2726k.put(str, dVar);
                } else if (dVar.f2741f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f2741f = cVar;
                this.f2725j.append((CharSequence) "DIRTY");
                this.f2725j.append(' ');
                this.f2725j.append((CharSequence) str);
                this.f2725j.append('\n');
                k(this.f2725j);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e l(String str) throws IOException {
        if (this.f2725j == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.f2726k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f2740e) {
            return null;
        }
        for (File file : dVar.f2738c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f2727l++;
        this.f2725j.append((CharSequence) "READ");
        this.f2725j.append(' ');
        this.f2725j.append((CharSequence) str);
        this.f2725j.append('\n');
        if (n()) {
            this.f2729n.submit(this.f2730o);
        }
        return new e(dVar.f2738c);
    }

    public final void m0() throws IOException {
        while (this.i > this.f2723g) {
            String key = this.f2726k.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.f2725j == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.f2726k.get(key);
                    if (dVar != null && dVar.f2741f == null) {
                        for (int i = 0; i < this.f2724h; i++) {
                            File file = dVar.f2738c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j4 = this.i;
                            long[] jArr = dVar.f2737b;
                            this.i = j4 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f2727l++;
                        this.f2725j.append((CharSequence) "REMOVE");
                        this.f2725j.append(' ');
                        this.f2725j.append((CharSequence) key);
                        this.f2725j.append('\n');
                        this.f2726k.remove(key);
                        if (n()) {
                            this.f2729n.submit(this.f2730o);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final boolean n() {
        int i = this.f2727l;
        return i >= 2000 && i >= this.f2726k.size();
    }
}
