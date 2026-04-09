package zi;

import Zg.AbstractC3682n;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zi.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8790t extends AbstractC8785o {

    /* renamed from: zi.t$a */
    public static final class a implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f67367a;

        public a(Iterator it) {
            this.f67367a = it;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            return this.f67367a;
        }
    }

    public static InterfaceC8780j g(Iterator it) {
        AbstractC6492s.i(it, "<this>");
        return AbstractC8783m.h(new a(it));
    }

    public static InterfaceC8780j h(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return interfaceC8780j instanceof C8771a ? interfaceC8780j : new C8771a(interfaceC8780j);
    }

    public static InterfaceC8780j i() {
        return C8776f.f67340a;
    }

    public static InterfaceC8780j j(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return k(interfaceC8780j, new InterfaceC6835l() { // from class: zi.r
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8790t.l((InterfaceC8780j) obj);
            }
        });
    }

    private static final InterfaceC8780j k(InterfaceC8780j interfaceC8780j, InterfaceC6835l interfaceC6835l) {
        return interfaceC8780j instanceof C8770B ? ((C8770B) interfaceC8780j).e(interfaceC6835l) : new C8778h(interfaceC8780j, new InterfaceC6835l() { // from class: zi.s
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8790t.m(obj);
            }
        }, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator l(InterfaceC8780j it) {
        AbstractC6492s.i(it, "it");
        return it.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(Object obj) {
        return obj;
    }

    public static InterfaceC8780j n(final Object obj, InterfaceC6835l nextFunction) {
        AbstractC6492s.i(nextFunction, "nextFunction");
        return obj == null ? C8776f.f67340a : new C8779i(new InterfaceC6824a() { // from class: zi.p
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return AbstractC8790t.r(obj);
            }
        }, nextFunction);
    }

    public static InterfaceC8780j o(final InterfaceC6824a nextFunction) {
        AbstractC6492s.i(nextFunction, "nextFunction");
        return AbstractC8783m.h(new C8779i(nextFunction, new InterfaceC6835l() { // from class: zi.q
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8790t.q(nextFunction, obj);
            }
        }));
    }

    public static InterfaceC8780j p(InterfaceC6824a seedFunction, InterfaceC6835l nextFunction) {
        AbstractC6492s.i(seedFunction, "seedFunction");
        AbstractC6492s.i(nextFunction, "nextFunction");
        return new C8779i(seedFunction, nextFunction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(InterfaceC6824a interfaceC6824a, Object it) {
        AbstractC6492s.i(it, "it");
        return interfaceC6824a.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(Object obj) {
        return obj;
    }

    public static InterfaceC8780j s(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return AbstractC3682n.Q(elements);
    }
}
