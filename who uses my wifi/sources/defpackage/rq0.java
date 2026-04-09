package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rq0 implements lz0, Closeable {
    public static final TreeMap n = new TreeMap();
    public volatile String f;
    public final long[] g;
    public final double[] h;
    public final String[] i;
    public final byte[][] j;
    public final int[] k;
    public final int l;
    public int m;

    public rq0(int i) {
        this.l = i;
        int i2 = i + 1;
        this.k = new int[i2];
        this.g = new long[i2];
        this.h = new double[i2];
        this.i = new String[i2];
        this.j = new byte[i2][];
    }

    public static rq0 f(String str, int i) {
        TreeMap treeMap = n;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (entryCeilingEntry == null) {
                    rq0 rq0Var = new rq0(i);
                    rq0Var.f = str;
                    rq0Var.m = i;
                    return rq0Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                rq0 rq0Var2 = (rq0) entryCeilingEntry.getValue();
                rq0Var2.f = str;
                rq0Var2.m = i;
                return rq0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lz0
    public final String a() {
        return this.f;
    }

    @Override // defpackage.lz0
    public final void c(lx lxVar) {
        for (int i = 1; i <= this.m; i++) {
            int i2 = this.k[i];
            if (i2 == 1) {
                lxVar.g(i);
            } else if (i2 == 2) {
                lxVar.f(i, this.g[i]);
            } else if (i2 == 3) {
                ((SQLiteProgram) lxVar.g).bindDouble(i, this.h[i]);
            } else if (i2 == 4) {
                lxVar.h(this.i[i], i);
            } else if (i2 == 5) {
                lxVar.c(i, this.j[i]);
            }
        }
    }

    public final void g(int i, long j) {
        this.k[i] = 2;
        this.g[i] = j;
    }

    public final void h(int i) {
        this.k[i] = 1;
    }

    public final void i(String str, int i) {
        this.k[i] = 4;
        this.i[i] = str;
    }

    public final void k() {
        TreeMap treeMap = n;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
