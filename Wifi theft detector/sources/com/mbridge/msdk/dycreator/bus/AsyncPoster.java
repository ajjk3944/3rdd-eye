package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f14474a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f14475b;

    public AsyncPoster(EventBus eventBus) {
        this.f14475b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f14474a.a(PendingPost.a(subscription, obj));
        EventBus.f14479n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f14474a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f14475b.a(pendingPostA);
    }
}
