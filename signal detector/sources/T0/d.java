package T0;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3556b;

    public d(String str) {
        this.f3555a = str;
        this.f3556b = 0;
    }

    public final String a() {
        int i = this.f3556b;
        if (i == 0) {
            return this.f3555a;
        }
        throw new IllegalStateException(AbstractC1135f5.n(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public d(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f3555a = null;
        this.f3556b = 1;
    }
}
