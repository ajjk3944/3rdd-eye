package C0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class t implements G0.d, G0.c {
    public static final TreeMap i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f1105a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f1106b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f1107c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f1108d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f1109e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f1110f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1111g;

    /* renamed from: h, reason: collision with root package name */
    public int f1112h;

    public t(int i3) {
        this.f1105a = i3;
        int i6 = i3 + 1;
        this.f1111g = new int[i6];
        this.f1107c = new long[i6];
        this.f1108d = new double[i6];
        this.f1109e = new String[i6];
        this.f1110f = new byte[i6][];
    }

    public static final t a(int i3, String str) {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i3));
            if (entryCeilingEntry == null) {
                t tVar = new t(i3);
                tVar.f1106b = str;
                tVar.f1112h = i3;
                return tVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            t tVar2 = (t) entryCeilingEntry.getValue();
            tVar2.f1106b = str;
            tVar2.f1112h = i3;
            return tVar2;
        }
    }

    public final void b() {
        TreeMap treeMap = i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1105a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                q5.i.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i3 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i3;
                }
            }
        }
    }

    @Override // G0.c
    public final void c(int i3, String str) {
        q5.i.e(str, "value");
        this.f1111g[i3] = 4;
        this.f1109e[i3] = str;
    }

    @Override // G0.c
    public final void f(int i3, long j6) {
        this.f1111g[i3] = 2;
        this.f1107c[i3] = j6;
    }

    @Override // G0.c
    public final void g(int i3, byte[] bArr) {
        this.f1111g[i3] = 5;
        this.f1110f[i3] = bArr;
    }

    @Override // G0.c
    public final void j(double d6, int i3) {
        this.f1111g[i3] = 3;
        this.f1108d[i3] = d6;
    }

    @Override // G0.c
    public final void l(int i3) {
        this.f1111g[i3] = 1;
    }

    @Override // G0.d
    public final String n() {
        String str = this.f1106b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // G0.d
    public final void q(G0.c cVar) {
        int i3 = this.f1112h;
        if (1 > i3) {
            return;
        }
        int i6 = 1;
        while (true) {
            int i7 = this.f1111g[i6];
            if (i7 == 1) {
                cVar.l(i6);
            } else if (i7 == 2) {
                cVar.f(i6, this.f1107c[i6]);
            } else if (i7 == 3) {
                cVar.j(this.f1108d[i6], i6);
            } else if (i7 == 4) {
                String str = this.f1109e[i6];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.c(i6, str);
            } else if (i7 == 5) {
                byte[] bArr = this.f1110f[i6];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.g(i6, bArr);
            }
            if (i6 == i3) {
                return;
            } else {
                i6++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
