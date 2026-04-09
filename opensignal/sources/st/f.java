package st;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f22285a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22286b;

    /* renamed from: c, reason: collision with root package name */
    public final ar.k f22287c;

    public f(j jVar, boolean z10, ar.k kVar) {
        this.f22285a = jVar;
        this.f22286b = z10;
        this.f22287c = kVar;
    }

    @Override // st.j
    public final Iterator iterator() {
        return new e(this);
    }
}
