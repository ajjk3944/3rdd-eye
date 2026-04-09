package i7;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final List f25868a;

    /* renamed from: c, reason: collision with root package name */
    public s7.a f25870c = null;

    /* renamed from: d, reason: collision with root package name */
    public float f25871d = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public s7.a f25869b = a(0.0f);

    public d(List list) {
        this.f25868a = list;
    }

    public final s7.a a(float f10) {
        List list = this.f25868a;
        s7.a aVar = (s7.a) list.get(list.size() - 1);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            s7.a aVar2 = (s7.a) list.get(size);
            if (this.f25869b != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                return aVar2;
            }
        }
        return (s7.a) list.get(0);
    }

    @Override // i7.c
    public final boolean g(float f10) {
        s7.a aVar = this.f25870c;
        s7.a aVar2 = this.f25869b;
        if (aVar == aVar2 && this.f25871d == f10) {
            return true;
        }
        this.f25870c = aVar2;
        this.f25871d = f10;
        return false;
    }

    @Override // i7.c
    public final boolean isEmpty() {
        return false;
    }

    @Override // i7.c
    public final s7.a k() {
        return this.f25869b;
    }

    @Override // i7.c
    public final boolean o(float f10) {
        s7.a aVar = this.f25869b;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            return !this.f25869b.c();
        }
        this.f25869b = a(f10);
        return true;
    }

    @Override // i7.c
    public final float t() {
        return ((s7.a) this.f25868a.get(r0.size() - 1)).a();
    }

    @Override // i7.c
    public final float v() {
        return ((s7.a) this.f25868a.get(0)).b();
    }
}
