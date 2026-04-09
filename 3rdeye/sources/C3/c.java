package c3;

import L2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResourceDecoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18452a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18453b = new HashMap();

    /* compiled from: ResourceDecoderRegistry.java */
    public static class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f18454a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f18455b;

        /* renamed from: c, reason: collision with root package name */
        public final j<T, R> f18456c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f18454a = cls;
            this.f18455b = cls2;
            this.f18456c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f18452a.contains(str)) {
                this.f18452a.add(str);
            }
            arrayList = (List) this.f18453b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f18453b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f18452a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f18453b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.f18454a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f18455b)) && !arrayList.contains(aVar.f18455b)) {
                        arrayList.add(aVar.f18455b);
                    }
                }
            }
        }
        return arrayList;
    }
}
