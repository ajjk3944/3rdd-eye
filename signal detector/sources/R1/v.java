package r1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23374a;

    /* renamed from: b, reason: collision with root package name */
    public final Q.b f23375b;

    /* renamed from: c, reason: collision with root package name */
    public int f23376c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f23377d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f23378e;

    /* renamed from: f, reason: collision with root package name */
    public List f23379f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23380g;

    public v(ArrayList arrayList, Q.b bVar) {
        this.f23375b = bVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f23374a = arrayList;
        this.f23376c = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f23374a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f23379f;
        if (list != null) {
            this.f23375b.d(list);
        }
        this.f23379f = null;
        ArrayList arrayList = this.f23374a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.d) obj).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return ((com.bumptech.glide.load.data.d) this.f23374a.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f23380g = true;
        ArrayList arrayList = this.f23374a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.d) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        List list = this.f23379f;
        H1.g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        this.f23377d = hVar;
        this.f23378e = cVar;
        this.f23379f = (List) this.f23375b.h();
        ((com.bumptech.glide.load.data.d) this.f23374a.get(this.f23376c)).e(hVar, this);
        if (this.f23380g) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        if (obj != null) {
            this.f23378e.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.f23380g) {
            return;
        }
        if (this.f23376c < this.f23374a.size() - 1) {
            this.f23376c++;
            e(this.f23377d, this.f23378e);
        } else {
            H1.g.b(this.f23379f);
            this.f23378e.d(new n1.v("Fetch failed", new ArrayList(this.f23379f)));
        }
    }
}
