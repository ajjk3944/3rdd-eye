package X2;

import a4.p;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f4163c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f4164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f4165e;

    public d(e eVar, int i, int i3) {
        this.f4165e = eVar;
        this.f4163c = i;
        this.f4164d = i3;
    }

    @Override // X2.a
    public final Object[] a() {
        return this.f4165e.a();
    }

    @Override // X2.a
    public final int b() {
        return this.f4165e.b() + this.f4163c;
    }

    @Override // X2.a
    public final int c() {
        return this.f4165e.b() + this.f4163c + this.f4164d;
    }

    @Override // X2.e, java.util.List
    /* renamed from: f */
    public final e subList(int i, int i3) {
        p.y(i, i3, this.f4164d);
        int i6 = this.f4163c;
        return this.f4165e.subList(i + i6, i3 + i6);
    }

    @Override // java.util.List
    public final Object get(int i) {
        p.w(i, this.f4164d);
        return this.f4165e.get(i + this.f4163c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4164d;
    }
}
