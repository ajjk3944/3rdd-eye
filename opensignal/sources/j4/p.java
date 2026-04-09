package j4;

import a5.c0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13229a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.d f13230b;

    /* renamed from: c, reason: collision with root package name */
    public final et.d f13231c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13232d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f13233e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f13234f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f13235g;

    /* renamed from: h, reason: collision with root package name */
    public kc.f f13236h;

    public p(Context context, q3.d dVar) {
        se.b.m(context, "Context cannot be null");
        this.f13229a = context.getApplicationContext();
        this.f13230b = dVar;
        this.f13231c = q.f13237d;
    }

    @Override // j4.g
    public final void a(kc.f fVar) {
        synchronized (this.f13232d) {
            this.f13236h = fVar;
        }
        synchronized (this.f13232d) {
            try {
                if (this.f13236h == null) {
                    return;
                }
                if (this.f13234f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new c0("emojiCompat", 1));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f13235g = threadPoolExecutor;
                    this.f13234f = threadPoolExecutor;
                }
                this.f13234f.execute(new o(0, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f13232d) {
            try {
                this.f13236h = null;
                Handler handler = this.f13233e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f13233e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f13235g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f13234f = null;
                this.f13235g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q3.i c() {
        try {
            et.d dVar = this.f13231c;
            Context context = this.f13229a;
            q3.d dVar2 = this.f13230b;
            dVar.getClass();
            Object[] objArr = {dVar2};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            ma.f fVarA = q3.c.a(context, Collections.unmodifiableList(arrayList));
            int i10 = fVarA.f16449b;
            if (i10 != 0) {
                throw new RuntimeException(h0.b.m("fetchFonts failed (", i10, ")"));
            }
            q3.i[] iVarArr = (q3.i[]) fVarA.f16450c.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("provider not found", e4);
        }
    }
}
