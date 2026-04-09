package b4;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1701a;

    public /* synthetic */ m(int i4) {
        this.f1701a = i4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1701a) {
            case 0:
                return new l(runnable);
            default:
                return new Thread(new ea.o(2, runnable), "glide-active-resources");
        }
    }
}
