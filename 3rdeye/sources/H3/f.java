package h3;

import t4.C5606d;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes.dex */
public final class f implements g<Object> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f38204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f38205b;

    public f(g gVar) {
        this.f38205b = gVar;
    }

    @Override // h3.g
    public final Object get() {
        if (this.f38204a == null) {
            synchronized (this) {
                try {
                    if (this.f38204a == null) {
                        Object obj = this.f38205b.get();
                        C5606d.l(obj, "Argument must not be null");
                        this.f38204a = obj;
                    }
                } finally {
                }
            }
        }
        return this.f38204a;
    }
}
