package w4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {
    public static final Object j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile i f36431k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f36432a;

    /* renamed from: b, reason: collision with root package name */
    public final x.f f36433b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f36434c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f36435d;

    /* renamed from: e, reason: collision with root package name */
    public final fe.b f36436e;

    /* renamed from: f, reason: collision with root package name */
    public final h f36437f;
    public final i7.b g;

    /* renamed from: h, reason: collision with root package name */
    public final int f36438h;

    /* renamed from: i, reason: collision with root package name */
    public final d f36439i;

    public i(o oVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f36432a = reentrantReadWriteLock;
        this.f36434c = 3;
        h hVar = (h) oVar.f34288b;
        this.f36437f = hVar;
        int i4 = oVar.f34287a;
        this.f36438h = i4;
        this.f36439i = (d) oVar.f34289c;
        this.f36435d = new Handler(Looper.getMainLooper());
        this.f36433b = new x.f(0);
        this.g = new i7.b();
        fe.b bVar = new fe.b(this);
        this.f36436e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.f36434c = 0;
            } catch (Throwable th2) {
                this.f36432a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                hVar.b(new e(bVar));
            } catch (Throwable th3) {
                e(th3);
            }
        }
    }

    public static i a() {
        i iVar;
        synchronized (j) {
            try {
                iVar = f36431k;
                if (!(iVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return iVar;
    }

    public static boolean c() {
        return f36431k != null;
    }

    public final int b() {
        this.f36432a.readLock().lock();
        try {
            return this.f36434c;
        } finally {
            this.f36432a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f36438h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f36432a.writeLock().lock();
        try {
            if (this.f36434c == 0) {
                return;
            }
            this.f36434c = 0;
            this.f36432a.writeLock().unlock();
            fe.b bVar = this.f36436e;
            i iVar = (i) bVar.f24016b;
            try {
                iVar.f36437f.b(new e(bVar));
            } catch (Throwable th2) {
                iVar.e(th2);
            }
        } finally {
            this.f36432a.writeLock().unlock();
        }
    }

    public final void e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f36432a.writeLock().lock();
        try {
            this.f36434c = 2;
            arrayList.addAll(this.f36433b);
            this.f36433b.clear();
            this.f36432a.writeLock().unlock();
            this.f36435d.post(new b4.a(arrayList, this.f36434c, th2));
        } catch (Throwable th3) {
            this.f36432a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:96:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x0100, TRY_ENTER, TryCatch #0 {all -> 0x0100, blocks: (B:62:0x00ca, B:65:0x00d2, B:47:0x008e), top: B:92:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.i.f(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(g gVar) {
        pk.a.e(gVar, "initCallback cannot be null");
        this.f36432a.writeLock().lock();
        try {
            if (this.f36434c == 1 || this.f36434c == 2) {
                this.f36435d.post(new b4.a(Arrays.asList(gVar), this.f36434c, (Throwable) null));
            } else {
                this.f36433b.add(gVar);
            }
            this.f36432a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f36432a.writeLock().unlock();
            throw th2;
        }
    }
}
