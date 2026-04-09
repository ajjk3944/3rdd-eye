package androidx.emoji2.text;

import A2.l;
import H0.f;
import H0.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import androidx.emoji2.text.c;
import b1.ThreadFactoryC1812a;
import g0.C4356c;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class e extends c.AbstractC0237c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f15733d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class b implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f15734a;

        /* renamed from: b, reason: collision with root package name */
        public final f f15735b;

        /* renamed from: c, reason: collision with root package name */
        public final a f15736c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f15737d;

        /* renamed from: e, reason: collision with root package name */
        public Handler f15738e;

        /* renamed from: f, reason: collision with root package name */
        public ThreadPoolExecutor f15739f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f15740g;

        /* renamed from: h, reason: collision with root package name */
        public c.h f15741h;

        public b(Context context, f fVar) {
            a aVar = e.f15733d;
            this.f15737d = new Object();
            l.p(context, "Context cannot be null");
            this.f15734a = context.getApplicationContext();
            this.f15735b = fVar;
            this.f15736c = aVar;
        }

        @Override // androidx.emoji2.text.c.g
        public final void a(c.h hVar) {
            synchronized (this.f15737d) {
                this.f15741h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f15737d) {
                try {
                    this.f15741h = null;
                    Handler handler = this.f15738e;
                    if (handler != null) {
                        handler.removeCallbacks(null);
                    }
                    this.f15738e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f15740g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f15739f = null;
                    this.f15740g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            synchronized (this.f15737d) {
                try {
                    if (this.f15741h == null) {
                        return;
                    }
                    if (this.f15739f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1812a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f15740g = threadPoolExecutor;
                        this.f15739f = threadPoolExecutor;
                    }
                    this.f15739f.execute(new B.b(this, 13));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final m d() throws Resources.NotFoundException {
            try {
                a aVar = this.f15736c;
                Context context = this.f15734a;
                f fVar = this.f15735b;
                aVar.getClass();
                H0.l lVarA = H0.e.a(context, fVar);
                int i = lVarA.f2004a;
                if (i != 0) {
                    throw new RuntimeException(C4356c.i(i, "fetchFonts failed (", ")"));
                }
                m[] mVarArr = lVarA.f2005b;
                if (mVarArr == null || mVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return mVarArr[0];
            } catch (PackageManager.NameNotFoundException e4) {
                throw new RuntimeException("provider not found", e4);
            }
        }
    }
}
