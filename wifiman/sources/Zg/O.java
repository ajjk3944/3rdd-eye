package Zg;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class O implements Iterable, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f25342a;

    public O(InterfaceC6824a iteratorFactory) {
        AbstractC6492s.i(iteratorFactory, "iteratorFactory");
        this.f25342a = iteratorFactory;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new P((Iterator) this.f25342a.invoke());
    }
}
