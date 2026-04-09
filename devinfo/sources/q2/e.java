package q2;

import x.k;
import x.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u f32168a;

    /* renamed from: b, reason: collision with root package name */
    public d f32169b;

    /* renamed from: c, reason: collision with root package name */
    public long f32170c;

    /* renamed from: d, reason: collision with root package name */
    public long f32171d;

    /* renamed from: e, reason: collision with root package name */
    public long f32172e;

    /* renamed from: f, reason: collision with root package name */
    public long f32173f;
    public float[] g;

    public e() {
        u uVar = k.f36911a;
        this.f32168a = new u();
        this.f32170c = -1L;
        this.f32171d = 0L;
        this.f32172e = 0L;
    }

    public final void a(d dVar, long j, long j8, float[] fArr, long j9) throws Exception {
        long j10 = dVar.g;
        if (j9 - j10 > 0 || j10 == Long.MIN_VALUE) {
            dVar.g = j9;
            dVar.a(dVar.f32165e, dVar.f32166f, j, j8, fArr);
        }
    }
}
