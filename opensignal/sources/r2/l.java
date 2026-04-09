package r2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f21208b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f21209c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f21210a;

    public l(int i10) {
        this.f21210a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f21210a == ((l) obj).f21210a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21210a;
    }

    public final String toString() {
        int i10 = this.f21210a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return h0.b.r(new StringBuilder("TextDecoration["), v2.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
