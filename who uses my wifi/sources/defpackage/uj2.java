package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class uj2 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dk2 dk2Var = (dk2) obj;
                Thread thread = new Thread(runnable, ex0.f("Google consent worker #", dk2Var.f.getAndIncrement()));
                dk2Var.h = new WeakReference(thread);
                return thread;
            default:
                String str = v23.a;
                return new Thread(runnable, (String) obj);
        }
    }
}
