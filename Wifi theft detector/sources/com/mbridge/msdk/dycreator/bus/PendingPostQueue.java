package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f14507a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f14508b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f14508b;
            if (pendingPost2 != null) {
                pendingPost2.f14506c = pendingPost;
                this.f14508b = pendingPost;
            } else {
                if (this.f14507a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f14508b = pendingPost;
                this.f14507a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f14507a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f14506c;
            this.f14507a = pendingPost2;
            if (pendingPost2 == null) {
                this.f14508b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f14507a == null) {
                wait(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
