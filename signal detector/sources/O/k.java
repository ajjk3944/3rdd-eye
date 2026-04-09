package O;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class k implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3058a;

    public /* synthetic */ k(int i) {
        this.f3058a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3058a) {
            case 0:
                return new j(runnable);
            case 1:
                return new Thread(runnable, "SplitCompatBackgroundThread");
            default:
                return new Thread(new C0.k(29, runnable), "glide-active-resources");
        }
    }
}
