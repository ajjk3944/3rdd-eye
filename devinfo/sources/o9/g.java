package o9;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends b {
    @Override // o9.b
    public final s9.a d(int i4) {
        if (i4 == 0) {
            return i();
        }
        return null;
    }

    @Override // o9.b
    public final d f(q9.b bVar) {
        return i().d((int) bVar.f32227a);
    }

    public final h i() {
        return (h) this.f30440i.get(0);
    }

    public final float j() {
        float f10 = 0.0f;
        for (int i4 = 0; i4 < i().j.size(); i4++) {
            f10 += ((i) i().d(i4)).f30453a;
        }
        return f10;
    }
}
