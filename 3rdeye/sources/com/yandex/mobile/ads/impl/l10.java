package com.yandex.mobile.ads.impl;

import N7.G8;
import android.os.SystemClock;
import android.text.TextUtils;
import com.singular.sdk.internal.Constants;
import com.yandex.mobile.ads.impl.nm;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class l10 implements nm {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f29844a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private long f29845b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final d f29846c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29847d;

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f29848a;

        public a(File file) {
            this.f29848a = file;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        long f29849a;

        /* renamed from: b, reason: collision with root package name */
        final String f29850b;

        /* renamed from: c, reason: collision with root package name */
        final String f29851c;

        /* renamed from: d, reason: collision with root package name */
        final long f29852d;

        /* renamed from: e, reason: collision with root package name */
        final long f29853e;

        /* renamed from: f, reason: collision with root package name */
        final long f29854f;

        /* renamed from: g, reason: collision with root package name */
        final long f29855g;

        /* renamed from: h, reason: collision with root package name */
        final List<ef0> f29856h;

        public /* synthetic */ b(String str, String str2, long j4, long j10, long j11, long j12, List list, int i) {
            this(str, str2, j4, j10, j11, j12, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static List<ef0> a(nm.a aVar) {
            List<ef0> list = aVar.f30936h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f30935g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new ef0(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        private b(String str, String str2, long j4, long j10, long j11, long j12, List<ef0> list) {
            this.f29850b = str;
            this.f29851c = "".equals(str2) ? null : str2;
            this.f29852d = j4;
            this.f29853e = j10;
            this.f29854f = j11;
            this.f29855g = j12;
            this.f29856h = list;
        }

        public static b a(c cVar) throws IOException {
            if (l10.a(cVar) == 538247942) {
                String str = new String(l10.a(cVar, l10.b(cVar)), Constants.ENCODING);
                String str2 = new String(l10.a(cVar, l10.b(cVar)), Constants.ENCODING);
                long jB = l10.b(cVar);
                long jB2 = l10.b(cVar);
                long jB3 = l10.b(cVar);
                long jB4 = l10.b(cVar);
                int iA = l10.a(cVar);
                if (iA >= 0) {
                    List arrayList = iA == 0 ? Collections.EMPTY_LIST : new ArrayList();
                    int i = 0;
                    while (i < iA) {
                        arrayList.add(new ef0(new String(l10.a(cVar, l10.b(cVar)), Constants.ENCODING).intern(), new String(l10.a(cVar, l10.b(cVar)), Constants.ENCODING).intern()));
                        i++;
                        str = str;
                        str2 = str2;
                        jB = jB;
                    }
                    return new b(str, str2, jB, jB2, jB3, jB4, arrayList);
                }
                throw new IOException(fe.a("readHeaderList size=", iA));
            }
            throw new IOException();
        }

        public final nm.a a(byte[] bArr) {
            nm.a aVar = new nm.a();
            aVar.f30929a = bArr;
            aVar.f30930b = this.f29851c;
            aVar.f30931c = this.f29852d;
            aVar.f30932d = this.f29853e;
            aVar.f30933e = this.f29854f;
            aVar.f30934f = this.f29855g;
            List<ef0> list = this.f29856h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (ef0 ef0Var : list) {
                treeMap.put(ef0Var.a(), ef0Var.b());
            }
            aVar.f30935g = treeMap;
            aVar.f30936h = Collections.unmodifiableList(this.f29856h);
            return aVar;
        }

        public final boolean a(BufferedOutputStream bufferedOutputStream) throws IOException {
            try {
                l10.a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f29850b.getBytes(Constants.ENCODING);
                l10.a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f29851c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes(Constants.ENCODING);
                l10.a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                l10.a(bufferedOutputStream, this.f29852d);
                l10.a(bufferedOutputStream, this.f29853e);
                l10.a(bufferedOutputStream, this.f29854f);
                l10.a(bufferedOutputStream, this.f29855g);
                List<ef0> list = this.f29856h;
                if (list != null) {
                    l10.a(bufferedOutputStream, list.size());
                    for (ef0 ef0Var : list) {
                        byte[] bytes3 = ef0Var.a().getBytes(Constants.ENCODING);
                        l10.a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = ef0Var.b().getBytes(Constants.ENCODING);
                        l10.a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    l10.a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e4) {
                Object[] objArr = {e4.toString()};
                boolean z10 = gi2.f27765a;
                fp0.a(objArr);
                return false;
            }
        }
    }

    public interface d {
    }

    public l10(File file, int i) {
        this.f29846c = new a(file);
        this.f29847d = i;
    }

    private void b() {
        if (this.f29845b < this.f29847d) {
            return;
        }
        if (gi2.f27765a) {
            fp0.e(new Object[0]);
        }
        long j4 = this.f29845b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f29844a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.f29850b;
            File file = ((a) this.f29846c).f29848a;
            int length = str.length() / 2;
            StringBuilder sbU = G8.u(String.valueOf(str.substring(0, length).hashCode()));
            sbU.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, sbU.toString()).delete()) {
                this.f29845b -= bVar.f29849a;
            } else {
                String str2 = bVar.f29850b;
                int length2 = str2.length() / 2;
                StringBuilder sbU2 = G8.u(String.valueOf(str2.substring(0, length2).hashCode()));
                sbU2.append(String.valueOf(str2.substring(length2).hashCode()));
                fp0.a(str2, sbU2.toString());
            }
            it.remove();
            i++;
            if (this.f29845b < this.f29847d * 0.9f) {
                break;
            }
        }
        if (gi2.f27765a) {
            fp0.e(Integer.valueOf(i), Long.valueOf(this.f29845b - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    @Override // com.yandex.mobile.ads.impl.nm
    public final synchronized void a() {
        long length;
        c cVar;
        synchronized (this) {
            File file = ((a) this.f29846c).f29848a;
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    Object[] objArr = {file.getAbsolutePath()};
                    boolean z10 = gi2.f27765a;
                    fp0.b(objArr);
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    length = file2.length();
                    cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                } catch (IOException unused) {
                    file2.delete();
                } catch (Throwable unused2) {
                    kotlin.jvm.internal.l.f(file2, "<this>");
                    try {
                        file2.delete();
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    b bVarA = b.a(cVar);
                    bVarA.f29849a = length;
                    String str = bVarA.f29850b;
                    if (this.f29844a.containsKey(str)) {
                        this.f29845b = (bVarA.f29849a - ((b) this.f29844a.get(str)).f29849a) + this.f29845b;
                    } else {
                        this.f29845b += bVarA.f29849a;
                    }
                    this.f29844a.put(str, bVarA);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.nm
    public final synchronized nm.a get(String str) {
        b bVar = (b) this.f29844a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.f29846c).f29848a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                b bVarA = b.a(cVar);
                if (TextUtils.equals(str, bVarA.f29850b)) {
                    return bVar.a(a(cVar, cVar.f29857a - cVar.f29858b));
                }
                Object[] objArr = {file2.getAbsolutePath(), str, bVarA.f29850b};
                boolean z10 = gi2.f27765a;
                fp0.a(objArr);
                b bVar2 = (b) this.f29844a.remove(str);
                if (bVar2 != null) {
                    this.f29845b -= bVar2.f29849a;
                }
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e4) {
            Object[] objArr2 = {file2.getAbsolutePath(), e4.toString()};
            boolean z11 = gi2.f27765a;
            fp0.a(objArr2);
            b(str);
            return null;
        }
    }

    public static class c extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final long f29857a;

        /* renamed from: b, reason: collision with root package name */
        private long f29858b;

        public c(BufferedInputStream bufferedInputStream, long j4) {
            super(bufferedInputStream);
            this.f29857a = j4;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i = super.read();
            if (i != -1) {
                this.f29858b++;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i10) throws IOException {
            int i11 = super.read(bArr, i, i10);
            if (i11 != -1) {
                this.f29858b += i11;
            }
            return i11;
        }
    }

    @Override // com.yandex.mobile.ads.impl.nm
    public final synchronized void a(String str) {
        nm.a aVar = get(str);
        if (aVar != null) {
            aVar.f30934f = 0L;
            aVar.f30933e = 0L;
            a(str, aVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nm
    public final synchronized void a(String str, nm.a aVar) {
        int i;
        File file;
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j4 = this.f29845b;
        byte[] bArr = aVar.f30929a;
        long length = j4 + bArr.length;
        int i10 = this.f29847d;
        if (length <= i10 || bArr.length <= i10 * 0.9f) {
            File file2 = ((a) this.f29846c).f29848a;
            int length2 = str.length() / 2;
            File file3 = new File(file2, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                try {
                    try {
                        try {
                            try {
                                i = 0;
                                try {
                                    try {
                                        try {
                                            file = file3;
                                            try {
                                                bVar = new b(str, aVar.f30930b, aVar.f30931c, aVar.f30932d, aVar.f30933e, aVar.f30934f, b.a(aVar), 0);
                                            } catch (IOException unused) {
                                                i = 0;
                                            }
                                        } catch (IOException unused2) {
                                            file = file3;
                                            i = 0;
                                        }
                                    } catch (IOException unused3) {
                                        file = file3;
                                    }
                                } catch (IOException unused4) {
                                    file = file3;
                                }
                            } catch (IOException unused5) {
                                i = 0;
                                file = file3;
                            }
                        } catch (IOException unused6) {
                            file = file3;
                            i = 0;
                        }
                    } catch (IOException unused7) {
                        i = 0;
                        file = file3;
                    }
                } catch (IOException unused8) {
                    file = file3;
                    i = 0;
                }
            } catch (IOException unused9) {
                i = 0;
                file = file3;
            }
            if (bVar.a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f30929a);
                bufferedOutputStream.close();
                bVar.f29849a = file.length();
                if (!this.f29844a.containsKey(str)) {
                    this.f29845b += bVar.f29849a;
                } else {
                    this.f29845b = (bVar.f29849a - ((b) this.f29844a.get(str)).f29849a) + this.f29845b;
                }
                this.f29844a.put(str, bVar);
                b();
            }
            bufferedOutputStream.close();
            Object[] objArr = new Object[1];
            i = 0;
            try {
                objArr[0] = file.getAbsolutePath();
                boolean z10 = gi2.f27765a;
                fp0.a(objArr);
                throw new IOException();
            } catch (IOException unused10) {
                if (!file.delete()) {
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = file.getAbsolutePath();
                    boolean z11 = gi2.f27765a;
                    fp0.a(objArr2);
                }
                if (!((a) this.f29846c).f29848a.exists()) {
                    boolean z12 = gi2.f27765a;
                    fp0.a(new Object[i]);
                    this.f29844a.clear();
                    this.f29845b = 0L;
                    a();
                }
            }
        }
    }

    public static long b(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            long j4 = i & 255;
            int i10 = inputStream.read();
            if (i10 != -1) {
                long j10 = j4 | ((i10 & 255) << 8);
                int i11 = inputStream.read();
                if (i11 != -1) {
                    long j11 = j10 | ((i11 & 255) << 16);
                    int i12 = inputStream.read();
                    if (i12 != -1) {
                        long j12 = j11 | ((i12 & 255) << 24);
                        int i13 = inputStream.read();
                        if (i13 != -1) {
                            long j13 = j12 | ((i13 & 255) << 32);
                            int i14 = inputStream.read();
                            if (i14 != -1) {
                                long j14 = j13 | ((i14 & 255) << 40);
                                int i15 = inputStream.read();
                                if (i15 != -1) {
                                    long j15 = j14 | ((i15 & 255) << 48);
                                    int i16 = inputStream.read();
                                    if (i16 != -1) {
                                        return ((i16 & 255) << 56) | j15;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public final synchronized void b(String str) {
        try {
            File file = ((a) this.f29846c).f29848a;
            int length = str.length() / 2;
            boolean zDelete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
            b bVar = (b) this.f29844a.remove(str);
            if (bVar != null) {
                this.f29845b -= bVar.f29849a;
            }
            if (!zDelete) {
                int length2 = str.length() / 2;
                Object[] objArr = {str, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())};
                boolean z10 = gi2.f27765a;
                fp0.a(objArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int a(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            int i10 = inputStream.read();
            if (i10 != -1) {
                int i11 = i | (i10 << 8);
                int i12 = inputStream.read();
                if (i12 != -1) {
                    int i13 = i11 | (i12 << 16);
                    int i14 = inputStream.read();
                    if (i14 != -1) {
                        return (i14 << 24) | i13;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(c cVar, long j4) throws IOException {
        long j10 = cVar.f29857a - cVar.f29858b;
        if (j4 >= 0 && j4 <= j10) {
            int i = (int) j4;
            if (i == j4) {
                byte[] bArr = new byte[i];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbJ = androidx.work.s.j("streamToBytes length=", ", maxLength=", j4);
        sbJ.append(j10);
        throw new IOException(sbJ.toString());
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j4) throws IOException {
        bufferedOutputStream.write((byte) j4);
        bufferedOutputStream.write((byte) (j4 >>> 8));
        bufferedOutputStream.write((byte) (j4 >>> 16));
        bufferedOutputStream.write((byte) (j4 >>> 24));
        bufferedOutputStream.write((byte) (j4 >>> 32));
        bufferedOutputStream.write((byte) (j4 >>> 40));
        bufferedOutputStream.write((byte) (j4 >>> 48));
        bufferedOutputStream.write((byte) (j4 >>> 56));
    }
}
