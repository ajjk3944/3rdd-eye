package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* loaded from: classes3.dex */
public final class H6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4907qn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C4907qn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
