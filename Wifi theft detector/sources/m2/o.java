package m2;

import android.content.Context;
import androidx.core.os.BuildCompat;
import androidx.work.ListenableWorker;

/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f23404g = androidx.work.k.f("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final n2.a f23405a = n2.a.s();

    /* renamed from: b, reason: collision with root package name */
    public final Context f23406b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.p f23407c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f23408d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.f f23409e;

    /* renamed from: f, reason: collision with root package name */
    public final o2.a f23410f;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2.a f23411a;

        public a(n2.a aVar) {
            this.f23411a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23411a.q(o.this.f23408d.getForegroundInfoAsync());
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2.a f23413a;

        public b(n2.a aVar) {
            this.f23413a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.e eVar = (androidx.work.e) this.f23413a.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o.this.f23407c.f23094c));
                }
                androidx.work.k.c().a(o.f23404g, String.format("Updating notification for %s", o.this.f23407c.f23094c), new Throwable[0]);
                o.this.f23408d.setRunInForeground(true);
                o oVar = o.this;
                oVar.f23405a.q(oVar.f23409e.a(oVar.f23406b, oVar.f23408d.getId(), eVar));
            } catch (Throwable th) {
                o.this.f23405a.p(th);
            }
        }
    }

    public o(Context context, l2.p pVar, ListenableWorker listenableWorker, androidx.work.f fVar, o2.a aVar) {
        this.f23406b = context;
        this.f23407c = pVar;
        this.f23408d = listenableWorker;
        this.f23409e = fVar;
        this.f23410f = aVar;
    }

    public com.google.common.util.concurrent.a a() {
        return this.f23405a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f23407c.f23108q || BuildCompat.b()) {
            this.f23405a.o(null);
            return;
        }
        n2.a aVarS = n2.a.s();
        this.f23410f.a().execute(new a(aVarS));
        aVarS.addListener(new b(aVarS), this.f23410f.a());
    }
}
