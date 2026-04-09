package t0;

import java.util.Iterator;
import mq.i;
import s0.c;
import st.h;

/* loaded from: classes.dex */
public final class b extends i implements q0.b {

    /* renamed from: r, reason: collision with root package name */
    public static final b f22376r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f22377a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22378d;

    /* renamed from: g, reason: collision with root package name */
    public final c f22379g;

    static {
        u0.b bVar = u0.b.f23137a;
        f22376r = new b(bVar, bVar, c.f21825g);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f22377a = obj;
        this.f22378d = obj2;
        this.f22379g = cVar;
    }

    @Override // mq.a
    public final int a() {
        c cVar = this.f22379g;
        cVar.getClass();
        return cVar.f21827d;
    }

    @Override // mq.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f22379g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h(this.f22379g, this.f22377a);
    }
}
