package bj;

import Xi.n;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f33461a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f33462b;

    /* renamed from: c, reason: collision with root package name */
    private int f33463c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33464a = new a();

        private a() {
        }
    }

    public u() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f33462b = iArr;
        this.f33463c = -1;
    }

    private final void e() {
        int i10 = this.f33463c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f33461a, i10);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        this.f33461a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f33462b, i10);
        AbstractC6492s.h(iArrCopyOf, "copyOf(...)");
        this.f33462b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f33463c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f33461a[i11];
            if (obj instanceof Xi.f) {
                Xi.f fVar = (Xi.f) obj;
                if (!AbstractC6492s.d(fVar.h(), n.b.f24471a)) {
                    int i12 = this.f33462b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.f(i12));
                    }
                } else if (this.f33462b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f33462b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f33464a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f33463c;
        int[] iArr = this.f33462b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f33463c = i10 - 1;
        }
        int i11 = this.f33463c;
        if (i11 != -1) {
            this.f33463c = i11 - 1;
        }
    }

    public final void c(Xi.f sd2) {
        AbstractC6492s.i(sd2, "sd");
        int i10 = this.f33463c + 1;
        this.f33463c = i10;
        if (i10 == this.f33461a.length) {
            e();
        }
        this.f33461a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f33462b;
        int i10 = this.f33463c;
        if (iArr[i10] == -2) {
            this.f33461a[i10] = a.f33464a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f33462b;
        int i10 = this.f33463c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f33463c = i11;
            if (i11 == this.f33461a.length) {
                e();
            }
        }
        Object[] objArr = this.f33461a;
        int i12 = this.f33463c;
        objArr[i12] = obj;
        this.f33462b[i12] = -2;
    }

    public final void g(int i10) {
        this.f33462b[this.f33463c] = i10;
    }

    public String toString() {
        return a();
    }
}
