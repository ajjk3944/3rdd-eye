package f1;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5494c extends androidx.constraintlayout.core.parser.b {
    public C5494c(char[] cArr) {
        super(cArr);
    }

    public static C5494c x(String str) {
        C5494c c5494c = new C5494c(str.toCharArray());
        c5494c.w(0L);
        c5494c.u(str.length() - 1);
        return c5494c;
    }

    @Override // androidx.constraintlayout.core.parser.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5494c) && e().equals(((C5494c) obj).e())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // androidx.constraintlayout.core.parser.b
    public int hashCode() {
        return super.hashCode();
    }
}
