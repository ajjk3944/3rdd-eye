package com.google.android.gms.internal.ads;

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

/* loaded from: classes.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public long f9953a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9954b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f9955c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9956d;

    public N4(long j6, String str, String str2, int i) {
        this.f9953a = j6;
        this.f9955c = str;
        this.f9956d = str2;
        this.f9954b = i;
    }

    public static byte[] f(L4 l42, long j6) throws IOException {
        long j7 = l42.f9617b - l42.f9618c;
        if (j6 >= 0 && j6 <= j7) {
            int i = (int) j6;
            if (i == j6) {
                byte[] bArr = new byte[i];
                new DataInputStream(l42).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 33 + String.valueOf(j7).length());
        A.f.v(sb, "streamToBytes length=", j6, ", maxLength=");
        sb.append(j7);
        throw new IOException(sb.toString());
    }

    public static void g(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static int h(L4 l42) {
        return (n(l42) << 24) | n(l42) | (n(l42) << 8) | (n(l42) << 16);
    }

    public static void i(BufferedOutputStream bufferedOutputStream, long j6) throws IOException {
        bufferedOutputStream.write((byte) j6);
        bufferedOutputStream.write((byte) (j6 >>> 8));
        bufferedOutputStream.write((byte) (j6 >>> 16));
        bufferedOutputStream.write((byte) (j6 >>> 24));
        bufferedOutputStream.write((byte) (j6 >>> 32));
        bufferedOutputStream.write((byte) (j6 >>> 40));
        bufferedOutputStream.write((byte) (j6 >>> 48));
        bufferedOutputStream.write((byte) (j6 >>> 56));
    }

    public static long j(L4 l42) {
        return (n(l42) & 255) | ((n(l42) & 255) << 8) | ((n(l42) & 255) << 16) | ((n(l42) & 255) << 24) | ((n(l42) & 255) << 32) | ((n(l42) & 255) << 40) | ((n(l42) & 255) << 48) | ((n(l42) & 255) << 56);
    }

    public static void k(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String l(L4 l42) {
        return new String(f(l42, j(l42)), "UTF-8");
    }

    public static int n(L4 l42) throws IOException {
        int i = l42.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized C1834s4 a(String str) {
        K4 k42 = (K4) ((LinkedHashMap) this.f9955c).get(str);
        if (k42 == null) {
            return null;
        }
        File fileE = e(str);
        try {
            L4 l42 = new L4(new BufferedInputStream(new FileInputStream(fileE)), fileE.length());
            try {
                String str2 = K4.a(l42).f9441b;
                if (!TextUtils.equals(str, str2)) {
                    I4.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, str2);
                    K4 k43 = (K4) ((LinkedHashMap) this.f9955c).remove(str);
                    if (k43 != null) {
                        this.f9953a -= k43.f9440a;
                    }
                    return null;
                }
                byte[] bArrF = f(l42, l42.f9617b - l42.f9618c);
                C1834s4 c1834s4 = new C1834s4();
                c1834s4.f16671a = bArrF;
                c1834s4.f16672b = k42.f9442c;
                c1834s4.f16673c = k42.f9443d;
                c1834s4.f16674d = k42.f9444e;
                c1834s4.f16675e = k42.f9445f;
                c1834s4.f16676f = k42.f9446g;
                List<C2050w4> list = k42.f9447h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C2050w4 c2050w4 : list) {
                    treeMap.put(c2050w4.f17404a, c2050w4.f17405b);
                }
                c1834s4.f16677g = treeMap;
                c1834s4.f16678h = Collections.unmodifiableList(list);
                return c1834s4;
            } finally {
                l42.close();
            }
        } catch (IOException e6) {
            I4.b("%s: %s", fileE.getAbsolutePath(), e6.toString());
            d(str);
            return null;
        }
    }

    public synchronized void b(String str, C1834s4 c1834s4) {
        int i;
        int i3;
        long j6;
        char c6;
        float f2;
        try {
            long j7 = this.f9953a;
            int length = c1834s4.f16671a.length;
            long j8 = j7 + length;
            int i6 = this.f9954b;
            float f5 = 0.9f;
            if (j8 <= i6 || length <= i6 * 0.9f) {
                File fileE = e(str);
                int i7 = 0;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                    K4 k42 = new K4(str, c1834s4);
                    try {
                        try {
                            g(bufferedOutputStream, 538247942);
                            k(bufferedOutputStream, str);
                            String str2 = k42.f9442c;
                            if (str2 == null) {
                                str2 = "";
                            }
                            k(bufferedOutputStream, str2);
                            i(bufferedOutputStream, k42.f9443d);
                            i(bufferedOutputStream, k42.f9444e);
                            i(bufferedOutputStream, k42.f9445f);
                            i(bufferedOutputStream, k42.f9446g);
                            List<C2050w4> list = k42.f9447h;
                            if (list != null) {
                                g(bufferedOutputStream, list.size());
                                for (C2050w4 c2050w4 : list) {
                                    k(bufferedOutputStream, c2050w4.f17404a);
                                    k(bufferedOutputStream, c2050w4.f17405b);
                                }
                            } else {
                                g(bufferedOutputStream, 0);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.write(c1834s4.f16671a);
                            bufferedOutputStream.close();
                            k42.f9440a = fileE.length();
                            m(str, k42);
                            long j9 = this.f9953a;
                            int i8 = this.f9954b;
                            if (j9 >= i8) {
                                boolean z6 = I4.f9068a;
                                if (z6) {
                                    I4.a("Pruning old cache entries.", new Object[0]);
                                }
                                long j10 = this.f9953a;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    Iterator it = ((LinkedHashMap) this.f9955c).entrySet().iterator();
                                    int i9 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i3 = i7;
                                            j6 = j10;
                                            c6 = 1;
                                            break;
                                        }
                                        K4 k43 = (K4) ((Map.Entry) it.next()).getValue();
                                        String str3 = k43.f9441b;
                                        if (e(str3).delete()) {
                                            i3 = i7;
                                            j6 = j10;
                                            f2 = f5;
                                            c6 = 1;
                                            this.f9953a -= k43.f9440a;
                                        } else {
                                            f2 = f5;
                                            i3 = i7;
                                            j6 = j10;
                                            c6 = 1;
                                            String strO = o(str3);
                                            Object[] objArr = new Object[2];
                                            objArr[i3] = str3;
                                            objArr[1] = strO;
                                            I4.b("Could not delete cache entry for key=%s, filename=%s", objArr);
                                        }
                                        it.remove();
                                        i9++;
                                        if (this.f9953a < i8 * f2) {
                                            break;
                                        }
                                        j10 = j6;
                                        i7 = i3;
                                        f5 = f2;
                                    }
                                    if (z6) {
                                        Integer numValueOf = Integer.valueOf(i9);
                                        Long lValueOf = Long.valueOf(this.f9953a - j6);
                                        Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                        Object[] objArr2 = new Object[3];
                                        objArr2[i3] = numValueOf;
                                        objArr2[c6] = lValueOf;
                                        objArr2[2] = lValueOf2;
                                        I4.a("pruned %d files, %d bytes, %d ms", objArr2);
                                    }
                                } catch (IOException unused) {
                                    i = 0;
                                    if (!fileE.delete()) {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[i] = fileE.getAbsolutePath();
                                        I4.b("Could not clean up file %s", objArr3);
                                    }
                                    if (!((M4) this.f9956d).a().exists()) {
                                        I4.b("Re-initializing cache after external clearing.", new Object[i]);
                                        ((LinkedHashMap) this.f9955c).clear();
                                        this.f9953a = 0L;
                                        c();
                                    }
                                }
                            }
                        } catch (IOException e6) {
                            I4.b("%s", e6.toString());
                            bufferedOutputStream.close();
                            I4.b("Failed to write header for %s", fileE.getAbsolutePath());
                            throw new IOException();
                        }
                    } catch (IOException unused2) {
                    }
                } catch (IOException unused3) {
                    i = i7;
                }
            }
        } finally {
        }
    }

    public synchronized void c() {
        File fileA = ((M4) this.f9956d).a();
        if (fileA.exists()) {
            File[] fileArrListFiles = fileA.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        L4 l42 = new L4(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            K4 k4A = K4.a(l42);
                            k4A.f9440a = length;
                            m(k4A.f9441b, k4A);
                            l42.close();
                        } catch (Throwable th) {
                            l42.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileA.mkdirs()) {
            I4.c("Unable to create cache dir %s", fileA.getAbsolutePath());
        }
    }

    public synchronized void d(String str) {
        boolean zDelete = e(str).delete();
        K4 k42 = (K4) ((LinkedHashMap) this.f9955c).remove(str);
        if (k42 != null) {
            this.f9953a -= k42.f9440a;
        }
        if (zDelete) {
            return;
        }
        I4.b("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public File e(String str) {
        return new File(((M4) this.f9956d).a(), o(str));
    }

    public void m(String str, K4 k42) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f9955c;
        if (linkedHashMap.containsKey(str)) {
            this.f9953a = (k42.f9440a - ((K4) linkedHashMap.get(str)).f9440a) + this.f9953a;
        } else {
            this.f9953a += k42.f9440a;
        }
        linkedHashMap.put(str, k42);
    }

    public N4(C0889ae c0889ae) {
        this.f9955c = new LinkedHashMap(16, 0.75f, true);
        this.f9953a = 0L;
        this.f9956d = c0889ae;
        this.f9954b = 5242880;
    }

    public N4(File file) {
        this.f9955c = new LinkedHashMap(16, 0.75f, true);
        this.f9953a = 0L;
        this.f9956d = new C1283hr(this, 5, file);
        this.f9954b = 20971520;
    }
}
