package R2;

import R2.q;
import com.bumptech.glide.i;
import i3.C4455a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final c f11702e = new c();

    /* renamed from: f, reason: collision with root package name */
    public static final a f11703f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11704a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11705b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f11706c;

    /* renamed from: d, reason: collision with root package name */
    public final C4455a.c f11707d;

    /* compiled from: MultiModelLoaderFactory.java */
    public static class a implements q<Object, Object> {
        @Override // R2.q
        public final boolean a(Object obj) {
            return false;
        }

        @Override // R2.q
        public final q.a<Object> b(Object obj, int i, int i10, L2.h hVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Model> f11708a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Data> f11709b;

        /* renamed from: c, reason: collision with root package name */
        public final r<? extends Model, ? extends Data> f11710c;

        public b(Class<Model> cls, Class<Data> cls2, r<? extends Model, ? extends Data> rVar) {
            this.f11708a = cls;
            this.f11709b = cls2;
            this.f11710c = rVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    public static class c {
    }

    public u(C4455a.c cVar) {
        c cVar2 = f11702e;
        this.f11704a = new ArrayList();
        this.f11706c = new HashSet();
        this.f11707d = cVar;
        this.f11705b = cVar2;
    }

    public final synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, r<? extends Model, ? extends Data> rVar) {
        b bVar = new b(cls, cls2, rVar);
        ArrayList arrayList = this.f11704a;
        arrayList.add(arrayList.size(), bVar);
    }

    public final synchronized <Model, Data> q<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f11704a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (this.f11706c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.f11708a.isAssignableFrom(cls) && bVar.f11709b.isAssignableFrom(cls2)) {
                    this.f11706c.add(bVar);
                    arrayList.add(bVar.f11710c.c(this));
                    this.f11706c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f11705b;
                C4455a.c cVar2 = this.f11707d;
                cVar.getClass();
                return new t(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (q) arrayList.get(0);
            }
            if (z10) {
                return f11703f;
            }
            throw new i.c("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f11706c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f11704a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f11706c.contains(bVar) && bVar.f11708a.isAssignableFrom(cls)) {
                    this.f11706c.add(bVar);
                    arrayList.add(bVar.f11710c.c(this));
                    this.f11706c.remove(bVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f11704a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f11709b) && bVar.f11708a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f11709b);
            }
        }
        return arrayList;
    }
}
