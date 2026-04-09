package a5;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f102b;

    public /* synthetic */ c0(String str, int i10) {
        this.f101a = i10;
        this.f102b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f101a) {
            case 0:
                return new Thread(runnable, this.f102b);
            case 1:
                Thread thread = new Thread(runnable, this.f102b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f102b);
        }
    }
}
