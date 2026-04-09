package w5;

import android.database.Cursor;
import java.util.Arrays;
import nk.k;
import nm.d0;
import t6.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: d, reason: collision with root package name */
    public int[] f36478d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f36479e;

    /* renamed from: f, reason: collision with root package name */
    public double[] f36480f;
    public String[] g;

    /* renamed from: h, reason: collision with root package name */
    public byte[][] f36481h;

    /* renamed from: i, reason: collision with root package name */
    public Cursor f36482i;

    public static void m(Cursor cursor, int i4) {
        if (i4 < 0 || i4 >= cursor.getColumnCount()) {
            i0.v(25, "column index out of range");
            throw null;
        }
    }

    @Override // d6.c
    public final String D(int i4) {
        c();
        Cursor cursorP = p();
        m(cursorP, i4);
        String string = cursorP.getString(i4);
        k.d(string, "getString(...)");
        return string;
    }

    @Override // d6.c
    public final boolean P() {
        c();
        g();
        Cursor cursor = this.f36482i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // d6.c
    public final void a(int i4, long j) {
        c();
        e(1, i4);
        this.f36478d[i4] = 1;
        this.f36479e[i4] = j;
    }

    @Override // d6.c
    public final void b(int i4, byte[] bArr) {
        c();
        e(4, i4);
        this.f36478d[i4] = 4;
        this.f36481h[i4] = bArr;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f36486c) {
            c();
            this.f36478d = new int[0];
            this.f36479e = new long[0];
            this.f36480f = new double[0];
            this.g = new String[0];
            this.f36481h = new byte[0][];
            reset();
        }
        this.f36486c = true;
    }

    @Override // d6.c
    public final void d(int i4) {
        c();
        e(5, i4);
        this.f36478d[i4] = 5;
    }

    public final void e(int i4, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f36478d;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            k.d(iArrCopyOf, "copyOf(...)");
            this.f36478d = iArrCopyOf;
        }
        if (i4 == 1) {
            long[] jArr = this.f36479e;
            if (jArr.length < i11) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                k.d(jArrCopyOf, "copyOf(...)");
                this.f36479e = jArrCopyOf;
                return;
            }
            return;
        }
        if (i4 == 2) {
            double[] dArr = this.f36480f;
            if (dArr.length < i11) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                k.d(dArrCopyOf, "copyOf(...)");
                this.f36480f = dArrCopyOf;
                return;
            }
            return;
        }
        if (i4 == 3) {
            String[] strArr = this.g;
            if (strArr.length < i11) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                k.d(objArrCopyOf, "copyOf(...)");
                this.g = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i4 != 4) {
            return;
        }
        byte[][] bArr = this.f36481h;
        if (bArr.length < i11) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
            k.d(objArrCopyOf2, "copyOf(...)");
            this.f36481h = (byte[][]) objArrCopyOf2;
        }
    }

    public final void g() {
        if (this.f36482i == null) {
            this.f36482i = this.f36484a.h(new d0(19, this));
        }
    }

    @Override // d6.c
    public final byte[] getBlob(int i4) {
        c();
        Cursor cursorP = p();
        m(cursorP, i4);
        byte[] blob = cursorP.getBlob(i4);
        k.d(blob, "getBlob(...)");
        return blob;
    }

    @Override // d6.c
    public final int getColumnCount() {
        c();
        g();
        Cursor cursor = this.f36482i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // d6.c
    public final String getColumnName(int i4) {
        c();
        g();
        Cursor cursor = this.f36482i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m(cursor, i4);
        String columnName = cursor.getColumnName(i4);
        k.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // d6.c
    public final long getLong(int i4) {
        c();
        Cursor cursorP = p();
        m(cursorP, i4);
        return cursorP.getLong(i4);
    }

    @Override // d6.c
    public final boolean isNull(int i4) {
        c();
        Cursor cursorP = p();
        m(cursorP, i4);
        return cursorP.isNull(i4);
    }

    public final Cursor p() {
        Cursor cursor = this.f36482i;
        if (cursor != null) {
            return cursor;
        }
        i0.v(21, "no row");
        throw null;
    }

    @Override // d6.c
    public final void q(int i4, String str) {
        k.e(str, "value");
        c();
        e(3, i4);
        this.f36478d[i4] = 3;
        this.g[i4] = str;
    }

    @Override // d6.c
    public final void reset() {
        c();
        Cursor cursor = this.f36482i;
        if (cursor != null) {
            cursor.close();
        }
        this.f36482i = null;
    }
}
