package u8;

import java.util.List;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List f23443a;

    /* renamed from: g, reason: collision with root package name */
    public f9.a f23445g = null;

    /* renamed from: r, reason: collision with root package name */
    public float f23446r = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public f9.a f23444d = a(0.0f);

    public c(List list) {
        this.f23443a = list;
    }

    public final f9.a a(float f10) {
        List list = this.f23443a;
        f9.a aVar = (f9.a) list.get(list.size() - 1);
        if (f10 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            f9.a aVar2 = (f9.a) list.get(size);
            if (this.f23444d != aVar2 && f10 >= aVar2.b() && f10 < aVar2.a()) {
                return aVar2;
            }
        }
        return (f9.a) list.get(0);
    }

    @Override // u8.b
    public final boolean i(float f10) {
        f9.a aVar = this.f23445g;
        f9.a aVar2 = this.f23444d;
        if (aVar == aVar2 && this.f23446r == f10) {
            return true;
        }
        this.f23445g = aVar2;
        this.f23446r = f10;
        return false;
    }

    @Override // u8.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // u8.b
    public final f9.a j() {
        return this.f23444d;
    }

    @Override // u8.b
    public final boolean m(float f10) {
        f9.a aVar = this.f23444d;
        if (f10 >= aVar.b() && f10 < aVar.a()) {
            return !this.f23444d.c();
        }
        this.f23444d = a(f10);
        return true;
    }

    @Override // u8.b
    public final float v() {
        return ((f9.a) this.f23443a.get(r0.size() - 1)).a();
    }

    @Override // u8.b
    public final float y() {
        return ((f9.a) this.f23443a.get(0)).b();
    }
}
