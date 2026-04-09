package r;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f32472a;

    /* renamed from: b, reason: collision with root package name */
    public c f32473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32474c;

    public b(c cVar, c cVar2, int i4) {
        this.f32474c = i4;
        this.f32472a = cVar2;
        this.f32473b = cVar;
    }

    @Override // r.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f32472a == cVar && cVar == this.f32473b) {
            this.f32473b = null;
            this.f32472a = null;
        }
        c cVar3 = this.f32472a;
        if (cVar3 == cVar) {
            switch (this.f32474c) {
                case 0:
                    cVar2 = cVar3.f32478d;
                    break;
                default:
                    cVar2 = cVar3.f32477c;
                    break;
            }
            this.f32472a = cVar2;
        }
        c cVar4 = this.f32473b;
        if (cVar4 == cVar) {
            c cVar5 = this.f32472a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f32473b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f32474c) {
            case 0:
                return cVar.f32477c;
            default:
                return cVar.f32478d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32473b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f32473b;
        c cVar2 = this.f32472a;
        this.f32473b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
