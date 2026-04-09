package n1;

import java.io.File;
import java.util.List;
import l1.InterfaceC2639e;

/* loaded from: classes.dex */
public final class d implements g, com.bumptech.glide.load.data.c {

    /* renamed from: a, reason: collision with root package name */
    public final List f22175a;

    /* renamed from: b, reason: collision with root package name */
    public final h f22176b;

    /* renamed from: c, reason: collision with root package name */
    public final f f22177c;

    /* renamed from: d, reason: collision with root package name */
    public int f22178d = -1;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2639e f22179e;

    /* renamed from: f, reason: collision with root package name */
    public List f22180f;

    /* renamed from: g, reason: collision with root package name */
    public int f22181g;

    /* renamed from: h, reason: collision with root package name */
    public volatile r1.q f22182h;
    public File i;

    public d(List list, h hVar, f fVar) {
        this.f22175a = list;
        this.f22176b = hVar;
        this.f22177c = fVar;
    }

    @Override // n1.g
    public final boolean b() {
        while (true) {
            List list = this.f22180f;
            boolean z6 = false;
            if (list != null && this.f22181g < list.size()) {
                this.f22182h = null;
                while (!z6 && this.f22181g < this.f22180f.size()) {
                    List list2 = this.f22180f;
                    int i = this.f22181g;
                    this.f22181g = i + 1;
                    r1.r rVar = (r1.r) list2.get(i);
                    File file = this.i;
                    h hVar = this.f22176b;
                    this.f22182h = rVar.a(file, hVar.f22189e, hVar.f22190f, hVar.i);
                    if (this.f22182h != null && this.f22176b.c(this.f22182h.f23370c.a()) != null) {
                        this.f22182h.f23370c.e(this.f22176b.f22198o, this);
                        z6 = true;
                    }
                }
                return z6;
            }
            int i3 = this.f22178d + 1;
            this.f22178d = i3;
            if (i3 >= this.f22175a.size()) {
                return false;
            }
            InterfaceC2639e interfaceC2639e = (InterfaceC2639e) this.f22175a.get(this.f22178d);
            h hVar2 = this.f22176b;
            File fileK = hVar2.f22192h.a().k(new e(interfaceC2639e, hVar2.f22197n));
            this.i = fileK;
            if (fileK != null) {
                this.f22179e = interfaceC2639e;
                this.f22180f = this.f22176b.f22187c.b().g(fileK);
                this.f22181g = 0;
            }
        }
    }

    @Override // n1.g
    public final void cancel() {
        r1.q qVar = this.f22182h;
        if (qVar != null) {
            qVar.f23370c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void d(Exception exc) {
        this.f22177c.a(this.f22179e, exc, this.f22182h.f23370c, 3);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f22177c.c(this.f22179e, obj, this.f22182h.f23370c, 3, this.f22179e);
    }
}
