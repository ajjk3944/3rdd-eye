package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g f972c = new g(y.f1082b);

    /* renamed from: d, reason: collision with root package name */
    public static final e f973d;

    /* renamed from: a, reason: collision with root package name */
    public int f974a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f975b;

    static {
        f973d = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f975b = bArr;
    }

    public static int c(int i4, int i10, int i11) {
        int i12 = i10 - i4;
        if ((i4 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r5.c.h(i4, "Beginning index: ", " < 0"));
        }
        if (i10 < i4) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a0.g.i(i10, i11, "End index: ", " >= "));
    }

    public static g d(int i4, int i10, byte[] bArr) {
        byte[] bArrCopyOfRange;
        c(i4, i4 + i10, bArr.length);
        switch (f973d.f960a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i10 + i4);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i4, bArrCopyOfRange, 0, i10);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte a(int i4) {
        return this.f975b[i4];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i4 = this.f974a;
        int i10 = gVar.f974a;
        if (i4 != 0 && i10 != 0 && i4 != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbW = je.u.w(size, "Ran off end of other: 0, ", ", ");
            sbW.append(gVar.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        byte[] bArr = gVar.f975b;
        int iG = g() + size;
        int iG2 = g();
        int iG3 = gVar.g();
        while (iG2 < iG) {
            if (this.f975b[iG2] != bArr[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public void f(int i4, byte[] bArr) {
        System.arraycopy(this.f975b, 0, bArr, 0, i4);
    }

    public int g() {
        return 0;
    }

    public final int hashCode() {
        int i4 = this.f974a;
        if (i4 != 0) {
            return i4;
        }
        int size = size();
        int iG = g();
        int i10 = size;
        for (int i11 = iG; i11 < iG + size; i11++) {
            i10 = (i10 * 31) + this.f975b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f974a = i10;
        return i10;
    }

    public byte i(int i4) {
        return this.f975b[i4];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f975b.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = wb.e.q(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iC = c(0, 47, size());
            sb2.append(wb.e.q(iC == 0 ? f972c : new f(this.f975b, g(), iC)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return d.h.w(sb3, string, "\">");
    }
}
