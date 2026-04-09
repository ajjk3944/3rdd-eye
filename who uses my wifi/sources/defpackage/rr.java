package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rr {
    public static final Object j = new Object();
    public static volatile rr k;
    public final ReentrantReadWriteLock a;
    public final u8 b;
    public volatile int c;
    public final Handler d;
    public final mr e;
    public final qr f;
    public final fr g;
    public final int h;
    public final cn i;

    public rr(mv mvVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        qr qrVar = (qr) mvVar.b;
        this.f = qrVar;
        int i = mvVar.a;
        this.h = i;
        this.i = (cn) mvVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new u8(0);
        this.g = new fr(19);
        mr mrVar = new mr(this);
        this.e = mrVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                qrVar.a(new lr(mrVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static rr a() {
        rr rrVar;
        synchronized (j) {
            try {
                rrVar = k;
                if (!(rrVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return rrVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            mr mrVar = this.e;
            rr rrVar = mrVar.a;
            try {
                rrVar.f.a(new lr(mrVar));
            } catch (Throwable th) {
                rrVar.d(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new cd(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f8, TRY_ENTER, TryCatch #1 {all -> 0x00f8, blocks: (B:59:0x00c1, B:62:0x00c9, B:65:0x00d1, B:44:0x0085), top: B:96:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(pr prVar) {
        pu1.i(prVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new cd(Arrays.asList(prVar), this.c, (Throwable) null));
            } else {
                this.b.add(prVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
