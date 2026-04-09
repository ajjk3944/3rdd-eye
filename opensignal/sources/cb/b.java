package cb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3533d;

    public b(String str, int i10, int i11, String str2) {
        this.f3530a = str;
        this.f3531b = str2;
        this.f3532c = i10;
        this.f3533d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3532c == bVar.f3532c && this.f3533d == bVar.f3533d && a.a.k(this.f3530a, bVar.f3530a) && a.a.k(this.f3531b, bVar.f3531b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3530a, this.f3531b, Integer.valueOf(this.f3532c), Integer.valueOf(this.f3533d)});
    }
}
