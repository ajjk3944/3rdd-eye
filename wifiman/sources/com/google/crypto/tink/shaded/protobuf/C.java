package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
abstract class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f38428a;

    /* renamed from: b, reason: collision with root package name */
    private static final C f38429b;

    private static final class b extends C {

        /* renamed from: c, reason: collision with root package name */
        private static final Class f38430c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) l0.C(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static List g(Object obj, long j10, int i10) {
            A a10;
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                List a11 = listF instanceof B ? new A(i10) : ((listF instanceof W) && (listF instanceof AbstractC5097y.d)) ? ((AbstractC5097y.d) listF).p(i10) : new ArrayList(i10);
                l0.R(obj, j10, a11);
                return a11;
            }
            if (f38430c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                l0.R(obj, j10, arrayList);
                a10 = arrayList;
            } else {
                if (!(listF instanceof k0)) {
                    if (!(listF instanceof W) || !(listF instanceof AbstractC5097y.d)) {
                        return listF;
                    }
                    AbstractC5097y.d dVar = (AbstractC5097y.d) listF;
                    if (dVar.E()) {
                        return listF;
                    }
                    AbstractC5097y.d dVarP = dVar.p(listF.size() + i10);
                    l0.R(obj, j10, dVarP);
                    return dVarP;
                }
                A a12 = new A(listF.size() + i10);
                a12.addAll((k0) listF);
                l0.R(obj, j10, a12);
                a10 = a12;
            }
            return a10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) l0.C(obj, j10);
            if (list instanceof B) {
                objUnmodifiableList = ((B) list).h();
            } else {
                if (f38430c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof W) && (list instanceof AbstractC5097y.d)) {
                    AbstractC5097y.d dVar = (AbstractC5097y.d) list;
                    if (dVar.E()) {
                        dVar.n();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            l0.R(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
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
            l0.R(obj, j10, listF);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends C {
        private c() {
            super();
        }

        static AbstractC5097y.d f(Object obj, long j10) {
            return (AbstractC5097y.d) l0.C(obj, j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
        void c(Object obj, long j10) {
            f(obj, j10).n();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
        void d(Object obj, Object obj2, long j10) {
            AbstractC5097y.d dVarF = f(obj, j10);
            AbstractC5097y.d dVarF2 = f(obj2, j10);
            int size = dVarF.size();
            int size2 = dVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!dVarF.E()) {
                    dVarF = dVarF.p(size2 + size);
                }
                dVarF.addAll(dVarF2);
            }
            if (size > 0) {
                dVarF2 = dVarF;
            }
            l0.R(obj, j10, dVarF2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C
        List e(Object obj, long j10) {
            AbstractC5097y.d dVarF = f(obj, j10);
            if (dVarF.E()) {
                return dVarF;
            }
            int size = dVarF.size();
            AbstractC5097y.d dVarP = dVarF.p(size == 0 ? 10 : size * 2);
            l0.R(obj, j10, dVarP);
            return dVarP;
        }
    }

    static {
        f38428a = new b();
        f38429b = new c();
    }

    static C a() {
        return f38428a;
    }

    static C b() {
        return f38429b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);

    private C() {
    }
}
