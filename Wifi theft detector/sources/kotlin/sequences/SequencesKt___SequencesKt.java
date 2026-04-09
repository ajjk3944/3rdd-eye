package kotlin.sequences;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import z8.v;

/* loaded from: classes4.dex */
public abstract class SequencesKt___SequencesKt extends n {

    public static final class a implements Iterable, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f22079a;

        public a(g gVar) {
            this.f22079a = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f22079a.iterator();
        }
    }

    public static final class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f22080a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f22081b;

        public b(g gVar, Comparator comparator) {
            this.f22080a = gVar;
            this.f22081b = comparator;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            List listV = SequencesKt___SequencesKt.v(this.f22080a);
            v.v(listV, this.f22081b);
            return listV.iterator();
        }
    }

    public static Iterable i(g gVar) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        return new a(gVar);
    }

    public static g j(g gVar, int i10) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? gVar : gVar instanceof c ? ((c) gVar).a(i10) : new kotlin.sequences.b(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static g k(g gVar, l9.l predicate) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(predicate, "predicate");
        return new e(gVar, true, predicate);
    }

    public static final Appendable l(g gVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) throws IOException {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(buffer, "buffer");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : gVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            s9.h.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String m(g gVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
        return ((StringBuilder) l(gVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String n(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l9.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l9.l lVar2 = lVar;
        return m(gVar, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static g o(g gVar, l9.l transform) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(transform, "transform");
        return new r(gVar, transform);
    }

    public static g p(g gVar, Object obj, l9.p operation) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(operation, "operation");
        return j.b(new SequencesKt___SequencesKt$runningFold$1(obj, gVar, operation, null));
    }

    public static g q(g gVar, Comparator comparator) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(comparator, "comparator");
        return new b(gVar, comparator);
    }

    public static g r(g gVar, int i10) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? m.f() : gVar instanceof c ? ((c) gVar).b(i10) : new p(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static g s(g gVar, l9.l predicate) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(predicate, "predicate");
        return new q(gVar, predicate);
    }

    public static final Collection t(g gVar, Collection destination) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        kotlin.jvm.internal.p.e(destination, "destination");
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List u(g gVar) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return z8.r.j();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return z8.q.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final List v(g gVar) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        return (List) t(gVar, new ArrayList());
    }
}
