package androidx.emoji2.text;

import A2.l;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import b1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m0.C5309b;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f15713j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile c f15714k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f15715a;

    /* renamed from: b, reason: collision with root package name */
    public final C5309b f15716b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f15717c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f15718d;

    /* renamed from: e, reason: collision with root package name */
    public final a f15719e;

    /* renamed from: f, reason: collision with root package name */
    public final g f15720f;

    /* renamed from: g, reason: collision with root package name */
    public final d f15721g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15722h;
    public final b1.c i;

    /* compiled from: EmojiCompat.java */
    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile b1.f f15723b;

        /* renamed from: c, reason: collision with root package name */
        public volatile i f15724c;
    }

    /* compiled from: EmojiCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f15725a;

        public b(c cVar) {
            this.f15725a = cVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0237c {

        /* renamed from: a, reason: collision with root package name */
        public final g f15726a;

        /* renamed from: b, reason: collision with root package name */
        public int f15727b = 0;

        /* renamed from: c, reason: collision with root package name */
        public final b1.c f15728c = new b1.c();

        public AbstractC0237c(g gVar) {
            this.f15726a = gVar;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static class d {
    }

    /* compiled from: EmojiCompat.java */
    public static class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f15729b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15730c;

        public f(List list, int i, Throwable th) {
            l.p(list, "initCallbacks cannot be null");
            this.f15729b = new ArrayList(list);
            this.f15730c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f15729b;
            int size = arrayList.size();
            int i = 0;
            if (this.f15730c != 1) {
                while (i < size) {
                    ((e) arrayList.get(i)).a();
                    i++;
                }
            } else {
                while (i < size) {
                    ((e) arrayList.get(i)).b();
                    i++;
                }
            }
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface g {
        void a(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(i iVar);
    }

    public c(EmojiCompatInitializer.b bVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f15715a = reentrantReadWriteLock;
        this.f15717c = 3;
        g gVar = bVar.f15726a;
        this.f15720f = gVar;
        int i = bVar.f15727b;
        this.f15722h = i;
        this.i = bVar.f15728c;
        this.f15718d = new Handler(Looper.getMainLooper());
        this.f15716b = new C5309b(0);
        this.f15721g = new d();
        a aVar = new a(this);
        this.f15719e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f15717c = 0;
            } catch (Throwable th) {
                this.f15715a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.b(aVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static c a() {
        c cVar;
        synchronized (f15713j) {
            cVar = f15714k;
            l.q("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", cVar != null);
        }
        return cVar;
    }

    public final int b() {
        this.f15715a.readLock().lock();
        try {
            return this.f15717c;
        } finally {
            this.f15715a.readLock().unlock();
        }
    }

    public final void c() {
        l.q("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f15722h == 1);
        if (b() == 1) {
            return;
        }
        this.f15715a.writeLock().lock();
        try {
            if (this.f15717c == 0) {
                return;
            }
            this.f15717c = 0;
            this.f15715a.writeLock().unlock();
            a aVar = this.f15719e;
            c cVar = aVar.f15725a;
            try {
                cVar.f15720f.a(new androidx.emoji2.text.b(aVar));
            } catch (Throwable th) {
                cVar.d(th);
            }
        } finally {
            this.f15715a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f15715a.writeLock().lock();
        try {
            this.f15717c = 2;
            arrayList.addAll(this.f15716b);
            this.f15716b.clear();
            this.f15715a.writeLock().unlock();
            this.f15718d.post(new f(arrayList, this.f15717c, th));
        } catch (Throwable th2) {
            this.f15715a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #1 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:89:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #1 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:89:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c4 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #2 {all -> 0x00f7, blocks: (B:59:0x00c4, B:62:0x00cc, B:44:0x0088), top: B:91:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(e eVar) {
        l.p(eVar, "initCallback cannot be null");
        this.f15715a.writeLock().lock();
        try {
            if (this.f15717c == 1 || this.f15717c == 2) {
                this.f15718d.post(new f(Arrays.asList(eVar), this.f15717c, null));
            } else {
                this.f15716b.add(eVar);
            }
            this.f15715a.writeLock().unlock();
        } catch (Throwable th) {
            this.f15715a.writeLock().unlock();
            throw th;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }
}
