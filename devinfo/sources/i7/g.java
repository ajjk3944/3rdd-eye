package i7;

import f7.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends km.o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km.o f25880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(km.o oVar) {
        super(16);
        this.f25880c = oVar;
    }

    @Override // km.o
    public final Object k(s7.b bVar) {
        Float f10 = (Float) ((i0) this.f25880c.f28446b);
        if (f10 == null) {
            return null;
        }
        return Float.valueOf(f10.floatValue() * 2.55f);
    }
}
