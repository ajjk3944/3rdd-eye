package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.f;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4007e;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import u2.InterfaceC8128a;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC8128a {

    class a implements InterfaceC4007e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k f30970a;

        a(AbstractC4013k abstractC4013k) {
            this.f30970a = abstractC4013k;
        }

        @Override // androidx.lifecycle.InterfaceC4007e
        public void g(InterfaceC4017o interfaceC4017o) {
            EmojiCompatInitializer.this.e();
            this.f30970a.c(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f30972a;

        class a extends f.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f.i f30973a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f30974b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f30973a = iVar;
                this.f30974b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th2) {
                try {
                    this.f30973a.a(th2);
                } finally {
                    this.f30974b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f30973a.b(nVar);
                } finally {
                    this.f30974b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f30972a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31014a.d(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = androidx.emoji2.text.d.a(this.f30972a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                A1.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.k()) {
                    f.c().n();
                }
            } finally {
                A1.o.b();
            }
        }
    }

    @Override // u2.InterfaceC8128a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // u2.InterfaceC8128a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        AbstractC4013k abstractC4013kO = ((InterfaceC4017o) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).O();
        abstractC4013kO.a(new a(abstractC4013kO));
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new d(), 500L);
    }
}
