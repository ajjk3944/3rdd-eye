package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema.java */
/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15542a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f15543b = new b();

    /* compiled from: ListFieldSchema.java */
    public static final class a extends F {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?> f15544c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static <L> List<L> d(Object obj, long j4, int i) {
            List<L> list = (List) o0.f15681d.i(obj, j4);
            if (list.isEmpty()) {
                List<L> d10 = list instanceof E ? new D(i) : ((list instanceof Z) && (list instanceof C1746y.c)) ? ((C1746y.c) list).mutableCopyWithCapacity(i) : new ArrayList<>(i);
                o0.o(obj, j4, d10);
                return d10;
            }
            if (f15544c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                o0.o(obj, j4, arrayList);
                return arrayList;
            }
            if (list instanceof n0) {
                D d11 = new D(list.size() + i);
                d11.addAll((n0) list);
                o0.o(obj, j4, d11);
                return d11;
            }
            if ((list instanceof Z) && (list instanceof C1746y.c)) {
                C1746y.c cVar = (C1746y.c) list;
                if (!cVar.isModifiable()) {
                    C1746y.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(list.size() + i);
                    o0.o(obj, j4, cVarMutableCopyWithCapacity);
                    return cVarMutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public final void a(Object obj, long j4) {
            Object objUnmodifiableList;
            List list = (List) o0.f15681d.i(obj, j4);
            if (list instanceof E) {
                objUnmodifiableList = ((E) list).getUnmodifiableView();
            } else {
                if (f15544c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Z) && (list instanceof C1746y.c)) {
                    C1746y.c cVar = (C1746y.c) list;
                    if (cVar.isModifiable()) {
                        cVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            o0.o(obj, j4, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public final void b(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, long j4) {
            List list = (List) o0.f15681d.i(abstractC1744w2, j4);
            List listD = d(abstractC1744w, j4, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            o0.o(abstractC1744w, j4, list);
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public final <L> List<L> c(Object obj, long j4) {
            return d(obj, j4, 10);
        }
    }

    /* compiled from: ListFieldSchema.java */
    public static final class b extends F {
        @Override // androidx.datastore.preferences.protobuf.F
        public final void a(Object obj, long j4) {
            ((C1746y.c) o0.f15681d.i(obj, j4)).makeImmutable();
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public final void b(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, long j4) {
            o0.e eVar = o0.f15681d;
            C1746y.c cVarMutableCopyWithCapacity = (C1746y.c) eVar.i(abstractC1744w, j4);
            C1746y.c cVar = (C1746y.c) eVar.i(abstractC1744w2, j4);
            int size = cVarMutableCopyWithCapacity.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarMutableCopyWithCapacity.isModifiable()) {
                    cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                cVarMutableCopyWithCapacity.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarMutableCopyWithCapacity;
            }
            o0.o(abstractC1744w, j4, cVar);
        }

        @Override // androidx.datastore.preferences.protobuf.F
        public final <L> List<L> c(Object obj, long j4) {
            C1746y.c cVar = (C1746y.c) o0.f15681d.i(obj, j4);
            if (cVar.isModifiable()) {
                return cVar;
            }
            int size = cVar.size();
            C1746y.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            o0.o(obj, j4, cVarMutableCopyWithCapacity);
            return cVarMutableCopyWithCapacity;
        }
    }

    public abstract void a(Object obj, long j4);

    public abstract void b(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2, long j4);

    public abstract <L> List<L> c(Object obj, long j4);
}
