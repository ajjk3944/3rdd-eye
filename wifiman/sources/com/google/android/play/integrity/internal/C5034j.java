package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5034j implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f38144c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile n f38145a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f38146b = f38144c;

    private C5034j(n nVar) {
        this.f38145a = nVar;
    }

    public static n b(n nVar) {
        return nVar instanceof C5034j ? nVar : new C5034j(nVar);
    }

    @Override // com.google.android.play.integrity.internal.n
    public final Object a() {
        Object objA = this.f38146b;
        Object obj = f38144c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f38146b;
                    if (objA == obj) {
                        objA = this.f38145a.a();
                        Object obj2 = this.f38146b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f38146b = objA;
                        this.f38145a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
