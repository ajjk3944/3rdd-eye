package cc;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i implements ac.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i f3653c = new i(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f3654b;

    public /* synthetic */ i(String str) {
        this.f3654b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return s.k(this.f3654b, ((i) obj).f3654b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3654b});
    }
}
