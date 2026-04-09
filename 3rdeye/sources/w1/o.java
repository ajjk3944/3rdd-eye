package w1;

import android.annotation.SuppressLint;
import b9.C1992A;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.android.kt */
@SuppressLint({"WrongConstant"})
/* loaded from: classes.dex */
public final class o implements F1.e, F1.d {

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap<Integer, o> f47270j = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final int f47271b;

    /* renamed from: c, reason: collision with root package name */
    public volatile String f47272c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f47273d;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f47274e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f47275f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[][] f47276g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f47277h;
    public int i;

    public o(int i) {
        this.f47271b = i;
        int i10 = i + 1;
        this.f47277h = new int[i10];
        this.f47273d = new long[i10];
        this.f47274e = new double[i10];
        this.f47275f = new String[i10];
        this.f47276g = new byte[i10][];
    }

    public static final o d(int i, String query) {
        kotlin.jvm.internal.l.f(query, "query");
        TreeMap<Integer, o> treeMap = f47270j;
        synchronized (treeMap) {
            Map.Entry<Integer, o> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                C1992A c1992a = C1992A.f18074a;
                o oVar = new o(i);
                oVar.f47272c = query;
                oVar.i = i;
                return oVar;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            o value = entryCeilingEntry.getValue();
            value.getClass();
            value.f47272c = query;
            value.i = i;
            return value;
        }
    }

    @Override // F1.e
    public final void a(F1.d dVar) {
        int i = this.i;
        if (1 > i) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f47277h[i10];
            if (i11 == 1) {
                dVar.f(i10);
            } else if (i11 == 2) {
                dVar.b(i10, this.f47273d[i10]);
            } else if (i11 == 3) {
                dVar.p(i10, this.f47274e[i10]);
            } else if (i11 == 4) {
                String str = this.f47275f[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.h(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f47276g[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.b0(i10, bArr);
            }
            if (i10 == i) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // F1.d
    public final void b(int i, long j4) {
        this.f47277h[i] = 2;
        this.f47273d[i] = j4;
    }

    @Override // F1.d
    public final void b0(int i, byte[] bArr) {
        this.f47277h[i] = 5;
        this.f47276g[i] = bArr;
    }

    @Override // F1.e
    public final String c() {
        String str = this.f47272c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // F1.d
    public final void f(int i) {
        this.f47277h[i] = 1;
    }

    @Override // F1.d
    public final void h(int i, String value) {
        kotlin.jvm.internal.l.f(value, "value");
        this.f47277h[i] = 4;
        this.f47275f[i] = value;
    }

    @Override // F1.d
    public final void p(int i, double d10) {
        this.f47277h[i] = 3;
        this.f47274e[i] = d10;
    }

    public final void release() {
        TreeMap<Integer, o> treeMap = f47270j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f47271b), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.l.e(it, "iterator(...)");
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
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
