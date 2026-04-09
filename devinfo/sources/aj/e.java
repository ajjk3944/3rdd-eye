package aj;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public b f417a;

    /* renamed from: b, reason: collision with root package name */
    public yi.d f418b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f419c;

    public e(g gVar, b bVar, yi.d dVar) {
        this.f419c = gVar;
        this.f417a = bVar;
        this.f418b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayListF;
        if (this.f419c.f421b || ".RecycleBinHW".equalsIgnoreCase(this.f418b.getName())) {
            synchronized (this.f419c.f422c) {
                this.f419c.f422c.add(this);
            }
            return;
        }
        if (this.f418b.isDirectory() && (arrayListF = this.f418b.f()) != null) {
            int i4 = 0;
            if (arrayListF.size() > 3) {
                int size = arrayListF.size();
                while (i4 < size) {
                    Object obj = arrayListF.get(i4);
                    i4++;
                    yi.d dVar = (yi.d) obj;
                    g gVar = this.f419c;
                    b bVar = new b(dVar.isDirectory(), dVar.getName(), this.f417a);
                    bVar.f407b = dVar.d();
                    gVar.c(gVar.b(bVar, dVar));
                }
            } else {
                int size2 = arrayListF.size();
                while (i4 < size2) {
                    Object obj2 = arrayListF.get(i4);
                    i4++;
                    yi.d dVar2 = (yi.d) obj2;
                    g gVar2 = this.f419c;
                    b bVar2 = new b(dVar2.isDirectory(), dVar2.getName(), this.f417a);
                    bVar2.f407b = dVar2.d();
                    gVar2.b(bVar2, dVar2).run();
                }
            }
        }
        this.f417a.f406a = this.f418b.getLength();
        synchronized (this.f419c.f422c) {
            this.f419c.f422c.add(this);
        }
    }
}
