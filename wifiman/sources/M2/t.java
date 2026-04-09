package m2;

import Yg.J;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t implements SupportSQLiteQuery, r2.g {

    /* renamed from: i, reason: collision with root package name */
    public static final a f53089i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap f53090j = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    private final int f53091a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f53092b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f53093c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f53094d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f53095e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f53096f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f53097g;

    /* renamed from: h, reason: collision with root package name */
    private int f53098h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(String query, int i10) {
            AbstractC6492s.i(query, "query");
            TreeMap treeMap = t.f53090j;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    J j10 = J.f24997a;
                    t tVar = new t(i10, null);
                    tVar.p(query, i10);
                    return tVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                t sqliteQuery = (t) entryCeilingEntry.getValue();
                sqliteQuery.p(query, i10);
                AbstractC6492s.h(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = t.f53090j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            AbstractC6492s.h(it, "queryPool.descendingKeySet().iterator()");
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

        private a() {
        }
    }

    public /* synthetic */ t(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static final t j(String str, int i10) {
        return f53089i.a(str, i10);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void a(r2.g statement) {
        AbstractC6492s.i(statement, "statement");
        int iG = g();
        if (1 > iG) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f53097g[i10];
            if (i11 == 1) {
                statement.bindNull(i10);
            } else if (i11 == 2) {
                statement.bindLong(i10, this.f53093c[i10]);
            } else if (i11 == 3) {
                statement.bindDouble(i10, this.f53094d[i10]);
            } else if (i11 == 4) {
                String str = this.f53095e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindString(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f53096f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.bindBlob(i10, bArr);
            }
            if (i10 == iG) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // r2.g
    public void bindBlob(int i10, byte[] value) {
        AbstractC6492s.i(value, "value");
        this.f53097g[i10] = 5;
        this.f53096f[i10] = value;
    }

    @Override // r2.g
    public void bindDouble(int i10, double d10) {
        this.f53097g[i10] = 3;
        this.f53094d[i10] = d10;
    }

    @Override // r2.g
    public void bindLong(int i10, long j10) {
        this.f53097g[i10] = 2;
        this.f53093c[i10] = j10;
    }

    @Override // r2.g
    public void bindNull(int i10) {
        this.f53097g[i10] = 1;
    }

    @Override // r2.g
    public void bindString(int i10, String value) {
        AbstractC6492s.i(value, "value");
        this.f53097g[i10] = 4;
        this.f53095e[i10] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int g() {
        return this.f53098h;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String h() {
        String str = this.f53092b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void p(String query, int i10) {
        AbstractC6492s.i(query, "query");
        this.f53092b = query;
        this.f53098h = i10;
    }

    public final void s() {
        TreeMap treeMap = f53090j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f53091a), this);
            f53089i.b();
            J j10 = J.f24997a;
        }
    }

    private t(int i10) {
        this.f53091a = i10;
        int i11 = i10 + 1;
        this.f53097g = new int[i11];
        this.f53093c = new long[i11];
        this.f53094d = new double[i11];
        this.f53095e = new String[i11];
        this.f53096f = new byte[i11][];
    }
}
