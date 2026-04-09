package Q6;

import N7.B8;

/* compiled from: ErrorViewModel.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11347d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11348e;

    public j() {
        this(0);
    }

    public static j a(j jVar, boolean z10, int i, int i10, String str, String str2, int i11) {
        if ((i11 & 1) != 0) {
            z10 = jVar.f11344a;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            i = jVar.f11345b;
        }
        int i12 = i;
        if ((i11 & 4) != 0) {
            i10 = jVar.f11346c;
        }
        int i13 = i10;
        if ((i11 & 8) != 0) {
            str = jVar.f11347d;
        }
        String errorDetails = str;
        if ((i11 & 16) != 0) {
            str2 = jVar.f11348e;
        }
        String warningDetails = str2;
        jVar.getClass();
        kotlin.jvm.internal.l.f(errorDetails, "errorDetails");
        kotlin.jvm.internal.l.f(warningDetails, "warningDetails");
        return new j(z11, i12, i13, errorDetails, warningDetails);
    }

    public final String b() {
        int i = this.f11346c;
        int i10 = this.f11345b;
        if (i10 <= 0 || i <= 0) {
            return i > 0 ? String.valueOf(i) : i10 > 0 ? String.valueOf(i10) : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i10);
        sb.append('/');
        sb.append(i);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f11344a == jVar.f11344a && this.f11345b == jVar.f11345b && this.f11346c == jVar.f11346c && kotlin.jvm.internal.l.b(this.f11347d, jVar.f11347d) && kotlin.jvm.internal.l.b(this.f11348e, jVar.f11348e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z10 = this.f11344a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return this.f11348e.hashCode() + B4.g.n(((((r02 * 31) + this.f11345b) * 31) + this.f11346c) * 31, 31, this.f11347d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorViewModel(showDetails=");
        sb.append(this.f11344a);
        sb.append(", errorCount=");
        sb.append(this.f11345b);
        sb.append(", warningCount=");
        sb.append(this.f11346c);
        sb.append(", errorDetails=");
        sb.append(this.f11347d);
        sb.append(", warningDetails=");
        return B8.j(sb, this.f11348e, ')');
    }

    public /* synthetic */ j(int i) {
        this(false, 0, 0, "", "");
    }

    public j(boolean z10, int i, int i10, String str, String str2) {
        this.f11344a = z10;
        this.f11345b = i;
        this.f11346c = i10;
        this.f11347d = str;
        this.f11348e = str2;
    }
}
