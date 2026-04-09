package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class PendingPost {

    /* renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f14503d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    Object f14504a;

    /* renamed from: b, reason: collision with root package name */
    Subscription f14505b;

    /* renamed from: c, reason: collision with root package name */
    PendingPost f14506c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f14504a = obj;
        this.f14505b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f14503d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f14504a = obj;
                pendingPostRemove.f14505b = subscription;
                pendingPostRemove.f14506c = null;
                return pendingPostRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f14504a = null;
        pendingPost.f14505b = null;
        pendingPost.f14506c = null;
        List<PendingPost> list = f14503d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
