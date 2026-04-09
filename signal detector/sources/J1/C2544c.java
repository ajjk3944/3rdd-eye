package j1;

import A1.s;
import A2.A;
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
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2544c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f21301a;

    /* renamed from: b, reason: collision with root package name */
    public final File f21302b;

    /* renamed from: c, reason: collision with root package name */
    public final File f21303c;

    /* renamed from: d, reason: collision with root package name */
    public final File f21304d;

    /* renamed from: f, reason: collision with root package name */
    public final long f21306f;
    public BufferedWriter i;

    /* renamed from: k, reason: collision with root package name */
    public int f21310k;

    /* renamed from: h, reason: collision with root package name */
    public long f21308h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f21309j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f21311l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f21312m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC2542a());

    /* renamed from: n, reason: collision with root package name */
    public final A f21313n = new A(1, this);

    /* renamed from: e, reason: collision with root package name */
    public final int f21305e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f21307g = 1;

    public C2544c(File file, long j6) {
        this.f21301a = file;
        this.f21302b = new File(file, "journal");
        this.f21303c = new File(file, "journal.tmp");
        this.f21304d = new File(file, "journal.bkp");
        this.f21306f = j6;
    }

    public static void a(C2544c c2544c, s sVar, boolean z6) {
        synchronized (c2544c) {
            C2543b c2543b = (C2543b) sVar.f123b;
            if (c2543b.f21299f != sVar) {
                throw new IllegalStateException();
            }
            if (z6 && !c2543b.f21298e) {
                for (int i = 0; i < c2544c.f21307g; i++) {
                    if (!((boolean[]) sVar.f124c)[i]) {
                        sVar.d();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c2543b.f21297d[i].exists()) {
                        sVar.d();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < c2544c.f21307g; i3++) {
                File file = c2543b.f21297d[i3];
                if (!z6) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = c2543b.f21296c[i3];
                    file.renameTo(file2);
                    long j6 = c2543b.f21295b[i3];
                    long length = file2.length();
                    c2543b.f21295b[i3] = length;
                    c2544c.f21308h = (c2544c.f21308h - j6) + length;
                }
            }
            c2544c.f21310k++;
            c2543b.f21299f = null;
            if (c2543b.f21298e || z6) {
                c2543b.f21298e = true;
                c2544c.i.append((CharSequence) "CLEAN");
                c2544c.i.append(' ');
                c2544c.i.append((CharSequence) c2543b.f21294a);
                c2544c.i.append((CharSequence) c2543b.a());
                c2544c.i.append('\n');
                if (z6) {
                    c2544c.f21311l++;
                }
            } else {
                c2544c.f21309j.remove(c2543b.f21294a);
                c2544c.i.append((CharSequence) "REMOVE");
                c2544c.i.append(' ');
                c2544c.i.append((CharSequence) c2543b.f21294a);
                c2544c.i.append('\n');
            }
            h(c2544c.i);
            if (c2544c.f21308h > c2544c.f21306f || c2544c.m()) {
                c2544c.f21312m.submit(c2544c.f21313n);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
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

    public static void h(BufferedWriter bufferedWriter) throws IOException {
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

    public static C2544c n(File file, long j6) throws IOException {
        if (j6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                s(file2, file3, false);
            }
        }
        C2544c c2544c = new C2544c(file, j6);
        if (c2544c.f21302b.exists()) {
            try {
                c2544c.p();
                c2544c.o();
                return c2544c;
            } catch (IOException e6) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                c2544c.close();
                e.a(c2544c.f21301a);
            }
        }
        file.mkdirs();
        C2544c c2544c2 = new C2544c(file, j6);
        c2544c2.r();
        return c2544c2;
    }

    public static void s(File file, File file2, boolean z6) throws IOException {
        if (z6) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f21309j.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s sVar = ((C2543b) obj).f21299f;
                if (sVar != null) {
                    sVar.d();
                }
            }
            t();
            b(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final s e(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C2543b c2543b = (C2543b) this.f21309j.get(str);
                if (c2543b == null) {
                    c2543b = new C2543b(this, str);
                    this.f21309j.put(str, c2543b);
                } else if (c2543b.f21299f != null) {
                    return null;
                }
                s sVar = new s(this, c2543b);
                c2543b.f21299f = sVar;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                h(this.i);
                return sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized h2.d k(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        C2543b c2543b = (C2543b) this.f21309j.get(str);
        if (c2543b == null) {
            return null;
        }
        if (!c2543b.f21298e) {
            return null;
        }
        for (File file : c2543b.f21296c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f21310k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (m()) {
            this.f21312m.submit(this.f21313n);
        }
        return new h2.d(c2543b.f21296c);
    }

    public final boolean m() {
        int i = this.f21310k;
        return i >= 2000 && i >= this.f21309j.size();
    }

    public final void o() throws IOException {
        d(this.f21303c);
        Iterator it = this.f21309j.values().iterator();
        while (it.hasNext()) {
            C2543b c2543b = (C2543b) it.next();
            s sVar = c2543b.f21299f;
            int i = this.f21307g;
            int i3 = 0;
            if (sVar == null) {
                while (i3 < i) {
                    this.f21308h += c2543b.f21295b[i3];
                    i3++;
                }
            } else {
                c2543b.f21299f = null;
                while (i3 < i) {
                    d(c2543b.f21296c[i3]);
                    d(c2543b.f21297d[i3]);
                    i3++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        File file = this.f21302b;
        d dVar = new d(new FileInputStream(file), e.f21319a);
        try {
            String strA = dVar.a();
            String strA2 = dVar.a();
            String strA3 = dVar.a();
            String strA4 = dVar.a();
            String strA5 = dVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f21305e).equals(strA3) || !Integer.toString(this.f21307g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    q(dVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.f21310k = i - this.f21309j.size();
                    if (dVar.f21318e == -1) {
                        r();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e.f21319a));
                    }
                    try {
                        dVar.close();
                        return;
                    } catch (RuntimeException e6) {
                        throw e6;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                dVar.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void q(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f21309j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C2543b c2543b = (C2543b) linkedHashMap.get(strSubstring);
        if (c2543b == null) {
            c2543b = new C2543b(this, strSubstring);
            linkedHashMap.put(strSubstring, c2543b);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c2543b.f21299f = new s(this, c2543b);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c2543b.f21298e = true;
        c2543b.f21299f = null;
        if (strArrSplit.length != c2543b.f21300g.f21307g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            try {
                c2543b.f21295b[i3] = Long.parseLong(strArrSplit[i3]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void r() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21303c), e.f21319a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f21305e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f21307g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C2543b c2543b : this.f21309j.values()) {
                    if (c2543b.f21299f != null) {
                        bufferedWriter2.write("DIRTY " + c2543b.f21294a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c2543b.f21294a + c2543b.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.f21302b.exists()) {
                    s(this.f21302b, this.f21304d, true);
                }
                s(this.f21303c, this.f21302b, false);
                this.f21304d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f21302b, true), e.f21319a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void t() {
        while (this.f21308h > this.f21306f) {
            String str = (String) ((Map.Entry) this.f21309j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C2543b c2543b = (C2543b) this.f21309j.get(str);
                    if (c2543b != null && c2543b.f21299f == null) {
                        for (int i = 0; i < this.f21307g; i++) {
                            File file = c2543b.f21296c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j6 = this.f21308h;
                            long[] jArr = c2543b.f21295b;
                            this.f21308h = j6 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f21310k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.f21309j.remove(str);
                        if (m()) {
                            this.f21312m.submit(this.f21313n);
                        }
                    }
                } finally {
                }
            }
        }
    }
}
