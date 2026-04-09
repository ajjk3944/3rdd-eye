package z1;

import F1.f;
import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* compiled from: SupportSQLiteStatement.android.kt */
/* renamed from: z1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5856e implements E1.c {

    /* renamed from: b, reason: collision with root package name */
    public final F1.b f48420b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48421c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f48422d;

    /* compiled from: SupportSQLiteStatement.android.kt */
    /* renamed from: z1.e$a */
    public static final class a extends AbstractC5856e {

        /* renamed from: e, reason: collision with root package name */
        public int[] f48423e;

        /* renamed from: f, reason: collision with root package name */
        public long[] f48424f;

        /* renamed from: g, reason: collision with root package name */
        public double[] f48425g;

        /* renamed from: h, reason: collision with root package name */
        public String[] f48426h;
        public byte[][] i;

        /* renamed from: j, reason: collision with root package name */
        public Cursor f48427j;

        /* compiled from: SupportSQLiteStatement.android.kt */
        /* renamed from: z1.e$a$a, reason: collision with other inner class name */
        public static final class C0563a implements F1.e {
            public C0563a() {
            }

            @Override // F1.e
            public final void a(F1.d dVar) {
                a aVar = a.this;
                int length = aVar.f48423e.length;
                for (int i = 1; i < length; i++) {
                    int i10 = aVar.f48423e[i];
                    if (i10 == 1) {
                        dVar.b(i, aVar.f48424f[i]);
                    } else if (i10 == 2) {
                        dVar.p(i, aVar.f48425g[i]);
                    } else if (i10 == 3) {
                        String str = aVar.f48426h[i];
                        l.c(str);
                        dVar.h(i, str);
                    } else if (i10 == 4) {
                        byte[] bArr = aVar.i[i];
                        l.c(bArr);
                        dVar.b0(i, bArr);
                    } else if (i10 == 5) {
                        dVar.f(i);
                    }
                }
            }

            @Override // F1.e
            public final String c() {
                return a.this.f48421c;
            }
        }

        public static void e(Cursor cursor, int i) {
            if (i < 0 || i >= cursor.getColumnCount()) {
                A2.l.G(25, "column index out of range");
                throw null;
            }
        }

        @Override // E1.c
        public final void Q(int i, String value) {
            l.f(value, "value");
            a();
            c(3, i);
            this.f48423e[i] = 3;
            this.f48426h[i] = value;
        }

        @Override // E1.c
        public final void b(int i, long j4) {
            a();
            c(1, i);
            this.f48423e[i] = 1;
            this.f48424f[i] = j4;
        }

        public final void c(int i, int i10) {
            int i11 = i10 + 1;
            int[] iArr = this.f48423e;
            if (iArr.length < i11) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
                l.e(iArrCopyOf, "copyOf(...)");
                this.f48423e = iArrCopyOf;
            }
            if (i == 1) {
                long[] jArr = this.f48424f;
                if (jArr.length < i11) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                    l.e(jArrCopyOf, "copyOf(...)");
                    this.f48424f = jArrCopyOf;
                    return;
                }
                return;
            }
            if (i == 2) {
                double[] dArr = this.f48425g;
                if (dArr.length < i11) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                    l.e(dArrCopyOf, "copyOf(...)");
                    this.f48425g = dArrCopyOf;
                    return;
                }
                return;
            }
            if (i == 3) {
                String[] strArr = this.f48426h;
                if (strArr.length < i11) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                    l.e(objArrCopyOf, "copyOf(...)");
                    this.f48426h = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            byte[][] bArr = this.i;
            if (bArr.length < i11) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
                l.e(objArrCopyOf2, "copyOf(...)");
                this.i = (byte[][]) objArrCopyOf2;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.f48422d) {
                a();
                this.f48423e = new int[0];
                this.f48424f = new long[0];
                this.f48425g = new double[0];
                this.f48426h = new String[0];
                this.i = new byte[0][];
                reset();
            }
            this.f48422d = true;
        }

        public final void d() {
            if (this.f48427j == null) {
                this.f48427j = this.f48420b.E(new C0563a());
            }
        }

        @Override // E1.c
        public final void f(int i) {
            a();
            c(5, i);
            this.f48423e[i] = 5;
        }

        @Override // E1.c
        public final String g0(int i) {
            a();
            Cursor cursor = this.f48427j;
            if (cursor == null) {
                A2.l.G(21, "no row");
                throw null;
            }
            e(cursor, i);
            String string = cursor.getString(i);
            l.e(string, "getString(...)");
            return string;
        }

        @Override // E1.c
        public final int getColumnCount() {
            a();
            d();
            Cursor cursor = this.f48427j;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // E1.c
        public final String getColumnName(int i) {
            a();
            d();
            Cursor cursor = this.f48427j;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            e(cursor, i);
            String columnName = cursor.getColumnName(i);
            l.e(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // E1.c
        public final long getLong(int i) {
            a();
            Cursor cursor = this.f48427j;
            if (cursor != null) {
                e(cursor, i);
                return cursor.getLong(i);
            }
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final boolean isNull(int i) {
            a();
            Cursor cursor = this.f48427j;
            if (cursor != null) {
                e(cursor, i);
                return cursor.isNull(i);
            }
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final void reset() {
            a();
            Cursor cursor = this.f48427j;
            if (cursor != null) {
                cursor.close();
            }
            this.f48427j = null;
        }

        @Override // E1.c
        public final boolean x() {
            a();
            d();
            Cursor cursor = this.f48427j;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AbstractC5856e(F1.b bVar, String str) {
        this.f48420b = bVar;
        this.f48421c = str;
    }

    @Override // E1.c
    public final boolean T() {
        return getLong(0) != 0;
    }

    public final void a() {
        if (this.f48422d) {
            A2.l.G(21, "statement is closed");
            throw null;
        }
    }

    /* compiled from: SupportSQLiteStatement.android.kt */
    /* renamed from: z1.e$b */
    public static final class b extends AbstractC5856e {

        /* renamed from: e, reason: collision with root package name */
        public final f f48429e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F1.b db, String sql) {
            super(db, sql);
            l.f(db, "db");
            l.f(sql, "sql");
            this.f48429e = db.t(sql);
        }

        @Override // E1.c
        public final void Q(int i, String value) {
            l.f(value, "value");
            a();
            this.f48429e.h(i, value);
        }

        @Override // E1.c
        public final void b(int i, long j4) {
            a();
            this.f48429e.b(i, j4);
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f48429e.close();
            this.f48422d = true;
        }

        @Override // E1.c
        public final void f(int i) {
            a();
            this.f48429e.f(i);
        }

        @Override // E1.c
        public final String g0(int i) {
            a();
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final int getColumnCount() {
            a();
            return 0;
        }

        @Override // E1.c
        public final String getColumnName(int i) {
            a();
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final long getLong(int i) {
            a();
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final boolean isNull(int i) {
            a();
            A2.l.G(21, "no row");
            throw null;
        }

        @Override // E1.c
        public final boolean x() {
            a();
            this.f48429e.execute();
            return false;
        }

        @Override // E1.c
        public final void reset() {
        }
    }
}
