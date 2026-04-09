package q9;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f32227a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32228b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32229c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32230d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32231e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32232f;

    public b(float f10, float f11, float f12, float f13, int i4, int i10) {
        this.f32227a = f10;
        this.f32228b = f11;
        this.f32229c = f12;
        this.f32230d = f13;
        this.f32231e = i4;
        this.f32232f = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Highlight, x: ");
        sb2.append(this.f32227a);
        sb2.append(", y: ");
        sb2.append(this.f32228b);
        sb2.append(", dataSetIndex: ");
        return r5.c.j(this.f32231e, ", stackIndex (only stacked barentry): -1", sb2);
    }
}
