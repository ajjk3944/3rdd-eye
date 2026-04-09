package zi;

import Zg.AbstractC3671c;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: zi.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8772b extends AbstractC3671c {

    /* renamed from: c, reason: collision with root package name */
    private final Iterator f67331c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6835l f67332d;

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f67333e;

    public C8772b(Iterator source, InterfaceC6835l keySelector) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(keySelector, "keySelector");
        this.f67331c = source;
        this.f67332d = keySelector;
        this.f67333e = new HashSet();
    }

    @Override // Zg.AbstractC3671c
    protected void d() {
        while (this.f67331c.hasNext()) {
            Object next = this.f67331c.next();
            if (this.f67333e.add(this.f67332d.invoke(next))) {
                f(next);
                return;
            }
        }
        e();
    }
}
