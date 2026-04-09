package q7;

import ac.m;
import androidx.datastore.preferences.protobuf.l;
import i3.e;
import java.io.Closeable;
import java.util.Arrays;
import km.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f32199e = new String[128];

    /* renamed from: a, reason: collision with root package name */
    public int f32200a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f32201b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f32202c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f32203d;

    static {
        for (int i4 = 0; i4 <= 31; i4++) {
            f32199e[i4] = String.format("\\u%04x", Integer.valueOf(i4));
        }
        String[] strArr = f32199e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract int A();

    public abstract String E();

    public abstract int F();

    public final void G(int i4) {
        int i10 = this.f32200a;
        int[] iArr = this.f32201b;
        if (i10 == iArr.length) {
            if (i10 == 256) {
                throw new m("Nesting too deep at " + p());
            }
            this.f32201b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32202c;
            this.f32202c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32203d;
            this.f32203d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f32201b;
        int i11 = this.f32200a;
        this.f32200a = i11 + 1;
        iArr3[i11] = i4;
    }

    public abstract int L(n nVar);

    public abstract void N();

    public abstract void O();

    public final void T(String str) throws l {
        StringBuilder sbB = e.b(str, " at path ");
        sbB.append(p());
        throw new l(sbB.toString());
    }

    public abstract void c();

    public abstract void e();

    public abstract void g();

    public abstract void m();

    public final String p() {
        int i4 = this.f32200a;
        int[] iArr = this.f32201b;
        String[] strArr = this.f32202c;
        int[] iArr2 = this.f32203d;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i10 = 0; i10 < i4; i10++) {
            int i11 = iArr[i10];
            if (i11 == 1 || i11 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i10]);
                sb2.append(']');
            } else if (i11 == 3 || i11 == 4 || i11 == 5) {
                sb2.append('.');
                String str = strArr[i10];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    public abstract boolean v();

    public abstract boolean w();

    public abstract double y();
}
