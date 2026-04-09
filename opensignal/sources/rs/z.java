package rs;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.cache.tape.d f21781a;

    /* renamed from: d, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.d f21782d;

    /* renamed from: g, reason: collision with root package name */
    public int f21783g;

    public z(a0 a0Var) {
        io.sentry.cache.tape.d dVar = new io.sentry.cache.tape.d(a0Var);
        this.f21781a = dVar;
        this.f21782d = new androidx.datastore.preferences.protobuf.d(dVar.a());
        this.f21783g = a0Var.f21728d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21783g > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21782d.hasNext()) {
            this.f21782d = new androidx.datastore.preferences.protobuf.d(this.f21781a.a());
        }
        this.f21783g--;
        return Byte.valueOf(this.f21782d.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
