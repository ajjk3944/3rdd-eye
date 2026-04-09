package zj;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final e f38307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38308b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38309c;

    public d(e eVar, int i4, int i10) {
        this.f38307a = eVar;
        this.f38308b = i4;
        b bVar = e.Companion;
        int size = eVar.size();
        bVar.getClass();
        b.c(i4, i10, size);
        this.f38309c = i10 - i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        e.Companion.getClass();
        b.a(i4, this.f38309c);
        return this.f38307a.get(this.f38308b + i4);
    }

    @Override // zj.a
    public final int getSize() {
        return this.f38309c;
    }

    @Override // zj.e, java.util.List
    public final List subList(int i4, int i10) {
        e.Companion.getClass();
        b.c(i4, i10, this.f38309c);
        int i11 = this.f38308b;
        return new d(this.f38307a, i4 + i11, i11 + i10);
    }
}
