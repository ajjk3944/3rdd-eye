package Z2;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TranscoderRegistry.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14009a = new ArrayList();

    /* compiled from: TranscoderRegistry.java */
    public static final class a<Z, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Z> f14010a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<R> f14011b;

        /* renamed from: c, reason: collision with root package name */
        public final b<Z, R> f14012c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f14010a = cls;
            this.f14011b = cls2;
            this.f14012c = bVar;
        }
    }

    public final synchronized <Z, R> b<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return d.f14013b;
        }
        Iterator it = this.f14009a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f14010a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f14011b)) {
                return aVar.f14012c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f14009a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if ((aVar.f14010a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f14011b)) && !arrayList.contains(aVar.f14011b)) {
                arrayList.add(aVar.f14011b);
            }
        }
        return arrayList;
    }
}
