package B1;

import B1.i;
import B1.k;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final k.c f1039a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f1040b;

    /* renamed from: B1.a$a, reason: collision with other inner class name */
    class RunnableC0042a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.c f1041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f1042b;

        RunnableC0042a(k.c cVar, Typeface typeface) {
            this.f1041a = cVar;
            this.f1042b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1041a.b(this.f1042b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.c f1044a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1045b;

        b(k.c cVar, int i10) {
            this.f1044a = cVar;
            this.f1045b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1044a.a(this.f1045b);
        }
    }

    a(k.c cVar, Executor executor) {
        this.f1039a = cVar;
        this.f1040b = executor;
    }

    private void a(int i10) {
        this.f1040b.execute(new b(this.f1039a, i10));
    }

    private void c(Typeface typeface) {
        this.f1040b.execute(new RunnableC0042a(this.f1039a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f1073a);
        } else {
            a(eVar.f1074b);
        }
    }
}
