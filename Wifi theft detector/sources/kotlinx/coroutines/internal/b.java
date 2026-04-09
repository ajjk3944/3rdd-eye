package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
public abstract class b extends v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22520a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f22519a;

    @Override // kotlinx.coroutines.internal.v
    public final Object a(Object obj) {
        Object objC = f22520a.get(this);
        if (objC == a.f22519a) {
            objC = c(e(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        Object obj2 = f22520a.get(this);
        Object obj3 = a.f22519a;
        return obj2 != obj3 ? obj2 : t.a.a(f22520a, this, obj3, obj) ? obj : f22520a.get(this);
    }

    public abstract Object e(Object obj);
}
