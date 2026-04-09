package c3;

import L2.k;
import java.util.ArrayList;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18457a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f18458a;

        /* renamed from: b, reason: collision with root package name */
        public final k<T> f18459b;

        public a(Class<T> cls, k<T> kVar) {
            this.f18458a = cls;
            this.f18459b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f18457a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) this.f18457a.get(i);
            if (aVar.f18458a.isAssignableFrom(cls)) {
                return (k<Z>) aVar.f18459b;
            }
        }
        return null;
    }
}
