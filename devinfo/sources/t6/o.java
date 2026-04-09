package t6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f34387b;

    public /* synthetic */ o(AtomicBoolean atomicBoolean, int i4) {
        this.f34386a = i4;
        this.f34387b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34386a) {
            case 0:
                this.f34387b.set(true);
                break;
            default:
                this.f34387b.set(true);
                break;
        }
    }
}
