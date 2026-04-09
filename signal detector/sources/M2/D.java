package M2;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f2712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2713b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2714c;

    public D(String str, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f2712a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f2713b = "com.google.android.gms";
        this.f2714c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d6 = (D) obj;
        return u.g(this.f2712a, d6.f2712a) && u.g(this.f2713b, d6.f2713b) && u.g(null, null) && this.f2714c == d6.f2714c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2712a, this.f2713b, null, 4225, Boolean.valueOf(this.f2714c)});
    }

    public final String toString() {
        String str = this.f2712a;
        if (str != null) {
            return str;
        }
        u.e(null);
        throw null;
    }
}
