package Ei;

import java.util.Map;

/* loaded from: classes4.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Hi.a.a(h());
        q(g() + 2);
        return new b(f()[g() - 2], f()[g() - 1]);
    }
}
