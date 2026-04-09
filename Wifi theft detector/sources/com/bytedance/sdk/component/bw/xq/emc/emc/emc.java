package com.bytedance.sdk.component.bw.xq.emc.emc;

import android.util.Log;
import com.bytedance.sdk.component.utils.ru;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class emc implements Closeable {
    static final Pattern emc = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream xq = new OutputStream() { // from class: com.bytedance.sdk.component.bw.xq.emc.emc.emc.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };
    private final File bw;
    private final File dg;
    private final int msw;
    private int qh;
    private final int ru;
    private Writer sup;
    private final File uym;
    private final File ycc;
    final ExecutorService ypw;
    private long zz;
    private long gbl = 0;
    private final LinkedHashMap<String, ypw> sz = new LinkedHashMap<>(0, 0.75f, true);
    private long cf = -1;
    private long vk = 0;

    /* renamed from: aa, reason: collision with root package name */
    private final Callable<Void> f9235aa = new Callable<Void>() { // from class: com.bytedance.sdk.component.bw.xq.emc.emc.emc.1
        @Override // java.util.concurrent.Callable
        /* renamed from: emc, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (emc.this) {
                try {
                    if (emc.this.sup == null) {
                        return null;
                    }
                    emc.this.msw();
                    if (emc.this.ycc()) {
                        emc.this.bw();
                        emc.this.qh = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: com.bytedance.sdk.component.bw.xq.emc.emc.emc$emc, reason: collision with other inner class name */
    public final class C0116emc {
        private boolean bw;
        private boolean dg;
        private final boolean[] xq;
        private final ypw ypw;

        /* renamed from: com.bytedance.sdk.component.bw.xq.emc.emc.emc$emc$emc, reason: collision with other inner class name */
        public class C0117emc extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0116emc.this.dg = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0116emc.this.dg = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0116emc.this.dg = true;
                }
            }

            private C0117emc(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0116emc.this.dg = true;
                }
            }
        }

        private C0116emc(ypw ypwVar) {
            this.ypw = ypwVar;
            this.xq = ypwVar.dg ? null : new boolean[emc.this.ru];
        }

        public void ypw() throws IOException {
            emc.this.emc(this, false);
        }

        public OutputStream emc(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0117emc c0117emc;
            if (i10 < 0 || i10 >= emc.this.ru) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + emc.this.ru);
            }
            synchronized (emc.this) {
                try {
                    if (this.ypw.bw == this) {
                        if (!this.ypw.dg) {
                            this.xq[i10] = true;
                        }
                        File fileYpw = this.ypw.ypw(i10);
                        try {
                            fileOutputStream = new FileOutputStream(fileYpw);
                        } catch (FileNotFoundException unused) {
                            emc.this.dg.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(fileYpw);
                            } catch (FileNotFoundException unused2) {
                                return emc.xq;
                            }
                        }
                        c0117emc = new C0117emc(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0117emc;
        }

        public void emc() throws IOException {
            if (this.dg) {
                emc.this.emc(this, false);
                emc.this.xq(this.ypw.ypw);
            } else {
                emc.this.emc(this, true);
            }
            this.bw = true;
        }
    }

    public final class xq implements Closeable {
        private final long[] bw;
        private final InputStream[] dg;
        private final long xq;
        private final String ypw;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            for (InputStream inputStream : this.dg) {
                ru.emc(inputStream);
            }
        }

        public InputStream emc(int i10) {
            return this.dg[i10];
        }

        private xq(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.ypw = str;
            this.xq = j10;
            this.dg = inputStreamArr;
            this.bw = jArr;
        }
    }

    public final class ypw {
        private C0116emc bw;
        private boolean dg;
        private final long[] xq;
        private long ycc;
        private final String ypw;

        private ypw(String str) {
            this.ypw = str;
            this.xq = new long[emc.this.ru];
        }

        private IOException ypw(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File ypw(int i10) {
            return new File(emc.this.dg, this.ypw + "." + i10 + ".tmp");
        }

        public String emc() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.xq) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void emc(String[] strArr) throws IOException {
            if (strArr.length == emc.this.ru) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.xq[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw ypw(strArr);
                    }
                }
                return;
            }
            throw ypw(strArr);
        }

        public File emc(int i10) {
            return new File(emc.this.dg, this.ypw + "." + i10);
        }
    }

    private emc(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.dg = file;
        this.msw = i10;
        this.bw = new File(file, "journal");
        this.ycc = new File(file, "journal.tmp");
        this.uym = new File(file, "journal.bkp");
        this.ru = i11;
        this.zz = j10;
        this.ypw = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void msw() throws IOException {
        long j10 = this.zz;
        long j11 = this.cf;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.gbl > j10) {
            xq(this.sz.entrySet().iterator().next().getKey());
        }
        this.cf = -1L;
    }

    private void uym() {
        if (this.sup == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.sup == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.sz.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ypw ypwVar = (ypw) obj;
                if (ypwVar.bw != null) {
                    ypwVar.bw.ypw();
                }
            }
            msw();
            this.sup.close();
            this.sup = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bw() throws IOException {
        try {
            Writer writer = this.sup;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.ycc), dg.emc));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.msw));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.ru));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (ypw ypwVar : this.sz.values()) {
                    if (ypwVar.bw != null) {
                        bufferedWriter.write("DIRTY " + ypwVar.ypw + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + ypwVar.ypw + ypwVar.emc() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.bw.exists()) {
                    emc(this.bw, this.uym, true);
                }
                emc(this.ycc, this.bw, false);
                this.uym.delete();
                this.sup = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.bw, true), dg.emc));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void dg(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.sz.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        ypw ypwVar = this.sz.get(strSubstring);
        if (ypwVar == null) {
            ypwVar = new ypw(strSubstring);
            this.sz.put(strSubstring, ypwVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            ypwVar.dg = true;
            ypwVar.bw = null;
            ypwVar.emc(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            ypwVar.bw = new C0116emc(ypwVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    private void xq() throws IOException {
        com.bytedance.sdk.component.bw.xq.emc.emc.xq xqVar = new com.bytedance.sdk.component.bw.xq.emc.emc.xq(new FileInputStream(this.bw), dg.emc);
        try {
            String strEmc = xqVar.emc();
            String strEmc2 = xqVar.emc();
            String strEmc3 = xqVar.emc();
            String strEmc4 = xqVar.emc();
            String strEmc5 = xqVar.emc();
            if (!"libcore.io.DiskLruCache".equals(strEmc) || !"1".equals(strEmc2) || !Integer.toString(this.msw).equals(strEmc3) || !Integer.toString(this.ru).equals(strEmc4) || !"".equals(strEmc5)) {
                throw new IOException("unexpected journal header: [" + strEmc + ", " + strEmc2 + ", " + strEmc4 + ", " + strEmc5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    dg(xqVar.emc());
                    i10++;
                } catch (EOFException unused) {
                    this.qh = i10 - this.sz.size();
                    if (xqVar.ypw()) {
                        bw();
                    } else {
                        this.sup = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.bw, true), dg.emc));
                    }
                    ru.emc(xqVar);
                    return;
                }
            }
        } catch (Throwable th) {
            ru.emc(xqVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ycc() {
        int i10 = this.qh;
        return i10 >= 2000 && i10 >= this.sz.size();
    }

    public C0116emc ypw(String str) throws IOException {
        return emc(str, -1L);
    }

    public void ypw() throws IOException {
        close();
        dg.emc(this.dg);
    }

    public static emc emc(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    emc(file2, file3, false);
                }
            }
            emc emcVar = new emc(file, i10, i11, j10, executorService);
            if (emcVar.bw.exists()) {
                try {
                    emcVar.xq();
                    emcVar.dg();
                    return emcVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    emcVar.ypw();
                }
            }
            file.mkdirs();
            emc emcVar2 = new emc(file, i10, i11, j10, executorService);
            emcVar2.bw();
            return emcVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean xq(String str) throws IOException {
        try {
            uym();
            bw(str);
            ypw ypwVar = this.sz.get(str);
            if (ypwVar != null && ypwVar.bw == null) {
                for (int i10 = 0; i10 < this.ru; i10++) {
                    File fileEmc = ypwVar.emc(i10);
                    if (fileEmc.exists() && !fileEmc.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileEmc)));
                    }
                    this.gbl -= ypwVar.xq[i10];
                    ypwVar.xq[i10] = 0;
                }
                this.qh++;
                this.sup.append((CharSequence) ("REMOVE " + str + '\n'));
                this.sz.remove(str);
                if (ycc()) {
                    this.ypw.submit(this.f9235aa);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private void dg() throws IOException {
        emc(this.ycc);
        Iterator<ypw> it = this.sz.values().iterator();
        while (it.hasNext()) {
            ypw next = it.next();
            int i10 = 0;
            if (next.bw != null) {
                next.bw = null;
                while (i10 < this.ru) {
                    emc(next.emc(i10));
                    emc(next.ypw(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.ru) {
                    this.gbl += next.xq[i10];
                    i10++;
                }
            }
        }
    }

    private static void emc(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void emc(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            emc(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void bw(String str) {
        if (emc.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:43|16|17)|45|14) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r12 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized com.bytedance.sdk.component.bw.xq.emc.emc.emc.xq emc(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.uym()     // Catch: java.lang.Throwable -> L7a
            r11.bw(r12)     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedHashMap<java.lang.String, com.bytedance.sdk.component.bw.xq.emc.emc.emc$ypw> r0 = r11.sz     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L7a
            com.bytedance.sdk.component.bw.xq.emc.emc.emc$ypw r0 = (com.bytedance.sdk.component.bw.xq.emc.emc.emc.ypw) r0     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            if (r0 != 0) goto L14
            monitor-exit(r11)
            return r1
        L14:
            boolean r2 = com.bytedance.sdk.component.bw.xq.emc.emc.emc.ypw.dg(r0)     // Catch: java.lang.Throwable -> L7a
            if (r2 != 0) goto L1c
            monitor-exit(r11)
            return r1
        L1c:
            int r2 = r11.ru     // Catch: java.lang.Throwable -> L7a
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch: java.lang.Throwable -> L7a
            r2 = 0
            r3 = r2
        L22:
            int r4 = r11.ru     // Catch: java.io.FileNotFoundException -> L38 java.lang.Throwable -> L7a
            if (r3 >= r4) goto L3a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            java.io.File r5 = r0.emc(r3)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            r8[r3] = r4     // Catch: java.lang.Throwable -> L34 java.io.FileNotFoundException -> L38
            int r3 = r3 + 1
            goto L22
        L34:
            r0 = move-exception
            r12 = r0
            r4 = r11
            goto L8d
        L38:
            r4 = r11
            goto L7d
        L3a:
            int r1 = r11.qh     // Catch: java.lang.Throwable -> L7a
            int r1 = r1 + 1
            r11.qh = r1     // Catch: java.lang.Throwable -> L7a
            java.io.Writer r1 = r11.sup     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7a
            r2.append(r12)     // Catch: java.lang.Throwable -> L7a
            r3 = 10
            r2.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L7a
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            boolean r1 = r11.ycc()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L65
            java.util.concurrent.ExecutorService r1 = r11.ypw     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f9235aa     // Catch: java.lang.Throwable -> L34
            r1.submit(r2)     // Catch: java.lang.Throwable -> L34
        L65:
            com.bytedance.sdk.component.bw.xq.emc.emc.emc$xq r3 = new com.bytedance.sdk.component.bw.xq.emc.emc.emc$xq     // Catch: java.lang.Throwable -> L7a
            long r6 = com.bytedance.sdk.component.bw.xq.emc.emc.emc.ypw.bw(r0)     // Catch: java.lang.Throwable -> L7a
            long[] r9 = com.bytedance.sdk.component.bw.xq.emc.emc.emc.ypw.ypw(r0)     // Catch: java.lang.Throwable -> L7a
            r10 = 0
            r4 = r11
            r5 = r12
            r3.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r11)
            return r3
        L77:
            r0 = move-exception
        L78:
            r12 = r0
            goto L8d
        L7a:
            r0 = move-exception
            r4 = r11
            goto L78
        L7d:
            int r12 = r4.ru     // Catch: java.lang.Throwable -> L77
            if (r2 >= r12) goto L8b
            r12 = r8[r2]     // Catch: java.lang.Throwable -> L77
            if (r12 == 0) goto L8b
            com.bytedance.sdk.component.utils.ru.emc(r12)     // Catch: java.lang.Throwable -> L77
            int r2 = r2 + 1
            goto L7d
        L8b:
            monitor-exit(r11)
            return r1
        L8d:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L77
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.bw.xq.emc.emc.emc.emc(java.lang.String):com.bytedance.sdk.component.bw.xq.emc.emc.emc$xq");
    }

    private synchronized C0116emc emc(String str, long j10) throws IOException {
        uym();
        bw(str);
        ypw ypwVar = this.sz.get(str);
        if (j10 != -1 && (ypwVar == null || ypwVar.ycc != j10)) {
            return null;
        }
        if (ypwVar != null) {
            if (ypwVar.bw != null) {
                return null;
            }
        } else {
            ypwVar = new ypw(str);
            this.sz.put(str, ypwVar);
        }
        C0116emc c0116emc = new C0116emc(ypwVar);
        ypwVar.bw = c0116emc;
        this.sup.write("DIRTY " + str + '\n');
        this.sup.flush();
        return c0116emc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void emc(C0116emc c0116emc, boolean z10) throws IOException {
        ypw ypwVar = c0116emc.ypw;
        if (ypwVar.bw == c0116emc) {
            if (z10 && !ypwVar.dg) {
                for (int i10 = 0; i10 < this.ru; i10++) {
                    if (c0116emc.xq[i10]) {
                        if (!ypwVar.ypw(i10).exists()) {
                            c0116emc.ypw();
                            return;
                        }
                    } else {
                        c0116emc.ypw();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.ru; i11++) {
                File fileYpw = ypwVar.ypw(i11);
                if (z10) {
                    if (fileYpw.exists()) {
                        File fileEmc = ypwVar.emc(i11);
                        fileYpw.renameTo(fileEmc);
                        long j10 = ypwVar.xq[i11];
                        long length = fileEmc.length();
                        ypwVar.xq[i11] = length;
                        this.gbl = (this.gbl - j10) + length;
                    }
                } else {
                    emc(fileYpw);
                }
            }
            this.qh++;
            ypwVar.bw = null;
            if (!(ypwVar.dg | z10)) {
                this.sz.remove(ypwVar.ypw);
                this.sup.write("REMOVE " + ypwVar.ypw + '\n');
            } else {
                ypwVar.dg = true;
                this.sup.write("CLEAN " + ypwVar.ypw + ypwVar.emc() + '\n');
                if (z10) {
                    long j11 = this.vk;
                    this.vk = 1 + j11;
                    ypwVar.ycc = j11;
                }
            }
            this.sup.flush();
            if (this.gbl > this.zz || ycc()) {
                this.ypw.submit(this.f9235aa);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void emc() throws IOException {
        uym();
        msw();
        this.sup.flush();
    }
}
