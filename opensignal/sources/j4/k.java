package j4;

import a5.c0;
import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13220a;

    public k(Context context, int i10) {
        switch (i10) {
            case 1:
                cc.s.h(context);
                Context applicationContext = context.getApplicationContext();
                cc.s.h(applicationContext);
                this.f13220a = applicationContext;
                break;
            default:
                this.f13220a = context.getApplicationContext();
                break;
        }
    }

    @Override // j4.g
    public void a(kc.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ch.a(this, fVar, threadPoolExecutor, 10));
    }
}
