package c3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2723b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f2724c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2725a;

    public l(int i4) {
        this.f2725a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f2725a == ((l) obj).f2725a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2725a;
    }

    public final String toString() {
        int i4 = this.f2725a;
        if (i4 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i4 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return r5.c.l(new StringBuilder("TextDecoration["), f3.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
