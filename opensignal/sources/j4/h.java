package j4;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class h {
    public static final Object j = new Object();
    public static volatile h k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f13208a;

    /* renamed from: b, reason: collision with root package name */
    public final u.f f13209b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13210c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f13211d;

    /* renamed from: e, reason: collision with root package name */
    public final df.b f13212e;

    /* renamed from: f, reason: collision with root package name */
    public final g f13213f;

    /* renamed from: g, reason: collision with root package name */
    public final ee.f f13214g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13215h;

    /* renamed from: i, reason: collision with root package name */
    public final c f13216i;

    public h(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13208a = reentrantReadWriteLock;
        this.f13210c = 3;
        g gVar = (g) qVar.f10099b;
        this.f13213f = gVar;
        int i10 = qVar.f10098a;
        this.f13215h = i10;
        this.f13216i = (c) qVar.f10100c;
        this.f13211d = new Handler(Looper.getMainLooper());
        this.f13209b = new u.f(0);
        this.f13214g = new ee.f(11);
        df.b bVar = new df.b(this);
        this.f13212e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f13210c = 0;
            } catch (Throwable th2) {
                this.f13208a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new d(bVar));
            } catch (Throwable th3) {
                e(th3);
            }
        }
    }

    public static h a() {
        h hVar;
        synchronized (j) {
            try {
                hVar = k;
                if (!(hVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return hVar;
    }

    public static boolean c() {
        return k != null;
    }

    public final int b() {
        this.f13208a.readLock().lock();
        try {
            return this.f13210c;
        } finally {
            this.f13208a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f13215h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f13208a.writeLock().lock();
        try {
            if (this.f13210c == 0) {
                return;
            }
            this.f13210c = 0;
            this.f13208a.writeLock().unlock();
            df.b bVar = this.f13212e;
            h hVar = (h) bVar.f7337a;
            try {
                hVar.f13213f.a(new d(bVar));
            } catch (Throwable th2) {
                hVar.e(th2);
            }
        } finally {
            this.f13208a.writeLock().unlock();
        }
    }

    public final void e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f13208a.writeLock().lock();
        try {
            this.f13210c = 2;
            arrayList.addAll(this.f13209b);
            this.f13209b.clear();
            this.f13208a.writeLock().unlock();
            this.f13211d.post(new bc.m(arrayList, this.f13210c, th2));
        } catch (Throwable th3) {
            this.f13208a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x00fe, TRY_ENTER, TryCatch #2 {all -> 0x00fe, blocks: (B:62:0x00ca, B:65:0x00d2, B:47:0x008e), top: B:96:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(int r12, int r13, int r14, java.lang.CharSequence r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.h.f(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(f fVar) {
        se.b.m(fVar, "initCallback cannot be null");
        this.f13208a.writeLock().lock();
        try {
            if (this.f13210c == 1 || this.f13210c == 2) {
                this.f13211d.post(new bc.m(Arrays.asList(fVar), this.f13210c, (Throwable) null));
            } else {
                this.f13209b.add(fVar);
            }
            this.f13208a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f13208a.writeLock().unlock();
            throw th2;
        }
    }
}
