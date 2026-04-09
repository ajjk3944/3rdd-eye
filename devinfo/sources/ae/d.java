package ae;

import java.util.concurrent.Executor;
import t8.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f356b = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    public /* synthetic */ d(int i4) {
        this.f357a = i4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f357a) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                m.f().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
