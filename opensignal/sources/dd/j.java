package dd;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class j implements e, d, b, c {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f7297a;

    @Override // dd.e
    public void h(Object obj) {
        this.f7297a.countDown();
    }

    @Override // dd.b
    public void q() {
        this.f7297a.countDown();
    }

    @Override // dd.c
    public void s(r rVar) {
        this.f7297a.countDown();
    }

    @Override // dd.d
    public void y(Exception exc) {
        this.f7297a.countDown();
    }

    public /* synthetic */ j() {
        this.f7297a = new CountDownLatch(1);
    }
}
