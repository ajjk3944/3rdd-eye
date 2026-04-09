package uk;

import e4.d0;
import java.util.Iterator;
import u0.l2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35520a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final yj.c f35521b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35522c;

    public e(f fVar, mk.c cVar) {
        nk.k.e(fVar, "sequence");
        this.f35522c = fVar;
        this.f35521b = cVar;
    }

    @Override // uk.f
    public final Iterator iterator() {
        switch (this.f35520a) {
            case 0:
                return new a1.d(this);
            case 1:
                return new d0(this);
            default:
                return new l2(this);
        }
    }

    public e(mk.a aVar, mk.c cVar) {
        this.f35522c = aVar;
        this.f35521b = cVar;
    }

    public e(CharSequence charSequence, mk.e eVar) {
        nk.k.e(charSequence, "input");
        this.f35522c = charSequence;
        this.f35521b = eVar;
    }
}
