package t6;

import androidx.work.Worker;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Worker f34378b;

    public /* synthetic */ k0(Worker worker, int i4) {
        this.f34377a = i4;
        this.f34378b = worker;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f34377a) {
            case 0:
                return this.f34378b.doWork();
            default:
                return this.f34378b.getForegroundInfo();
        }
    }
}
