package st;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ar.a f22295a;

    /* renamed from: b, reason: collision with root package name */
    public final ar.k f22296b;

    public i(ar.a aVar, ar.k kVar) {
        this.f22295a = aVar;
        this.f22296b = kVar;
    }

    @Override // st.j
    public final Iterator iterator() {
        return new h(this);
    }
}
