package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class m extends k {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f22106a;

        public a(Iterator it) {
            this.f22106a = it;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return this.f22106a;
        }
    }

    public static g d(Iterator it) {
        kotlin.jvm.internal.p.e(it, "<this>");
        return e(new a(it));
    }

    public static g e(g gVar) {
        kotlin.jvm.internal.p.e(gVar, "<this>");
        return gVar instanceof kotlin.sequences.a ? gVar : new kotlin.sequences.a(gVar);
    }

    public static final g f() {
        return d.f22087a;
    }

    public static g g(final l9.a nextFunction) {
        kotlin.jvm.internal.p.e(nextFunction, "nextFunction");
        return e(new f(nextFunction, new l9.l() { // from class: kotlin.sequences.l
            @Override // l9.l
            public final Object invoke(Object obj) {
                return m.h(nextFunction, obj);
            }
        }));
    }

    public static final Object h(l9.a aVar, Object it) {
        kotlin.jvm.internal.p.e(it, "it");
        return aVar.invoke();
    }
}
