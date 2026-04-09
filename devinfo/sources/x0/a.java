package x0;

import com.bumptech.glide.c;
import java.util.List;
import zj.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final y0.b f36971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36973c;

    public a(y0.b bVar, int i4, int i10) {
        this.f36971a = bVar;
        this.f36972b = i4;
        c.h(i4, i10, bVar.size());
        this.f36973c = i10 - i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        c.f(i4, this.f36973c);
        return this.f36971a.get(this.f36972b + i4);
    }

    @Override // zj.a
    public final int getSize() {
        return this.f36973c;
    }

    @Override // zj.e, java.util.List
    public final List subList(int i4, int i10) {
        c.h(i4, i10, this.f36973c);
        int i11 = this.f36972b;
        return new a(this.f36971a, i4 + i11, i11 + i10);
    }
}
