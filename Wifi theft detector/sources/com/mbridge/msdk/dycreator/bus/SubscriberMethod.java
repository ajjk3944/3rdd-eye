package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f14509a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f14510b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f14511c;

    /* renamed from: d, reason: collision with root package name */
    String f14512d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f14509a = method;
        this.f14510b = threadMode;
        this.f14511c = cls;
    }

    private synchronized void a() {
        if (this.f14512d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f14509a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f14509a.getName());
            sb.append('(');
            sb.append(this.f14511c.getName());
            this.f14512d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f14512d.equals(((SubscriberMethod) obj).f14512d);
    }

    public int hashCode() {
        return this.f14509a.hashCode();
    }
}
