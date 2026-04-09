package x3;

import java.util.Set;

/* loaded from: classes2.dex */
public final class p implements u3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f24952a;

    /* renamed from: b, reason: collision with root package name */
    public final o f24953b;

    /* renamed from: c, reason: collision with root package name */
    public final s f24954c;

    public p(Set set, o oVar, s sVar) {
        this.f24952a = set;
        this.f24953b = oVar;
        this.f24954c = sVar;
    }

    @Override // u3.f
    public u3.e a(String str, Class cls, u3.b bVar, u3.d dVar) {
        if (this.f24952a.contains(bVar)) {
            return new r(this.f24953b, str, bVar, dVar, this.f24954c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f24952a));
    }
}
