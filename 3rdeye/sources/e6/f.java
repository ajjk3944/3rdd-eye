package E6;

import N7.H7;
import kotlin.jvm.internal.l;

/* compiled from: TextDiff.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1472c;

    /* compiled from: TextDiff.kt */
    public static final class a {
        public static f a(String left, String right) {
            l.f(left, "left");
            l.f(right, "right");
            if (left.length() > right.length()) {
                f fVarA = a(right, left);
                return new f(fVarA.f1470a, fVarA.f1472c, fVarA.f1471b);
            }
            int length = right.length() - 1;
            int length2 = right.length() - left.length();
            int i = 0;
            while (i < length && i < left.length() && left.charAt(i) == right.charAt(i)) {
                i++;
            }
            while (true) {
                int i10 = length - length2;
                if (i10 < i || left.charAt(i10) != right.charAt(length)) {
                    break;
                }
                length--;
            }
            int i11 = (length + 1) - i;
            return new f(i, i11, i11 - length2);
        }
    }

    public f(int i, int i10, int i11) {
        this.f1470a = i;
        this.f1471b = i10;
        this.f1472c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f1470a == fVar.f1470a && this.f1471b == fVar.f1471b && this.f1472c == fVar.f1472c;
    }

    public final int hashCode() {
        return (((this.f1470a * 31) + this.f1471b) * 31) + this.f1472c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextDiff(start=");
        sb.append(this.f1470a);
        sb.append(", added=");
        sb.append(this.f1471b);
        sb.append(", removed=");
        return H7.p(sb, this.f1472c, ')');
    }
}
