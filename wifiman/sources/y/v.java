package Y;

import a0.AbstractC3748a;
import java.util.Map;

/* loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        AbstractC3748a.a(h());
        q(g() + 2);
        return new b(f()[g() - 2], f()[g() - 1]);
    }
}
