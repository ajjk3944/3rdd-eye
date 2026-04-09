package i7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class n implements o7.d, o7.c {

    /* renamed from: y, reason: collision with root package name */
    public static final TreeMap f11275y = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public volatile String f11276a;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f11280x = new int[1];

    /* renamed from: d, reason: collision with root package name */
    public final long[] f11277d = new long[1];

    /* renamed from: g, reason: collision with root package name */
    public final double[] f11278g = new double[1];

    /* renamed from: r, reason: collision with root package name */
    public final String[] f11279r = new String[1];

    public static final n b(String str) {
        TreeMap treeMap = f11275y;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(0);
            if (entryCeilingEntry == null) {
                n nVar = new n();
                nVar.f11276a = str;
                return nVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            n nVar2 = (n) entryCeilingEntry.getValue();
            nVar2.f11276a = str;
            return nVar2;
        }
    }

    @Override // o7.c
    public final void A(int i10, long j) {
        this.f11280x[i10] = 2;
        this.f11277d[i10] = j;
    }

    @Override // o7.c
    public final void T(double d6, int i10) {
        this.f11280x[i10] = 3;
        this.f11278g[i10] = d6;
    }

    @Override // o7.c
    public final void U(int i10) {
        this.f11280x[i10] = 1;
    }

    @Override // o7.d
    public final String f() {
        String str = this.f11276a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void i() {
        TreeMap treeMap = f11275y;
        synchronized (treeMap) {
            treeMap.put(0, this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                br.l.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // o7.c
    public final void m(int i10, String str) {
        this.f11280x[i10] = 4;
        this.f11279r[i10] = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o7.d
    public final void h(o7.c cVar) {
    }
}
