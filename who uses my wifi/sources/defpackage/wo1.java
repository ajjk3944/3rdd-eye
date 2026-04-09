package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wo1 {
    public long a;
    public final int b;
    public final Serializable c;
    public final Object d;

    public wo1(long j, String str, String str2, int i) {
        this.a = j;
        this.c = str;
        this.d = str2;
        this.b = i;
    }

    public static byte[] e(uo1 uo1Var, long j) throws IOException {
        long j2 = uo1Var.g - uo1Var.h;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(uo1Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(j2).length());
        ex0.p(sb, "streamToBytes length=", j, ", maxLength=");
        sb.append(j2);
        throw new IOException(sb.toString());
    }

    public static void f(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static int g(uo1 uo1Var) {
        return (m(uo1Var) << 24) | m(uo1Var) | (m(uo1Var) << 8) | (m(uo1Var) << 16);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static long i(uo1 uo1Var) {
        return (m(uo1Var) & 255) | ((m(uo1Var) & 255) << 8) | ((m(uo1Var) & 255) << 16) | ((m(uo1Var) & 255) << 24) | ((m(uo1Var) & 255) << 32) | ((m(uo1Var) & 255) << 40) | ((m(uo1Var) & 255) << 48) | ((m(uo1Var) & 255) << 56);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String k(uo1 uo1Var) {
        return new String(e(uo1Var, i(uo1Var)), "UTF-8");
    }

    public static int m(uo1 uo1Var) throws IOException {
        int i = uo1Var.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String n(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized ao1 a(String str) {
        to1 to1Var = (to1) ((LinkedHashMap) this.c).get(str);
        if (to1Var == null) {
            return null;
        }
        File fileD = d(str);
        try {
            uo1 uo1Var = new uo1(new BufferedInputStream(new FileInputStream(fileD)), fileD.length());
            try {
                String str2 = to1.a(uo1Var).b;
                if (!TextUtils.equals(str, str2)) {
                    ro1.c("%s: key=%s, found=%s", fileD.getAbsolutePath(), str, str2);
                    to1 to1Var2 = (to1) ((LinkedHashMap) this.c).remove(str);
                    if (to1Var2 != null) {
                        this.a -= to1Var2.a;
                    }
                    return null;
                }
                byte[] bArrE = e(uo1Var, uo1Var.g - uo1Var.h);
                ao1 ao1Var = new ao1();
                ao1Var.a = bArrE;
                ao1Var.b = to1Var.c;
                ao1Var.c = to1Var.d;
                ao1Var.d = to1Var.e;
                ao1Var.e = to1Var.f;
                ao1Var.f = to1Var.g;
                List<do1> list = to1Var.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (do1 do1Var : list) {
                    treeMap.put(do1Var.a, do1Var.b);
                }
                ao1Var.g = treeMap;
                ao1Var.h = Collections.unmodifiableList(list);
                return ao1Var;
            } finally {
                uo1Var.close();
            }
        } catch (IOException e) {
            ro1.c("%s: %s", fileD.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = d(str).delete();
                to1 to1Var3 = (to1) ((LinkedHashMap) this.c).remove(str);
                if (to1Var3 != null) {
                    this.a -= to1Var3.a;
                }
                if (!zDelete) {
                    ro1.c("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public synchronized void b(String str, ao1 ao1Var) {
        float f;
        try {
            long j = this.a;
            int length = ao1Var.a.length;
            long j2 = j + length;
            int i = this.b;
            float f2 = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File fileD = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileD));
                    to1 to1Var = new to1(str, ao1Var);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = to1Var.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, to1Var.d);
                        h(bufferedOutputStream, to1Var.e);
                        h(bufferedOutputStream, to1Var.f);
                        h(bufferedOutputStream, to1Var.g);
                        List<do1> list = to1Var.h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (do1 do1Var : list) {
                                j(bufferedOutputStream, do1Var.a);
                                j(bufferedOutputStream, do1Var.b);
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(ao1Var.a);
                        bufferedOutputStream.close();
                        to1Var.a = fileD.length();
                        l(str, to1Var);
                        long j3 = this.a;
                        int i2 = this.b;
                        if (j3 >= i2) {
                            boolean z = ro1.a;
                            if (z) {
                                ro1.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.a;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                to1 to1Var2 = (to1) ((Map.Entry) it.next()).getValue();
                                String str3 = to1Var2.b;
                                if (d(str3).delete()) {
                                    f = f2;
                                    this.a -= to1Var2.a;
                                } else {
                                    f = f2;
                                    ro1.c("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.a < i2 * f) {
                                    break;
                                } else {
                                    f2 = f;
                                }
                            }
                            if (z) {
                                ro1.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.a - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        ro1.c("%s", e.toString());
                        bufferedOutputStream.close();
                        ro1.c("Failed to write header for %s", fileD.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileD.delete()) {
                        ro1.c("Could not clean up file %s", fileD.getAbsolutePath());
                    }
                    if (!((vo1) this.d).a().exists()) {
                        ro1.c("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.c).clear();
                        this.a = 0L;
                        c();
                    }
                }
            }
        } finally {
        }
    }

    public synchronized void c() {
        File fileA = ((vo1) this.d).a();
        if (fileA.exists()) {
            File[] fileArrListFiles = fileA.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        uo1 uo1Var = new uo1(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            to1 to1VarA = to1.a(uo1Var);
                            to1VarA.a = length;
                            l(to1VarA.b, to1VarA);
                            uo1Var.close();
                        } catch (Throwable th) {
                            uo1Var.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileA.mkdirs()) {
            ro1.b("Unable to create cache dir %s", fileA.getAbsolutePath());
        }
    }

    public File d(String str) {
        return new File(((vo1) this.d).a(), n(str));
    }

    public void l(String str, to1 to1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            this.a = (to1Var.a - ((to1) linkedHashMap.get(str)).a) + this.a;
        } else {
            this.a += to1Var.a;
        }
        linkedHashMap.put(str, to1Var);
    }

    public wo1(gw3 gw3Var) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = gw3Var;
        this.b = 5242880;
    }

    public wo1(File file) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = new ug0(this, file, 11);
        this.b = 20971520;
    }
}
