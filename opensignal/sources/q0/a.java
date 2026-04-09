package q0;

import java.util.List;
import mq.d;
import r0.c;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final c f20654a;

    /* renamed from: d, reason: collision with root package name */
    public final int f20655d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20656g;

    public a(c cVar, int i10, int i11) {
        this.f20654a = cVar;
        this.f20655d = i10;
        io.sentry.config.a.I(i10, i11, cVar.a());
        this.f20656g = i11 - i10;
    }

    @Override // mq.a
    public final int a() {
        return this.f20656g;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        io.sentry.config.a.G(i10, this.f20656g);
        return this.f20654a.get(this.f20655d + i10);
    }

    @Override // mq.d, java.util.List
    public final List subList(int i10, int i11) {
        io.sentry.config.a.I(i10, i11, this.f20656g);
        int i12 = this.f20655d;
        return new a(this.f20654a, i10 + i12, i12 + i11);
    }
}
