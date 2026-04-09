package w9;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {
    public static int g;

    /* renamed from: a, reason: collision with root package name */
    public int f36549a;

    /* renamed from: b, reason: collision with root package name */
    public int f36550b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f36551c;

    /* renamed from: d, reason: collision with root package name */
    public int f36552d;

    /* renamed from: e, reason: collision with root package name */
    public e f36553e;

    /* renamed from: f, reason: collision with root package name */
    public float f36554f;

    public static synchronized f a(int i4, e eVar) {
        f fVar;
        fVar = new f();
        if (i4 <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        fVar.f36550b = i4;
        fVar.f36551c = new Object[i4];
        fVar.f36552d = 0;
        fVar.f36553e = eVar;
        fVar.f36554f = 1.0f;
        fVar.d();
        int i10 = g;
        fVar.f36549a = i10;
        g = i10 + 1;
        return fVar;
    }

    public final synchronized e b() {
        e eVar;
        try {
            if (this.f36552d == -1 && this.f36554f > 0.0f) {
                d();
            }
            Object[] objArr = this.f36551c;
            int i4 = this.f36552d;
            eVar = (e) objArr[i4];
            eVar.f36548a = -1;
            this.f36552d = i4 - 1;
        } catch (Throwable th2) {
            throw th2;
        }
        return eVar;
    }

    public final synchronized void c(e eVar) {
        try {
            int i4 = eVar.f36548a;
            if (i4 != -1) {
                if (i4 == this.f36549a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + eVar.f36548a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i10 = this.f36552d + 1;
            this.f36552d = i10;
            if (i10 >= this.f36551c.length) {
                int i11 = this.f36550b;
                int i12 = i11 * 2;
                this.f36550b = i12;
                Object[] objArr = new Object[i12];
                for (int i13 = 0; i13 < i11; i13++) {
                    objArr[i13] = this.f36551c[i13];
                }
                this.f36551c = objArr;
            }
            eVar.f36548a = this.f36549a;
            this.f36551c[this.f36552d] = eVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        float f10 = this.f36554f;
        int i4 = this.f36550b;
        int i10 = (int) (i4 * f10);
        if (i10 < 1) {
            i4 = 1;
        } else if (i10 <= i4) {
            i4 = i10;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            this.f36551c[i11] = this.f36553e.a();
        }
        this.f36552d = i4 - 1;
    }
}
