package I2;

import I2.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class q implements n {

    /* renamed from: a, reason: collision with root package name */
    private final List f8518a;

    /* renamed from: b, reason: collision with root package name */
    private final E1.e f8519b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: a, reason: collision with root package name */
        private final List f8520a;

        /* renamed from: b, reason: collision with root package name */
        private final E1.e f8521b;

        /* renamed from: c, reason: collision with root package name */
        private int f8522c;

        /* renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.g f8523d;

        /* renamed from: e, reason: collision with root package name */
        private d.a f8524e;

        /* renamed from: f, reason: collision with root package name */
        private List f8525f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8526g;

        a(List list, E1.e eVar) {
            this.f8521b = eVar;
            W2.k.c(list);
            this.f8520a = list;
            this.f8522c = 0;
        }

        private void g() {
            if (this.f8526g) {
                return;
            }
            if (this.f8522c < this.f8520a.size() - 1) {
                this.f8522c++;
                e(this.f8523d, this.f8524e);
            } else {
                W2.k.d(this.f8525f);
                this.f8524e.c(new GlideException("Fetch failed", new ArrayList(this.f8525f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f8520a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f8525f;
            if (list != null) {
                this.f8521b.a(list);
            }
            this.f8525f = null;
            Iterator it = this.f8520a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) W2.k.d(this.f8525f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f8526g = true;
            Iterator it = this.f8520a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public C2.a d() {
            return ((com.bumptech.glide.load.data.d) this.f8520a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a aVar) {
            this.f8523d = gVar;
            this.f8524e = aVar;
            this.f8525f = (List) this.f8521b.b();
            ((com.bumptech.glide.load.data.d) this.f8520a.get(this.f8522c)).e(gVar, this);
            if (this.f8526g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f8524e.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, E1.e eVar) {
        this.f8518a = list;
        this.f8519b = eVar;
    }

    @Override // I2.n
    public n.a a(Object obj, int i10, int i11, C2.g gVar) {
        n.a aVarA;
        int size = this.f8518a.size();
        ArrayList arrayList = new ArrayList(size);
        C2.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f8518a.get(i12);
            if (nVar.b(obj) && (aVarA = nVar.a(obj, i10, i11, gVar)) != null) {
                eVar = aVarA.f8511a;
                arrayList.add(aVarA.f8513c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a(eVar, new a(arrayList, this.f8519b));
    }

    @Override // I2.n
    public boolean b(Object obj) {
        Iterator it = this.f8518a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f8518a.toArray()) + '}';
    }
}
