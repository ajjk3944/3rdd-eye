package zi;

import Zg.AbstractC3689v;
import Zg.d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zi.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8794x extends AbstractC8791u {

    /* renamed from: zi.x$a */
    public static final class a implements Iterable, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8780j f67368a;

        public a(InterfaceC8780j interfaceC8780j) {
            this.f67368a = interfaceC8780j;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f67368a.iterator();
        }
    }

    /* renamed from: zi.x$b */
    /* synthetic */ class b extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f67369a = new b();

        b() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable p02) {
            AbstractC6492s.i(p02, "p0");
            return p02.iterator();
        }
    }

    /* renamed from: zi.x$c */
    /* synthetic */ class c extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f67370a = new c();

        c() {
            super(1, InterfaceC8780j.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(InterfaceC8780j p02) {
            AbstractC6492s.i(p02, "p0");
            return p02.iterator();
        }
    }

    /* renamed from: zi.x$d */
    public static final class d implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8780j f67371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f67372b;

        d(InterfaceC8780j interfaceC8780j, Comparator comparator) {
            this.f67371a = interfaceC8780j;
            this.f67372b = comparator;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            List listA0 = AbstractC8783m.a0(this.f67371a);
            AbstractC3689v.B(listA0, this.f67372b);
            return listA0.iterator();
        }
    }

    public static final InterfaceC8780j A(InterfaceC8780j interfaceC8780j, InterfaceC6835l selector) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(selector, "selector");
        return new C8773c(interfaceC8780j, selector);
    }

    public static InterfaceC8780j B(InterfaceC8780j interfaceC8780j, int i10) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? interfaceC8780j : interfaceC8780j instanceof InterfaceC8775e ? ((InterfaceC8775e) interfaceC8780j).b(i10) : new C8774d(interfaceC8780j, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static InterfaceC8780j C(InterfaceC8780j interfaceC8780j, InterfaceC6835l predicate) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return new C8777g(interfaceC8780j, true, predicate);
    }

    public static InterfaceC8780j D(InterfaceC8780j interfaceC8780j, InterfaceC6835l predicate) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return new C8777g(interfaceC8780j, false, predicate);
    }

    public static InterfaceC8780j E(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        InterfaceC8780j interfaceC8780jD = AbstractC8783m.D(interfaceC8780j, new InterfaceC6835l() { // from class: zi.v
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC8794x.F(obj));
            }
        });
        AbstractC6492s.g(interfaceC8780jD, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return interfaceC8780jD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F(Object obj) {
        return obj == null;
    }

    public static Object G(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static InterfaceC8780j H(InterfaceC8780j interfaceC8780j, InterfaceC6835l transform) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(transform, "transform");
        return new C8778h(interfaceC8780j, transform, c.f67370a);
    }

    public static InterfaceC8780j I(InterfaceC8780j interfaceC8780j, InterfaceC6835l transform) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(transform, "transform");
        return new C8778h(interfaceC8780j, transform, b.f67369a);
    }

    public static final Appendable J(InterfaceC8780j interfaceC8780j, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : interfaceC8780j) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.t.a(buffer, obj, interfaceC6835l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String K(InterfaceC8780j interfaceC8780j, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) J(interfaceC8780j, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static /* synthetic */ String L(InterfaceC8780j interfaceC8780j, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return K(interfaceC8780j, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }

    public static Object M(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static InterfaceC8780j N(InterfaceC8780j interfaceC8780j, InterfaceC6835l transform) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(transform, "transform");
        return new C8770B(interfaceC8780j, transform);
    }

    public static InterfaceC8780j O(InterfaceC8780j interfaceC8780j, InterfaceC6835l transform) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(transform, "transform");
        return AbstractC8783m.E(new C8770B(interfaceC8780j, transform));
    }

    public static Comparable P(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static InterfaceC8780j Q(InterfaceC8780j interfaceC8780j, Iterable elements) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(elements, "elements");
        return AbstractC8783m.j(AbstractC8783m.s(interfaceC8780j, AbstractC3689v.d0(elements)));
    }

    public static InterfaceC8780j R(InterfaceC8780j interfaceC8780j, Object obj) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return AbstractC8783m.j(AbstractC8783m.s(interfaceC8780j, AbstractC8783m.s(obj)));
    }

    public static InterfaceC8780j S(InterfaceC8780j interfaceC8780j, InterfaceC8780j elements) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(elements, "elements");
        return AbstractC8783m.j(AbstractC8783m.s(interfaceC8780j, elements));
    }

    public static InterfaceC8780j T(InterfaceC8780j interfaceC8780j, Comparator comparator) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        return new d(interfaceC8780j, comparator);
    }

    public static int U(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static InterfaceC8780j V(InterfaceC8780j interfaceC8780j, int i10) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? AbstractC8783m.i() : interfaceC8780j instanceof InterfaceC8775e ? ((InterfaceC8775e) interfaceC8780j).a(i10) : new C8796z(interfaceC8780j, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static InterfaceC8780j W(InterfaceC8780j interfaceC8780j, InterfaceC6835l predicate) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return new C8769A(interfaceC8780j, predicate);
    }

    public static final Collection X(InterfaceC8780j interfaceC8780j, Collection destination) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        AbstractC6492s.i(destination, "destination");
        Iterator it = interfaceC8780j.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static HashSet Y(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return (HashSet) X(interfaceC8780j, new HashSet());
    }

    public static List Z(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        if (!it.hasNext()) {
            return AbstractC3689v.l();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC3689v.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List a0(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return (List) X(interfaceC8780j, new ArrayList());
    }

    public static Set b0(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        if (!it.hasNext()) {
            return d0.e();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return d0.c(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static boolean v(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return interfaceC8780j.iterator().hasNext();
    }

    public static Iterable w(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return new a(interfaceC8780j);
    }

    public static int x(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        Iterator it = interfaceC8780j.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                AbstractC3689v.u();
            }
        }
        return i10;
    }

    public static InterfaceC8780j y(InterfaceC8780j interfaceC8780j) {
        AbstractC6492s.i(interfaceC8780j, "<this>");
        return A(interfaceC8780j, new InterfaceC6835l() { // from class: zi.w
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC8794x.z(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object z(Object obj) {
        return obj;
    }
}
