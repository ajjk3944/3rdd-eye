package st;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f22288a;

    /* renamed from: b, reason: collision with root package name */
    public final ar.k f22289b;

    /* renamed from: c, reason: collision with root package name */
    public final ar.k f22290c;

    public g(j jVar, ar.k kVar, ar.k kVar2) {
        br.l.e(kVar, "transformer");
        this.f22288a = jVar;
        this.f22289b = kVar;
        this.f22290c = kVar2;
    }

    @Override // st.j
    public final Iterator iterator() {
        return new e(this);
    }
}
