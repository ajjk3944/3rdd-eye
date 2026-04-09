package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final g f1276g = new g(c0.f1254b);

    /* renamed from: r, reason: collision with root package name */
    public static final e f1277r;

    /* renamed from: a, reason: collision with root package name */
    public int f1278a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1279d;

    static {
        f1277r = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f1279d = bArr;
    }

    public static int b(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(h0.b.m("Beginning index: ", i10, " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(h0.b.l("Beginning index larger than ending index: ", i10, i11, ", "));
        }
        throw new IndexOutOfBoundsException(h0.b.l("End index: ", i11, i12, " >= "));
    }

    public static g c(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange;
        b(i10, i10 + i11, bArr.length);
        switch (f1277r.f1263a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte a(int i10) {
        return this.f1279d[i10];
    }

    public void d(int i10, byte[] bArr) {
        System.arraycopy(this.f1279d, 0, bArr, 0, i10);
    }

    public int e() {
        return 0;
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
        int i10 = this.f1278a;
        int i11 = gVar.f1278a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbU = h0.b.u("Ran off end of other: 0, ", size, ", ");
            sbU.append(gVar.size());
            throw new IllegalArgumentException(sbU.toString());
        }
        byte[] bArr = gVar.f1279d;
        int iE = e() + size;
        int iE2 = e();
        int iE3 = gVar.e();
        while (iE2 < iE) {
            if (this.f1279d[iE2] != bArr[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte g(int i10) {
        return this.f1279d[i10];
    }

    public final int hashCode() {
        int i10 = this.f1278a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iE = e();
        int i11 = size;
        for (int i12 = iE; i12 < iE + size; i12++) {
            i11 = (i11 * 31) + this.f1279d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f1278a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f1279d.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = i3.g.m(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iB = b(0, 47, size());
            sb2.append(i3.g.m(iB == 0 ? f1276g : new f(this.f1279d, e(), iB)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return w.g.j(sb3, string, "\">");
    }
}
