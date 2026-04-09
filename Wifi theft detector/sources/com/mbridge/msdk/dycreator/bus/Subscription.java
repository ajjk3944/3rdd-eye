package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f14515a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f14516b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f14515a = obj;
        this.f14516b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Subscription) {
            Subscription subscription = (Subscription) obj;
            if (this.f14515a == subscription.f14515a && this.f14516b.equals(subscription.f14516b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f14515a.hashCode() + this.f14516b.f14512d.hashCode();
    }
}
