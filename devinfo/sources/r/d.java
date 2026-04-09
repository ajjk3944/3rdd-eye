package r;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f32479a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32480b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f32481c;

    public d(f fVar) {
        this.f32481c = fVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2 = this.f32479a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f32478d;
            this.f32479a = cVar3;
            this.f32480b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32480b) {
            return this.f32481c.f32482a != null;
        }
        c cVar = this.f32479a;
        return (cVar == null || cVar.f32477c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32480b) {
            this.f32480b = false;
            this.f32479a = this.f32481c.f32482a;
        } else {
            c cVar = this.f32479a;
            this.f32479a = cVar != null ? cVar.f32477c : null;
        }
        return this.f32479a;
    }
}
