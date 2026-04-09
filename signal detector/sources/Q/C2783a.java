package q;

import java.util.HashMap;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2783a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f22890e = new HashMap();

    @Override // q.f
    public final C2785c a(Object obj) {
        return (C2785c) this.f22890e.get(obj);
    }

    @Override // q.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f22890e.remove(obj);
        return objB;
    }
}
