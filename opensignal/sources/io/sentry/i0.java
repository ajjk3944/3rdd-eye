package io.sentry;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12323a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12323a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return null;
            case 2:
                return new ArrayList();
            default:
                return io.sentry.android.core.internal.util.f.f11649c.a();
        }
    }
}
