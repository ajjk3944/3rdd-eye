package bf;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2148a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2149b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f2148a = str;
        this.f2149b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2148a.equals(aVar.f2148a) && this.f2149b.equals(aVar.f2149b);
    }

    public final int hashCode() {
        return ((this.f2148a.hashCode() ^ 1000003) * 1000003) ^ this.f2149b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f2148a + ", usedDates=" + this.f2149b + "}";
    }
}
