package uk;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35528b;

    public /* synthetic */ j(int i4, Object obj) {
        this.f35527a = i4;
        this.f35528b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ek.i, mk.e] */
    @Override // uk.f
    public final Iterator iterator() {
        switch (this.f35527a) {
            case 0:
                return jm.a.r((ek.i) this.f35528b);
            case 1:
                return (Iterator) this.f35528b;
            case 2:
                return new vk.b((CharSequence) this.f35528b);
            default:
                return ((Iterable) this.f35528b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(mk.e eVar) {
        this.f35527a = 0;
        this.f35528b = (ek.i) eVar;
    }
}
