package sh;

/* renamed from: sh.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C7969d implements InterfaceC7970e {

    /* renamed from: a, reason: collision with root package name */
    private final float f61620a;

    /* renamed from: b, reason: collision with root package name */
    private final float f61621b;

    public C7969d(float f10, float f11) {
        this.f61620a = f10;
        this.f61621b = f11;
    }

    public boolean a(float f10) {
        return f10 >= this.f61620a && f10 <= this.f61621b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sh.InterfaceC7970e
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return h(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float g() {
        return Float.valueOf(this.f61621b);
    }

    @Override // sh.InterfaceC7971f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.f61620a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7969d) {
            if (!isEmpty() || !((C7969d) obj).isEmpty()) {
                C7969d c7969d = (C7969d) obj;
                if (this.f61620a != c7969d.f61620a || this.f61621b != c7969d.f61621b) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sh.InterfaceC7970e
    public /* bridge */ /* synthetic */ boolean f(Comparable comparable) {
        return a(((Number) comparable).floatValue());
    }

    public boolean h(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f61620a) * 31) + Float.hashCode(this.f61621b);
    }

    @Override // sh.InterfaceC7970e, sh.InterfaceC7971f
    public boolean isEmpty() {
        return this.f61620a > this.f61621b;
    }

    public String toString() {
        return this.f61620a + ".." + this.f61621b;
    }
}
