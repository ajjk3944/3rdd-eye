package w4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.google.android.gms.internal.play_billing.m1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f36445a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.f f36446b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.i f36447c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f36448d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f36449e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f36450f;
    public ThreadPoolExecutor g;

    /* renamed from: h, reason: collision with root package name */
    public m1 f36451h;

    public n(Context context, b4.f fVar) {
        pk.a.e(context, "Context cannot be null");
        this.f36445a = context.getApplicationContext();
        this.f36446b = fVar;
        this.f36447c = o.f36452d;
    }

    public final void a() {
        synchronized (this.f36448d) {
            try {
                this.f36451h = null;
                Handler handler = this.f36449e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f36449e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f36450f = null;
                this.g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w4.h
    public final void b(m1 m1Var) {
        synchronized (this.f36448d) {
            this.f36451h = m1Var;
        }
        c();
    }

    public final void c() {
        synchronized (this.f36448d) {
            try {
                if (this.f36451h == null) {
                    return;
                }
                if (this.f36450f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f36450f = threadPoolExecutor;
                }
                this.f36450f.execute(new ig.l(20, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final b4.k d() {
        try {
            j6.i iVar = this.f36447c;
            Context context = this.f36445a;
            b4.f fVar = this.f36446b;
            iVar.getClass();
            Object[] objArr = {fVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            t7.m mVarA = b4.e.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i4 = mVarA.f34473b;
            if (i4 != 0) {
                throw new RuntimeException(r5.c.h(i4, "fetchFonts failed (", ")"));
            }
            b4.k[] kVarArr = (b4.k[]) ((List) mVarA.f34474c).get(0);
            if (kVarArr == null || kVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kVarArr[0];
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("provider not found", e2);
        }
    }
}
