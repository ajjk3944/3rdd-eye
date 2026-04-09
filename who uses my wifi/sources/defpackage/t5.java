package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t5 implements Executor {
    public static final /* synthetic */ t5 g = new t5(2);
    public final /* synthetic */ int f;

    public /* synthetic */ t5(int i) {
        this.f = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f) {
            case 0:
                new Thread(runnable).start();
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final /* synthetic */ void a(Runnable runnable) {
    }
}
