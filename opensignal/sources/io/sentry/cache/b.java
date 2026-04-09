package io.sentry.cache;

import hf.g;
import io.sentry.b5;
import io.sentry.g1;
import io.sentry.i6;
import io.sentry.q;
import io.sentry.r4;
import io.sentry.x5;
import ir.f0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b implements c {
    public static final Charset E = Charset.forName("UTF-8");
    public final io.sentry.util.a B;
    public final io.sentry.util.a D;

    /* renamed from: a, reason: collision with root package name */
    public final x5 f12122a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.e f12123d = new io.sentry.util.e(new io.sentry.android.replay.capture.e(2, this));

    /* renamed from: g, reason: collision with root package name */
    public final File f12124g;

    /* renamed from: r, reason: collision with root package name */
    public final int f12125r;

    /* renamed from: x, reason: collision with root package name */
    public final CountDownLatch f12126x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakHashMap f12127y;

    public b(x5 x5Var, String str, int i10) {
        f0.T(x5Var, "SentryOptions is required.");
        this.f12122a = x5Var;
        this.f12124g = new File(str);
        this.f12125r = i10;
        this.f12127y = new WeakHashMap();
        this.B = new io.sentry.util.a();
        this.D = new io.sentry.util.a();
        this.f12126x = new CountDownLatch(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[PHI: r3 r5 r7
  0x0057: PHI (r3v23 java.io.File[]) = 
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v22 java.io.File[])
  (r3v26 java.io.File[])
 binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:32:0x00a3, B:35:0x00a8, B:37:0x00ae, B:285:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r5v21 io.sentry.util.e) = 
  (r5v20 io.sentry.util.e)
  (r5v20 io.sentry.util.e)
  (r5v20 io.sentry.util.e)
  (r5v20 io.sentry.util.e)
  (r5v20 io.sentry.util.e)
  (r5v20 io.sentry.util.e)
  (r5v23 io.sentry.util.e)
 binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:32:0x00a3, B:35:0x00a8, B:37:0x00ae, B:285:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r7v4 io.sentry.x5) = 
  (r7v3 io.sentry.x5)
  (r7v3 io.sentry.x5)
  (r7v3 io.sentry.x5)
  (r7v3 io.sentry.x5)
  (r7v3 io.sentry.x5)
  (r7v3 io.sentry.x5)
  (r7v6 io.sentry.x5)
 binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:32:0x00a3, B:35:0x00a8, B:37:0x00ae, B:285:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    @Override // io.sentry.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean R(i4.b r23, io.sentry.h0 r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.b.R(i4.b, io.sentry.h0):boolean");
    }

    public final File[] a() {
        File file = this.f12124g;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new g(2));
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f12122a.getLogger().m(b5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(i4.b bVar) {
        String str;
        WeakHashMap weakHashMap = this.f12127y;
        q qVarA = this.B.a();
        try {
            if (weakHashMap.containsKey(bVar)) {
                str = (String) weakHashMap.get(bVar);
            } else {
                String strConcat = io.sentry.config.a.R().concat(".envelope");
                weakHashMap.put(bVar, strConcat);
                str = strConcat;
            }
            File file = new File(this.f12124g.getAbsolutePath(), str);
            qVarA.close();
            return file;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c(File file, File file2) {
        q qVarA = this.D.a();
        try {
            boolean zExists = file2.exists();
            x5 x5Var = this.f12122a;
            if (zExists) {
                x5Var.getLogger().m(b5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    x5Var.getLogger().m(b5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                x5Var.getLogger().m(b5.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        x5Var.getLogger().m(b5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th2) {
                    x5Var.getLogger().g(b5.ERROR, "Error moving current session to previous session.", th2);
                }
            }
            qVarA.close();
        } catch (Throwable th3) {
            try {
                qVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final i4.b d(File file) throws IOException {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                i4.b bVarC = ((g1) this.f12123d.a()).c(bufferedInputStream);
                bufferedInputStream.close();
                return bVarC;
            } finally {
            }
        } catch (IOException e4) {
            this.f12122a.getLogger().g(b5.ERROR, "Failed to deserialize the envelope.", e4);
            return null;
        }
    }

    public final i6 e(r4 r4Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4Var.f()), E));
            try {
                i6 i6Var = (i6) ((g1) this.f12123d.a()).b(bufferedReader, i6.class);
                bufferedReader.close();
                return i6Var;
            } finally {
            }
        } catch (Throwable th2) {
            this.f12122a.getLogger().g(b5.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    public final boolean g() {
        x5 x5Var = this.f12122a;
        try {
            return this.f12126x.await(x5Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            x5Var.getLogger().m(b5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() throws IOException {
        x5 x5Var = this.f12122a;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((g1) this.f12123d.a()).c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                x5Var.getLogger().m(b5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e4) {
                x5Var.getLogger().g(b5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e4);
            }
        }
        return arrayList.iterator();
    }

    public final void j(File file, i6 i6Var) {
        String str = i6Var.f12328x;
        x5 x5Var = this.f12122a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, E));
                try {
                    x5Var.getLogger().m(b5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((g1) this.f12123d.a()).e(i6Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            x5Var.getLogger().f(b5.ERROR, th2, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // io.sentry.cache.c
    public final void q(i4.b bVar) {
        f0.T(bVar, "Envelope is required.");
        File fileB = b(bVar);
        boolean zDelete = fileB.delete();
        x5 x5Var = this.f12122a;
        if (zDelete) {
            x5Var.getLogger().m(b5.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            x5Var.getLogger().m(b5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }
}
