package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cd1 {
    public final int a;
    public final Uri[] b;
    public final fk1[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final qu1[] g;

    static {
        String str = v23.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public cd1(int i, int[] iArr, fk1[] fk1VarArr, long[] jArr, String[] strArr, qu1[] qu1VarArr) {
        Uri uri;
        int length = iArr.length;
        int length2 = fk1VarArr.length;
        int i2 = 0;
        zt0.D(length == length2);
        zt0.D(length == qu1VarArr.length);
        this.a = i;
        this.d = iArr;
        this.c = fk1VarArr;
        this.e = jArr;
        this.b = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 >= uriArr.length) {
                this.f = strArr;
                this.g = qu1VarArr;
                return;
            }
            fk1 fk1Var = fk1VarArr[i2];
            if (fk1Var == null) {
                uri = null;
            } else {
                kh1 kh1Var = fk1Var.b;
                kh1Var.getClass();
                uri = kh1Var.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cd1.class == obj.getClass()) {
            cd1 cd1Var = (cd1) obj;
            if (this.a == cd1Var.a && Arrays.equals(this.c, cd1Var.c) && Arrays.equals(this.d, cd1Var.d) && Arrays.equals(this.e, cd1Var.e) && Arrays.equals(this.f, cd1Var.f) && Arrays.equals(this.g, cd1Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
