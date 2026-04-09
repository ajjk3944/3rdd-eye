package R2;

import R2.q;
import com.bumptech.glide.load.data.d;
import i3.C4455a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import t4.C5606d;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public final class t<Model, Data> implements q<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11693a;

    /* renamed from: b, reason: collision with root package name */
    public final C4455a.c f11694b;

    /* compiled from: MultiModelLoader.java */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f11695b;

        /* renamed from: c, reason: collision with root package name */
        public final C4455a.c f11696c;

        /* renamed from: d, reason: collision with root package name */
        public int f11697d;

        /* renamed from: e, reason: collision with root package name */
        public com.bumptech.glide.h f11698e;

        /* renamed from: f, reason: collision with root package name */
        public d.a<? super Data> f11699f;

        /* renamed from: g, reason: collision with root package name */
        public List<Throwable> f11700g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f11701h;

        public a(ArrayList arrayList, C4455a.c cVar) {
            this.f11696c = cVar;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f11695b = arrayList;
            this.f11697d = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<Data> a() {
            return ((com.bumptech.glide.load.data.d) this.f11695b.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            List<Throwable> list = this.f11700g;
            if (list != null) {
                this.f11696c.b(list);
            }
            this.f11700g = null;
            Iterator it = this.f11695b.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f11700g;
            C5606d.l(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f11701h = true;
            Iterator it = this.f11695b.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final L2.a d() {
            return ((com.bumptech.glide.load.data.d) this.f11695b.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            this.f11698e = hVar;
            this.f11699f = aVar;
            this.f11700g = (List) this.f11696c.a();
            ((com.bumptech.glide.load.data.d) this.f11695b.get(this.f11697d)).e(hVar, this);
            if (this.f11701h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public final void f(Data data) {
            if (data != null) {
                this.f11699f.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f11701h) {
                return;
            }
            if (this.f11697d < this.f11695b.size() - 1) {
                this.f11697d++;
                e(this.f11698e, this.f11699f);
            } else {
                C5606d.k(this.f11700g);
                this.f11699f.c(new N2.q("Fetch failed", new ArrayList(this.f11700g)));
            }
        }
    }

    public t(ArrayList arrayList, C4455a.c cVar) {
        this.f11693a = arrayList;
        this.f11694b = cVar;
    }

    @Override // R2.q
    public final boolean a(Model model) {
        Iterator it = this.f11693a.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // R2.q
    public final q.a<Data> b(Model model, int i, int i10, L2.h hVar) {
        q.a<Data> aVarB;
        ArrayList arrayList = this.f11693a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        L2.f fVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.a(model) && (aVarB = qVar.b(model, i, i10, hVar)) != null) {
                arrayList2.add(aVarB.f11688c);
                fVar = aVarB.f11686a;
            }
        }
        if (arrayList2.isEmpty() || fVar == null) {
            return null;
        }
        return new q.a<>(fVar, new a(arrayList2, this.f11694b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f11693a.toArray()) + '}';
    }
}
