package Ei;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class y extends u {

    /* renamed from: d, reason: collision with root package name */
    private final i f4806d;

    public y(i parentIterator) {
        AbstractC6492s.i(parentIterator, "parentIterator");
        this.f4806d = parentIterator;
    }

    @Override // java.util.Iterator
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Hi.a.a(h());
        q(g() + 2);
        return new c(this.f4806d, f()[g() - 2], f()[g() - 1]);
    }
}
