package N2;

import i3.C4455a;
import i3.d;

/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
public final class t<Z> implements u<Z>, C4455a.d {

    /* renamed from: f, reason: collision with root package name */
    public static final C4455a.c f4633f = C4455a.a(20, new a());

    /* renamed from: b, reason: collision with root package name */
    public final d.a f4634b = new d.a();

    /* renamed from: c, reason: collision with root package name */
    public u<Z> f4635c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4636d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4637e;

    /* compiled from: LockedResource.java */
    public class a implements C4455a.b<t<?>> {
        @Override // i3.C4455a.b
        public final t<?> a() {
            return new t<>();
        }
    }

    @Override // N2.u
    public final synchronized void a() {
        this.f4634b.a();
        this.f4637e = true;
        if (!this.f4636d) {
            this.f4635c.a();
            this.f4635c = null;
            f4633f.b(this);
        }
    }

    @Override // i3.C4455a.d
    public final d.a b() {
        return this.f4634b;
    }

    @Override // N2.u
    public final Class<Z> c() {
        return this.f4635c.c();
    }

    public final synchronized void d() {
        this.f4634b.a();
        if (!this.f4636d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4636d = false;
        if (this.f4637e) {
            a();
        }
    }

    @Override // N2.u
    public final Z get() {
        return this.f4635c.get();
    }

    @Override // N2.u
    public final int getSize() {
        return this.f4635c.getSize();
    }
}
