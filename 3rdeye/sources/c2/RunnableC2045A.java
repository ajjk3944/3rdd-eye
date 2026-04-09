package c2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import b2.C1842w;
import d2.AbstractC4266a;
import d2.C4268c;
import java.util.UUID;

/* compiled from: WorkForegroundRunnable.java */
/* renamed from: c2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2045A implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18376h = androidx.work.m.g("WorkForegroundRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final C4268c<Void> f18377b = new C4268c<>();

    /* renamed from: c, reason: collision with root package name */
    public final Context f18378c;

    /* renamed from: d, reason: collision with root package name */
    public final C1842w f18379d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.l f18380e;

    /* renamed from: f, reason: collision with root package name */
    public final C2047C f18381f;

    /* renamed from: g, reason: collision with root package name */
    public final e2.c f18382g;

    /* compiled from: WorkForegroundRunnable.java */
    /* renamed from: c2.A$a */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4268c f18383b;

        public a(C4268c c4268c) {
            this.f18383b = c4268c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (RunnableC2045A.this.f18377b.f37349b instanceof AbstractC4266a.b) {
                return;
            }
            try {
                androidx.work.h hVar = (androidx.work.h) this.f18383b.get();
                if (hVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + RunnableC2045A.this.f18379d.f17140c + ") but did not provide ForegroundInfo");
                }
                androidx.work.m.e().a(RunnableC2045A.f18376h, "Updating notification for " + RunnableC2045A.this.f18379d.f17140c);
                RunnableC2045A runnableC2045A = RunnableC2045A.this;
                C4268c<Void> c4268c = runnableC2045A.f18377b;
                C2047C c2047c = runnableC2045A.f18381f;
                Context context = runnableC2045A.f18378c;
                UUID id = runnableC2045A.f18380e.getId();
                c2047c.getClass();
                C4268c c4268c2 = new C4268c();
                c2047c.f18390a.d(new RunnableC2046B(c2047c, c4268c2, id, hVar, context));
                c4268c.k(c4268c2);
            } catch (Throwable th) {
                RunnableC2045A.this.f18377b.j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC2045A(Context context, C1842w c1842w, androidx.work.l lVar, C2047C c2047c, e2.c cVar) {
        this.f18378c = context;
        this.f18379d = c1842w;
        this.f18380e = lVar;
        this.f18381f = c2047c;
        this.f18382g = cVar;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f18379d.f17153q || Build.VERSION.SDK_INT >= 31) {
            this.f18377b.i(null);
            return;
        }
        C4268c c4268c = new C4268c();
        e2.c cVar = this.f18382g;
        cVar.f37703d.execute(new C.E(8, this, c4268c));
        c4268c.addListener(new a(c4268c), cVar.f37703d);
    }
}
