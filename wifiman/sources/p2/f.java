package P2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f18016a = new ArrayList();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Class f18017a;

        /* renamed from: b, reason: collision with root package name */
        final Class f18018b;

        /* renamed from: c, reason: collision with root package name */
        final e f18019c;

        a(Class cls, Class cls2, e eVar) {
            this.f18017a = cls;
            this.f18018b = cls2;
            this.f18019c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f18017a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f18018b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f18016a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f18019c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f18016a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f18018b)) {
                arrayList.add(aVar.f18018b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f18016a.add(new a(cls, cls2, eVar));
    }
}
