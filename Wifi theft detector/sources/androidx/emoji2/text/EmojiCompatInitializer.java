package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements w1.b {

    public static class a extends EmojiCompat.c {
        public a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    public static class b implements EmojiCompat.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3008a;

        public class a extends EmojiCompat.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EmojiCompat.i f3009a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f3010b;

            public a(EmojiCompat.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3009a = iVar;
                this.f3010b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.EmojiCompat.i
            public void a(Throwable th) {
                try {
                    this.f3009a.a(th);
                } finally {
                    this.f3010b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.EmojiCompat.i
            public void b(m mVar) {
                try {
                    this.f3009a.b(mVar);
                } finally {
                    this.f3010b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.f3008a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.h
        public void a(final EmojiCompat.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3020a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        public void c(EmojiCompat.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = d.a(this.f3008a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                n0.r.a("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.i()) {
                    EmojiCompat.c().l();
                }
            } finally {
                n0.r.b();
            }
        }
    }

    @Override // w1.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        EmojiCompat.h(new a(context));
        b(context);
        return Boolean.TRUE;
    }

    public void b(Context context) {
        final Lifecycle lifecycle = ((androidx.lifecycle.n) w1.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.d
            public /* synthetic */ void a(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.a(this, nVar);
            }

            @Override // androidx.lifecycle.d
            public void b(androidx.lifecycle.n nVar) {
                EmojiCompatInitializer.this.c();
                lifecycle.d(this);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void c(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.c(this, nVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void d(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.e(this, nVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void e(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.b(this, nVar);
            }

            @Override // androidx.lifecycle.d
            public /* synthetic */ void f(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.d(this, nVar);
            }
        });
    }

    public void c() {
        androidx.emoji2.text.c.c().postDelayed(new c(), 500L);
    }

    @Override // w1.b
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
