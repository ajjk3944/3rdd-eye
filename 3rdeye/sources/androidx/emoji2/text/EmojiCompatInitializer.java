package androidx.emoji2.text;

import G0.s;
import J4.h;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.c;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import androidx.lifecycle.ProcessLifecycleInitializer;
import b1.C1813b;
import b1.ThreadFactoryC1812a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements I1.b<Boolean> {

    public static class b extends c.AbstractC0237c {
    }

    public static class c implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f15711a;

        public c(Context context) {
            this.f15711a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(c.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1812a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new h(this, hVar, threadPoolExecutor, 4));
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = s.f1858a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.f15714k != null) {
                    androidx.emoji2.text.c.a().c();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i10 = s.f1858a;
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void a(Context context) {
        Object objB;
        I1.a aVarC = I1.a.c(context);
        aVarC.getClass();
        synchronized (I1.a.f2409e) {
            try {
                objB = aVarC.f2410a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1781n lifecycle = ((InterfaceC1790x) objB).getLifecycle();
        lifecycle.addObserver(new a(lifecycle));
    }

    @Override // I1.b
    public final Boolean create(Context context) {
        b bVar = new b(new c(context));
        bVar.f15727b = 1;
        if (androidx.emoji2.text.c.f15714k == null) {
            synchronized (androidx.emoji2.text.c.f15713j) {
                try {
                    if (androidx.emoji2.text.c.f15714k == null) {
                        androidx.emoji2.text.c.f15714k = new androidx.emoji2.text.c(bVar);
                    }
                } finally {
                }
            }
        }
        a(context);
        return Boolean.TRUE;
    }

    @Override // I1.b
    public final List<Class<? extends I1.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public class a implements InterfaceC1771d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1781n f15709b;

        public a(AbstractC1781n abstractC1781n) {
            this.f15709b = abstractC1781n;
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onResume(InterfaceC1790x interfaceC1790x) {
            EmojiCompatInitializer.this.getClass();
            (Build.VERSION.SDK_INT >= 28 ? C1813b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d(), 500L);
            this.f15709b.removeObserver(this);
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onCreate(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onPause(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
        }

        @Override // androidx.lifecycle.InterfaceC1771d
        public final void onStop(InterfaceC1790x interfaceC1790x) {
        }
    }
}
