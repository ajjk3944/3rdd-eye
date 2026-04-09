package L2;

import h0.C2351a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2493a;

    /* renamed from: b, reason: collision with root package name */
    public final C2351a f2494b;

    /* renamed from: c, reason: collision with root package name */
    public final K2.b f2495c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2496d;

    public a(C2351a c2351a, K2.b bVar, String str) {
        this.f2494b = c2351a;
        this.f2495c = bVar;
        this.f2496d = str;
        this.f2493a = Arrays.hashCode(new Object[]{c2351a, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return M2.u.g(this.f2494b, aVar.f2494b) && M2.u.g(this.f2495c, aVar.f2495c) && M2.u.g(this.f2496d, aVar.f2496d);
    }

    public final int hashCode() {
        return this.f2493a;
    }
}
