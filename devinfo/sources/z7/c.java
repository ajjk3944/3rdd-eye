package z7;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements f, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final List f37990a;

    /* renamed from: b, reason: collision with root package name */
    public final g f37991b;

    /* renamed from: c, reason: collision with root package name */
    public final e f37992c;

    /* renamed from: d, reason: collision with root package name */
    public int f37993d = -1;

    /* renamed from: e, reason: collision with root package name */
    public x7.e f37994e;

    /* renamed from: f, reason: collision with root package name */
    public List f37995f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public volatile d8.u f37996h;

    /* renamed from: i, reason: collision with root package name */
    public File f37997i;

    public c(List list, g gVar, e eVar) {
        this.f37990a = list;
        this.f37991b = gVar;
        this.f37992c = eVar;
    }

    @Override // z7.f
    public final boolean a() {
        while (true) {
            List list = this.f37995f;
            boolean z3 = false;
            if (list != null && this.g < list.size()) {
                this.f37996h = null;
                while (!z3 && this.g < this.f37995f.size()) {
                    List list2 = this.f37995f;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    d8.v vVar = (d8.v) list2.get(i4);
                    File file = this.f37997i;
                    g gVar = this.f37991b;
                    this.f37996h = vVar.a(file, gVar.f38004e, gVar.f38005f, gVar.f38007i);
                    if (this.f37996h != null && this.f37991b.c(this.f37996h.f22049c.a()) != null) {
                        this.f37996h.f22049c.e(this.f37991b.f38012o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i10 = this.f37993d + 1;
            this.f37993d = i10;
            if (i10 >= this.f37990a.size()) {
                return false;
            }
            x7.e eVar = (x7.e) this.f37990a.get(this.f37993d);
            g gVar2 = this.f37991b;
            File fileF = gVar2.f38006h.a().f(new d(eVar, gVar2.f38011n));
            this.f37997i = fileF;
            if (fileF != null) {
                this.f37994e = eVar;
                this.f37995f = this.f37991b.f38002c.b().g(fileF);
                this.g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f37992c.b(this.f37994e, exc, this.f37996h.f22049c, 3);
    }

    @Override // z7.f
    public final void cancel() {
        d8.u uVar = this.f37996h;
        if (uVar != null) {
            uVar.f22049c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f37992c.c(this.f37994e, obj, this.f37996h.f22049c, 3, this.f37994e);
    }
}
