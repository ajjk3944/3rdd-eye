package A2;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f234a;

    /* renamed from: b, reason: collision with root package name */
    private final File f235b;

    /* renamed from: c, reason: collision with root package name */
    private final File f236c;

    /* renamed from: d, reason: collision with root package name */
    private final File f237d;

    /* renamed from: e, reason: collision with root package name */
    private final int f238e;

    /* renamed from: f, reason: collision with root package name */
    private long f239f;

    /* renamed from: g, reason: collision with root package name */
    private final int f240g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f242i;

    /* renamed from: k, reason: collision with root package name */
    private int f244k;

    /* renamed from: h, reason: collision with root package name */
    private long f241h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap f243j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f245l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f246m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* renamed from: n, reason: collision with root package name */
    private final Callable f247n = new CallableC0003a();

    /* renamed from: A2.a$a, reason: collision with other inner class name */
    class CallableC0003a implements Callable {
        CallableC0003a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f242i == null) {
                        return null;
                    }
                    a.this.u0();
                    if (a.this.m0()) {
                        a.this.r0();
                        a.this.f244k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0003a callableC0003a) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f249a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f250b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f251c;

        /* synthetic */ c(a aVar, d dVar, CallableC0003a callableC0003a) {
            this(dVar);
        }

        public void a() {
            a.this.P(this, false);
        }

        public void b() {
            if (this.f251c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.P(this, true);
            this.f251c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f249a.f258f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f249a.f257e) {
                        this.f250b[i10] = true;
                    }
                    fileK = this.f249a.k(i10);
                    a.this.f234a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f249a = dVar;
            this.f250b = dVar.f257e ? null : new boolean[a.this.f240g];
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f253a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f254b;

        /* renamed from: c, reason: collision with root package name */
        File[] f255c;

        /* renamed from: d, reason: collision with root package name */
        File[] f256d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f257e;

        /* renamed from: f, reason: collision with root package name */
        private c f258f;

        /* renamed from: g, reason: collision with root package name */
        private long f259g;

        /* synthetic */ d(a aVar, String str, CallableC0003a callableC0003a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f240g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f254b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f255c[i10];
        }

        public File k(int i10) {
            return this.f256d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f254b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f253a = str;
            this.f254b = new long[a.this.f240g];
            this.f255c = new File[a.this.f240g];
            this.f256d = new File[a.this.f240g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f240g; i10++) {
                sb2.append(i10);
                this.f255c[i10] = new File(a.this.f234a, sb2.toString());
                sb2.append(".tmp");
                this.f256d[i10] = new File(a.this.f234a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f261a;

        /* renamed from: b, reason: collision with root package name */
        private final long f262b;

        /* renamed from: c, reason: collision with root package name */
        private final long[] f263c;

        /* renamed from: d, reason: collision with root package name */
        private final File[] f264d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0003a callableC0003a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f264d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f261a = str;
            this.f262b = j10;
            this.f264d = fileArr;
            this.f263c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f234a = file;
        this.f238e = i10;
        this.f235b = new File(file, "journal");
        this.f236c = new File(file, "journal.tmp");
        this.f237d = new File(file, "journal.bkp");
        this.f240g = i11;
        this.f239f = j10;
    }

    private void C() {
        if (this.f242i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void J(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void P(c cVar, boolean z10) {
        d dVar = cVar.f249a;
        if (dVar.f258f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f257e) {
            for (int i10 = 0; i10 < this.f240g; i10++) {
                if (!cVar.f250b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f240g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                T(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f254b[i11];
                long length = fileJ.length();
                dVar.f254b[i11] = length;
                this.f241h = (this.f241h - j10) + length;
            }
        }
        this.f244k++;
        dVar.f258f = null;
        if (dVar.f257e || z10) {
            dVar.f257e = true;
            this.f242i.append((CharSequence) "CLEAN");
            this.f242i.append(' ');
            this.f242i.append((CharSequence) dVar.f253a);
            this.f242i.append((CharSequence) dVar.l());
            this.f242i.append('\n');
            if (z10) {
                long j11 = this.f245l;
                this.f245l = 1 + j11;
                dVar.f259g = j11;
            }
        } else {
            this.f243j.remove(dVar.f253a);
            this.f242i.append((CharSequence) "REMOVE");
            this.f242i.append(' ');
            this.f242i.append((CharSequence) dVar.f253a);
            this.f242i.append('\n');
        }
        d0(this.f242i);
        if (this.f241h > this.f239f || m0()) {
            this.f246m.submit(this.f247n);
        }
    }

    private static void T(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c b0(String str, long j10) {
        C();
        d dVar = (d) this.f243j.get(str);
        CallableC0003a callableC0003a = null;
        if (j10 != -1 && (dVar == null || dVar.f259g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0003a);
            this.f243j.put(str, dVar);
        } else if (dVar.f258f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0003a);
        dVar.f258f = cVar;
        this.f242i.append((CharSequence) "DIRTY");
        this.f242i.append(' ');
        this.f242i.append((CharSequence) str);
        this.f242i.append('\n');
        d0(this.f242i);
        return cVar;
    }

    private static void d0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m0() {
        int i10 = this.f244k;
        return i10 >= 2000 && i10 >= this.f243j.size();
    }

    public static a n0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                t0(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f235b.exists()) {
            try {
                aVar.p0();
                aVar.o0();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.S();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.r0();
        return aVar2;
    }

    private void o0() throws IOException {
        T(this.f236c);
        Iterator it = this.f243j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f258f == null) {
                while (i10 < this.f240g) {
                    this.f241h += dVar.f254b[i10];
                    i10++;
                }
            } else {
                dVar.f258f = null;
                while (i10 < this.f240g) {
                    T(dVar.j(i10));
                    T(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void p0() throws IOException {
        A2.b bVar = new A2.b(new FileInputStream(this.f235b), A2.c.f272a);
        try {
            String strJ = bVar.j();
            String strJ2 = bVar.j();
            String strJ3 = bVar.j();
            String strJ4 = bVar.j();
            String strJ5 = bVar.j();
            if (!"libcore.io.DiskLruCache".equals(strJ) || !"1".equals(strJ2) || !Integer.toString(this.f238e).equals(strJ3) || !Integer.toString(this.f240g).equals(strJ4) || !"".equals(strJ5)) {
                throw new IOException("unexpected journal header: [" + strJ + ", " + strJ2 + ", " + strJ4 + ", " + strJ5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    q0(bVar.j());
                    i10++;
                } catch (EOFException unused) {
                    this.f244k = i10 - this.f243j.size();
                    if (bVar.h()) {
                        r0();
                    } else {
                        this.f242i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f235b, true), A2.c.f272a));
                    }
                    A2.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            A2.c.a(bVar);
            throw th2;
        }
    }

    private void q0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f243j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f243j.get(strSubstring);
        CallableC0003a callableC0003a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0003a);
            this.f243j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f257e = true;
            dVar.f258f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f258f = new c(this, dVar, callableC0003a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void r0() {
        try {
            Writer writer = this.f242i;
            if (writer != null) {
                J(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f236c), A2.c.f272a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f238e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f240g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f243j.values()) {
                    if (dVar.f258f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f253a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f253a + dVar.l() + '\n');
                    }
                }
                J(bufferedWriter);
                if (this.f235b.exists()) {
                    t0(this.f235b, this.f237d, true);
                }
                t0(this.f236c, this.f235b, false);
                this.f237d.delete();
                this.f242i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f235b, true), A2.c.f272a));
            } catch (Throwable th2) {
                J(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static void t0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            T(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        while (this.f241h > this.f239f) {
            s0((String) ((Map.Entry) this.f243j.entrySet().iterator().next()).getKey());
        }
    }

    public void S() throws IOException {
        close();
        A2.c.b(this.f234a);
    }

    public c Y(String str) {
        return b0(str, -1L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f242i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f243j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f258f != null) {
                    dVar.f258f.a();
                }
            }
            u0();
            J(this.f242i);
            this.f242i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized e f0(String str) {
        C();
        d dVar = (d) this.f243j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f257e) {
            return null;
        }
        for (File file : dVar.f255c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f244k++;
        this.f242i.append((CharSequence) "READ");
        this.f242i.append(' ');
        this.f242i.append((CharSequence) str);
        this.f242i.append('\n');
        if (m0()) {
            this.f246m.submit(this.f247n);
        }
        return new e(this, str, dVar.f259g, dVar.f255c, dVar.f254b, null);
    }

    public synchronized boolean s0(String str) {
        try {
            C();
            d dVar = (d) this.f243j.get(str);
            if (dVar != null && dVar.f258f == null) {
                for (int i10 = 0; i10 < this.f240g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f241h -= dVar.f254b[i10];
                    dVar.f254b[i10] = 0;
                }
                this.f244k++;
                this.f242i.append((CharSequence) "REMOVE");
                this.f242i.append(' ');
                this.f242i.append((CharSequence) str);
                this.f242i.append('\n');
                this.f243j.remove(str);
                if (m0()) {
                    this.f246m.submit(this.f247n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }
}
