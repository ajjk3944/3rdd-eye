package sl;

import com.applovin.shadow.okhttp3.internal.Util;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f33835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33836c;

    public /* synthetic */ g(boolean z3, int i4, String str) {
        this.f33834a = i4;
        this.f33835b = str;
        this.f33836c = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f33834a) {
            case 0:
                Thread thread = new Thread(runnable, this.f33835b);
                thread.setDaemon(this.f33836c);
                return thread;
            default:
                return Util.threadFactory$lambda$1(this.f33835b, this.f33836c, runnable);
        }
    }
}
