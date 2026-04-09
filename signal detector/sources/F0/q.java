package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import b4.C0344i;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20004a;

    /* renamed from: b, reason: collision with root package name */
    public final O.e f20005b;

    /* renamed from: c, reason: collision with root package name */
    public final C0344i f20006c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20007d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f20008e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f20009f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f20010g;

    /* renamed from: h, reason: collision with root package name */
    public T2.g f20011h;

    public q(Context context, O.e eVar) {
        a4.t.e(context, "Context cannot be null");
        this.f20004a = context.getApplicationContext();
        this.f20005b = eVar;
        this.f20006c = r.f20012d;
    }

    public final void a() {
        synchronized (this.f20007d) {
            try {
                this.f20011h = null;
                Handler handler = this.f20008e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f20008e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f20010g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f20009f = null;
                this.f20010g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f0.i
    public final void b(T2.g gVar) {
        synchronized (this.f20007d) {
            this.f20011h = gVar;
        }
        c();
    }

    public final void c() {
        synchronized (this.f20007d) {
            try {
                if (this.f20011h == null) {
                    return;
                }
                if (this.f20009f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2316a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f20010g = threadPoolExecutor;
                    this.f20009f = threadPoolExecutor;
                }
                this.f20009f.execute(new A3.z(13, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final O.i d() {
        try {
            C0344i c0344i = this.f20006c;
            Context context = this.f20004a;
            O.e eVar = this.f20005b;
            c0344i.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            L2.w wVarA = O.d.a(context, Collections.unmodifiableList(arrayList));
            int i = wVarA.f2569b;
            if (i != 0) {
                throw new RuntimeException(A.f.h(i, "fetchFonts failed (", ")"));
            }
            O.i[] iVarArr = (O.i[]) ((List) wVarA.f2570c).get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
