package ch;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ch.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4263d {
    public static Comparator c(final InterfaceC6835l... selectors) {
        AbstractC6492s.i(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: ch.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC4263d.d(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC6835l[] interfaceC6835lArr, Object obj, Object obj2) {
        return f(obj, obj2, interfaceC6835lArr);
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    private static final int f(Object obj, Object obj2, InterfaceC6835l[] interfaceC6835lArr) {
        for (InterfaceC6835l interfaceC6835l : interfaceC6835lArr) {
            int iE = AbstractC4260a.e((Comparable) interfaceC6835l.invoke(obj), (Comparable) interfaceC6835l.invoke(obj2));
            if (iE != 0) {
                return iE;
            }
        }
        return 0;
    }

    public static Comparator g() {
        g gVar = g.f34022a;
        AbstractC6492s.g(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return gVar;
    }

    public static Comparator h() {
        h hVar = h.f34023a;
        AbstractC6492s.g(hVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return hVar;
    }

    public static Comparator i(final Comparator comparator, final Comparator comparator2) {
        AbstractC6492s.i(comparator, "<this>");
        AbstractC6492s.i(comparator2, "comparator");
        return new Comparator() { // from class: ch.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC4263d.j(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }
}
