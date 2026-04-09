package f0;

import android.os.Handler;
import android.os.Looper;
import b4.C0344i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u.C2937f;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f19987j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f19988k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f19989a;

    /* renamed from: b, reason: collision with root package name */
    public final C2937f f19990b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f19991c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f19992d;

    /* renamed from: e, reason: collision with root package name */
    public final C2321f f19993e;

    /* renamed from: f, reason: collision with root package name */
    public final i f19994f;

    /* renamed from: g, reason: collision with root package name */
    public final C0344i f19995g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19996h;
    public final C2319d i;

    public j(r rVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f19989a = reentrantReadWriteLock;
        this.f19991c = 3;
        i iVar = rVar.f20013a;
        this.f19994f = iVar;
        int i = rVar.f20014b;
        this.f19996h = i;
        this.i = rVar.f20015c;
        this.f19992d = new Handler(Looper.getMainLooper());
        this.f19990b = new C2937f(0);
        this.f19995g = new C0344i(11);
        C2321f c2321f = new C2321f(this);
        this.f19993e = c2321f;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f19991c = 0;
            } catch (Throwable th) {
                this.f19989a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.b(new C2320e(c2321f));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        synchronized (f19987j) {
            try {
                jVar = f19988k;
                if (!(jVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f19989a.readLock().lock();
        try {
            return this.f19991c;
        } finally {
            this.f19989a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f19996h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f19989a.writeLock().lock();
        try {
            if (this.f19991c == 0) {
                return;
            }
            this.f19991c = 0;
            this.f19989a.writeLock().unlock();
            C2321f c2321f = this.f19993e;
            j jVar = c2321f.f19984a;
            try {
                jVar.f19994f.b(new C2320e(c2321f));
            } catch (Throwable th) {
                jVar.d(th);
            }
        } finally {
            this.f19989a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f19989a.writeLock().lock();
        try {
            this.f19991c = 2;
            arrayList.addAll(this.f19990b);
            this.f19990b.clear();
            this.f19989a.writeLock().unlock();
            this.f19992d.post(new A3.h(arrayList, this.f19991c, th));
        } catch (Throwable th2) {
            this.f19989a.writeLock().unlock();
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
        throw new UnsupportedOperationException("Method not decompiled: f0.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(h hVar) {
        a4.t.e(hVar, "initCallback cannot be null");
        this.f19989a.writeLock().lock();
        try {
            if (this.f19991c == 1 || this.f19991c == 2) {
                this.f19992d.post(new A3.h(Arrays.asList(hVar), this.f19991c, (Throwable) null));
            } else {
                this.f19990b.add(hVar);
            }
            this.f19989a.writeLock().unlock();
        } catch (Throwable th) {
            this.f19989a.writeLock().unlock();
            throw th;
        }
    }
}
