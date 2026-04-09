package Y;

import a0.AbstractC3748a;
import java.util.Map;

/* loaded from: classes.dex */
public final class y extends u {

    /* renamed from: d, reason: collision with root package name */
    private final i f24515d;

    public y(i iVar) {
        this.f24515d = iVar;
    }

    @Override // java.util.Iterator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC3748a.a(h());
        q(g() + 2);
        return new c(this.f24515d, f()[g() - 2], f()[g() - 1]);
    }
}
