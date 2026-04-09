package N2;

import N2.h;
import R2.q;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final List<L2.f> f4474b;

    /* renamed from: c, reason: collision with root package name */
    public final i<?> f4475c;

    /* renamed from: d, reason: collision with root package name */
    public final h.a f4476d;

    /* renamed from: e, reason: collision with root package name */
    public int f4477e = -1;

    /* renamed from: f, reason: collision with root package name */
    public L2.f f4478f;

    /* renamed from: g, reason: collision with root package name */
    public List<R2.q<File, ?>> f4479g;

    /* renamed from: h, reason: collision with root package name */
    public int f4480h;
    public volatile q.a<?> i;

    /* renamed from: j, reason: collision with root package name */
    public File f4481j;

    public e(List<L2.f> list, i<?> iVar, h.a aVar) {
        this.f4474b = list;
        this.f4475c = iVar;
        this.f4476d = aVar;
    }

    @Override // N2.h
    public final boolean b() {
        while (true) {
            List<R2.q<File, ?>> list = this.f4479g;
            boolean z10 = false;
            if (list != null && this.f4480h < list.size()) {
                this.i = null;
                while (!z10 && this.f4480h < this.f4479g.size()) {
                    List<R2.q<File, ?>> list2 = this.f4479g;
                    int i = this.f4480h;
                    this.f4480h = i + 1;
                    R2.q<File, ?> qVar = list2.get(i);
                    File file = this.f4481j;
                    i<?> iVar = this.f4475c;
                    this.i = qVar.b(file, iVar.f4491e, iVar.f4492f, iVar.i);
                    if (this.i != null && this.f4475c.c(this.i.f11688c.a()) != null) {
                        this.i.f11688c.e(this.f4475c.f4500o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i10 = this.f4477e + 1;
            this.f4477e = i10;
            if (i10 >= this.f4474b.size()) {
                return false;
            }
            L2.f fVar = this.f4474b.get(this.f4477e);
            i<?> iVar2 = this.f4475c;
            File fileH = iVar2.f4494h.a().h(new f(fVar, iVar2.f4499n));
            this.f4481j = fileH;
            if (fileH != null) {
                this.f4478f = fVar;
                this.f4479g = this.f4475c.f4489c.b().g(fileH);
                this.f4480h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f4476d.a(this.f4478f, exc, this.i.f11688c, L2.a.DATA_DISK_CACHE);
    }

    @Override // N2.h
    public final void cancel() {
        q.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.f11688c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f4476d.c(this.f4478f, obj, this.i.f11688c, L2.a.DATA_DISK_CACHE, this.f4478f);
    }
}
