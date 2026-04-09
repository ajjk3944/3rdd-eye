package v7;

import android.os.Build;
import android.os.StrictMode;
import b5.i0;
import ec.g1;
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
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f35956a;

    /* renamed from: b, reason: collision with root package name */
    public final File f35957b;

    /* renamed from: c, reason: collision with root package name */
    public final File f35958c;

    /* renamed from: d, reason: collision with root package name */
    public final File f35959d;

    /* renamed from: f, reason: collision with root package name */
    public final long f35961f;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f35963i;

    /* renamed from: k, reason: collision with root package name */
    public int f35964k;

    /* renamed from: h, reason: collision with root package name */
    public long f35962h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f35965l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f35966m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());

    /* renamed from: n, reason: collision with root package name */
    public final g1 f35967n = new g1(4, this);

    /* renamed from: e, reason: collision with root package name */
    public final int f35960e = 1;
    public final int g = 1;

    public c(File file, long j) {
        this.f35956a = file;
        this.f35957b = new File(file, "journal");
        this.f35958c = new File(file, "journal.tmp");
        this.f35959d = new File(file, "journal.bkp");
        this.f35961f = j;
    }

    public static void L(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void c(c cVar, i0 i0Var, boolean z3) {
        synchronized (cVar) {
            b bVar = (b) i0Var.f1821b;
            if (bVar.f35955f != i0Var) {
                throw new IllegalStateException();
            }
            if (z3 && !bVar.f35954e) {
                for (int i4 = 0; i4 < cVar.g; i4++) {
                    if (!((boolean[]) i0Var.f1822c)[i4]) {
                        i0Var.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i4);
                    }
                    if (!bVar.f35953d[i4].exists()) {
                        i0Var.a();
                        return;
                    }
                }
            }
            for (int i10 = 0; i10 < cVar.g; i10++) {
                File file = bVar.f35953d[i10];
                if (!z3) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = bVar.f35952c[i10];
                    file.renameTo(file2);
                    long j = bVar.f35951b[i10];
                    long length = file2.length();
                    bVar.f35951b[i10] = length;
                    cVar.f35962h = (cVar.f35962h - j) + length;
                }
            }
            cVar.f35964k++;
            bVar.f35955f = null;
            if (bVar.f35954e || z3) {
                bVar.f35954e = true;
                cVar.f35963i.append((CharSequence) "CLEAN");
                cVar.f35963i.append(' ');
                cVar.f35963i.append((CharSequence) bVar.f35950a);
                cVar.f35963i.append((CharSequence) bVar.a());
                cVar.f35963i.append('\n');
                if (z3) {
                    cVar.f35965l++;
                }
            } else {
                cVar.j.remove(bVar.f35950a);
                cVar.f35963i.append((CharSequence) "REMOVE");
                cVar.f35963i.append(' ');
                cVar.f35963i.append((CharSequence) bVar.f35950a);
                cVar.f35963i.append('\n');
            }
            p(cVar.f35963i);
            if (cVar.f35962h > cVar.f35961f || cVar.w()) {
                cVar.f35966m.submit(cVar.f35967n);
            }
        }
    }

    public static void e(BufferedWriter bufferedWriter) throws IOException {
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

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void p(BufferedWriter bufferedWriter) throws IOException {
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

    public static c y(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                L(file2, file3, false);
            }
        }
        c cVar = new c(file, j);
        if (cVar.f35957b.exists()) {
            try {
                cVar.E();
                cVar.A();
                return cVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                cVar.close();
                e.a(cVar.f35956a);
            }
        }
        file.mkdirs();
        c cVar2 = new c(file, j);
        cVar2.G();
        return cVar2;
    }

    public final void A() throws IOException {
        g(this.f35958c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            i0 i0Var = bVar.f35955f;
            int i4 = this.g;
            int i10 = 0;
            if (i0Var == null) {
                while (i10 < i4) {
                    this.f35962h += bVar.f35951b[i10];
                    i10++;
                }
            } else {
                bVar.f35955f = null;
                while (i10 < i4) {
                    g(bVar.f35952c[i10]);
                    g(bVar.f35953d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void E() {
        File file = this.f35957b;
        d dVar = new d(new FileInputStream(file), e.f35973a);
        try {
            String strC = dVar.c();
            String strC2 = dVar.c();
            String strC3 = dVar.c();
            String strC4 = dVar.c();
            String strC5 = dVar.c();
            if (!"libcore.io.DiskLruCache".equals(strC) || !"1".equals(strC2) || !Integer.toString(this.f35960e).equals(strC3) || !Integer.toString(this.g).equals(strC4) || !"".equals(strC5)) {
                throw new IOException("unexpected journal header: [" + strC + ", " + strC2 + ", " + strC4 + ", " + strC5 + "]");
            }
            int i4 = 0;
            while (true) {
                try {
                    F(dVar.c());
                    i4++;
                } catch (EOFException unused) {
                    this.f35964k = i4 - this.j.size();
                    if (dVar.f35972e == -1) {
                        G();
                    } else {
                        this.f35963i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f35973a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                dVar.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void F(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i4 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i4);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i4);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i4, iIndexOf2);
        }
        b bVar = (b) linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f35955f = new i0(this, bVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        bVar.f35954e = true;
        bVar.f35955f = null;
        if (strArrSplit.length != bVar.g.g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                bVar.f35951b[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void G() {
        try {
            BufferedWriter bufferedWriter = this.f35963i;
            if (bufferedWriter != null) {
                e(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f35958c), e.f35973a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f35960e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (b bVar : this.j.values()) {
                    if (bVar.f35955f != null) {
                        bufferedWriter2.write("DIRTY " + bVar.f35950a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + bVar.f35950a + bVar.a() + '\n');
                    }
                }
                e(bufferedWriter2);
                if (this.f35957b.exists()) {
                    L(this.f35957b, this.f35959d, true);
                }
                L(this.f35958c, this.f35957b, false);
                this.f35959d.delete();
                this.f35963i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f35957b, true), e.f35973a));
            } catch (Throwable th2) {
                e(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void N() {
        while (this.f35962h > this.f35961f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f35963i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    b bVar = (b) this.j.get(str);
                    if (bVar != null && bVar.f35955f == null) {
                        for (int i4 = 0; i4 < this.g; i4++) {
                            File file = bVar.f35952c[i4];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f35962h;
                            long[] jArr = bVar.f35951b;
                            this.f35962h = j - jArr[i4];
                            jArr[i4] = 0;
                        }
                        this.f35964k++;
                        this.f35963i.append((CharSequence) "REMOVE");
                        this.f35963i.append(' ');
                        this.f35963i.append((CharSequence) str);
                        this.f35963i.append('\n');
                        this.j.remove(str);
                        if (w()) {
                            this.f35966m.submit(this.f35967n);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f35963i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.j.values());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                i0 i0Var = ((b) obj).f35955f;
                if (i0Var != null) {
                    i0Var.a();
                }
            }
            N();
            e(this.f35963i);
            this.f35963i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final i0 m(String str) {
        synchronized (this) {
            try {
                if (this.f35963i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                b bVar = (b) this.j.get(str);
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.j.put(str, bVar);
                } else if (bVar.f35955f != null) {
                    return null;
                }
                i0 i0Var = new i0(this, bVar);
                bVar.f35955f = i0Var;
                this.f35963i.append((CharSequence) "DIRTY");
                this.f35963i.append(' ');
                this.f35963i.append((CharSequence) str);
                this.f35963i.append('\n');
                p(this.f35963i);
                return i0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized d0 v(String str) {
        if (this.f35963i == null) {
            throw new IllegalStateException("cache is closed");
        }
        b bVar = (b) this.j.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f35954e) {
            return null;
        }
        for (File file : bVar.f35952c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f35964k++;
        this.f35963i.append((CharSequence) "READ");
        this.f35963i.append(' ');
        this.f35963i.append((CharSequence) str);
        this.f35963i.append('\n');
        if (w()) {
            this.f35966m.submit(this.f35967n);
        }
        return new d0(17, bVar.f35952c);
    }

    public final boolean w() {
        int i4 = this.f35964k;
        return i4 >= 2000 && i4 >= this.j.size();
    }
}
