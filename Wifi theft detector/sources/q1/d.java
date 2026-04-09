package q1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class d implements u1.e, u1.d {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f23982i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f23983a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f23984b;

    /* renamed from: c, reason: collision with root package name */
    public final double[] f23985c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f23986d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[][] f23987e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f23988f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23989g;

    /* renamed from: h, reason: collision with root package name */
    public int f23990h;

    public d(int i10) {
        this.f23989g = i10;
        int i11 = i10 + 1;
        this.f23988f = new int[i11];
        this.f23984b = new long[i11];
        this.f23985c = new double[i11];
        this.f23986d = new String[i11];
        this.f23987e = new byte[i11][];
    }

    public static d a(String str, int i10) {
        TreeMap treeMap = f23982i;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    d dVar = new d(i10);
                    dVar.b(str, i10);
                    return dVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                d dVar2 = (d) entryCeilingEntry.getValue();
                dVar2.b(str, i10);
                return dVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void h() {
        TreeMap treeMap = f23982i;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // u1.d
    public void N(int i10, byte[] bArr) {
        this.f23988f[i10] = 5;
        this.f23987e[i10] = bArr;
    }

    @Override // u1.d
    public void R(int i10) {
        this.f23988f[i10] = 1;
    }

    public void b(String str, int i10) {
        this.f23983a = str;
        this.f23990h = i10;
    }

    @Override // u1.d
    public void c(int i10, double d10) {
        this.f23988f[i10] = 3;
        this.f23985c[i10] = d10;
    }

    @Override // u1.e
    public String d() {
        return this.f23983a;
    }

    @Override // u1.e
    public void e(u1.d dVar) {
        for (int i10 = 1; i10 <= this.f23990h; i10++) {
            int i11 = this.f23988f[i10];
            if (i11 == 1) {
                dVar.R(i10);
            } else if (i11 == 2) {
                dVar.s(i10, this.f23984b[i10]);
            } else if (i11 == 3) {
                dVar.c(i10, this.f23985c[i10]);
            } else if (i11 == 4) {
                dVar.i(i10, this.f23986d[i10]);
            } else if (i11 == 5) {
                dVar.N(i10, this.f23987e[i10]);
            }
        }
    }

    @Override // u1.d
    public void i(int i10, String str) {
        this.f23988f[i10] = 4;
        this.f23986d[i10] = str;
    }

    public void release() {
        TreeMap treeMap = f23982i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f23989g), this);
            h();
        }
    }

    @Override // u1.d
    public void s(int i10, long j10) {
        this.f23988f[i10] = 2;
        this.f23984b[i10] = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
