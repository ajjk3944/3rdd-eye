package r;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f21096x = new HashMap();

    @Override // r.f
    public final c a(Object obj) {
        return (c) this.f21096x.get(obj);
    }

    @Override // r.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f21096x.remove(obj);
        return objB;
    }
}
