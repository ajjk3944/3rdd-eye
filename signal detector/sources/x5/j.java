package x5;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class j implements Iterable, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f24201a;

    public j(f fVar) {
        this.f24201a = fVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new y5.b(this.f24201a);
    }
}
