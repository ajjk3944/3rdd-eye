package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r0 implements a0 {

    /* renamed from: i, reason: collision with root package name */
    public static final r0 f1172i = new r0();

    /* renamed from: a, reason: collision with root package name */
    public int f1173a;

    /* renamed from: b, reason: collision with root package name */
    public int f1174b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1177e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1175c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1176d = true;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f1178f = new c0(this, true);
    public final o0 g = new o0(0, this);

    /* renamed from: h, reason: collision with root package name */
    public final i1 f1179h = new i1(this);

    public final void a() {
        int i4 = this.f1174b + 1;
        this.f1174b = i4;
        if (i4 == 1) {
            if (this.f1175c) {
                this.f1178f.e(r.ON_RESUME);
                this.f1175c = false;
            } else {
                Handler handler = this.f1177e;
                nk.k.b(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // androidx.lifecycle.a0
    public final c0 j() {
        return this.f1178f;
    }
}
