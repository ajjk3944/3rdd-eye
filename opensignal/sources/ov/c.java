package ov;

import io.sentry.t;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public Object f20012c;

    @Override // ov.b
    public final Object a(t tVar) {
        Object obj = this.f20012c;
        return obj == null ? super.a(tVar) : obj;
    }

    @Override // ov.b
    public final Object b(t tVar) {
        synchronized (this) {
            try {
                Object objA = this.f20012c;
                if (objA == null) {
                    if (objA == null) {
                        objA = super.a(tVar);
                    }
                    this.f20012c = objA;
                }
            } finally {
            }
        }
        Object obj = this.f20012c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
