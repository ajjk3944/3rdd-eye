package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3987x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f30766a;

    /* renamed from: b, reason: collision with root package name */
    private static final C f30767b;

    private static final class b extends C {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f30768c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) m0.A(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j10, int i10) {
            A a10;
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                List a11 = listF instanceof B ? new A(i10) : ((listF instanceof W) && (listF instanceof AbstractC3987x.b)) ? ((AbstractC3987x.b) listF).p(i10) : new ArrayList(i10);
                m0.O(obj, j10, a11);
                return a11;
            }
            if (f30768c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                m0.O(obj, j10, arrayList);
                a10 = arrayList;
            } else {
                if (!(listF instanceof l0)) {
                    if (!(listF instanceof W) || !(listF instanceof AbstractC3987x.b)) {
                        return listF;
                    }
                    AbstractC3987x.b bVar = (AbstractC3987x.b) listF;
                    if (bVar.E()) {
                        return listF;
                    }
                    AbstractC3987x.b bVarP = bVar.p(listF.size() + i10);
                    m0.O(obj, j10, bVarP);
                    return bVarP;
                }
                A a12 = new A(listF.size() + i10);
                a12.addAll((l0) listF);
                m0.O(obj, j10, a12);
                a10 = a12;
            }
            return a10;
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) m0.A(obj, j10);
            if (list instanceof B) {
                objUnmodifiableList = ((B) list).h();
            } else {
                if (f30768c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof W) && (list instanceof AbstractC3987x.b)) {
                    AbstractC3987x.b bVar = (AbstractC3987x.b) list;
                    if (bVar.E()) {
                        bVar.n();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            m0.O(obj, j10, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            m0.O(obj, j10, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends C {
        private c() {
            super();
        }

        static AbstractC3987x.b f(Object obj, long j10) {
            return (AbstractC3987x.b) m0.A(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void c(Object obj, long j10) {
            f(obj, j10).n();
        }

        @Override // androidx.datastore.preferences.protobuf.C
        void d(Object obj, Object obj2, long j10) {
            AbstractC3987x.b bVarF = f(obj, j10);
            AbstractC3987x.b bVarF2 = f(obj2, j10);
            int size = bVarF.size();
            int size2 = bVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!bVarF.E()) {
                    bVarF = bVarF.p(size2 + size);
                }
                bVarF.addAll(bVarF2);
            }
            if (size > 0) {
                bVarF2 = bVarF;
            }
            m0.O(obj, j10, bVarF2);
        }

        @Override // androidx.datastore.preferences.protobuf.C
        List e(Object obj, long j10) {
            AbstractC3987x.b bVarF = f(obj, j10);
            if (bVarF.E()) {
                return bVarF;
            }
            int size = bVarF.size();
            AbstractC3987x.b bVarP = bVarF.p(size == 0 ? 10 : size * 2);
            m0.O(obj, j10, bVarP);
            return bVarP;
        }
    }

    static {
        f30766a = new b();
        f30767b = new c();
    }

    static C a() {
        return f30766a;
    }

    static C b() {
        return f30767b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);

    private C() {
    }
}
