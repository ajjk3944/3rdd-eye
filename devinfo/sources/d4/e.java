package d4;

import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f21977c;

    public e(int i4) {
        super(i4);
        this.f21977c = new Object();
    }

    @Override // d4.d, d4.c
    public final boolean i(Object obj) {
        boolean zI;
        k.e(obj, "instance");
        synchronized (this.f21977c) {
            zI = super.i(obj);
        }
        return zI;
    }

    @Override // d4.d, d4.c
    public final Object k() {
        Object objK;
        synchronized (this.f21977c) {
            objK = super.k();
        }
        return objK;
    }
}
