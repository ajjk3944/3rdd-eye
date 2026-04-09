package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class i40 implements Closeable {
    public static final String[] j = new String[128];
    public int f;
    public int[] g;
    public String[] h;
    public int[] i;

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract void a();

    public abstract void c();

    public abstract void f();

    public abstract void g();

    public final String h() {
        int i = this.f;
        int[] iArr = this.g;
        String[] strArr = this.h;
        int[] iArr2 = this.i;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean i();

    public abstract boolean k();

    public abstract double l();

    public abstract int m();

    public abstract String n();

    public abstract int o();

    public final void p(int i) {
        int i2 = this.f;
        int[] iArr = this.g;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new rg("Nesting too deep at " + h());
            }
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.i;
            this.i = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.g;
        int i3 = this.f;
        this.f = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int q(l92 l92Var);

    public abstract void r();

    public abstract void s();

    public final void t(String str) throws h40 {
        throw new h40(str + " at path " + h());
    }
}
