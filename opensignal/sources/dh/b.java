package dh;

import w.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7344b;

    public b(String str, String str2) {
        this.f7343a = str;
        this.f7344b = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Endpoint{name='");
        sb2.append(this.f7343a);
        sb2.append("', url='");
        return g.j(sb2, this.f7344b, "'}");
    }
}
