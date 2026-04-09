package tg;

/* loaded from: classes.dex */
public final class y {
    public static final x Companion = new x();

    /* renamed from: a, reason: collision with root package name */
    public final int f22863a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22864b;

    public y(int i10, String str) {
        br.l.e(str, "uuid");
        this.f22863a = i10;
        this.f22864b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f22863a == yVar.f22863a && br.l.a(this.f22864b, yVar.f22864b);
    }

    public final int hashCode() {
        return this.f22864b.hashCode() + (Integer.hashCode(this.f22863a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessData(pid=");
        sb2.append(this.f22863a);
        sb2.append(", uuid=");
        return h0.b.r(sb2, this.f22864b, ')');
    }

    public /* synthetic */ y(String str, int i10, int i11) {
        if (3 != (i10 & 3)) {
            ku.p0.f(i10, 3, w.f22861a.getDescriptor());
            throw null;
        }
        this.f22863a = i11;
        this.f22864b = str;
    }
}
