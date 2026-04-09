package sh;

import br.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final kk.b f22056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22058c;

    public c(kk.b bVar, String str, String str2) {
        this.f22056a = bVar;
        this.f22057b = str;
        this.f22058c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22056a == cVar.f22056a && l.a(this.f22057b, cVar.f22057b) && l.a(this.f22058c, cVar.f22058c);
    }

    public final int hashCode() {
        return this.f22058c.hashCode() + c7.a.g(this.f22057b, this.f22056a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteUrlParameters(platform=");
        sb2.append(this.f22056a);
        sb2.append(", quality=");
        sb2.append(this.f22057b);
        sb2.append(", videoId=");
        return h0.b.r(sb2, this.f22058c, ')');
    }
}
