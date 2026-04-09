package y3;

import java.util.Set;
import v3.C5677c;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes.dex */
public final class s implements v3.i {

    /* renamed from: a, reason: collision with root package name */
    public final Set<C5677c> f48093a;

    /* renamed from: b, reason: collision with root package name */
    public final j f48094b;

    /* renamed from: c, reason: collision with root package name */
    public final u f48095c;

    public s(Set set, j jVar, u uVar) {
        this.f48093a = set;
        this.f48094b = jVar;
        this.f48095c = uVar;
    }

    @Override // v3.i
    public final t a(String str, C5677c c5677c, v3.g gVar) {
        Set<C5677c> set = this.f48093a;
        if (set.contains(c5677c)) {
            return new t(this.f48094b, str, c5677c, gVar, this.f48095c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c5677c, set));
    }
}
