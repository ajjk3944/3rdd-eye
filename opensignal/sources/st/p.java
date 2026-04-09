package st;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f22304a;

    /* renamed from: b, reason: collision with root package name */
    public final ar.k f22305b;

    public p(j jVar, ar.k kVar) {
        br.l.e(kVar, "transformer");
        this.f22304a = jVar;
        this.f22305b = kVar;
    }

    @Override // st.j
    public final Iterator iterator() {
        return new o(this);
    }
}
