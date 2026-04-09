package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Zg.AbstractC3689v;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public interface h extends Iterable, InterfaceC6944a {

    /* renamed from: c1, reason: collision with root package name */
    public static final a f51914c1 = a.f51915a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f51915a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final h f51916b = new C1920a();

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.h$a$a, reason: collision with other inner class name */
        public static final class C1920a implements h {
            C1920a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
            public boolean P(Zh.c cVar) {
                return b.b(this, cVar);
            }

            public Void b(Zh.c fqName) {
                AbstractC6492s.i(fqName, "fqName");
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return AbstractC3689v.l().iterator();
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.h
            public /* bridge */ /* synthetic */ c l(Zh.c cVar) {
                return (c) b(cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final h a(List annotations) {
            AbstractC6492s.i(annotations, "annotations");
            return annotations.isEmpty() ? f51916b : new i(annotations);
        }

        public final h b() {
            return f51916b;
        }
    }

    public static final class b {
        public static c a(h hVar, Zh.c fqName) {
            Object next;
            AbstractC6492s.i(fqName, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC6492s.d(((c) next).e(), fqName)) {
                    break;
                }
            }
            return (c) next;
        }

        public static boolean b(h hVar, Zh.c fqName) {
            AbstractC6492s.i(fqName, "fqName");
            return hVar.l(fqName) != null;
        }
    }

    boolean P(Zh.c cVar);

    boolean isEmpty();

    c l(Zh.c cVar);
}
