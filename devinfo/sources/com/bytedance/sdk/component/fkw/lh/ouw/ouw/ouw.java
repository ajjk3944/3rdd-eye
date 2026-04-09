package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import android.util.Log;
import com.bytedance.sdk.component.utils.tlj;
import d.h;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements Closeable {
    private long bly;
    private final File fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f7475jg;

    /* renamed from: le, reason: collision with root package name */
    private final File f7476le;
    private final File ra;
    private Writer ryl;
    final ExecutorService vt;
    private final File yu;
    static final Pattern ouw = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: lh, reason: collision with root package name */
    public static final OutputStream f7473lh = new OutputStream() { // from class: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw.2
        @Override // java.io.OutputStream
        public final void write(int i4) throws IOException {
        }
    };

    /* renamed from: cf, reason: collision with root package name */
    private long f7474cf = 0;
    private final LinkedHashMap<String, vt> mwh = new LinkedHashMap<>(0, 0.75f, true);
    private long ko = -1;
    private long rn = 0;
    private final Callable<Void> zih = new Callable<Void>() { // from class: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (ouw.this) {
                try {
                    if (ouw.this.ryl == null) {
                        return null;
                    }
                    ouw.this.ra();
                    if (ouw.this.fkw()) {
                        ouw.this.yu();
                        ouw.fkw(ouw.this);
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };
    private final int pno = 20210302;
    private final int tlj = 1;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public final class lh implements Closeable {
        private final long[] fkw;

        /* renamed from: lh, reason: collision with root package name */
        private final String f7477lh;
        final InputStream[] ouw;
        private final long yu;

        public /* synthetic */ lh(ouw ouwVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b10) {
            this(str, j, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            for (InputStream inputStream : this.ouw) {
                tlj.ouw(inputStream);
            }
        }

        private lh(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f7477lh = str;
            this.yu = j;
            this.ouw = inputStreamArr;
            this.fkw = jArr;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw$ouw, reason: collision with other inner class name */
    public final class C0050ouw {

        /* renamed from: lh, reason: collision with root package name */
        boolean f7478lh;
        final vt ouw;
        final boolean[] vt;
        boolean yu;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw$ouw$ouw, reason: collision with other inner class name */
        public class C0051ouw extends FilterOutputStream {
            public /* synthetic */ C0051ouw(C0050ouw c0050ouw, OutputStream outputStream, byte b10) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0050ouw.this.f7478lh = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() throws IOException {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0050ouw.this.f7478lh = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i4) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(i4);
                } catch (IOException unused) {
                    C0050ouw.this.f7478lh = true;
                }
            }

            private C0051ouw(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i4, int i10) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i4, i10);
                } catch (IOException unused) {
                    C0050ouw.this.f7478lh = true;
                }
            }
        }

        public /* synthetic */ C0050ouw(ouw ouwVar, vt vtVar, byte b10) {
            this(vtVar);
        }

        public final OutputStream ouw() throws IOException {
            FileOutputStream fileOutputStream;
            C0051ouw c0051ouw;
            if (ouw.this.tlj <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + ouw.this.tlj);
            }
            synchronized (ouw.this) {
                try {
                    vt vtVar = this.ouw;
                    if (vtVar.yu != this) {
                        throw new IllegalStateException();
                    }
                    byte b10 = 0;
                    if (!vtVar.f7480lh) {
                        this.vt[0] = true;
                    }
                    File fileVt = vtVar.vt(0);
                    try {
                        fileOutputStream = new FileOutputStream(fileVt);
                    } catch (FileNotFoundException unused) {
                        ouw.this.yu.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(fileVt);
                        } catch (FileNotFoundException unused2) {
                            return ouw.f7473lh;
                        }
                    }
                    c0051ouw = new C0051ouw(this, fileOutputStream, b10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c0051ouw;
        }

        public final void vt() throws IOException {
            ouw.this.ouw(this, false);
        }

        private C0050ouw(vt vtVar) {
            this.ouw = vtVar;
            this.vt = vtVar.f7480lh ? null : new boolean[ouw.this.tlj];
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public final class vt {
        long fkw;

        /* renamed from: lh, reason: collision with root package name */
        boolean f7480lh;
        final String ouw;
        final long[] vt;
        C0050ouw yu;

        public /* synthetic */ vt(ouw ouwVar, String str, byte b10) {
            this(str);
        }

        private static IOException vt(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final String ouw() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j : this.vt) {
                sb2.append(' ');
                sb2.append(j);
            }
            return sb2.toString();
        }

        private vt(String str) {
            this.ouw = str;
            this.vt = new long[ouw.this.tlj];
        }

        public final File vt(int i4) {
            return new File(ouw.this.yu, this.ouw + "." + i4 + ".tmp");
        }

        public final void ouw(String[] strArr) throws IOException {
            if (strArr.length == ouw.this.tlj) {
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    try {
                        this.vt[i4] = Long.parseLong(strArr[i4]);
                    } catch (NumberFormatException unused) {
                        throw vt(strArr);
                    }
                }
                return;
            }
            throw vt(strArr);
        }

        public final File ouw(int i4) {
            return new File(ouw.this.yu, this.ouw + "." + i4);
        }
    }

    private ouw(File file, long j, ExecutorService executorService) {
        this.yu = file;
        this.fkw = new File(file, "journal");
        this.f7476le = new File(file, "journal.tmp");
        this.ra = new File(file, "journal.bkp");
        this.bly = j;
        this.vt = executorService;
    }

    public static /* synthetic */ int fkw(ouw ouwVar) {
        ouwVar.f7475jg = 0;
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.ryl == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.mwh.values());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C0050ouw c0050ouw = ((vt) obj).yu;
                if (c0050ouw != null) {
                    c0050ouw.vt();
                }
            }
            ra();
            this.ryl.close();
            this.ryl = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fkw() {
        int i4 = this.f7475jg;
        return i4 >= 2000 && i4 >= this.mwh.size();
    }

    private void le() {
        if (this.ryl == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void lh() throws IOException {
        ouw(this.f7476le);
        Iterator<vt> it = this.mwh.values().iterator();
        while (it.hasNext()) {
            vt next = it.next();
            int i4 = 0;
            if (next.yu == null) {
                while (i4 < this.tlj) {
                    this.f7474cf += next.vt[i4];
                    i4++;
                }
            } else {
                next.yu = null;
                while (i4 < this.tlj) {
                    ouw(next.ouw(i4));
                    ouw(next.vt(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ra() throws IOException {
        long j = this.bly;
        long j8 = this.ko;
        if (j8 >= 0) {
            j = j8;
        }
        while (this.f7474cf > j) {
            lh(this.mwh.entrySet().iterator().next().getKey());
        }
        this.ko = -1L;
    }

    private void vt() throws IOException {
        String strOuw;
        String strSubstring;
        com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh lhVar = new com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh(new FileInputStream(this.fkw), yu.ouw);
        try {
            String strOuw2 = lhVar.ouw();
            String strOuw3 = lhVar.ouw();
            String strOuw4 = lhVar.ouw();
            String strOuw5 = lhVar.ouw();
            String strOuw6 = lhVar.ouw();
            if (!"libcore.io.DiskLruCache".equals(strOuw2) || !"1".equals(strOuw3) || !Integer.toString(this.pno).equals(strOuw4) || !Integer.toString(this.tlj).equals(strOuw5) || !"".equals(strOuw6)) {
                throw new IOException("unexpected journal header: [" + strOuw2 + ", " + strOuw3 + ", " + strOuw5 + ", " + strOuw6 + "]");
            }
            byte b10 = 0;
            int i4 = 0;
            while (true) {
                try {
                    strOuw = lhVar.ouw();
                    int iIndexOf = strOuw.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(strOuw));
                    }
                    int i10 = iIndexOf + 1;
                    int iIndexOf2 = strOuw.indexOf(32, i10);
                    if (iIndexOf2 == -1) {
                        strSubstring = strOuw.substring(i10);
                        if (iIndexOf == 6 && strOuw.startsWith("REMOVE")) {
                            this.mwh.remove(strSubstring);
                        }
                        i4++;
                    } else {
                        strSubstring = strOuw.substring(i10, iIndexOf2);
                    }
                    vt vtVar = this.mwh.get(strSubstring);
                    if (vtVar == null) {
                        vtVar = new vt(this, strSubstring, b10);
                        this.mwh.put(strSubstring, vtVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strOuw.startsWith("CLEAN")) {
                        String[] strArrSplit = strOuw.substring(iIndexOf2 + 1).split(" ");
                        vtVar.f7480lh = true;
                        vtVar.yu = null;
                        vtVar.ouw(strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strOuw.startsWith("DIRTY")) {
                        vtVar.yu = new C0050ouw(this, vtVar, b10);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strOuw.startsWith("READ")) {
                        break;
                    }
                    i4++;
                } catch (EOFException unused) {
                    this.f7475jg = i4 - this.mwh.size();
                    if (lhVar.vt == -1) {
                        yu();
                    } else {
                        this.ryl = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.fkw, true), yu.ouw));
                    }
                    tlj.ouw(lhVar);
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(strOuw));
        } catch (Throwable th2) {
            tlj.ouw(lhVar);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void yu() throws IOException {
        try {
            Writer writer = this.ryl;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7476le), yu.ouw));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.pno));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.tlj));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (vt vtVar : this.mwh.values()) {
                    if (vtVar.yu != null) {
                        bufferedWriter.write("DIRTY " + vtVar.ouw + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + vtVar.ouw + vtVar.ouw() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.fkw.exists()) {
                    ouw(this.fkw, this.ra, true);
                }
                ouw(this.f7476le, this.fkw, false);
                this.ra.delete();
                this.ryl = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.fkw, true), yu.ouw));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static ouw ouw(File file, long j, ExecutorService executorService) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    ouw(file2, file3, false);
                }
            }
            ouw ouwVar = new ouw(file, j, executorService);
            if (ouwVar.fkw.exists()) {
                try {
                    ouwVar.vt();
                    ouwVar.lh();
                    return ouwVar;
                } catch (IOException e2) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e2.getMessage() + ", removing");
                    ouwVar.close();
                    yu.ouw(ouwVar.yu);
                }
            }
            file.mkdirs();
            ouw ouwVar2 = new ouw(file, j, executorService);
            ouwVar2.yu();
            return ouwVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized boolean lh(String str) throws IOException {
        try {
            le();
            yu(str);
            vt vtVar = this.mwh.get(str);
            if (vtVar != null && vtVar.yu == null) {
                for (int i4 = 0; i4 < this.tlj; i4++) {
                    File fileOuw = vtVar.ouw(i4);
                    if (fileOuw.exists() && !fileOuw.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileOuw)));
                    }
                    long j = this.f7474cf;
                    long[] jArr = vtVar.vt;
                    this.f7474cf = j - jArr[i4];
                    jArr[i4] = 0;
                }
                this.f7475jg++;
                this.ryl.append((CharSequence) ("REMOVE " + str + '\n'));
                this.mwh.remove(str);
                if (fkw()) {
                    this.vt.submit(this.zih);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private static void ouw(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void ouw(File file, File file2, boolean z3) throws IOException {
        if (z3) {
            ouw(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized lh ouw(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            try {
                le();
                yu(str);
                vt vtVar = this.mwh.get(str);
                if (vtVar == null) {
                    return null;
                }
                if (!vtVar.f7480lh) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.tlj];
                for (int i4 = 0; i4 < this.tlj; i4++) {
                    try {
                        try {
                            inputStreamArr[i4] = new FileInputStream(vtVar.ouw(i4));
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i10 = 0; i10 < this.tlj && (inputStream = inputStreamArr[i10]) != null; i10++) {
                            tlj.ouw(inputStream);
                        }
                        return null;
                    }
                }
                this.f7475jg++;
                this.ryl.append((CharSequence) ("READ " + str + '\n'));
                if (fkw()) {
                    this.vt.submit(this.zih);
                }
                return new lh(this, str, vtVar.fkw, inputStreamArr, vtVar.vt, (byte) 0);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private static void yu(String str) {
        if (!ouw.matcher(str).matches()) {
            throw new IllegalArgumentException(h.t("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized C0050ouw vt(String str) throws IOException {
        try {
            le();
            yu(str);
            vt vtVar = this.mwh.get(str);
            byte b10 = 0;
            if (vtVar == null) {
                vtVar = new vt(this, str, b10);
                this.mwh.put(str, vtVar);
            } else if (vtVar.yu != null) {
                return null;
            }
            C0050ouw c0050ouw = new C0050ouw(this, vtVar, b10);
            vtVar.yu = c0050ouw;
            this.ryl.write("DIRTY " + str + '\n');
            this.ryl.flush();
            return c0050ouw;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void ouw() throws IOException {
        le();
        ra();
        this.ryl.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(C0050ouw c0050ouw, boolean z3) throws IOException {
        vt vtVar = c0050ouw.ouw;
        if (vtVar.yu == c0050ouw) {
            if (z3 && !vtVar.f7480lh) {
                for (int i4 = 0; i4 < this.tlj; i4++) {
                    if (c0050ouw.vt[i4]) {
                        if (!vtVar.vt(i4).exists()) {
                            c0050ouw.vt();
                            return;
                        }
                    } else {
                        c0050ouw.vt();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i4)));
                    }
                }
            }
            for (int i10 = 0; i10 < this.tlj; i10++) {
                File fileVt = vtVar.vt(i10);
                if (z3) {
                    if (fileVt.exists()) {
                        File fileOuw = vtVar.ouw(i10);
                        fileVt.renameTo(fileOuw);
                        long j = vtVar.vt[i10];
                        long length = fileOuw.length();
                        vtVar.vt[i10] = length;
                        this.f7474cf = (this.f7474cf - j) + length;
                    }
                } else {
                    ouw(fileVt);
                }
            }
            this.f7475jg++;
            vtVar.yu = null;
            if (vtVar.f7480lh | z3) {
                vtVar.f7480lh = true;
                this.ryl.write("CLEAN " + vtVar.ouw + vtVar.ouw() + '\n');
                if (z3) {
                    long j8 = this.rn;
                    this.rn = 1 + j8;
                    vtVar.fkw = j8;
                }
            } else {
                this.mwh.remove(vtVar.ouw);
                this.ryl.write("REMOVE " + vtVar.ouw + '\n');
            }
            this.ryl.flush();
            if (this.f7474cf > this.bly || fkw()) {
                this.vt.submit(this.zih);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
