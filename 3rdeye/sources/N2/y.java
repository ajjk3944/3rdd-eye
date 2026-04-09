package N2;

import N2.j;
import R2.q;
import com.bumptech.glide.load.data.d;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class y implements d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.a f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f4658c;

    public y(z zVar, q.a aVar) {
        this.f4658c = zVar;
        this.f4657b = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        z zVar = this.f4658c;
        q.a<?> aVar = this.f4657b;
        q.a<?> aVar2 = zVar.f4664g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        z zVar2 = this.f4658c;
        q.a aVar3 = this.f4657b;
        j jVar = zVar2.f4660c;
        L2.f fVar = zVar2.f4665h;
        com.bumptech.glide.load.data.d<Data> dVar = aVar3.f11688c;
        jVar.a(fVar, exc, dVar, dVar.d());
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        z zVar = this.f4658c;
        q.a<?> aVar = this.f4657b;
        q.a<?> aVar2 = zVar.f4664g;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        z zVar2 = this.f4658c;
        q.a aVar3 = this.f4657b;
        l lVar = zVar2.f4659b.f4501p;
        if (obj != null && lVar.c(aVar3.f11688c.d())) {
            zVar2.f4663f = obj;
            zVar2.f4660c.o(j.e.SWITCH_TO_SOURCE_SERVICE);
        } else {
            j jVar = zVar2.f4660c;
            L2.f fVar = aVar3.f11686a;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f11688c;
            jVar.c(fVar, obj, dVar, dVar.d(), zVar2.f4665h);
        }
    }
}
