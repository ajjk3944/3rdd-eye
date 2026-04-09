package io.appmetrica.analytics.networktasks.internal;

import b9.C1992A;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f42413b;

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCore f42414a;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f42413b;
            if (networkServiceLocator != null) {
                return networkServiceLocator;
            }
            l.l("instance");
            throw null;
        }

        public final void init() {
            if (NetworkServiceLocator.f42413b == null) {
                synchronized (NetworkServiceLocator.class) {
                    try {
                        if (NetworkServiceLocator.f42413b == null) {
                            NetworkServiceLocator.f42413b = new NetworkServiceLocator();
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private Companion() {
        }

        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f42413b = networkServiceLocator;
        }
    }

    public NetworkServiceLocator() {
        NetworkCore networkCore = new NetworkCore();
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.f42414a = networkCore;
    }

    public static final NetworkServiceLocator getInstance() {
        return Companion.getInstance();
    }

    public static final void init() {
        Companion.init();
    }

    public final NetworkCore getNetworkCore() {
        return this.f42414a;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.f42414a.stopTasks();
    }

    public static final void init(NetworkServiceLocator networkServiceLocator) {
        Companion.init(networkServiceLocator);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }
}
