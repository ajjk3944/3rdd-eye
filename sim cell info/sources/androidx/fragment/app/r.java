package androidx.fragment.app;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class r implements androidx.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    private androidx.lifecycle.h f1786b = null;

    r() {
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        e();
        return this.f1786b;
    }

    void b(d.a aVar) {
        this.f1786b.i(aVar);
    }

    void e() {
        if (this.f1786b == null) {
            this.f1786b = new androidx.lifecycle.h(this);
        }
    }

    boolean f() {
        return this.f1786b != null;
    }
}
