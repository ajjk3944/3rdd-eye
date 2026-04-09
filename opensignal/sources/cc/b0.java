package cc;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3604b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3605c;

    public b0(String str, boolean z10) {
        s.e(str);
        this.f3603a = str;
        s.e("com.google.android.gms");
        this.f3604b = "com.google.android.gms";
        this.f3605c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return s.k(this.f3603a, b0Var.f3603a) && s.k(this.f3604b, b0Var.f3604b) && s.k(null, null) && this.f3605c == b0Var.f3605c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3603a, this.f3604b, null, 4225, Boolean.valueOf(this.f3605c)});
    }

    public final String toString() {
        String str = this.f3603a;
        if (str != null) {
            return str;
        }
        s.h(null);
        throw null;
    }
}
