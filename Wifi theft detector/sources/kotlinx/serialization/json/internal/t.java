package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f23041a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    public int[] f23042b;

    /* renamed from: c, reason: collision with root package name */
    public int f23043c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23044a = new a();
    }

    public t() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f23042b = iArr;
        this.f23043c = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i10 = this.f23043c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f23041a[i11];
            if (obj instanceof kotlinx.serialization.descriptors.f) {
                kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
                if (!kotlin.jvm.internal.p.a(fVar.getKind(), i.b.f22787a)) {
                    int i12 = this.f23042b[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        sb.append(fVar.e(i12));
                    }
                } else if (this.f23042b[i11] != -1) {
                    sb.append("[");
                    sb.append(this.f23042b[i11]);
                    sb.append("]");
                }
            } else if (obj != a.f23044a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.p.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void b() {
        int i10 = this.f23043c;
        int[] iArr = this.f23042b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f23043c = i10 - 1;
        }
        int i11 = this.f23043c;
        if (i11 != -1) {
            this.f23043c = i11 - 1;
        }
    }

    public final void c(kotlinx.serialization.descriptors.f sd) {
        kotlin.jvm.internal.p.e(sd, "sd");
        int i10 = this.f23043c + 1;
        this.f23043c = i10;
        if (i10 == this.f23041a.length) {
            e();
        }
        this.f23041a[i10] = sd;
    }

    public final void d() {
        int[] iArr = this.f23042b;
        int i10 = this.f23043c;
        if (iArr[i10] == -2) {
            this.f23041a[i10] = a.f23044a;
        }
    }

    public final void e() {
        int i10 = this.f23043c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f23041a, i10);
        kotlin.jvm.internal.p.d(objArrCopyOf, "copyOf(this, newSize)");
        this.f23041a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f23042b, i10);
        kotlin.jvm.internal.p.d(iArrCopyOf, "copyOf(this, newSize)");
        this.f23042b = iArrCopyOf;
    }

    public final void f(Object obj) {
        int[] iArr = this.f23042b;
        int i10 = this.f23043c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f23043c = i11;
            if (i11 == this.f23041a.length) {
                e();
            }
        }
        Object[] objArr = this.f23041a;
        int i12 = this.f23043c;
        objArr[i12] = obj;
        this.f23042b[i12] = -2;
    }

    public final void g(int i10) {
        this.f23042b[this.f23043c] = i10;
    }

    public String toString() {
        return a();
    }
}
