package androidx.emoji2.text;

import B1.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k, reason: collision with root package name */
    private static final a f31041k = new a();

    public static class a {
        public Typeface a(Context context, k.b bVar) {
            return B1.k.a(context, null, new k.b[]{bVar});
        }

        public k.a b(Context context, B1.e eVar) {
            return B1.k.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements f.h {

        /* renamed from: a, reason: collision with root package name */
        private final Context f31042a;

        /* renamed from: b, reason: collision with root package name */
        private final B1.e f31043b;

        /* renamed from: c, reason: collision with root package name */
        private final a f31044c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f31045d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f31046e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f31047f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f31048g;

        /* renamed from: h, reason: collision with root package name */
        f.i f31049h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f31050i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f31051j;

        b(Context context, B1.e eVar, a aVar) {
            E1.h.h(context, "Context cannot be null");
            E1.h.h(eVar, "FontRequest cannot be null");
            this.f31042a = context.getApplicationContext();
            this.f31043b = eVar;
            this.f31044c = aVar;
        }

        private void b() {
            synchronized (this.f31045d) {
                try {
                    this.f31049h = null;
                    ContentObserver contentObserver = this.f31050i;
                    if (contentObserver != null) {
                        this.f31044c.c(this.f31042a, contentObserver);
                        this.f31050i = null;
                    }
                    Handler handler = this.f31046e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f31051j);
                    }
                    this.f31046e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f31048g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f31047f = null;
                    this.f31048g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private k.b e() {
            try {
                k.a aVarB = this.f31044c.b(this.f31042a, this.f31043b);
                if (aVarB.e() == 0) {
                    k.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            E1.h.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f31045d) {
                this.f31049h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f31045d) {
                try {
                    if (this.f31049h == null) {
                        return;
                    }
                    try {
                        k.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f31045d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            A1.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f31044c.a(this.f31042a, bVarE);
                            ByteBuffer byteBufferE = w1.r.e(this.f31042a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferE);
                            A1.o.b();
                            synchronized (this.f31045d) {
                                try {
                                    f.i iVar = this.f31049h;
                                    if (iVar != null) {
                                        iVar.b(nVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            A1.o.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f31045d) {
                            try {
                                f.i iVar2 = this.f31049h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f31045d) {
                try {
                    if (this.f31049h == null) {
                        return;
                    }
                    if (this.f31047f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f31048g = threadPoolExecutorB;
                        this.f31047f = threadPoolExecutorB;
                    }
                    this.f31047f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f31052a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f31045d) {
                this.f31047f = executor;
            }
        }
    }

    public k(Context context, B1.e eVar) {
        super(new b(context, eVar, f31041k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
