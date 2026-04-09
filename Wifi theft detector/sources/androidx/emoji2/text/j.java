package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.FontsContractCompat;
import androidx.emoji2.text.EmojiCompat;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class j extends EmojiCompat.c {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3044k = new a();

    public static class a {
        public Typeface a(Context context, FontsContractCompat.b bVar) {
            return FontsContractCompat.a(context, null, new FontsContractCompat.b[]{bVar});
        }

        public FontsContractCompat.a b(Context context, o0.g gVar) {
            return FontsContractCompat.b(context, null, gVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements EmojiCompat.h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3045a;

        /* renamed from: b, reason: collision with root package name */
        public final o0.g f3046b;

        /* renamed from: c, reason: collision with root package name */
        public final a f3047c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f3048d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f3049e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f3050f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f3051g;

        /* renamed from: h, reason: collision with root package name */
        public EmojiCompat.i f3052h;

        /* renamed from: i, reason: collision with root package name */
        public ContentObserver f3053i;

        /* renamed from: j, reason: collision with root package name */
        public Runnable f3054j;

        public b(Context context, o0.g gVar, a aVar) {
            r0.i.h(context, "Context cannot be null");
            r0.i.h(gVar, "FontRequest cannot be null");
            this.f3045a = context.getApplicationContext();
            this.f3046b = gVar;
            this.f3047c = aVar;
        }

        @Override // androidx.emoji2.text.EmojiCompat.h
        public void a(EmojiCompat.i iVar) {
            r0.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f3048d) {
                this.f3052h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f3048d) {
                try {
                    this.f3052h = null;
                    ContentObserver contentObserver = this.f3053i;
                    if (contentObserver != null) {
                        this.f3047c.c(this.f3045a, contentObserver);
                        this.f3053i = null;
                    }
                    Handler handler = this.f3049e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f3054j);
                    }
                    this.f3049e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f3051g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f3050f = null;
                    this.f3051g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.f3048d) {
                try {
                    if (this.f3052h == null) {
                        return;
                    }
                    try {
                        FontsContractCompat.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f3048d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            n0.r.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f3047c.a(this.f3045a, bVarE);
                            ByteBuffer byteBufferF = j0.l.f(this.f3045a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            n0.r.b();
                            synchronized (this.f3048d) {
                                try {
                                    EmojiCompat.i iVar = this.f3052h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            n0.r.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f3048d) {
                            try {
                                EmojiCompat.i iVar2 = this.f3052h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
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

        public void d() {
            synchronized (this.f3048d) {
                try {
                    if (this.f3052h == null) {
                        return;
                    }
                    if (this.f3050f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f3051g = threadPoolExecutorB;
                        this.f3050f = threadPoolExecutorB;
                    }
                    this.f3050f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f3055a.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final FontsContractCompat.b e() {
            try {
                FontsContractCompat.a aVarB = this.f3047c.b(this.f3045a, this.f3046b);
                if (aVarB.c() == 0) {
                    FontsContractCompat.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3048d) {
                this.f3050f = executor;
            }
        }
    }

    public j(Context context, o0.g gVar) {
        super(new b(context, gVar, f3044k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
