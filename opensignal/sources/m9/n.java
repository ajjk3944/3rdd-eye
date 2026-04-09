package m9;

import java.util.Set;

/* loaded from: classes.dex */
public final class n implements j9.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16367a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16368b;

    /* renamed from: c, reason: collision with root package name */
    public final o f16369c;

    public n(Set set, i iVar, o oVar) {
        this.f16367a = set;
        this.f16368b = iVar;
        this.f16369c = oVar;
    }

    public final cj.a a(String str, j9.c cVar, j9.e eVar) {
        Set set = this.f16367a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        return new cj.a(this.f16368b, str, cVar, eVar, this.f16369c, 23);
    }
}
