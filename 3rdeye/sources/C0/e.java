package C0;

import N7.H7;
import android.graphics.Insets;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f800e = new e(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f804d;

    /* compiled from: Insets.java */
    public static class a {
        public static Insets a(int i, int i10, int i11, int i12) {
            return Insets.of(i, i10, i11, i12);
        }
    }

    public e(int i, int i10, int i11, int i12) {
        this.f801a = i;
        this.f802b = i10;
        this.f803c = i11;
        this.f804d = i12;
    }

    public static e a(e eVar, e eVar2) {
        return b(Math.max(eVar.f801a, eVar2.f801a), Math.max(eVar.f802b, eVar2.f802b), Math.max(eVar.f803c, eVar2.f803c), Math.max(eVar.f804d, eVar2.f804d));
    }

    public static e b(int i, int i10, int i11, int i12) {
        return (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f800e : new e(i, i10, i11, i12);
    }

    public static e c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f801a, this.f802b, this.f803c, this.f804d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f804d == eVar.f804d && this.f801a == eVar.f801a && this.f803c == eVar.f803c && this.f802b == eVar.f802b;
    }

    public final int hashCode() {
        return (((((this.f801a * 31) + this.f802b) * 31) + this.f803c) * 31) + this.f804d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f801a);
        sb.append(", top=");
        sb.append(this.f802b);
        sb.append(", right=");
        sb.append(this.f803c);
        sb.append(", bottom=");
        return H7.p(sb, this.f804d, '}');
    }
}
