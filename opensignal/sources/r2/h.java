package r2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f21203a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f21203a == ((h) obj).f21203a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21203a);
    }

    public final String toString() {
        int i10 = this.f21203a;
        return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
