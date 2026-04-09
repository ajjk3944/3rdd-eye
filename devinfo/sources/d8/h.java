package d8;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.play_billing.m1;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements w, j, w4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22019a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22020b;

    public /* synthetic */ h(Context context, int i4, boolean z3) {
        this.f22019a = i4;
        this.f22020b = context;
    }

    @Override // d8.j
    public Class a() {
        return InputStream.class;
    }

    @Override // w4.h
    public void b(m1 m1Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new w4.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new oi.f(this, m1Var, threadPoolExecutor, 11));
    }

    @Override // d8.j
    public Object c(int i4, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i4);
    }

    @Override // d8.j
    public void d(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        switch (this.f22019a) {
            case 0:
                return new b(this.f22020b, this);
            case 1:
                return new b(this.f22020b, b0Var.b(Integer.class, InputStream.class));
            default:
                return new r(this.f22020b, 2);
        }
    }

    public h(Context context, int i4) {
        this.f22019a = i4;
        switch (i4) {
            case 5:
                this.f22020b = context.getApplicationContext();
                break;
            default:
                pb.y.h(context);
                Context applicationContext = context.getApplicationContext();
                pb.y.h(applicationContext);
                this.f22020b = applicationContext;
                break;
        }
    }
}
