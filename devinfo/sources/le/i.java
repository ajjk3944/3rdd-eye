package le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f28719c = new i(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f28720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28721b;

    public i(int i4, int i10) {
        this.f28720a = i4;
        this.f28721b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f28720a);
        sb2.append(", length = ");
        return r5.c.j(this.f28721b, "]", sb2);
    }
}
