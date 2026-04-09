package d8;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22053a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.c f22054b;

    /* renamed from: c, reason: collision with root package name */
    public int f22055c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.i f22056d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f22057e;

    /* renamed from: f, reason: collision with root package name */
    public List f22058f;
    public boolean g;

    public z(ArrayList arrayList, d4.c cVar) {
        this.f22054b = cVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f22053a = arrayList;
        this.f22055c = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f22053a.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.f22058f;
        if (list != null) {
            this.f22054b.i(list);
        }
        this.f22058f = null;
        ArrayList arrayList = this.f22053a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((com.bumptech.glide.load.data.d) obj).b();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        List list = this.f22058f;
        t8.f.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.g = true;
        ArrayList arrayList = this.f22053a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((com.bumptech.glide.load.data.d) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return ((com.bumptech.glide.load.data.d) this.f22053a.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.c cVar) {
        this.f22056d = iVar;
        this.f22057e = cVar;
        this.f22058f = (List) this.f22054b.k();
        ((com.bumptech.glide.load.data.d) this.f22053a.get(this.f22055c)).e(iVar, this);
        if (this.g) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        if (obj != null) {
            this.f22057e.f(obj);
        } else {
            g();
        }
    }

    public final void g() {
        if (this.g) {
            return;
        }
        if (this.f22055c < this.f22053a.size() - 1) {
            this.f22055c++;
            e(this.f22056d, this.f22057e);
        } else {
            t8.f.b(this.f22058f);
            this.f22057e.c(new z7.u("Fetch failed", new ArrayList(this.f22058f)));
        }
    }
}
