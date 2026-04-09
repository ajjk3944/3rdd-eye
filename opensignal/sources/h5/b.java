package h5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9904a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9905b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9906c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9907d;

    public b(String str, int i10, int i11, String str2) {
        this.f9904a = str;
        this.f9905b = str2;
        this.f9906c = i10;
        this.f9907d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9906c == bVar.f9906c && this.f9907d == bVar.f9907d && a.a.k(this.f9904a, bVar.f9904a) && a.a.k(this.f9905b, bVar.f9905b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9904a, this.f9905b, Integer.valueOf(this.f9906c), Integer.valueOf(this.f9907d)});
    }
}
