package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sa {

    /* renamed from: a, reason: collision with root package name */
    public long f15934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15935b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f15936c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15937d;

    public sa(String str, String str2, int i4, long j) {
        this.f15934a = j;
        this.f15936c = str;
        this.f15937d = str2;
        this.f15935b = i4;
    }

    public static byte[] f(qa qaVar, long j) throws IOException {
        long j8 = qaVar.f15269b - qaVar.f15270c;
        if (j >= 0 && j <= j8) {
            int i4 = (int) j;
            if (i4 == j) {
                byte[] bArr = new byte[i4];
                new DataInputStream(qaVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(j8).length());
        a0.g.A(sb2, "streamToBytes length=", j, ", maxLength=");
        sb2.append(j8);
        throw new IOException(sb2.toString());
    }

    public static void g(BufferedOutputStream bufferedOutputStream, int i4) throws IOException {
        bufferedOutputStream.write(i4 & 255);
        bufferedOutputStream.write((i4 >> 8) & 255);
        bufferedOutputStream.write((i4 >> 16) & 255);
        bufferedOutputStream.write((i4 >> 24) & 255);
    }

    public static int h(qa qaVar) {
        return (n(qaVar) << 24) | n(qaVar) | (n(qaVar) << 8) | (n(qaVar) << 16);
    }

    public static void i(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static long j(qa qaVar) {
        return (n(qaVar) & 255) | ((n(qaVar) & 255) << 8) | ((n(qaVar) & 255) << 16) | ((n(qaVar) & 255) << 24) | ((n(qaVar) & 255) << 32) | ((n(qaVar) & 255) << 40) | ((n(qaVar) & 255) << 48) | ((n(qaVar) & 255) << 56);
    }

    public static void k(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        i(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String l(qa qaVar) {
        return new String(f(qaVar, j(qaVar)), "UTF-8");
    }

    public static int n(qa qaVar) throws IOException {
        int i4 = qaVar.read();
        if (i4 != -1) {
            return i4;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized x9 a(String str) {
        pa paVar = (pa) ((LinkedHashMap) this.f15936c).get(str);
        if (paVar == null) {
            return null;
        }
        File fileE = e(str);
        try {
            qa qaVar = new qa(new BufferedInputStream(new FileInputStream(fileE)), fileE.length());
            try {
                String str2 = pa.a(qaVar).f14936b;
                if (!TextUtils.equals(str, str2)) {
                    na.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, str2);
                    pa paVar2 = (pa) ((LinkedHashMap) this.f15936c).remove(str);
                    if (paVar2 != null) {
                        this.f15934a -= paVar2.f14935a;
                    }
                    return null;
                }
                byte[] bArrF = f(qaVar, qaVar.f15269b - qaVar.f15270c);
                x9 x9Var = new x9();
                x9Var.f18322a = bArrF;
                x9Var.f18323b = paVar.f14937c;
                x9Var.f18324c = paVar.f14938d;
                x9Var.f18325d = paVar.f14939e;
                x9Var.f18326e = paVar.f14940f;
                x9Var.f18327f = paVar.g;
                List<ba> list = paVar.f14941h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (ba baVar : list) {
                    treeMap.put(baVar.f9636a, baVar.f9637b);
                }
                x9Var.g = treeMap;
                x9Var.f18328h = DesugarCollections.unmodifiableList(list);
                return x9Var;
            } finally {
                qaVar.close();
            }
        } catch (IOException e2) {
            na.b("%s: %s", fileE.getAbsolutePath(), e2.toString());
            d(str);
            return null;
        }
    }

    public synchronized void b(String str, x9 x9Var) {
        int i4;
        int i10;
        long j;
        char c9;
        float f10;
        try {
            long j8 = this.f15934a;
            int length = x9Var.f18322a.length;
            long j9 = j8 + length;
            int i11 = this.f15935b;
            float f11 = 0.9f;
            if (j9 <= i11 || length <= i11 * 0.9f) {
                File fileE = e(str);
                int i12 = 0;
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileE));
                    pa paVar = new pa(str, x9Var);
                    try {
                        try {
                            g(bufferedOutputStream, 538247942);
                            k(bufferedOutputStream, str);
                            String str2 = paVar.f14937c;
                            if (str2 == null) {
                                str2 = "";
                            }
                            k(bufferedOutputStream, str2);
                            i(bufferedOutputStream, paVar.f14938d);
                            i(bufferedOutputStream, paVar.f14939e);
                            i(bufferedOutputStream, paVar.f14940f);
                            i(bufferedOutputStream, paVar.g);
                            List<ba> list = paVar.f14941h;
                            if (list != null) {
                                g(bufferedOutputStream, list.size());
                                for (ba baVar : list) {
                                    k(bufferedOutputStream, baVar.f9636a);
                                    k(bufferedOutputStream, baVar.f9637b);
                                }
                            } else {
                                g(bufferedOutputStream, 0);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.write(x9Var.f18322a);
                            bufferedOutputStream.close();
                            paVar.f14935a = fileE.length();
                            m(str, paVar);
                            long j10 = this.f15934a;
                            int i13 = this.f15935b;
                            if (j10 >= i13) {
                                boolean z3 = na.f14189a;
                                if (z3) {
                                    na.a("Pruning old cache entries.", new Object[0]);
                                }
                                long j11 = this.f15934a;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    Iterator it = ((LinkedHashMap) this.f15936c).entrySet().iterator();
                                    int i14 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i10 = i12;
                                            j = j11;
                                            c9 = 1;
                                            break;
                                        }
                                        pa paVar2 = (pa) ((Map.Entry) it.next()).getValue();
                                        String str3 = paVar2.f14936b;
                                        if (e(str3).delete()) {
                                            i10 = i12;
                                            j = j11;
                                            f10 = f11;
                                            c9 = 1;
                                            this.f15934a -= paVar2.f14935a;
                                        } else {
                                            f10 = f11;
                                            i10 = i12;
                                            j = j11;
                                            c9 = 1;
                                            String strO = o(str3);
                                            Object[] objArr = new Object[2];
                                            objArr[i10] = str3;
                                            objArr[1] = strO;
                                            na.b("Could not delete cache entry for key=%s, filename=%s", objArr);
                                        }
                                        it.remove();
                                        i14++;
                                        if (this.f15934a < i13 * f10) {
                                            break;
                                        }
                                        j11 = j;
                                        i12 = i10;
                                        f11 = f10;
                                    }
                                    if (z3) {
                                        Integer numValueOf = Integer.valueOf(i14);
                                        Long lValueOf = Long.valueOf(this.f15934a - j);
                                        Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                        Object[] objArr2 = new Object[3];
                                        objArr2[i10] = numValueOf;
                                        objArr2[c9] = lValueOf;
                                        objArr2[2] = lValueOf2;
                                        na.a("pruned %d files, %d bytes, %d ms", objArr2);
                                    }
                                } catch (IOException unused) {
                                    i4 = 0;
                                    if (!fileE.delete()) {
                                        Object[] objArr3 = new Object[1];
                                        objArr3[i4] = fileE.getAbsolutePath();
                                        na.b("Could not clean up file %s", objArr3);
                                    }
                                    if (!((ra) this.f15937d).b().exists()) {
                                        na.b("Re-initializing cache after external clearing.", new Object[i4]);
                                        ((LinkedHashMap) this.f15936c).clear();
                                        this.f15934a = 0L;
                                        c();
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            na.b("%s", e2.toString());
                            bufferedOutputStream.close();
                            na.b("Failed to write header for %s", fileE.getAbsolutePath());
                            throw new IOException();
                        }
                    } catch (IOException unused2) {
                    }
                } catch (IOException unused3) {
                    i4 = i12;
                }
            }
        } finally {
        }
    }

    public synchronized void c() {
        File fileB = ((ra) this.f15937d).b();
        if (fileB.exists()) {
            File[] fileArrListFiles = fileB.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        qa qaVar = new qa(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            pa paVarA = pa.a(qaVar);
                            paVarA.f14935a = length;
                            m(paVarA.f14936b, paVarA);
                            qaVar.close();
                        } catch (Throwable th2) {
                            qaVar.close();
                            throw th2;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileB.mkdirs()) {
            na.c("Unable to create cache dir %s", fileB.getAbsolutePath());
        }
    }

    public synchronized void d(String str) {
        boolean zDelete = e(str).delete();
        pa paVar = (pa) ((LinkedHashMap) this.f15936c).remove(str);
        if (paVar != null) {
            this.f15934a -= paVar.f14935a;
        }
        if (zDelete) {
            return;
        }
        na.b("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public File e(String str) {
        return new File(((ra) this.f15937d).b(), o(str));
    }

    public void m(String str, pa paVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15936c;
        if (linkedHashMap.containsKey(str)) {
            this.f15934a = (paVar.f14935a - ((pa) linkedHashMap.get(str)).f14935a) + this.f15934a;
        } else {
            this.f15934a += paVar.f14935a;
        }
        linkedHashMap.put(str, paVar);
    }

    public sa(l90 l90Var) {
        this.f15936c = new LinkedHashMap(16, 0.75f, true);
        this.f15934a = 0L;
        this.f15937d = l90Var;
        this.f15935b = 5242880;
    }

    public sa(File file) {
        this.f15936c = new LinkedHashMap(16, 0.75f, true);
        this.f15934a = 0L;
        this.f15937d = new ix0(this, file);
        this.f15935b = 20971520;
    }
}
