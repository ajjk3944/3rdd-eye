package d9;

import androidx.datastore.preferences.protobuf.m;
import bf.n;
import java.io.Closeable;
import java.util.Arrays;
import w.g;

/* loaded from: classes.dex */
public abstract class b implements Closeable {

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f7177x = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f7178a;

    /* renamed from: d, reason: collision with root package name */
    public int[] f7179d;

    /* renamed from: g, reason: collision with root package name */
    public String[] f7180g;

    /* renamed from: r, reason: collision with root package name */
    public int[] f7181r;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f7177x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f7177x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double G();

    public abstract int L();

    public abstract String R();

    public abstract a V();

    public final void Y(int i10) {
        int i11 = this.f7178a;
        int[] iArr = this.f7179d;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new n("Nesting too deep at " + q());
            }
            this.f7179d = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f7180g;
            this.f7180g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f7181r;
            this.f7181r = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f7179d;
        int i12 = this.f7178a;
        this.f7178a = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int Z(io.sentry.internal.debugmeta.c cVar);

    public abstract void b();

    public abstract void f();

    public abstract void f0();

    public abstract void h();

    public abstract void i();

    public abstract void i0();

    public final void n0(String str) throws m {
        StringBuilder sbL = g.l(str, " at path ");
        sbL.append(q());
        throw new m(sbL.toString());
    }

    public final String q() {
        int i10 = this.f7178a;
        int[] iArr = this.f7179d;
        String[] strArr = this.f7180g;
        int[] iArr2 = this.f7181r;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean w();

    public abstract boolean y();
}
