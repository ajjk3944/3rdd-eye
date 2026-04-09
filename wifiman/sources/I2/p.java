package I2;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final r f8514a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8515b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map f8516a = new HashMap();

        /* renamed from: I2.p$a$a, reason: collision with other inner class name */
        private static class C0350a {

            /* renamed from: a, reason: collision with root package name */
            final List f8517a;

            public C0350a(List list) {
                this.f8517a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f8516a.clear();
        }

        public List b(Class cls) {
            C0350a c0350a = (C0350a) this.f8516a.get(cls);
            if (c0350a == null) {
                return null;
            }
            return c0350a.f8517a;
        }

        public void c(Class cls, List list) {
            if (((C0350a) this.f8516a.put(cls, new C0350a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(E1.e eVar) {
        this(new r(eVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f8515b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f8514a.e(cls));
            this.f8515b.c(cls, listB);
        }
        return listB;
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f8514a.b(cls, cls2, oVar);
        this.f8515b.a();
    }

    public synchronized List c(Class cls) {
        return this.f8514a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listE.size();
        List listEmptyList = Collections.emptyList();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.b(obj)) {
                if (z10) {
                    listEmptyList = new ArrayList(size - i10);
                    z10 = false;
                }
                listEmptyList.add(nVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listE);
        }
        return listEmptyList;
    }

    private p(r rVar) {
        this.f8515b = new a();
        this.f8514a = rVar;
    }
}
