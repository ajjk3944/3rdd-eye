package S2;

import C2.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f20236a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f20237b = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f20238a;

        /* renamed from: b, reason: collision with root package name */
        final Class f20239b;

        /* renamed from: c, reason: collision with root package name */
        final i f20240c;

        public a(Class cls, Class cls2, i iVar) {
            this.f20238a = cls;
            this.f20239b = cls2;
            this.f20240c = iVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f20238a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f20239b);
        }
    }

    private synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f20236a.contains(str)) {
                this.f20236a.add(str);
            }
            arrayList = (List) this.f20237b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f20237b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized void a(String str, i iVar, Class cls, Class cls2) {
        c(str).add(new a(cls, cls2, iVar));
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f20236a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f20237b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f20240c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f20236a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f20237b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f20239b)) {
                        arrayList.add(aVar.f20239b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f20236a);
            this.f20236a.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f20236a.add((String) it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f20236a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
