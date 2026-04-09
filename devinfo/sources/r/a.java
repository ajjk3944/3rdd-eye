package r;

import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f32471e = new HashMap();

    @Override // r.f
    public final c a(Object obj) {
        return (c) this.f32471e.get(obj);
    }

    @Override // r.f
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f32471e.remove(obj);
        return objC;
    }
}
